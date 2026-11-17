package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Ao5 implements InterfaceC1502Ak9 {
    public final float[] A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof Ao5)) {
                Ao5 ao5 = (Ao5) obj;
                if (!Arrays.equals(this.A00, ao5.A00) || !Arrays.equals(this.A01, ao5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1502Ak9
    public final float A7F(float f) {
        return A00(this.A01, this.A00, f);
    }

    @Override // X.InterfaceC1502Ak9
    public final float A7H(float f) {
        return A00(this.A00, this.A01, f);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        String string = Arrays.toString(this.A00);
        C7384Etj.A0U(string);
        String string2 = Arrays.toString(this.A01);
        C7384Etj.A0U(string2);
        return FGI.A0e("FontScaleConverter{fromSpValues=", string, ", toDpValues=", string2, '}');
    }

    public Ao5(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw C60O.A0i("Array lengths must match and be nonzero");
        }
        this.A00 = fArr;
        this.A01 = fArr2;
    }

    public static final float A00(float[] fArr, float[] fArr2, float f) {
        float f2;
        float f3;
        float f4;
        float fA02;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fA02 = fArr2[iBinarySearch];
        } else {
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = 0.0f;
            if (i2 >= length) {
                float f6 = fArr[length];
                float f7 = fArr2[length];
                if (f6 != 0.0f) {
                    return f * (f7 / f6);
                }
                return 0.0f;
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f4 = fArr2[0];
                f3 = 0.0f;
            } else {
                f5 = fArr[i2];
                f2 = fArr[i];
                f3 = fArr2[i2];
                f4 = fArr2[i];
            }
            fA02 = C8j3.A02(f4, f3, Math.max(0.0f, Math.min(1.0f, f5 == f2 ? 0.0f : (fAbs - f5) / (f2 - f5))));
        }
        return fSignum * fA02;
    }
}
