package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCameraScreenKt$HatchCameraScreen$1$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Function0<Unit>> $takePhoto$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraScreenKt$HatchCameraScreen$1$6$1(MutableState<Function0<Unit>> mutableState) {
        super(0);
        this.$takePhoto$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> value = this.$takePhoto$delegate.getValue();
        if (value != null) {
            value.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
