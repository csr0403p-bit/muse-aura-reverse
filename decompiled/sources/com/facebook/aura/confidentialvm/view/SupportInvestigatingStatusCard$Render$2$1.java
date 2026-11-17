package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSupportAccessViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class SupportInvestigatingStatusCard$Render$2$1 extends C7438Evz implements Function0<Unit> {
    public SupportInvestigatingStatusCard$Render$2$1(Object obj) {
        super(0, obj, ConfidentialVmSupportAccessViewModel.class, "onRevokeAccessClick", "onRevokeAccessClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmSupportAccessViewModel) this.receiver).onRevokeAccessClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
