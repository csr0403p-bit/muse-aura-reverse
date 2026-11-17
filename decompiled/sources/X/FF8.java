package X;

import com.facebook.aura.widgets.WidgetComponentsKt;

/* loaded from: classes6.dex */
public abstract class FF8 {
    public static final int A00(FFL<?> ffl, int i, int i2) {
        FDW fdwA0C;
        int i3;
        String strA0q;
        C7782FEm c7782FEmA01;
        FDW fdw = null;
        if (ffl != null && (c7782FEmA01 = FFL.A01(ffl, i)) != null) {
            fdw = c7782FEmA01.A01;
        }
        if (fdw != null && (fdwA0C = fdw.A0C(132)) != null) {
            int i4 = fdwA0C.A05;
            if (i4 != 24201) {
                i3 = i4 == 13366 ? 54 : 62;
            }
            FDW fdwA0C2 = fdwA0C.A0C(i3);
            if (fdwA0C2 != null && (strA0q = AbstractC7608F5v.A0q(fdwA0C2)) != null) {
                return FF3.A02(strA0q, i2);
            }
        }
        return 0;
    }

    public static final Integer A01(FDW fdw) {
        int i;
        FDW fdwA0C = fdw.A0C(132);
        if (fdwA0C == null) {
            return null;
        }
        int i2 = fdwA0C.A05;
        if (i2 == 24201) {
            i = 62;
        } else {
            if (i2 != 13366) {
                return null;
            }
            i = 54;
        }
        FDW fdwA0C2 = fdwA0C.A0C(i);
        if (fdwA0C2 == null || !fdwA0C2.A0L(35, false)) {
            return null;
        }
        String strA0p = AbstractC7608F5v.A0p(fdwA0C2);
        if (strA0p == null) {
            strA0p = WidgetComponentsKt.START_PATH;
        }
        if (strA0p.equals(WidgetComponentsKt.START_PATH)) {
            return C79.A00;
        }
        if (strA0p.equals("end")) {
            return C79.A01;
        }
        return null;
    }
}
