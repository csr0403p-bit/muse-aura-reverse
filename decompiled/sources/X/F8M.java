package X;

/* loaded from: classes6.dex */
public final class F8M extends AbstractC7629F7m {
    public final Object A00;
    public final String A01;

    public F8M(String str, Object obj) {
        C7384Etj.A0Y(str, 0);
        this.A01 = str;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F8M) {
                F8M f8m = (F8M) obj;
                if (!C7384Etj.areEqual(this.A01, f8m.A01) || !C7384Etj.areEqual(this.A00, f8m.A00)) {
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
        return C3cJ.A0L(this.A00, ", value=", C3cI.A0x("VariableUpdate(variableIdentifier=", this.A01));
    }
}
