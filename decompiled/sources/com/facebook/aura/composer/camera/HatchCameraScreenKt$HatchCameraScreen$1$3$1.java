package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCameraScreenKt$HatchCameraScreen$1$3$1 extends AbstractC7559F3s implements G0U<Function0<? extends Unit>, Unit> {
    public final /* synthetic */ MutableState<Function0<Unit>> $takePhoto$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.$takePhoto$delegate.Af8(function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraScreenKt$HatchCameraScreen$1$3$1(MutableState<Function0<Unit>> mutableState) {
        super(1);
        this.$takePhoto$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
        invoke2((Function0<Unit>) function0);
        return Unit.INSTANCE;
    }
}
