package com.facebook.aura.email;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import com.facebook.aura.utils.HatchUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class EmailDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final EmailDeeplinkRouteProvider INSTANCE = new EmailDeeplinkRouteProvider();

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        return Collections.singletonList(new AuraDeeplinkRouteSpec("verified_email", "/verified_email", null, AuraDeeplinkAccessScope.ALL_FAMILY, AuraDeeplinkAccessScope.NOT_APPLICABLE, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, AnonymousClass1.INSTANCE));
    }

    /* renamed from: com.facebook.aura.email.EmailDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(uri, abstractC3358CGz);
            if ("hatch".equals(uri.getScheme()) && HatchUtils.INSTANCE.isEmailEnabled(abstractC3358CGz)) {
                return new AuraDeeplinkRoute(new HatchStatusScreenKey(null, null, "email", "verified_email"), LaunchFlag.NAVIGATE, null);
            }
            return null;
        }
    }
}
