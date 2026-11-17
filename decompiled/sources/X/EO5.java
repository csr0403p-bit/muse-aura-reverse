package X;

/* loaded from: classes5.dex */
public final class EO5 extends EO9 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EO5) && C7384Etj.areEqual(this.A00, ((EO5) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C60O.A0r("AuthToken(value=", this.A00);
    }

    public EO5(String str) {
        this.A00 = str;
    }
}
