package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.CFK;
import X.G0U;
import com.facebook.aura.onboarding.OnboardingGateUiState;

/* loaded from: classes2.dex */
public final class OnboardingGateScreenKt$OnboardingGateScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<OnboardingGateUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingGateScreenKt$OnboardingGateScreen$2$1(C1BO<OnboardingGateUiState> c1bo) {
        super(1);
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        CFK.A02(Boolean.valueOf(this.$uiState$delegate.getValue().isError), this.$uiState$delegate.getValue().loadingPhase, OnboardingGateScreenKt.TAG, "Rendering state: isError=%s loadingPhase=%s");
        return new C78g() { // from class: com.facebook.aura.onboarding.view.OnboardingGateScreenKt$OnboardingGateScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
