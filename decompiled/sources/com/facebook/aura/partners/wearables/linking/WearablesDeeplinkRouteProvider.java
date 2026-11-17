package com.facebook.aura.partners.wearables.linking;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C31u;
import X.G0V;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkActivation;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.partners.wearables.linking.MC;
import com.facebook.aura.partners.wearables.onboarding.WearablesOnboardingDeeplinkRouter;
import com.facebook.aura.partners.wearables.onboarding.WearablesOnboardingDeeplinkTarget;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class WearablesDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(WearablesDeeplinkRouteProvider.class, "isLinkingEnabled", "isLinkingEnabled()Z");
    public static final WearablesDeeplinkRouteProvider INSTANCE = new WearablesDeeplinkRouteProvider();
    public static final C31u isLinkingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_wearables_v2.linking_enabled);

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(uri, abstractC3358CGz);
            if (!WearablesDeeplinkRouteProvider.INSTANCE.isLinkingEnabled()) {
                return null;
            }
            WearablesOnboardingDeeplinkTarget wearablesOnboardingDeeplinkTargetRouteForUri = WearablesOnboardingDeeplinkRouter.INSTANCE.routeForUri(uri, AuraDeeplinkActivation.INSTANCE.isMidOnboarding(abstractC3358CGz));
            return new AuraDeeplinkRoute(wearablesOnboardingDeeplinkTargetRouteForUri.key, wearablesOnboardingDeeplinkTargetRouteForUri.launchFlag, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLinkingEnabled() {
        return C31u.A01(this, isLinkingEnabled$delegate, $$delegatedProperties, 0);
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.ALL_FAMILY;
        return Collections.singletonList(new AuraDeeplinkRouteSpec(WearablesOnboardingDeeplinkRouter.ENABLE_WEARABLES_HOST, "/enable-wearables", null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, anonymousClass1));
    }
}
