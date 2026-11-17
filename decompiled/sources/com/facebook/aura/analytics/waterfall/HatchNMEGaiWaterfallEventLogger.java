package com.facebook.aura.analytics.waterfall;

import X.AnonymousClass005;
import X.BFs;
import X.C06H;
import X.C7384Etj;
import X.C8ee;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import X.C9DM;
import X.CFK;
import X.Eu1;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.AuraLogger;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchNMEGaiWaterfallEventLogger {
    public final C8ee<?> logger;

    private final BFs toWaterfallTier(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            for (BFs bFs : BFs.values()) {
                if (bFs.mValue == jLongValue) {
                    return bFs;
                }
            }
        }
        return null;
    }

    public /* synthetic */ HatchNMEGaiWaterfallEventLogger(C8ee c8ee, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraLogger.INSTANCE.getInstance() : c8ee);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98e c98e, C98d c98d, C98b c98b, C98f c98f, Map map, C98c c98c, Long l, int i, Object obj) {
        if ((i & 16) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            c98c = null;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        hatchNMEGaiWaterfallEventLogger.logEvent(c98e, c98d, c98b, c98f, map, c98c, l);
    }

    public final void logEvent(C98e c98e, C98d c98d, C98b c98b, C98f c98f, Map<String, String> map, C98c c98c, Long l) {
        AnonymousClass005.A0x(c98e, c98d, c98b);
        Eu1 eu1AcquireEvent = this.logger.acquireEvent("subs_waterfall_event");
        if (eu1AcquireEvent.isSampled()) {
            try {
                eu1AcquireEvent.A3V(c98e, "surface");
                eu1AcquireEvent.A3V(c98b, "event");
                eu1AcquireEvent.A3V(C9DM.HATCH, "product_type");
                eu1AcquireEvent.A3V(c98d, AgeCheckFunnelLogging.KEY_STAGE);
                eu1AcquireEvent.A3V(c98f, "entrypoint");
                eu1AcquireEvent.A3g("event_data", map);
                eu1AcquireEvent.A3V(c98c, "event_target");
                eu1AcquireEvent.A3V(toWaterfallTier(l), "selected_tier");
                eu1AcquireEvent.APu();
            } catch (Exception e) {
                CFK.A08(HatchNMEGaiWaterfallEventLoggerKt.TAG, "Failed to log event", e);
            }
        }
    }

    private final void logDebugInfo(C98e c98e, C98d c98d, C98b c98b, C98f c98f, Map<String, String> map, C98c c98c) {
    }

    public static /* synthetic */ void logDebugInfo$default(HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98e c98e, C98d c98d, C98b c98b, C98f c98f, Map map, C98c c98c, int i, Object obj) {
    }

    public HatchNMEGaiWaterfallEventLogger(C8ee<?> c8ee) {
        C7384Etj.A0Y(c8ee, 0);
        this.logger = c8ee;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchNMEGaiWaterfallEventLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
