package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C00r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistCameraHostKt$rememberAssistCameraInsets$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $bottom;
    public final /* synthetic */ boolean $cameraActive;
    public final /* synthetic */ C00r $capturedBottom$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistCameraHostKt$rememberAssistCameraInsets$1$1(boolean z, int i, C00r c00r) {
        super(0);
        this.$cameraActive = z;
        this.$bottom = i;
        this.$capturedBottom$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$cameraActive) {
            return;
        }
        this.$capturedBottom$delegate.AdX(this.$bottom);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
