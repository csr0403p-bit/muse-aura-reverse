package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchCvmReplacementFailure;
import com.facebook.aura.gateway.HatchGatewayPreconnectKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public abstract class BV3 {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "null cannot be cast to non-null type kotlin.String";
            case 1:
                return " after ";
            case 2:
                return HatchInstallReferrerLogger.PLAY_STORE_PACKAGE;
            case 3:
                return "read_failed";
            case 4:
                return UserFlowLoggerImpl.SOURCE_ANNOTATION;
            case 5:
                return ", selection=";
            case 6:
                return "4387961628157459";
            case 7:
                return "android.intent.action.BATTERY_CHANGED";
            case 8:
                return "android.intent.action.SEND_MULTIPLE";
            case 9:
                return "item_count";
            case 10:
                return "no calls to next() since the last call to remove()";
            case 11:
                return "opt_out_workplace_group";
            case 12:
                return "unchanged";
            case 13:
                return " [truncated]";
            case 14:
                return " cannot be negative but was: ";
            case 15:
                return ", cancelToken=";
            case 16:
                return ", errorCode=";
            case 17:
                return ", loggingData=";
            case 18:
                return ", manufacturer=";
            case 19:
                return ", periodCount=";
            case 20:
                return ", properties=";
            case 21:
                return ", timestamp=";
            case 22:
                return ", variables=";
            case 23:
                return "Accept-Encoding";
            case 24:
                return "AesCmacKey size wrong, must be 32 bytes";
            case 25:
                return "Beginning index: ";
            case 26:
                return "Can not use AES-EAX in FIPS-mode.";
            case 27:
                return "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.";
            case 28:
                return "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.";
            case 29:
                return "Content-Range";
            case 30:
                return "Error cleaning up after reference.";
            case 31:
                return "Expected ':'";
            case 32:
                return "Gateway preconnect prefetch/wake failed";
            case 33:
                return "HATCH_SSO_WA_AUTH_BUNDLE";
            case 34:
                return HatchGatewayPreconnectKt.TAG;
            case 35:
                return "Invalid index ";
            case 36:
                return "Lispy minification map not loaded, critical error";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return "MFT_TRUSTED_DEVICE";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return "Minification mapper UL Static plugin failed to load for app. Please reach out in Bloks Q&A to help resolve this.";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return "Multiple entries with same key: ";
            case 40:
                return "Null value passed to getSnapshot!";
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return "PRAGMA synchronous = FULL";
            case 42:
                return "RV key must be 32 bytes";
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return "Response Code: ";
            case 44:
                return "Success(value=";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return "The Android Project";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return "W3C_PAYMENT_DEVICE_KEYautofill_key";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return "android-keystore://";
            case 48:
                return "android.bigText";
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return "android.permission.READ_PHONE_STATE";
            case 50:
                return "android.textLines";
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return "audio_queue_overflow";
            case 52:
                return "audio_send_failure";
            case 53:
                return "caller_package_name";
            case 54:
                return "cannot store more than Integer.MAX_VALUE elements";
            case 55:
                return "client_session_id";
            case 56:
                return "collection too large";
            case 57:
                return "com.facebook.lite";
            case 58:
                return "com.facebook.vibes";
            case 59:
                return "com.instagram.lite";
            case 60:
                return "com.oculus.twilight";
            case 61:
                return HatchCvmReplacementFailure.ATTESTATION_FAILED;
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP;
            case 63:
                return "fb_request_id";
            case 64:
                return "getRecordComponents";
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                return "hpke_ciphersuite";
            case 66:
                return "hpke_keystore_id";
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return "invalid salt size";
            case 68:
                return "is_transient";
            case 69:
                return "java.lang.reflect.RecordComponent";
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                return "min_app_days";
            case 71:
                return "network_transport";
            case 72:
                return "network_validated";
            case 73:
                return "null cannot be cast to non-null type android.os.PowerManager";
            case 74:
                return "null cannot be cast to non-null type java.security.cert.X509Certificate";
            case 75:
                return "null cannot be cast to non-null type kotlin.collections.List<*>";
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                return "qpl_join__absolute_time_origin_ms";
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                return "qpl_join__source_clock";
            case 78:
                return "qpl_join__source_is_primary";
            case 79:
                return "report_source";
            case 80:
                return "retry_policy";
            case 81:
                return "sensitive_string_value";
            case 82:
                return "startConnection";
            case 83:
                return "timestamp_ms";
            default:
                return CancelReason.USER_CANCELLED;
        }
    }
}
