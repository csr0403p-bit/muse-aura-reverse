package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class GCD extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(GCD.class, "workerCtl$volatile");
    public static final String __redex_internal_original_name = "CoroutineScheduler$Worker";
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public boolean A04;
    public final C10543Hqv<GCH> A05;
    public final GCF A06;
    public final /* synthetic */ GCC A07;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl$volatile;

    public GCD(GCC gcc, int i) {
        this.A07 = gcc;
        setDaemon(true);
        setContextClassLoader(gcc.getClass().getClassLoader());
        this.A06 = new GCF();
        this.A05 = C3cG.A0z();
        this.A03 = C79.A0K;
        this.nextParkedWorker = GCC.A07;
        int iNanoTime = (int) System.nanoTime();
        this.A00 = iNanoTime == 0 ? 42 : iNanoTime;
        A01(i);
    }

    private final GCH A00() {
        C9263GBq c9263GBq;
        int i = this.A00;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >> 17);
        int i4 = i3 ^ (i3 << 5);
        this.A00 = i4;
        int i5 = i4 & 1;
        GCC gcc = this.A07;
        if (i5 == 0) {
            GCH gchA01 = gcc.A06.A01();
            if (gchA01 != null) {
                return gchA01;
            }
            c9263GBq = gcc.A05;
        } else {
            GCH gchA012 = gcc.A05.A01();
            if (gchA012 != null) {
                return gchA012;
            }
            c9263GBq = gcc.A06;
        }
        return c9263GBq.A01();
    }

    private final void A01(int i) {
        setName(FGI.A0U(this.A07.A03, "-worker-", i == 0 ? "TERMINATED" : String.valueOf(i)));
        this.indexInArray = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, X.GCH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.GCH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [X.GCH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.GCH A02(boolean r22) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCD.A02(boolean):X.GCH");
    }

    public final boolean A03(Integer num) {
        Integer num2 = this.A03;
        boolean z = false;
        if (num2 == C79.A00) {
            z = true;
            GCC.A09.addAndGet(this.A07, 4398046511104L);
        }
        if (num2 != num) {
            this.A03 = num;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        int i;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                GCC gcc = this.A07;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = GCC.A08;
                if (atomicIntegerFieldUpdater.get(gcc) == 1) {
                    break loop0;
                }
                Integer num = this.A03;
                Integer num2 = C79.A0P;
                if (num == num2) {
                    break loop0;
                }
                GCH gchA02 = A02(this.A04);
                if (gchA02 != null) {
                    this.A01 = 0L;
                    this.A02 = 0L;
                    if (this.A03 == C79.A0C) {
                        this.A03 = C79.A01;
                    }
                    if (gchA02.A01) {
                        if (A03(C79.A01) && !GCC.A02(gcc) && !GCC.A03(gcc, GCC.A09.get(gcc))) {
                            GCC.A02(gcc);
                        }
                        GCC.A01(gchA02);
                        GCC.A09.addAndGet(gcc, -2097152L);
                        if (this.A03 != num2) {
                            this.A03 = C79.A0K;
                        }
                    } else {
                        GCC.A01(gchA02);
                    }
                } else {
                    this.A04 = false;
                    if (this.A01 == 0) {
                        Object obj = this.nextParkedWorker;
                        HrH hrH = GCC.A07;
                        if (obj != hrH) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = A08;
                            atomicIntegerFieldUpdater2.set(this, -1);
                            while (this.nextParkedWorker != hrH && atomicIntegerFieldUpdater2.get(this) == -1 && atomicIntegerFieldUpdater.get(gcc) != 1 && this.A03 != num2) {
                                A03(C79.A0C);
                                Thread.interrupted();
                                if (this.A02 == 0) {
                                    this.A02 = System.nanoTime() + gcc.A02;
                                }
                                LockSupport.parkNanos(gcc.A02);
                                if (System.nanoTime() - this.A02 >= 0) {
                                    this.A02 = 0L;
                                    GCG<GCD> gcg = gcc.A04;
                                    synchronized (gcg) {
                                        if (atomicIntegerFieldUpdater.get(gcc) != 1) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = GCC.A09;
                                            if (((int) (atomicLongFieldUpdater.get(gcc) & 2097151)) > gcc.A00 && atomicIntegerFieldUpdater2.compareAndSet(this, -1, 1)) {
                                                int i2 = this.indexInArray;
                                                A01(0);
                                                gcc.A05(this, i2, 0);
                                                int andDecrement = (int) (2097151 & atomicLongFieldUpdater.getAndDecrement(gcc));
                                                if (andDecrement != i2) {
                                                    GCD gcdA00 = gcg.A00(andDecrement);
                                                    C7384Etj.A0X(gcdA00);
                                                    GCD gcd = gcdA00;
                                                    gcg.A01(i2, gcd);
                                                    gcd.A01(i2);
                                                    gcc.A05(gcd, andDecrement, i2);
                                                }
                                                gcg.A01(andDecrement, null);
                                                this.A03 = num2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (this.nextParkedWorker == hrH) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = GCC.A0A;
                            do {
                                j = atomicLongFieldUpdater2.get(gcc);
                                i = this.indexInArray;
                                this.nextParkedWorker = gcc.A04.A00((int) (2097151 & j));
                            } while (!atomicLongFieldUpdater2.compareAndSet(gcc, j, ((2097152 + j) & (-2097152)) | i));
                        }
                    } else {
                        if (z) {
                            A03(C79.A0C);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.A01);
                            this.A01 = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        A03(C79.A0P);
    }
}
