package X;

/* loaded from: classes5.dex */
public final class DGz {
    public int A00;
    public final int A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;
    public final long[] A06;
    public final String[] A07;
    public final String[] A08;
    public final String[] A09;
    public final boolean[] A0A;

    public DGz(int i) {
        int i2 = i < 1 ? 1 : i;
        this.A01 = i2;
        if (i < 1) {
            CFK.A0H("OneFabricEventHandler", "BatchInfo received invalid range=%d, coerced to 1", BV5.A1Y(i));
        }
        this.A04 = new long[i2];
        this.A03 = new long[i2];
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = null;
        }
        this.A08 = strArr;
        int i4 = this.A01;
        this.A06 = new long[i4];
        this.A05 = new long[i4];
        String[] strArr2 = new String[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            strArr2[i5] = null;
        }
        this.A07 = strArr2;
        String[] strArr3 = new String[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            strArr3[i6] = null;
        }
        this.A09 = strArr3;
        this.A02 = new int[i4];
        this.A0A = new boolean[i4];
    }
}
