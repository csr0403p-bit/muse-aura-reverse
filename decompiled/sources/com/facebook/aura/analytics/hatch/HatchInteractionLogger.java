package com.facebook.aura.analytics.hatch;

import X.AnonymousClass000;
import X.AnonymousClass003;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.Eu1;
import android.os.SystemClock;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchInteractionLogger {
    public static final int $stable = 0;
    public static final HatchInteractionLogger INSTANCE = new HatchInteractionLogger();
    public static final String ORIGIN = "hatch_android";
    public static final C3Em<HatchInteractionLogEvent> _debugEvents;
    public static final C22I<HatchInteractionLogEvent> debugEvents;

    public final void logClick(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, Map<String, String> map) {
        C7384Etj.A0Y(hatchSkillOAuthOrigin, 0);
        logClick(hatchSkillOAuthOrigin.getSurface(), hatchSkillOAuthOrigin.getSubsurface(), hatchSkillOAuthOrigin.getScreen(), hatchComponent, null, map, null);
    }

    public final void logPermission(HatchEventType hatchEventType, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        C7384Etj.A0Y(hatchEventType, 0);
        submitLog(hatchEventType, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, map, null);
    }

    public final void logSkillOAuthResult(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, Map<String, String> map) {
        AnonymousClass003.A0u(hatchSkillOAuthOrigin, hatchComponent);
        submitLog(HatchEventType.STATUS_CHECK, hatchSkillOAuthOrigin.getSurface(), hatchSkillOAuthOrigin.getSubsurface(), hatchSkillOAuthOrigin.getScreen(), hatchComponent, null, map, null);
    }

    static {
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 32);
        _debugEvents = c9290GCrA12;
        debugEvents = C3pd.A00(c9290GCrA12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logClick$default(HatchInteractionLogger hatchInteractionLogger, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComponent = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        hatchInteractionLogger.logClick(hatchSkillOAuthOrigin, hatchComponent, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logDeepLink$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        hatchInteractionLogger.logDeepLink(hatchSurface, hatchSubsurface, hatchScreen, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logDismiss$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        hatchInteractionLogger.logDismiss(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logLongPress$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        hatchInteractionLogger.logLongPress(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logPermission$default(HatchInteractionLogger hatchInteractionLogger, HatchEventType hatchEventType, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map map, int i, Object obj) {
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
            map = null;
        }
        hatchInteractionLogger.logPermission(hatchEventType, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logPlayEnd$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        hatchInteractionLogger.logPlayEnd(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logPullToRefresh$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        hatchInteractionLogger.logPullToRefresh(hatchSurface, hatchSubsurface, hatchScreen, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logScroll$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        hatchInteractionLogger.logScroll(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logSkillOAuthResult$default(HatchInteractionLogger hatchInteractionLogger, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        hatchInteractionLogger.logSkillOAuthResult(hatchSkillOAuthOrigin, hatchComponent, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logStatusCheck$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        hatchInteractionLogger.logStatusCheck(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logSwipe$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        hatchInteractionLogger.logSwipe(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logToggle$default(HatchInteractionLogger hatchInteractionLogger, boolean z, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, int i, Object obj) {
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
        hatchInteractionLogger.logToggle(z, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logType$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        hatchInteractionLogger.logType(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, map);
    }

    private final void submitLog(HatchEventType hatchEventType, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map, String str2) {
        _debugEvents.AhV(new HatchInteractionLogEvent(hatchEventType.getValue(), hatchSurface != null ? hatchSurface.getValue() : null, hatchSubsurface != null ? hatchSubsurface.getValue() : null, hatchScreen != null ? hatchScreen.getValue() : null, hatchComponent != null ? hatchComponent.getValue() : null, map, SystemClock.elapsedRealtime()));
        Eu1 eu1AcquireEvent = AuraLogger.INSTANCE.getInstance().acquireEvent("hatch_app_interactions", HatchEventDelivery.INSTANCE.configFor(hatchSurface != null ? hatchSurface.getValue() : null, hatchScreen != null ? hatchScreen.getValue() : null));
        if (eu1AcquireEvent.isSampled()) {
            HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
            eu1AcquireEvent.A3y("origin", "hatch_android");
            eu1AcquireEvent.A3y("event_type", hatchEventType.getValue());
            eu1AcquireEvent.A3y("surface", hatchSurface != null ? hatchSurface.getValue() : null);
            eu1AcquireEvent.A3y("subsurface", hatchSubsurface != null ? hatchSubsurface.getValue() : null);
            eu1AcquireEvent.A3y("screen", hatchScreen != null ? hatchScreen.getValue() : null);
            eu1AcquireEvent.A3y("component", hatchComponent != null ? hatchComponent.getValue() : null);
            eu1AcquireEvent.A3y("component_id", str);
            eu1AcquireEvent.A3g("metadata", map);
            eu1AcquireEvent.A3y(AnonymousClass000.A00(14), HatchDeviceLocale.INSTANCE.getIdentifier());
            eu1AcquireEvent.A3y("session_id", HatchSessionId.INSTANCE.get());
            eu1AcquireEvent.A3y("request_id", str2);
            eu1AcquireEvent.A3y("vm_id", attributionSnapshot.vmId);
            eu1AcquireEvent.A3y(AuraAnalyticsDecoratorImplementation.TIME_SPENT_VM_HOSTNAME, attributionSnapshot.vmHostname);
            eu1AcquireEvent.A3P(AuraAnalyticsDecoratorImplementation.TIME_SPENT_IS_CVM, attributionSnapshot.isCvm);
            eu1AcquireEvent.A3P("is_watch", Boolean.valueOf(HatchDeviceLoggingContext.INSTANCE.isWatch()));
            eu1AcquireEvent.APu();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitLog$default(HatchInteractionLogger hatchInteractionLogger, HatchEventType hatchEventType, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, String str2, int i, Object obj) {
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
            str2 = null;
        }
        hatchInteractionLogger.submitLog(hatchEventType, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, str2);
    }

    public final C22I<HatchInteractionLogEvent> getDebugEvents() {
        return debugEvents;
    }

    public final void logDeepLink(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Map<String, String> map) {
        submitLog(HatchEventType.DEEP_LINK, hatchSurface, hatchSubsurface, hatchScreen, null, null, map, null);
    }

    public final void logDismiss(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map) {
        submitLog(HatchEventType.DISMISS, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, null);
    }

    public final void logLongPress(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map) {
        submitLog(HatchEventType.LONG_PRESS, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, null);
    }

    public final void logPlayEnd(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map) {
        submitLog(HatchEventType.PLAY_END, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, null);
    }

    public final void logPullToRefresh(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Map<String, String> map) {
        submitLog(HatchEventType.PULL_TO_REFRESH, hatchSurface, hatchSubsurface, hatchScreen, null, null, map, null);
    }

    public final void logScroll(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        submitLog(HatchEventType.SCROLL, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, map, null);
    }

    public final void logStatusCheck(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        submitLog(HatchEventType.STATUS_CHECK, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, map, null);
    }

    public final void logSwipe(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        submitLog(HatchEventType.SWIPE, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, map, null);
    }

    public final void logToggle(boolean z, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map) {
        submitLog(z ? HatchEventType.TOGGLE_ON : HatchEventType.TOGGLE_OFF, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, null);
    }

    public final void logType(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        submitLog(HatchEventType.TYPE, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, map, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logClick$default(HatchInteractionLogger hatchInteractionLogger, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = null;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 4) != 0) {
            hatchScreen = null;
        }
        if ((i & 8) != 0) {
            hatchComponent = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, str2);
    }

    public final void logClick(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map, String str2) {
        submitLog(HatchEventType.CLICK, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, str2);
    }
}
