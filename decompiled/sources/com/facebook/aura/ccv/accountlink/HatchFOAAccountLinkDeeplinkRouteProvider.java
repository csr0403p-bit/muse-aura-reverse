package com.facebook.aura.ccv.accountlink;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProviderKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.HatchFOAAccountLinkScreenKey;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchFOAAccountLinkDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final HatchFOAAccountLinkDeeplinkRouteProvider INSTANCE = new HatchFOAAccountLinkDeeplinkRouteProvider();

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.ALL_FAMILY;
        return Collections.singletonList(new AuraDeeplinkRouteSpec("foa_ac_link", null, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, anonymousClass1));
    }

    /* renamed from: com.facebook.aura.ccv.accountlink.HatchFOAAccountLinkDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            String str = (String) AbstractC0878AGe.A0A(1, AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri));
            if (str == null || C7BY.A0j(str)) {
                return null;
            }
            HatchInteractionLogger.INSTANCE.logDeepLink(HatchSurface.SETTINGS, null, HatchScreen.SETTINGS_CONNECTED_APPS, null);
            return new AuraDeeplinkRoute(new HatchFOAAccountLinkScreenKey(str), LaunchFlag.NAVIGATE, null);
        }
    }
}
