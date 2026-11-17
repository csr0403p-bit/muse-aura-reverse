package X;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class GCC implements Executor, Closeable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final GCG<GCD> A04;
    public final C9263GBq A05;
    public final C9263GBq A06;
    public volatile /* synthetic */ int _isTerminated$volatile;
    public volatile /* synthetic */ long controlState$volatile;
    public volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater A0A = AtomicLongFieldUpdater.newUpdater(GCC.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A09 = AtomicLongFieldUpdater.newUpdater(GCC.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(GCC.class, "_isTerminated$volatile");
    public static final HrH A07 = HrH.A00("NOT_IN_STACK");

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A04(runnable, false, false);
    }

    private final int A00() {
        GCG<GCD> gcg = this.A04;
        synchronized (gcg) {
            if (A08.get(this) == 1) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = A09;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.A00 || i >= this.A01) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || gcg.A00(i3) != null) {
                throw C60O.A0i("Failed requirement.");
            }
            GCD gcd = new GCD(this, i3);
            gcg.A01(i3, gcd);
            if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                throw C60O.A0i("Failed requirement.");
            }
            int i4 = i2 + 1;
            gcd.start();
            return i4;
        }
    }

    public static final boolean A02(GCC gcc) {
        GCD gcdA00;
        HrH hrH;
        int i;
        do {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A0A;
            while (true) {
                long j = atomicLongFieldUpdater.get(gcc);
                gcdA00 = gcc.A04.A00((int) (2097151 & j));
                if (gcdA00 == null) {
                    gcdA00 = null;
                    break;
                }
                long j2 = (2097152 + j) & (-2097152);
                GCD gcd = gcdA00;
                while (true) {
                    Object obj = gcd.nextParkedWorker;
                    hrH = A07;
                    if (obj == hrH) {
                        break;
                    }
                    if (obj == null) {
                        i = 0;
                        break;
                    }
                    gcd = (GCD) obj;
                    i = gcd.indexInArray;
                    if (i != 0) {
                        if (i < 0) {
                            continue;
                        }
                    }
                }
                if (atomicLongFieldUpdater.compareAndSet(gcc, j, i | j2)) {
                    gcdA00.nextParkedWorker = hrH;
                    break;
                }
            }
            if (gcdA00 == null) {
                return false;
            }
        } while (!GCD.A08.compareAndSet(gcdA00, -1, 0));
        LockSupport.unpark(gcdA00);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[PHI: r9
  0x0041: PHI (r9v3 X.GCH) = (r9v2 X.GCH), (r9v2 X.GCH), (r9v2 X.GCH), (r9v2 X.GCH), (r9v4 X.GCH), (r9v2 X.GCH) binds: [B:9:0x0023, B:11:0x0027, B:13:0x0031, B:15:0x0037, B:43:0x0099, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.Runnable r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            int r0 = X.HlS.A01
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r9 instanceof X.GCH
            if (r2 == 0) goto Lc1
            X.GCH r9 = (X.GCH) r9
            r9.A00 = r0
            r9.A01 = r10
        L10:
            boolean r6 = r9.A01
            if (r6 == 0) goto Lbd
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = X.GCC.A09
            r0 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r2.addAndGet(r8, r0)
        L1d:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r0 = r4 instanceof X.GCD
            if (r0 == 0) goto L41
            X.GCD r4 = (X.GCD) r4
            if (r4 == 0) goto L41
            java.lang.String r0 = X.GCD.__redex_internal_original_name
            X.GCC r0 = r4.A07
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L41
            java.lang.Integer r3 = r4.A03
            java.lang.Integer r0 = X.C79.A0P
            if (r3 == r0) goto L41
            boolean r0 = r9.A01
            if (r0 != 0) goto L5e
            java.lang.Integer r0 = X.C79.A01
            if (r3 != r0) goto L5e
        L41:
            boolean r0 = r9.A01
            if (r0 == 0) goto L5b
            X.GBq r0 = r8.A05
        L47:
            boolean r0 = r0.A02(r9)
            if (r0 != 0) goto L6f
            java.lang.String r1 = r8.A03
            java.lang.String r0 = " was terminated"
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            r0.<init>(r1)
            throw r0
        L5b:
            X.GBq r0 = r8.A06
            goto L47
        L5e:
            r0 = 1
            r4.A04 = r0
            X.GCF r5 = r4.A06
            if (r11 != 0) goto L8a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GCF.A04
            java.lang.Object r9 = r0.getAndSet(r5, r9)
            X.GCH r9 = (X.GCH) r9
            if (r9 != 0) goto L8a
        L6f:
            boolean r0 = A02(r8)
            if (r6 == 0) goto L78
            if (r0 == 0) goto L80
        L77:
            return
        L78:
            if (r0 != 0) goto L77
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCC.A09
            long r1 = r0.get(r8)
        L80:
            boolean r0 = A03(r8, r1)
            if (r0 != 0) goto L77
            A02(r8)
            return
        L8a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = X.GCF.A03
            int r3 = r7.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.GCF.A02
            int r0 = r0.get(r5)
            int r3 = r3 - r0
            r0 = 127(0x7f, float:1.78E-43)
            if (r3 == r0) goto L41
            boolean r0 = r9.A01
            if (r0 == 0) goto La4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.GCF.A01
            r0.incrementAndGet(r5)
        La4:
            int r0 = r7.get(r5)
            r4 = r0 & 127(0x7f, float:1.78E-43)
        Laa:
            java.util.concurrent.atomic.AtomicReferenceArray<X.GCH> r3 = r5.A00
            java.lang.Object r0 = r3.get(r4)
            if (r0 == 0) goto Lb6
            java.lang.Thread.yield()
            goto Laa
        Lb6:
            r3.lazySet(r4, r9)
            r7.incrementAndGet(r5)
            goto L6f
        Lbd:
            r1 = 0
            goto L1d
        Lc1:
            X.GCE r2 = new X.GCE
            r2.<init>(r0, r9, r10)
            r9 = r2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCC.A04(java.lang.Runnable, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0002, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.GCD r10, int r11, int r12) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = X.GCC.A0A
        L2:
            r4 = r9
            long r5 = r3.get(r9)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r2 = (int) r0
            r7 = 2097152(0x200000, double:1.0361308E-317)
            long r7 = r7 + r5
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r7 = r7 & r0
            if (r2 != r11) goto L33
            if (r12 != 0) goto L2b
            r1 = r10
        L19:
            java.lang.Object r1 = r1.nextParkedWorker
            X.HrH r0 = X.GCC.A07
            if (r1 == r0) goto L2
            if (r1 != 0) goto L2d
            r2 = 0
        L22:
            long r0 = (long) r2
            long r7 = r7 | r0
            boolean r0 = r3.compareAndSet(r4, r5, r7)
            if (r0 == 0) goto L2
            return
        L2b:
            r2 = r12
            goto L33
        L2d:
            X.GCD r1 = (X.GCD) r1
            int r2 = r1.indexInArray
            if (r2 == 0) goto L19
        L33:
            if (r2 < 0) goto L2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCC.A05(X.GCD, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r13 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = X.GCC.A08
            r2 = 0
            r7 = 1
            boolean r2 = r3.compareAndSet(r13, r2, r7)
            if (r2 == 0) goto Ld5
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            boolean r2 = r6 instanceof X.GCD
            r10 = 0
            if (r2 == 0) goto L23
            X.GCD r6 = (X.GCD) r6
            if (r6 == 0) goto L23
            java.lang.String r2 = X.GCD.__redex_internal_original_name
            X.GCC r2 = r6.A07
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L24
        L23:
            r6 = r10
        L24:
            X.GCG<X.GCD> r9 = r13.A04
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = X.GCC.A09     // Catch: java.lang.Throwable -> Ld2
            long r2 = r4.get(r13)     // Catch: java.lang.Throwable -> Ld2
            r11 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r11
            int r8 = (int) r2
            monitor-exit(r9)
            if (r7 > r8) goto L6e
            r11 = 1
        L36:
            java.lang.Object r5 = r9.A00(r11)
            X.C7384Etj.A0X(r5)
            X.GCD r5 = (X.GCD) r5
            if (r5 == r6) goto L69
        L41:
            java.lang.Thread$State r3 = r5.getState()
            java.lang.Thread$State r2 = java.lang.Thread.State.TERMINATED
            if (r3 == r2) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r5.join(r0)
            goto L41
        L50:
            X.GCF r5 = r5.A06
            X.GBq r3 = r13.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.GCF.A04
            java.lang.Object r2 = r2.getAndSet(r5, r10)
            if (r2 == 0) goto L5f
            r3.A02(r2)
        L5f:
            X.GCH r2 = X.GCF.A00(r5)
            if (r2 == 0) goto L69
            r3.A02(r2)
            goto L5f
        L69:
            if (r11 == r8) goto L6e
            int r11 = r11 + 1
            goto L36
        L6e:
            X.GBq r5 = r13.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = X.GBX.A00
        L72:
            java.lang.Object r2 = r8.get(r5)
            X.GBY r2 = (X.GBY) r2
            boolean r0 = r2.A04()
            if (r0 == 0) goto L98
            X.GBq r3 = r13.A06
        L80:
            java.lang.Object r2 = r8.get(r3)
            X.GBY r2 = (X.GBY) r2
            boolean r0 = r2.A04()
            if (r0 != 0) goto La4
            long r0 = X.GBY.A00(r2)
            X.GBY r0 = X.GBY.A01(r2, r0)
            X.AbstractC5217DdT.A00(r3, r2, r0, r8)
            goto L80
        L98:
            long r0 = X.GBY.A00(r2)
            X.GBY r0 = X.GBY.A01(r2, r0)
            X.AbstractC5217DdT.A00(r5, r2, r0, r8)
            goto L72
        La4:
            if (r6 == 0) goto Lac
            X.GCH r0 = r6.A02(r7)
            if (r0 != 0) goto Lce
        Lac:
            java.lang.Object r0 = r3.A01()
            X.GCH r0 = (X.GCH) r0
            if (r0 != 0) goto Lce
            java.lang.Object r0 = r5.A01()
            X.GCH r0 = (X.GCH) r0
            if (r0 != 0) goto Lce
            if (r6 == 0) goto Lc3
            java.lang.Integer r0 = X.C79.A0P
            r6.A03(r0)
        Lc3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = X.GCC.A0A
            r0 = 0
            r2.set(r13, r0)
            r4.set(r13, r0)
            return
        Lce:
            A01(r0)
            goto La4
        Ld2:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCC.close():void");
    }

    public GCC(int i, int i2, String str, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = str;
        if (i < 1) {
            throw BV5.A0S("Core pool size ", " should be at least 1", i);
        }
        if (i2 < i) {
            throw C8j3.A0v("Max pool size ", " should be greater than or equals to core pool size ", i2, i);
        }
        if (i2 > 2097150) {
            throw BV5.A0S("Max pool size ", " should not exceed maximal supported number of threads 2097150", i2);
        }
        if (j <= 0) {
            throw C60O.A0i(FGI.A0J("Idle worker keep alive time ", j, " must be positive"));
        }
        this.A06 = new C9263GBq();
        this.A05 = new C9263GBq();
        GCG<GCD> gcg = new GCG<>();
        gcg.array = new AtomicReferenceArray<>((i + 1) * 2);
        this.A04 = gcg;
        this.controlState$volatile = i << 42;
    }

    public static final void A01(GCH gch) {
        try {
            gch.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    public static final boolean A03(GCC gcc, long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = gcc.A00;
        if (i < i2) {
            int iA00 = gcc.A00();
            if (iA00 == 1) {
                if (i2 > 1) {
                    gcc.A00();
                }
                return true;
            }
            if (iA00 > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbA0w;
        char c;
        ArrayList arrayListA0h = C3cG.A0h();
        GCG<GCD> gcg = this.A04;
        int length = gcg.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            GCD gcdA00 = gcg.A00(i6);
            if (gcdA00 != null) {
                GCF gcf = gcdA00.A06;
                Object obj = GCF.A04.get(gcf);
                int i7 = GCF.A03.get(gcf) - GCF.A02.get(gcf);
                if (obj != null) {
                    i7++;
                }
                int iIntValue = gcdA00.A03.intValue();
                if (iIntValue != 2) {
                    if (iIntValue == 1) {
                        i2++;
                        sbA0w = C60O.A0w();
                        sbA0w.append(i7);
                        c = 'b';
                    } else if (iIntValue == 0) {
                        i++;
                        sbA0w = C60O.A0w();
                        sbA0w.append(i7);
                        c = 'c';
                    } else if (iIntValue == 3) {
                        i4++;
                        if (i7 > 0) {
                            sbA0w = C60O.A0w();
                            sbA0w.append(i7);
                            c = 'd';
                        }
                    } else {
                        if (iIntValue != 4) {
                            throw C3cG.A0q();
                        }
                        i5++;
                    }
                    arrayListA0h.add(C8j3.A16(sbA0w, c));
                } else {
                    i3++;
                }
            }
        }
        long j = A09.get(this);
        StringBuilder sbA0w2 = C60O.A0w();
        sbA0w2.append(this.A03);
        sbA0w2.append('@');
        AbstractC7609F5w.A1K(sbA0w2, this);
        sbA0w2.append("[Pool Size {core = ");
        int i8 = this.A00;
        sbA0w2.append(i8);
        sbA0w2.append(", max = ");
        sbA0w2.append(this.A01);
        sbA0w2.append("}, Worker States {CPU = ");
        sbA0w2.append(i);
        sbA0w2.append(", blocking = ");
        sbA0w2.append(i2);
        sbA0w2.append(", parked = ");
        sbA0w2.append(i3);
        sbA0w2.append(", dormant = ");
        sbA0w2.append(i4);
        sbA0w2.append(", terminated = ");
        sbA0w2.append(i5);
        sbA0w2.append("}, running workers queues = ");
        sbA0w2.append(arrayListA0h);
        sbA0w2.append(", global CPU queue size = ");
        sbA0w2.append(this.A06.A00());
        sbA0w2.append(", global blocking queue size = ");
        sbA0w2.append(this.A05.A00());
        sbA0w2.append(", Control State {created workers= ");
        sbA0w2.append((int) (2097151 & j));
        sbA0w2.append(", blocking tasks = ");
        sbA0w2.append((int) ((4398044413952L & j) >> 21));
        sbA0w2.append(", CPUs acquired = ");
        sbA0w2.append(i8 - ((int) ((9223367638808264704L & j) >> 42)));
        return AnonymousClass001.A0v("}]", sbA0w2);
    }
}
