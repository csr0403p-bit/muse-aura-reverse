package X;

/* loaded from: classes4.dex */
public final class ANJ extends AMZ {
    public final long A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ANJ) {
                ANJ anj = (ANJ) obj;
                if (!C7384Etj.areEqual(this.A01, anj.A01) || this.A00 != anj.A00) {
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
        StringBuilder sbA0x = C60O.A0x("BackHandlerInfo(owner=");
        sbA0x.append(this.A01);
        sbA0x.append(", compositeKey=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public ANJ(Object obj, long j) {
        this.A01 = obj;
        this.A00 = j;
    }
}
