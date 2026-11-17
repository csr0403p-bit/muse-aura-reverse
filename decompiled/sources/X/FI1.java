package X;

import android.graphics.Rect;
import android.util.Pair;

/* loaded from: classes6.dex */
public final class FI1 implements FJD {
    public final FKW A00;
    public final CharSequence A01 = "Warm up";

    @Override // X.InterfaceC10547Hrt
    /* renamed from: AOM, reason: merged with bridge method [inline-methods] */
    public final boolean AON(FJD fjd) {
        FKW fkw;
        FKW fkw2;
        C7384Etj.A0Y(fjd, 0);
        return this == fjd || ((fjd instanceof FI1) && (((fkw = this.A00) == (fkw2 = ((FI1) fjd).A00) || (AbstractC2159Azp.A11(fkw.A0Y, fkw2.A0Y) && fkw.A0T == fkw2.A0T && fkw.A0V == fkw2.A0V && fkw.A0S == fkw2.A0S && fkw.A0U == fkw2.A0U && fkw.A0c == fkw2.A0c && fkw.A0M == fkw2.A0M && fkw.A0J == fkw2.A0J && fkw.A0L == fkw2.A0L && fkw.A0I == fkw2.A0I && fkw.A0N == fkw2.A0N && fkw.A0K == fkw2.A0K && fkw.A07 == fkw2.A07 && fkw.A05 == fkw2.A05 && fkw.A06 == fkw2.A06 && fkw.A0P == fkw2.A0P && fkw.A0d == fkw2.A0d && fkw.A0F == fkw2.A0F && fkw.A0Q == fkw2.A0Q && fkw.A0f == fkw2.A0f && fkw.A04 == fkw2.A04 && fkw.A02 == fkw2.A02 && fkw.A03 == fkw2.A03 && fkw.A0R == fkw2.A0R && fkw.A0Z == fkw2.A0Z && fkw.A09 == fkw2.A09 && fkw.A0C == fkw2.A0C && fkw.A0D == fkw2.A0D && fkw.A0a == fkw2.A0a && fkw.A0A == fkw2.A0A && fkw.A0E == fkw2.A0E && fkw.A0B == fkw2.A0B && fkw.A0g == fkw2.A0g && fkw.A0G == fkw2.A0G && fkw.A0H == fkw2.A0H && fkw.A00 == fkw2.A00 && fkw.A01 == fkw2.A01 && C7384Etj.areEqual(fkw.A0W, fkw2.A0W) && C7384Etj.areEqual(fkw.A0b, fkw2.A0b) && fkw.A0e == fkw2.A0e && fkw.A0O == fkw2.A0O && C7384Etj.areEqual(fkw.A0X, fkw2.A0X) && fkw.A08 == fkw2.A08)) && HqY.A00(fkw.A0Y, fkw2.A0Y)));
    }

    public FI1(FKW fkw) {
        this.A00 = fkw;
    }

    @Override // X.FJD
    public final C7881FIw APX(FJH fjh, long j) throws CloneNotSupportedException {
        FKW fkw = this.A00;
        FKW fkwA00 = fkw.A00();
        fkwA00.A0X = fkw.A0X;
        Pair pairA02 = FKX.A02(fjh.A00.A03, fkwA00, "Warm up", AbstractC7826FGh.A01(j), AbstractC7826FGh.A00(j));
        Rect rect = (Rect) pairA02.first;
        C7907FKc c7907FKc = (C7907FKc) pairA02.second;
        int iMax = Math.max(rect.width(), AbstractC7829FGk.A01(BV6.A03(j)).A05(j));
        int iMax2 = Math.max(rect.height(), AbstractC7829FGk.A01((int) j).A04(j));
        C7384Etj.A0X(c7907FKc);
        return new C7881FIw(new FJL(rect, c7907FKc, fkwA00, fkw.A00()), iMax, iMax2);
    }
}
