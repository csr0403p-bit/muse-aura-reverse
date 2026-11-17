package X;

/* loaded from: classes5.dex */
public final class EOL {
    public final String A00;
    public final EP0 A01;
    public final ENz A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EOL) {
                EOL eol = (EOL) obj;
                if (this.A02 != eol.A02 || !this.A00.equals(eol.A00) || this.A01 != eol.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.A00, AnonymousClass005.A0E(this.A02)) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        ENz eNz = this.A02;
        String str = this.A00;
        EP0 ep0 = this.A01;
        StringBuilder sbA0f = C3cG.A0f(eNz, "FXAccessError(code=");
        sbA0f.append(", message=");
        sbA0f.append(str);
        return C3cJ.A0L(ep0, ", appSource=", sbA0f);
    }

    public EOL(String str, EP0 ep0, ENz eNz) {
        AnonymousClass003.A0u(eNz, str);
        this.A02 = eNz;
        this.A00 = str;
        this.A01 = ep0;
    }
}
