package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class EOM {
    public final List<EOL> A00;
    public final List<ENw> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EOM) {
                EOM eom = (EOM) obj;
                if (!this.A01.equals(eom.A01) || !this.A00.equals(eom.A00)) {
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
        return C3cJ.A0L(this.A00, ", errors=", C3cG.A0f(this.A01, "FXFetchResult(items="));
    }

    public EOM(List<ENw> list, List<EOL> list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
