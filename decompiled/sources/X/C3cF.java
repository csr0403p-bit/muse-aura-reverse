package X;

import com.facebook.aura.analytics.hatch.caa.HatchCaaEnumsKt;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;
import com.facebook.aura.composer.dictation.vm.VmDictationClient;
import com.facebook.aura.localbrowser.LocalBrowserRuntime;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.notifications.attention.AttentionNotifications;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProviderKt;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.perf.HatchPauseQplLogger;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchDefaultAssistantUtils;
import org.maplibre.android.R;

/* renamed from: X.3cF, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3cF {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return ", reason=";
            case 1:
                return "about:blank";
            case 2:
                return "capacity=";
            case 3:
                return VoiceCallConnectionTracker.STAGE_ENGINE_START_TEARDOWN_UNCONFIRMED;
            case 4:
                return "failure_stage";
            case 5:
                return "no-cache";
            case 6:
                return "postal_code";
            case 7:
                return VoiceCallConnectionTracker.PHASE_RSYS_START_SESSION_END;
            case 8:
                return "schema_version";
            case 9:
                return "session_ended";
            case 10:
                return ", target_id=";
            case 11:
                return "Current mutation had a higher priority";
            case 12:
                return "InvalidRequest";
            case 13:
                return "Mutation interrupted";
            case 14:
                return "NavigateBack";
            case 15:
                return "No maps app available to open the location";
            case 16:
                return "NonRefundable";
            case 17:
                return "Unavailable(reason=";
            case 18:
                return "account_type";
            case 19:
                return HatchCaaErrorType.ALREADY_LOADING;
            case 20:
                return "android.intent.extra.alarm.HOUR";
            case 21:
                return "android.intent.extra.alarm.MESSAGE";
            case 22:
                return "android.intent.extra.alarm.MINUTES";
            case 23:
                return "android.os.action.POWER_SAVE_MODE_CHANGED";
            case 24:
                return AttentionNotifications.APPROVAL_TAG;
            case 25:
                return "aura_approval:";
            case 26:
                return HatchChatNotificationIds.PARAM_BROWSER_TASK_ID;
            case 27:
                return "browser_wake";
            case 28:
                return HatchPauseQplLogger.REASON_CANCELLATION;
            case 29:
                return VoicePrefs.KEY_CAPTIONS_ENABLED;
            case 30:
                return "clearUserData: failed to delete ";
            case 31:
                return HatchDefaultAssistantUtils.EXTRA_ASSIST_SIDE_CHAT_IS_NEW;
            case 32:
                return HatchDefaultAssistantUtils.EXTRA_ASSIST_SIDE_CHAT_SESSION_ID;
            case 33:
                return "content_type";
            case 34:
                return "coroutine_cancelled";
            case 35:
                return "credential_type";
            case 36:
                return "decode_error";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return "disconnected";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return "exception_class";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON;
            case 40:
                return "hatch_user_state_overlay_enabled";
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return "https://www.facebook.com/";
            case 42:
                return HatchCaaEnumsKt.IMPRESSION_ID_KEY;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return LocalBrowserRuntime.ENDPOINT_RECOVERY_REASON;
            case 44:
                return "null cannot be cast to non-null type android.app.Application";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return "onInviteCodeChange(Ljava/lang/String;)V";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return "operation_lease";
            case 48:
                return "outcome_unknown";
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return "phone_number";
            case 50:
                return "reconnecting";
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return HatchAvatarReferenceImageProviderKt.ASSET_KIND_REFRAMED_HATCH;
            case 52:
                return "request_error";
            case 53:
                return HatchNodeCardJsonKt.TYPE_RUN_IN_BACKGROUND;
            case 54:
                return VmDictationClient.SAMPLE_RATE_PARAM;
            case 55:
                return "startForeground blocked, stopping self";
            case 56:
                return VoiceCallConnectionTracker.STAGE_START_EXCEPTION;
            case 57:
                return "terminal_reason";
            case 58:
                return "terminated_by";
            case 59:
                return "text/event-stream";
            case 60:
                return "transcript_characters";
            case 61:
                return "unsupported_operation";
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return "waterfall_id";
            default:
                return "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        }
    }
}
