package com.facebook.aura.composer.camera;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchCameraScreenKt$HatchCameraControls$1$1$1 extends C7438Evz implements Function0<Unit> {
    public HatchCameraScreenKt$HatchCameraControls$1$1$1(Object obj) {
        super(0, obj, HatchCameraSession.class, "switchCamera", "switchCamera()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchCameraSession) this.receiver).switchCamera();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
