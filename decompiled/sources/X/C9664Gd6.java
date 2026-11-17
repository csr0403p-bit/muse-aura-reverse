package X;

/* renamed from: X.Gd6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9664Gd6 extends C06G implements InterfaceC9725Ged {
    public final String A00;
    public final C9674Gdd A01;

    public C9664Gd6(C9674Gdd c9674Gdd, String str) {
        C7384Etj.A0Y(str, 1);
        this.A01 = c9674Gdd;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9664Gd6) {
                C9664Gd6 c9664Gd6 = (C9664Gd6) obj;
                if (!C7384Etj.areEqual(this.A01, c9664Gd6.A01) || !C7384Etj.areEqual(this.A00, c9664Gd6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9725Ged
    public final Integer AFu() {
        return C79.A0C;
    }

    @Override // X.InterfaceC9725Ged
    public final String AJA() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC9725Ged
    public final C9698Ge3 AJG() {
        return null;
    }

    @Override // X.InterfaceC9725Ged
    public final /* synthetic */ C9661Gd3 AJL() {
        return null;
    }

    @Override // X.InterfaceC9725Ged
    public final String AMI() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        return C3cJ.A0N(", uplSessionId=", this.A00, C3cG.A0f(this.A01, "SyncFulfillmentContext(request="));
    }
}
