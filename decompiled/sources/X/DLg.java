package X;

import com.facebook.aura.analytics.plugins.implementations.AnalyticsImplementationsKillSwitchCacheWrapper;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class DLg {
    public AuraAnalyticsDecoratorImplementation A00;
    public Object A01;
    public final BrF A02;

    public static boolean A00(DLg dLg) {
        Object obj = dLg.A01;
        if (obj == null) {
            AtomicInteger atomicInteger = DLm.A02;
            atomicInteger.getAndIncrement();
            BrF brF = dLg.A02;
            try {
                Boolean boolPeekIsNeeded = AnalyticsImplementationsKillSwitchCacheWrapper.peekIsNeeded(1);
                if (boolPeekIsNeeded != null ? boolPeekIsNeeded.booleanValue() : AnalyticsImplementationsKillSwitchCacheWrapper.isNeeded(1, atomicInteger, brF)) {
                    dLg.A00 = new AuraAnalyticsDecoratorImplementation();
                    obj = DLm.A00;
                    dLg.A01 = obj;
                } else {
                    obj = DLm.A01;
                    dLg.A01 = obj;
                }
            } catch (Exception e) {
                dLg.A01 = DLm.A01;
                throw e;
            }
        }
        return obj != DLm.A01;
    }

    public DLg(BrF brF) {
        this.A02 = brF == null ? DLs.A00 : brF;
    }
}
