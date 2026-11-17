package X;

/* loaded from: classes5.dex */
public final class DZW {
    public final int A00;
    public final String A01;

    public DZW(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DZW) {
                DZW dzw = (DZW) obj;
                if (!this.A01.equals(dzw.A01) || this.A00 != dzw.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + this.A00;
    }

    public final String toString() {
        return FGI.A0A(this.A00, "ReaderFragmentIdentity(buildConfigName=", this.A01, ", fragmentNameHash=", ")");
    }
}
