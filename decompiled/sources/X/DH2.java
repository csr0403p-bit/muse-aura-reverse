package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class DH2 {
    public static final DH2 A02 = new DH2(60000);
    public final AtomicLong A00;
    public final AtomicLong A01;

    public final void A00(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.A00;
        long j = atomicLong.get();
        if (jElapsedRealtime < j || !atomicLong.compareAndSet(j, jElapsedRealtime + 60000)) {
            this.A01.incrementAndGet();
        } else {
            CFK.A0H("OneFabricEventHandler", "Event %s has no session descriptor; using the current session (%d further occurrences suppressed in the last %d ms)", str, Long.valueOf(this.A01.getAndSet(0L)), 60000L);
        }
    }

    public DH2(long j) {
        this.A01 = BV4.A14(0L);
        this.A00 = BV4.A14(0L);
    }

    public DH2() {
        this(60000L);
    }
}
