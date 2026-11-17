package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivationAgeStepKt$ActivationAgeVerificationStep$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onAgeLogOut;
    public final /* synthetic */ Function0<Unit> $onAgeLogOutConfirmationDismissed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationAgeStepKt$ActivationAgeVerificationStep$6$1(Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$onAgeLogOutConfirmationDismissed = function0;
        this.$onAgeLogOut = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAgeLogOutConfirmationDismissed.invoke();
        this.$onAgeLogOut.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
