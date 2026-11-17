package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.AbstractC7559F3s;
import X.B6A;
import X.C16Z;
import X.C8j4;
import X.G0U;
import X.HDi;
import X.HxS;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraPressureReleaseKt$auraPressureRelease$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        boolean zA1X = C8j4.A1X(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 620.0f;
        long jADU = c16z.ADU();
        long jA0P = C8j4.A0P(this.$palette, zA1X ? 1 : 0);
        AuraReactionStrokesKt.m410drawReactionRing6Kx3sI(c16z, jADU, HxS.A04(HDi.A0O[(int) (jA0P & 63)], B6A.A03(jA0P), B6A.A02(jA0P), B6A.A01(jA0P), 0.9f), c16z.Ah4(AuraPressureReleaseKt.RingFrom), c16z.Ah4(AuraPressureReleaseKt.RingTo), c16z.Ah4(AuraPressureReleaseKt.RingWidth), (f - 60.0f) / 400.0f);
        AuraPressureReleaseKt.drawFragments(c16z, f, this.$palette);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraPressureReleaseKt$auraPressureRelease$1$1(AT5<Float, ?> at5, AHD<B6A> ahd) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
