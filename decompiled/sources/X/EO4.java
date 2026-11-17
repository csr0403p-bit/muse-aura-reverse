package X;

/* loaded from: classes5.dex */
public final class EO4 extends EO8 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EO4) && C7384Etj.areEqual(this.A00, ((EO4) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C60O.A0r("AccountManager(accountManagerType=", this.A00);
    }

    public EO4(String str) {
        this.A00 = str;
    }
}
