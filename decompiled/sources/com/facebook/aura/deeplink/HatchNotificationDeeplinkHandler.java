package com.facebook.aura.deeplink;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.C7LE;
import X.C9sU;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.network.api.MetaImageCdnHostsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchNotificationDeeplinkHandler {
    public static final int $stable = 0;
    public static final String APPROVAL_ID_PARAM = "approval_id";
    public static final String CARD_TOKEN_PARAM = "card_token";
    public static final String EXTRA_INAPP_NOTIF_ID = "hatch_inapp_notif_id";
    public static final String EXTRA_NDID = "hatch_notif_ndid";
    public static final String EXTRA_NOTIF_CHANNEL = "hatch_notif_channel";
    public static final String EXTRA_NOTIF_ORIGIN = "hatch_notif_origin";
    public static final String EXTRA_NOTIF_TARGET_USER_ID = "hatch_notif_target_user_id";
    public static final String EXTRA_NOTIF_TYPE = "hatch_notif_type";
    public static final String IMAGE_URL_PARAM = "image_url";
    public static final HatchNotificationDeeplinkHandler INSTANCE = new HatchNotificationDeeplinkHandler();
    public static final String MAIN_THREAD_SENTINEL = "main";
    public static final String NEW_THREAD_SENTINEL = "new";
    public static final String PROMPT_ID_PARAM = "prompt_id";
    public static final String PROMPT_PARAM = "prompt";
    public static final int STRUCTURED_PROMPT_MAX_ATTACHMENTS = 5;
    public static final int STRUCTURED_PROMPT_MAX_LENGTH = 512;
    public static final String STRUCTURED_PROMPT_PARAM = "structured_prompt";

    public final class StructuredPrompt extends C06G {
        public static final int $stable = 8;
        public final List<String> attachmentUrls;
        public final String prompt;

        public StructuredPrompt(String str, List<String> list) {
            C7384Etj.A0Y(list, 1);
            this.prompt = str;
            this.attachmentUrls = list;
        }

        public final StructuredPrompt copy(String str, List<String> list) {
            C7384Etj.A0Y(list, 1);
            return new StructuredPrompt(str, list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StructuredPrompt) {
                    StructuredPrompt structuredPrompt = (StructuredPrompt) obj;
                    if (!C7384Etj.areEqual(this.prompt, structuredPrompt.prompt) || !C7384Etj.areEqual(this.attachmentUrls, structuredPrompt.attachmentUrls)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ StructuredPrompt copy$default(StructuredPrompt structuredPrompt, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = structuredPrompt.prompt;
            }
            if ((i & 2) != 0) {
                list = structuredPrompt.attachmentUrls;
            }
            C7384Etj.A0Y(list, 1);
            return new StructuredPrompt(str, list);
        }

        public final String component1() {
            return this.prompt;
        }

        public final List<String> component2() {
            return this.attachmentUrls;
        }

        public final List<String> getAttachmentUrls() {
            return this.attachmentUrls;
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.attachmentUrls, AnonymousClass006.A0G(this.prompt) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    private final String parseAttachmentUrl(String str) {
        String scheme;
        String host;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                Uri uriA01 = null;
                try {
                    uriA01 = C7Je.A01(str);
                } catch (SecurityException | UnsupportedOperationException unused) {
                }
                if (uriA01 == null || (scheme = uriA01.getScheme()) == null || !scheme.equalsIgnoreCase("https") || (host = uriA01.getHost()) == null || host.length() == 0) {
                    break;
                }
                return str;
            }
            char cCharAt = str.charAt(i);
            if (C7LE.A00(cCharAt) || Character.isISOControl(cCharAt)) {
                break;
            }
            i++;
        }
        return null;
    }

    private final String parseCdnImageUrl(String str) {
        String scheme;
        C7384Etj.A0Y(str, 0);
        int iA0B = C7BY.A0B(str, "https:///", 0, false);
        if (iA0B >= 0) {
            str = C7BY.A0c(str, "https://", iA0B, "https:///".length() + iA0B).toString();
        }
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null || (scheme = uriA01.getScheme()) == null || !scheme.equalsIgnoreCase("https") || !MetaImageCdnHostsKt.isMetaImageCdnHost(uriA01.getHost())) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001b A[PHI: r3 r5 r7
  0x001b: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v0 java.lang.String) binds: [B:43:0x0081, B:14:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x001b: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v2 java.lang.String) binds: [B:43:0x0081, B:14:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x001b: PHI (r7v2 boolean) = (r7v0 boolean), (r7v3 boolean) binds: [B:43:0x0081, B:14:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[PHI: r2 r6
  0x000c: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String), (r2v6 java.lang.String) binds: [B:51:0x00a0, B:6:0x0006, B:8:0x000a] A[DONT_GENERATE, DONT_INLINE]
  0x000c: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String), (r6v3 java.lang.String) binds: [B:51:0x00a0, B:6:0x0006, B:8:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void stageComposerContent(android.net.Uri r10, com.facebook.aura.deeplink.HatchNotificationDeeplinkHandler.StructuredPrompt r11, X.AbstractC3358CGz r12) {
        /*
            r9 = this;
            r3 = 0
            if (r11 == 0) goto L86
            java.lang.String r2 = r11.prompt
        L5:
            r6 = r3
            if (r11 == 0) goto Lc
            java.util.List<java.lang.String> r4 = r11.attachmentUrls
            if (r4 != 0) goto Le
        Lc:
            X.AGi r4 = X.C0881AGi.A00
        Le:
            java.lang.String r1 = r10.getScheme()
            java.lang.String r0 = "hatch"
            r8 = 1
            if (r1 != 0) goto L73
            r7 = 0
        L18:
            r5 = r3
        L19:
            if (r7 == 0) goto L37
        L1b:
            java.lang.String r0 = "card_token"
            java.lang.String r1 = r10.getQueryParameter(r0)
            if (r1 == 0) goto L37
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L37
            if (r5 == 0) goto L2d
            if (r3 == 0) goto L36
        L2d:
            com.facebook.aura.deeplink.HatchCardTokenPrompts$Companion r0 = com.facebook.aura.deeplink.HatchCardTokenPrompts.Companion
            com.facebook.aura.deeplink.HatchCardTokenPrompts r0 = r0.getInstance(r12)
            r0.stage(r1, r2, r3)
        L36:
            return
        L37:
            if (r2 == 0) goto L5f
            com.facebook.aura.conversation.common.HatchPendingMessage r1 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
            com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r0 = com.facebook.aura.analytics.hatch.HatchComposerEntryPoint.DEEP_LINK
            r1.setPendingComposerText(r2, r0)
        L40:
            com.facebook.aura.conversation.common.HatchPendingMessage r1 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
            com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r0 = com.facebook.aura.analytics.hatch.HatchComposerEntryPoint.DEEP_LINK
            r1.setPendingLinkAttachmentUrls(r4, r0)
        L47:
            if (r7 == 0) goto L5c
            if (r8 == 0) goto L36
            com.facebook.aura.conversation.common.HatchPendingMessage r2 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
            java.util.List r1 = X.AbstractC0885AGm.A0z(r3)
            com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r0 = com.facebook.aura.analytics.hatch.HatchComposerEntryPoint.DEEP_LINK
            r2.setPendingLinkImageUris(r1, r0)
        L56:
            com.facebook.aura.conversation.common.HatchPendingMessage r0 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
            r0.notifyShareDataReady()
            return
        L5c:
            if (r8 == 0) goto L36
            goto L56
        L5f:
            if (r6 == 0) goto L69
            com.facebook.aura.conversation.common.HatchPendingMessage r1 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
            com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r0 = com.facebook.aura.analytics.hatch.HatchComposerEntryPoint.DEEP_LINK
            r1.setPendingComposerPromptId(r6, r0)
            goto L40
        L69:
            if (r3 != 0) goto L40
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L40
            r8 = 0
            goto L47
        L73:
            boolean r7 = r1.equalsIgnoreCase(r0)
            if (r7 == 0) goto L18
            java.lang.String r0 = "image_url"
            java.lang.String r5 = r10.getQueryParameter(r0)
            if (r5 == 0) goto L19
            java.lang.String r3 = r9.parseCdnImageUrl(r5)
            goto L1b
        L86:
            java.lang.String r0 = "prompt"
            java.lang.String r2 = r10.getQueryParameter(r0)
            if (r2 == 0) goto La4
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto La4
        L94:
            java.lang.String r0 = "prompt_id"
            java.lang.String r6 = r10.getQueryParameter(r0)
            if (r6 == 0) goto L5
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto L5
            goto Lc
        La4:
            r2 = r3
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.HatchNotificationDeeplinkHandler.stageComposerContent(android.net.Uri, com.facebook.aura.deeplink.HatchNotificationDeeplinkHandler$StructuredPrompt, X.CGz):void");
    }

    public final String approvalIdFromChatDeeplink(Uri uri) {
        String strA0l;
        C7384Etj.A0Y(uri, 0);
        String queryParameter = uri.getQueryParameter("approval_id");
        if (queryParameter == null || (strA0l = AnonymousClass002.A0l(queryParameter)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public final ConversationScreenKey handleThreadDeeplink(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        List<String> pathSegments = uri.getPathSegments();
        C7384Etj.A0X(pathSegments);
        String str = (String) AbstractC0878AGe.A0A(0, pathSegments);
        if (str == null || str.length() <= 0) {
            return null;
        }
        if (str.equals("new")) {
            return new ConversationScreenKey(AnonymousClass002.A0k(), null, true, null, null, false);
        }
        String str2 = (String) AbstractC0878AGe.A0A(1, pathSegments);
        if (str2 != null && str2.length() > 0) {
            HatchDeeplinkHolder.INSTANCE.setPendingMessage(str, str2);
        }
        return new ConversationScreenKey(str, null, false, null, null, false);
    }

    public final void maybeLogNotificationClick(Intent intent) {
        HatchNotificationOrigin hatchNotificationOrigin;
        HatchNotificationChannel hatchNotificationChannel;
        C7384Etj.A0Y(intent, 0);
        if (intent.hasExtra("hatch_notif_origin")) {
            String stringExtra = intent.getStringExtra("hatch_notif_ndid");
            String stringExtra2 = intent.getStringExtra("hatch_inapp_notif_id");
            String stringExtra3 = intent.getStringExtra("hatch_notif_type");
            String stringExtra4 = intent.getStringExtra("hatch_notif_origin");
            HatchNotificationOrigin[] hatchNotificationOriginArrValues = HatchNotificationOrigin.values();
            int length = hatchNotificationOriginArrValues.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hatchNotificationOrigin = HatchNotificationOrigin.SERVER;
                    break;
                }
                hatchNotificationOrigin = hatchNotificationOriginArrValues[i2];
                if (C7384Etj.areEqual(hatchNotificationOrigin.getValue(), stringExtra4)) {
                    break;
                } else {
                    i2++;
                }
            }
            String stringExtra5 = intent.getStringExtra("hatch_notif_channel");
            HatchNotificationChannel[] hatchNotificationChannelArrValues = HatchNotificationChannel.values();
            int length2 = hatchNotificationChannelArrValues.length;
            while (true) {
                if (i >= length2) {
                    hatchNotificationChannel = HatchNotificationChannel.PUSH;
                    break;
                }
                hatchNotificationChannel = hatchNotificationChannelArrValues[i];
                if (C7384Etj.areEqual(hatchNotificationChannel.getValue(), stringExtra5)) {
                    break;
                } else {
                    i++;
                }
            }
            HatchNotificationEventsLogger.INSTANCE.logClick(hatchNotificationChannel, stringExtra3, hatchNotificationOrigin, stringExtra, stringExtra2);
            intent.removeExtra("hatch_notif_origin");
            intent.removeExtra("hatch_notif_channel");
            intent.removeExtra("hatch_notif_type");
            intent.removeExtra("hatch_notif_ndid");
            intent.removeExtra("hatch_inapp_notif_id");
        }
    }

    public final StructuredPrompt structuredPromptFromChatDeeplink(Uri uri) {
        String queryParameter;
        String attachmentUrl;
        C7384Etj.A0Y(uri, 0);
        String scheme = uri.getScheme();
        if (!(scheme == null ? false : scheme.equalsIgnoreCase("hatch")) || (queryParameter = uri.getQueryParameter(STRUCTURED_PROMPT_PARAM)) == null) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = StructuredPromptJson.$stable;
            StructuredPromptJson structuredPromptJson = (StructuredPromptJson) c9sU.A00(queryParameter, StructuredPromptJson$$serializer.INSTANCE);
            String str = structuredPromptJson.prompt;
            if (str == null || C7BY.A0j(str)) {
                str = null;
            } else if (str.length() > 512) {
                return null;
            }
            List<StructuredPromptAttachmentJson> list = structuredPromptJson.attachments;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<StructuredPromptAttachmentJson> it = list.iterator();
            while (it.hasNext()) {
                String str2 = it.next().url;
                if (str2 != null && (attachmentUrl = INSTANCE.parseAttachmentUrl(str2)) != null) {
                    arrayListA0h.add(attachmentUrl);
                }
            }
            List listA0a = AbstractC0878AGe.A0a(C3cG.A0m(arrayListA0h), 5);
            if (str == null && listA0a.isEmpty()) {
                return null;
            }
            return new StructuredPrompt(str, listA0a);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final ConversationTabScreenKey handleChatDeeplink(Uri uri, StructuredPrompt structuredPrompt, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0v(uri, abstractC3358CGz);
        String queryParameter = uri.getQueryParameter("message_id");
        if (queryParameter != null || ((queryParameter = uri.getLastPathSegment()) != null && !queryParameter.equals("chat"))) {
            HatchDeeplinkHolder.INSTANCE.setPendingMessage(null, queryParameter);
        }
        stageComposerContent(uri, structuredPrompt, abstractC3358CGz);
        return ConversationTabScreenKey.INSTANCE;
    }
}
