package com.facebook.aura.confidentialvm.view;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$1$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$1$1(Object obj) {
        super(1, obj, ConfidentialVmSwitchViewModel.class, "onSubscribed", "onSubscribed(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((ConfidentialVmSwitchViewModel) this.receiver).onSubscribed(z);
    }
}
