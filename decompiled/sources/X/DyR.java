package X;

/* loaded from: classes5.dex */
public final class DyR {
    public final C6154Dwx A00;
    public final C6202Dxm A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DyR dyR = (DyR) obj;
            if (!this.A01.equals(dyR.A01)) {
                return false;
            }
            C6154Dwx c6154Dwx = this.A00;
            C6154Dwx c6154Dwx2 = dyR.A00;
            if (c6154Dwx != null) {
                return c6154Dwx.equals(c6154Dwx2);
            }
            if (c6154Dwx2 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + C60R.A01(this.A00);
    }

    public DyR(C6154Dwx c6154Dwx, C6202Dxm c6202Dxm) {
        this.A01 = c6202Dxm;
        this.A00 = c6154Dwx;
    }
}
