package com.facebook.aura.shopping.view;

import X.AT3;
import X.AWA;
import X.AWx;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ShoppingProductDetailsVariantRowKt$ColorCircle$1$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ AuraColors $colors;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fA01 = (AWA.A01(at3.AKb()) / 2.0f) / ((float) Math.sqrt(2.0d));
        long j = this.$colors.tertiaryText;
        long jADU = at3.ADU();
        long jFloatToRawIntBits = Float.floatToRawIntBits(fA01);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(-fA01);
        at3.A9X(null, null, at3.Ah4(1.0f), 1.0f, 0, 3, j, AWx.A05(jADU, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L)), AWx.A05(jADU, (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits & 4294967295L)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsVariantRowKt$ColorCircle$1$1$1(AuraColors auraColors) {
        super(1);
        this.$colors = auraColors;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
