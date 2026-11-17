package com.facebook.aura.analytics.hatch;

import X.AnonymousClass003;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.Eu1;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* loaded from: classes3.dex */
public final class HatchNotificationEventsLogger {
    public static final int $stable = 0;
    public static final HatchNotificationEventsLogger INSTANCE = new HatchNotificationEventsLogger();
    public static final String UNKNOWN_TYPE = "unknown";

    public final void logClick(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        submitLog(HatchNotificationEventName.CLICK, hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, null, null);
    }

    public final void logDismiss(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        submitLog(HatchNotificationEventName.DISMISS, hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, null, null);
    }

    public final void logDrop(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, String str4) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        C7384Etj.A0Y(str4, 5);
        submitLog(HatchNotificationEventName.DROP, hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, null, str4);
    }

    public final void logImpression(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        submitLog(HatchNotificationEventName.IMPRESSION, hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, null, null);
    }

    public final void logReceived(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        submitLog(HatchNotificationEventName.RECEIVED, hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, null, null);
    }

    public final void logRelayDrop(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, HatchNotificationRelayDropReason hatchNotificationRelayDropReason) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        C7384Etj.A0Y(hatchNotificationRelayDropReason, 5);
        submitLog(HatchNotificationEventName.RELAY_DROP, hatchNotificationChannel, str, hatchNotificationOrigin, str2, null, str3, hatchNotificationRelayDropReason.getValue());
    }

    public final void logRelaySent(HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3) {
        AnonymousClass003.A0v(hatchNotificationChannel, hatchNotificationOrigin);
        submitLog(HatchNotificationEventName.RELAY_SENT, hatchNotificationChannel, str, hatchNotificationOrigin, str2, null, str3, null);
    }

    private final HatchVmLoggingContext.Attribution attribution(String str) {
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        return (str == null || C7BY.A0j(str) || str.equals(attributionSnapshot.vmId)) ? attributionSnapshot : new HatchVmLoggingContext.Attribution(str, null, null, 0);
    }

    private final String getAppSessionId() {
        return HatchSessionId.INSTANCE.get();
    }

    public static /* synthetic */ void logClick$default(HatchNotificationEventsLogger hatchNotificationEventsLogger, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        hatchNotificationEventsLogger.logClick(hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3);
    }

    public static /* synthetic */ void logDismiss$default(HatchNotificationEventsLogger hatchNotificationEventsLogger, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        hatchNotificationEventsLogger.logDismiss(hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3);
    }

    public static /* synthetic */ void logDrop$default(HatchNotificationEventsLogger hatchNotificationEventsLogger, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        hatchNotificationEventsLogger.logDrop(hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, str4);
    }

    public static /* synthetic */ void logImpression$default(HatchNotificationEventsLogger hatchNotificationEventsLogger, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        hatchNotificationEventsLogger.logImpression(hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3);
    }

    public static /* synthetic */ void logReceived$default(HatchNotificationEventsLogger hatchNotificationEventsLogger, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        hatchNotificationEventsLogger.logReceived(hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3);
    }

    private final void submitLog(HatchNotificationEventName hatchNotificationEventName, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, String str4, String str5) {
        Eu1 eu1AcquireEvent = AuraLogger.INSTANCE.getInstance().acquireEvent("hatch_notification_events");
        if (eu1AcquireEvent.isSampled()) {
            eu1AcquireEvent.A3y("event_name", hatchNotificationEventName.getValue());
            eu1AcquireEvent.A3y("notification_channel", hatchNotificationChannel.getValue());
            if (str == null) {
                str = "unknown";
            }
            eu1AcquireEvent.A3y("notification_type", str);
            eu1AcquireEvent.A3y("notification_origin", hatchNotificationOrigin.getValue());
            eu1AcquireEvent.A3y("ndid", str2);
            eu1AcquireEvent.A3f("client_event_time_ms", C60O.A0k());
            eu1AcquireEvent.A3P(AuraAnalyticsDecoratorImplementation.TIME_SPENT_PARAM_APP_IN_BACKGROUND, C3cG.A0P(AuraAppLifecycleManager.INSTANCE.isAppInForeground()));
            String str6 = HatchSessionId.INSTANCE.get();
            if (str6 != null) {
                eu1AcquireEvent.A3y("session_id", str6);
            }
            if (str5 != null) {
                eu1AcquireEvent.A3y("drop_reason", str5);
            }
            if (str3 != null) {
                eu1AcquireEvent.A3y("inapp_notif_id", str3);
            }
            HatchVmLoggingContext.Attribution attribution = attribution(str4);
            eu1AcquireEvent.A3y("vm_id", attribution.vmId);
            eu1AcquireEvent.A3y(AuraAnalyticsDecoratorImplementation.TIME_SPENT_VM_HOSTNAME, attribution.vmHostname);
            eu1AcquireEvent.A3P(AuraAnalyticsDecoratorImplementation.TIME_SPENT_IS_CVM, attribution.isCvm);
            eu1AcquireEvent.APu();
        }
    }

    public static /* synthetic */ void submitLog$default(HatchNotificationEventsLogger hatchNotificationEventsLogger, HatchNotificationEventName hatchNotificationEventName, HatchNotificationChannel hatchNotificationChannel, String str, HatchNotificationOrigin hatchNotificationOrigin, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        hatchNotificationEventsLogger.submitLog(hatchNotificationEventName, hatchNotificationChannel, str, hatchNotificationOrigin, str2, str3, str4, str5);
    }
}
