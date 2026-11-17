package X;

/* loaded from: classes5.dex */
public abstract class DIB {
    public long A00;
    public long A01;
    public final DI6[] A02;
    public final DK2 A03;
    public final DK2 A04;
    public final InterfaceC4945DGj A05;

    public abstract int[] A05(DI6 di6);

    public DIB(InterfaceC4945DGj interfaceC4945DGj, DI6[] di6Arr) {
        int length;
        this.A02 = di6Arr;
        this.A05 = interfaceC4945DGj;
        if (di6Arr == null || (length = di6Arr.length) == 0) {
            this.A04 = null;
            this.A03 = null;
            this.A00 = 0L;
            this.A01 = 0L;
            return;
        }
        if (length > 64) {
            throw C8j3.A18("We support up to 64 listeners");
        }
        DJS djs = new DJS(30);
        this.A04 = djs;
        DJS djs2 = new DJS(4);
        this.A03 = djs2;
        long j = 1;
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        do {
            int[] iArrA05 = A05(di6Arr[i]);
            if (iArrA05 != null) {
                for (int i2 : iArrA05) {
                    if (i2 == -2) {
                        j3 |= j;
                    } else if (i2 != -1) {
                        djs.put(i2, djs.get(i2, 0L) | j);
                    } else {
                        j2 |= j;
                        j3 |= j;
                    }
                }
            }
            i++;
            j <<= 1;
        } while (i < length);
        this.A00 = j2;
        this.A01 = j3;
        long j4 = 1;
        int i3 = 0;
        do {
            int iA04 = A04(di6Arr[i3]);
            if (iA04 != 0) {
                djs2.put(iA04, djs2.get(iA04, 0L) | j4);
            }
            i3++;
            j4 <<= 1;
        } while (i3 < length);
    }

    public final long A02(int i) {
        DK2 dk2 = this.A04;
        if (dk2 == null || this.A02 == null) {
            return 0L;
        }
        return dk2.get(i, 0L) | this.A01;
    }

    public final long A03(int i, int i2) {
        DK2 dk2;
        DK2 dk22 = this.A04;
        if (dk22 == null || this.A02 == null || (dk2 = this.A03) == null || (i2 & 32) == 32) {
            return 0L;
        }
        return (i2 & 128) == 128 ? dk2.get(i2 & 64, 0L) & dk22.get(i, 0L) : dk2.get(i2, 0L) | this.A00 | dk22.get(i, 0L);
    }

    public int A04(DI6 di6) {
        return 0;
    }
}
