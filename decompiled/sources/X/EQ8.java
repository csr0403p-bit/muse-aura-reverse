package X;

/* loaded from: classes5.dex */
public final class EQ8 {
    public final String A00;
    public final long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EQ8) {
                EQ8 eq8 = (EQ8) obj;
                if (!this.A00.equals(eq8.A00) || !this.A02.equals(eq8.A02) || this.A01 != eq8.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A01, AnonymousClass005.A0I(this.A02, AnonymousClass001.A0G(this.A00)));
    }

    public final String toString() {
        return FGI.A0J("LinkedCredentials(expirationTs=", this.A01, ")");
    }

    public EQ8(String str, String str2, long j) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = j;
    }
}
