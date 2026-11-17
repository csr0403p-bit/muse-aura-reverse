package X;

import java.util.Arrays;

/* renamed from: X.FTb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8095FTb implements FUY {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[PHI: r2
  0x0056: PHI (r2v11 int) = (r2v9 int), (r2v15 int) binds: [B:28:0x0051, B:18:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(androidx.recyclerview.widget.RecyclerView r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8095FTb.A00(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    @Override // X.FUY
    public final void A3o(int i, int i2) {
        if (i < 0) {
            throw C60O.A0i("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw C60O.A0i("Pixel distance must be non-negative");
        }
        int i3 = this.A00;
        int i4 = i3 * 2;
        int[] iArr = this.A03;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.A03 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.A03 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.A03;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.A00++;
    }
}
