package com.facebook.aura.navigation;

import X.C60R;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;

/* loaded from: classes3.dex */
public final class EmailSetupDeeplink {
    public static final int $stable = 0;
    public static final EmailSetupDeeplink INSTANCE = new EmailSetupDeeplink();
    public static final String URL = "hatch://email_setup";

    public final boolean isCandidate(Uri uri) {
        String host;
        C7384Etj.A0Y(uri, 0);
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("hatch") && (host = uri.getHost()) != null && host.equalsIgnoreCase(AuraDeeplinkRouteMapper.EMAIL_SETUP_ROUTE);
    }

    public final boolean matches(Uri uri) {
        return URL.equals(C60R.A0f(uri));
    }
}
