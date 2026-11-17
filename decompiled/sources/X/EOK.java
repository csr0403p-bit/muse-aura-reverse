package X;

/* loaded from: classes5.dex */
public final class EOK implements InterfaceC6668EOe {
    public final Throwable A00;
    public final EOL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EOK) {
                EOK eok = (EOK) obj;
                if (!this.A01.equals(eok.A01) || !this.A00.equals(eok.A00)) {
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
        return C3cJ.A0L(this.A00, ", cause=", C3cG.A0f(this.A01, "Failure(error="));
    }

    public EOK(Throwable th, EOL eol) {
        this.A01 = eol;
        this.A00 = th;
    }
}
