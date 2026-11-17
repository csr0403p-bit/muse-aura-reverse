package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ff3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8496Ff3 {
    public static final C8497Ff4 A01 = new C8498Ff5().A00().A00.A07().A00.A08().A00.A09();
    public final C8497Ff4 A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8496Ff3) {
                C8496Ff3 c8496Ff3 = (C8496Ff3) obj;
                if (A0P() != c8496Ff3.A0P() || A0B() != c8496Ff3.A0B() || !Ht0.A00(A0D(), c8496Ff3.A0D()) || !Ht0.A00(A03(), c8496Ff3.A03()) || !Ht0.A00(A06(), c8496Ff3.A06())) {
                }
            }
            return false;
        }
        return true;
    }

    public final C8345FcJ A03() {
        if (!(this instanceof C8511FfI)) {
            return C8345FcJ.A04;
        }
        C8511FfI c8511FfI = (C8511FfI) this;
        C8345FcJ c8345FcJ = c8511FfI.A00;
        if (c8345FcJ != null) {
            return c8345FcJ;
        }
        WindowInsets windowInsets = c8511FfI.A0A;
        C8345FcJ c8345FcJA00 = C8345FcJ.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        c8511FfI.A00 = c8345FcJA00;
        return c8345FcJA00;
    }

    public C8345FcJ A04(int i) {
        if (!(this instanceof C8495Ff2)) {
            return C8345FcJ.A04;
        }
        C8495Ff2 c8495Ff2 = (C8495Ff2) this;
        C8345FcJ c8345FcJA02 = C8345FcJ.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c8345FcJA02 = C8345FcJ.A02(c8345FcJA02, C8495Ff2.A00(c8495Ff2, i2, false));
            }
            i2 <<= 1;
        } while (i2 <= 512);
        return c8345FcJA02;
    }

    public C8345FcJ A05(int i) {
        if (!(this instanceof C8495Ff2)) {
            if ((i & 8) == 0) {
                return C8345FcJ.A04;
            }
            throw C60O.A0i("Unable to query the maximum insets for IME");
        }
        C8495Ff2 c8495Ff2 = (C8495Ff2) this;
        C8345FcJ c8345FcJA02 = C8345FcJ.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c8345FcJA02 = C8345FcJ.A02(c8345FcJA02, C8495Ff2.A00(c8495Ff2, i2, true));
            }
            i2 <<= 1;
        } while (i2 <= 512);
        return c8345FcJA02;
    }

    public C8500Ff7 A06() {
        return null;
    }

    public C8497Ff4 A07() {
        return this.A00;
    }

    public C8497Ff4 A08() {
        return this.A00;
    }

    public C8497Ff4 A09() {
        return this.A00;
    }

    public final C8497Ff4 A0A(int i, int i2, int i3, int i4) {
        if (!(this instanceof C8495Ff2)) {
            return A01;
        }
        C8495Ff2 c8495Ff2 = (C8495Ff2) this;
        if (c8495Ff2 instanceof C8503FfA) {
            return AbstractC7607F5u.A0j(c8495Ff2.A0A.inset(i, i2, i3, i4));
        }
        C8498Ff5 c8498Ff5 = new C8498Ff5(AbstractC7607F5u.A0j(c8495Ff2.A0A));
        c8498Ff5.A01(C8497Ff4.A00(c8495Ff2.A0D(), i, i2, i3, i4));
        ((C8509FfG) c8498Ff5.A00).A00.setStableInsets(C8497Ff4.A00(c8495Ff2.A03(), i, i2, i3, i4).A04());
        return c8498Ff5.A00();
    }

    public final boolean A0B() {
        if (this instanceof C8511FfI) {
            return ((C8495Ff2) this).A0A.isConsumed();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0C(int r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C8495Ff2
            if (r0 == 0) goto L34
            X.Ff2 r4 = (X.C8495Ff2) r4
            r3 = 1
            r2 = 1
        L8:
            r0 = r5 & r2
            if (r0 == 0) goto L1d
            r1 = 0
            if (r2 == r3) goto L24
            r0 = 2
            if (r2 == r0) goto L24
            r0 = 4
            if (r2 == r0) goto L32
            r0 = 8
            if (r2 == r0) goto L24
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L24
        L1d:
            int r2 = r2 << 1
            r0 = 512(0x200, float:7.175E-43)
            if (r2 > r0) goto L35
            goto L8
        L24:
            X.FcJ r1 = X.C8495Ff2.A00(r4, r2, r1)
            X.FcJ r0 = X.C8345FcJ.A04
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L1d
        L32:
            r3 = 0
            return r3
        L34:
            r3 = 1
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8496Ff3.A0C(int):boolean");
    }

    public C8345FcJ A0D() {
        return C8345FcJ.A04;
    }

    public List<Rect> A0E(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> A0F(int i) {
        return Collections.EMPTY_LIST;
    }

    public void A0G() {
    }

    public void A0H(int i) {
    }

    public void A0I(View view) {
    }

    public void A0J(View view) {
    }

    public void A0K(C7nE c7nE) {
    }

    public void A0L(C8497Ff4 c8497Ff4) {
    }

    public void A0M(C8345FcJ[] c8345FcJArr) {
    }

    public void A0N(Rect[][] rectArr) {
    }

    public void A0O(Rect[][] rectArr) {
    }

    public boolean A0P() {
        return false;
    }

    public C8496Ff3(C8497Ff4 c8497Ff4) {
        this.A00 = c8497Ff4;
    }

    public int hashCode() {
        return BV7.A0F(Boolean.valueOf(A0P()), Boolean.valueOf(A0B()), A0D(), A03(), A06());
    }
}
