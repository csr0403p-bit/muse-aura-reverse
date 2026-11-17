package com.facebook.aura.analytics.hatch;

import X.AGH;
import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C7526EzK;
import X.C79;
import X.C8ee;
import X.C9290GCr;
import X.Eu1;
import android.os.SystemClock;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.executors.AuraExecutors;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchImpressionLogger {
    public static final int $stable = 0;
    public static final HatchImpressionLogger INSTANCE = new HatchImpressionLogger();
    public static final C3Em<HatchImpressionLogEvent> _debugEvents;
    public static final C22I<HatchImpressionLogEvent> debugEvents;

    public final void logImpression(final HatchOrigin hatchOrigin, final HatchSurface hatchSurface, final HatchSubsurface hatchSubsurface, final HatchScreen hatchScreen, final HatchComponent hatchComponent, final String str, final Map<String, String> map, final Integer num) {
        C7384Etj.A0Y(hatchOrigin, 0);
        _debugEvents.AhV(new HatchImpressionLogEvent(hatchOrigin.getValue(), hatchSurface != null ? hatchSurface.getValue() : null, hatchSubsurface != null ? hatchSubsurface.getValue() : null, hatchScreen != null ? hatchScreen.getValue() : null, hatchComponent != null ? hatchComponent.getValue() : null, map, SystemClock.elapsedRealtime()));
        final HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        AuraExecutors.INSTANCE.getBackgroundThreadExecutor().execute(new Runnable() { // from class: com.facebook.aura.analytics.hatch.HatchImpressionLogger.logImpression.1
            @Override // java.lang.Runnable
            public final void run() {
                C8ee<C7526EzK> auraLogger = AuraLogger.INSTANCE.getInstance();
                HatchEventDelivery hatchEventDelivery = HatchEventDelivery.INSTANCE;
                HatchSurface hatchSurface2 = hatchSurface;
                String value = hatchSurface2 != null ? hatchSurface2.getValue() : null;
                HatchScreen hatchScreen2 = hatchScreen;
                Eu1 eu1AcquireEvent = auraLogger.acquireEvent("hatch_app_impressions", hatchEventDelivery.configFor(value, hatchScreen2 != null ? hatchScreen2.getValue() : null));
                if (eu1AcquireEvent.isSampled()) {
                    String str2 = str;
                    Map mapA11 = map;
                    if (str2 != null) {
                        if (mapA11 == null) {
                            mapA11 = AGH.A0E();
                        }
                        mapA11 = AnonymousClass006.A11("component_id", str2, mapA11);
                    }
                    eu1AcquireEvent.A3y("origin", hatchOrigin.getValue());
                    HatchSurface hatchSurface3 = hatchSurface;
                    eu1AcquireEvent.A3y("surface", hatchSurface3 != null ? hatchSurface3.getValue() : null);
                    HatchSubsurface hatchSubsurface2 = hatchSubsurface;
                    eu1AcquireEvent.A3y("subsurface", hatchSubsurface2 != null ? hatchSubsurface2.getValue() : null);
                    HatchScreen hatchScreen3 = hatchScreen;
                    eu1AcquireEvent.A3y("screen", hatchScreen3 != null ? hatchScreen3.getValue() : null);
                    HatchComponent hatchComponent2 = hatchComponent;
                    eu1AcquireEvent.A3y("component", hatchComponent2 != null ? hatchComponent2.getValue() : null);
                    eu1AcquireEvent.A3g("metadata", mapA11);
                    eu1AcquireEvent.A3y(AnonymousClass000.A00(14), HatchDeviceLocale.INSTANCE.getIdentifier());
                    eu1AcquireEvent.A3f("absolute_position", num != null ? Long.valueOf(r0.intValue()) : null);
                    eu1AcquireEvent.A3y("session_id", HatchSessionId.INSTANCE.get());
                    eu1AcquireEvent.A3y("vm_id", attributionSnapshot.vmId);
                    eu1AcquireEvent.A3y(AuraAnalyticsDecoratorImplementation.TIME_SPENT_VM_HOSTNAME, attributionSnapshot.vmHostname);
                    eu1AcquireEvent.A3P(AuraAnalyticsDecoratorImplementation.TIME_SPENT_IS_CVM, attributionSnapshot.isCvm);
                    eu1AcquireEvent.A3P("is_watch", Boolean.valueOf(HatchDeviceLoggingContext.INSTANCE.isWatch()));
                    eu1AcquireEvent.APu();
                }
            }
        });
    }

    static {
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 32);
        _debugEvents = c9290GCrA12;
        debugEvents = C3pd.A00(c9290GCrA12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logImpression$default(HatchImpressionLogger hatchImpressionLogger, HatchOrigin hatchOrigin, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSurface = null;
        }
        if ((i & 4) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 8) != 0) {
            hatchScreen = null;
        }
        if ((i & 16) != 0) {
            hatchComponent = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        hatchImpressionLogger.logImpression(hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, num);
    }

    public final C22I<HatchImpressionLogEvent> getDebugEvents() {
        return debugEvents;
    }
}
