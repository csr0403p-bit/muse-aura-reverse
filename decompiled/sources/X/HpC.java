package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.commands.calendar.CalendarEventsCreateHandlerKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HpC {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HpC[] A01;
    public static final HpC A02 = new HpC("ANNA_NATIVE_MODULE", "ANNA_NATIVE_MODULE", "viewpoints", Collections.singletonList(1), 0, false);
    public static final HpC A03 = A00("AR_CAMERA", "ar_engine", Collections.singletonList(1), 1, false);
    public static final HpC A04 = A00("AURA_HATCH", "hatch_android", AbstractC7607F5u.A16(0, 1), 2, true);
    public static final HpC A05 = new HpC("BLOKS_DEVICE_LOCATION", "bloks_device_location", "bloks_ui_core", Collections.singletonList(0), 3, false);
    public static final HpC A06 = A00("FB_ACCOUNT_LOCATION_SETTING", "pdp_signals_location", Collections.singletonList(0), 4, false);
    public static final HpC A07 = A00("FB_ADS_TARGETING", "targeting_foundations", Collections.singletonList(1), 5, false);
    public static final HpC A08 = A00("FB_AI_BOTS", "fb_meta_ai_foundation", Collections.singletonList(1), 6, false);
    public static final HpC A09 = A00("FB_AI_DEMOS", "ai_demos", Collections.singletonList(1), 7, false);
    public static final HpC A0A = A00("FB_ANDROID_PLATFORM_LOCATION_MANAGER_INTERNAL", "pdp_signals_location", Collections.singletonList(1), 8, false);
    public static final HpC A0B = A00("FB_AUTH", "login_caa_android", Collections.singletonList(1), 9, true);
    public static final HpC A0C = A00("FB_BUGREPORTER", "facebook_app_bugreporter", Collections.singletonList(1), 10, false);
    public static final HpC A0D = A00("FB_BUSINESS", "business_sharing", Collections.singletonList(1), 11, false);
    public static final HpC A0E = A00("FB_CHECKIN_SEARCH", "fb_creation_sharing_experience", Collections.singletonList(1), 12, false);
    public static final HpC A0F = A00("FB_COMPOSER_ACTIVITY_SHARING", "ios_friend_sharing", Collections.singletonList(1), 13, false);
    public static final HpC A0G = A00("FB_COMPOSER_CHECKIN", "location_components", Collections.singletonList(0), 14, false);
    public static final HpC A0H = A00("FB_COMPOSER_TAG_ACTIVITY", "ios_friend_sharing", Collections.singletonList(1), 15, false);
    public static final HpC A0I = A00("FB_COMPOSER_TAG_EVENT", "events_mobile", Collections.singletonList(1), 16, true);
    public static final HpC A0J = A00("FB_DEVICE_LOCATION_SETTING", "pdp_signals_location", Collections.singletonList(0), 17, false);
    public static final HpC A0K = A00("FB_DEVICE_PERMISSION", "consent_product", Collections.singletonList(0), 18, false);
    public static final HpC A0L = A00("FB_DISTANCE_PICKER", "pdp_signals_location", Collections.singletonList(1), 19, false);
    public static final HpC A0M = A00("FB_DPK", "consent_product", Collections.singletonList(0), 20, false);
    public static final HpC A0N = A00("FB_EVENTS", "events_mobile", AbstractC7607F5u.A16(0, 1), 21, false);
    public static final HpC A0O = A00("FB_FDS_LOCATION_PICKER", "fds_engineering_android", Collections.singletonList(1), 22, false);
    public static final HpC A0P = A00("FB_FEED", "fds_engineering_android", Collections.singletonList(0), 23, false);
    public static final HpC A0Q = A00("FB_FEED_ADS_DELIVERY", "fam_delivery_economics", Collections.singletonList(1), 24, false);
    public static final HpC A0R = A00("FB_FINGERPRINT", "pdp_signals_location", Collections.singletonList(1), 25, false);
    public static final HpC A0S = A00("FB_FOREGROUND_LOCATION_UPLOAD", "pdp_signals_location", Collections.singletonList(1), 26, false);
    public static final HpC A0T = A00("FB_GEMSTONE", "dating_react_native_sop", Collections.singletonList(1), 27, false);
    public static final HpC A0U = A00("FB_GPS_ACCESS_LOW_NO_TRAFFIC_LEGACY_CALLER", "pdp_signals_location", Collections.singletonList(1), 28, false);
    public static final HpC A0V = A00("FB_INSPIRATION", "inspirational_sharing_and_growth_privacy_and_controls", Collections.singletonList(1), 29, false);
    public static final HpC A0W = A00("FB_INTERNAL_SETTING", "pdp_signals_location", Collections.singletonList(0), 30, false);
    public static final HpC A0X = A00("FB_INTERNAL_SETTING_DPK_DEMO", "pdp_signals_location", Collections.singletonList(0), 31, false);
    public static final HpC A0Y = A00("FB_LITE_LOCATION_ACCESS", "pdp_signals_location", Collections.singletonList(1), 32, false);
    public static final HpC A0Z = A00("FB_LOCAL_ENDPOINT", "search_product", Collections.singletonList(1), 33, true);
    public static final HpC A0a = A00("FB_LOCATION_COMPONENT", "location_components", Collections.singletonList(0), 34, false);
    public static final HpC A0b = A00("FB_LOCATION_FRAME_PICKER", "messenger_stories_android", Collections.singletonList(0), 35, true);
    public static final HpC A0c = A00("FB_LOCATION_KIT_DEBUG", "pdp_signals_location", Collections.singletonList(0), 36, false);
    public static final HpC A0d = A00("FB_LOCATION_KIT_TEST", "lh_products", Collections.singletonList(0), 37, false);
    public static final HpC A0e = A00("FB_LOCATION_OPTIN_MANAGER", "lh_products", Collections.singletonList(0), 38, false);
    public static final HpC A0f = A00("FB_LOCATION_PICKER", "pdp_signals_location", Collections.singletonList(1), 39, false);
    public static final HpC A0g = A00("FB_LOCATION_REACT_NATIVE", "react_native", Collections.singletonList(1), 40, false);
    public static final HpC A0h = A00("FB_LOCATION_SETTING", "pdp_signals_location", Collections.singletonList(0), 41, false);
    public static final HpC A0i = A00("FB_LOCATION_SETTING_OPT_IN_BASE", "pdp_signals_location", Collections.singletonList(0), 42, false);
    public static final HpC A0j = A00("FB_LOCATION_SETTING_REVIEW", "pdp_signals_location", Collections.singletonList(0), 43, false);
    public static final HpC A0k = A00("FB_MAPBOX", "maps_client", Collections.singletonList(1), 44, true);
    public static final HpC A0l = A00("FB_MAPS", "maps_client", AbstractC7607F5u.A16(0, 1), 45, true);
    public static final HpC A0m = A00("FB_MARKETPLACE_TAB", "mp_feed_systems", Collections.singletonList(0), 46, false);
    public static final HpC A0n = A00("FB_MESSENGER_LIVE_LOCATION", "msgr_sharing_android", Collections.singletonList(1), 47, false);
    public static final HpC A0o = A00("FB_MN", "messenger_classic_code_ownership", AbstractC7607F5u.A16(0, 1), 48, false);
    public static final HpC A0p = A00("FB_MR_LOCATION", "maps_infra", Collections.singletonList(0), 49, false);
    public static final HpC A0q = A00("FB_MSGR_LIVE_LOCATION_FOREGROUND_LOCATION_MANAGER", "msgr_sharing_android", Collections.singletonList(1), 50, false);
    public static final HpC A0r = A00("FB_NEARBY_PLACES", "msgr_sharing_android", Collections.singletonList(1), 51, false);
    public static final HpC A0s = A00("FB_NETWORK_INSIGHT", "mobile_networking_services", Collections.singletonList(1), 52, false);
    public static final HpC A0t = A00("FB_NT", "lh_products", Collections.singletonList(0), 53, false);
    public static final HpC A0u = A00("FB_PAGE_ADMIN_VERIFICATION", "paidex_engagement", Collections.singletonList(0), 54, false);
    public static final HpC A0v = A00("FB_PAGE_RN", "paidex_engagement", Collections.singletonList(0), 55, false);
    public static final HpC A0w = A00("FB_PAY", "meta_pay_wallet", Collections.singletonList(0), 56, false);
    public static final HpC A0x = A00("FB_PHOTO", "ios_news_feed_ui", Collections.singletonList(0), 57, false);
    public static final HpC A0y = A00("FB_PHOTO_LOCATION_TAGGING", "fb_creation_sharing_experience", Collections.singletonList(0), 58, false);
    public static final HpC A0z = A00("FB_PLACES_CHECKIN", "fb_creation_sharing_experience", Collections.singletonList(1), 59, false);
    public static final HpC A10 = A00("FB_PROFILE_GEMSTONE", "dating_react_native_sop", Collections.singletonList(0), 60, false);
    public static final HpC A11 = A00("FB_REACT_KIT", "react_native", Collections.singletonList(0), 61, false);
    public static final HpC A12 = A00("FB_RECOGNIZER", "camera_platform_xr", Collections.singletonList(0), 62, false);
    public static final HpC A13 = A00("FB_SEARCH", "search_product", Collections.singletonList(1), 63, true);
    public static final HpC A14 = A00("FB_SEARCH_FILTER", "search_product", Collections.singletonList(0), 64, false);
    public static final HpC A15 = A00("FB_SETTINGS_XPLAT", "pdp_signals_location", Collections.singletonList(0), 65, false);
    public static final HpC A16 = A00("FB_SHARE_EXTENSION", "creation_growth", Collections.singletonList(0), 66, false);
    public static final HpC A17 = A00("FB_SOCIAL", "local_cpg", Collections.singletonList(0), 67, false);
    public static final HpC A18 = A00("FB_SPARK", "camera_platform_xr", Collections.singletonList(0), 68, false);
    public static final HpC A19 = A00("FB_STICKER_EVENT_PICKER", "inspiration_sharing_inventory", Collections.singletonList(1), 69, true);
    public static final HpC A1A = A00("FB_STORY", "location_components", Collections.singletonList(0), 70, false);
    public static final HpC A1B = A00("FB_TEST", "privacy_experiences_settings", Collections.singletonList(0), 71, false);
    public static final HpC A1C = A00("FB_THREAD_INTENT", "genai_msgr_android", Collections.singletonList(1), 72, false);
    public static final HpC A1D = A00("FB_VIDEO_LOGGING", "android_playback_triage", Collections.singletonList(1), 73, false);
    public static final HpC A1E = A00("FB_WEATHER", "kg", Collections.singletonList(1), 74, false);
    public static final HpC A1F = A00("IG_BOOST", "ig_boost_client", Collections.singletonList(1), 75, false);
    public static final HpC A1G = A00("IG_BOOST_AUDIENCE", "ig_boost_client", AbstractC7607F5u.A16(0, 1), 76, false);
    public static final HpC A1H = A00("IG_BUSINESS", "ig_boost_client", AbstractC7607F5u.A16(0, 1), 77, false);
    public static final HpC A1I = A00("IG_CREATION", "ig_stories_android", AbstractC7607F5u.A16(0, 1), 78, true);
    public static final HpC A1J = A00("IG_DIRECT_LIVE_LOCATION", "igd_groups_messaging_android", Collections.singletonList(1), 79, false);
    public static final HpC A1K = A00("IG_DIRECT_LIVE_LOCATION_MAP", "igd_groups_messaging_android", Collections.singletonList(1), 80, false);
    public static final HpC A1L = A00("IG_DIRECT_LOCATION_MANAGER", "pdp_signals_location", Collections.singletonList(1), 81, false);
    public static final HpC A1M = A00("IG_DIRECT_META_AI", "ig_meta_ai_mobile", Collections.singletonList(1), 82, false);
    public static final HpC A1N = A00("IG_DIRECT_NOTES", "ig_direct_notes_ios", Collections.singletonList(1), 83, false);
    public static final HpC A1O = A00("IG_DISCOVERY", "ig_home_japan", Collections.singletonList(0), 84, false);
    public static final HpC A1P = A00("IG_DISCOVERY_MAP", "ig_home_japan_ios", AbstractC7607F5u.A16(0, 1), 85, true);
    public static final HpC A1Q = A00("IG_DPK", "consent_product", Collections.singletonList(0), 86, false);
    public static final HpC A1R = A00("IG_EXPLORE", "ig_reels_product_ios", Collections.singletonList(1), 87, true);
    public static final HpC A1S = A00("IG_FOREGROUND_LOCATION_UPLOAD", "pdp_signals_location", Collections.singletonList(1), 88, false);
    public static final HpC A1T = A00("IG_FRIEND_MAP", "ig_nsx_android", AbstractC7607F5u.A16(0, 1), 89, false);
    public static final HpC A1U = A00("IG_GALLERY_PICKER", "ig_stories_android", AbstractC7607F5u.A16(0, 1), 90, false);
    public static final HpC A1V = A00("IG_GUIDE_MEDIA", "ig_labs_apollo", Collections.singletonList(0), 91, false);
    public static final HpC A1W = A00("IG_LIVE", "instagram_live", Collections.singletonList(1), 92, false);
    public static final HpC A1X = A00("IG_LOCATION_MANAGER_INTERNAL", "pdp_signals_location", Collections.singletonList(1), 93, false);
    public static final HpC A1Y = A00("IG_LOCATION_PICKER", "ig_stories_product_ios", Collections.singletonList(0), 94, true);
    public static final HpC A1Z = A00("IG_LOCATION_PLACE_SIGNATURE", "ig_maps_and_locations", Collections.singletonList(1), 95, false);
    public static final HpC A1a = A00("IG_LOCATION_SUGGESTION", "ig_feed_product_ios", AbstractC7607F5u.A16(0, 1), 96, true);
    public static final HpC A1b = A00("IG_LOCATION_TAG", "ig_home_japan_android", Collections.singletonList(0), 97, true);
    public static final HpC A1c = A00("IG_LOCATION_UPLOAD_SERVICE", "pdp_signals_location", Collections.singletonList(1), 98, false);
    public static final HpC A1d = A00("IG_MAIN_FEED", "ig_feed_product_android", AbstractC7607F5u.A16(0, 1), 99, true);
    public static final HpC A1e = A00("IG_MAPS", "ig_maps_and_locations", AbstractC7607F5u.A16(0, 1), 100, false);
    public static final HpC A1f = A00("IG_MAP_INTERNAL", "map_services", Collections.singletonList(0), FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, true);
    public static final HpC A1g = A00("IG_MEDIA_MAP", "ig_home_japan", AbstractC7607F5u.A16(0, 1), 102, false);
    public static final HpC A1h = A00("IG_MEDIA_METADATA", "ig_ios_mobile_core", Collections.singletonList(1), 103, false);
    public static final HpC A1i = A00("IG_NEARBY_LOCATION_NETWORKER", "ig_stories_platform_ios", Collections.singletonList(1), 104, false);
    public static final HpC A1j = A00("IG_NEARBY_VENUE", "ig_stories_android", Collections.singletonList(1), 105, false);
    public static final HpC A1k = A00("IG_NETWORK_INSIGHT", "partner_analytics_data_foundation", Collections.singletonList(1), 106, false);
    public static final HpC A1l = A00("IG_ODIN_DEVICE_SIGNALS_COLLECTION", "pdp_signals_mobile", Collections.singletonList(1), 107, true);
    public static final HpC A1m = A00("IG_PAY", "mft_checkout_products_client", Collections.singletonList(1), MinidumpReader.MODULE_FULL_SIZE, false);
    public static final HpC A1n = A00("IG_PROMOTE_AUDIENCE", "ig_boost_client", Collections.singletonList(0), 109, false);
    public static final HpC A1o = A00("IG_QUICK_PROMOTION", "quick_promotion", Collections.singletonList(1), 110, false);
    public static final HpC A1p = A00("IG_REELS_ARCHIVE", "ig_stories_android", Collections.singletonList(1), 111, false);
    public static final HpC A1q = A00("IG_SEARCH", "igx_search_client", AbstractC7607F5u.A16(0, 1), HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, false);
    public static final HpC A1r = A00("IG_SHARE_LOCATION_METADATA", "ig_feed_product_ios", Collections.singletonList(1), 113, true);
    public static final HpC A1s = A00("IG_STICKER", "ig_stories_product_ios", AbstractC7607F5u.A16(0, 1), 114, true);
    public static final HpC A1t = A00("IG_STORY_ARCHIVE", "ig_stories_product_ios", Collections.singletonList(0), 115, true);
    public static final HpC A1u = A00("IG_STORY_IOS", "ig_stories_product_ios", Collections.singletonList(0), 116, true);
    public static final HpC A1v = A00("IG_THREAD_LOCATION_TAG_PICKER", "ig_home_japan_android", Collections.singletonList(1), 117, true);
    public static final HpC A1w = A00("IG_TV", "igtv", Collections.singletonList(0), 118, true);
    public static final HpC A1x = A00("IG_USER_LIST", "igds_ios", Collections.singletonList(1), 119, false);
    public static final HpC A1y = A00("IG_USER_VISITATION_INFO", "partner_analytics_instrumentation", Collections.singletonList(1), 120, false);
    public static final HpC A1z = A00("IG_VENUE_DISTANCE", "ig_maps_and_locations", Collections.singletonList(1), 121, false);
    public static final HpC A20 = A00("IG_VIDEO_LOGGING", "instagram_media_consumption", Collections.singletonList(1), 122, false);
    public static final HpC A21 = A00("INDOOR_SCANNER", "pdp_signals_location", Collections.singletonList(1), 123, false);
    public static final HpC A22 = A00("META_GENAI", "meta_ai_experiences", Collections.singletonList(1), 124, true);
    public static final HpC A23 = A00("NUX_LOCATION_SERVICES", "ig_ios_growth", AbstractC7607F5u.A16(0, 1), 125, false);
    public static final HpC A24 = A00("SOCAL", CalendarEventsCreateHandlerKt.PARAM_EVENTS, Collections.singletonList(1), 126, true);
    public static final HpC A25 = new HpC("TEST_CALLER_TASNIM", "test_caller_tasnim", "uig_service", AbstractC7607F5u.A16(0, 1), 127, false);
    public static final HpC A26 = A00("THREADS_LOCATION_PICKER", "p92_ios", Collections.singletonList(1), 128, false);
    public static final HpC A27 = A00("THREADS_NEARBY_CUSTOM_FEED", "pdp_signals_location", Collections.singletonList(1), AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, false);
    public final String callerName;
    public final List<Integer> capability;
    public final boolean holdout;
    public final String oncall;

    static {
        HpC hpCA00 = A00("THREADS_SEARCH", "p92_ios", Collections.singletonList(1), 130, false);
        HpC[] hpCArr = new HpC[131];
        System.arraycopy(new HpC[]{A02, A03, A04, A05, A06, A07, A08, A09, A0A, A0B, A0C, A0D, A0E, A0F, A0G, A0H, A0I, A0J, A0K, A0L, A0M, A0N, A0O, A0P, A0Q, A0R, A0S}, 0, hpCArr, 0, 27);
        System.arraycopy(new HpC[]{A0T, A0U, A0V, A0W, A0X, A0Y, A0Z, A0a, A0b, A0c, A0d, A0e, A0f, A0g, A0h, A0i, A0j, A0k, A0l, A0m, A0n, A0o, A0p, A0q, A0r, A0s, A0t}, 0, hpCArr, 27, 27);
        System.arraycopy(new HpC[]{A0u, A0v, A0w, A0x, A0y, A0z, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A1A, A1B, A1C, A1D, A1E, A1F, A1G, A1H, A1I, A1J, A1K}, 0, hpCArr, 54, 27);
        System.arraycopy(new HpC[]{A1L, A1M, A1N, A1O, A1P, A1Q, A1R, A1S, A1T, A1U, A1V, A1W, A1X, A1Y, A1Z, A1a, A1b, A1c, A1d, A1e, A1f, A1g, A1h, A1i, A1j, A1k, A1l}, 0, hpCArr, 81, 27);
        System.arraycopy(new HpC[]{A1m, A1n, A1o, A1p, A1q, A1r, A1s, A1t, A1u, A1v, A1w, A1x, A1y, A1z, A20, A21, A22, A23, A24, A25, A26, A27, hpCA00}, 0, hpCArr, MinidumpReader.MODULE_FULL_SIZE, 23);
        A01 = hpCArr;
        A00 = C3cG.A0w(hpCArr);
    }

    public static HpC A00(String str, String str2, List list, int i, boolean z) {
        return new HpC(str, str, str2, list, i, z);
    }

    public static HpC valueOf(String str) {
        return (HpC) Enum.valueOf(HpC.class, str);
    }

    public static HpC[] values() {
        return (HpC[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = this.callerName;
        String str2 = this.oncall;
        List<Integer> list = this.capability;
        boolean z = this.holdout;
        StringBuilder sbA0x = C3cI.A0x("GPSClientCallers(callerName='", str);
        sbA0x.append("', oncall='");
        sbA0x.append(str2);
        sbA0x.append("', capability=");
        sbA0x.append(list);
        return C8j5.A0W(", holdout=", sbA0x, z);
    }

    public HpC(String str, String str2, String str3, List list, int i, boolean z) {
        this.callerName = str2;
        this.oncall = str3;
        this.capability = list;
        this.holdout = z;
    }
}
