package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.identifiers.fdid.AuraFdidStorage;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public abstract class C6L extends Enum<C6L> {
    public final String mName;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "all_app_mem_info";
            case 2:
                return "portal_app";
            case 3:
                return "analytics";
            case 4:
                return "anr_data";
            case 5:
                return "anr_warning_history";
            case 6:
                return "application_thread_process_state";
            case 7:
                return "app_config_info";
            case 8:
                return "app_exit_info";
            case 9:
                return "app_info";
            case 10:
                return "app_state";
            case 11:
                return "black_box";
            case 12:
                return "bluetooth_traffic";
            case 13:
                return "composer_sessions";
            case 14:
                return "core_dump";
            case 15:
                return ConnectorCatalogKt.CUSTOM_CATEGORY_ID;
            case 16:
                return "device_info";
            case 17:
                return "disk_info";
            case 18:
                return "extra_device_info";
            case 19:
                return "fury_traces";
            case 20:
                return "global_app_state";
            case 21:
                return "global_props";
            case 22:
                return ErrorReportingConstants.GRANULAR_EXPOSURES;
            case 23:
                return "lacrima_files";
            case 24:
                return "litho_debug_events";
            case 25:
                return "lmk_info";
            case 26:
                return "lmkd_info";
            case 27:
                return "logcat";
            case 28:
                return "logcat_intercept";
            case 29:
                return "mem_class_info";
            case 30:
                return "membench";
            case 31:
                return AuraDeeplinkRouteMapper.MEMORY_ROUTE;
            case 32:
                return "memory_stats";
            case 33:
                return "memory_timeline";
            case 34:
                return "memory_timeline_events";
            case 35:
                return "mobile_config";
            case 36:
                return "msys_crash_reporter";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return "oom_score";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return "private_dirty_memory";
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return "qpl";
            case 40:
                return "runtime_permissions";
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return "attachment";
            case 42:
                return "systems_health_report";
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return "app_connectivity_report";
            case 44:
                return "app_media_import_report";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return "simple_memory";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return "stack_traces";
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return "system_boot";
            case 48:
                return "system_health_stats";
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return "test_collector";
            case 50:
                return "thermal_info";
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return "time_info";
            case 52:
                return "user_info";
            case 53:
                return "watermark";
            case 54:
                return "component_version";
            case 55:
                return "parcelable";
            case 56:
                return "stall";
            case 57:
                return "litho_message";
            case 58:
                return "wearable_info";
            case 59:
                return "wearable_session";
            case 60:
                return "anr_timer";
            case 61:
                return "ota_resources_version";
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return "state_post_crash";
            case 63:
                return "lmk_importance";
            case 64:
                return "memory_and_importance";
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                return "foreground_stats";
            case 66:
                return "custom_app_data";
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return "lifecycle_history";
            case 68:
                return "app_timeout";
            case 69:
                return "native_libraries";
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                return "native_library_update";
            case 71:
                return "battery_info";
            case 72:
                return "memory_trim";
            case 73:
                return "native_memory";
            case 74:
                return "persistent_looper_history";
            case 75:
                return "anr_message_queue";
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                return "jest_e2e";
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                return "touch_event";
            case 78:
                return "app_start";
            case 79:
                return "thread_local_stats";
            case 80:
                return "allocator_type";
            case 81:
                return "gpu_info";
            case 82:
                return "vulkan_info";
            case 83:
                return "ux_session";
            case 84:
                return "object_count";
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                return "user_session_switch_count";
            case 86:
                return "ui_thread_priority";
            case 87:
                return "main_thread_watchdog";
            case 88:
                return "lionhead_fuzzing_metadata";
            case 89:
                return "detection_stages";
            case 90:
                return "pending_jobs";
            case 91:
                return "memory_pressure";
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                return "main_thread_state";
            case 93:
                return AuraFdidStorage.KEY_ID;
            case 94:
                return "emulator_file_signal";
            default:
                return "add_mem_info";
        }
    }
}
