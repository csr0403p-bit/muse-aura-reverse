package com.facebook.aura.components.reactions;

import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.C16Z;
import X.C16a;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraLittleWishKt$auraLittleWish$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraLittleWishKt$auraLittleWish$1$1(AT5<Float, ?> at5) {
        super(1);
        this.$progress = at5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 960.0f;
        float fA002 = AXN.A00(c16z);
        long jADU = c16z.ADU();
        long jA03 = AWx.A03(AuraLittleWishKt.StarFrom, fA002, jADU);
        long jA032 = AWx.A03(AuraLittleWishKt.StarTo, fA002, jADU);
        float f2 = (f - 120.0f) / 680.0f;
        if (f2 > 0.0f && f2 < 1.0f) {
            float fA02 = ATD.A02(f - 100.0f, 160.0f);
            float fA01 = ATD.A01(f2);
            long j = AuraLittleWishKt.WishColor;
            float fAh4 = c16z.Ah4(AuraLittleWishKt.StarSize) / 2.0f;
            long jM402curvePointAtjyLRC_s = AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA03, jA032, 2.0f * fA002, AuraReactionMotionKt.easeInOut(f2));
            c16z.A9N(null, C16a.A00, fAh4, fA02 * (1.0f - fA01), 3, j, jM402curvePointAtjyLRC_s);
        }
        AuraReactionMotionKt.m404drawReactionSparklea8Bkb0Q(c16z, jA032, AuraLittleWishKt.WishColor, c16z.Ah4(AuraLittleWishKt.WishSparkleSize), (f - 520.0f) / 440.0f);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
