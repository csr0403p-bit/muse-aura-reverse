package X;

/* loaded from: classes6.dex */
public final class FDN {
    public int A00;
    public F9H A01;
    public Hj6 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FDN) {
                FDN fdn = (FDN) obj;
                if (!C7384Etj.areEqual(this.A02, fdn.A02) || !C7384Etj.areEqual(this.A01, fdn.A01) || this.A00 != fdn.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A02) + AnonymousClass006.A0D(this.A01)) * 31) + this.A00;
    }

    public final String toString() {
        Hj6 hj6 = this.A02;
        F9H f9h = this.A01;
        int i = this.A00;
        StringBuilder sbA0f = C3cG.A0f(hj6, "BloksLispyInterpreterStackFrame(arguments=");
        sbA0f.append(", sourceMapNode=");
        sbA0f.append(f9h);
        return AbstractC7610F5x.A0x(", lispyOffset=", sbA0f, i);
    }
}
