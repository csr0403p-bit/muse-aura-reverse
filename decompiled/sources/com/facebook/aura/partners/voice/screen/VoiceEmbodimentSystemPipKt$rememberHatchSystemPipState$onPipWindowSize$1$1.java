package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.BL4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$onPipWindowSize$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ MutableState<HatchSystemPipGeometry> $geometry$delegate;
    public final /* synthetic */ MutableState<HatchPipWindowMeasurement> $pipWindow$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$onPipWindowSize$1$1(MutableState<HatchSystemPipGeometry> mutableState, MutableState<HatchPipWindowMeasurement> mutableState2) {
        super(1);
        this.$geometry$delegate = mutableState;
        this.$pipWindow$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1778invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1778invokeozmzZPI(long j) {
        boolean z;
        long j2 = 0;
        HatchSystemPipGeometry value = this.$geometry$delegate.getValue();
        if (value != null) {
            j2 = value.windowSize;
            z = true;
        } else {
            z = false;
        }
        int iMin = Math.min((int) (j >> 32), (int) (j & 4294967295L));
        if (!z || iMin >= Math.min((int) (j2 >> 32), (int) (j2 & 4294967295L))) {
            return;
        }
        this.$pipWindow$delegate.Af8(new HatchPipWindowMeasurement(j2, iMin));
    }
}
