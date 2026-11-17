package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C3cI;
import com.facebook.aura.perf.HatchActivationQplLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivationAgeStepKt$CardAgeStep$onAgeVerified$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AtomicBoolean $ccvFinished;
    public final /* synthetic */ Function0<Unit> $onCCVAgeVerified;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationAgeStepKt$CardAgeStep$onAgeVerified$1$1(AtomicBoolean atomicBoolean, Function0<Unit> function0) {
        super(0);
        this.$ccvFinished = atomicBoolean;
        this.$onCCVAgeVerified = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C3cI.A1W(this.$ccvFinished)) {
            HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
            hatchActivationQplLogger.endAgeConfirmationSuccess();
            hatchActivationQplLogger.pointFlow("age_confirmed");
            this.$onCCVAgeVerified.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
