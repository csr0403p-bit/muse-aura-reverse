package X;

/* loaded from: classes5.dex */
public final class E23 implements InterfaceC5509Djl {
    public long A00;
    public final C6316E0o A01;
    public final C6316E0o A02;

    public final long A00(long j) {
        C6316E0o c6316E0o = this.A02;
        if (c6316E0o.A00 == 0) {
            return -9223372036854775807L;
        }
        C6316E0o c6316E0o2 = this.A01;
        int i = c6316E0o2.A00 - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (c6316E0o2.A00(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 >= c6316E0o2.A00 || c6316E0o2.A00(i4) != j) {
            i4 = i;
            if (i == -1) {
                i4 = 0;
            }
        }
        return c6316E0o.A00(i4);
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        E29 e29;
        C6316E0o c6316E0o = this.A02;
        int i = c6316E0o.A00;
        if (i == 0) {
            e29 = E29.A02;
        } else {
            int i2 = i - 1;
            int i3 = 0;
            while (i3 <= i2) {
                int i4 = (i3 + i2) >>> 1;
                if (c6316E0o.A00(i4) < j) {
                    i3 = i4 + 1;
                } else {
                    i2 = i4 - 1;
                }
            }
            int i5 = i2 + 1;
            if (i5 >= c6316E0o.A00 || c6316E0o.A00(i5) != j) {
                i5 = i2;
                if (i2 == -1) {
                    i5 = 0;
                }
            }
            long jA00 = c6316E0o.A00(i5);
            C6316E0o c6316E0o2 = this.A01;
            e29 = new E29(jA00, c6316E0o2.A00(i5));
            if (e29.A01 != j && i5 != c6316E0o.A00 - 1) {
                int i6 = i5 + 1;
                return DkQ.A00(e29, c6316E0o.A00(i6), c6316E0o2.A00(i6));
            }
        }
        return new DkQ(e29, e29);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return AnonymousClass002.A1N(this.A02.A00);
    }

    public E23(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        C1G.A07(AnonymousClass002.A1Q(length, length2));
        if (length2 <= 0 || jArr2[0] <= 0) {
            C6316E0o c6316E0o = new C6316E0o();
            c6316E0o.A01 = new long[length2];
            this.A01 = c6316E0o;
            C6316E0o c6316E0o2 = new C6316E0o();
            c6316E0o2.A01 = new long[length2];
            this.A02 = c6316E0o2;
        } else {
            int i = length2 + 1;
            C6316E0o c6316E0o3 = new C6316E0o();
            c6316E0o3.A01 = new long[i];
            this.A01 = c6316E0o3;
            C6316E0o c6316E0o4 = new C6316E0o();
            c6316E0o4.A01 = new long[i];
            this.A02 = c6316E0o4;
            c6316E0o3.A01(0L);
            c6316E0o4.A01(0L);
        }
        this.A01.A02(jArr);
        this.A02.A02(jArr2);
        this.A00 = j;
    }
}
