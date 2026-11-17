package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class HD4 {
    public static final AtomicInteger A02 = BV5.A17();
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public HD4(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int andIncrement = A02.getAndIncrement();
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = andIncrement;
    }
}
