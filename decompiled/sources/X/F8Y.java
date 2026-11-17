package X;

/* loaded from: classes6.dex */
public final class F8Y extends FS5 {
    public final FBB A00;
    public final FDW A01;
    public final HsM A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof F8Y) {
                F8Y f8y = (F8Y) obj;
                if (f8y.A02 != this.A02 || f8y.A01 != this.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public F8Y(FBB fbb, FDW fdw, HsM hsM) {
        this.A01 = fdw;
        this.A00 = fbb;
        this.A02 = hsM;
    }
}
