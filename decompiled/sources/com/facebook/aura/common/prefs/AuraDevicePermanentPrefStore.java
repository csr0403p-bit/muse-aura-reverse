package com.facebook.aura.common.prefs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraDevicePermanentPrefStore {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraDevicePermanentPrefStore[] $VALUES;
    public static final AuraDevicePermanentPrefStore ACS_CONFIG;
    public static final AuraDevicePermanentPrefStore ATTRIBUTION;
    public static final AuraDevicePermanentPrefStore CVM_CHIP_SELECTION_BUDGET;
    public static final AuraDevicePermanentPrefStore CVM_HANDSHAKE_PROOFS;
    public static final AuraDevicePermanentPrefStore DEVELOPER_OVERRIDES;
    public static final AuraDevicePermanentPrefStore DEVELOPER_SETTINGS;
    public static final AuraDevicePermanentPrefStore DEVICE_IDENTIFIERS;
    public static final AuraDevicePermanentPrefStore FIRST_RUN;
    public static final AuraDevicePermanentPrefStore HOME_SCREEN_WIDGETS;
    public static final AuraDevicePermanentPrefStore INSTALL_REFERRER;
    public static final AuraDevicePermanentPrefStore LINK_DEVICE_KEY_REVOCATIONS;
    public static final AuraDevicePermanentPrefStore NOTIFICATION_SETTINGS;
    public static final AuraDevicePermanentPrefStore ONE_TAP_LOGIN;
    public static final AuraDevicePermanentPrefStore PERMISSION_REQUESTS;
    public static final AuraDevicePermanentPrefStore REMEMBERED_ACCOUNTS;
    public static final AuraDevicePermanentPrefStore SANDBOX;
    public static final AuraDevicePermanentPrefStore SAVED_ACCOUNT;
    public static final AuraDevicePermanentPrefStore SAVED_AYMH;
    public static final AuraDevicePermanentPrefStore SAVED_DBL;
    public static final AuraDevicePermanentPrefStore TRAFFIC_NTS_DEVICE_STORE;
    public final String key;

    static {
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore = new AuraDevicePermanentPrefStore("ACS_CONFIG", 0, "acs_config");
        ACS_CONFIG = auraDevicePermanentPrefStore;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore2 = new AuraDevicePermanentPrefStore("ATTRIBUTION", 1, "hatch_attribution");
        ATTRIBUTION = auraDevicePermanentPrefStore2;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore3 = new AuraDevicePermanentPrefStore("CVM_CHIP_SELECTION_BUDGET", 2, "cvm_chip_selection_budget");
        CVM_CHIP_SELECTION_BUDGET = auraDevicePermanentPrefStore3;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore4 = new AuraDevicePermanentPrefStore("CVM_HANDSHAKE_PROOFS", 3, "hatch_cvm_handshake_proofs");
        CVM_HANDSHAKE_PROOFS = auraDevicePermanentPrefStore4;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore5 = new AuraDevicePermanentPrefStore("DEVELOPER_OVERRIDES", 4, "aura_developer_overrides");
        DEVELOPER_OVERRIDES = auraDevicePermanentPrefStore5;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore6 = new AuraDevicePermanentPrefStore("DEVELOPER_SETTINGS", 5, "hatch_developer_prefs");
        DEVELOPER_SETTINGS = auraDevicePermanentPrefStore6;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore7 = new AuraDevicePermanentPrefStore("DEVICE_IDENTIFIERS", 6, "aura_device");
        DEVICE_IDENTIFIERS = auraDevicePermanentPrefStore7;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore8 = new AuraDevicePermanentPrefStore("FIRST_RUN", 7, "hatch_first_run");
        FIRST_RUN = auraDevicePermanentPrefStore8;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore9 = new AuraDevicePermanentPrefStore("HOME_SCREEN_WIDGETS", 8, "home_screen_widgets");
        HOME_SCREEN_WIDGETS = auraDevicePermanentPrefStore9;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore10 = new AuraDevicePermanentPrefStore("INSTALL_REFERRER", 9, "hatch_install_referrer_logger");
        INSTALL_REFERRER = auraDevicePermanentPrefStore10;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore11 = new AuraDevicePermanentPrefStore("LINK_DEVICE_KEY_REVOCATIONS", 10, "hatch_link_device_key_revocations");
        LINK_DEVICE_KEY_REVOCATIONS = auraDevicePermanentPrefStore11;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore12 = new AuraDevicePermanentPrefStore("NOTIFICATION_SETTINGS", 11, "hatch_os_notification_setting");
        NOTIFICATION_SETTINGS = auraDevicePermanentPrefStore12;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore13 = new AuraDevicePermanentPrefStore("ONE_TAP_LOGIN", 12, "native_login_one_tap");
        ONE_TAP_LOGIN = auraDevicePermanentPrefStore13;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore14 = new AuraDevicePermanentPrefStore("PERMISSION_REQUESTS", 13, "hatch_permissions");
        PERMISSION_REQUESTS = auraDevicePermanentPrefStore14;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore15 = new AuraDevicePermanentPrefStore("REMEMBERED_ACCOUNTS", 14, "native_login_remembered_accounts");
        REMEMBERED_ACCOUNTS = auraDevicePermanentPrefStore15;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore16 = new AuraDevicePermanentPrefStore("SANDBOX", 15, "aura_sandbox_settings");
        SANDBOX = auraDevicePermanentPrefStore16;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore17 = new AuraDevicePermanentPrefStore("SAVED_ACCOUNT", 16, "saved_account_info");
        SAVED_ACCOUNT = auraDevicePermanentPrefStore17;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore18 = new AuraDevicePermanentPrefStore("SAVED_AYMH", 17, "saved_aymh_info");
        SAVED_AYMH = auraDevicePermanentPrefStore18;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore19 = new AuraDevicePermanentPrefStore("SAVED_DBL", 18, "saved_dbl_info");
        SAVED_DBL = auraDevicePermanentPrefStore19;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore20 = new AuraDevicePermanentPrefStore("TRAFFIC_NTS_DEVICE_STORE", 19, "traffic_nts_device_store");
        TRAFFIC_NTS_DEVICE_STORE = auraDevicePermanentPrefStore20;
        AuraDevicePermanentPrefStore[] auraDevicePermanentPrefStoreArr = {auraDevicePermanentPrefStore, auraDevicePermanentPrefStore2, auraDevicePermanentPrefStore3, auraDevicePermanentPrefStore4, auraDevicePermanentPrefStore5, auraDevicePermanentPrefStore6, auraDevicePermanentPrefStore7, auraDevicePermanentPrefStore8, auraDevicePermanentPrefStore9, auraDevicePermanentPrefStore10, auraDevicePermanentPrefStore11, auraDevicePermanentPrefStore12, auraDevicePermanentPrefStore13, auraDevicePermanentPrefStore14, auraDevicePermanentPrefStore15, auraDevicePermanentPrefStore16, auraDevicePermanentPrefStore17, auraDevicePermanentPrefStore18, auraDevicePermanentPrefStore19, auraDevicePermanentPrefStore20};
        $VALUES = auraDevicePermanentPrefStoreArr;
        $ENTRIES = C3cG.A0w(auraDevicePermanentPrefStoreArr);
    }

    public static Ey9<AuraDevicePermanentPrefStore> getEntries() {
        return $ENTRIES;
    }

    public static AuraDevicePermanentPrefStore valueOf(String str) {
        return (AuraDevicePermanentPrefStore) Enum.valueOf(AuraDevicePermanentPrefStore.class, str);
    }

    public static AuraDevicePermanentPrefStore[] values() {
        return (AuraDevicePermanentPrefStore[]) $VALUES.clone();
    }

    public final String getKey$fbandroid_express_aura_java_com_facebook_aura_common_prefs_prefs() {
        return this.key;
    }

    public AuraDevicePermanentPrefStore(String str, int i, String str2) {
        this.key = str2;
    }
}
