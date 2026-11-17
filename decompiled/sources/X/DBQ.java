package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes5.dex */
public abstract class DBQ {
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/quicklog/LightweightQuickPerformanceLogger;ILX/G0U<-Lcom/facebook/quicklog/MarkerEditor;Lkotlin/Unit;>;)V */
    public static final void A00(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, G0U g0u, int i) {
        C7384Etj.A0Y(lightweightQuickPerformanceLogger, 0);
        lightweightQuickPerformanceLogger.withMarker(i).asBatch(new DBS(g0u));
    }

    public static final void A01(QuickPerformanceLogger quickPerformanceLogger, G0U g0u) {
        if (quickPerformanceLogger.isMarkerOn(875314331)) {
            A00(quickPerformanceLogger, g0u, 875314331);
        }
    }
}
