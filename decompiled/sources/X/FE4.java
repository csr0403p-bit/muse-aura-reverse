package X;

import android.graphics.Color;
import android.util.SparseArray;
import com.instagram.common.bloks.lexer.ParsingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FE4 {
    public static final FE4 A00 = new FE4();
    public static final List<Integer> A04 = Arrays.asList(52, 46, 36, 44);
    public static final List<Integer> A03 = Arrays.asList(51, 45, 35, 43);
    public static final List<Integer> A02 = Arrays.asList(46, 40, 48, 59, 58, 57);
    public static final List<Integer> A01 = AbstractC7607F5u.A16(35, 49);
    public static final List<Integer> A06 = Arrays.asList(45, 38, 52, 69, 68);
    public static final List<Integer> A05 = Arrays.asList(44, 36, 50);

    public static final FDW A02(FE4 fe4, FBB fbb, FDW fdw, FDW fdw2, float f, int i) {
        FDW fdwA0C = fdw.A0C(i);
        FDW fdwA0C2 = fdw2.A0C(i);
        if (fdwA0C2 == null) {
            return null;
        }
        int i2 = fbb.A05 ? 35 : 36;
        String strA05 = A05(fe4, fdwA0C, fdwA0C2, f, i2);
        if (strA05 == null) {
            return null;
        }
        FCD fcd = new FCD(fdwA0C2);
        fcd.A00(i2, strA05);
        return fcd.A00;
    }

    public static final String A05(FE4 fe4, FDW fdw, FDW fdw2, float f, int i) {
        int iA08;
        String strA0F = fdw != null ? fdw.A0F(i) : null;
        String strA0F2 = fdw2.A0F(i);
        if (C7384Etj.areEqual(strA0F, strA0F2)) {
            return null;
        }
        try {
            iA08 = HiY.A08(strA0F, 0);
        } catch (ParsingException unused) {
            FFI.A03("Failed to parse color value: ", strA0F);
            iA08 = 0;
        }
        int iA082 = 0;
        try {
            iA082 = HiY.A08(strA0F2, 0);
        } catch (ParsingException unused2) {
            FFI.A03("Failed to parse color value: ", strA0F2);
        }
        return fe4.A04(f, iA08, iA082);
    }

    public static final String A06(FDW fdw, FDW fdw2, float f, float f2, int i) {
        float fA00 = HjB.A00(fdw, 0.0f, i);
        float fA002 = HjB.A00(fdw2, 0.0f, i);
        if (fA00 == fA002) {
            return null;
        }
        float fA01 = AbstractC7607F5u.A01(fA002, fA00, f) / f2;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(fA01);
        return AnonymousClass001.A0v("px", sbA0w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (X.C7384Etj.areEqual(r10.A0F(38), r4.A0F(38)) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FDW A01(X.FE4 r12, X.FBB r13, X.FDW r14, X.FDW r15, float r16, float r17, float r18, int r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FE4.A01(X.FE4, X.FBB, X.FDW, X.FDW, float, float, float, int):X.FDW");
    }

    public static final FDW A00(FE4 fe4, FBB fbb, FDW fdw, FDW fdw2, float f, float f2, float f3) {
        String str;
        String strA0F;
        FDW fdw3;
        int iA08;
        FDW fdwA0B = fdw2.A0B();
        float fMin = Math.min(Math.abs(f2), Math.abs(f3));
        Float fValueOf = Float.valueOf(f2 != 0.0f ? AbstractC7607F5u.A01(fdw2.A06(38, 0.0f), fdw.A06(38, 0.0f), f) / f2 : 0.0f);
        SparseArray<Object> sparseArray = fdwA0B.A06;
        sparseArray.put(38, fValueOf);
        sparseArray.put(40, Float.valueOf(f3 != 0.0f ? AbstractC7607F5u.A01(fdw2.A06(40, 0.0f), fdw.A06(40, 0.0f), f) / f3 : 0.0f));
        sparseArray.put(35, Float.valueOf(fMin != 0.0f ? AbstractC7607F5u.A01(fdw2.A06(35, 0.0f), fdw.A06(35, 0.0f), f) / fMin : 0.0f));
        sparseArray.put(41, Float.valueOf(fMin != 0.0f ? AbstractC7607F5u.A01(fdw2.A06(41, 0.0f), fdw.A06(41, 0.0f), f) / fMin : 0.0f));
        FDW fdwA0C = fdw.A0C(42);
        FDW fdwA0C2 = fdw2.A0C(42);
        if (fdwA0C == null && fdwA0C2 == null) {
            return fdwA0B;
        }
        int i = fbb.A05 ? 35 : 36;
        str = "#ff000000";
        if (fdwA0C == null || (strA0F = fdwA0C.A0F(i)) == null) {
            strA0F = "#ff000000";
        }
        if (fdwA0C2 != null) {
            String strA0F2 = fdwA0C2.A0F(i);
            str = strA0F2 != null ? strA0F2 : "#ff000000";
            fdw3 = fdwA0C2.A0B();
        } else {
            fdw3 = new FDW(13365);
        }
        try {
            iA08 = HiY.A08(strA0F, 0);
        } catch (ParsingException unused) {
            FFI.A03("Failed to parse color value: ", strA0F);
            iA08 = 0;
        }
        int iA082 = 0;
        try {
            iA082 = HiY.A08(str, 0);
        } catch (ParsingException unused2) {
            FFI.A03("Failed to parse color value: ", str);
        }
        AbstractC7607F5u.A1M(fdw3, fe4.A04(f, iA08, iA082), i);
        sparseArray.put(42, fdw3);
        return fdwA0B;
    }

    public static final FDW A03(FE4 fe4, FDW fdw) {
        FDW fdwA0B = fdw.A0B();
        Float fValueOf = Float.valueOf(0.0f);
        SparseArray<Object> sparseArray = fdwA0B.A06;
        sparseArray.put(38, fValueOf);
        sparseArray.put(40, fValueOf);
        sparseArray.put(35, fValueOf);
        sparseArray.put(41, fValueOf);
        FDW fdwA0C = fdw.A0C(42);
        FDW fdwA0B2 = fdwA0C != null ? fdwA0C.A0B() : new FDW(13365);
        Iterator it = AbstractC7607F5u.A16(36, 35).iterator();
        while (it.hasNext()) {
            int iA03 = C60Q.A03(it);
            String strA0F = fdwA0B2.A0F(iA03);
            if (strA0F == null) {
                strA0F = "#ff000000";
            }
            int iA08 = 0;
            try {
                iA08 = HiY.A08(strA0F, 0);
            } catch (ParsingException unused) {
                FFI.A03("Failed to parse color value: ", strA0F);
            }
            int i = iA08 & 16777215;
            AbstractC7607F5u.A1M(fdwA0B2, fe4.A04(0.0f, i, i), iA03);
        }
        sparseArray.put(42, fdwA0B2);
        return fdwA0B;
    }

    private final String A04(float f, int i, int i2) {
        int[] iArrA07 = A07(i);
        int[] iArrA072 = A07(i2);
        ADq aDqA1C = AbstractC7607F5u.A1C(0, 3);
        ArrayList arrayListA0i = AnonymousClass003.A0i(aDqA1C);
        Iterator<Integer> it = aDqA1C.iterator();
        while (it.hasNext()) {
            int i3 = (int) (iArrA07[((BNt) it).A00()] + ((iArrA072[r0] - r2) * f));
            if (i3 < 0) {
                i3 = 0;
            } else if (i3 > 255) {
                i3 = 255;
            }
            C60Q.A1P(arrayListA0i, i3);
        }
        return String.format("#%02x%02x%02x%02x", Arrays.copyOf(new Object[]{arrayListA0i.get(0), arrayListA0i.get(1), arrayListA0i.get(2), arrayListA0i.get(3)}, 4));
    }

    public static final int[] A07(int i) {
        return new int[]{Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i)};
    }
}
