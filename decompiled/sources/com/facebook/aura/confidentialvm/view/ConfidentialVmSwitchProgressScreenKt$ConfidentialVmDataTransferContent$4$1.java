package com.facebook.aura.confidentialvm.view;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$4$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$4$1(Object obj) {
        super(1, obj, ConfidentialVmDataTransferProgressViewModel.class, "onShown", "onShown(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((ConfidentialVmDataTransferProgressViewModel) this.receiver).onShown(z);
    }
}
