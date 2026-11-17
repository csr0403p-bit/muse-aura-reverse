package com.facebook.aura.commands.notifications;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV3;
import X.C06G;
import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C7qW;
import X.C8hv;
import X.HxE;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class NotificationSerializer {
    public static final NotificationSerializer INSTANCE = new NotificationSerializer();
    public static final Map<String, String> CATEGORY_MAP = AGH.A0D(new HxE("msg", "msg"), new HxE("email", "email"), new HxE("social", "social"), new HxE("call", "call"), new HxE("missed_call", "missed_call"));
    public static final char[] HEX = ManagedBrowserSitePolicy.HEX.toCharArray();

    public final class ExtractedMessage extends C06G {
        public final String dedupSender;
        public final String sender;
        public final String text;
        public final long time;

        public ExtractedMessage(String str, String str2, String str3, long j) {
            C7384Etj.A0Y(str3, 2);
            this.sender = str;
            this.dedupSender = str2;
            this.text = str3;
            this.time = j;
        }

        public static /* synthetic */ ExtractedMessage copy$default(ExtractedMessage extractedMessage, String str, String str2, String str3, long j, int i, Object obj) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            long j2 = j;
            if ((i & 1) != 0) {
                str4 = extractedMessage.sender;
            }
            if ((i & 2) != 0) {
                str5 = extractedMessage.dedupSender;
            }
            if ((i & 4) != 0) {
                str6 = extractedMessage.text;
            }
            if ((i & 8) != 0) {
                j2 = extractedMessage.time;
            }
            C7384Etj.A0Y(str6, 2);
            return new ExtractedMessage(str4, str5, str6, j2);
        }

        public final ExtractedMessage copy(String str, String str2, String str3, long j) {
            C7384Etj.A0Y(str3, 2);
            return new ExtractedMessage(str, str2, str3, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExtractedMessage) {
                    ExtractedMessage extractedMessage = (ExtractedMessage) obj;
                    if (!C7384Etj.areEqual(this.sender, extractedMessage.sender) || !C7384Etj.areEqual(this.dedupSender, extractedMessage.dedupSender) || !C7384Etj.areEqual(this.text, extractedMessage.text) || this.time != extractedMessage.time) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.sender;
        }

        public final String component2() {
            return this.dedupSender;
        }

        public final String component3() {
            return this.text;
        }

        public final long component4() {
            return this.time;
        }

        public final String getDedupSender() {
            return this.dedupSender;
        }

        public final String getSender() {
            return this.sender;
        }

        public final String getText() {
            return this.text;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.time, AnonymousClass005.A0I(this.text, ((AnonymousClass006.A0G(this.sender) * 31) + AnonymousClass005.A0H(this.dedupSender)) * 31));
        }

        public String toString() {
            return super.toString();
        }
    }

    private final List<String> extractInboxStyleLines(Bundle bundle) {
        CharSequence[] charSequenceArray;
        String string;
        try {
            charSequenceArray = bundle.getCharSequenceArray(BV3.A00(50));
        } catch (Exception unused) {
            charSequenceArray = null;
        }
        if (charSequenceArray != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (CharSequence charSequence : charSequenceArray) {
                if (charSequence == null || (string = charSequence.toString()) == null || C7BY.A0j(string)) {
                    string = null;
                }
                if (string != null) {
                    arrayListA0h.add(string);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                return arrayListA0h;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:13:0x0027, B:15:0x002b, B:17:0x002f, B:20:0x0037, B:27:0x004b, B:29:0x004f, B:34:0x005b, B:24:0x0041, B:26:0x0047), top: B:44:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.commands.notifications.NotificationSerializer.ExtractedMessage> extractMessagingStyleMessages(android.app.Notification r11) {
        /*
            r10 = this;
            r5 = 0
            X.EG8 r3 = X.EG8.A01(r11)     // Catch: java.lang.Exception -> Le
            boolean r0 = r3 instanceof androidx.core.app.NotificationCompat$MessagingStyle     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto Lc
            androidx.core.app.NotificationCompat$MessagingStyle r3 = (androidx.core.app.NotificationCompat$MessagingStyle) r3     // Catch: java.lang.Exception -> Le
            goto Lf
        Lc:
            r3 = 0
            goto Lf
        Le:
            r3 = r5
        Lf:
            if (r3 == 0) goto L71
            java.util.List<X.EFz> r0 = r3.A04
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r4 = r0.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r4.next()
            X.EFz r1 = (X.EFz) r1
            X.EFx r0 = r1.A04     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L34
            java.lang.CharSequence r0 = r0.A01     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L34
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L63
            goto L35
        L34:
            r8 = r5
        L35:
            if (r8 == 0) goto L41
            int r0 = r8.length()     // Catch: java.lang.Exception -> L63
            r7 = r5
            if (r0 <= 0) goto L3f
            r7 = r8
        L3f:
            if (r7 != 0) goto L4b
        L41:
            X.EFx r0 = r3.A00     // Catch: java.lang.Exception -> L63
            java.lang.CharSequence r0 = r0.A01     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L54
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L63
        L4b:
            java.lang.CharSequence r0 = r1.A05     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L56
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> L63
            goto L57
        L54:
            r7 = r5
            goto L4b
        L56:
            r9 = r5
        L57:
            if (r9 != 0) goto L5b
            java.lang.String r9 = ""
        L5b:
            long r10 = r1.A03     // Catch: java.lang.Exception -> L63
            com.facebook.aura.commands.notifications.NotificationSerializer$ExtractedMessage r6 = new com.facebook.aura.commands.notifications.NotificationSerializer$ExtractedMessage     // Catch: java.lang.Exception -> L63
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r6 = r5
        L64:
            if (r6 == 0) goto L1b
            r2.add(r6)
            goto L1b
        L6a:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L71
            return r2
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.notifications.NotificationSerializer.extractMessagingStyleMessages(android.app.Notification):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean isSystemNoise(StatusBarNotification statusBarNotification) {
        String str;
        C7384Etj.A0Y(statusBarNotification, 0);
        if (!"android".equals(statusBarNotification.getPackageName())) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null) {
                String str2 = notification.category;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1001078227:
                            str = "progress";
                            if (!str2.equals(str)) {
                            }
                            break;
                        case -892481550:
                            if (str2.equals(AuraDeeplinkRouteMapper.STATUS_ROUTE)) {
                            }
                            break;
                        case 114381:
                            str = "sys";
                            if (!str2.equals(str)) {
                            }
                            break;
                        case 1984153269:
                            str = "service";
                            if (!str2.equals(str)) {
                            }
                            break;
                    }
                }
                int i = notification.flags;
                if ((i & 512) != 0 || (i & 98) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean matchesAppFilter(StatusBarNotification statusBarNotification, String str, Context context) {
        boolean zA1Z = AnonymousClass005.A1Z(statusBarNotification, str, context);
        if (str.length() == 0 || str.equals(UnifiedArtifactsRepositoryKt.COLLECTION_ALL)) {
            return zA1Z;
        }
        String packageName = statusBarNotification.getPackageName();
        C7384Etj.A0U(packageName);
        Locale locale = Locale.ROOT;
        if (C7BY.A0q(packageName.toLowerCase(locale), str, false)) {
            return zA1Z;
        }
        String packageName2 = statusBarNotification.getPackageName();
        C7384Etj.A0U(packageName2);
        return C7BY.A0q(getAppLabel(packageName2, context).toLowerCase(locale), str, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchesCategoryFilter(android.service.notification.StatusBarNotification r6, java.lang.String r7) {
        /*
            r5 = this;
            r5 = 0
            boolean r4 = X.AnonymousClass002.A1a(r6, r7)
            int r0 = r7.length()
            if (r0 == 0) goto L2c
            java.lang.String r0 = "all"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L2c
            android.app.Notification r0 = r6.getNotification()
            java.lang.String r1 = r0.category
            if (r1 == 0) goto L64
            java.util.Map<java.lang.String, java.lang.String> r0 = com.facebook.aura.commands.notifications.NotificationSerializer.CATEGORY_MAP
            java.lang.Object r3 = r0.get(r1)
        L21:
            int r0 = r7.hashCode()
            java.lang.String r1 = "msg"
            java.lang.String r2 = "missed_call"
            switch(r0) {
                case -897050771: goto L2d;
                case 108417: goto L52;
                case 3045982: goto L30;
                case 96619420: goto L50;
                case 954925063: goto L57;
                case 1799862658: goto L45;
                default: goto L2c;
            }
        L2c:
            return r4
        L2d:
            java.lang.String r1 = "social"
            goto L52
        L30:
            java.lang.String r1 = "call"
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L2c
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L2c
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L4f
            return r4
        L45:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L2c
            boolean r5 = r2.equals(r3)
        L4f:
            return r5
        L50:
            java.lang.String r1 = "email"
        L52:
            boolean r0 = r7.equals(r1)
            goto L5d
        L57:
            java.lang.String r0 = "message"
            boolean r0 = r7.equals(r0)
        L5d:
            if (r0 == 0) goto L2c
            boolean r5 = r1.equals(r3)
            return r5
        L64:
            r3 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.notifications.NotificationSerializer.matchesCategoryFilter(android.service.notification.StatusBarNotification, java.lang.String):boolean");
    }

    public static final void toJson$putBase(C2nw c2nw, StatusBarNotification statusBarNotification, String str, String str2, String str3, String str4) {
        C7qW.A06("key", statusBarNotification.getKey(), c2nw);
        C7qW.A06(ErrorReportingConstants.APP_NAME_KEY, str, c2nw);
        C7qW.A06("app_package", str2, c2nw);
        C7qW.A06("title", str3, c2nw);
        C7qW.A06("category", str4, c2nw);
    }

    public static final void toJson$putTimestamp(C2nw c2nw, SimpleDateFormat simpleDateFormat, long j) {
        C7qW.A06("timestamp", simpleDateFormat.format(new Date(j)), c2nw);
        NodeSyncTimestamps.INSTANCE.putLocalTimeFields(c2nw, j, "timestamp");
    }

    public final Map<String, String> getCATEGORY_MAP() {
        return CATEGORY_MAP;
    }

    public final List<JsonObject> toJson(StatusBarNotification statusBarNotification, Context context) {
        String strA0p;
        CharSequence charSequence;
        String string;
        AnonymousClass003.A0u(statusBarNotification, context);
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification.extras;
        CharSequence charSequence2 = bundle.getCharSequence("android.title");
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        String str = notification.category;
        if (str == null || (strA0p = C60O.A0p(str, CATEGORY_MAP)) == null) {
            strA0p = DeviceSmsReaderKt.ATTACHMENT_OTHER;
        }
        String packageName = statusBarNotification.getPackageName();
        C7384Etj.A0U(packageName);
        String appLabel = getAppLabel(packageName, context);
        String packageName2 = statusBarNotification.getPackageName();
        SimpleDateFormat simpleDateFormatA0k = C60R.A0k("yyyy-MM-dd'T'HH:mm:ss'Z'");
        List<ExtractedMessage> listExtractMessagingStyleMessages = extractMessagingStyleMessages(notification);
        if (listExtractMessagingStyleMessages != null && !listExtractMessagingStyleMessages.isEmpty()) {
            ArrayList arrayListA0m = AnonymousClass002.A0m(listExtractMessagingStyleMessages);
            for (ExtractedMessage extractedMessage : listExtractMessagingStyleMessages) {
                long postTime = extractedMessage.time;
                if (postTime <= 0) {
                    postTime = statusBarNotification.getPostTime();
                }
                C2nw c2nwA1K = C60O.A1K();
                toJson$putBase(c2nwA1K, statusBarNotification, appLabel, packageName2, string2, strA0p);
                C7qW.A06(MetaAiAppBroadcastSender.EXTRA_BODY, extractedMessage.text, c2nwA1K);
                String str2 = extractedMessage.sender;
                if (str2 != null && str2.length() != 0) {
                    C7qW.A06("sender", str2, c2nwA1K);
                }
                toJson$putTimestamp(c2nwA1K, simpleDateFormatA0k, postTime);
                NotificationSerializer notificationSerializer = INSTANCE;
                String key = statusBarNotification.getKey();
                C7384Etj.A0U(key);
                arrayListA0m.add(C7qW.A01("dedup_key", notificationSerializer.dedupKey(key, postTime, extractedMessage.dedupSender, extractedMessage.text), c2nwA1K));
            }
            return arrayListA0m;
        }
        List<String> listExtractInboxStyleLines = extractInboxStyleLines(bundle);
        if (listExtractInboxStyleLines != null && !listExtractInboxStyleLines.isEmpty()) {
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(listExtractInboxStyleLines);
            for (String str3 : listExtractInboxStyleLines) {
                C2nw c2nwA1K2 = C60O.A1K();
                toJson$putBase(c2nwA1K2, statusBarNotification, appLabel, packageName2, string2, strA0p);
                C7qW.A06(MetaAiAppBroadcastSender.EXTRA_BODY, str3, c2nwA1K2);
                toJson$putTimestamp(c2nwA1K2, simpleDateFormatA0k, statusBarNotification.getPostTime());
                NotificationSerializer notificationSerializer2 = INSTANCE;
                String key2 = statusBarNotification.getKey();
                C7384Etj.A0U(key2);
                arrayListA0m2.add(C7qW.A01("dedup_key", notificationSerializer2.dedupKey(key2, statusBarNotification.getPostTime(), null, str3), c2nwA1K2));
            }
            return arrayListA0m2;
        }
        CharSequence charSequence3 = bundle.getCharSequence(BV3.A00(48));
        if ((charSequence3 == null || (string = charSequence3.toString()) == null || string.length() <= 0) && ((charSequence = bundle.getCharSequence("android.text")) == null || (string = charSequence.toString()) == null)) {
            string = "";
        }
        C2nw c2nwA1K3 = C60O.A1K();
        toJson$putBase(c2nwA1K3, statusBarNotification, appLabel, packageName2, string2, strA0p);
        C7qW.A06(MetaAiAppBroadcastSender.EXTRA_BODY, string, c2nwA1K3);
        toJson$putTimestamp(c2nwA1K3, simpleDateFormatA0k, statusBarNotification.getPostTime());
        NotificationSerializer notificationSerializer3 = INSTANCE;
        String key3 = statusBarNotification.getKey();
        C7384Etj.A0U(key3);
        return Collections.singletonList(C7qW.A01("dedup_key", notificationSerializer3.dedupKey(key3, statusBarNotification.getPostTime(), null, string), c2nwA1K3));
    }

    public final String dedupKey(String str, long j, String str2, String str3) {
        AnonymousClass003.A0w(str, str3);
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("|");
        sbA0g.append(j);
        sbA0g.append("|");
        sbA0g.append(str2);
        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(C3cG.A1S(C60P.A1M("|", str3, sbA0g)));
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b : bArrDigest) {
            char[] cArr = HEX;
            sb.append(cArr[(b & 255) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public final String getAppLabel(String str, Context context) {
        AnonymousClass003.A0u(str, context);
        String strA00 = C8hv.A00.A00(str, context);
        return strA00 == null ? str : strA00;
    }

    public final boolean isSelfNotification(StatusBarNotification statusBarNotification, Context context) {
        AnonymousClass003.A0u(statusBarNotification, context);
        return context.getPackageName().equals(statusBarNotification.getPackageName());
    }
}
