package com.facebook.aura.handoff.impl;

import X.AbstractC0885AGm;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.handoff.impl.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.network.api.MetaImageCdnHostsKt;

/* loaded from: classes3.dex */
public final class HandoffLinkHandler {
    public static final String IMAGE_URL_PARAM = "image_url";
    public static final String PROMPT_ID_PARAM = "prompt_id";
    public static final String PROMPT_PARAM = "prompt";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HandoffLinkHandler.class, "maxLength", "<v#0>", 0);
    public static final HandoffLinkHandler INSTANCE = new HandoffLinkHandler();

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

    public final AuraDeeplinkRoute resolve(Uri uri, long j) {
        String cdnImageUrl;
        C7384Etj.A0Y(uri, 0);
        if (!HandoffLinkVerifier.INSTANCE.isValid(uri, j)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("prompt");
        if (queryParameter == null || C7BY.A0j(queryParameter)) {
            queryParameter = null;
        }
        String queryParameter2 = uri.getQueryParameter("prompt_id");
        if (queryParameter2 == null || C7BY.A0j(queryParameter2)) {
            queryParameter2 = null;
        }
        if (queryParameter == null && queryParameter2 == null) {
            return null;
        }
        C31u<Object, Long> c31uAuraMobileConfigLong = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_gtm.chat_share_prompt_max_length);
        if (queryParameter != null && queryParameter.length() > resolve$lambda$2(c31uAuraMobileConfigLong)) {
            return null;
        }
        String queryParameter3 = uri.getQueryParameter("image_url");
        if (queryParameter3 != null) {
            cdnImageUrl = parseCdnImageUrl(queryParameter3);
            if (cdnImageUrl == null) {
                return null;
            }
        } else {
            cdnImageUrl = null;
        }
        if (queryParameter != null) {
            HatchPendingMessage.INSTANCE.setPendingComposerText(queryParameter, HatchComposerEntryPoint.DEEP_LINK);
        } else if (queryParameter2 != null) {
            HatchPendingMessage.INSTANCE.setPendingComposerPromptId(queryParameter2, HatchComposerEntryPoint.DEEP_LINK);
        }
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        hatchPendingMessage.setPendingLinkImageUris(AbstractC0885AGm.A0z(cdnImageUrl), HatchComposerEntryPoint.DEEP_LINK);
        hatchPendingMessage.notifyShareDataReady();
        return new AuraDeeplinkRoute(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK, null);
    }

    public static final long resolve$lambda$2(C31u<Object, Long> c31u) {
        return C3cG.A05(C31u.A00(c31u, $$delegatedProperties));
    }
}
