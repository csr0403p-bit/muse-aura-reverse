package X;

import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.AgeVerificationClientKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.browsertask.conversation.BrowserSignInPushPresenterKt;
import com.facebook.aura.bugreport.AuraNetworkLogBugReportContributor;
import com.facebook.aura.commands.location.HatchLocationProviderKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.connectorconsent.LocalConnectorConsent;
import com.facebook.aura.devices.link.startup.DeviceRepairCheckJobKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt;
import com.facebook.aura.nodes.datasource.HatchProactiveTriggerManagerKt;
import com.facebook.aura.notifications.push.AuraNotificationChannels;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.notifications.push.VmLockedPushHandler;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContextKt;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClientKt;
import com.facebook.aura.uicontrol.UiControlDispatcherKt;
import com.facebook.aura.widgets.SpaceSnapshotRendererKt;
import org.maplibre.android.R;

/* renamed from: X.60N, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60N {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "Unknown error";
            case 1:
                return HatchCallJoinContextKt.COSMOS_JOIN_NO_RESPONSE;
            case 2:
                return "Failed to execute request";
            case 3:
                return ", color=";
            case 4:
                return CachingHatchHttpClientKt.CACHE_CONTROL_HEADER;
            case 5:
                return HatchUrl.DOMAIN;
            case 6:
                return "androidx.activity.result.contract.extra.PERMISSIONS";
            case 7:
                return "http_status";
            case 8:
                return " bytes)";
            case 9:
                return ", isRtl=";
            case 10:
                return ", operation=";
            case 11:
                return ", thumbnailUrl=";
            case 12:
                return "Conflict";
            case 13:
                return HatchGatewayConnectionKt.TAG;
            case 14:
                return "Initializing";
            case 15:
                return HatchChatNotificationIds.PARAM_PUSH_NOTIF_ID;
            case 16:
                return ScopedNoiseIdentityProbeKt.TAG;
            case 17:
                return SpacesWebViewFactoryKt.TAG;
            case 18:
                return "action=";
            case 19:
                return "android.intent.action.DIAL";
            case 20:
                return "android.intent.extra.TEXT";
            case 21:
                return "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
            case 22:
                return HatchNavTTRCSpec.AnnotationKeys.GOAL_COUNT;
            case 23:
                return "hatch://thread/";
            case 24:
                return "https://hatch-api.meta.ai";
            case 25:
                return "no-store";
            case 26:
                return "null cannot be cast to non-null type android.app.NotificationManager";
            case 27:
                return "partial";
            case 28:
                return "persistent";
            case 29:
                return "property";
            case 30:
                return "unresolved";
            case 31:
                return " error: HTTP ";
            case 32:
                return " permissions.";
            case 33:
                return "#%02X%02X%02X";
            case 34:
                return ", contentScale=";
            case 35:
                return ", expression=";
            case 36:
                return ", horizontalAlignment=";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return ", textColor=";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return ", verticalAlignment=";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return ".cf.metaaiusercontent.com";
            case 40:
                return AuraAcceptLanguage.HEADER;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return "Application context not available";
            case 42:
                return "AuraBugReportSender";
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return "Content-Type";
            case 44:
                return "DOCUMENT_START_SCRIPT";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return DeviceRepairCheckJobKt.TAG;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return "Exception validating JS bridge token";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return "Failed to publish ";
            case 48:
                return HatchLocationProviderKt.TAG;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return HatchProactiveTriggerManagerKt.TAG;
            case 50:
                return HatchStorageRecoveryClientKt.TAG;
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return "Missing credentials";
            case 52:
                return "Request failed";
            case 53:
                return "SHA256withECDSA";
            case 54:
                return SpaceSnapshotRendererKt.TAG;
            case 55:
                return AuraNetworkLogBugReportContributor.UNSUPPORTED_REPORT;
            case 56:
                return "Upload failed for ";
            case 57:
                return "WEB_VIEW_RENDERER_TERMINATE";
            case 58:
                return "WebView provider unavailable";
            case 59:
                return "android.intent.action.SENDTO";
            case 60:
                return "android.intent.action.SET_ALARM";
            case 61:
                return "android.intent.extra.PROCESS_TEXT";
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return LocalConnectorConsent.HEALTH_CONNECT_PERMISSION_PREFIX;
            case 63:
                return "android.text";
            case 64:
                return "android_security_fb4a_intent_logging_outgoing";
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                return "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
            case 66:
                return "animator_duration_scale";
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return "api/peer-spaces/by-id/";
            case 68:
                return "application/xhtml+xml";
            case 69:
                return HatchDataExportRepositoryKt.ZIP_MIME_TYPE;
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                return AuraNotificationChannels.DOWNLOADS;
            case 71:
                return UiControlDispatcherKt.ERROR_CODE_CLIENT_FAILED;
            case 72:
                return BrowserSignInPushPresenterKt.PARAM_COLLAPSE_KEY;
            case 73:
                return "com.android.contacts";
            case 74:
                return "com.facebook.aura.navigation.key.AuraSubscriptionPage.Usage";
            case 75:
                return "correlation_id";
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                return "empty_content";
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                return "entry_context_token";
            case 78:
                return "error_description";
            case 79:
                return "event_id = ?";
            case 80:
                return "event_id IN (";
            case 81:
                return "extra_notification_id";
            case 82:
                return "google_health_connect";
            case 83:
                return "hatch://chat";
            case 84:
                return "hatch_ai_agent";
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                return "hatch_bot_message";
            case 86:
                return HatchChatNotificationIds.HITL_APPROVAL_NOTIF_TYPE;
            case 87:
                return VmLockedPushHandler.NOTIFICATION_TYPE;
            case 88:
                return "https://www.google.com/maps/search/?api=1&query=";
            case 89:
                return "internal error";
            case 90:
                return AgeVerificationClientKt.INVALID_ATTEMPT;
            case 91:
                return AgeVerificationClientKt.INVALID_FILE;
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                return AgeVerificationClientKt.INVALID_FILE_HANDLE;
            case 93:
                return "not_required";
            case 94:
                return "notification_type";
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
                return "null cannot be cast to non-null type java.util.Calendar";
            case 96:
                return "query_failed";
            case 97:
                return "render_start";
            case 98:
                return "reply_to_message_id";
            case 99:
                return "state_revision";
            case 100:
                return AgeVerificationClientKt.SUBMIT_FAILED;
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                return "undecodable_response";
            case 102:
                return "unknown error";
            case 103:
                return "unsupported_version";
            case 104:
                return "upload_failed";
            default:
                return "video/x-msvideo";
        }
    }
}
