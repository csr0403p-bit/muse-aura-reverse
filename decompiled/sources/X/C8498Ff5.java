package X;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: X.Ff5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8498Ff5 {
    public final AbstractC8499Ff6 A00;

    public final C8497Ff4 A00() {
        C8509FfG c8509FfG = (C8509FfG) this.A00;
        C8345FcJ[] c8345FcJArr = ((AbstractC8499Ff6) c8509FfG).A00;
        if (c8345FcJArr != null) {
            C8345FcJ c8345FcJA04 = c8345FcJArr[0];
            C8345FcJ c8345FcJA042 = c8345FcJArr[1];
            if (c8345FcJA042 == null) {
                c8345FcJA042 = c8509FfG.A03.A00.A04(2);
            }
            if (c8345FcJA04 == null) {
                c8345FcJA04 = c8509FfG.A03.A00.A04(1);
            }
            C8345FcJ c8345FcJA02 = C8345FcJ.A02(c8345FcJA04, c8345FcJA042);
            WindowInsets.Builder builder = c8509FfG.A00;
            builder.setSystemWindowInsets(c8345FcJA02.A04());
            C8345FcJ c8345FcJ = ((AbstractC8499Ff6) c8509FfG).A00[4];
            if (c8345FcJ != null) {
                builder.setSystemGestureInsets(c8345FcJ.A04());
            }
            C8345FcJ c8345FcJ2 = ((AbstractC8499Ff6) c8509FfG).A00[5];
            if (c8345FcJ2 != null) {
                builder.setMandatorySystemGestureInsets(c8345FcJ2.A04());
            }
            C8345FcJ c8345FcJ3 = ((AbstractC8499Ff6) c8509FfG).A00[6];
            if (c8345FcJ3 != null) {
                builder.setTappableElementInsets(c8345FcJ3.A04());
            }
        }
        C8497Ff4 c8497Ff4A0j = AbstractC7607F5u.A0j(c8509FfG.A00.build());
        C8345FcJ[] c8345FcJArr2 = ((AbstractC8499Ff6) c8509FfG).A00;
        C8496Ff3 c8496Ff3 = c8497Ff4A0j.A00;
        c8496Ff3.A0M(c8345FcJArr2);
        c8496Ff3.A0K(null);
        c8496Ff3.A0N(c8509FfG.A01);
        c8496Ff3.A0O(c8509FfG.A02);
        return c8497Ff4A0j;
    }

    @Deprecated
    public final void A01(C8345FcJ c8345FcJ) {
        ((C8509FfG) this.A00).A00.setSystemWindowInsets(c8345FcJ.A04());
    }

    public C8498Ff5() {
        int i = Build.VERSION.SDK_INT;
        this.A00 = i >= 36 ? new C8514FfL() : i >= 35 ? new C8510FfH() : i >= 34 ? new C8506FfD() : i >= 31 ? new C8513FfK() : i >= 30 ? new C8507FfE() : new C8509FfG();
    }

    public C8498Ff5(C8497Ff4 c8497Ff4) {
        AbstractC8499Ff6 c8509FfG;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c8509FfG = new C8514FfL(c8497Ff4);
        } else if (i >= 35) {
            c8509FfG = new C8510FfH(c8497Ff4);
        } else if (i >= 34) {
            c8509FfG = new C8506FfD(c8497Ff4);
        } else if (i >= 31) {
            c8509FfG = new C8513FfK(c8497Ff4);
        } else if (i >= 30) {
            c8509FfG = new C8507FfE(c8497Ff4);
        } else {
            c8509FfG = new C8509FfG(c8497Ff4);
        }
        this.A00 = c8509FfG;
    }
}
