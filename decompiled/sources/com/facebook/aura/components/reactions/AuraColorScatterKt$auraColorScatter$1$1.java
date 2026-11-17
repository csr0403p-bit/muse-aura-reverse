package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.ATD;
import X.AXN;
import X.AbstractC7559F3s;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraColorScatterKt$auraColorScatter$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraColorScatterKt$auraColorScatter$1$1(AT5<Float, ?> at5, AHD<B6A> ahd) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 750.0f;
        float fA002 = AXN.A00(c16z);
        List<B6A> listScatterSwatches = AuraColorScatterKt.scatterSwatches(this.$palette);
        float fAh4 = c16z.Ah4(AuraColorScatterKt.ColorScatterDiscSize) / 2.0f;
        List<Float> list = AuraScatterKt.ScatterDx;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float fScatterStartMs = (f - AuraScatterKt.scatterStartMs(i)) / 640.0f;
            if (fScatterStartMs > 0.0f && fScatterStartMs < 1.0f) {
                long jA0G = C8j5.A0G(listScatterSwatches, i);
                float fA03 = C8j4.A03(AuraScatterKt.ScatterScales, i) * fAh4 * C8j3.A02(0.82f, 1.0f, fScatterStartMs);
                long jM415scatterPointULxng0E = AuraScatterKt.m415scatterPointULxng0E(c16z.ADU(), C8j4.A03(list, i), C8j4.A03(AuraScatterKt.ScatterApex, i), fScatterStartMs, fA002);
                c16z.A9N(null, C16a.A00, fA03, ATD.A03(AuraScatterKt.scatterAlpha(i, fScatterStartMs), 0.0f, 1.0f), 3, jA0G, jM415scatterPointULxng0E);
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
