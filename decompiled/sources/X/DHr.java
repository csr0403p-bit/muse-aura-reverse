package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickEventImpl;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DHr {
    public final AwakeTimeSinceBootClock A00;
    public final ReentrantLock A01;

    public DHr(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        C7384Etj.A0Y(awakeTimeSinceBootClock, 0);
        this.A00 = awakeTimeSinceBootClock;
        this.A01 = new ReentrantLock();
    }

    public static void A00(QuickEventImpl quickEventImpl) {
        quickEventImpl.A0S.A02();
    }

    public final void A01() {
        DI8.A02("qpl.InstrumentedLock(%s).lock()", "quick_event_lock");
        try {
            this.A01.lock();
        } finally {
            DI8.A00();
        }
    }

    public final void A02() {
        DI8.A02("qpl.InstrumentedLock(%s).unlock()", "quick_event_lock");
        try {
            this.A01.unlock();
        } finally {
            DI8.A00();
        }
    }
}
