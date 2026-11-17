package X;

/* renamed from: X.Al6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1543Al6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final C1EQ A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1543Al6) {
                C1543Al6 c1543Al6 = (C1543Al6) obj;
                if (C1DG.A08(this.A01, c1543Al6.A01) && C1DG.A08(this.A02, c1543Al6.A02) && this.A05 == c1543Al6.A05 && this.A00 == c1543Al6.A00 && this.A03 == c1543Al6.A03) {
                    long j = this.A04;
                    long j2 = c1543Al6.A04;
                    long j3 = B6A.A01;
                    if (j != j2 || !C7384Etj.areEqual(this.A06, c1543Al6.A06)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = (AnonymousClass005.A02(AnonymousClass006.A06(this.A05, AnonymousClass005.A02(C8j4.A04(this.A01), this.A02)), this.A00) + this.A03) * 31;
        long j = this.A04;
        long j2 = B6A.A01;
        return AnonymousClass006.A06(j, iA02) + C60R.A01(this.A06);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Shadow(radius=");
        C1DG.A07(sbA0x, this.A01);
        sbA0x.append(", spread=");
        C1DG.A07(sbA0x, this.A02);
        sbA0x.append(", offset=");
        sbA0x.append((Object) AVe.A00(this.A05));
        sbA0x.append(", alpha=");
        sbA0x.append(this.A00);
        sbA0x.append(", blendMode=");
        sbA0x.append((Object) C1422Air.A00(this.A03));
        sbA0x.append(C60N.A00(3));
        AnonymousClass005.A0m(this.A04, sbA0x);
        sbA0x.append(", brush=");
        return AnonymousClass007.A0Z(this.A06, sbA0x);
    }

    public C1543Al6(C1EQ c1eq, float f, float f2, float f3, int i, long j, long j2) {
        this.A01 = f;
        this.A02 = f2;
        this.A05 = j;
        this.A03 = i;
        if (c1eq instanceof C1326AhD) {
            this.A04 = ((C1326AhD) c1eq).A00;
            this.A06 = null;
        } else {
            this.A04 = j2;
            this.A06 = c1eq;
        }
        this.A00 = AnonymousClass003.A00(f3);
    }
}
