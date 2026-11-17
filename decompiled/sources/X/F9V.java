package X;

/* loaded from: classes6.dex */
public final class F9V {
    public final F8M A00;
    public final F9U A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F9V) {
                F9V f9v = (F9V) obj;
                if (!C7384Etj.areEqual(this.A01, f9v.A01) || !this.A00.equals(f9v.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass006.A0D(this.A01) * 31);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", variableUpdate=", C3cG.A0f(this.A01, "BloksTreeUpdateOperation(treeModification="));
    }

    public F9V(F8M f8m, F9U f9u) {
        this.A01 = f9u;
        this.A00 = f8m;
    }
}
