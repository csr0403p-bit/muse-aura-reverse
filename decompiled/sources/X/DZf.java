package X;

/* loaded from: classes5.dex */
public final class DZf {
    public final DZl A00;
    public final F0C A01 = new C5322DgG(null, new EWq(this, 41));
    public final F0C A02 = C5322DgG.A00(this, 42);
    public final F0C A03 = C5322DgG.A00(this, 43);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DZf) {
                DZf dZf = (DZf) obj;
                if (!C7384Etj.areEqual(this.A01.getValue(), dZf.A01.getValue()) || !C7384Etj.areEqual(this.A02.getValue(), dZf.A02.getValue())) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0F(this.A03.getValue());
    }

    public DZf(DZl dZl) {
        this.A00 = dZl;
    }
}
