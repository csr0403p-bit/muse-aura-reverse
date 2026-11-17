package com.facebook.aura.skills.connect;

import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C7384Etj;
import X.C7Je;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;

/* loaded from: classes.dex */
public abstract class SkillOAuthLinkHandlerKt {
    public static final String HTTPS_SCHEME = "https";
    public static final String ONE_PASSWORD_APP_SWITCH_HOST = "start.1password.com";

    public static final void openSkillOAuthLink(Context context, String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        String scheme;
        String host;
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(str, str2, hatchSkillOAuthOrigin, 1);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        HatchConnectorQplLogger.INSTANCE.markDirectOAuthRedirectStarted(uriA01 != null ? uriA01.getHost() : null);
        logSkillAuthWebViewImpression(hatchSkillOAuthOrigin, str2);
        HatchInteractionLogger.INSTANCE.logClick(hatchSkillOAuthOrigin, HatchComponent.SKILL_AUTH_3P_REDIRECT, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str2));
        if (Build.VERSION.SDK_INT < 31 || uriA01 == null || (scheme = uriA01.getScheme()) == null || !scheme.equalsIgnoreCase("https") || (host = uriA01.getHost()) == null || !host.equalsIgnoreCase(ONE_PASSWORD_APP_SWITCH_HOST)) {
            AuraBrowserLauncherKt.openBrowser(str, context);
        } else {
            AuraBrowserLauncherKt.openExternalUrl(str, context);
        }
    }

    public static final void logSkillAuthWebViewImpression(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str) {
        HatchImpressionLogger.INSTANCE.logImpression(hatchSkillOAuthOrigin.getImpressionOrigin(), hatchSkillOAuthOrigin.getSurface(), HatchSubsurface.CONNECTOR_AUTH, HatchScreen.CONNECTOR_AUTH_WEB_VIEW, HatchComponent.SKILL_AUTH_WEB_VIEW, null, AnonymousClass007.A0c(HatchMetadataKey.SKILL_NAME, str), null);
    }
}
