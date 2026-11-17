package X;

import androidx.compose.ui.Alignment;

/* loaded from: classes4.dex */
public final class AWF implements AeE {
    public final long A00;
    public final Alignment A01;

    @Override // X.AeE
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo11calculatePositionllwVHH4(BLU blu, long j, EnumC1820Arj enumC1820Arj, long j2) {
        Alignment alignment = this.A01;
        long jA4F = alignment.A4F(enumC1820Arj, 0L, blu.A01());
        long jA4F2 = alignment.A4F(enumC1820Arj, 0L, j2);
        long jA0S = C8j3.A0S(-((int) (jA4F2 >> 32)), -((int) (jA4F2 & 4294967295L)));
        long j3 = this.A00;
        return C2ae.A02(C2ae.A02(C2ae.A02(C8j3.A0T(blu.A01, blu.A03), jA4F), jA0S), C8j3.A0R(((int) (j3 >> 32)) * (enumC1820Arj == EnumC1820Arj.A02 ? 1 : -1), AnonymousClass002.A09(j3)));
    }

    public AWF(Alignment alignment, long j) {
        this.A01 = alignment;
        this.A00 = j;
    }
}
