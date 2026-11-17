package com.facebook.aura.maps;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchMapHostKt$HatchMapHost$3$1 extends C7438Evz implements Function0<Unit> {
    public HatchMapHostKt$HatchMapHost$3$1(Object obj) {
        super(0, obj, HatchMapFlowController.class, "mapDetached", "mapDetached()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchMapFlowController) this.receiver).mapDetached();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
