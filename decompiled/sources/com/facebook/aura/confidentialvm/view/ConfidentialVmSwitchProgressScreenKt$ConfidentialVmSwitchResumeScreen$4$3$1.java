package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$4$3$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$4$3$1(Object obj) {
        super(0, obj, ConfidentialVmSwitchResumeViewModel.class, "onLogOutClick", "onLogOutClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmSwitchResumeViewModel) this.receiver).onLogOutClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
