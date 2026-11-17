package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C06797bC;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06817bE;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel;

/* loaded from: classes3.dex */
public final class ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$1$1 extends AbstractC7559F3s implements G0U<C06797bC, InterfaceC06817bE> {
    public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06817bE invoke(final C06797bC c06797bC) {
        C7384Etj.A0Y(c06797bC, 0);
        final ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel = this.$viewModel;
        return new InterfaceC06817bE() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$1$1$invoke$$inlined$onStopOrDispose$1
            @Override // X.InterfaceC06817bE
            public void runStopOrDisposeEffect() {
                confidentialVmSubscriptionEndedViewModel.cancelContinue();
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$1$1(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel) {
        super(1);
        this.$viewModel = confidentialVmSubscriptionEndedViewModel;
    }
}
