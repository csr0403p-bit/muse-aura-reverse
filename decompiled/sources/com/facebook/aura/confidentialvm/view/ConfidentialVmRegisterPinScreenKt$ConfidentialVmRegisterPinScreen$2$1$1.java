package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isConfirmStep;
    public final /* synthetic */ C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> $uiState$delegate;
    public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$2$1$1(boolean z, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> c1bo) {
        super(0);
        this.$isConfirmStep = z;
        this.$viewModel = confidentialVmRegisterPinViewModel;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$uiState$delegate.getValue().isSubmitting || !this.$isConfirmStep) {
            return;
        }
        this.$viewModel.onBackToChoose();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
