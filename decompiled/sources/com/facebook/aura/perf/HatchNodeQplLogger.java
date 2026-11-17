package com.facebook.aura.perf;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BV3;
import X.C3cI;
import X.C60P;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C8j2;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchSessionId;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.utils.HatchUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class HatchNodeQplLogger {
    public static final HatchNodeQplLogger INSTANCE = new HatchNodeQplLogger();
    public static final AtomicInteger proactiveInstanceKey = new AtomicInteger(0);
    public static final AtomicInteger registrationInstanceKey = new AtomicInteger(0);

    public final void annotateRegistrationGrants(int i, Map<String, Boolean> map) {
        C7384Etj.A0Y(map, 1);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            String str = (String) entry.getKey();
            HatchQplLogger.INSTANCE.markerAnnotate(734859698, FGI.A0M("granted_", str), ((Boolean) entry.getValue()).booleanValue(), i);
        }
    }

    public final void backfillFailureIfActive(String str, String str2, Throwable th) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (HatchQplLogger.INSTANCE.isMarkerOn(734867918, str)) {
            backfillFailure(str, str2, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, th);
        }
    }

    public final void backfillFinalChunkSent(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        if (num != null) {
            HatchQplLogger.INSTANCE.markerAnnotate(734867918, "chunk_count", num.intValue(), str);
        }
        HatchQplLogger.INSTANCE.markerPoint(734867918, "final_chunk_sent", str);
    }

    public final void backfillSuccess(String str, int i, int i2, int i3) {
        C7384Etj.A0Y(str, 0);
        annotateBackfillVolume(str, i, i2, i3);
        HatchQplLogger.INSTANCE.markerEnd(734867918, (short) 2, str);
    }

    public final void logBackfillEarlyFailure(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0x(str2, str3);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734867918, str, false);
        hatchQplLogger.markerAnnotate(734867918, PhotosSearchHandlerKt.PARAM_SOURCE, str2, str);
        HatchQplLogger.INSTANCE.markerAnnotate(734867918, "request_id_prefix", C6tn.A02(str), str);
        backfillFailure(str, str3, 0, 0, 0, null);
    }

    public final void logCommandDispatchFailed(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734868931, str, false);
        try {
            hatchQplLogger.markerAnnotate(734868931, NodeCommandFallbackWorker.KEY_COMMAND, str2, str);
            HatchQplLogger hatchQplLogger2 = HatchQplLogger.INSTANCE;
            hatchQplLogger2.markerAnnotate(734868931, "command_category", commandCategory(str2), str);
            hatchQplLogger2.markerAnnotate(734868931, "request_id_prefix", C6tn.A02(str), str);
        } finally {
            commandFailure(str, "dispatch_failed", null);
        }
    }

    public final void logCommandRedeliveredDropped(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C60P.A1G(str2).markEventBuilder(734868931, "redelivered_dropped").annotate(NodeCommandFallbackWorker.KEY_COMMAND, str2).annotate("command_category", commandCategory(str2)).annotate("request_id_prefix", C6tn.A02(str)).report();
    }

    public final void proactiveCancelled(int i, String str) {
        C7384Etj.A0Y(str, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734856635, "cancel_reason", str, i);
        hatchQplLogger.markerEnd(734856635, (short) 4, i);
    }

    public final void proactiveFailure(int i, String str, Throwable th) {
        C7384Etj.A0Y(str, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734856635, "error_code", str, i);
        if (th != null) {
            hatchQplLogger.markerAnnotate(734856635, "error_type", C3cI.A0Y(th), i);
        }
        hatchQplLogger.markerEnd(734856635, (short) 3, i);
    }

    public final void registrationFailure(int i, String str, Throwable th) {
        C7384Etj.A0Y(str, 1);
        annotateFailure(734859698, i, str, th);
        HatchQplLogger.INSTANCE.markerEnd(734859698, (short) 3, i);
    }

    public final void startBackfill(String str, String str2, boolean z, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(str2, 1, str3);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734867918, str, false);
        hatchQplLogger.markerAnnotate(734867918, "app_session_id", HatchSessionId.INSTANCE.get(), str);
        annotateAppUid(734867918, str3, str);
        hatchQplLogger.markerAnnotate(734867918, PhotosSearchHandlerKt.PARAM_SOURCE, str2, str);
        hatchQplLogger.markerAnnotate(734867918, "request_id_prefix", C6tn.A02(str), str);
        hatchQplLogger.markerAnnotate(734867918, "supports_backfill", z, str);
    }

    public final void startCommand(String str, String str2, String str3, boolean z, String str4, Long l) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0x(str2, str3);
        C7384Etj.A0Y(str4, 4);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734868931, str, false);
        hatchQplLogger.markerAnnotate(734868931, "app_session_id", HatchSessionId.INSTANCE.get(), str);
        annotateAppUid(734868931, str4, str);
        hatchQplLogger.markerAnnotate(734868931, NodeCommandFallbackWorker.KEY_COMMAND, str2, str);
        hatchQplLogger.markerAnnotate(734868931, "command_category", commandCategory(str2), str);
        hatchQplLogger.markerAnnotate(734868931, "request_id_prefix", C6tn.A02(str), str);
        hatchQplLogger.markerAnnotate(734868931, "connection_state", str3, str);
        hatchQplLogger.markerAnnotate(734868931, "is_registered", z, str);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 2147483647L) {
                jLongValue = 2147483647L;
            }
            hatchQplLogger.markerAnnotate(734868931, "timeout_ms", (int) jLongValue, str);
        }
    }

    private final void annotateAppUid(int i, String str, int i2) {
        if (!HatchUtil.INSTANCE.isViewerEmployee() || str.length() <= 0) {
            return;
        }
        HatchQplLogger.INSTANCE.markerAnnotate(i, AuraAnalyticsDecoratorImplementation.TIME_SPENT_APP_UID, str, i2);
    }

    private final void annotateBackfillVolume(String str, int i, int i2, int i3) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734867918, "chunks_attempted", i, str);
        hatchQplLogger.markerAnnotate(734867918, "chunks_rejected", i2, str);
        hatchQplLogger.markerAnnotate(734867918, C8j2.A00(22), i3, str);
    }

    private final void annotateFailure(int i, int i2, String str, Throwable th) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(i, "error_code", str, i2);
        if (th != null) {
            hatchQplLogger.markerAnnotate(i, "error_type", C3cI.A0Y(th), i2);
        }
    }

    public static /* synthetic */ void backfillFailure$default(HatchNodeQplLogger hatchNodeQplLogger, String str, String str2, int i, int i2, int i3, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            i2 = 0;
        }
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        if ((i4 & 32) != 0) {
            th = null;
        }
        hatchNodeQplLogger.backfillFailure(str, str2, i, i2, i3, th);
    }

    public static /* synthetic */ void backfillFailureIfActive$default(HatchNodeQplLogger hatchNodeQplLogger, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        hatchNodeQplLogger.backfillFailureIfActive(str, str2, th);
    }

    private final String commandCategory(String str) {
        if ("message.draft".equals(str) || "message.send".equals(str)) {
            return HatchNodeCardJsonKt.TYPE_MESSAGING;
        }
        C7384Etj.A0Y(str, 0);
        return (str.endsWith(".search") || str.endsWith(".list") || str.endsWith(".get") || "network.state".equals(str)) ? "data_read" : "action";
    }

    public static /* synthetic */ void commandFailure$default(HatchNodeQplLogger hatchNodeQplLogger, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        hatchNodeQplLogger.commandFailure(str, str2, th);
    }

    private final String getAppSessionId() {
        return HatchSessionId.INSTANCE.get();
    }

    public static /* synthetic */ void proactiveFailure$default(HatchNodeQplLogger hatchNodeQplLogger, int i, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        hatchNodeQplLogger.proactiveFailure(i, str, th);
    }

    public static /* synthetic */ void registrationFailure$default(HatchNodeQplLogger hatchNodeQplLogger, int i, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        hatchNodeQplLogger.registrationFailure(i, str, th);
    }

    public final void proactiveCounts(int i, int i2, int i3, int i4, int i5) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734856635, BV3.A00(9), i2, i);
        hatchQplLogger.markerAnnotate(734856635, "items_added", i3, i);
        hatchQplLogger.markerAnnotate(734856635, "items_updated", i4, i);
        hatchQplLogger.markerAnnotate(734856635, "items_removed", i5, i);
    }

    public final void proactiveSuccess(int i) {
        HatchQplLogger.INSTANCE.markerEnd(734856635, (short) 2, i);
    }

    public final void registrationAttempt(int i, int i2) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734859698, HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, i2, i);
        hatchQplLogger.markerPoint(734859698, "register_attempt", i);
    }

    public final void registrationCancelled(int i) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734859698, "cancel_reason", "cancelled", i);
        hatchQplLogger.markerEnd(734859698, (short) 4, i);
    }

    public final void registrationSnapshotBuilt(int i, int i2, int i3) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734859698, "data_source_count", i2, i);
        hatchQplLogger.markerAnnotate(734859698, "command_count", i3, i);
    }

    public final void registrationSuccess(int i) {
        HatchQplLogger.INSTANCE.markerEnd(734859698, (short) 2, i);
    }

    public final int startProactiveSync(String str, String str2, String str3) {
        AnonymousClass005.A10(str, str2, str3);
        int iIncrementAndGet = proactiveInstanceKey.incrementAndGet();
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734856635, iIncrementAndGet, false);
        hatchQplLogger.markerAnnotate(734856635, "app_session_id", HatchSessionId.INSTANCE.get(), iIncrementAndGet);
        annotateAppUid(734856635, str3, iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734856635, PhotosSearchHandlerKt.PARAM_SOURCE, str, iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734856635, GeofenceEventWorker.KEY_TRIGGER_TYPE, str2, iIncrementAndGet);
        return iIncrementAndGet;
    }

    private final int nodeMarker(boolean z) {
        return z ? 734867918 : 734868931;
    }

    public final void backfillAckSent(String str) {
        C60Q.A0P(str).markerPoint(734867918, "ack_sent", str);
    }

    public final void backfillFailure(String str, String str2, int i, int i2, int i3, Throwable th) {
        AnonymousClass003.A0u(str, str2);
        annotateBackfillVolume(str, i, i2, i3);
        annotateFailure(734867918, str, str2, th);
        HatchQplLogger.INSTANCE.markerEnd(734867918, (short) 3, str);
    }

    public final void backfillFirstChunkSent(String str) {
        C60Q.A0P(str).markerPoint(734867918, "first_chunk_sent", str);
    }

    public final void backfillHitlResolved(String str) {
        C60Q.A0P(str).markerPoint(734867918, "hitl_resolved", str);
    }

    public final void backfillPermissionChecked(String str) {
        C60Q.A0P(str).markerPoint(734867918, "permission_checked", str);
    }

    public final void commandCancelled(String str) {
        HatchQplLogger hatchQplLoggerA0P = C60Q.A0P(str);
        hatchQplLoggerA0P.markerAnnotate(734868931, "cancel_reason", "cancelled", str);
        hatchQplLoggerA0P.markerEnd(734868931, (short) 4, str);
    }

    public final void commandFailure(String str, String str2, Throwable th) {
        AnonymousClass003.A0u(str, str2);
        annotateFailure(734868931, str, str2, th);
        HatchQplLogger.INSTANCE.markerEnd(734868931, (short) 3, str);
    }

    public final void commandHandlerStarted(String str) {
        C60Q.A0P(str).markerPoint(734868931, "handler_started", str);
    }

    public final void commandHitlResolved(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734868931, "hitl_access", str2, str);
        hatchQplLogger.markerAnnotate(734868931, "hitl_group", str3, str);
        hatchQplLogger.markerPoint(734868931, "hitl_resolved", str);
    }

    public final void commandPermissionChecked(String str) {
        C60Q.A0P(str).markerPoint(734868931, "permission_checked", str);
    }

    public final void commandSuccess(String str) {
        C60Q.A0P(str).markerEnd(734868931, (short) 2, str);
    }

    public final void permissionCardEnded(String str, boolean z, String str2) {
        AnonymousClass003.A0v(str, str2);
        int iNodeMarker = nodeMarker(z);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(iNodeMarker, "permission_card", str2, str);
        hatchQplLogger.markerPoint(iNodeMarker, "permission_card_end", str);
    }

    public final void permissionCardStarted(String str, boolean z) {
        C60Q.A0P(str).markerPoint(nodeMarker(z), "permission_card_start", str);
    }

    public final int startRegistration(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        int iIncrementAndGet = registrationInstanceKey.incrementAndGet();
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734859698, iIncrementAndGet, zA1b);
        hatchQplLogger.markerAnnotate(734859698, "app_session_id", HatchSessionId.INSTANCE.get(), iIncrementAndGet);
        annotateAppUid(734859698, str2, iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734859698, "connection_state", str, iIncrementAndGet);
        return iIncrementAndGet;
    }

    private final void annotateAppUid(int i, String str, String str2) {
        if (HatchUtil.INSTANCE.isViewerEmployee() && str.length() > 0) {
            HatchQplLogger.INSTANCE.markerAnnotate(i, AuraAnalyticsDecoratorImplementation.TIME_SPENT_APP_UID, str, str2);
        }
    }

    private final void annotateFailure(int i, String str, String str2, Throwable th) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(i, "error_code", str2, str);
        if (th != null) {
            hatchQplLogger.markerAnnotate(i, "error_type", C3cI.A0Y(th), str);
        }
    }
}
