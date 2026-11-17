package com.facebook.aura.rentalcars;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B6A;
import X.C1335AhM;
import X.C16a;
import X.C1EQ;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import X.HDi;
import X.HxS;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class RentalCarDetailsScreenKt$RentalCarBookFooter$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $background;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(RentalCarDetailsScreenKt.FOOTER_FADE_HEIGHT);
        long j = this.$background;
        float f = -fAh4;
        C1335AhM c1335AhMA01 = C1EQ.A01(AnonymousClass004.A17(C60P.A04(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f)), j), f, 0.0f);
        long jA0P = C8j3.A0P(0.0f);
        long jA0P2 = C8j3.A0P(f) & 4294967295L;
        long jA0Q = C8j3.A0Q(AnonymousClass001.A00(at3.AKb()), fAh4);
        at3.A9f(c1335AhMA01, null, C16a.A00, 1.0f, 3, jA0P2 | (jA0P << 32), jA0Q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarDetailsScreenKt$RentalCarBookFooter$1$1(long j) {
        super(1);
        this.$background = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
