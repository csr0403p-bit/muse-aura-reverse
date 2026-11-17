package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.common.identifiers.fdid.AuraFdidStorage;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.maps.scene.HatchMapThemeKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.List;

/* loaded from: classes6.dex */
public final class Hzd extends GraphQlCallInput {
    public final int $t;

    public Hzd(int i, List list, int i2, C06H c06h) {
        this.$t = 6;
        this.$t = 6;
        A09("purchase_history", null);
    }

    public Hzd(Hzd hzd, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, C06H c06h, int i, int i2) {
        this.$t = 4;
        this.$t = 4;
        AbstractC7608F5v.A1G(this, null, "android_device_performance_class");
        AbstractC7608F5v.A1G(this, null, "android_os_api_level");
        A09("blacklisted_styles", null);
        A08("bloks_version", null);
        A08("cached_templates_version", null);
        A07("debug_overlay_enabled", null);
        A08("debug_tooling_metadata_token", null);
        A08("extra_data", null);
        A09("fblite_unity_properties", null);
        AbstractC7608F5v.A1G(this, null, "gpu_memory_mb");
        A07("in_free_mode", null);
        AbstractC7608F5v.A1G(this, null, "ios_gpu_family");
        A07("is_data_savings_mode_active", null);
        A07("is_e2e_test", null);
        A07("is_flipper_enabled", null);
        A07("is_push_on", null);
        A09("js_cache_contents", null);
        A07("perf_debug_overlay_enabled", null);
        AbstractC7608F5v.A1G(this, null, "pixel_ratio");
        A09("styles", null);
        A08("styles_id", null);
        A08("surface", null);
        A09("theme_params", null);
        A08("ttrc_join_id", null);
        AbstractC7608F5v.A1G(this, null, "ttrc_marker_id");
        A07("use_cached_templates", null);
        A07("using_white_navbar", null);
    }

    public Hzd(int i) {
        this.$t = i;
        switch (i) {
            case 2:
            case 3:
            case 18:
                break;
            case 4:
                this.$t = 4;
                this.$t = 4;
                AbstractC7608F5v.A1G(this, null, "android_device_performance_class");
                AbstractC7608F5v.A1G(this, null, "android_os_api_level");
                A09("blacklisted_styles", null);
                A08("bloks_version", null);
                A08("cached_templates_version", null);
                A07("debug_overlay_enabled", null);
                A08("debug_tooling_metadata_token", null);
                A08("extra_data", null);
                A09("fblite_unity_properties", null);
                AbstractC7608F5v.A1G(this, null, "gpu_memory_mb");
                A07("in_free_mode", null);
                AbstractC7608F5v.A1G(this, null, "ios_gpu_family");
                A07("is_data_savings_mode_active", null);
                A07("is_e2e_test", null);
                A07("is_flipper_enabled", null);
                A07("is_push_on", null);
                A09("js_cache_contents", null);
                A07("perf_debug_overlay_enabled", null);
                AbstractC7608F5v.A1G(this, null, "pixel_ratio");
                A09("styles", null);
                A08("styles_id", null);
                A08("surface", null);
                A09("theme_params", null);
                A08("ttrc_join_id", null);
                AbstractC7608F5v.A1G(this, null, "ttrc_marker_id");
                A07("use_cached_templates", null);
                A07("using_white_navbar", null);
                break;
            case 5:
                this.$t = 5;
                this.$t = 5;
                A08("async_request_type", null);
                AbstractC7608F5v.A1G(this, null, "battery_level");
                A08("bloks_request_type", null);
                A07("has_zero_external_url_override", null);
                A07("is_battery_charging", null);
                A07("is_keypad_navigation_enabled", null);
                A07("is_landing_screen", null);
                A07("is_push_on", null);
                A07("is_qpl_e2e_tracing", null);
                A07("is_soft_key_device", null);
                A09("navigation_markers", null);
                A08("network_quality", null);
                A09("nt_state_deprecated", null);
                A08("prepushLogicName", null);
                A07("presence_turned_on", null);
                AbstractC7608F5v.A1G(this, null, "private_sharing_owner_id");
                A08("private_sharing_wrapped_url_pfbid", null);
                AbstractC7608F5v.A1G(this, null, "protocol_version");
                A08("screen_request_type", null);
                A09("unity_properties", null);
                A07("user_preferences_video_autoplay", null);
                A08("user_preferences_video_autoplay_wifi_and_cell", null);
                A08("view_metadata", null);
                A08("wifi_status", null);
                break;
            default:
                this.$t = 6;
                this.$t = 6;
                A09("purchase_history", null);
                break;
        }
    }

