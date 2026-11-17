package X;

/* renamed from: X.AwD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2004AwD {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2004AwD) {
                C2004AwD c2004AwD = (C2004AwD) obj;
                if (this.A01 != c2004AwD.A01 || this.A00 != c2004AwD.A00 || this.A02 != c2004AwD.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(((this.A01 * 31) + this.A00) * 31, this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BidiRun(start=");
        sbA0x.append(this.A01);
        sbA0x.append(", end=");
        sbA0x.append(this.A00);
        sbA0x.append(C60N.A00(9));
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C2004AwD(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }
}
