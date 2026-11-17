package X;

/* renamed from: X.FyP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9098FyP extends AbstractC9142FzB {
    public final double A00;
    public final double A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9098FyP) {
                C9098FyP c9098FyP = (C9098FyP) obj;
                if (this.A01 != c9098FyP.A01 || this.A00 != c9098FyP.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CadenceTarget(minCadence=");
        sbA0x.append(this.A01);
        sbA0x.append(", maxCadence=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C9098FyP(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }
}
