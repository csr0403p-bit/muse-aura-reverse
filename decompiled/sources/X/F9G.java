package X;

/* loaded from: classes6.dex */
public final class F9G {
    public final F9H A00;
    public final String A01;

    public F9G(F9H f9h, String str) {
        C7384Etj.A0Y(str, 0);
        this.A01 = str;
        this.A00 = f9h;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F9G) {
                F9G f9g = (F9G) obj;
                if (!this.A01.equals(f9g.A01) || !C7384Etj.areEqual(this.A00, f9g.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", nextFrame=", C3cI.A0x("BloksStackFrame(offset=", this.A01));
    }
}
