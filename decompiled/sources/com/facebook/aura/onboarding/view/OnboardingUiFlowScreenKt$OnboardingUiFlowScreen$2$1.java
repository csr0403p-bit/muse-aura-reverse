package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.onboarding.OnboardingUiFlowUiState;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<OnboardingUiFlowUiState> $uiState$delegate;
    public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$2$1(OnboardingUiFlowViewModel onboardingUiFlowViewModel, C1BO<OnboardingUiFlowUiState> c1bo) {
        super(0);
        this.$viewModel = onboardingUiFlowViewModel;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$uiState$delegate.getValue().isSubmitting || this.$uiState$delegate.getValue().isCompleted) {
            return;
        }
        this.$viewModel.onBack();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
