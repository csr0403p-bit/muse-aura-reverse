package com.facebook.aura.components.reactions;

import X.AT5;
import X.AYL;
import X.AbstractC7559F3s;
import X.ApQ;
import X.B6A;
import X.C0881AGi;
import X.C16Z;
import X.C1809ArT;
import X.C1822Arm;
import X.C1868Asi;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraGlyphScatterKt$auraGlyphScatter$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ String $emoji;
    public final /* synthetic */ C1868Asi $measurer;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        String str;
        C7384Etj.A0Y(c16z, 0);
        c16z.A9O();
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || (str = this.$emoji) == null || str.length() == 0) {
            return;
        }
        C1868Asi c1868Asi = this.$measurer;
        C0881AGi c0881AGi = C0881AGi.A00;
        ApQ apQ = new ApQ(str, c0881AGi);
        C1822Arm c1822Arm = C1822Arm.A03;
        long j = AuraGlyphScatterKt.GlyphScatterSize;
        long j2 = B6A.A07;
        long j3 = C1809ArT.A01;
        C1822Arm c1822Arm2 = new C1822Arm(null, null, null, 0, 0, j2, j, j3, j2, j3);
        long jA06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        float f = fA00 * 750.0f;
        AuraGlyphScatterKt.drawGlyphScatter(c16z, f, C1868Asi.A00(apQ, c1868Asi, c1822Arm2, c1868Asi.A00, c1868Asi.A01, c1868Asi.A02, c0881AGi, 1, Integer.MAX_VALUE, jA06, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraGlyphScatterKt$auraGlyphScatter$1$1(AT5<Float, ?> at5, String str, C1868Asi c1868Asi) {
        super(1);
        this.$progress = at5;
        this.$emoji = str;
        this.$measurer = c1868Asi;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
