package X;

/* loaded from: classes4.dex */
public final class AMV extends AMY {
    public final C2193B9y A00;
    public final int A01 = -1;

    public AMV(C2193B9y c2193B9y) {
        this.A00 = c2193B9y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AMV amv = (AMV) obj;
                if (this.A01 != amv.A01 || !C7384Etj.areEqual(this.A00, amv.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, this.A01 * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("InProgress(latestEvent=");
        sbA0x.append(this.A00);
        sbA0x.append(", direction=");
        return C8j5.A0X(sbA0x, this.A01);
    }
}
