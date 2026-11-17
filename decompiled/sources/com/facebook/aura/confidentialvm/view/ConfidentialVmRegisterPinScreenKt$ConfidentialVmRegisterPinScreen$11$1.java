package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isConfirmStep;
    public final /* synthetic */ boolean $isCvmEnrollment;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$11$1(ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, boolean z, boolean z2, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = confidentialVmRegisterPinViewModel;
        this.$isConfirmStep = z;
        this.$isCvmEnrollment = z2;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onBackClick();
        if (this.$isConfirmStep) {
            this.$viewModel.onBackToChoose();
        } else {
            if (this.$isCvmEnrollment) {
                return;
            }
            this.$navigator.back();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
