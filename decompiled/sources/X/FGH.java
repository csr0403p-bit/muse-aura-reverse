package X;

/* loaded from: classes6.dex */
public final class FGH {
    public C0917AHt<FGS> A00;

    public final void A00() {
        C0917AHt<FGS> c0917AHt = this.A00;
        if (c0917AHt == null || c0917AHt.A01 == 0) {
            return;
        }
        Object[] objArr = c0917AHt.A04;
        long[] jArr = c0917AHt.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        ((FGS) C8j3.A11(objArr, i, i2)).A0A.requestLayout();
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
