package X;

/* loaded from: classes5.dex */
public final class BeQ {
    public final int A00;
    public final boolean A01;
    public final long[] A02;

    public final String A00() {
        int i;
        int i2;
        StringBuilder sbA0x = C60O.A0x("[");
        if (!this.A01) {
            i2 = this.A00;
            if (i2 != 0) {
                i = 0;
            }
            return BV5.A0o(sbA0x);
        }
        i = this.A00;
        i2 = i;
        while (true) {
            long[] jArr = this.A02;
            sbA0x.append(jArr[i]);
            i++;
            if (i >= jArr.length) {
                i = 0;
            }
            if (i == i2) {
                break;
            }
            sbA0x.append(',');
        }
        return BV5.A0o(sbA0x);
    }

    public BeQ(long[] jArr, int i, boolean z) {
        this.A02 = jArr;
        this.A00 = i;
        this.A01 = z;
    }
}
