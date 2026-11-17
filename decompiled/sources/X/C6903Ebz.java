package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Ebz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6903Ebz extends C6848Eb1 {
    public static C6903Ebz A03;
    public static final long A04;
    public static final Condition A05;
    public static final ReentrantLock A06;
    public static final C6911Ec8 A07 = new C6911Ec8();
    public int A00 = -1;
    public int A01;
    public long A02;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        A06 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        C7384Etj.A0U(conditionNewCondition);
        A05 = conditionNewCondition;
        A04 = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:7:0x0014, B:9:0x0018, B:11:0x001f, B:12:0x002e, B:15:0x003e, B:21:0x0054, B:23:0x005a, B:25:0x0069, B:26:0x0073, B:28:0x007a, B:22:0x0056, B:20:0x004f, B:32:0x0089, B:31:0x0083), top: B:36:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #0 {all -> 0x008a, blocks: (B:7:0x0014, B:9:0x0018, B:11:0x001f, B:12:0x002e, B:15:0x003e, B:21:0x0054, B:23:0x005a, B:25:0x0069, B:26:0x0073, B:28:0x007a, B:22:0x0056, B:20:0x004f, B:32:0x0089, B:31:0x0083), top: B:36:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r10 = this;
            long r2 = r10.A00
            boolean r1 = r10.A06()
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lf
            if (r1 != 0) goto Lf
            return
        Lf:
            java.util.concurrent.locks.ReentrantLock r7 = X.C6903Ebz.A06
            r7.lock()
            int r0 = r10.A01     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L83
            r6 = 1
            r10.A01 = r6     // Catch: java.lang.Throwable -> L8a
            X.Ebz r0 = X.C6903Ebz.A03     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L2e
            X.Ebz r0 = new X.Ebz     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            X.C6903Ebz.A03 = r0     // Catch: java.lang.Throwable -> L8a
            X.Ec0 r0 = new X.Ec0     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            r0.start()     // Catch: java.lang.Throwable -> L8a
        L2e:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L8a
            long r2 = r10.A00     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r10.A06()     // Catch: java.lang.Throwable -> L8a
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L48
            if (r1 == 0) goto L48
            long r0 = r10.A00()     // Catch: java.lang.Throwable -> L8a
            long r0 = r0 - r4
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L8a
            goto L54
        L48:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L54
            if (r1 == 0) goto L4f
            goto L56
        L4f:
            java.lang.AssertionError r0 = X.BV6.A0f()     // Catch: java.lang.Throwable -> L8a
            goto L89
        L54:
            long r4 = r4 + r2
            goto L5a
        L56:
            long r4 = r10.A00()     // Catch: java.lang.Throwable -> L8a
        L5a:
            r10.A02 = r4     // Catch: java.lang.Throwable -> L8a
            X.Ec8 r5 = X.C6903Ebz.A07     // Catch: java.lang.Throwable -> L8a
            int r0 = r5.A00     // Catch: java.lang.Throwable -> L8a
            int r4 = r0 + 1
            r5.A00 = r4     // Catch: java.lang.Throwable -> L8a
            X.Ebz[] r3 = r5.A01     // Catch: java.lang.Throwable -> L8a
            int r2 = r3.length     // Catch: java.lang.Throwable -> L8a
            if (r4 != r2) goto L73
            int r0 = r4 * 2
            X.Ebz[] r1 = new X.C6903Ebz[r0]     // Catch: java.lang.Throwable -> L8a
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> L8a
            r5.A01 = r1     // Catch: java.lang.Throwable -> L8a
        L73:
            X.C6911Ec8.A00(r10, r5, r4)     // Catch: java.lang.Throwable -> L8a
            int r0 = r10.A00     // Catch: java.lang.Throwable -> L8a
            if (r0 != r6) goto L7f
            java.util.concurrent.locks.Condition r0 = X.C6903Ebz.A05     // Catch: java.lang.Throwable -> L8a
            r0.signal()     // Catch: java.lang.Throwable -> L8a
        L7f:
            r7.unlock()
            return
        L83:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L8a
        L89:
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            r7.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6903Ebz.A07():void");
    }

    public final boolean A08() {
        ReentrantLock reentrantLock = A06;
        reentrantLock.lock();
        try {
            int i = this.A01;
            boolean z = false;
            this.A01 = 0;
            if (i == 1) {
                A07.A01(this);
            } else if (i == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
