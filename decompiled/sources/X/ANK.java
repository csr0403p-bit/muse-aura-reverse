package X;

/* loaded from: classes4.dex */
public final class ANK extends AMZ {
    public final long A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ANK) {
                ANK ank = (ANK) obj;
                if (!C7384Etj.areEqual(this.A01, ank.A01) || this.A00 != ank.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PredictiveBackHandlerInfo(owner=");
        sbA0x.append(this.A01);
        sbA0x.append(", compositeKey=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public ANK(Object obj, long j) {
        this.A01 = obj;
        this.A00 = j;
    }
}
