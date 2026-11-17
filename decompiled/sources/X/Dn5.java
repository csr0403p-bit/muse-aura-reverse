package X;

/* loaded from: classes5.dex */
public final class Dn5 {
    public final C5811Dpv A01 = new C5811Dpv();
    public final C5811Dpv A02 = new C5811Dpv();
    public long A00 = 1;

    public static int A00(long j, long j2) {
        int i = (j == 1 || j == 2) ? (int) j : 0;
        if (i == 0) {
            return 0;
        }
        return (j2 == 1 || !(j2 == 2 || (i == 2))) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5882DrI A01(X.C5811Dpv r14, int r15, long r16, long r18) {
        /*
            java.util.Deque<X.Dta> r1 = r14.A06
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L16
            long r3 = r14.A03
            r1 = -1
            r9 = 0
            X.DrI r0 = new X.DrI
            r5 = r1
            r7 = r1
            r10 = r9
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return r0
        L16:
            java.lang.Object r0 = r1.getLast()
            X.Dta r0 = (X.C5993Dta) r0
            long r5 = r0.A00
            long r7 = r14.A03
            boolean r0 = r14.A05
            if (r0 == 0) goto L29
            X.Dst r0 = r14.A04
            r13 = 1
            if (r0 == 0) goto L2a
        L29:
            r13 = 0
        L2a:
            r0 = 2
            if (r15 < r0) goto L42
            r1 = 0
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            long r0 = r14.A01
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L42
            long r16 = r16 - r0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            r14 = 1
            if (r0 < 0) goto L43
        L42:
            r14 = 0
        L43:
            r9 = -1
            X.DrI r0 = new X.DrI
            r4 = r0
            r11 = r9
            r4.<init>(r5, r7, r9, r11, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dn5.A01(X.Dpv, int, long, long):X.DrI");
    }

    public static void A02(C5882DrI c5882DrI, C5811Dpv c5811Dpv) {
        C5958Dst c5958Dst = c5811Dpv.A04;
        if (c5958Dst != null) {
            long j = c5882DrI.A02;
            if (j == -1 || c5958Dst.A02 != j) {
                return;
            }
            c5811Dpv.A04 = null;
            c5811Dpv.A05 = !c5811Dpv.A06.isEmpty();
        }
    }

    public static void A03(C5811Dpv c5811Dpv, long j, long j2) {
        C5958Dst c5958Dst = c5811Dpv.A04;
        if (c5958Dst != null && j >= c5958Dst.A01) {
            c5811Dpv.A04 = null;
            c5811Dpv.A05 = !c5811Dpv.A06.isEmpty();
        }
        if (j2 > 0) {
            long j3 = c5811Dpv.A02;
            if (j3 == -1 || j - j3 < j2) {
                return;
            }
            c5811Dpv.A06.clear();
            c5811Dpv.A00 = 0;
            c5811Dpv.A05 = false;
            c5811Dpv.A04 = null;
            c5811Dpv.A01 = -1L;
            c5811Dpv.A02 = -1L;
        }
    }
}
