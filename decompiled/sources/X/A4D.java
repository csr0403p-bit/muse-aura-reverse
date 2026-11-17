package X;

/* loaded from: classes4.dex */
public final class A4D {
    public final B9B A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof A4D) && C7384Etj.areEqual(this.A00, ((A4D) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Key(font=");
        sbA0x.append(this.A00);
        sbA0x.append(", loaderKey=");
        return AnonymousClass007.A0Z(null, sbA0x);
    }

    public A4D(B9B b9b) {
        this.A00 = b9b;
    }
}
