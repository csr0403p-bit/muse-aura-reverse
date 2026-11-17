package com.facebook.aura.conversation.viewmodel;

import X.AGH;
import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C7384Etj;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEnvironmentValuesKt;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.bugreport.AuraBugReportReviewViewModelKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.commands.sms.SmsMediaUploaderKt;
import com.facebook.aura.composer.upload.AttachmentCategory;
import com.facebook.aura.composer.upload.AttachmentUploadException;
import com.facebook.aura.composer.upload.UploadLogAttachment;
import com.facebook.aura.memory.AuraMemory;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AttachmentUploadAnalytics {
    public static final int $stable = 0;
    public static final String COMPONENT = "attachment_upload";
    public static final AttachmentUploadAnalytics INSTANCE = new AttachmentUploadAnalytics();
    public static final String SURFACE = "chat_composer";

    public final void attemptFinished(UploadLogAttachment uploadLogAttachment, int i, Throwable th, long j) {
        C7384Etj.A0Y(uploadLogAttachment, 0);
        log("attachment_upload_attempt", th == null ? "success" : "error", AGH.A02(AGH.A02(attachmentMetadata(uploadLogAttachment), AnonymousClass007.A0d("latency_bucket", latencyBucket(j), C3cG.A0r(HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, String.valueOf(i)))), outcomeMetadata(th)));
    }

    public final void chipAction(UploadLogAttachment uploadLogAttachment, UploadChipAction uploadChipAction) {
        C7384Etj.A0Y(uploadLogAttachment, 0);
        C7384Etj.A0Y(uploadChipAction, 1);
        log("attachment_upload_chip_action", "click", AGH.A02(attachmentMetadata(uploadLogAttachment), AnonymousClass007.A0d("retry_count", String.valueOf(uploadLogAttachment.manualRetryCount), C3cG.A0r("action", uploadChipAction.getValue()))));
    }

    public final void completed(UploadLogAttachment uploadLogAttachment, int i, long j, long j2) {
        C7384Etj.A0Y(uploadLogAttachment, 0);
        log("attachment_upload_completed", "success", AGH.A02(attachmentMetadata(uploadLogAttachment), C3cH.A0n("size_bucket", sizeBucket(j2), C3cG.A0r("attempts_used", String.valueOf(i)), C3cG.A0r("recovered_by_retry", String.valueOf(i > 1 || uploadLogAttachment.manualRetryCount > 0)), C3cG.A0r("latency_bucket", latencyBucket(j)))));
    }

    public final void importFailed(UploadLogAttachment uploadLogAttachment, UploadStage uploadStage) {
        C7384Etj.A0Y(uploadLogAttachment, 0);
        C7384Etj.A0Y(uploadStage, 1);
        log("attachment_import_failed", "error", AnonymousClass006.A11(AgeCheckFunnelLogging.KEY_STAGE, uploadStage.getValue(), attachmentMetadata(uploadLogAttachment)));
    }

    public final void uploadCancelled(UploadLogAttachment uploadLogAttachment, int i) {
        C7384Etj.A0Y(uploadLogAttachment, 0);
        stageFailed(uploadLogAttachment, UploadStage.Cancelled, i, null);
    }

    public final void uploadStarted(UploadLogAttachment uploadLogAttachment, long j) {
        C7384Etj.A0Y(uploadLogAttachment, 0);
        log("attachment_upload_started", HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, AnonymousClass006.A11("size_bucket", sizeBucket(j), attachmentMetadata(uploadLogAttachment)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentCategory.values().length];
            try {
                AnonymousClass002.A13(AttachmentCategory.IMAGE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AttachmentCategory.VIDEO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AttachmentCategory.OTHER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map<String, String> attachmentMetadata(UploadLogAttachment uploadLogAttachment) {
        return C3cH.A0m("manual_retry_count", String.valueOf(uploadLogAttachment.manualRetryCount), C3cG.A0r("attachment_id", uploadLogAttachment.id), C3cG.A0r("mime_category", logValue(AttachmentCategory.Companion.fromMimeType(uploadLogAttachment.mimeType))));
    }

    private final Map<String, String> environmentMetadata() {
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("network_type", HatchEnvironmentValuesKt.hatchNetworkTypeValue());
        Boolean boolNetworkIsMetered = INSTANCE.networkIsMetered();
        if (boolNetworkIsMetered != null) {
            c0924AIa.put("net_expensive", String.valueOf(boolNetworkIsMetered.booleanValue()));
        }
        c0924AIa.put("app_state", HatchEnvironmentValuesKt.hatchAppStateValue());
        return AIW.A0K(c0924AIa);
    }

    private final UploadStage failureStage(Throwable th) {
        AttachmentUploadException attachmentUploadException;
        String str;
        int iHashCode;
        Integer num;
        return (!(th instanceof AttachmentUploadException) || (attachmentUploadException = (AttachmentUploadException) th) == null || (str = attachmentUploadException.errorClass) == null || ((iHashCode = str.hashCode()) == -1198220312 ? !str.equals(C60N.A00(FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE)) : iHashCode == -825969408 ? !str.equals("ok_false") : !(iHashCode == 1005820809 && str.equals(C60N.A00(7)) && ((num = attachmentUploadException.httpStatus) == null || !isTransientHttpStatus(num.intValue()))))) ? UploadStage.Upload : UploadStage.ServerReject;
    }

    private final boolean isTransientHttpStatus(int i) {
        if (i == 408 || i == 429) {
            return true;
        }
        return 500 <= i && i < 600;
    }

    private final String latencyBucket(long j) {
        return j < 0 ? "unknown" : j < 1000 ? "<1s" : j < 3000 ? "<3s" : j < 10000 ? "<10s" : j < 30000 ? "<30s" : j < 60000 ? "<60s" : ">=60s";
    }

    private final void log(String str, String str2, Map<String, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent(str, SURFACE, null, str2, COMPONENT, AGH.A02(environmentMetadata(), map), null);
    }

    private final Boolean networkIsMetered() {
        AuraNetworkState.Online online;
        AuraNetworkState value = AuraNetworkMonitor.state.getValue();
        if (!(value instanceof AuraNetworkState.Online) || (online = (AuraNetworkState.Online) value) == null) {
            return null;
        }
        return Boolean.valueOf(online.isMetered);
    }

    private final Map<String, String> outcomeMetadata(Throwable th) {
        if (th == null) {
            return AGH.A0E();
        }
        if (!(th instanceof AttachmentUploadException)) {
            return AIW.A0J(th instanceof IllegalArgumentException ? C3cG.A0r("error_class", "empty_file") : C3cG.A0r("error_class", "exception"));
        }
        C0924AIa c0924AIa = new C0924AIa();
        AttachmentUploadException attachmentUploadException = (AttachmentUploadException) th;
        String str = attachmentUploadException.errorClass;
        c0924AIa.put("error_class", str != null ? str : "exception");
        Integer num = attachmentUploadException.httpStatus;
        if (num != null) {
            c0924AIa.put(C60N.A00(7), String.valueOf(num.intValue()));
        }
        String str2 = attachmentUploadException.serverErrorCode;
        if (str2 != null) {
            c0924AIa.put("server_error_code", str2);
        }
        return AIW.A0K(c0924AIa);
    }

    private final String sizeBucket(long j) {
        return j < 0 ? "unknown" : j < 102400 ? "<100KB" : j < 512000 ? "<500KB" : j < 1048576 ? "<1MB" : j < AuraBugReportReviewViewModelKt.MAX_PREVIEW_BYTES ? "<5MB" : j < SmsMediaUploaderKt.ATTACHMENT_UPLOAD_MAX_BYTES ? "<25MB" : j < 104857600 ? "<100MB" : j < AuraMemory.DEFAULT_MIN_AVAILABLE_MEMORY_BYTES ? "<500MB" : ">=500MB";
    }

    public final void rejected(UploadRejectionReason uploadRejectionReason, AttachmentCategory attachmentCategory, int i) {
        AnonymousClass003.A0u(uploadRejectionReason, attachmentCategory);
        if (i > 0) {
            log("attachment_rejected", "error", C3cH.A0m(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, String.valueOf(i), C3cG.A0r("reason", uploadRejectionReason.getValue()), C3cG.A0r("mime_category", logValue(attachmentCategory))));
        }
    }

    public final void sendOutcome(int i, int i2, int i3, int i4) {
        log("attachment_send_outcome", i3 > 0 ? "error" : "success", C3cH.A0n("attachments_removed", String.valueOf(i4), C3cG.A0r("attachments_total", String.valueOf(i)), C3cG.A0r("attachments_uploaded", String.valueOf(i2)), C3cG.A0r("attachments_failed", String.valueOf(i3))));
    }

    private final String logValue(AttachmentCategory attachmentCategory) {
        int iOrdinal = attachmentCategory.ordinal();
        if (iOrdinal == 0) {
            return "image";
        }
        if (iOrdinal == 1) {
            return "video";
        }
        if (iOrdinal == 2) {
            return "file";
        }
        throw C3cG.A0q();
    }

    private final void stageFailed(UploadLogAttachment uploadLogAttachment, UploadStage uploadStage, int i, Throwable th) {
        log("attachment_upload_stage_failed", "error", AGH.A02(AGH.A02(attachmentMetadata(uploadLogAttachment), AnonymousClass007.A0d(HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, String.valueOf(i), C3cG.A0r(AgeCheckFunnelLogging.KEY_STAGE, uploadStage.getValue()))), outcomeMetadata(th)));
    }

    public final void uploadFailed(UploadLogAttachment uploadLogAttachment, int i, Throwable th) {
        AnonymousClass003.A0v(uploadLogAttachment, th);
        stageFailed(uploadLogAttachment, failureStage(th), i, th);
    }
}
