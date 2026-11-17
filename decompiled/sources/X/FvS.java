package X;

/* loaded from: classes6.dex */
public final class FvS implements InterfaceC8974FvU {
    public final InterfaceC9011Fwo A00;

    public FvS(InterfaceC9011Fwo interfaceC9011Fwo) {
        C7384Etj.A0Y(interfaceC9011Fwo, 0);
        this.A00 = interfaceC9011Fwo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.changes.UpsertionChange");
                if (!this.A00.equals(((FvS) obj).A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
