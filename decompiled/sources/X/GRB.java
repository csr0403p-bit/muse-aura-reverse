package X;

/* loaded from: classes6.dex */
public final class GRB extends C06G {
    public final long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GRB) {
                GRB grb = (GRB) obj;
                if (!C7384Etj.areEqual(this.A01, grb.A01) || this.A00 != grb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public GRB(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }
}
