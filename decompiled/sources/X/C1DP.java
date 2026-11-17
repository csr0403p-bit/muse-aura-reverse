package X;

/* renamed from: X.1DP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DP implements C3TQ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public static int A00(C1DP c1dp, float f, float f2, int i) {
        return Ab3.A01((i + ((c1dp.A02 + c1dp.A01) * f)) * f2);
    }

    @Override // X.C3TQ
    public final float A5h() {
        return this.A00;
    }

    @Override // X.C3TQ
    public final float A5k(EnumC1820Arj enumC1820Arj) {
        return enumC1820Arj == EnumC1820Arj.A02 ? this.A02 : this.A01;
    }

    @Override // X.C3TQ
    public final float A5n(EnumC1820Arj enumC1820Arj) {
        return enumC1820Arj == EnumC1820Arj.A02 ? this.A01 : this.A02;
    }

    @Override // X.C3TQ
    public final float A5q() {
        return this.A03;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1DP)) {
            return false;
        }
        C1DP c1dp = (C1DP) obj;
        return C1DG.A08(this.A02, c1dp.A02) && C1DG.A08(this.A03, c1dp.A03) && C1DG.A08(this.A01, c1dp.A01) && C1DG.A08(this.A00, c1dp.A00);
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.A02) * 31, this.A03), this.A01) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        C1DG.A07(sb, this.A02);
        sb.append(", top=");
        C1DG.A07(sb, this.A03);
        sb.append(", end=");
        C1DG.A07(sb, this.A01);
        sb.append(", bottom=");
        return AnonymousClass007.A0Z(C1DG.A05(this.A00), sb);
    }

    public C1DP(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        boolean z = (f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f);
        if (f4 < 0.0f || (!z || !true)) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }
}
