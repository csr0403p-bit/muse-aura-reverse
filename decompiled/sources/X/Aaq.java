package X;

/* loaded from: classes4.dex */
public final class Aaq {
    public final C1120Aal[][] A00;

    public Aaq(float[] fArr, int[] iArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        C1120Aal[][] c1120AalArr = new C1120Aal[length][];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < length) {
            int i5 = iArr[i2];
            if (i5 == 0) {
                i = 3;
            } else if (i5 == 1) {
                i3 = 1;
                i = 1;
            } else if (i5 == 2) {
                i3 = 2;
                i = 2;
            } else if (i5 == 3) {
                i3 = i3 == 1 ? 2 : 1;
                i = i3;
            } else if (i5 != 4) {
                i = 5;
                if (i5 != 5) {
                    i = i4;
                }
            } else {
                i = 4;
            }
            float[] fArr3 = fArr2[i2];
            int i6 = i2 + 1;
            float[] fArr4 = fArr2[i6];
            float f = fArr[i2];
            float f2 = fArr[i6];
            int length2 = fArr3.length;
            int i7 = (length2 % 2) + (length2 / 2);
            C1120Aal[] c1120AalArr2 = new C1120Aal[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 2;
                int i10 = i9 + 1;
                c1120AalArr2[i8] = new C1120Aal(f, f2, fArr3[i9], fArr3[i10], fArr4[i9], fArr4[i10], i);
            }
            c1120AalArr[i2] = c1120AalArr2;
            i2 = i6;
            i4 = i;
        }
        this.A00 = c1120AalArr;
    }
}
