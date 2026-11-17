package X;

/* renamed from: X.Fy9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9082Fy9 implements Comparable<C9082Fy9> {
    public static final C9146FzF A02 = new C9146FzF();
    public final double A00;
    public final EnumC9112Fyd A01;

    public final boolean equals(Object obj) {
        double dA00;
        double dA002;
        if (this != obj) {
            if (obj instanceof C9082Fy9) {
                C9082Fy9 c9082Fy9 = (C9082Fy9) obj;
                if (this.A01 == c9082Fy9.A01) {
                    dA00 = this.A00;
                    dA002 = c9082Fy9.A00;
                } else {
                    dA00 = A00();
                    dA002 = c9082Fy9.A00();
                }
                if (dA00 == dA002) {
                }
            }
            return false;
        }
        return true;
    }

    public final double A00() {
        int i = AbstractC9111Fyc.A00[this.A01.ordinal()];
        if (i == 1) {
            return this.A00;
        }
        if (i == 2) {
            return this.A00 / 1.8d;
        }
        throw C3cG.A0q();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9082Fy9 c9082Fy9) {
        double dA00;
        double dA002;
        C9082Fy9 c9082Fy92 = c9082Fy9;
        C7384Etj.A0Y(c9082Fy92, 0);
        if (this.A01 == c9082Fy92.A01) {
            dA00 = this.A00;
            dA002 = c9082Fy92.A00;
        } else {
            dA00 = A00();
            dA002 = c9082Fy92.A00();
        }
        return Double.compare(dA00, dA002);
    }

    public C9082Fy9(EnumC9112Fyd enumC9112Fyd, double d) {
        this.A00 = d;
        this.A01 = enumC9112Fyd;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(A00()));
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9112Fyd enumC9112Fyd = this.A01;
        return AnonymousClass001.A0v(enumC9112Fyd instanceof Fz2 ? ((Fz2) enumC9112Fyd).title : ((C9135Fz0) enumC9112Fyd).title, sbA0w);
    }
}
