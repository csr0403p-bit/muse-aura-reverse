package com.facebook.aura.file.view;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoProgressSlider$3$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $inactiveTrackColor;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ float $thumbSize;
    public final /* synthetic */ float $trackHeight;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(this.$thumbSize) / 2.0f;
        long jAKb = at3.AKb();
        float fA00 = fAh4 + (((AnonymousClass001.A00(jAKb) - fAh4) - fAh4) * this.$progress);
        float fA01 = AnonymousClass001.A01(jAKb, 4294967295L) / 2.0f;
        float fAh42 = at3.Ah4(this.$trackHeight);
        long j = this.$inactiveTrackColor;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fA01) & 4294967295L;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fAh4) << 32) | jFloatToRawIntBits;
        at3.A9X(null, null, fAh42, 1.0f, 1, 3, j, jFloatToRawIntBits2, (Float.floatToRawIntBits(r9) << 32) | jFloatToRawIntBits);
        long j2 = B6A.A08;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(fA00) << 32) | jFloatToRawIntBits;
        at3.A9X(null, null, fAh42, 1.0f, 1, 3, j2, jFloatToRawIntBits2, jFloatToRawIntBits3);
        at3.A9N(null, C16a.A00, fAh4, 1.0f, 3, j2, jFloatToRawIntBits3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$VideoProgressSlider$3$1(float f, float f2, float f3, long j) {
        super(1);
        this.$thumbSize = f;
        this.$progress = f2;
        this.$trackHeight = f3;
        this.$inactiveTrackColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
