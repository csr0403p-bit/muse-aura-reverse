package com.facebook.aura.deeplink;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.navigation.EmailSetupDeeplink;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$17 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$17 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$17();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$17() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return Boolean.valueOf(EmailSetupDeeplink.INSTANCE.matches(uri));
    }
}
