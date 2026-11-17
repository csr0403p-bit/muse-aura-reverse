package X;

/* loaded from: classes6.dex */
public final class F9W {
    public final HoL A00;
    public final F9S A01;

    public F9W(HoL hoL, F9S f9s) {
        C7384Etj.A0Y(hoL, 1);
        this.A01 = f9s;
        this.A00 = hoL;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F9W) {
                F9W f9w = (F9W) obj;
                if (!this.A01.equals(f9w.A01) || !this.A00.equals(f9w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", response=", C3cG.A0f(this.A01, "PendingResponse(queryDefinition="));
    }
}
