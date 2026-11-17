package X;

import android.os.Build;

/* loaded from: classes6.dex */
public final class Hta {
    public static final Hta A00 = new Hta();

    /* JADX WARN: Incorrect types in method signature: (LX/FDr<LX/FBB;>;LX/FDW;LX/FGT<*>;II)LX/FGe; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC7823FGe A01(C7764FDr c7764FDr, FGT fgt, FDW fdw, int i, int i2) {
        C7384Etj.A0Y(fgt, 2);
        FDW fdwA0Y = AbstractC7608F5v.A0Y(fdw);
        if (fdwA0Y == null) {
            return new Hp8(fgt, null, 0, 0);
        }
        long jA00 = C7827FGi.A00(i, i2);
        InterfaceC7823FGe interfaceC7823FGeA5j = fdwA0Y.A5j(c7764FDr, AbstractC7826FGh.A01(jA00), AbstractC7826FGh.A00(jA00));
        FBB fbb = (FBB) c7764FDr.A04;
        return new FJC(interfaceC7823FGeA5j, fgt, (fbb == null || Build.VERSION.SDK_INT < 33) ? null : A00.A00(fbb, fdw));
    }

    private final Hz4 A00(FBB fbb, FDW fdw) {
        C5220Ddc c5220Ddc;
        String strA0F = fdw.A0F(38);
        if (strA0F == null || strA0F.length() == 0) {
            return null;
        }
        int iA07 = fdw.A07(41, 1);
        if (iA07 < 1) {
            iA07 = 1;
        }
        FDW fdwA0C = fdw.A0C(46);
        if (fdwA0C == null) {
            c5220Ddc = C5220Ddc.A04;
        } else {
            Integer numA02 = A02(fdwA0C, 36);
            int iIntValue = (numA02 == null && (numA02 = A02(fdwA0C, 42)) == null) ? 0 : numA02.intValue();
            Integer numA022 = A02(fdwA0C, 40);
            int iIntValue2 = numA022 != null ? numA022.intValue() : 0;
            Integer numA023 = A02(fdwA0C, 38);
            int iIntValue3 = (numA023 == null && (numA023 = A02(fdwA0C, 41)) == null) ? 0 : numA023.intValue();
            Integer numA024 = A02(fdwA0C, 35);
            c5220Ddc = new C5220Ddc(iIntValue, iIntValue2, iIntValue3, numA024 != null ? numA024.intValue() : 0);
        }
        int iA072 = fdw.A07(44, 0);
        if (iA072 < 0) {
            iA072 = 0;
        }
        C5192Dd3 c5192Dd3 = C5192Dd3.A00;
        String strA03 = C5192Dd3.A09.A03(C5192Dd3.A08.A03(strA0F, ""), "");
        return new Hz4(new C5219Ddb(c5220Ddc, iA07, iA072, C5192Dd3.A0A.A07(strA03), C5192Dd3.A07.A07(strA03), C5192Dd3.A06.A07(strA03)), c5192Dd3.A00(fbb, strA0F, iA07));
    }

    public static final Integer A02(FDW fdw, int i) {
        Float fA02 = HjB.A02(fdw, i);
        if (fA02 == null) {
            return null;
        }
        int iA01 = Ab3.A01(fA02.floatValue());
        if (iA01 < 0) {
            iA01 = 0;
        }
        return Integer.valueOf(iA01);
    }
}
