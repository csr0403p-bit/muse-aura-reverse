package com.facebook.aura.health;

import X.AGH;
import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C60R;
import X.C6tn;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.meta.health.core.MetaHealthError;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class HealthConnectorTelemetry {
    public static final HealthConnectorTelemetry INSTANCE = new HealthConnectorTelemetry();
    public static final String PROVIDER_ADAPTER = "native_sdk";
    public static final String SURFACE = "health_connector";
    public static final String TAG = "HealthConnectorTelemetry";

    public final void consentDenied(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        emitConsentResult("health_consent_denied", str, j, str2);
    }

    public final void consentGranted(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        emitConsentResult("health_consent_granted", str, j, str2);
    }

    public final HealthSyncErrorCategory errorCategory(Throwable th) {
        C7384Etj.A0Y(th, 0);
        return !(th instanceof MetaHealthError.AuthorizationFailed) ? th instanceof CancellationException ? HealthSyncErrorCategory.CANCELLED : ((th instanceof MetaHealthError.IncompleteResult) || (th instanceof MetaHealthError.QueryFailed) || (th instanceof MetaHealthError.SdkUnavailable)) ? HealthSyncErrorCategory.API : HealthSyncErrorCategory.UNKNOWN : HealthSyncErrorCategory.AUTH;
    }

    public final void firstSyncReceived(String str, long j, HealthRecordCounts healthRecordCounts) {
        C7384Etj.A0Y(str, 0);
        C0924AIa c0924AIaA0o = C60R.A0o(str);
        C3cH.A1A("time_to_first_sync_ms", c0924AIaA0o, j);
        if (healthRecordCounts != null) {
            c0924AIaA0o.putAll(healthRecordCounts.metadata());
        }
        emit("health_first_sync_received", AIW.A0K(c0924AIaA0o));
    }

    private final void emit(String str, Map<String, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent(str, SURFACE, null, null, null, map, null);
    }

    private final void emitConsentResult(String str, String str2, long j, String str3) {
        emit(str, C3cH.A0n("connection_attempt_id", str3, C3cG.A0r("provider", str2), C60Q.A0x(), C3cG.A0r("consent_duration_ms", String.valueOf(j))));
    }

    public static /* synthetic */ void firstSyncReceived$default(HealthConnectorTelemetry healthConnectorTelemetry, String str, long j, HealthRecordCounts healthRecordCounts, int i, Object obj) {
        if ((i & 4) != 0) {
            healthRecordCounts = null;
        }
        healthConnectorTelemetry.firstSyncReceived(str, j, healthRecordCounts);
    }

    public static /* synthetic */ void queryCompleted$default(HealthConnectorTelemetry healthConnectorTelemetry, String str, String str2, long j, int i, HealthRecordCounts healthRecordCounts, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            healthRecordCounts = null;
        }
        healthConnectorTelemetry.queryCompleted(str, str2, j, i, healthRecordCounts);
    }

    public static /* synthetic */ void syncCompleted$default(HealthConnectorTelemetry healthConnectorTelemetry, String str, String str2, long j, HealthSyncTrigger healthSyncTrigger, HealthRecordCounts healthRecordCounts, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            healthSyncTrigger = null;
        }
        if ((i & 16) != 0) {
            healthRecordCounts = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        healthConnectorTelemetry.syncCompleted(str, str2, j, healthSyncTrigger, healthRecordCounts, z);
    }

    public static /* synthetic */ void syncFailed$default(HealthConnectorTelemetry healthConnectorTelemetry, String str, String str2, long j, HealthSyncErrorCategory healthSyncErrorCategory, String str3, HealthSyncTrigger healthSyncTrigger, HealthRecordCounts healthRecordCounts, int i, Object obj) {
        if ((i & 32) != 0) {
            healthSyncTrigger = null;
        }
        if ((i & 64) != 0) {
            healthRecordCounts = null;
        }
        healthConnectorTelemetry.syncFailed(str, str2, j, healthSyncErrorCategory, str3, healthSyncTrigger, healthRecordCounts);
    }

    public final void connectionInitiated(String str, String str2, boolean z, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(str2, 1, str3);
        emit("health_connection_initiated", AGH.A0D(C3cG.A0r("provider", str), C60Q.A0x(), C3cG.A0r("trigger", str2), C3cG.A0r("is_first_attempt", String.valueOf(z)), C3cG.A0r("connection_attempt_id", str3)));
    }

    public final void consentShown(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        emit("health_consent_shown", C3cH.A0m("connection_attempt_id", str2, C3cG.A0r("provider", str), C60Q.A0x()));
    }

    public final void disconnected(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        emit("health_disconnected", C3cH.A0m("reason", str2, C3cG.A0r("provider", str), C60Q.A0x()));
    }

    public final void queryFailed(String str, String str2, long j, HealthSyncErrorCategory healthSyncErrorCategory, String str3) {
        AnonymousClass005.A0y(str, str2, healthSyncErrorCategory);
        C7384Etj.A0Y(str3, 4);
        emit("health_query_failed", AGH.A0D(C3cG.A0r("provider", str), C60Q.A0x(), C3cG.A0r("data_types", str2), C3cG.A0r("duration_ms", String.valueOf(j)), C3cG.A0r("error_category", healthSyncErrorCategory.getWireValue()), C3cG.A0r(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, C6tn.A03(str3)), C3cG.A0r("outcome", "failed")));
    }

    public final void queryStarted(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        emit("health_query_started", C3cH.A0m("data_types", str2, C3cG.A0r("provider", str), C60Q.A0x()));
    }

    public final void syncStarted(String str, String str2, HealthSyncTrigger healthSyncTrigger) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(healthSyncTrigger, 2);
        emit("health_sync_started", C3cH.A0n("trigger", healthSyncTrigger.getWireValue(), C3cG.A0r("provider", str), C60Q.A0x(), C3cG.A0r("sync_mode", str2)));
    }

    public final void syncWindowClamped(String str, long j, long j2, int i) {
        C7384Etj.A0Y(str, 0);
        emit("health_sync_window_clamped", AGH.A0D(C3cG.A0r("provider", str), C60Q.A0x(), C3cG.A0r("requested_span_sec", String.valueOf(j)), C3cG.A0r("clamped_span_sec", String.valueOf(j2)), C3cG.A0r("update_count", String.valueOf(i))));
    }

    public final long millisSince(long j) {
        long jA04 = C3cG.A04(j);
        if (jA04 < 0) {
            return 0L;
        }
        return jA04;
    }

    public final long nowMs() {
        return SystemClock.elapsedRealtime();
    }

    public final void queryCompleted(String str, String str2, long j, int i, HealthRecordCounts healthRecordCounts) {
        AnonymousClass003.A0u(str, str2);
        C0924AIa c0924AIaA0o = C60R.A0o(str);
        c0924AIaA0o.put("data_types", str2);
        C3cH.A1A("duration_ms", c0924AIaA0o, j);
        c0924AIaA0o.put("record_count", String.valueOf(i));
        c0924AIaA0o.put("outcome", "success");
        if (healthRecordCounts != null) {
            c0924AIaA0o.putAll(healthRecordCounts.metadata());
        }
        emit("health_query_completed", AIW.A0K(c0924AIaA0o));
    }

    public final void syncCompleted(String str, String str2, long j, HealthSyncTrigger healthSyncTrigger, HealthRecordCounts healthRecordCounts, boolean z) {
        AnonymousClass003.A0u(str, str2);
        C0924AIa c0924AIaA0o = C60R.A0o(str);
        c0924AIaA0o.put("sync_mode", str2);
        C3cH.A1A("duration_ms", c0924AIaA0o, j);
        c0924AIaA0o.put("outcome", "success");
        c0924AIaA0o.put("publish_skipped", String.valueOf(z));
        if (healthSyncTrigger != null) {
            c0924AIaA0o.put("trigger", healthSyncTrigger.getWireValue());
        }
        if (healthRecordCounts != null) {
            c0924AIaA0o.putAll(healthRecordCounts.metadata());
        }
        emit("health_sync_completed", AIW.A0K(c0924AIaA0o));
    }

    public final void syncFailed(String str, String str2, long j, HealthSyncErrorCategory healthSyncErrorCategory, String str3, HealthSyncTrigger healthSyncTrigger, HealthRecordCounts healthRecordCounts) {
        AnonymousClass005.A0y(str, str2, healthSyncErrorCategory);
        C7384Etj.A0Y(str3, 4);
        C0924AIa c0924AIaA0o = C60R.A0o(str);
        c0924AIaA0o.put("sync_mode", str2);
        C3cH.A1A("duration_ms", c0924AIaA0o, j);
        c0924AIaA0o.put("error_category", healthSyncErrorCategory.getWireValue());
        c0924AIaA0o.put(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, C6tn.A03(str3));
        c0924AIaA0o.put("outcome", "failed");
        if (healthSyncTrigger != null) {
            c0924AIaA0o.put("trigger", healthSyncTrigger.getWireValue());
        }
        if (healthRecordCounts != null) {
            c0924AIaA0o.putAll(healthRecordCounts.metadata());
        }
        emit("health_sync_failed", AIW.A0K(c0924AIaA0o));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String telemetryProviderName(java.lang.String r3) {
        /*
            r2 = this;
            int r2 = X.C60R.A03(r3)
            r0 = 102306(0x18fa2, float:1.43361E-40)
            java.lang.String r1 = "google_health_connect"
            if (r2 == r0) goto L29
            r0 = 52778766(0x325570e, float:4.8589076E-37)
            if (r2 == r0) goto L1c
            r0 = 1809497293(0x6bdabccd, float:5.2887483E26)
            if (r2 != r0) goto L1b
            boolean r0 = r3.equals(r1)
        L19:
            if (r0 != 0) goto L28
        L1b:
            return r3
        L1c:
            r0 = 42
            java.lang.String r0 = X.AbstractC7606F5t.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
        L28:
            return r1
        L29:
            java.lang.String r0 = "ghc"
            boolean r0 = r3.equals(r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.health.HealthConnectorTelemetry.telemetryProviderName(java.lang.String):java.lang.String");
    }
}
