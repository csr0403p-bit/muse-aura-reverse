package X;

/* renamed from: X.DaT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5139DaT implements InterfaceC5168Day {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5139DaT) && C7384Etj.areEqual(this.A00, ((C5139DaT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Resolved(value=", this.A00);
    }

    public C5139DaT(Object obj) {
        this.A00 = obj;
    }
}
