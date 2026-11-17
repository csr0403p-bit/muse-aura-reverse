package X;

import android.graphics.Matrix;
import java.util.Arrays;

/* renamed from: X.Fho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8636Fho {
    public static final int A00(C7911FKj c7911FKj) {
        C7384Etj.A0Y(c7911FKj, 0);
        float[] fArr = c7911FKj.A00;
        if (fArr != null) {
            int[] iArr = c7911FKj.A01;
            int iMin = Math.min(iArr.length, fArr.length);
            do {
                iMin--;
                if (-1 < iMin) {
                }
            } while (Math.abs(fArr[iMin]) > Float.MAX_VALUE);
            return iArr[iMin];
        }
        int[] iArr2 = c7911FKj.A01;
        C7384Etj.A0Y(iArr2, 0);
        int length = iArr2.length;
        if (length != 0) {
            return iArr2[length - 1];
        }
        return 0;
    }

    public static final C8638Fhq A01(C7911FKj c7911FKj) {
        C7384Etj.A0Y(c7911FKj, 0);
        float[] fArr = c7911FKj.A00;
        int[] iArr = c7911FKj.A01;
        if (fArr == null) {
            if (iArr.length >= 2) {
                return new C8638Fhq(null, iArr);
            }
            return null;
        }
        int length = iArr.length;
        int length2 = fArr.length;
        if (length == length2 && length >= 2) {
            float f = 0.0f;
            int i = 0;
            while (i < length2) {
                float f2 = fArr[i];
                if (Math.abs(f2) <= Float.MAX_VALUE && f2 >= f && f2 <= 1.0f) {
                    i++;
                    f = f2;
                }
            }
            return new C8638Fhq(fArr, iArr);
        }
        int iMin = Math.min(length, length2);
        int[] iArr2 = new int[iMin];
        float[] fArr2 = new float[iMin];
        int i2 = 0;
        float fA03 = 0.0f;
        for (int i3 = 0; i3 < iMin; i3++) {
            float f3 = fArr[i3];
            if (Math.abs(f3) <= Float.MAX_VALUE) {
                fA03 = ATD.A03(f3, fA03, 1.0f);
                iArr2[i2] = iArr[i3];
                fArr2[i2] = fA03;
                i2++;
            }
        }
        if (i2 < 2) {
            return null;
        }
        int[] iArrA1a = AbstractC7607F5u.A1a(iArr2, i2);
        float[] fArrCopyOf = Arrays.copyOf(fArr2, i2);
        C7384Etj.A0U(fArrCopyOf);
        return new C8638Fhq(fArrCopyOf, iArrA1a);
    }

    public static final boolean A04(float[] fArr, float f) {
        float fMax = 0.0f;
        for (float f2 : fArr) {
            fMax = Math.max(fMax, Math.abs(f2));
        }
        return fMax / f <= 9.9999998E17f;
    }

    public static final boolean A03(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        int i = 0;
        while (Math.abs(fArr[i]) <= Float.MAX_VALUE) {
            i++;
            if (i >= 9) {
                return matrix.invert(BV4.A08());
            }
        }
        return false;
    }

    public static final boolean A02(long j) {
        return Math.abs(AnonymousClass003.A03(j)) <= Float.MAX_VALUE && Math.abs(AnonymousClass004.A00(j)) <= Float.MAX_VALUE;
    }
}
