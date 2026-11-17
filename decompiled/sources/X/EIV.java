package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class EIV {
    public final ReentrantLock A00 = new ReentrantLock();
    public final ReentrantLock A01 = new ReentrantLock();
    public final long[] A02;
    public final boolean[] A03;
    public volatile boolean A04;
    public volatile boolean A05;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(int[] r13) {
        /*
            r12 = this;
            r0 = 0
            X.C7384Etj.A0Y(r13, r0)
            java.util.concurrent.locks.ReentrantLock r7 = r12.A00
            r7.lock()
            int r10 = r13.length     // Catch: java.lang.Throwable -> L36
            r11 = 0
            r9 = 0
            r8 = 0
        Ld:
            r6 = 1
            if (r9 >= r10) goto L27
            r5 = r13[r9]     // Catch: java.lang.Throwable -> L36
            long[] r2 = r12.A02     // Catch: java.lang.Throwable -> L36
            r3 = r2[r5]     // Catch: java.lang.Throwable -> L36
            r0 = 1
            long r0 = r0 + r3
            r2[r5] = r0     // Catch: java.lang.Throwable -> L36
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            r12.A05 = r6     // Catch: java.lang.Throwable -> L36
            r8 = 1
        L24:
            int r9 = r9 + 1
            goto Ld
        L27:
            if (r8 != 0) goto L31
            boolean r0 = r12.A05     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L31
            boolean r0 = r12.A04     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L32
        L31:
            r11 = 1
        L32:
            r7.unlock()
            return r11
        L36:
            r0 = move-exception
            r7.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIV.A00(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(int[] r15) {
        /*
            r14 = this;
            r0 = 0
            X.C7384Etj.A0Y(r15, r0)
            java.util.concurrent.locks.ReentrantLock r9 = r14.A00
            r9.lock()
            int r12 = r15.length     // Catch: java.lang.Throwable -> L35
            r13 = 0
            r11 = 0
            r10 = 0
        Ld:
            r8 = 1
            if (r11 >= r12) goto L26
            r7 = r15[r11]     // Catch: java.lang.Throwable -> L35
            long[] r6 = r14.A02     // Catch: java.lang.Throwable -> L35
            r4 = r6[r7]     // Catch: java.lang.Throwable -> L35
            r2 = 1
            long r0 = r4 - r2
            r6[r7] = r0     // Catch: java.lang.Throwable -> L35
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            r14.A05 = r8     // Catch: java.lang.Throwable -> L35
            r10 = 1
        L23:
            int r11 = r11 + 1
            goto Ld
        L26:
            if (r10 != 0) goto L30
            boolean r0 = r14.A05     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L30
            boolean r0 = r14.A04     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L31
        L30:
            r13 = 1
        L31:
            r9.unlock()
            return r13
        L35:
            r0 = move-exception
            r9.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIV.A01(int[]):boolean");
    }

    public EIV(int i) {
        this.A02 = new long[i];
        this.A03 = new boolean[i];
    }
}
