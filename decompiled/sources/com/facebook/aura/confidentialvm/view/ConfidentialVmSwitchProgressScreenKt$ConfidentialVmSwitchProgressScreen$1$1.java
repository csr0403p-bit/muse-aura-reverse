package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Boolean> $isRefused$delegate;
    public final /* synthetic */ Function0<Unit> $leave;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$1$1(Function0<Unit> function0, C1BO<Boolean> c1bo) {
        super(0);
        this.$leave = function0;
        this.$isRefused$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C1BO.A0F(this.$isRefused$delegate)) {
            this.$leave.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
