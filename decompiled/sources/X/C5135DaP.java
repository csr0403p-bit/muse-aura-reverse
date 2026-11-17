package X;

/* renamed from: X.DaP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5135DaP implements InterfaceC5168Day {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5135DaP) && C7384Etj.areEqual(this.A00, ((C5135DaP) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + 1237;
    }

    public final String toString() {
        return C8j5.A0W(", listHasNullItems=", C3cG.A0f(this.A00, "BubbledToNull(value="), false);
    }

    public C5135DaP(Object obj) {
        this.A00 = obj;
    }
}
