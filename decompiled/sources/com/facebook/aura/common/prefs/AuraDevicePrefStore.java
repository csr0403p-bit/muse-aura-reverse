package com.facebook.aura.common.prefs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraDevicePrefStore {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraDevicePrefStore[] $VALUES;
    public static final AuraDevicePrefStore ABRA_TOKENS;
    public static final AuraDevicePrefStore ACCESS_LIBRARY;
    public static final AuraDevicePrefStore ANALYTICS_SAMPLING_POLICY;
    public static final AuraDevicePrefStore AUTH;
    public static final AuraDevicePrefStore AUTH_FRAMEWORK;
    public static final AuraDevicePrefStore CLIENT_CVM_ANALYTICS;
    public static final AuraDevicePrefStore FFDB;
    public static final AuraDevicePrefStore INSTALL_REFERRER;
    public static final AuraDevicePrefStore INTERNAL_SETTINGS;
    public static final AuraDevicePrefStore LOGIN_ANALYTICS;
    public static final AuraDevicePrefStore MA_HATCH_NATIVE_AUTH_LOGGING;
    public static final AuraDevicePrefStore META_TOKENS;
    public static final AuraDevicePrefStore META_USER_SESSION;
    public static final AuraDevicePrefStore MOBILE_CONFIG_FETCH;
    public static final AuraDevicePrefStore NODE;
    public static final AuraDevicePrefStore NUDGES;
    public static final AuraDevicePrefStore ONBOARDING_ASSET_PREFETCH;
    public static final AuraDevicePrefStore PERMISSION_REQUESTS;
    public static final AuraDevicePrefStore PRELOADS_FPP;
    public static final AuraDevicePrefStore REVIEWS;
    public static final AuraDevicePrefStore SESSIONLESS_MOBILE_CONFIG_FETCH;
    public static final AuraDevicePrefStore USER_DATA_FETCH;
    public static final AuraDevicePrefStore USER_IDS;
    public static final AuraDevicePrefStore USER_SESSION;
    public static final AuraDevicePrefStore VM_IDS;
    public final String key;

    static {
        AuraDevicePrefStore auraDevicePrefStore = new AuraDevicePrefStore("ABRA_TOKENS", 0, "abra_token_storage");
        ABRA_TOKENS = auraDevicePrefStore;
        AuraDevicePrefStore auraDevicePrefStore2 = new AuraDevicePrefStore("ACCESS_LIBRARY", 1, "hatch_access_library");
        ACCESS_LIBRARY = auraDevicePrefStore2;
        AuraDevicePrefStore auraDevicePrefStore3 = new AuraDevicePrefStore("ANALYTICS_SAMPLING_POLICY", 2, "analytics_sampling_policy");
        ANALYTICS_SAMPLING_POLICY = auraDevicePrefStore3;
        AuraDevicePrefStore auraDevicePrefStore4 = new AuraDevicePrefStore("AUTH", 3, "auth_manager");
        AUTH = auraDevicePrefStore4;
        AuraDevicePrefStore auraDevicePrefStore5 = new AuraDevicePrefStore("AUTH_FRAMEWORK", 4, "user_session_store");
        AUTH_FRAMEWORK = auraDevicePrefStore5;
        AuraDevicePrefStore auraDevicePrefStore6 = new AuraDevicePrefStore("CLIENT_CVM_ANALYTICS", 5, "hatch_client_cvm_analytics");
        CLIENT_CVM_ANALYTICS = auraDevicePrefStore6;
        AuraDevicePrefStore auraDevicePrefStore7 = new AuraDevicePrefStore("FFDB", 6, "ffdb");
        FFDB = auraDevicePrefStore7;
        AuraDevicePrefStore auraDevicePrefStore8 = new AuraDevicePrefStore("INSTALL_REFERRER", 7, "hatch_install_referrer_logger");
        INSTALL_REFERRER = auraDevicePrefStore8;
        AuraDevicePrefStore auraDevicePrefStore9 = new AuraDevicePrefStore("INTERNAL_SETTINGS", 8, "silverstone_internal_settings");
        INTERNAL_SETTINGS = auraDevicePrefStore9;
        AuraDevicePrefStore auraDevicePrefStore10 = new AuraDevicePrefStore("LOGIN_ANALYTICS", 9, "meta_login_analytics");
        LOGIN_ANALYTICS = auraDevicePrefStore10;
        AuraDevicePrefStore auraDevicePrefStore11 = new AuraDevicePrefStore("MA_HATCH_NATIVE_AUTH_LOGGING", 10, "ma_hatch_native_auth_logging");
        MA_HATCH_NATIVE_AUTH_LOGGING = auraDevicePrefStore11;
        AuraDevicePrefStore auraDevicePrefStore12 = new AuraDevicePrefStore("META_TOKENS", 11, "meta_token_storage");
        META_TOKENS = auraDevicePrefStore12;
        AuraDevicePrefStore auraDevicePrefStore13 = new AuraDevicePrefStore("META_USER_SESSION", 12, "meta_user_session");
        META_USER_SESSION = auraDevicePrefStore13;
        AuraDevicePrefStore auraDevicePrefStore14 = new AuraDevicePrefStore("MOBILE_CONFIG_FETCH", 13, "aura_mc_fetch");
        MOBILE_CONFIG_FETCH = auraDevicePrefStore14;
        AuraDevicePrefStore auraDevicePrefStore15 = new AuraDevicePrefStore("NODE", 14, "lobster_node");
        NODE = auraDevicePrefStore15;
        AuraDevicePrefStore auraDevicePrefStore16 = new AuraDevicePrefStore("NUDGES", 15, "hatch_nudges");
        NUDGES = auraDevicePrefStore16;
        AuraDevicePrefStore auraDevicePrefStore17 = new AuraDevicePrefStore("ONBOARDING_ASSET_PREFETCH", 16, "onboarding_asset_prefetch");
        ONBOARDING_ASSET_PREFETCH = auraDevicePrefStore17;
        AuraDevicePrefStore auraDevicePrefStore18 = new AuraDevicePrefStore("PERMISSION_REQUESTS", 17, "hatch_permissions");
        PERMISSION_REQUESTS = auraDevicePrefStore18;
        AuraDevicePrefStore auraDevicePrefStore19 = new AuraDevicePrefStore("PRELOADS_FPP", 18, "hatch_preloads_fpp");
        PRELOADS_FPP = auraDevicePrefStore19;
        AuraDevicePrefStore auraDevicePrefStore20 = new AuraDevicePrefStore("REVIEWS", 19, "hatch_reviews");
        REVIEWS = auraDevicePrefStore20;
        AuraDevicePrefStore auraDevicePrefStore21 = new AuraDevicePrefStore("SESSIONLESS_MOBILE_CONFIG_FETCH", 20, "aura_sessionless_mc_fetch");
        SESSIONLESS_MOBILE_CONFIG_FETCH = auraDevicePrefStore21;
        AuraDevicePrefStore auraDevicePrefStore22 = new AuraDevicePrefStore("USER_DATA_FETCH", 21, "aura_user_data_fetch");
        USER_DATA_FETCH = auraDevicePrefStore22;
        AuraDevicePrefStore auraDevicePrefStore23 = new AuraDevicePrefStore("USER_IDS", 22, "user_ids");
        USER_IDS = auraDevicePrefStore23;
        AuraDevicePrefStore auraDevicePrefStore24 = new AuraDevicePrefStore("USER_SESSION", 23, "aura_user_session");
        USER_SESSION = auraDevicePrefStore24;
        AuraDevicePrefStore auraDevicePrefStore25 = new AuraDevicePrefStore("VM_IDS", 24, "vm_ids");
        VM_IDS = auraDevicePrefStore25;
        AuraDevicePrefStore[] auraDevicePrefStoreArr = {auraDevicePrefStore, auraDevicePrefStore2, auraDevicePrefStore3, auraDevicePrefStore4, auraDevicePrefStore5, auraDevicePrefStore6, auraDevicePrefStore7, auraDevicePrefStore8, auraDevicePrefStore9, auraDevicePrefStore10, auraDevicePrefStore11, auraDevicePrefStore12, auraDevicePrefStore13, auraDevicePrefStore14, auraDevicePrefStore15, auraDevicePrefStore16, auraDevicePrefStore17, auraDevicePrefStore18, auraDevicePrefStore19, auraDevicePrefStore20, auraDevicePrefStore21, auraDevicePrefStore22, auraDevicePrefStore23, auraDevicePrefStore24, auraDevicePrefStore25};
        $VALUES = auraDevicePrefStoreArr;
        $ENTRIES = C3cG.A0w(auraDevicePrefStoreArr);
    }

    public static Ey9<AuraDevicePrefStore> getEntries() {
        return $ENTRIES;
    }

    public static AuraDevicePrefStore valueOf(String str) {
        return (AuraDevicePrefStore) Enum.valueOf(AuraDevicePrefStore.class, str);
    }

    public static AuraDevicePrefStore[] values() {
        return (AuraDevicePrefStore[]) $VALUES.clone();
    }

    public final String getKey$fbandroid_express_aura_java_com_facebook_aura_common_prefs_prefs() {
        return this.key;
    }

    public AuraDevicePrefStore(String str, int i, String str2) {
        this.key = str2;
    }
}
