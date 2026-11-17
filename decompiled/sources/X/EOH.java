package X;

import java.util.Set;

/* loaded from: classes5.dex */
public final class EOH {
    public final String A00;
    public final Set<EP1> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public EOH(Set<? extends EP1> set, String str) {
        C7384Etj.A0Y(set, 0);
        this.A01 = set;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EOH) {
                EOH eoh = (EOH) obj;
                if (!this.A01.equals(eoh.A01) || !C7384Etj.areEqual(this.A00, eoh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0G(this.A00);
    }

    public final String toString() {
        return C3cJ.A0N(", targetUserID=", this.A00, C3cG.A0f(this.A01, "FXAccountQuery(credentialSources="));
    }
}
