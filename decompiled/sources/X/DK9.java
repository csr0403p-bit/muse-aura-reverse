package X;

import com.facebook.aura.startup.AuraStartupMetricTracker;

/* loaded from: classes5.dex */
public interface DK9 {
    long now();

    long nowNanos();

    static long A00(Object obj) {
        return ((AuraStartupMetricTracker) obj).monotonicClock$1.now();
    }
}
