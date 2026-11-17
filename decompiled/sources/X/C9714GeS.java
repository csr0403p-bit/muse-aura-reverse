package X;

/* renamed from: X.GeS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9714GeS extends C06G implements InterfaceC9665Gd7 {
    public final C9717GeV A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9714GeS) && C7384Etj.areEqual(this.A00, ((C9714GeS) obj).A00));
    }

    @Override // X.InterfaceC9725Ged
    public final Integer AFu() {
        return C79.A00;
    }

    @Override // X.InterfaceC9725Ged
    public final String AJA() {
        return this.A00.A01.A09;
    }

    @Override // X.InterfaceC9725Ged
    public final C9698Ge3 AJG() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC9725Ged
    public final C9661Gd3 AJL() {
        return this.A00.A02;
    }

    @Override // X.InterfaceC9725Ged
    public final String AMI() {
        return this.A00.A01.A04;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("UserPurchase(attempt=", this.A00);
    }

    public C9714GeS(C9717GeV c9717GeV) {
        this.A00 = c9717GeV;
    }
}
