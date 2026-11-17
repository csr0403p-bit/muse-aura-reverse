package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class HCz {
    public static final AtomicInteger A02 = BV5.A17();
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public HCz(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int andIncrement = A02.getAndIncrement();
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = andIncrement;
    }

    public final void A00(int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        int i2 = this.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i2, "vesta_service_error_code", i);
        lightweightQuickPerformanceLogger.markerPoint(536549438, i2, "vesta_service_error");
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i2, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, String.valueOf(i));
    }

    public final void A01(String str, int i, int i2) {
        this.A01.markerAnnotate(536549438, this.A00, FGI.A0M("protocol_version_mismatch_", str), FGI.A0T("client=", ",server=", i, i2));
    }
}