    public Hzd(String str) {
        this.$t = 7;
        this.$t = 7;
        C7384Etj.A0Y(str, 0);
        A08("sku", str);
        A08("original_transaction_id", null);
        A08("payload_identifier", null);
    }

    public Hzd(String str, String str2, String str3, String str4) {
        this.$t = 14;
        this.$t = 14;
        C7384Etj.A0Y(str, 0);
        A08("external_product_id", str);
        A08("external_transaction_id", str2);
        A08("platform", str3);
        A08("verification_data", str4);
        A08("country_code", null);
        A08("data_signature", null);
        A08("developer_payload", null);
        A08("external_purchase_token", null);
        A08("iap_payload_uuid", null);
        A08("product_type", null);
        A08("quote_id", null);
        A08("session_id", null);
        A08("transaction_state", null);
        AbstractC7608F5v.A1G(this, null, "transaction_time");
    }

    public Hzd(Hzd hzd, String str, String str2, List list) {
        this.$t = 17;
        this.$t = 17;
        C7384Etj.A0Y(str, 1);
        AbstractC7609F5w.A19(this, hzd, "caller_context");
        A08("place_id", str);
        A09("product_sources", list);
        A08("motivation", str2);
        AbstractC7608F5v.A1G(this, null, "num_gallery_media");
        AbstractC7608F5v.A1G(this, null, "num_quotes");
        A08("product_id", null);
        AbstractC7608F5v.A1G(this, null, "product_version");
    }

    public Hzd(Hzd hzd, String str) {
        this.$t = 1;
        C7384Etj.A0Y(str, 0);
        A08("device_id", str);
        A08("push_app_id_str", "944424684749591");
        AbstractC7609F5w.A19(this, hzd, "token");
    }

    public Hzd() {
        this.$t = 11;
        A08("sdk", "ANDROID");
        AbstractC7608F5v.A1G(this, 2, "version");
    }

    public Hzd(String str, String str2, int i) {
        this.$t = 16;
        A08("caller", "HATCH");
        A08("caller_request_id", null);
    }

    public Hzd(String str, List list) {
        this.$t = 9;
        this.$t = 9;
        C7384Etj.A0Y(list, 1);
        A08("platform", str);
        A09("product_ids", list);
        A08("product_type", "ALL_PRODUCTS");
        A08(ErrorReportingConstants.APP_NAME_KEY, null);
        A08("developer_payload", null);
        A08("platform_mode", null);
        A08("play_billing_version", null);
        A08("purchase_country", null);
        A08("purchase_funnel_id", null);
        A09("purchase_history", null);
        A08("referral_code", null);
    }

    public Hzd(Hzd hzd, int i) {
        this.$t = 12;
        AbstractC7608F5v.A1G(this, Integer.valueOf(i), "expires_at");
        AbstractC7609F5w.A19(this, hzd, "token");
    }

    public Hzd(Hzd hzd, String str, String str2, String str3, String str4, String str5, String str6) {
        this.$t = 0;
        this.$t = 0;
        C7384Etj.A0Y(str, 0);
        A08("device_id", str);
        A08("push_app_id_str", "944424684749591");
        A08("request_id", str2);
        A08("service_endpoint_type", str3);
        AbstractC7609F5w.A19(this, hzd, "token");
        A08("android_id", str4);
        A08(JarvisProtocolKt.APP_VERSION_QUERY_PARAM, null);
        A08("bundle_id", "com.facebook.aura");
        A08(AuraFdidStorage.KEY_ID, null);
        A08(BV3.A00(65), null);
        A08(BV3.A00(66), null);
        A08("hpke_pubkey", null);
        A08("ios_identifier_for_vendor", null);
        A08(HatchMapThemeKt.PARAM_LOCALE, str5);
        A08("os_settings", str6);
        A08("os_version", null);
        A08("vm_id", null);
    }

    public Hzd(String str, int i) {
        String strA00;
        this.$t = i;
        C7384Etj.A0Y(str, 0);
        if (8 - i != 0) {
            strA00 = BV3.A00(81);
        } else {
            strA00 = "offer_id";
        }
        A08(strA00, str);
    }

    public Hzd(String str, String str2, String str3, String str4, String str5) {
        this.$t = 13;
        AnonymousClass002.A1B(str2, 1, str4);
        A08("component", str);
        A08(ReplyAttributionSerializer.TYPE_MESSAGE, str2);
        A08("step", str3);
        A08(BrowserOperationCatalogKt.VALUE, str4);
        A08("domain", str5);
    }

    public Hzd(String str, List<String> list, String str2) {
        this.$t = 10;
        A09("external_product_ids", list);
        A08("quotable_id", str);
    }
}
