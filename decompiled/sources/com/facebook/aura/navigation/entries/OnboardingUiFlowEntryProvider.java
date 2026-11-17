package com.facebook.aura.navigation.entries;

import X.AnonymousClass006;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraPageSceneStrategyKt;
import com.facebook.aura.navigation.key.OnboardingUiFlowScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final OnboardingUiFlowEntryProvider INSTANCE = new OnboardingUiFlowEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA11 = AnonymousClass006.A11(AuraPageSceneStrategyKt.PAGE_REVEAL_DELAY_MILLIS, 900, C3cG.A0o(c5rn));
        G0W<OnboardingUiFlowScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$OnboardingUiFlowEntryProviderKt.f162lambda$924719875;
        c5rn.A00(new G0U<OnboardingUiFlowScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.OnboardingUiFlowEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(OnboardingUiFlowScreenKey onboardingUiFlowScreenKey) {
                return onboardingUiFlowScreenKey.toString();
            }
        }, new G0U<OnboardingUiFlowScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.OnboardingUiFlowEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(OnboardingUiFlowScreenKey onboardingUiFlowScreenKey) {
                return mapA11;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(OnboardingUiFlowScreenKey onboardingUiFlowScreenKey) {
                return mapA11;
            }
        }, g0w, C3cG.A0x(OnboardingUiFlowScreenKey.class));
    }
}
