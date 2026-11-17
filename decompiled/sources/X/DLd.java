package X;

import com.facebook.aura.analytics.plugins.implementations.AnalyticsImplementationsKillSwitchCacheWrapper;
import com.facebook.aura.analytics.plugins.implementations.auraanalyticsprovider.AuraAnalyticsProviderImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class DLd {
    public AuraAnalyticsProviderImplementation A00;
    public Object A01;
    public final BrF A02;

    public static boolean A00(DLd dLd) {
        Object obj = dLd.A01;
        if (obj == null) {
            AtomicInteger atomicInteger = DLm.A02;
            atomicInteger.getAndIncrement();
            BrF brF = dLd.A02;
            try {
                Boolean boolPeekIsNeeded = AnalyticsImplementationsKillSwitchCacheWrapper.peekIsNeeded(1);
                if (boolPeekIsNeeded != null ? boolPeekIsNeeded.booleanValue() : AnalyticsImplementationsKillSwitchCacheWrapper.isNeeded(1, atomicInteger, brF)) {
                    dLd.A00 = new AuraAnalyticsProviderImplementation();
                    obj = DLm.A00;
                    dLd.A01 = obj;
                } else {
                    obj = DLm.A01;
                    dLd.A01 = obj;
                }
            } catch (Exception e) {
                dLd.A01 = DLm.A01;
                throw e;
            }
        }
        return obj != DLm.A01;
    }

    public DLd(BrF brF) {
        this.A02 = brF == null ? DLs.A00 : brF;
    }
}
