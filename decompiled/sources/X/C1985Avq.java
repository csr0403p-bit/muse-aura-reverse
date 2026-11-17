package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Avq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1985Avq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C1982Avn A05;

    public final C2133Az1 A00(C2050AxN c2050AxN, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        Integer num;
        int i5 = i3 + i4;
        if (c2050AxN != null && ((num = this.A05.A04) == C79.A00 || (i2 < this.A03 && ((int) (j & 4294967295L)) - ((int) (c2050AxN.A00 & 4294967295L)) >= 0))) {
            if (i == 0 || (i < this.A02 && ((int) (j >> 32)) - ((int) (c2050AxN.A00 >> 32)) >= 0)) {
                num.intValue();
                return new C2133Az1(false, false);
            }
            if (!z2) {
                long jA0T = C8j3.A0T(Constraints.A01(this.A04), (((int) (j & 4294967295L)) - this.A00) - i4);
                long j2 = c2050AxN.A00;
                return new C2133Az1(true, A00(new C2050AxN(C8j3.A0T(C8j3.A0G(j2) - this.A01, (int) (j2 & 4294967295L))), 0, i2 + 1, i5, 0, jA0T, z, true).A00);
            }
        }
        return new C2133Az1(true, true);
    }

    public C1985Avq(C1982Avn c1982Avn, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A05 = c1982Avn;
        this.A04 = j;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
