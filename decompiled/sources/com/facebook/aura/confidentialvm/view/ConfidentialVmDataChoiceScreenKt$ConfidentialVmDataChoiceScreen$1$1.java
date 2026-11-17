package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceScreenKt$ConfidentialVmDataChoiceScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceScreenKt$ConfidentialVmDataChoiceScreen$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
        super(1);
        this.$viewModel = confidentialVmSwitchViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onDataChoiceShown();
        return new C78g() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceScreenKt$ConfidentialVmDataChoiceScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
