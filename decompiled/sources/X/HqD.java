package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.commands.core.NodePermissionActivityKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.pairs.SharedGoalScreenKt;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HqD {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HqD[] A01;
    public final String eventName;
    public final boolean isCritical;
    public final ArrayList<String> tags;
    public static final HqD A2g = new HqD("SYSTEM_NOTIFICATION_TAPPED", "system_notification_tapped", AbstractC7608F5v.A12("system_notification"), 0, false);
    public static final HqD A04 = new HqD("ANSWER_FROM_SYSTEM_NOTIFICATION", "answer_from_system_notification", A01("system_notification", "incoming_call"), 1, true);
    public static final HqD A0S = A00("DECLINE_FROM_SYSTEM_NOTIFICATION", "decline_from_system_notification", A01("system_notification", "incoming_call"), 2, true);
    public static final HqD A0f = A00("END_CALL_FROM_SYSTEM_NOTIFICATION", "end_call_from_system_notification", AbstractC7608F5v.A12("system_notification"), 3, true);
    public static final HqD A0y = A00("FOREGROUND_SERVICE_STARTED", "foreground_service_started", AbstractC7608F5v.A12("system_notification"), 4, true);
    public static final HqD A0z = A00("FOREGROUND_SERVICE_STOPPED", "foreground_service_stopped", AbstractC7608F5v.A12("system_notification"), 5, true);
    public static final HqD A0v = A00("FOREGROUND_SERVICE_FAILURE", "foreground_service_failure", A01("system_notification", "error"), 6, true);
    public static final HqD A0w = A00("FOREGROUND_SERVICE_FALLBACK", "foreground_service_fallback", AbstractC7608F5v.A12("system_notification"), 7, true);
    public static final HqD A10 = A00("FOREGROUND_SERVICE_TRACK_CALL", "foreground_service_track_call", AbstractC7608F5v.A12("system_notification"), 8, true);
    public static final HqD A0x = A00("FOREGROUND_SERVICE_MISSING_MIC_TYPE", "foreground_service_missing_mic_type", A01("system_notification", "error"), 9, true);
    public static final HqD A2F = A00("PLACEHOLDER_FGS_INTENT_SENT", "placeholder_fgs_intent_sent", AbstractC7608F5v.A12("system_notification"), 10, false);
    public static final HqD A2G = A00("PLACEHOLDER_FGS_ON_START_COMMAND", "placeholder_fgs_on_start_command", AbstractC7608F5v.A12("system_notification"), 11, false);
    public static final HqD A2I = A00("PLACEHOLDER_FGS_STARTED", "placeholder_fgs_started", AbstractC7608F5v.A12("system_notification"), 12, false);
    public static final HqD A2E = A00("PLACEHOLDER_FGS_FAILURE", "placeholder_fgs_failure", A01("system_notification", "error"), 13, false);
    public static final HqD A2J = A00("PLACEHOLDER_FGS_TIMEOUT", "placeholder_fgs_timeout", AbstractC7608F5v.A12("system_notification"), 14, false);
    public static final HqD A2H = A00("PLACEHOLDER_FGS_REPLACED", "placeholder_fgs_replaced", AbstractC7608F5v.A12("system_notification"), 15, false);
    public static final HqD A2e = A00("STALE_NOTIFICATION_CLEARED", "stale_notification_interaction", AbstractC0885AGm.A0x("system_notification", "error", "incoming_call"), 16, true);
    public static final HqD A03 = A00("ANSWER_FROM_INCOMING_CALL_SCREEN", "answer_from_incoming_call_screen", AbstractC7608F5v.A12("incoming_call"), 17, true);
    public static final HqD A0R = A00("DECLINE_FROM_INCOMING_CALL_SCREEN", "decline_from_incoming_call_screen", AbstractC7608F5v.A12("incoming_call"), 18, true);
    public static final HqD A02 = A00("ANSWER_CALL_ABORTED", "answer_call_aborted", A01("incoming_call", "error"), 19, true);
    public static final HqD A0E = A00("CANCEL_OLDEST_NOTIFICATION", "cancel_oldest_notification_incoming_ring", A01("system_notification", "incoming_call"), 20, true);
    public static final HqD A17 = A00("INCOMING_NOTIFICATION_FALLBACK", "incoming_notification_fallback", A01("system_notification", "incoming_call"), 21, true);
    public static final HqD A14 = A00("INCOMING_CALL_WITH_DND_ENABLED", "incoming_call_with_dnd", A01("system_notification", "incoming_call"), 22, true);
    public static final HqD A15 = A00("INCOMING_CALL_WITH_NOTIFICATION_BLOCKED", "incoming_call_with_notification_blocked", A01("system_notification", "incoming_call"), 23, true);
    public static final HqD A2S = A00("RING_ALERT_SUPPRESSED", "ring_alert_suppressed", A01("system_notification", "incoming_call"), 24, true);
    public static final HqD A13 = A00("INCOMING_CALL_WITH_APP_RESTRICTED", "incoming_call_with_app_restricted", A01("system_notification", "incoming_call"), 25, true);
    public static final HqD A16 = A00("INCOMING_CALL_WITH_NOTIFICATION_SHOWN", "incoming_call_with_notification_shown", A01("system_notification", "incoming_call"), 26, true);
    public static final HqD A1r = A00("OUTGOING_CALL_WITH_DND_ENABLED", "outgoing_call_with_dnd", A01("system_notification", "outgoing_call"), 27, true);
    public static final HqD A1s = A00("OUTGOING_CALL_WITH_NOTIFICATION_BLOCKED", "outgoing_call_with_notification_blocked", A01("system_notification", "outgoing_call"), 28, true);
    public static final HqD A1q = A00("OUTGOING_CALL_WITH_APP_RESTRICTED", "outgoing_call_with_app_restricted", A01("system_notification", "outgoing_call"), 29, true);
    public static final HqD A1t = A00("OUTGOING_CALL_WITH_NOTIFICATION_IN_TRAY", "outgoing_call_with_notification_in_tray", A01("system_notification", "outgoing_call"), 30, true);
    public static final HqD A07 = A00("CALL_ADDED", "call_added", A01("incoming_call", "multi_call"), 31, true);
    public static final HqD A1a = A00("MULTI_CALL_NOTIFICATION_SHOWN", "multi_call_notification_shown", A01("multi_call", "incoming_call"), 32, true);
    public static final HqD A1Z = A00("MULTI_CALL_NOTIFICATION_HIDDEN", "multi_call_notification_hidden", A01("multi_call", "incoming_call"), 33, true);
    public static final HqD A1Y = A00("MULTI_CALL_NOTIFICATION_FAILED", "multi_call_notification_failed", AbstractC0885AGm.A0x("multi_call", "incoming_call", "error"), 34, true);
    public static final HqD A1X = A00("MULTI_CALL_ENDED_BY_CALLER", "multi_call_ended_by_caller", AbstractC7608F5v.A12("multi_call"), 35, true);
    public static final HqD A1T = A00("MULTI_CALL_ACCEPT_VIA_NOTIFICATION", "multi_call_accept_via_notification", AbstractC7608F5v.A12("multi_call"), 36, true);
    public static final HqD A1U = A00("MULTI_CALL_ACCEPT_VIA_UI", "multi_call_accept_via_ui", AbstractC7608F5v.A12("multi_call"), 37, true);
    public static final HqD A1V = A00("MULTI_CALL_DECLINE_VIA_NOTIFICATION", "multi_call_decline_via_notification", AbstractC7608F5v.A12("multi_call"), 38, true);
    public static final HqD A1W = A00("MULTI_CALL_DECLINE_VIA_UI", "multi_call_decline_via_ui", AbstractC7608F5v.A12("multi_call"), 39, true);
    public static final HqD A1d = A00("MULTI_CALL_UNHANDLED_ACTION", "multi_call_unhandled_intent_action", AbstractC7608F5v.A12("multi_call"), 40, true);
    public static final HqD A1S = A00("MULTI_CALL_ACCEPT_ERROR", "multi_call_accept_error", A01("multi_call", "error"), 41, true);
    public static final HqD A1c = A00("MULTI_CALL_TRANSITIONED_TO_ACTIVE_ERROR", "multi_call_transitioned_to_active_error", A01("multi_call", "error"), 42, true);
    public static final HqD A1b = A00("MULTI_CALL_TRANSITIONED_TO_ACTIVE", "multi_call_transitioned_to_active", AbstractC7608F5v.A12("multi_call"), 43, true);
    public static final HqD A0u = A00("FETCH_THREAD_AND_SHOW_NOTIF", "fetch_thread_and_show_notif", AbstractC7608F5v.A12("multi_call"), 44, true);
    public static final HqD A0d = A00("DEVICE_PERMISSION_PROMPTED_FOR_MICROPHONE", "device_permission_prompted_for_microphone", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 45, true);
    public static final HqD A0c = A00("DEVICE_PERMISSION_PROMPTED_FOR_CAMERA", "device_permission_prompted_for_camera", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 46, true);
    public static final HqD A0e = A00("DEVICE_PERMISSION_PROMPTED_FOR_PHONE", "device_permission_prompted_for_phone", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 47, true);
    public static final HqD A0a = A00("DEVICE_PERMISSION_GRANTED_FOR_MICROPHONE", "device_permission_granted_for_microphone", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 48, true);
    public static final HqD A0Z = A00("DEVICE_PERMISSION_GRANTED_FOR_CAMERA", "device_permission_granted_for_camera", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 49, true);
    public static final HqD A0b = A00("DEVICE_PERMISSION_GRANTED_FOR_PHONE", "device_permission_granted_for_phone", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 50, true);
    public static final HqD A0X = A00("DEVICE_PERMISSION_DENIED_PREVIOUSLY_FOR_MICROPHONE", "device_permission_denied_previously_for_microphone", A01(NodePermissionActivityKt.EXTRA_PERMISSIONS, "error"), 51, true);
    public static final HqD A0W = A00("DEVICE_PERMISSION_DENIED_PREVIOUSLY_FOR_CAMERA", "device_permission_denied_previously_for_camera", A01(NodePermissionActivityKt.EXTRA_PERMISSIONS, "error"), 52, true);
    public static final HqD A0Y = A00("DEVICE_PERMISSION_DENIED_PREVIOUSLY_FOR_PHONE", "device_permission_denied_previously_for_phone", A01(NodePermissionActivityKt.EXTRA_PERMISSIONS, "error"), 53, true);
    public static final HqD A0U = A00("DEVICE_PERMISSION_DENIED_AFTER_PROMPT_FOR_MICROPHONE", "device_permission_denied_after_prompt_for_microphone", A01(NodePermissionActivityKt.EXTRA_PERMISSIONS, "error"), 54, true);
    public static final HqD A0T = A00("DEVICE_PERMISSION_DENIED_AFTER_PROMPT_FOR_CAMERA", "device_permission_denied_after_prompt_for_camera", A01(NodePermissionActivityKt.EXTRA_PERMISSIONS, "error"), 55, true);
    public static final HqD A0V = A00("DEVICE_PERMISSION_DENIED_AFTER_PROMPT_FOR_PHONE", "device_permission_denied_after_prompt_for_phone", A01(NodePermissionActivityKt.EXTRA_PERMISSIONS, "error"), 56, true);
    public static final HqD A21 = A00("PERMISSION_EXPLAINER_BS_IMPRESSION", "permission_explainer_bs_impression", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 57, true);
    public static final HqD A1z = A00("PERMISSION_EXPLAINER_BS_CONTINUE", "permission_explainer_bs_continue", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 58, true);
    public static final HqD A1y = A00("PERMISSION_EXPLAINER_BS_CALL_WITHOUT_VIDEO", "permission_explainer_bs_call_without_video", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 59, true);
    public static final HqD A20 = A00("PERMISSION_EXPLAINER_BS_DISMISSED", "permission_explainer_bs_dismissed", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 60, true);
    public static final HqD A2A = A00("PERMISSION_SETTINGS_REDIRECT_BS_IMPRESSION", "permission_settings_redirect_bs_impression", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 61, true);
    public static final HqD A29 = A00("PERMISSION_SETTINGS_REDIRECT_BS_GO_TO_SETTINGS", "permission_settings_redirect_bs_go_to_settings", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 62, true);
    public static final HqD A28 = A00("PERMISSION_SETTINGS_REDIRECT_BS_DISMISSED", "permission_settings_redirect_bs_dismissed", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 63, true);
    public static final HqD A26 = A00("PERMISSION_OS_POPUP_SHOWN", "permission_os_popup_shown", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 64, true);
    public static final HqD A24 = A00("PERMISSION_OS_GRANTED", "permission_os_granted", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 65, true);
    public static final HqD A23 = A00("PERMISSION_OS_DENIED", "permission_os_denied", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 66, true);
    public static final HqD A25 = A00("PERMISSION_OS_NEVER_ASK_AGAIN", "permission_os_never_ask_again", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 67, true);
    public static final HqD A27 = A00("PERMISSION_PRE_ROUTED_TO_SETTINGS", "permission_pre_routed_to_settings", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 68, true);
    public static final HqD A22 = A00("PERMISSION_FLOW_COMPLETED", "permission_flow_completed", AbstractC7608F5v.A12(NodePermissionActivityKt.EXTRA_PERMISSIONS), 69, true);
    public static final HqD A2V = A00("RSYS_SDK_CREATED", "rsys_sdk_created", AbstractC7608F5v.A12("rsys_sdk"), 70, false);
    public static final HqD A12 = A00("INCOMING_CALL_INTENT_RECEIVED", "incoming_call_intent_received", A01("incoming_call", "rsys_sdk"), 71, true);
    public static final HqD A1p = A00("OUTGOING_CALL_INTENT_CREATED", "outgoing_call_intent_created", A01("outgoing_call", "rsys_sdk"), 72, true);
    public static final HqD A0F = A00("CANNOT_START_OUTGOING_CALL", "cannot_start_outgoing_call", AbstractC0885AGm.A0x("outgoing_call", "error", "rsys_sdk"), 73, true);
    public static final HqD A1j = A00("ON_CALL_IDLE", "on_call_idle", AbstractC7608F5v.A12("rsys_sdk"), 74, false);
    public static final HqD A2l = A00("VIDEO_ESCALATION_SHOWN", "video_escalation_shown", A01("soc_detected", "video_escalation"), 75, true);
    public static final HqD A2D = A00("PICTURE_IN_PICTURE_REQUESTED", "picture_in_picture_requested", AbstractC7608F5v.A12("picture_in_picture"), 76, false);
    public static final HqD A2B = A00("PICTURE_IN_PICTURE_ENTERED", "picture_in_picture_entered", AbstractC7608F5v.A12("picture_in_picture"), 77, false);
    public static final HqD A2C = A00("PICTURE_IN_PICTURE_ERROR", "picture_in_picture_error", A01("picture_in_picture", "error"), 78, false);
    public static final HqD A2R = A00("PUSH_NOTIFICATION_RECEIVED", "push_notification_received", AbstractC7608F5v.A12("inbound_signaling"), 79, false);
    public static final HqD A1R = A00("MQTT_SIGNALING_RECEIVED_DGW_STATE", "mqtt_signaling_received_dgw_state", AbstractC7608F5v.A12("inbound_signaling"), 80, false);
    public static final HqD A2O = A00("PUSH_NOTIFICATION_DROPPED", "push_notification_dropped", A01("inbound_signaling", "error"), 81, true);
    public static final HqD A2Q = A00("PUSH_NOTIFICATION_OFFER_IGNORED", "push_notification_offer_ignored", A01("inbound_signaling", "error"), 82, false);
    public static final HqD A2P = A00("PUSH_NOTIFICATION_OFFER_ACKED", "push_notification_offer_acked", AbstractC7608F5v.A12("inbound_signaling"), 83, true);
    public static final HqD A2b = A00("SIGNAL_HANDOFF_TO_ENGINE", "signal_handoff_to_engine", AbstractC7608F5v.A12("inbound_signaling"), 84, false);
    public static final HqD A2j = A00("USER_NOT_AVAILABLE", "user_not_available", A01("inbound_signaling", "error"), 85, true);
    public static final HqD A2Z = A00("SIGLITE_SEND_ATTEMPT", "siglite_send_attempt", AbstractC7608F5v.A12("inbound_signaling"), 86, false);
    public static final HqD A2a = A00("SIGLITE_SEND_COMPLETE", "siglite_send_complete", AbstractC7608F5v.A12("inbound_signaling"), 87, false);
    public static final HqD A2T = A00("RING_RESPONSE_SEND_ATTEMPT", "sigcore_ring_response_send_attempt", AbstractC7608F5v.A12("inbound_signaling"), 88, false);
    public static final HqD A2U = A00("RING_RESPONSE_SEND_COMPLETE", "sigcore_ring_response_send_complete", AbstractC7608F5v.A12("inbound_signaling"), 89, false);
    public static final HqD A2h = A00("TRANSPORT_NOT_AVAILABLE", "transport_not_available", A01("inbound_signaling", "error"), 90, true);
    public static final HqD A0q = A00("FCM_PUSH_RECEIVED", "fcm_incoming_push_received", AbstractC7608F5v.A12("inbound_signaling"), 91, false);
    public static final HqD A0p = A00("FCM_PUSH_PASSED_TO_RSYS", "fcm_incoming_push_passed_to_rsys", AbstractC7608F5v.A12("inbound_signaling"), 92, false);
    public static final HqD A0k = A00("FCM_NOT_FCM_MULTIWAY_TOPIC", "fcm_not_fcm_multiway_topic", A01("push_process", "error"), 93, true);
    public static final HqD A0l = A00("FCM_NULL_MULTIWAY_MESSAGE", "fcm_null_multiway_message", A01("push_process", "error"), 94, true);
    public static final HqD A0n = A00("FCM_NULL_PAYLOAD_IN_PUSH_HANDLER", "fcm_null_payload_in_push_handler", A01("push_process", "error"), 95, true);
    public static final HqD A0o = A00("FCM_PAGE_NOT_IN_EXPERIMENT", "fcm_page_not_in_experiment", A01("push_process", "error"), 96, true);
    public static final HqD A0t = A00("FCM_TARGET_USER_MISMATCH", "fcm_target_user_mismatch", A01("push_process", "error"), 97, true);
    public static final HqD A0m = A00("FCM_NULL_PAYLOAD_IN_PUSH_DATA_PROCESSOR", "fcm_null_payload_in_push_data_processor", A01("push_process", "error"), 98, true);
    public static final HqD A0s = A00("FCM_RECIPIENT_USER_NOT_ADMIN_OF_PAGE", "fcm_recipient_user_not_admin_of_page", A01("push_process", "error"), 99, true);
    public static final HqD A0r = A00("FCM_RECIPIENT_PAGE_ID_NOT_CURRENT_PAGE_ID", "fcm_recipient_page_id_not_current_page_id", A01("push_process", "error"), 100, true);
    public static final HqD A1v = A00("PAYLOAD_DECOMPRESSION_ERROR", "payload_decompression_error", A01("push_process", "error"), FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, true);
    public static final HqD A1w = A00("PAYLOAD_MISSING_ERROR", "payload_missing_error", A01("push_process", "error"), 102, true);
    public static final HqD A1x = A00("PAYLOAD_READ_ERROR", "payload_read_error", A01("push_process", "error"), 103, true);
    public static final HqD A0i = A00("ENGINE_INIT_STARTED", "engine_init_started", C3cG.A0h(), 104, false);
    public static final HqD A0g = A00("ENGINE_INIT_COMPLETED", "engine_init_completed", C3cG.A0h(), 105, false);
    public static final HqD A0h = A00("ENGINE_INIT_FAILED", "engine_init_failed", AbstractC7608F5v.A12("error"), 106, true);
    public static final HqD A1k = A00("OUTBOUND_CALL_INTENT", "outbound_call_intent", AbstractC7608F5v.A12("outgoing_call"), 107, true);
    public static final HqD A1l = A00("OUTBOUND_CALL_INTENT_ERROR", "outbound_call_intent_error", A01("outgoing_call", "error"), MinidumpReader.MODULE_FULL_SIZE, true);
    public static final HqD A1o = A00("OUTBOUND_CALL_TRANSPORT_STATUS", "outbound_call_transport_status", AbstractC7608F5v.A12("outgoing_call"), 109, false);
    public static final HqD A1n = A00("OUTBOUND_CALL_TRANSPORT_DNS_STATUS", "outbound_call_transport_dns_status", AbstractC7608F5v.A12("outgoing_call"), 110, false);
    public static final HqD A1m = A00("OUTBOUND_CALL_STUN_CONNECTION_TEST_FAILED", "outbound_call_stun_connection_test_failed", AbstractC7608F5v.A12("outgoing_call"), 111, true);
    public static final HqD A2X = A00("RTC_CHATD_NECESSARY_LOGIN", "rtc_chatd_necessary_login", AbstractC7608F5v.A12("chatd"), HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, false);
    public static final HqD A2W = A00("RTC_CHATD_DROPPED_OUTGOING", "rtc_chatd_dropped_outgoing", AbstractC7608F5v.A12("chatd"), 113, true);
    public static final HqD A0G = A00("CONNECTION_SERVICE_AUTO_REJECT", "connection_service_auto_reject", A01("incoming_call", "connection_service"), 114, true);
    public static final HqD A0P = A00("CONNECTION_SERVICE_REQUEST_CALL_START", "connection_service_request_call_start", AbstractC7608F5v.A12("connection_service"), 115, true);
    public static final HqD A0I = A00("CONNECTION_SERVICE_CONNECTION_CREATED", "connection_service_connection_created", AbstractC7608F5v.A12("connection_service"), 116, true);
    public static final HqD A0J = A00("CONNECTION_SERVICE_CONTINUE_AFTER_ENDED", "connection_service_continue_after_ended", A01("connection_service", "error"), 117, true);
    public static final HqD A0N = A00("CONNECTION_SERVICE_NOT_PERMITTED_AFTER_ENDED", "connection_service_reject_after_ended", A01("connection_service", "error"), 118, true);
    public static final HqD A0L = A00("CONNECTION_SERVICE_INACTIVE_CALL_CLEARED", "connection_service_inactive_call_cleared", A01("connection_service", "error"), 119, true);
    public static final HqD A0Q = A00("CONNECTION_SERVICE_TIMEOUT", "connection_service_timeout", A01("connection_service", "error"), 120, true);
    public static final HqD A0K = A00("CONNECTION_SERVICE_CREATE_CONNECTION_NULL", "connection_service_create_connection_null", A01("connection_service", "error"), 121, true);
    public static final HqD A0M = A00("CONNECTION_SERVICE_INCOMING_CREATE_FAILED", "connection_service_incoming_create_failed", A01("connection_service", "error"), 122, true);
    public static final HqD A0H = A00("CONNECTION_SERVICE_CALLBACK_GUARD_FAILED", "connection_service_callback_guard_failed", A01("connection_service", "error"), 123, true);
    public static final HqD A0O = A00("CONNECTION_SERVICE_PLACE_CALL_FAILED", "connection_service_place_call_failed", A01("connection_service", "error"), 124, true);
    public static final HqD A1H = A00("LOCAL_CALL_ID_NULL", "local_call_id_null", AbstractC7608F5v.A12("error"), 125, true);
    public static final HqD A0A = A00("CALL_NOT_FOUND", "call_not_found", AbstractC7608F5v.A12("error"), 126, true);
    public static final HqD A2Y = A00("SCREEN_SHARE_INIT_FAILED", "screen_share_init_failed", AbstractC7608F5v.A12("error"), 127, true);
    public static final HqD A0B = A00("CAMERA_CAPTURE_ERROR", "camera_capture_error", A01("camera", "error"), 128, true);
    public static final HqD A0C = A00("CAMERA_CREATED", "camera_created", AbstractC7608F5v.A12("camera"), AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, true);
    public static final HqD A0D = A00("CAMERA_LIFECYCLE_CALLBACKS_DROPPED", "camera_lifecycle_callbacks_dropped", A01("camera", "error"), 130, true);
    public static final HqD A2i = A00("UNEXPECTED_TEXTURE_IN_USE", "unexpected_texture_in_use", AbstractC7608F5v.A12("error"), 131, true);
    public static final HqD A2f = A00("START_CALL_ATTEMPT_BLOCKED", "start_call_attempt_blocked", AbstractC7608F5v.A12("error"), 132, true);
    public static final HqD A0j = A00("FALLBACK_USER_SESSION_PROVIDED", "fallback_user_session_provided", AbstractC7608F5v.A12("error"), 133, true);
    public static final HqD A11 = A00("INCALL_ACTIVITY_RUNTIME_EXCEPTION", "incall_activity_runtime_exception", AbstractC7608F5v.A12("error"), 134, true);
    public static final HqD A09 = A00("CALL_BANNER_TAP", "call_banner_tapped", AbstractC7608F5v.A12(SharedGoalScreenKt.PROBLEM_BANNER_ROW_KEY), 135, false);
    public static final HqD A08 = A00("CALL_BANNER_IMPRESSION", "call_banner_impression", AbstractC7608F5v.A12(SharedGoalScreenKt.PROBLEM_BANNER_ROW_KEY), 136, false);
    public static final HqD A2m = A00("ZERO_RATE_ACTIVITY_FAILURE", "zero_rate_activity_failure", AbstractC7608F5v.A12("error"), 137, true);
    public static final HqD A1i = A00("ONGOING_CALL_TIMESTAMP_FETCH_FAILURE", "ongoing_call_timestamp_fetch_failure", A01("error", "incoming_call"), 138, false);
    public static final HqD A1L = A00("MARKETPLACE_CALL_BUTTON_IMPRESSION", "marketplace_call_button_impression", AbstractC7608F5v.A12("marketplace_calling"), 139, true);
    public static final HqD A1K = A00("MARKETPLACE_CALL_BUTTON_CLICK", "marketplace_call_button_click", AbstractC7608F5v.A12("marketplace_calling"), 140, true);
    public static final HqD A1P = A00("MARKETPLACE_REQUEST_CALL_PERMISSION", "marketplace_request_call_permission", AbstractC7608F5v.A12("marketplace_calling"), 141, true);
    public static final HqD A1J = A00("MARKETPLACE_ALLOW_CALLING_XMA_CLICK", "marketplace_allow_calling_xma_click", AbstractC7608F5v.A12("marketplace_calling"), 142, true);
    public static final HqD A1N = A00("MARKETPLACE_CALL_XMA_CLICK", "marketplace_call_xma_click", AbstractC7608F5v.A12("marketplace_calling"), 143, true);
    public static final HqD A1M = A00("MARKETPLACE_CALL_SETTING_TOGGLE", "marketplace_call_setting_toggle", AbstractC7608F5v.A12("marketplace_calling"), VoiceCallForegroundService.AVATAR_TARGET_PX, true);
    public static final HqD A1I = A00("MARKETPLACE_ALLOW_CALLING_V2_XMA_CLICK", "marketplace_allow_calling_v2_xma_click", AbstractC7608F5v.A12("marketplace_calling"), 145, true);
    public static final HqD A1O = A00("MARKETPLACE_DONT_ALLOW_CALLING_XMA_CLICK", "marketplace_dont_allow_calling_xma_click", AbstractC7608F5v.A12("marketplace_calling"), 146, true);
    public static final HqD A1Q = A00("MARKETPLACE_UPDATE_PREFERENCES_XMA_CLICK", "marketplace_update_preferences_xma_click", AbstractC7608F5v.A12("marketplace_calling"), 147, true);
    public static final HqD A05 = A00("AUDIO_CALL_BUTTON_HIDDEN", "audio_call_button_hidden", AbstractC7608F5v.A12("call_button"), 148, false);
    public static final HqD A1u = A00("PAGE_CALLING_GREEN_DOT_VISIBLE", "page_calling_green_dot_visible", AbstractC7608F5v.A12("call_button"), 149, false);
    public static final HqD A2k = A00("VIDEO_CALL_BUTTON_HIDDEN", "video_call_button_hidden", AbstractC7608F5v.A12("call_button"), 150, false);
    public static final HqD A1h = A00("NOTIFY_EXCEPTION", "notify_exception", A01("system_notification", "error"), 151, true);
    public static final HqD A2M = A00("POST_CALL_UPSELL_NUX_IMPRESSION", "post_call_upsell_nux_impression", AbstractC7608F5v.A12("post_call_upsell"), 152, true);
    public static final HqD A2L = A00("POST_CALL_UPSELL_NUX_GET_MESSENGER", "post_call_upsell_nux_get_messenger", AbstractC7608F5v.A12("post_call_upsell"), 153, true);
    public static final HqD A2N = A00("POST_CALL_UPSELL_NUX_NOT_NOW", "post_call_upsell_nux_not_now", AbstractC7608F5v.A12("post_call_upsell"), 154, true);
    public static final HqD A2K = A00("POST_CALL_UPSELL_NUX_DISMISS", "post_call_upsell_nux_dismiss", AbstractC7608F5v.A12("post_call_upsell"), 155, true);
    public static final HqD A19 = A00("IN_CALL_UPSELL_IMPRESSION", "in_call_upsell_impression", AbstractC7608F5v.A12("in_call_upsell"), 156, false);
    public static final HqD A18 = A00("IN_CALL_UPSELL_GET_MESSENGER", "in_call_upsell_get_messenger", AbstractC7608F5v.A12("in_call_upsell"), 157, true);
    public static final HqD A1f = A00("NOTIFICATION_PROFILE_PHOTO_FETCH_DISCARDED", "notification_profile_photo_fetch_discarded", A01("system_notification", "notification_profile_photo"), 158, true);
    public static final HqD A1g = A00("NOTIFICATION_PROFILE_PHOTO_RECYCLED_AT_BUILD", "notification_profile_photo_recycled_at_build", AbstractC0885AGm.A0x("system_notification", "notification_profile_photo", "error"), 159, true);
    public static final HqD A1e = A00("NOTIFICATION_PROFILE_PHOTO_BUILD_ERROR", "notification_profile_photo_build_error", AbstractC0885AGm.A0x("system_notification", "notification_profile_photo", "error"), 160, true);
    public static final HqD A1A = A00("JOIN_ONE_TO_ONE_CALL_DIFFERENT_PEER", "join_one_to_one_call_different_peer", A01("one_to_one_join", "incoming_call"), 161, true);
    public static final HqD A1C = A00("JOIN_ONE_TO_ONE_CALL_MULTI_CALL_SWITCH", "join_one_to_one_call_multi_call_switch", A01("one_to_one_join", "multi_call"), 162, true);
    public static final HqD A1F = A00("JOIN_ONE_TO_ONE_CALL_SHOW_INCALL", "join_one_to_one_call_show_incall", AbstractC7608F5v.A12("one_to_one_join"), 163, true);
    public static final HqD A1D = A00("JOIN_ONE_TO_ONE_CALL_PEER_ID_NULL", "join_one_to_one_call_peer_id_null", A01("one_to_one_join", "error"), 164, true);
    public static final HqD A1B = A00("JOIN_ONE_TO_ONE_CALL_MI_THREAD_KEY_UNAVAILABLE", "join_one_to_one_call_mi_thread_key_unavailable", A01("one_to_one_join", "error"), 165, true);
    public static final HqD A1E = A00("JOIN_ONE_TO_ONE_CALL_SERVER_VERIFIED_JOIN", "join_one_to_one_call_server_verified_join", AbstractC7608F5v.A12("one_to_one_join"), 166, true);
    public static final HqD A1G = A00("JOIN_ONE_TO_ONE_CALL_STALE_BUTTON_SKIPPED", "join_one_to_one_call_stale_button_skipped", A01("one_to_one_join", "error"), 167, true);
    public static final HqD A2c = A00("SILENCED_CALL_DND_INSERTED", "silenced_call_dnd_inserted", AbstractC7608F5v.A12("silenced_call"), 168, false);
    public static final HqD A2d = A00("SILENCED_CALL_XMA_IMPRESSION", "silenced_call_xma_impression", AbstractC7608F5v.A12("silenced_call"), 169, false);
    public static final HqD A06 = A00("CALLS_TAB_FAVORITES_SAVE_FAILURE", "calls_tab_favorites_save_failure", AbstractC0885AGm.A0x("calls_tab", "favorites", "error"), 170, true);

    static {
        HqD hqDA00 = A00("CALLS_TAB_FAVORITES_LOAD_FAILURE", "calls_tab_favorites_load_failure", AbstractC0885AGm.A0x("calls_tab", "favorites", "error"), 171, false);
        HqD[] hqDArr = new HqD[172];
        System.arraycopy(new HqD[]{A2g, A04, A0S, A0f, A0y, A0z, A0v, A0w, A10, A0x, A2F, A2G, A2I, A2E, A2J, A2H, A2e, A03, A0R, A02, A0E, A17, A14, A15, A2S, A13, A16}, 0, hqDArr, 0, 27);
        System.arraycopy(new HqD[]{A1r, A1s, A1q, A1t, A07, A1a, A1Z, A1Y, A1X, A1T, A1U, A1V, A1W, A1d, A1S, A1c, A1b, A0u, A0d, A0c, A0e, A0a, A0Z, A0b, A0X, A0W, A0Y}, 0, hqDArr, 27, 27);
        System.arraycopy(new HqD[]{A0U, A0T, A0V, A21, A1z, A1y, A20, A2A, A29, A28, A26, A24, A23, A25, A27, A22, A2V, A12, A1p, A0F, A1j, A2l, A2D, A2B, A2C, A2R, A1R}, 0, hqDArr, 54, 27);
        System.arraycopy(new HqD[]{A2O, A2Q, A2P, A2b, A2j, A2Z, A2a, A2T, A2U, A2h, A0q, A0p, A0k, A0l, A0n, A0o, A0t, A0m, A0s, A0r, A1v, A1w, A1x, A0i, A0g, A0h, A1k}, 0, hqDArr, 81, 27);
        System.arraycopy(new HqD[]{A1l, A1o, A1n, A1m, A2X, A2W, A0G, A0P, A0I, A0J, A0N, A0L, A0Q, A0K, A0M, A0H, A0O, A1H, A0A, A2Y, A0B, A0C, A0D, A2i, A2f, A0j, A11}, 0, hqDArr, MinidumpReader.MODULE_FULL_SIZE, 27);
        System.arraycopy(new HqD[]{A09, A08, A2m, A1i, A1L, A1K, A1P, A1J, A1N, A1M, A1I, A1O, A1Q, A05, A1u, A2k, A1h, A2M, A2L, A2N, A2K, A19, A18, A1f, A1g, A1e, A1A}, 0, hqDArr, 135, 27);
        System.arraycopy(new HqD[]{A1C, A1F, A1D, A1B, A1E, A1G, A2c, A2d, A06, hqDA00}, 0, hqDArr, 162, 10);
        A01 = hqDArr;
        A00 = C3cG.A0w(hqDArr);
    }

    public static HqD A00(String str, String str2, ArrayList arrayList, int i, boolean z) {
        return new HqD(str, str2, arrayList, i, z);
    }

    public static HqD valueOf(String str) {
        return (HqD) Enum.valueOf(HqD.class, str);
    }

    public static HqD[] values() {
        return (HqD[]) A01.clone();
    }

    public HqD(String str, String str2, ArrayList arrayList, int i, boolean z) {
        this.eventName = str2;
        this.tags = arrayList;
        this.isCritical = z;
    }

    public static ArrayList A01(String str, String str2) {
        return AbstractC0885AGm.A0x(str, str2);
    }
}
