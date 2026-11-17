package X;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes6.dex */
public class FRa {
    public final Object A00;

    public final List<C2197BAc> A02(String str, int i) {
        if (this instanceof FRY) {
            return ((FRY) this).A00.A02(str, i);
        }
        return null;
    }

    public C2197BAc A03(int i) {
        if (this instanceof FRY) {
            return ((FRY) this).A00.A03(i);
        }
        return null;
    }

    public C2197BAc A04(int i) {
        if (!(this instanceof FRY)) {
            return null;
        }
        FRY fry = (FRY) this;
        FRT frt = fry.A01;
        int i2 = frt.mAccessibilityFocusedVirtualViewId;
        if (i != 2 || i2 == Integer.MIN_VALUE || FRT.A06(frt, i2)) {
            return fry.A00.A04(i);
        }
        return null;
    }

    public void A05(Bundle bundle, C2197BAc c2197BAc, String str, int i) {
        if (this instanceof FRY) {
            ((FRY) this).A00.A05(bundle, c2197BAc, str, i);
        }
    }

    public boolean A06(int i, int i2, Bundle bundle) {
        if (!(this instanceof FRY)) {
            return false;
        }
        FRY fry = (FRY) this;
        if (i2 != 64 || i == -1 || FRT.A06(fry.A01, i)) {
            return fry.A00.A06(i, i2, bundle);
        }
        return false;
    }

    public FRa() {
        this.A00 = new FRZ(this);
    }

    public FRa(Object obj) {
        this.A00 = obj;
    }
}
