package X;

/* renamed from: X.Ddb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5219Ddb {
    public final int A00;
    public final int A01;
    public final C5220Ddc A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5219Ddb) {
                C5219Ddb c5219Ddb = (C5219Ddb) obj;
                if (this.A01 != c5219Ddb.A01 || !this.A02.equals(c5219Ddb.A02) || this.A05 != c5219Ddb.A05 || this.A04 != c5219Ddb.A04 || this.A03 != c5219Ddb.A03 || this.A00 != c5219Ddb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.A02, this.A01 * 31), this.A05), this.A04), this.A03) + this.A00;
    }

    public final String toString() {
        int i = this.A01;
        C5220Ddc c5220Ddc = this.A02;
        boolean z = this.A05;
        boolean z2 = this.A04;
        boolean z3 = this.A03;
        int i2 = this.A00;
        StringBuilder sbA0y = C60O.A0y("ShaderConfig(passes=", i);
        sbA0y.append(", margins=");
        sbA0y.append(c5220Ddc);
        sbA0y.append(", usesPassIndex=");
        sbA0y.append(z);
        sbA0y.append(", usesBkResolution=");
        sbA0y.append(z2);
        sbA0y.append(", usesBkRenderMargin=");
        sbA0y.append(z3);
        sbA0y.append(", frameRateCapHz=");
        sbA0y.append(i2);
        return BV7.A10(sbA0y);
    }

    public C5219Ddb(C5220Ddc c5220Ddc, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A02 = c5220Ddc;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A00 = i2;
    }
}
