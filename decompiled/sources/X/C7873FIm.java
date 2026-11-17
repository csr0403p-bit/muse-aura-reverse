package X;

/* renamed from: X.FIm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7873FIm {
    public final FKK A00;
    public final C7817FFy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7873FIm) {
                C7873FIm c7873FIm = (C7873FIm) obj;
                if (!this.A01.equals(c7873FIm.A01) || !this.A00.equals(c7873FIm.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", tooltipAttributes=", C3cG.A0f(this.A01, "TooltipInfo(tooltipPositionInfo="));
    }

    public C7873FIm(FKK fkk, C7817FFy c7817FFy) {
        this.A01 = c7817FFy;
        this.A00 = fkk;
    }
}
