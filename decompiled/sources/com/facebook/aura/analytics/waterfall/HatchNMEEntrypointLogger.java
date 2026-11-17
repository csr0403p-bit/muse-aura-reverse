package com.facebook.aura.analytics.waterfall;

import X.AbstractC7606F5t;
import X.BGb;
import X.C06H;
import X.C7384Etj;
import X.C8ee;
import X.C98f;
import X.C9DL;
import X.CFK;
import X.Eu1;
import com.facebook.aura.analytics.AuraLogger;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchNMEEntrypointLogger {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchNMEEntrypointLogger";
    public final C8ee<?> logger;

    public final void logClick(C98f c98f, Map<String, String> map) {
        C7384Etj.A0Y(c98f, 0);
        logEntrypointEvent(BGb.CLICK, c98f, map);
    }

    public final void logDismiss(C98f c98f, Map<String, String> map) {
        C7384Etj.A0Y(c98f, 0);
        logEntrypointEvent(BGb.DISMISS, c98f, map);
    }

    public final boolean logImpression(C98f c98f, Map<String, String> map) {
        C7384Etj.A0Y(c98f, 0);
        return logEntrypointEvent(BGb.IMPRESSION, c98f, map);
    }

    public /* synthetic */ HatchNMEEntrypointLogger(C8ee c8ee, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraLogger.INSTANCE.getInstance() : c8ee);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logClick$default(HatchNMEEntrypointLogger hatchNMEEntrypointLogger, C98f c98f, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        hatchNMEEntrypointLogger.logClick(c98f, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logDismiss$default(HatchNMEEntrypointLogger hatchNMEEntrypointLogger, C98f c98f, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        hatchNMEEntrypointLogger.logDismiss(c98f, map);
    }

    private final boolean logEntrypointEvent(BGb bGb, C98f c98f, Map<String, String> map) {
        Eu1 eu1AcquireEvent = this.logger.acquireEvent("nme_entrypoint_event");
        if (!eu1AcquireEvent.isSampled()) {
            return true;
        }
        try {
            eu1AcquireEvent.A3V(bGb, "event");
            eu1AcquireEvent.A3V(c98f, "entrypoint");
            eu1AcquireEvent.A3V(C9DL.HATCH, "product_type");
            eu1AcquireEvent.A3g(AbstractC7606F5t.A00(3), map);
            eu1AcquireEvent.APu();
            return true;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to log entrypoint event", e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean logEntrypointEvent$default(HatchNMEEntrypointLogger hatchNMEEntrypointLogger, BGb bGb, C98f c98f, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return hatchNMEEntrypointLogger.logEntrypointEvent(bGb, c98f, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean logImpression$default(HatchNMEEntrypointLogger hatchNMEEntrypointLogger, C98f c98f, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return hatchNMEEntrypointLogger.logImpression(c98f, map);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchNMEEntrypointLogger(C8ee<?> c8ee) {
        C7384Etj.A0Y(c8ee, 0);
        this.logger = c8ee;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchNMEEntrypointLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
