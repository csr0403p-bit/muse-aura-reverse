package X;

/* loaded from: classes4.dex */
public final class BDr {
    public int A00;
    public int A01;
    public int[] A02;
    public long[] A04 = new long[16];
    public int[] A03 = new int[16];

    public static final void A00(BDr bDr, int i, int i2) {
        long[] jArr = bDr.A04;
        int[] iArr = bDr.A03;
        int[] iArr2 = bDr.A02;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public BDr() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.A02 = iArr;
    }
}
