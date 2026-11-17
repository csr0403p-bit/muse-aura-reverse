package X;

import android.view.View;

/* renamed from: X.FEy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7792FEy {
    public final int A00;
    public final FKC A01;

    public final boolean A02() {
        FKC fkc = this.A01;
        return fkc != null && this.A00 == fkc.A00;
    }

    public C7792FEy(FKC fkc, int i) {
        this.A00 = i;
        this.A01 = fkc;
    }

    public final int A00() {
        int i;
        int i2;
        if (A02()) {
            i = this.A00;
            int i3 = FF1.A00;
            i2 = 1073741824;
        } else {
            FKC fkc = this.A01;
            if (fkc == null) {
                return FF1.A00;
            }
            i = fkc.A00;
            int i4 = FF1.A00;
            i2 = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }

    public final int A01(int i) {
        FKC fkcA01;
        FKC fkcA012 = FKC.A01(i);
        int i2 = this.A00;
        FKC fkcA013 = FKC.A01(i2);
        FKC fkc = this.A01;
        if (fkc == null) {
            fkcA01 = null;
        } else {
            int i3 = fkc.A00;
            if (AbstractC7532Ezu.A00(i2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i3) < 0) {
                i2 = i3;
            }
            fkcA01 = FKC.A01(i2);
        }
        return ((FKC) ATD.A09(fkcA012, fkcA013, fkcA01)).A00;
    }
}
