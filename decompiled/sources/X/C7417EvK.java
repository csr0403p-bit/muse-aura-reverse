package X;

/* renamed from: X.EvK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7417EvK {
    public static final String A01 = C7384Etj.A0I("NetworkRequestCompat");
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7417EvK) && C7384Etj.areEqual(this.A00, ((C7417EvK) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("NetworkRequestCompat(wrapped=", this.A00);
    }

    public C7417EvK(Object obj) {
        this.A00 = obj;
    }

    public C7417EvK() {
        this(null);
    }
}
