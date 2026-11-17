package X;

/* renamed from: X.EWp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6710EWp {
    public final String A00;
    public final String A01;

    public C6710EWp() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6710EWp) {
                C6710EWp c6710EWp = (C6710EWp) obj;
                if (!C7384Etj.areEqual(this.A01, c6710EWp.A01) || !C7384Etj.areEqual(this.A00, c6710EWp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0G(this.A01) * 31) + AnonymousClass005.A0H(this.A00);
    }

    public final String toString() {
        return FGI.A0h("PTTPayloadResponse(response=", this.A01, ", error=", this.A00, ")");
    }

    public C6710EWp(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
