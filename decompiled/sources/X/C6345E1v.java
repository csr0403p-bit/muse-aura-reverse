package X;

import java.util.List;

/* renamed from: X.E1v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6345E1v extends E06 {
    public int A00;
    public C6346E1w A02;
    public C6348E1y A03;
    public List<E0J> A04;
    public List<E0J> A05;
    public final int A06;
    public final C6346E1w[] A09;
    public final E1P A08 = BV6.A0X();
    public final C6340E1q A07 = new C6340E1q();
    public int A01 = -1;

    public static int A00(C6340E1q c6340E1q) {
        return C6346E1w.A00(c6340E1q.A08(2), c6340E1q.A08(2), c6340E1q.A08(2), c6340E1q.A08(2));
    }

    public static void A03(C6345E1v c6345E1v) {
        int i = 0;
        do {
            c6345E1v.A09[i].A02();
            i++;
        } while (i < 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:178:0x038d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x0390. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5 A[PHI: r1
  0x02a5: PHI (r1v25 int) = (r1v20 int), (r1v12 int), (r1v12 int), (r1v27 int) binds: [B:121:0x02a3, B:114:0x027f, B:99:0x0217, B:96:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C6345E1v r16) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6345E1v.A02(X.E1v):void");
    }

    public C6345E1v(int i, List<byte[]> list) {
        this.A06 = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && list.get(0).length == 1) {
            list.get(0);
        }
        this.A09 = new C6346E1w[8];
        int i2 = 0;
        while (true) {
            C6346E1w[] c6346E1wArr = this.A09;
            if (i2 >= 8) {
                this.A02 = c6346E1wArr[0];
                return;
            } else {
                c6346E1wArr[i2] = new C6346E1w();
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<X.E0J> A01() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6345E1v.A01():java.util.List");
    }

    @Override // X.E06, X.InterfaceC6223DyE
    public final void flush() {
        super.flush();
        this.A04 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A02 = this.A09[0];
        A03(this);
        this.A03 = null;
    }
}
