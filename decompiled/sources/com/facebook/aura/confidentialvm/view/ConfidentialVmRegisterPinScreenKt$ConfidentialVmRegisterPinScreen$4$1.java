package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;

/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$4$1(ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel) {
        super(1);
        this.$viewModel = confidentialVmRegisterPinViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onStepShown();
        return new C78g() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
