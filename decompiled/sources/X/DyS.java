package X;

/* loaded from: classes5.dex */
public final class DyS {
    public final C6202Dxm A00;
    public final Exception A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DyS dyS = (DyS) obj;
            if (this.A00.equals(dyS.A00)) {
                return this.A01.equals(dyS.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public DyS(C6202Dxm c6202Dxm, Exception exc) {
        this.A00 = c6202Dxm;
        this.A01 = exc;
    }
}
