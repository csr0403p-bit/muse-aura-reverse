package X;

import android.graphics.Rect;
import com.instagram.common.bloks.lexer.ParsingException;

/* loaded from: classes6.dex */
public abstract class FF3 {
    public static final Rect A00 = AbstractC7607F5u.A0X();

    public static final int A00(FDW fdw) {
        String strA0t = AbstractC7608F5v.A0t(fdw);
        if (strA0t == null || strA0t.equals("column")) {
            return 1;
        }
        if (strA0t.equals("row")) {
            return 0;
        }
        throw C60Q.A0U("Unknown direction ", strA0t);
    }

    public static final int A01(FDW fdw, int i, int i2, boolean z) {
        int iA0B;
        String strA0F;
        if (fdw == null || fdw.A05 != 24201) {
            return 0;
        }
        if (i == 1) {
            String strA0F2 = fdw.A0F(z ? 44 : 48);
            if (strA0F2 == null) {
                strA0F2 = AbstractC7608F5v.A0u(fdw);
            }
            strA0F = fdw.A0F(z ? 48 : 44);
            if (strA0F == null) {
                strA0F = AbstractC7608F5v.A0v(fdw);
            }
            iA0B = A02(strA0F2, i2);
        } else {
            iA0B = AbstractC7608F5v.A0B(fdw, 49, i2);
            strA0F = fdw.A0F(43);
        }
        return iA0B + A02(strA0F, i2);
    }

    public static final int A02(String str, int i) {
        if (str != null) {
            try {
                C10539Hqm c10539HqmA0A = HiY.A0A(str);
                int iIntValue = c10539HqmA0A.A01.intValue();
                if (iIntValue == 0) {
                    return (int) c10539HqmA0A.A00;
                }
                if (iIntValue == 1) {
                    return (int) ((c10539HqmA0A.A00 * i) / 100.0d);
                }
            } catch (ParsingException unused) {
                FFI.A03("Error parsing dimension value: ", str);
                return 0;
            }
        }
        return 0;
    }

    public static final Rect A03(FDW fdw, int i, boolean z) {
        C7384Etj.A0Y(fdw, 1);
        FDW fdwA04 = A04(fdw);
        if (fdwA04 != null && fdwA04.A05 == 24201) {
            String strA0F = fdwA04.A0F(z ? 44 : 48);
            if (strA0F == null) {
                strA0F = AbstractC7608F5v.A0u(fdwA04);
            }
            String strA0F2 = fdwA04.A0F(z ? 48 : 44);
            if (strA0F2 == null) {
                strA0F2 = AbstractC7608F5v.A0v(fdwA04);
            }
            int iA02 = A02(strA0F, i);
            int iA0B = AbstractC7608F5v.A0B(fdwA04, 49, i);
            int iA022 = A02(strA0F2, i);
            int iA0B2 = AbstractC7608F5v.A0B(fdwA04, 43, i);
            if (iA02 != 0 || iA0B != 0 || iA022 != 0 || iA0B2 != 0) {
                return new Rect(iA02, iA0B, iA022, iA0B2);
            }
        }
        return A00;
    }

    public static final Float A05(FDW fdw) {
        float fA06 = fdw.A06(fdw.A05 == 24201 ? 35 : 43, Float.MIN_VALUE);
        if (fA06 == Float.MIN_VALUE || fA06 <= 0.0d) {
            return null;
        }
        return Float.valueOf(fA06);
    }

    public static final FDW A04(FDW fdw) {
        int i;
        FDW fdwA0C = fdw.A0C(132);
        if (fdwA0C == null || !((i = fdwA0C.A05) == 13366 || i == 24201)) {
            return null;
        }
        return fdwA0C;
    }
}
