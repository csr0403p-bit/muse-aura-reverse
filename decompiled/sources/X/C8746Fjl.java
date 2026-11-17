package X;

import java.util.Arrays;

/* renamed from: X.Fjl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8746Fjl {
    public final float[] A00;
    public final int[] A01;

    public final C8746Fjl A00(float[] fArr) {
        int length;
        int iA02;
        int length2 = fArr.length;
        int[] iArr = new int[length2];
        for (int i = 0; i < length2; i++) {
            float f = fArr[i];
            float[] fArr2 = this.A00;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            if (iBinarySearch >= 0) {
                iA02 = this.A01[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                int[] iArr2 = this.A01;
                if (i2 == 0) {
                    length = 0;
                } else {
                    length = iArr2.length - 1;
                    if (i2 != length) {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iA02 = AbstractC8787FkR.A02((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
                iA02 = iArr2[length];
            }
            iArr[i] = iA02;
        }
        return new C8746Fjl(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C8746Fjl c8746Fjl = (C8746Fjl) obj;
                if (!Arrays.equals(this.A00, c8746Fjl.A00) || !Arrays.equals(this.A01, c8746Fjl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public C8746Fjl(float[] fArr, int[] iArr) {
        this.A00 = fArr;
        this.A01 = iArr;
    }
}
