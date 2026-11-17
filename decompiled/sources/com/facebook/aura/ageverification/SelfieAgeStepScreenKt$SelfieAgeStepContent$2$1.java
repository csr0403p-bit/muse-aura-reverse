package com.facebook.aura.ageverification;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.ageverification.SelfieStep;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelfieAgeStepScreenKt$SelfieAgeStepContent$2$1 extends C7438Evz implements G0U<SelfieStep.Complete, Unit> {
    public SelfieAgeStepScreenKt$SelfieAgeStepContent$2$1(Object obj) {
        super(1, obj, SelfieAgeStepViewModel.class, "onCaptured", "onCaptured(Lcom/facebook/aura/ageverification/SelfieStep$Complete;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SelfieStep.Complete complete) {
        ((SelfieAgeStepViewModel) AnonymousClass006.A0o(complete, this)).onCaptured(complete);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SelfieStep.Complete complete) {
        invoke2(complete);
        return Unit.INSTANCE;
    }
}
