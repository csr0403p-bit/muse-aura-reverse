package X;

/* loaded from: classes6.dex */
public final class Hj8 implements Comparable<Hj8> {
    public final double A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Hj8) && this.A00 == ((Hj8) obj).A00);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Hj8 hj8) {
        Hj8 hj82 = hj8;
        C7384Etj.A0Y(hj82, 0);
        return Double.compare(this.A00, hj82.A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public Hj8(double d) {
        this.A00 = d;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        return C8j3.A16(sbA0w, '%');
    }
}
