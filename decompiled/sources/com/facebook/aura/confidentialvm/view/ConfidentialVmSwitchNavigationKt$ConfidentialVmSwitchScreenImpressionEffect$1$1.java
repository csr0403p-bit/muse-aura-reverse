package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchScreenImpressionEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchScreenImpressionEffect$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, HatchScreen hatchScreen) {
        super(1);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$screen = hatchScreen;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onScreenShown(this.$screen);
        return new C78g() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchScreenImpressionEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
