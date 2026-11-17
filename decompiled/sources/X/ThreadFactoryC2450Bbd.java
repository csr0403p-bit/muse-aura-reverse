package X;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Bbd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC2450Bbd implements ThreadFactory {
    public final int $t;
    public final Object A00;

    public ThreadFactoryC2450Bbd(int i) {
        this.$t = i;
        this.A00 = BV5.A17();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread;
        String str;
        switch (this.$t) {
            case 0:
                thread = new Thread(runnable);
                str = String.format(Locale.US, "CameraX-core_camera_%d", BV5.A1Y(((AtomicInteger) this.A00).getAndIncrement()));
                break;
            case 1:
                thread = new Thread(runnable);
                thread.setPriority(10);
                str = "CameraX-camerax_high_priority";
                break;
            default:
                return null;
        }
        thread.setName(str);
        return thread;
    }

    public ThreadFactoryC2450Bbd(BpK bpK) {
        this.$t = 1;
        this.A00 = bpK;
    }
}
