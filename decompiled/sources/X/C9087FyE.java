package X;

/* renamed from: X.FyE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9087FyE implements Comparable<C9087FyE> {
    public final double A00;
    public final EnumC9110Fyb A01;

    public final boolean equals(Object obj) {
        double dA00;
        double dA002;
        if (this != obj) {
            if (obj instanceof C9087FyE) {
                C9087FyE c9087FyE = (C9087FyE) obj;
                if (this.A01 == c9087FyE.A01) {
                    dA00 = this.A00;
                    dA002 = c9087FyE.A00;
                } else {
                    dA00 = A00();
                    dA002 = c9087FyE.A00();
                }
                if (dA00 == dA002) {
                }
            }
            return false;
        }
        return true;
    }

    public final double A00() {
        int i = AbstractC9109Fya.A00[this.A01.ordinal()];
        if (i == 1) {
            return this.A00;
        }
        if (i == 2) {
            return (this.A00 - 32.0d) / 1.8d;
        }
        throw C3cG.A0q();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9087FyE c9087FyE) {
        double dA00;
        double dA002;
        C9087FyE c9087FyE2 = c9087FyE;
        C7384Etj.A0Y(c9087FyE2, 0);
        if (this.A01 == c9087FyE2.A01) {
            dA00 = this.A00;
            dA002 = c9087FyE2.A00;
        } else {
            dA00 = A00();
            dA002 = c9087FyE2.A00();
        }
        return Double.compare(dA00, dA002);
    }

    public C9087FyE(EnumC9110Fyb enumC9110Fyb, double d) {
        this.A00 = d;
        this.A01 = enumC9110Fyb;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(A00()));
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9110Fyb enumC9110Fyb = this.A01;
        return AnonymousClass001.A0v(enumC9110Fyb instanceof C9136Fz1 ? ((C9136Fz1) enumC9110Fyb).title : ((C9134Fyz) enumC9110Fyb).title, sbA0w);
    }
}
