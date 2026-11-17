package com.facebook.aura.common.prefs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.devices.pairing.HatchSavedWifiNetworkStoreKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AuraUserPrefStore implements AuraUserPrefStoreKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraUserPrefStore[] $VALUES;
    public static final AuraUserPrefStore ACS_TOKENS;
    public static final AuraUserPrefStore AUDIO_PLAYER;
    public static final AuraUserPrefStore CARD_TOKEN_AUTO_SENDS;
    public static final AuraUserPrefStore CHAT_NOTIFICATION;
    public static final AuraUserPrefStore COMMON;
    public static final AuraUserPrefStore CONFIDENTIAL_VM_SETUP;
    public static final AuraUserPrefStore CONFIDENTIAL_VM_SWITCH;
    public static final AuraUserPrefStore CVM_COLD_LEASE;
    public static final AuraUserPrefStore DISMISSED_DEVICES;
    public static final AuraUserPrefStore IN_APP_PURCHASES;
    public static final AuraUserPrefStore NODE_SYNC_BASELINE;
    public static final AuraUserPrefStore PASSKEY_UPSELL;
    public static final AuraUserPrefStore SAVED_WIFI_NETWORKS;
    public static final AuraUserPrefStore USER_PROFILE;
    public final String key;

    static {
        AuraUserPrefStore auraUserPrefStore = new AuraUserPrefStore("ACS_TOKENS", 0, "hatch_acs_tokens");
        ACS_TOKENS = auraUserPrefStore;
        AuraUserPrefStore auraUserPrefStore2 = new AuraUserPrefStore("AUDIO_PLAYER", 1, "audio_player");
        AUDIO_PLAYER = auraUserPrefStore2;
        AuraUserPrefStore auraUserPrefStore3 = new AuraUserPrefStore("CARD_TOKEN_AUTO_SENDS", 2, "hatch_card_token_auto_sends");
        CARD_TOKEN_AUTO_SENDS = auraUserPrefStore3;
        AuraUserPrefStore auraUserPrefStore4 = new AuraUserPrefStore("CHAT_NOTIFICATION", 3, "hatch_chat_notification");
        CHAT_NOTIFICATION = auraUserPrefStore4;
        AuraUserPrefStore auraUserPrefStore5 = new AuraUserPrefStore("COMMON", 4, "silverstone_lobster");
        COMMON = auraUserPrefStore5;
        AuraUserPrefStore auraUserPrefStore6 = new AuraUserPrefStore("CONFIDENTIAL_VM_SETUP", 5, "hatch_confidential_vm_setup_v2");
        CONFIDENTIAL_VM_SETUP = auraUserPrefStore6;
        AuraUserPrefStore auraUserPrefStore7 = new AuraUserPrefStore("CONFIDENTIAL_VM_SWITCH", 6, "hatch_confidential_vm_switch");
        CONFIDENTIAL_VM_SWITCH = auraUserPrefStore7;
        AuraUserPrefStore auraUserPrefStore8 = new AuraUserPrefStore("CVM_COLD_LEASE", 7, "hatch_cvm_cold_lease");
        CVM_COLD_LEASE = auraUserPrefStore8;
        AuraUserPrefStore auraUserPrefStore9 = new AuraUserPrefStore("DISMISSED_DEVICES", 8, "hatch_dismissed_devices");
        DISMISSED_DEVICES = auraUserPrefStore9;
        AuraUserPrefStore auraUserPrefStore10 = new AuraUserPrefStore("IN_APP_PURCHASES", 9, "in_app_purchases");
        IN_APP_PURCHASES = auraUserPrefStore10;
        AuraUserPrefStore auraUserPrefStore11 = new AuraUserPrefStore("NODE_SYNC_BASELINE", 10, "node_sync_baseline");
        NODE_SYNC_BASELINE = auraUserPrefStore11;
        AuraUserPrefStore auraUserPrefStore12 = new AuraUserPrefStore("PASSKEY_UPSELL", 11, "hatch_passkey_upsell");
        PASSKEY_UPSELL = auraUserPrefStore12;
        AuraUserPrefStore auraUserPrefStore13 = new AuraUserPrefStore("SAVED_WIFI_NETWORKS", 12, HatchSavedWifiNetworkStoreKt.KEY_ALIAS);
        SAVED_WIFI_NETWORKS = auraUserPrefStore13;
        AuraUserPrefStore auraUserPrefStore14 = new AuraUserPrefStore("USER_PROFILE", 13, "aura_user_profile");
        USER_PROFILE = auraUserPrefStore14;
        AuraUserPrefStore[] auraUserPrefStoreArr = {auraUserPrefStore, auraUserPrefStore2, auraUserPrefStore3, auraUserPrefStore4, auraUserPrefStore5, auraUserPrefStore6, auraUserPrefStore7, auraUserPrefStore8, auraUserPrefStore9, auraUserPrefStore10, auraUserPrefStore11, auraUserPrefStore12, auraUserPrefStore13, auraUserPrefStore14};
        $VALUES = auraUserPrefStoreArr;
        $ENTRIES = C3cG.A0w(auraUserPrefStoreArr);
    }

    public static Ey9<AuraUserPrefStore> getEntries() {
        return $ENTRIES;
    }

    public static AuraUserPrefStore valueOf(String str) {
        return (AuraUserPrefStore) Enum.valueOf(AuraUserPrefStore.class, str);
    }

    public static AuraUserPrefStore[] values() {
        return (AuraUserPrefStore[]) $VALUES.clone();
    }

    @Override // com.facebook.aura.common.prefs.AuraUserPrefStoreKey
    public String getKey() {
        return this.key;
    }

    public AuraUserPrefStore(String str, int i, String str2) {
        this.key = str2;
    }
}
