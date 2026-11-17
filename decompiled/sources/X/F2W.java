package X;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class F2W implements ThreadFactory {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F2W(BpJ bpJ) {
        this.$t = 1;
        this.A01 = bpJ;
        this.A00 = BV5.A17();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread;
        String strA0H;
        switch (this.$t) {
            case 0:
                thread = new Thread(runnable);
                strA0H = FGI.A0H("arch_disk_io_", ((AtomicInteger) this.A00).getAndIncrement());
                break;
            case 1:
                thread = new Thread(runnable);
                strA0H = String.format(Locale.US, "CameraX-camerax_io_%d", BV5.A1Y(((AtomicInteger) this.A00).getAndIncrement()));
                break;
            default:
                thread = ((ThreadFactory) this.A00).newThread(runnable);
                thread.getClass();
                strA0H = String.format(Locale.ROOT, "HealthData-HealthDataSdkService-%d", BV4.A1X(((AtomicLong) this.A01).getAndIncrement()));
                break;
        }
        thread.setName(strA0H);
        return thread;
    }

    public F2W(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.$t = 2;
        this.A00 = threadFactory;
        this.A01 = atomicLong;
    }

    public F2W(BrH brH) {
        this.$t = 0;
        this.A01 = brH;
        this.A00 = BV5.A17();
    }
}
