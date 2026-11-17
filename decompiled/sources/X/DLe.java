package X;

import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class DLe implements IAuraAnalyticsDecoratorInterface {
    public final DLg A00;

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void decorateTimeSpentAppStateEvent(DFW dfw) {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                dLg.A00.decorateTimeSpentAppStateEvent(dfw);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void decorateTimeSpentInteractionEvent(DLT dlt) {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                dLg.A00.decorateTimeSpentInteractionEvent(dlt);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void decorateTimeSpentNavigationEvent(DFW dfw) {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                dLg.A00.decorateTimeSpentNavigationEvent(dfw);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void onTimeSpentAppBackgrounded() {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                HatchClientCvmEventLogger.INSTANCE.logTimeSpentBackground();
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void onTimeSpentAppForegrounded() {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                HatchClientCvmEventLogger.INSTANCE.logTimeSpentForeground();
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void onTimeSpentBitArray(long j, int[] iArr, int i) {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                dLg.A00.onTimeSpentBitArray(j, iArr, i);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.IAuraAnalyticsDecoratorInterface
    public final void onTimeSpentNavigation() {
        DLg dLg = this.A00;
        AtomicInteger atomicInteger = DLm.A02;
        atomicInteger.getAndIncrement();
        if (DLg.A00(dLg)) {
            atomicInteger.getAndIncrement();
            try {
                HatchClientCvmEventLogger.INSTANCE.logTimeSpentNavigation();
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public DLe(BrF brF, String str) {
        if (!str.equals("AuraAnalyticsDecorator")) {
            throw BV5.A0i("Invalid registry name \"", str, "\"!");
        }
        this.A00 = new DLg(brF);
    }
}
