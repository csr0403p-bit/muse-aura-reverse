package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.perf.HatchActivationQplLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivationAgeStepKt$ActivationAgeVerificationStep$onAgeLogOut$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onLogOutClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationAgeStepKt$ActivationAgeVerificationStep$onAgeLogOut$1$1(Function0<Unit> function0) {
        super(0);
        this.$onLogOutClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
        hatchActivationQplLogger.endAgeConfirmationCancel();
        hatchActivationQplLogger.pointFlow("ccv_back_log_out");
        this.$onLogOutClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
