package X;

import java.util.Arrays;

/* renamed from: X.9iP, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9iP {
    public static final int A00(C9iZ c9iZ, C9iZ[] c9iZArr) {
        C7384Etj.A0Y(c9iZArr, 1);
        int iHashCode = (c9iZ.AKP().hashCode() * 31) + Arrays.hashCode(c9iZArr);
        int iAF6 = c9iZ.AF6();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int i2 = iAF6;
            if (iAF6 <= 0) {
                break;
            }
            int iHashCode3 = 0;
            iAF6--;
            int i3 = i * 31;
            String strAKP = c9iZ.AF3(c9iZ.AF6() - i2).AKP();
            if (strAKP != null) {
                iHashCode3 = strAKP.hashCode();
            }
            i = i3 + iHashCode3;
        }
        int iAF62 = c9iZ.AF6();
        while (true) {
            int i4 = iAF62;
            if (iAF62 <= 0) {
                return (((iHashCode * 31) + i) * 31) + iHashCode2;
            }
            iAF62--;
            int i5 = iHashCode2 * 31;
            BL8 bl8AGs = c9iZ.AF3(c9iZ.AF6() - i4).AGs();
            iHashCode2 = i5 + (bl8AGs != null ? bl8AGs.hashCode() : 0);
        }
    }

    public static final String A01(C9iZ c9iZ) {
        return AbstractC0878AGe.A0L(", ", FGI.A0E(c9iZ.AKP(), '('), ")", ATD.A0C(0, c9iZ.AF6()), new C2291BSr(c9iZ, 1));
    }
}
