package X;

import android.graphics.Rect;

/* loaded from: classes6.dex */
public final class FET {
    public final int A00;
    public final int A01;
    public final FEM A02;
    public final FGW A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FET) {
                FET fet = (FET) obj;
                if (!this.A03.equals(fet.A03) || !this.A02.equals(fet.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0E(this.A03));
    }

    public final String toString() {
        return C3cJ.A0L(this.A02, ", continuationValues=", C3cG.A0f(this.A03, "MountInput(renderTree="));
    }

    public FET(FEM fem, FGW fgw) {
        this.A03 = fgw;
        this.A02 = fem;
        Rect rect = fgw.A02.A03;
        this.A01 = rect.width();
        this.A00 = rect.height();
    }
}
