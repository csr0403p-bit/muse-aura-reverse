package X;

import com.facebook.aura.network.acs.AcsKeyConfig;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public abstract class GB4 extends GB3 implements Hni {
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile;
    public volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(GB4.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(GB4.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(GB4.class, "_isCompleted$volatile");

    private final void A01() {
        GBD gbdA02;
        GB5 gb5 = (GB5) A01.get(this);
        if (gb5 == null || GB5.A01.get(gb5) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (gb5) {
                Object[] objArr = gb5.A00;
                Object obj = objArr != null ? objArr[0] : null;
                gbdA02 = null;
                if (obj != null) {
                    GB6 gb6 = (GB6) obj;
                    if (jNanoTime - gb6.A01 >= 0 && A02(gb6)) {
                        gbdA02 = gb5.A02(0);
                    }
                }
            }
        } while (gbdA02 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A02(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.GB4.A02
        L2:
            java.lang.Object r5 = r4.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.GB4.A00
            int r1 = r0.get(r6)
            r0 = 1
            if (r1 == r0) goto L10
            r0 = 0
        L10:
            r1 = 0
            if (r0 != 0) goto L4f
            r3 = 1
            if (r5 != 0) goto L1e
            r0 = 0
            boolean r0 = X.AbstractC5217DdT.A00(r6, r0, r7, r4)
        L1b:
            if (r0 == 0) goto L2
        L1d:
            return r3
        L1e:
            boolean r0 = r5 instanceof X.GBY
            if (r0 == 0) goto L39
            r2 = r5
            X.GBY r2 = (X.GBY) r2
            int r0 = r2.A02(r7)
            if (r0 == 0) goto L1d
            if (r0 != r3) goto L4f
            long r0 = X.GBY.A00(r2)
            X.GBY r0 = X.GBY.A01(r2, r0)
            X.AbstractC5217DdT.A00(r6, r5, r0, r4)
            goto L2
        L39:
            X.HrH r0 = X.GBC.A00
            if (r5 == r0) goto L4f
            r1 = 8
            X.GBY r0 = new X.GBY
            r0.<init>(r1, r3)
            r0.A02(r5)
            r0.A02(r7)
            boolean r0 = X.AbstractC5217DdT.A00(r6, r5, r0, r4)
            goto L1b
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GB4.A02(java.lang.Runnable):boolean");
    }

    @Override // X.GB7
    public void A07() {
        boolean zA00;
        GBD gbdA02;
        AbstractC9246GAy.A00.set(null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof GBY)) {
                    if (obj == GBC.A00) {
                        break;
                    }
                    GBY gby = new GBY(8, true);
                    gby.A02(obj);
                    zA00 = AbstractC5217DdT.A00(this, obj, gby, atomicReferenceFieldUpdater);
                } else {
                    ((GBY) obj).A04();
                    break;
                }
            } else {
                zA00 = AbstractC5217DdT.A00(this, null, GBC.A00, atomicReferenceFieldUpdater);
            }
            if (zA00) {
                break;
            }
        }
        while (A06() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            GB5 gb5 = (GB5) A01.get(this);
            if (gb5 == null) {
                return;
            }
            synchronized (gb5) {
                gbdA02 = GB5.A01.get(gb5) > 0 ? gb5.A02(0) : null;
            }
            GB6 gb6 = (GB6) gbdA02;
            if (gb6 == null) {
                return;
            }
            if (this instanceof GB0) {
                throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
            }
            GB0.A00.A0A(gb6, jNanoTime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[Catch: all -> 0x00d4, PHI: r14
  0x005b: PHI (r14v1 long) = (r14v0 long), (r14v2 long) binds: [B:22:0x0048, B:27:0x0059] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:12:0x0031, B:14:0x0035, B:15:0x0038, B:23:0x004a, B:26:0x0053, B:29:0x005e, B:31:0x0065, B:32:0x0067, B:34:0x006b, B:36:0x0071, B:37:0x0074, B:38:0x0076, B:39:0x0089, B:41:0x0092, B:62:0x00cc, B:63:0x00d3, B:28:0x005b), top: B:77:0x0031, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.GB6 r13, long r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GB4.A0A(X.GB6, long):void");
    }

    public final boolean A0B() {
        Object obj;
        AIG<GBN<?>> aig = this.A01;
        if ((aig != null ? aig.isEmpty() : true) && ((obj = A01.get(this)) == null || GB5.A01.get(obj) == 0)) {
            Object obj2 = A02.get(this);
            if (obj2 == null) {
                return true;
            }
            if (obj2 instanceof GBY) {
                long j = GBY.A05.get(obj2);
                return AnonymousClass002.A1Q((int) (1073741823 & j), (int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj2 == GBC.A00) {
                return true;
            }
        }
        return false;
    }

    public /* bridge */ HsS AO7(Runnable runnable, C78T c78t, long j) {
        return AbstractC10475Hkn.A00.AO7(runnable, c78t, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Hm1<-Lkotlin/Unit;>;)V */
    @Override // X.Hni
    public final void AcD(Hm1 hm1, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                return;
            }
            j2 = j * 1000000;
            if (j2 >= AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS) {
                return;
            }
        }
        long jNanoTime = System.nanoTime();
        GB2 gb2 = new GB2(hm1, this, j2 + jNanoTime);
        A0A(gb2, jNanoTime);
        GBO.A01(new GB8(gb2), hm1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (((int) (1073741823 & r4)) == ((int) ((r4 & 1152921503533105152L) >> 30))) goto L31;
     */
    @Override // X.GB7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A06() {
        /*
            r9 = this;
            boolean r0 = r9.A05()
            r7 = 0
            if (r0 != 0) goto L2a
            r9.A01()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.GB4.A02
        Ld:
            java.lang.Object r3 = r4.get(r9)
            r1 = 0
            if (r3 == 0) goto L45
            boolean r0 = r3 instanceof X.GBY
            if (r0 == 0) goto L37
            r2 = r3
            X.GBY r2 = (X.GBY) r2
            java.lang.Object r1 = r2.A03()
            X.HrH r0 = X.GBY.A04
            if (r1 == r0) goto L2b
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L25:
            if (r1 == 0) goto L45
            r1.run()
        L2a:
            return r7
        L2b:
            long r0 = X.GBY.A00(r2)
            X.GBY r0 = X.GBY.A01(r2, r0)
            X.AbstractC5217DdT.A00(r9, r3, r0, r4)
            goto Ld
        L37:
            X.HrH r0 = X.GBC.A00
            if (r3 == r0) goto L45
            boolean r0 = X.AbstractC5217DdT.A00(r9, r3, r1, r4)
            if (r0 == 0) goto Ld
            r1 = r3
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            goto L25
        L45:
            X.AIG<X.GBN<?>> r0 = r9.A01
            if (r0 == 0) goto L4f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
        L4f:
            java.lang.Object r1 = r4.get(r9)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L75
            boolean r0 = r1 instanceof X.GBY
            if (r0 == 0) goto L81
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GBY.A05
            long r4 = r0.get(r1)
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r4
            int r6 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r0
            r0 = 30
            long r4 = r4 >> r0
            int r0 = (int) r4
            if (r6 != r0) goto L2a
        L75:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GB4.A01
            java.lang.Object r4 = r0.get(r9)
            X.GB5 r4 = (X.GB5) r4
            if (r4 == 0) goto La4
            monitor-enter(r4)
            goto L86
        L81:
            X.HrH r0 = X.GBC.A00
            if (r1 != r0) goto L2a
            return r2
        L86:
            T extends X.GBD & java.lang.Comparable<? super T>[] r1 = r4.A00     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L91
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L8e
            goto L92
        L8e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L91:
            r0 = 0
        L92:
            monitor-exit(r4)
            X.GB6 r0 = (X.GB6) r0
            if (r0 == 0) goto La4
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto La4
            r2 = 0
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GB4.A06():long");
    }

    public void A09(Runnable runnable) {
        A01();
        if (!A02(runnable)) {
            GB0.A00.A09(runnable);
            return;
        }
        Thread threadA08 = A08();
        if (Thread.currentThread() != threadA08) {
            LockSupport.unpark(threadA08);
        }
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        A09(runnable);
    }
}
