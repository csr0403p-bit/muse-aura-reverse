package com.facebook.aura.confidentialvm.model;

import X.F2X;
import X.G0W;
import X.HtJ;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;

/* loaded from: classes2.dex */
public final /* synthetic */ class ConfidentialVmDataTransferProgressViewModel$uiState$1 extends F2X implements G0W {
    public ConfidentialVmDataTransferProgressViewModel$uiState$1(Object obj) {
        super(3, obj, ConfidentialVmDataTransferProgressViewModel.class, "withOperationState", "withOperationState(Lcom/facebook/aura/confidentialvm/model/ConfidentialVmDataTransferUiState;Lcom/facebook/aura/confidentialvm/vmswitch/ConfidentialVmDataTransferOperation$Progress;)Lcom/facebook/aura/confidentialvm/model/ConfidentialVmDataTransferUiState;", 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ConfidentialVmDataTransferProgressViewModel) this.receiver).withOperationState((ConfidentialVmDataTransferUiState) obj, (ConfidentialVmDataTransferOperation.Progress) obj2);
    }

    public final Object invoke(ConfidentialVmDataTransferUiState confidentialVmDataTransferUiState, ConfidentialVmDataTransferOperation.Progress progress, HtJ<? super ConfidentialVmDataTransferUiState> htJ) {
        return ((ConfidentialVmDataTransferProgressViewModel) this.receiver).withOperationState(confidentialVmDataTransferUiState, progress);
    }
}
