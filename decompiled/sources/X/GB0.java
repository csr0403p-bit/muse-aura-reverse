package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class GB0 extends GB4 implements Runnable {
    public static final GB0 A00;
    public static final long A01;
    public static final String __redex_internal_original_name = "DefaultExecutor";
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    private final synchronized void A00() {
        if (debugStatus == 3) {
            debugStatus = 3;
            GB4.A02.set(this, null);
            GB4.A01.set(this, null);
            notifyAll();
        }
    }

    @Override // X.GB4, X.GB7
    public final void A07() {
        debugStatus = 4;
        super.A07();
    }

    static {
        Long l;
        GB0 gb0 = new GB0();
        A00 = gb0;
        gb0.A00++;
        gb0.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A01 = timeUnit.toNanos(l.longValue());
    }

    @Override // X.GB3
    public final Thread A08() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "X.GB0");
                    _thread = thread;
                    thread.setContextClassLoader(A00.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // X.GB4
    public final void A09(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A09(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r1 < com.facebook.aura.network.acs.AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS) goto L8;
     */
    @Override // X.GB4, X.Hni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.HsS AO7(java.lang.Runnable r6, X.C78T r7, long r8) {
        /*
            r5 = this;
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2b
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r8 * r3
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2b
        L1d:
            long r3 = java.lang.System.nanoTime()
            long r1 = r1 + r3
            X.GB1 r0 = new X.GB1
            r0.<init>(r1, r6)
            r5.A0A(r0, r3)
            return r0
        L2b:
            X.HsE r0 = X.HsE.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GB0.AO7(java.lang.Runnable, X.78T, long):X.HsS");
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9246GAy.A00.set(this);
        try {
            synchronized (this) {
                if (debugStatus != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    while (true) {
                        Thread.interrupted();
                        long jA06 = A06();
                        if (jA06 == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                            long jNanoTime = System.nanoTime();
                            if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                                j = A01 + jNanoTime;
                            }
                            long j2 = j - jNanoTime;
                            if (j2 <= 0) {
                                break;
                            } else if (jA06 > j2) {
                                jA06 = j2;
                            }
                        } else {
                            j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                        }
                        if (jA06 > 0) {
                            if (debugStatus == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, jA06);
                            }
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            A00();
            if (!A0B()) {
                A08();
            }
        }
    }

    @Override // X.GBK
    public final String toString() {
        return __redex_internal_original_name;
    }
}
