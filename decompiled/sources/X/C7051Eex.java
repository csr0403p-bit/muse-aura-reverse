package X;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Eex, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7051Eex {
    public final InterfaceC7072EfU A05;
    public final Executor A07;
    public final Runnable A06 = new Ef3(this);
    public final Runnable A08 = new RunnableC7063EfA(this);
    public C6988Edo A03 = null;
    public int A00 = 0;
    public Integer A04 = C79.A00;
    public long A02 = 0;
    public long A01 = 0;

    public final void A03() {
        C6988Edo c6988Edo;
        synchronized (this) {
            c6988Edo = this.A03;
            this.A03 = null;
            this.A00 = 0;
        }
        if (c6988Edo != null) {
            c6988Edo.close();
        }
    }

    public final boolean A04(C6988Edo c6988Edo, int i) {
        C6988Edo c6988Edo2;
        if ((i & 1) != 1 && (i & 4) != 4 && (c6988Edo == null || !c6988Edo.A09())) {
            return false;
        }
        synchronized (this) {
            c6988Edo2 = this.A03;
            this.A03 = c6988Edo != null ? C6988Edo.A01(c6988Edo) : null;
            this.A00 = i;
        }
        if (c6988Edo2 == null) {
            return true;
        }
        c6988Edo2.close();
        return true;
    }

    private void A00(long j) {
        Runnable runnable = this.A08;
        if (j <= 0) {
            runnable.run();
            return;
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = AbstractC7073EfV.A00;
        if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
            scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            AbstractC7073EfV.A00 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public C7051Eex(InterfaceC7072EfU interfaceC7072EfU, Executor executor) {
        this.A07 = executor;
        this.A05 = interfaceC7072EfU;
    }

    public static void A01(C7051Eex c7051Eex) {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (c7051Eex) {
            if (c7051Eex.A04 == C79.A0K) {
                jMax = jUptimeMillis;
                if ((c7051Eex.A00 & 1) != 1) {
                    jMax = Math.max(c7051Eex.A01 + 100, jUptimeMillis);
                }
                c7051Eex.A02 = jUptimeMillis;
                c7051Eex.A04 = C79.A01;
                z = true;
            } else {
                c7051Eex.A04 = C79.A00;
                jMax = 0;
                z = false;
            }
        }
        if (z) {
            c7051Eex.A00(jMax - jUptimeMillis);
        }
    }

    public static void A02(C7051Eex c7051Eex) {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (c7051Eex) {
            C6988Edo c6988Edo = c7051Eex.A03;
            int i = c7051Eex.A00;
            if ((i & 1) == 1 || (i & 4) == 4 || (c6988Edo != null && c6988Edo.A09())) {
                boolean z = false;
                int iIntValue = c7051Eex.A04.intValue();
                if (iIntValue != 0) {
                    if (iIntValue == 2) {
                        c7051Eex.A04 = C79.A0K;
                    }
                    jMax = 0;
                } else {
                    jMax = jUptimeMillis;
                    if ((c7051Eex.A00 & 1) != 1) {
                        jMax = Math.max(c7051Eex.A01 + 100, jUptimeMillis);
                    }
                    c7051Eex.A02 = jUptimeMillis;
                    c7051Eex.A04 = C79.A01;
                    z = true;
                }
                if (z) {
                    c7051Eex.A00(jMax - jUptimeMillis);
                }
            }
        }
    }
}
