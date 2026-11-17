package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.onboarding.OnboardingGateViewModel;

/* loaded from: classes2.dex */
public final class OnboardingGateScreenKt$OnboardingGateScreen$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ OnboardingGateViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$viewModel.onScreenResumed();
        return new InterfaceC06807bD() { // from class: com.facebook.aura.onboarding.view.OnboardingGateScreenKt$OnboardingGateScreen$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingGateScreenKt$OnboardingGateScreen$1$1(OnboardingGateViewModel onboardingGateViewModel) {
        super(1);
        this.$viewModel = onboardingGateViewModel;
    }
}
