package X;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class A5Y extends C9jF {
    public String A00;
    public int A01;
    public final Bundle A02;
    public final C9jC A03;

    public A5Y(Bundle bundle, C9jC c9jC) {
        C7384Etj.A0Y(c9jC, 1);
        this.A02 = bundle;
        this.A03 = c9jC;
        this.A00 = "";
    }

    @Override // X.C9j4
    public final int A8N(C9iZ c9iZ) {
        int size;
        String strAF5;
        C7384Etj.A0Y(c9iZ, 0);
        if (C7384Etj.areEqual(c9iZ.AGs(), C9tD.A00) || C7384Etj.areEqual(c9iZ.AGs(), C9tE.A00)) {
            Bundle bundle = this.A02;
            C7384Etj.A0Y(bundle, 0);
            size = bundle.size();
        } else {
            size = c9iZ.AF6();
        }
        while (true) {
            int i = this.A01;
            if (i >= size) {
                return -1;
            }
            strAF5 = c9iZ.AF5(i);
            if (!c9iZ.AOL(this.A01)) {
                break;
            }
            Bundle bundle2 = this.A02;
            C7384Etj.A0Y(bundle2, 0);
            C7384Etj.A0Y(strAF5, 1);
            if (bundle2.containsKey(strAF5)) {
                break;
            }
            this.A01++;
        }
        this.A00 = strAF5;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        return i2;
    }

    @Override // X.C9j4
    public final C07959pz AKT() {
        return this.A03.A00;
    }
}
