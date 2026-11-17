package X;

import android.graphics.Color;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
public final class EGe {
    public static final Comparator<C6568EGf> A05 = new C7572F4l(16);
    public final List<C6567EGc> A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final InterfaceC6571EGk[] A04;

    public static int A00(int i, int i2, int i3) {
        int i4 = (1 << 8) - 1;
        return Color.rgb((i << 3) & i4, (i2 << 3) & i4, (i3 << 3) & i4);
    }

    public static void A01(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EGe(int[] r14, X.InterfaceC6571EGk[] r15) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGe.<init>(int[], X.EGk[]):void");
    }

    private boolean A02(float[] fArr) {
        int length;
        InterfaceC6571EGk[] interfaceC6571EGkArr = this.A04;
        if (interfaceC6571EGkArr == null || (length = interfaceC6571EGkArr.length) <= 0) {
            return false;
        }
        int i = 0;
        do {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    i++;
                }
            }
            return true;
        } while (i < length);
        return false;
    }
}
