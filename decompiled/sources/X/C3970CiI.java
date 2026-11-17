package X;

/* renamed from: X.CiI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3970CiI extends C06G implements InterfaceC3985Cia {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3970CiI) && C7384Etj.areEqual(this.A00, ((C3970CiI) obj).A00));
    }

    @Override // X.InterfaceC3985Cia
    public final void AMO() {
        this.A00.getBytes(DCl.A05);
    }

    @Override // X.InterfaceC3985Cia
    public final String AMP() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C60O.A0r("String(value=", this.A00);
    }

    public C3970CiI(String str) {
        this.A00 = str;
    }
}
