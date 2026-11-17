package X;

/* loaded from: classes6.dex */
public final class FIX extends FS5 {
    public final FBB A00;
    public final FDW A01;
    public final HsM A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof FIX) {
                FIX fix = (FIX) obj;
                if (fix.A02 != this.A02 || fix.A01.A07(53, 0) != this.A01.A07(53, 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public FIX(FBB fbb, FDW fdw, HsM hsM) {
        this.A01 = fdw;
        this.A02 = hsM;
        this.A00 = fbb;
    }
}
