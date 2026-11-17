package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BFI;
import X.C0924AIa;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.CFK;
import X.HtJ;
import X.HwV;
import X.HxE;
import X.HzP;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;
import com.hatch.browser.protocol.Command;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class LocalBrowserTelemetry {
    public static final int $stable = 0;
    public static final int MAX_PROCESS_EXITS = 8;
    public static final long SELF_TERMINATION_WINDOW_MS = 10000;
    public static final String TAG = "LocalBrowserTelemetry";
    public static final Set<String> TERMINAL_REASONS;
    public static volatile HxE<String, Long> selfTermination;
    public static final LocalBrowserTelemetry INSTANCE = new LocalBrowserTelemetry();
    public static final Set<String> TASK_STATUSES = BFI.A0H(new String[]{"queued", "starting", BrowserTaskPresentation.STATUS_RUNNING, "working", "waiting", "paused", "needs_you", "awaiting_user_input", BrowserTaskPresentation.STATUS_NEEDS_USER, BrowserTaskPresentation.STATUS_USER_CONTROLLED, "completed", "failed", "stopped", "superseded"});

    public final class Task {
        public static final int $stable = 8;
        public final HatchAppEventLoggingContext context;
        public long finished;
        public boolean finishedAfterFailure;
        public final String id;
        public long interrupted;
        public HwV<String, String, String> previousState;
        public long rejected;
        public final long started;
        public long stateSequence;
        public long unknown;

        public Task(String str) {
            Object objA0s;
            C7384Etj.A0Y(str, 0);
            this.id = str;
            this.started = SystemClock.elapsedRealtime();
            try {
                objA0s = HatchAppEventLogger.INSTANCE.captureContext();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            this.context = (HatchAppEventLoggingContext) (objA0s instanceof C10571Hud ? null : objA0s);
        }

        public final void sdkReport(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                boolean z = false;
                if (iHashCode != -1947652542) {
                    if (iHashCode != -673660814) {
                        if (iHashCode == -608496514 && str.equals("rejected")) {
                            this.rejected++;
                            this.finishedAfterFailure = z;
                            return;
                        }
                    } else if (str.equals("finished")) {
                        this.finished++;
                        if (this.rejected + this.interrupted > 0) {
                            z = true;
                            this.finishedAfterFailure = z;
                            return;
                        }
                        return;
                    }
                } else if (str.equals(HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED)) {
                    this.interrupted++;
                    this.finishedAfterFailure = z;
                    return;
                }
            }
            this.unknown++;
        }

        public final void state(String str, String str2, String str3) {
            String str4 = str3;
            AnonymousClass005.A0x(str, str2, str4);
            boolean zEquals = str4.equals("");
            String str5 = DeviceSmsReaderKt.ATTACHMENT_OTHER;
            if (zEquals) {
                str4 = "not_provided";
            } else if (!LocalBrowserTelemetry.TERMINAL_REASONS.contains(str4)) {
                str4 = DeviceSmsReaderKt.ATTACHMENT_OTHER;
            }
            String strReplace = C3cJ.A0J(str2).replace(' ', '_');
            if (LocalBrowserTelemetry.TASK_STATUSES.contains(strReplace)) {
                str5 = strReplace;
            }
            HwV<String, String, String> hwV = new HwV<>(str, str5, str4);
            if (C7384Etj.areEqual(this.previousState, hwV)) {
                return;
            }
            this.previousState = hwV;
            long j = this.stateSequence + 1;
            this.stateSequence = j;
            LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
            HxE hxEA0r = C3cG.A0r(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, this.id);
            HxE hxEA0r2 = C3cG.A0r("result", str);
            HxE hxEA0r3 = C3cG.A0r("outcome_scope", HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_BROWSER_TASK);
            HxE hxEA0r4 = C3cG.A0r("state_source", "server_presentation");
            HxE hxEA0r5 = C3cG.A0r("task_status", str5);
            HxE hxEA0r6 = C3cG.A0r("state_sequence", String.valueOf(j));
            HxE hxEA0r7 = C3cG.A0r("terminal_reason", str4);
            HxE hxEA0r8 = C3cG.A0r("terminal_reason_category", localBrowserTelemetry.terminalReasonCategory(str4));
            long j2 = this.finished;
            long j3 = this.rejected;
            long j4 = this.interrupted;
            long j5 = this.unknown;
            localBrowserTelemetry.event("local_browser_task_state", "transition", AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA0r7, hxEA0r8, C3cG.A0r("sdk_report_count", String.valueOf(j2 + j3 + j4 + j5)), C3cG.A0r("sdk_finished_count", String.valueOf(j2)), C3cG.A0r("sdk_rejected_count", String.valueOf(j3)), C3cG.A0r("sdk_interrupted_count", String.valueOf(j4)), C3cG.A0r("sdk_unknown_count", String.valueOf(j5)), C3cG.A0r("sdk_finished_after_failure", String.valueOf(this.finishedAfterFailure)), C3cG.A0r("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.started))), this.context);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTelemetry", f = "LocalBrowserTelemetry.kt", l = {210}, m = "operation", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTelemetry$operation$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTelemetry.this.operation(null, null, null, null, this);
        }
    }

    public final String commandName(Command command) {
        C7384Etj.A0Y(command, 0);
        if (command instanceof Command.Observe) {
            return "observe";
        }
        if (command.equals(Command.Info.INSTANCE)) {
            return "info";
        }
        if (command instanceof Command.ReadPage) {
            return "read_page";
        }
        if (command instanceof Command.ReadElement) {
            return "read_element";
        }
        if (command instanceof Command.ReadElementFields) {
            return "read_element_fields";
        }
        if (command instanceof Command.Wait) {
            return "wait";
        }
        if (command instanceof Command.Click) {
            return "click";
        }
        if (command instanceof Command.Hover) {
            return "hover";
        }
        if (command instanceof Command.Focus) {
            return "focus";
        }
        if (command instanceof Command.Fill) {
            return "fill";
        }
        if (command instanceof Command.Select) {
            return "select";
        }
        if (command instanceof Command.SetChecked) {
            return "set_checked";
        }
        if (command instanceof Command.Press) {
            return "press";
        }
        if (command instanceof Command.Scroll) {
            return "scroll";
        }
        if (command instanceof Command.ResumeSubmit) {
            return "resume_submit";
        }
        if (command instanceof Command.Navigate) {
            return "navigate";
        }
        if (command instanceof Command.History) {
            return "history";
        }
        if (command.equals(Command.Reload.INSTANCE)) {
            return "reload";
        }
        if (command instanceof Command.CredentialRefsPreflight) {
            return "credential_refs_preflight";
        }
        if (command instanceof Command.CredentialFill) {
            return "credential_fill";
        }
        if (command instanceof Command.CredentialClear) {
            return "credential_clear";
        }
        if (command.equals(Command.ShopifyCheckout.INSTANCE)) {
            return "shopify_checkout";
        }
        if (command instanceof Command.ShopPayApprove) {
            return "shop_pay_approve";
        }
        if (command instanceof Command.Capture) {
            return "capture";
        }
        if (command instanceof Command.CaptureChallenge) {
            return "capture_challenge";
        }
        if (command instanceof Command.PointerPath) {
            return "pointer_path";
        }
        if (command instanceof Command.Pdf) {
            return "pdf";
        }
        if (command instanceof Command.ClickAt) {
            return "click_at";
        }
        if (command instanceof Command.FillAt) {
            return "fill_at";
        }
        if (command instanceof Command.ScrollAt) {
            return "scroll_at";
        }
        if (command instanceof Command.Upload) {
            return "upload";
        }
        if (command instanceof Command.UploadProbe) {
            return "upload_probe";
        }
        if (command instanceof Command.Download) {
            return HatchDataExportLoggingKt.PHASE_DOWNLOAD;
        }
        if (command instanceof Command.VisualProgram) {
            return "visual_program";
        }
        throw C3cG.A0q();
    }

    public final void event(String str, String str2, Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass005.A0x(str, str2, map);
        try {
            Map<String, String> mapA11 = AnonymousClass006.A11("telemetry_version", "2", map);
            CFK.A01(str, str2, mapA11, TAG, "%s %s %s");
            HatchAppEventLogger.INSTANCE.logEvent(str, null, "browser", str2, "local_browser", mapA11, hatchAppEventLoggingContext);
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
    }

    public final String exceptionClass(Throwable th) {
        C7384Etj.A0Y(th, 0);
        return th instanceof TimeoutCancellationException ? "timeout" : th instanceof CancellationException ? "cancelled" : th instanceof IOException ? "io" : th instanceof SecurityException ? "security" : th instanceof IllegalArgumentException ? "invalid_argument" : th instanceof IllegalStateException ? "invalid_state" : DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    public final void rendererResponsive(String str, long j) {
        C7384Etj.A0Y(str, 0);
        rendererCheck(str, "responsive", j);
    }

    public final void rendererTerminated(String str, boolean z, long j) {
        String str2;
        C7384Etj.A0Y(str, 0);
        if (z) {
            selfTermination = C3cG.A0r(str, C3cI.A0O());
            str2 = "terminated";
        } else {
            str2 = "terminate_failed";
        }
        rendererCheck(str, str2, j);
    }

    static {
        String[] strArr = new String[52];
        System.arraycopy(new String[]{"browser_agent_reported_failure", "browser_agent_reported_timeout", "browser_vm_lease_unavailable", "browser_cell_unavailable", "browser_owner_no_hand_off", "browser_owner_interrupted", "browser_owner_shutdown", "browser_owner_rate_limited", "browser_owner_provider_error", "browser_owner_stream_error", "browser_owner_output_token_cap", "browser_owner_runtime_error", "browser_owner_error", "browser_owner_lost_invalid_stream_id", "browser_owner_lost_missing_evidence", "browser_owner_lost_stale_message", "browser_slot_lost_running_stale_revision", "browser_slot_lost_running_not_agent_mode", "browser_slot_lost_running_rehydrate_incompatible", "browser_slot_lost_parked_stale_revision", "browser_slot_lost_parked_not_agent_mode", "browser_slot_lost_parked_rehydrate_incompatible", "browser_slot_rehydration_failed", "browser_same_task_continuation_slot_missing", "browser_same_task_continuation_target_missing", "browser_slot_rehydration_failed_retired_unknown", "browser_slot_rehydration_failed_ambiguous_hbi_mutation"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"browser_slot_rehydration_failed_route_authority_lost", "browser_slot_rehydration_failed_environment_refresh_failed", "browser_slot_rehydration_failed_lease_ttl_expired", "browser_slot_rehydration_failed_lease_renew_terminal", "browser_slot_rehydration_failed_lease_renew_retry_exhausted", "browser_slot_rehydration_failed_launch_reconciliation", "browser_slot_lost_during_user_control", "browser_slot_lost_after_ambiguous_takeover", "browser_initial_submission_failed", "browser_running_settlement_failed", "browser_successor_submission_failed", "browser_starting_fence_lost_after_slot_ensure", "browser_stale_slot_released", "starting_task_not_replayed", "browser_task_unexpected_active_status", "needs_user_runway_unavailable", "browser_takeover_quiesce_recovery_failed", "browser_takeover_live_lease_commit_failed", "browser_takeover_owner_cancel_failed", "user_stop", "browser_approval_denied", "browser_approval_timed_out", BrowserTaskDisplayStatus.REASON_AWAITING_INPUT_TIMED_OUT, BrowserTaskDisplayStatus.REASON_CONTROL_HEARTBEAT_TIMED_OUT, "browser_terminal_reason_unrecognized"}, 0, strArr, 27, 25);
        TERMINAL_REASONS = BFI.A0H(strArr);
    }

    public static /* synthetic */ void event$default(LocalBrowserTelemetry localBrowserTelemetry, String str, String str2, Map map, HatchAppEventLoggingContext hatchAppEventLoggingContext, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchAppEventLoggingContext = null;
        }
        localBrowserTelemetry.event(str, str2, map, hatchAppEventLoggingContext);
    }

    private final void rendererCheck(String str, String str2, long j) {
        event("local_browser_renderer_check", "outcome", C3cH.A0n("app_state", appState(), C3cG.A0r("detected_by", str), C3cG.A0r("result", str2), C3cG.A0r("unresponsive_ms", String.valueOf(j))), null);
    }

    public final String appState() {
        return AuraAppLifecycleManager.INSTANCE.isAppInForeground() ? "foreground" : "background";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HtJ] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object operation(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r24, X.HtJ<? super T> r25) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTelemetry.operation(java.lang.String, java.lang.String, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    public final Map<String, String> processExit(Context context, Integer num) {
        String str;
        HxE hxEA0r;
        C7384Etj.A0Y(context, 0);
        if (num == null || Build.VERSION.SDK_INT < 30) {
            str = "unavailable";
        } else {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                ApplicationExitInfo applicationExitInfo = null;
                List<ApplicationExitInfo> historicalProcessExitReasons = activityManager != null ? activityManager.getHistoricalProcessExitReasons(context.getPackageName(), num.intValue(), 8) : null;
                if (historicalProcessExitReasons == null) {
                    hxEA0r = C3cG.A0r("process_exit_reason", "lookup_failed");
                    return AIW.A0J(hxEA0r);
                }
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ApplicationExitInfo next = it.next();
                    if (C7384Etj.areEqual(next.getProcessName(), context.getApplicationInfo().processName)) {
                        applicationExitInfo = next;
                        break;
                    }
                }
                ApplicationExitInfo applicationExitInfo2 = applicationExitInfo;
                if (applicationExitInfo2 != null) {
                    return AnonymousClass007.A0d("process_exit_time_ms", String.valueOf(applicationExitInfo2.getTimestamp()), C3cG.A0r("process_exit_reason", processExitReason(applicationExitInfo2.getReason())));
                }
                str = "not_found";
            } catch (RuntimeException e) {
                return AnonymousClass007.A0d("exception_class", exceptionClass(e), C3cG.A0r("process_exit_reason", "lookup_failed"));
            }
        }
        hxEA0r = C3cG.A0r("process_exit_reason", str);
        return AIW.A0J(hxEA0r);
    }

    public final String rendererTerminatedBy() {
        String str;
        HxE<String, Long> hxE = selfTermination;
        return (hxE == null || C3cG.A04(C3cG.A05(hxE.second)) > 10000 || (str = hxE.first) == null) ? PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM : str;
    }

    private final String processExitReason(int i) {
        switch (i) {
            case 1:
                return "exit_self";
            case 2:
                return "signaled";
            case 3:
                return LocalBrowserDeviceConditionsKt.LOW_MEMORY;
            case 4:
                return "crash";
            case 5:
                return "crash_native";
            case 6:
                return "anr";
            case 7:
                return "initialization_failure";
            case 8:
                return "permission_change";
            case 9:
                return "excessive_resource_usage";
            case 10:
                return "user_requested";
            case 11:
                return "user_stopped";
            case 12:
                return "dependency_died";
            case 13:
                return DeviceSmsReaderKt.ATTACHMENT_OTHER;
            case 14:
                return "freezer";
            case 15:
                return "package_state_change";
            case 16:
                return "package_updated";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String terminalReasonCategory(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1269707155: goto La;
                case -767629594: goto Ld;
                case -712348034: goto L10;
                case -540292337: goto L13;
                case -263399999: goto L1e;
                case 106069776: goto L21;
                case 339508214: goto L2c;
                case 576143872: goto L2f;
                case 1487165232: goto L3a;
                case 1498352079: goto L45;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "runtime"
            return r0
        La:
            java.lang.String r0 = "user_control_heartbeat_timed_out"
            goto L3c
        Ld:
            java.lang.String r0 = "browser_agent_reported_timeout"
            goto L15
        L10:
            java.lang.String r0 = "browser_terminal_reason_unrecognized"
            goto L23
        L13:
            java.lang.String r0 = "browser_agent_reported_failure"
        L15:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "agent_reported"
            return r0
        L1e:
            java.lang.String r0 = "browser_approval_timed_out"
            goto L3c
        L21:
            java.lang.String r0 = "other"
        L23:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "unknown"
            return r0
        L2c:
            java.lang.String r0 = "user_stop"
            goto L31
        L2f:
            java.lang.String r0 = "browser_approval_denied"
        L31:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "user_action"
            return r0
        L3a:
            java.lang.String r0 = "awaiting_user_input_timed_out"
        L3c:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "user_wait_expired"
            return r0
        L45:
            java.lang.String r1 = "not_provided"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTelemetry.terminalReasonCategory(java.lang.String):java.lang.String");
    }

    public final void scopeFailure(String str, Throwable th, String str2) {
        AnonymousClass003.A0u(str, th);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("failure_stage", str);
        c0924AIaA0u.put("exception_class", INSTANCE.exceptionClass(th));
        if (str2 != null) {
            c0924AIaA0u.put(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, str2);
        }
        event("local_browser_scope_failure", "error", AIW.A0K(c0924AIaA0u), null);
    }
}
