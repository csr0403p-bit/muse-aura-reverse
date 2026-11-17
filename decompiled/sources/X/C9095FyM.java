package X;

/* renamed from: X.FyM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9095FyM implements Comparable<C9095FyM> {
    public static final C9145FzE A01 = new C9145FzE();
    public final double A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9095FyM) && this.A00 == ((C9095FyM) obj).A00);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9095FyM c9095FyM) {
        C9095FyM c9095FyM2 = c9095FyM;
        C7384Etj.A0Y(c9095FyM2, 0);
        return Double.compare(this.A00, c9095FyM2.A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public C9095FyM(double d) {
        this.A00 = d;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        return AnonymousClass001.A0v(" mmHg", sbA0w);
    }
}
