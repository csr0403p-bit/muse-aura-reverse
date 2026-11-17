package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.instagram.common.bloks.lexer.ParsingException;
import java.util.List;

/* renamed from: X.FHr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7855FHr {
    public static final int[] A01 = {52, 46, 36, 44, 49, 42};
    public static final int[] A00 = {51, 45, 35, 43, 48, 41};

    public static FI4 A06(FDW fdw, boolean z) {
        float fA00;
        String[] strArr = new String[6];
        int i = 0;
        do {
            strArr[i] = fdw.A0F(A01[i]);
            i++;
        } while (i < 6);
        int i2 = 0;
        while (true) {
            fA00 = 0.0f;
            if (i2 >= 4) {
                break;
            }
            if (FI4.A01(strArr, i2, z) == null) {
                fA00 = HjB.A00(fdw, 0.0f, 53);
                break;
            }
            i2++;
        }
        float[] fArr = new float[4];
        int i3 = 0;
        do {
            String str = (String) FI4.A01(strArr, i3, z);
            float fA01 = fA00;
            if (str != null) {
                fA01 = HiY.A01(str);
            }
            fArr[i3] = fA01;
            i3++;
        } while (i3 < 4);
        return new FI4(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static float[] A08(List list) {
        if (list != null && list.size() != 0) {
            float[] fArr = new float[list.size()];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof String) {
                    String strA0n = C60Q.A0n(list, i);
                    float fA01 = 0.0f;
                    if (strA0n != null) {
                        fA01 = HiY.A01(strA0n);
                    }
                    fArr[i] = fA01;
                }
            }
            return fArr;
        }
        return null;
    }

    public static float A00(FDW fdw) {
        FDW fdwA0C = fdw.A0C(77);
        return fdwA0C == null ? HjB.A00(fdw, 0.0f, 63) : HjB.A00(fdwA0C, 0.0f, 40);
    }

    public static int A01(FBB fbb, FDW fdw) {
        FDW fdwA0C = fdw.A0C(38);
        if (fdwA0C != null) {
            return HlW.A00(fdwA0C, fbb, 0);
        }
        try {
            return HiY.A08(fdw.A0F(36), -16777216);
        } catch (ParsingException e) {
            FFI.A01(fbb, "Error parsing border color in BoxDecoration", e);
            return 0;
        }
    }

    public static int A02(FBB fbb, FDW fdw) {
        FDW fdwA0C = fdw.A0C(45);
        String strA0F = fdw.A0F(44);
        int iA04 = strA0F != null ? HiY.A04(strA0F) : 0;
        if (fdwA0C == null) {
            return iA04;
        }
        try {
            if (HiY.A08(fdwA0C.A0F(35), 0) == 0) {
                if (HiY.A08(AbstractC7608F5v.A0p(fdwA0C), 0) == 0) {
                    return iA04;
                }
            }
        } catch (ParsingException unused) {
            FFI.A01(null, "Error parsing themed color", null);
        }
        return HlW.A00(fdwA0C, fbb, 0);
    }

    public static FKM A03(FBB fbb, FDW fdw, int i) {
        FKM fkm = new FKM();
        FE6 fe6A04 = A04(fbb, fdw, FKI.A00(fbb.A00));
        float fA00 = HjB.A00(fdw, 0.0f, 46);
        if (fe6A04 != null) {
            int iA00 = Hnb.A00(fdw.A0H(56), 0);
            float[] fArrA07 = A07(fdw);
            float fA002 = A00(fdw);
            fkm.A05 = null;
            fkm.A08.setColor(i);
            Paint paint = fkm.A07;
            paint.setColor(0);
            paint.setStrokeWidth(0.0f);
            paint.setPathEffect(null);
            fkm.A02 = fA00;
            fkm.A03 = iA00;
            float f = 0.0f / 2.0f;
            fkm.A00 = f;
            fkm.A01 = fA00 - f;
            fkm.onBoundsChange(fkm.getBounds());
            fkm.invalidateSelf();
            FKP fkp = fkm.A04;
            if (fkp == null) {
                fkp = new FKP();
                fkm.A04 = fkp;
            }
            fkp.A05(fe6A04, fArrA07, fA002);
            fkm.A05 = fkp;
        } else {
            int iA002 = Hnb.A00(fdw.A0H(56), 0);
            int iA01 = A01(fbb, fdw);
            float fA003 = HjB.A00(fdw, 0.0f, 40);
            float[] fArrA08 = A08(fdw.A0H(62));
            float fA004 = HjB.A00(fdw, 0.0f, 63);
            DashPathEffect dashPathEffect = null;
            fkm.A05 = null;
            fkm.A08.setColor(i);
            Paint paint2 = fkm.A07;
            paint2.setColor(iA01);
            paint2.setStrokeWidth(fA003);
            if (fA003 > 0.0f && fArrA08 != null) {
                dashPathEffect = new DashPathEffect(fArrA08, fA004);
            }
            paint2.setPathEffect(dashPathEffect);
            fkm.A02 = fA00;
            fkm.A03 = iA002;
            float f2 = fA003 / 2.0f;
            fkm.A00 = f2;
            fkm.A01 = fA00 - f2;
            fkm.onBoundsChange(fkm.getBounds());
        }
        fkm.invalidateSelf();
        return fkm;
    }

    public static FE6 A04(FBB fbb, FDW fdw, boolean z) {
        int iA00;
        FDW fdwA0C = fdw.A0C(77);
        if (fdwA0C == null) {
            return null;
        }
        FI4 fi4A06 = A06(fdwA0C, z);
        FDW[] fdwArr = new FDW[6];
        int i = 0;
        do {
            fdwArr[i] = fdwA0C.A0C(A00[i]);
            i++;
        } while (i < 6);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (FI4.A01(fdwArr, i2, z) == null) {
                FDW fdwA0C2 = fdwA0C.A0C(50);
                iA00 = fdwA0C2 != null ? HlW.A00(fdwA0C2, fbb, 0) : -16777216;
            } else {
                i2++;
            }
        }
        int[] iArr = new int[4];
        int i3 = 0;
        do {
            FDW fdw2 = (FDW) FI4.A01(fdwArr, i3, z);
            iArr[i3] = fdw2 == null ? iA00 : HlW.A00(fdw2, fbb, 0);
            i3++;
        } while (i3 < 4);
        return new FE6(fi4A06, iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static float[] A07(FDW fdw) {
        FDW fdwA0C = fdw.A0C(77);
        return A08(fdwA0C == null ? fdw.A0H(62) : fdwA0C.A0H(38));
    }

    public static FE6 A05(FBB fbb, FDW fdw, boolean z) {
        FE6 fe6A04 = A04(fbb, fdw, z);
        if (fe6A04 != null) {
            return fe6A04;
        }
        float fA00 = HjB.A00(fdw, 0.0f, 40);
        int iA01 = A01(fbb, fdw);
        return new FE6(new FI4(fA00, fA00, fA00, fA00), iA01, iA01, iA01, iA01);
    }
}
