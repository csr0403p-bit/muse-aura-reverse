package com.facebook.aura.analytics.hatch;

import X.AnonymousClass003;
import X.C7384Etj;
import X.C7526EzK;
import X.Eu1;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchAppEventLogger {
    public static final int $stable = 0;
    public static final HatchAppEventLogger INSTANCE = new HatchAppEventLogger();
    public static final String ORIGIN = "hatch_android";

    public final void logBrowserClipboardControlsExposed(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        logEvent("browser_clipboard_controls_exposed", "chat", "browser", "exposure", "device_clipboard", map, null, Long.valueOf(System.currentTimeMillis()));
    }

    public final void logBrowserClipboardTransferStarted(Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass003.A0u(map, hatchAppEventLoggingContext);
        logEvent("browser_clipboard_transfer_started", "chat", "browser", WidgetComponentsKt.START_PATH, "device_clipboard", map, hatchAppEventLoggingContext, Long.valueOf(System.currentTimeMillis()));
    }

    public final void logBrowserClipboardTransferTerminal(Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass003.A0u(map, hatchAppEventLoggingContext);
        logEvent("browser_clipboard_transfer_terminal", "chat", "browser", "outcome", "device_clipboard", map, hatchAppEventLoggingContext, Long.valueOf(System.currentTimeMillis()));
    }

    private final void logEvent(String str, String str2, String str3, String str4, String str5, Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext, Long l) {
        Eu1 eu1AcquireEvent = AuraLogger.INSTANCE.getInstance().acquireEvent("hatch_app_events", C7526EzK.A02);
        if (eu1AcquireEvent.isSampled()) {
            if (hatchAppEventLoggingContext == null) {
                hatchAppEventLoggingContext = captureContext();
            }
            eu1AcquireEvent.A3y("event_name", str);
            eu1AcquireEvent.A3y("origin", "hatch_android");
            if (l != null) {
                eu1AcquireEvent.A3f("client_event_time_ms", Long.valueOf(l.longValue()));
            }
            if (str2 != null) {
                eu1AcquireEvent.A3y("surface", str2);
            }
            if (str3 != null) {
                eu1AcquireEvent.A3y("subsurface", str3);
            }
            if (str4 != null) {
                eu1AcquireEvent.A3y("event_type", str4);
            }
            if (str5 != null) {
                eu1AcquireEvent.A3y("component", str5);
            }
            if (map != null) {
                eu1AcquireEvent.A3g("metadata", map);
            }
            eu1AcquireEvent.A3y("session_id", hatchAppEventLoggingContext.sessionId);
            eu1AcquireEvent.A3y("vm_id", hatchAppEventLoggingContext.vm.vmId);
            eu1AcquireEvent.A3y(AuraAnalyticsDecoratorImplementation.TIME_SPENT_VM_HOSTNAME, hatchAppEventLoggingContext.vm.vmHostname);
            eu1AcquireEvent.A3P(AuraAnalyticsDecoratorImplementation.TIME_SPENT_IS_CVM, hatchAppEventLoggingContext.vm.isCvm);
            eu1AcquireEvent.A3P("is_watch", Boolean.valueOf(hatchAppEventLoggingContext.isWatch));
            eu1AcquireEvent.APu();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(HatchAppEventLogger hatchAppEventLogger, String str, String str2, String str3, String str4, String str5, Map map, HatchAppEventLoggingContext hatchAppEventLoggingContext, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            hatchAppEventLoggingContext = null;
        }
        hatchAppEventLogger.logEvent(str, str2, str3, str4, str5, map, hatchAppEventLoggingContext);
    }

    public final HatchAppEventLoggingContext captureContext() {
        return new HatchAppEventLoggingContext(HatchSessionId.INSTANCE.get(), HatchVmLoggingContext.INSTANCE.snapshot(), HatchDeviceLoggingContext.INSTANCE.isWatch());
    }

    public final void logEvent(String str, String str2, String str3, String str4, String str5, Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        C7384Etj.A0Y(str, 0);
        logEvent(str, str2, str3, str4, str5, map, hatchAppEventLoggingContext, null);
    }
}
