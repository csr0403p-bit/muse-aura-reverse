package com.facebook.aura.partners.wearables.linking;

import X.C31u;
import X.C7354EnR;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.conversation.api.links.ConversationLinkHandler;
import com.facebook.aura.conversation.api.links.ConversationLinkOutcome;
import com.facebook.aura.conversation.api.links.ConversationLinkTap;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.partners.wearables.linking.MC;
import com.facebook.aura.partners.wearables.onboarding.WearablesOnboardingDeeplinkRouter;
import com.facebook.aura.partners.wearables.onboarding.WearablesOnboardingDeeplinkTarget;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;

/* loaded from: classes3.dex */
public final class WearablesConversationLinkHandler implements ConversationLinkHandler {
    public static final int $stable = 0;
    public static final String HATCH_SCHEME = "hatch";
    public static final String LEARN_MORE_WEARABLES_HOST = "learn-more-wearables";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(WearablesConversationLinkHandler.class, "isLinkingEnabled", "isLinkingEnabled()Z", 0), new C7354EnR(WearablesConversationLinkHandler.class, "learnMoreUrl", "getLearnMoreUrl()Ljava/lang/String;", 0)};
    public static final WearablesConversationLinkHandler INSTANCE = new WearablesConversationLinkHandler();
    public static final C31u isLinkingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_wearables_v2.linking_enabled);
    public static final C31u learnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.android_lobster_wearables_v2.linking_learn_more_url);

    @Override // com.facebook.aura.conversation.api.links.ConversationLinkHandler
    public ConversationLinkOutcome handle(ConversationLinkTap conversationLinkTap) {
        ConversationLinkOutcome routed;
        String host;
        boolean zEquals;
        HatchHtmlErrorCode hatchHtmlErrorCode;
        String str;
        HatchHtmlRoute hatchHtmlRoute;
        C7384Etj.A0Y(conversationLinkTap, 0);
        Uri uri = Uri.parse(conversationLinkTap.url);
        if ("hatch".equals(uri.getScheme()) && ((zEquals = WearablesOnboardingDeeplinkRouter.ENABLE_WEARABLES_HOST.equals((host = uri.getHost()))) || LEARN_MORE_WEARABLES_HOST.equals(host))) {
            if (isLinkingEnabled()) {
                if (zEquals) {
                    WearablesOnboardingDeeplinkTarget wearablesOnboardingDeeplinkTargetRouteForUri = WearablesOnboardingDeeplinkRouter.INSTANCE.routeForUri(uri, false);
                    conversationLinkTap.navigator.navigate(wearablesOnboardingDeeplinkTargetRouteForUri.key, wearablesOnboardingDeeplinkTargetRouteForUri.launchFlag);
                    hatchHtmlRoute = HatchHtmlRoute.DEEPLINK_SELF;
                } else if (AuraBrowserLauncherKt.openBrowser(getLearnMoreUrl(), conversationLinkTap.context)) {
                    hatchHtmlRoute = HatchHtmlRoute.IN_APP_BROWSER;
                } else {
                    hatchHtmlErrorCode = HatchHtmlErrorCode.FEATURE_NOT_CONFIGURED;
                    str = "learn_more_url_unusable";
                }
                routed = new ConversationLinkOutcome.Routed(hatchHtmlRoute);
            } else {
                hatchHtmlErrorCode = HatchHtmlErrorCode.FEATURE_KILLSWITCH_OFF;
                str = null;
            }
            routed = new ConversationLinkOutcome.Failed(hatchHtmlErrorCode, str);
        } else {
            routed = ConversationLinkOutcome.NotHandled.INSTANCE;
        }
        return routed;
    }

    private final String getLearnMoreUrl() {
        return (String) learnMoreUrl$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final boolean isLinkingEnabled() {
        return C31u.A01(this, isLinkingEnabled$delegate, $$delegatedProperties, 0);
    }
}
