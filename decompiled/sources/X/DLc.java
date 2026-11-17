package X;

import com.facebook.aura.analytics.impl.MetaAnalyticsSessionManager;
import com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.IAuraAnalyticsProviderInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class DLc implements IAuraAnalyticsProviderInterface {
    public final DLd A00;

    @Override // com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.IAuraAnalyticsProviderInterface
    public final DFX getAppAnalyticsLogger() {
        DLd dLd = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (!DLd.A00(dLd)) {
            return null;
        }
        atomicInteger.getAndIncrement();
        try {
            return dLd.A00.getAppAnalyticsLogger();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.IAuraAnalyticsProviderInterface
    public final DFX getDeviceAnalyticsLogger() {
        DLd dLd = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (!DLd.A00(dLd)) {
            return null;
        }
        atomicInteger.getAndIncrement();
        try {
            return dLd.A00.getDeviceAnalyticsLogger();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.IAuraAnalyticsProviderInterface
    public final void notifyUserConsentChanged() {
        DLd dLd = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLd.A00(dLd)) {
            atomicInteger.getAndIncrement();
            try {
                MetaAnalyticsSessionManager.instance.notifyUserConsentChanged();
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public DLc(BrF brF, String str) {
        if (!str.equals("All")) {
            throw BV5.A0i("Invalid registry name \"", str, "\"!");
        }
        this.A00 = new DLd(brF);
    }
}
