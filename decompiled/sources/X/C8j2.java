package X;

import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchCvmChipSelectionRepository;
import com.facebook.aura.gateway.HatchVmRepositoryKt;
import com.facebook.aura.maps.scene.HatchMapThemeKt;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.view.AuraSubscriptionSheetKt;
import org.maplibre.android.R;

/* renamed from: X.8j2, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8j2 {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "Operation is not supported for read-only collection";
            case 1:
                return "Deserialization is supported via proxy only";
            case 2:
                return " (Kotlin reflection is not available)";
            case 3:
                return " is less than zero.";
            case 4:
                return ", progress=";
            case 5:
                return "control_epoch";
            case 6:
                return "unexpected_error";
            case 7:
                return ", action=";
            case 8:
                return ", alignment=";
            case 9:
                return ", contentType=";
            case 10:
                return ", maxLines=";
            case 11:
                return ", rows=";
            case 12:
                return ", scale=";
            case 13:
                return ", source=";
            case 14:
                return ", start=";
            case 15:
                return ", title=";
            case 16:
                return ", version=";
            case 17:
                return "Invalid offset: ";
            case 18:
                return "capability_version";
            case 19:
                return "no_gateway";
            case 20:
                return "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>";
            case 21:
                return "recovery";
            case 22:
                return "total_bytes";
            case 23:
                return "\n            ";
            case 24:
                return " cannot be cast to ";
            case 25:
                return ", backgroundColor=";
            case 26:
                return ", blurRadius=";
            case 27:
                return ", capabilities=";
            case 28:
                return ", continuation=";
            case 29:
                return ", displayName=";
            case 30:
                return ", duration: ";
            case 31:
                return ", initialDelayMillis=";
            case 32:
                return ", lineHeight=";
            case 33:
                return ", linkColor=";
            case 34:
                return ", maxHeight = ";
            case 35:
                return ", maxWidth = ";
            case 36:
                return ", minHeight = ";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return ", observation=";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return ", orientation=";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return ", productId=";
            case 40:
                return ", productType=";
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return ", readiness=";
            case 42:
                return ", state_revision=";
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return ", textDirection=";
            case 44:
                return ", textStyle=";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return ", uptimeMillis=";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return ", verification=";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return "ACCESSIBILITY_CLICKABLE_SPAN_ID";
            case 48:
                return "ACTION_ARGUMENT_SELECTION_END_INT";
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return "ACTION_ARGUMENT_SELECTION_START_INT";
            case 50:
                return "Array is empty.";
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return HatchVmRepositoryKt.ERROR_TYPE_COLD_LEASE_NOT_READY;
            case 52:
                return "Context is not a FragmentActivity";
            case 53:
                return "Disconnected";
            case 54:
                return HatchLinkOrderRepository.SANDBOX_PURCHASE_PLATFORM;
            case 55:
                return "Requested element count ";
            case 56:
                return "Shadow(color=";
            case 57:
                return "Size.Unspecified";
            case 58:
                return "Timed out waiting for ";
            case 59:
                return HatchVmRepositoryKt.ERROR_TYPE_VM_REPLACE_NOT_SENT;
            case 60:
                return HatchVmRepositoryKt.ERROR_TYPE_VM_REPLACE_REFUSED;
            case 61:
                return HatchMapThemeKt.PARAM_CALLER;
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.";
            case 63:
                return "android.software.leanback";
            case 64:
                return HatchConnectorQplLogger.CancelPoint.AUTH_DISMISSED;
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                return HatchCvmChipSelectionRepository.REASON_BUDGET_EXHAUSTED;
            case 66:
                return AuraSubscriptionSheetKt.CONFIRM_NAME_TOKEN;
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return VoiceCatalogRepository.TTS_STREAM_URL;
            case 68:
                return "null cannot be cast to non-null type android.app.Activity";
            case 69:
                return "null cannot be cast to non-null type android.text.Spanned";
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                return "null cannot be cast to non-null type android.view.WindowManager";
            case 71:
                return "null cannot be cast to non-null type java.security.interfaces.ECPublicKey";
            case 72:
                return "null cannot be cast to non-null type kotlin.Boolean";
            case 73:
                return "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>";
            case 74:
                return "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
            case 75:
                return "server_rejected";
            default:
                return "update_current";
        }
    }
}
