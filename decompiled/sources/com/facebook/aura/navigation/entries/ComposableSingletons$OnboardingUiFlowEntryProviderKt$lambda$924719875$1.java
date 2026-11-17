package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C3cG;
import X.C5wL;
import X.G0W;
import com.facebook.aura.navigation.key.OnboardingUiFlowScreenKey;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$OnboardingUiFlowEntryProviderKt$lambda$-924719875$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OnboardingUiFlowEntryProviderKt$lambda$924719875$1 extends AbstractC7559F3s implements G0W<OnboardingUiFlowScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$OnboardingUiFlowEntryProviderKt$lambda$924719875$1 INSTANCE = new ComposableSingletons$OnboardingUiFlowEntryProviderKt$lambda$924719875$1();

    public ComposableSingletons$OnboardingUiFlowEntryProviderKt$lambda$924719875$1() {
        super(3);
    }

    public final void invoke(OnboardingUiFlowScreenKey onboardingUiFlowScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        OnboardingUiFlowViewModel.Factory factory = new OnboardingUiFlowViewModel.Factory(AnonymousClass002.A0h(bfm));
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        OnboardingUiFlowScreenKt.OnboardingUiFlowScreen((OnboardingUiFlowViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(OnboardingUiFlowViewModel.class)), null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(OnboardingUiFlowScreenKey onboardingUiFlowScreenKey, BFM bfm, Integer num) {
        invoke(onboardingUiFlowScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
