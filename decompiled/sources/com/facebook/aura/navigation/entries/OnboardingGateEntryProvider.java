package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.OnboardingGateScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingGateEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final OnboardingGateEntryProvider INSTANCE = new OnboardingGateEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.setupLoadingTransitionMetadata;
        G0W<OnboardingGateScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$OnboardingGateEntryProviderKt.f161lambda$1994129416;
        c5rn.A00(new G0U<OnboardingGateScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.OnboardingGateEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(OnboardingGateScreenKey onboardingGateScreenKey) {
                return onboardingGateScreenKey.toString();
            }
        }, new G0U<OnboardingGateScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.OnboardingGateEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(OnboardingGateScreenKey onboardingGateScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(OnboardingGateScreenKey onboardingGateScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(OnboardingGateScreenKey.class));
    }
}
