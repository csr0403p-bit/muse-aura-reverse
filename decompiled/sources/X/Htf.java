package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Htf {
    public static final /* synthetic */ Htf[] A00;
    public final int mMaxLength;
    public final String mShortKey;

    static {
        Htf htfA00 = A00("critical_cadm_main_process_state", "a", 0, 5);
        Htf htfA002 = A00("critical_cadm_cs_mode", "aa", 1, 8);
        Htf htfA003 = A00("critical_cadm_curr_comp_type", "ab", 2, 10);
        Htf htfA004 = A00("critical_cadm_curr_comp_name", "ac", 3, 80);
        Htf htfA005 = A00("critical_cadm_curr_intent_action", "ad", 4, 80);
        Htf htfA006 = A00("critical_cadm_game_id", "ae", 5, 30);
        Htf htfA007 = A00("critical_cadm_app_init", "af", 6, 1);
        Htf htf = new Htf("critical_cadm_is_bg", 7, 7, "ah");
        Htf htfA008 = A00("critical_cadm_is_anr_looper_enabled", "ai", 8, 5);
        Htf htfA009 = A00("critical_cadm_is_mqd_initialized", "aj", 9, 5);
        Htf htfA0010 = A00("critical_cadm_mqd_collector_created", "ak", 10, 20);
        Htf htfA0011 = A00("critical_cadm_main_process_num_deaths", CRD.__redex_internal_original_name, 11, 4);
        Htf htfA0012 = A00("critical_cadm_splash_screen_dismissed", "c", 12, 5);
        Htf htfA0013 = A00("critical_cadm_intern_trigger", "d", 13, 5);
        Htf htfA0014 = A00("critical_cadm_last_start_temp", "e", 14, 9);
        Htf htfA0015 = A00("critical_cadm_rooms_funnel_session_id", "f", 15, 100);
        Htf htfA0016 = A00("critical_cadm_nt_context", "g", 16, 512);
        Htf htfA0017 = A00("critical_cadm_request_since_last_C1", "h", 17, 20);
        Htf htfA0018 = A00("critical_cadm_time_of_last_C1", "i", 18, 20);
        Htf htfA0019 = A00("critical_cadm_dex_load_result", "j", 19, 20);
        Htf htfA0020 = A00("critical_cadm_camera_core_product_name", "k", 20, 40);
        Htf htfA0021 = A00("critical_cadm_camera_core_product_id", "kb", 21, 40);
        Htf htfA0022 = A00("critical_cadm_camera_core_camera_session_id", "l", 22, 50);
        Htf htfA0023 = A00("critical_cadm_camera_core_effect_ids", "m", 23, 40);
        Htf htfA0024 = A00("critical_cadm_camera_core_last_event", "ma", 24, 40);
        Htf htfA0025 = A00("critical_cadm_ig_camera_session_id", "mb", 25, 40);
        Htf htfA0026 = A00("critical_cadm_ig_extended_creation_session_id", "mc", 26, 48);
        Htf htfA0027 = A00("critical_cadm_camera_core_product_effect_ids", "md", 27, 40);
        Htf htfA0028 = A00("critical_cadm_memory_telemetry_state", "mm", 28, 10);
        Htf htfA0029 = A00("critical_cadm_java_surface_allocation_params", "mn", 29, 32);
        Htf htfA0030 = A00("critical_cadm_native_surface_allocation_params", "mo", 30, 8);
        Htf htfA0031 = A00("critical_cadm_java_loom_provider_params", "mp", 31, 120);
        Htf htfA0032 = A00("critical_cadm_native_loom_provider_params", "mq", 32, 120);
        Htf htfA0033 = A00("critical_cadm_java_object_count_params", "mr", 33, 240);
        Htf htfA0034 = A00("critical_memory_timeline_peak_own_resident_anonymous_kb", "mtpa", 34, 20);
        Htf htfA0035 = A00("critical_memory_timeline_peak_own_resident_anonymous_plus_swap_kb", "mtpas", 35, 20);
        Htf htfA0036 = A00("critical_memory_timeline_peak_vm_swap_kb", "mtps", 36, 20);
        Htf htfA0037 = A00("critical_cadm_tool_type", "n", 37, 20);
        Htf htfA0038 = A00("critical_cadm_page_id", "nb", 38, 20);
        Htf htfA0039 = A00("critical_cadm_msys_bootstrap_state", "o", 39, 9);
        Htf htfA0040 = A00("critical_cadm_msys_bootstrapper_version", HatchUrlSegments.THUMBNAIL_SIZE_PARAM, 40, 1);
        Htf htfA0041 = A00("critical_cadm_msys_did_create_database", AuraDeeplinkRouteMapper.QUERY_PARAM, 41, 5);
        Htf htfA0042 = A00("critical_cadm_messaging_e2ee_status", "qa", 42, 4);
        Htf htfA0043 = A00("large_cadm_freeing_database_execution_callsite_key", "qp", 43, 40);
        Htf htfA0044 = A00("critical_cadm_rtc_call_id", "r", 44, 40);
        Htf htfA0045 = A00("critical_cadm_rtc_peer_id", "s", 45, 15);
        Htf htfA0046 = A00("critical_cadm_last_videocall_waterfall_id", "t", 46, 40);
        Htf htfA0047 = A00("critical_cadm_video_decoder_name", "vdn", 47, 48);
        Htf htfA0048 = A00("test_a", "ta", 48, 5);
        Htf htfA0049 = A00("test_b", "tb", 49, 20);
        Htf htfA0050 = A00("test_c", "tc", 50, 80);
        Htf htfA0051 = A00("critical_cadm_test_app_data_1", "td", 51, 5);
        Htf htfA0052 = A00("large_cadm_test_app_data_2", "te", 52, 5);
        Htf htfA0053 = A00("critical_test_mapped_1", "tf", 53, 5);
        Htf htfA0054 = A00("large_test_mapped_2", "tg", 54, 5);
        Htf htfA0055 = A00("critical_cadm_react_native_js_engine", "rnjse", 55, 40);
        Htf htfA0056 = A00("critical_cadm_last_videocall_id", "u", 56, 15);
        Htf htfA0057 = A00("critical_cadm_group_id", HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, 57, 30);
        Htf htfA0058 = A00("critical_cadm_helium_webview", "w", 58, 1);
        Htf htfA0059 = A00("critical_cadm_iab_session_id", "iab", 59, 40);
        Htf htfA0060 = A00("critical_cadm_comp_type", "x", 60, 10);
        Htf htfA0061 = A00("critical_cadm_comp_name", "y", 61, 80);
        Htf htfA0062 = A00("critical_cadm_intent_action", "z", 62, 80);
        Htf htfA0063 = A00("critical_cadm_network_type", "za", 63, 10);
        Htf htfA0064 = A00("critical_cadm_network_subtype", "zb", 64, 10);
        Htf htfA0065 = A00("critical_cadm_connection_quality", "zc", 65, 12);
        Htf htfA0066 = A00("critical_cadm_connection_bandwidth", "zd", 66, 15);
        Htf htfA0067 = A00("critical_cadm_connection_latency", "ze", 67, 15);
        Htf htfA0068 = A00("critical_cadm_app_start_memory_telemetry", "asmt", 68, 80);
        Htf htfA0069 = A00("critical_cadm_has_touch_event_after_app_foreground", "ft", 69, 1);
        Htf htfA0070 = A00("critical_cadm_aware_last_action", "ala", 70, 120);
        Htf htfA0071 = A00("critical_cadm_bsl_export_details", "bed", 71, 20);
        Htf htfA0072 = A00("critical_cadm_bsl_export_progress", "bep", 72, 3);
        Htf htfA0073 = A00("critical_cadm_mhe_lifecycle_state", "mls", 73, 15);
        Htf htfA0074 = A00("critical_cadm_native_session_id", "nsi", 74, 20);
        Htf htfA0075 = A00("critical_cadm_mhe_build_channel", "mbc", 75, 16);
        Htf htfA0076 = A00("critical_cadm_mhe_app_version", "mav", 76, 20);
        Htf htfA0077 = A00("critical_cadm_mhe__session", "ms", 77, 36);
        Htf htfA0078 = A00("critical_cadm_mhe__device_id", "mdi", 78, 16);
        Htf htfA0079 = A00("critical_cadm_mhe__app_name", "man", 79, 20);
        Htf htfA0080 = A00("critical_cadm_mhe__build_profile", "mbp", 80, 13);
        Htf htfA0081 = A00("critical_cadm_mhe__build_type", "mbt", 81, 1);
        Htf htfA0082 = A00("critical_cadm_mhe__app_lifecycle_state", "mals", 82, 16);
        Htf htfA0083 = A00("critical_cadm_mhe__stalled_job_details", "mjd", 83, 200);
        Htf htfA0084 = A00("critical_cadm_mhe__stalled_job_time", "mjt", 84, 24);
        Htf htfA0085 = A00("critical_cadm_mhe__stalled_job_thread", "mjr", 85, 24);
        Htf htfA0086 = A00("critical_cadm_mhe__world_id", "mw", 86, 20);
        Htf htfA0087 = A00("critical_cadm_mhe__snapshot_id", "msn", 87, 20);
        Htf htfA0088 = A00("critical_cadm_mhe__event_id", "me", 88, 20);
        Htf htfA0089 = A00("critical_cadm_mhe__server_zone_name", "mz", 89, 40);
        Htf htfA0090 = A00("critical_cadm_mhe__last_successful_navigation_id", "mln", 90, 100);
        Htf htfA0091 = A00("critical_cadm_is_aura_subscriber", "as", 91, 1);
        Htf htfA0092 = A00("critical_cadm_has_any_paid_benefits", "pb", 92, 1);
        Htf htfA0093 = A00("critical_cadm_active_benefits", "aub", 93, 200);
        Htf htfA0094 = A00("critical_cadm_is_watch", "iw", 94, 1);
        Htf htfA0095 = A00("critical_cadm_transition_nav_chain", "tnc", 95, 2048);
        Htf htfA0096 = A00("critical_cadm_transition_nav_chain_timestamp_ms", "tnt", 96, 13);
        Htf[] htfArr = new Htf[97];
        System.arraycopy(new Htf[]{htfA00, htfA002, htfA003, htfA004, htfA005, htfA006, htfA007, htf, htfA008, htfA009, htfA0010, htfA0011, htfA0012, htfA0013, htfA0014, htfA0015, htfA0016, htfA0017, htfA0018, htfA0019, htfA0020, htfA0021, htfA0022, htfA0023, htfA0024, htfA0025, htfA0026}, 0, htfArr, 0, 27);
        System.arraycopy(new Htf[]{htfA0027, htfA0028, htfA0029, htfA0030, htfA0031, htfA0032, htfA0033, htfA0034, htfA0035, htfA0036, htfA0037, htfA0038, htfA0039, htfA0040, htfA0041, htfA0042, htfA0043, htfA0044, htfA0045, htfA0046, htfA0047, htfA0048, htfA0049, htfA0050, htfA0051, htfA0052, htfA0053}, 0, htfArr, 27, 27);
        System.arraycopy(new Htf[]{htfA0054, htfA0055, htfA0056, htfA0057, htfA0058, htfA0059, htfA0060, htfA0061, htfA0062, htfA0063, htfA0064, htfA0065, htfA0066, htfA0067, htfA0068, htfA0069, htfA0070, htfA0071, htfA0072, htfA0073, htfA0074, htfA0075, htfA0076, htfA0077, htfA0078, htfA0079, htfA0080}, 0, htfArr, 54, 27);
        System.arraycopy(new Htf[]{htfA0081, htfA0082, htfA0083, htfA0084, htfA0085, htfA0086, htfA0087, htfA0088, htfA0089, htfA0090, htfA0091, htfA0092, htfA0093, htfA0094, htfA0095, htfA0096}, 0, htfArr, 81, 16);
        A00 = htfArr;
    }

    public static Htf A00(String str, String str2, int i, int i2) {
        return new Htf(str, i, i2, str2);
    }

    public static Htf valueOf(String str) {
        return (Htf) Enum.valueOf(Htf.class, str);
    }

    public static Htf[] values() {
        return (Htf[]) A00.clone();
    }

    public Htf(String str, int i, int i2, String str2) {
        this.mMaxLength = i2;
        this.mShortKey = str2;
    }
}
