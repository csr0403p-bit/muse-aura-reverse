package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ConfidentialVmSwitchDestination $destination;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$2$1(boolean z, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, ConfidentialVmSwitchDestination confidentialVmSwitchDestination) {
        super(1);
        this.$isLoading = z;
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$destination = confidentialVmSwitchDestination;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$isLoading) {
            this.$viewModel.onIntroDestinationShown(this.$destination);
        }
        return new C78g() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
