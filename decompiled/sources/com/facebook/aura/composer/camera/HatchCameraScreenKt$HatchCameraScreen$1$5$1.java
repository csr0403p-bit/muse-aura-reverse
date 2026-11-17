package com.facebook.aura.composer.camera;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchCameraScreenKt$HatchCameraScreen$1$5$1 extends C7438Evz implements Function0<Unit> {
    public HatchCameraScreenKt$HatchCameraScreen$1$5$1(Object obj) {
        super(0, obj, HatchCameraSession.class, "retake", "retake()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchCameraSession) this.receiver).retake();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
