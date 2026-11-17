package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.G0U;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$4$1 extends AbstractC7559F3s implements G0U<Function0<? extends Bitmap>, Unit> {
    public final /* synthetic */ MutableState<Function0<Bitmap>> $clipCapture$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$4$1(MutableState<Function0<Bitmap>> mutableState) {
        super(1);
        this.$clipCapture$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Bitmap> function0) {
        invoke2((Function0<Bitmap>) function0);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Function0<Bitmap> function0) {
        this.$clipCapture$delegate.Af8(function0);
    }
}
