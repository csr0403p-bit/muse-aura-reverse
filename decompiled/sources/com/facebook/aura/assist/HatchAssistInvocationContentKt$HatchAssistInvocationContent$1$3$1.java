package com.facebook.aura.assist;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$3$1 extends C7438Evz implements Function0<Unit> {
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$3$1(Object obj) {
        super(0, obj, HatchAssistOverlayViewModel.class, "cancelVoiceDictation", "cancelVoiceDictation()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchAssistOverlayViewModel) this.receiver).cancelVoiceDictation();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
