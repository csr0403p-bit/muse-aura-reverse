package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingFailureReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingFailureReason[] $VALUES;
    public static final HatchDevicePairingFailureReason AUTH_FAILED;
    public static final HatchDevicePairingFailureReason BLE_CONNECTION_FAILED;
    public static final HatchDevicePairingFailureReason BLE_SCAN_FAILED;
    public static final HatchDevicePairingFailureReason BLUETOOTH_OFF;
    public static final HatchDevicePairingFailureReason CVM_UNSUPPORTED;
    public static final HatchDevicePairingFailureReason DEVICE_BUSY;
    public static final HatchDevicePairingFailureReason DEVICE_ERROR;
    public static final HatchDevicePairingFailureReason DEVICE_ID_IN_USE;
    public static final HatchDevicePairingFailureReason DEVICE_KEY_FAILED;
    public static final HatchDevicePairingFailureReason DEVICE_NOT_FOUND;
    public static final HatchDevicePairingFailureReason DEVICE_TOKEN_FAILED;
    public static final HatchDevicePairingFailureReason DEVICE_TOKEN_REVOKE_UNKNOWN;
    public static final HatchDevicePairingFailureReason ENCRYPTED_PAIRING_FAILED;
    public static final HatchDevicePairingFailureReason FIRMWARE_UPDATE_REQUIRED;
    public static final HatchDevicePairingFailureReason OTA_FAILED;
    public static final HatchDevicePairingFailureReason OTA_RECONNECT_FAILED;
    public static final HatchDevicePairingFailureReason OTA_WIFI_REQUIRED;
    public static final HatchDevicePairingFailureReason PAIRED_NODES_UNAVAILABLE;
    public static final HatchDevicePairingFailureReason PAIRING_CONFIRMATION_TIMED_OUT;
    public static final HatchDevicePairingFailureReason SDK_TOKEN_DEVICE_LIMIT_REACHED;
    public static final HatchDevicePairingFailureReason SDK_TOKEN_INVALID;
    public static final HatchDevicePairingFailureReason SDK_TOKEN_MISSING;
    public static final HatchDevicePairingFailureReason VM_FAILED;
    public static final HatchDevicePairingFailureReason WIFI_PROVISION_FAILED;
    public static final HatchDevicePairingFailureReason WIFI_SCAN_FAILED;
    public final String value;

    static {
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason = new HatchDevicePairingFailureReason("DEVICE_NOT_FOUND", 0, "device_not_found");
        DEVICE_NOT_FOUND = hatchDevicePairingFailureReason;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason2 = new HatchDevicePairingFailureReason("BLUETOOTH_OFF", 1, "bluetooth_off");
        BLUETOOTH_OFF = hatchDevicePairingFailureReason2;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason3 = new HatchDevicePairingFailureReason("BLE_SCAN_FAILED", 2, "ble_scan_failed");
        BLE_SCAN_FAILED = hatchDevicePairingFailureReason3;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason4 = new HatchDevicePairingFailureReason("BLE_CONNECTION_FAILED", 3, "ble_connection_failed");
        BLE_CONNECTION_FAILED = hatchDevicePairingFailureReason4;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason5 = new HatchDevicePairingFailureReason("PAIRING_CONFIRMATION_TIMED_OUT", 4, "pairing_confirmation_timed_out");
        PAIRING_CONFIRMATION_TIMED_OUT = hatchDevicePairingFailureReason5;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason6 = new HatchDevicePairingFailureReason("ENCRYPTED_PAIRING_FAILED", 5, "encrypted_pairing_failed");
        ENCRYPTED_PAIRING_FAILED = hatchDevicePairingFailureReason6;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason7 = new HatchDevicePairingFailureReason("WIFI_SCAN_FAILED", 6, "wifi_scan_failed");
        WIFI_SCAN_FAILED = hatchDevicePairingFailureReason7;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason8 = new HatchDevicePairingFailureReason("WIFI_PROVISION_FAILED", 7, "wifi_provision_failed");
        WIFI_PROVISION_FAILED = hatchDevicePairingFailureReason8;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason9 = new HatchDevicePairingFailureReason("DEVICE_TOKEN_FAILED", 8, "device_token_failed");
        DEVICE_TOKEN_FAILED = hatchDevicePairingFailureReason9;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason10 = new HatchDevicePairingFailureReason("DEVICE_TOKEN_REVOKE_UNKNOWN", 9, "device_token_revoke_unknown");
        DEVICE_TOKEN_REVOKE_UNKNOWN = hatchDevicePairingFailureReason10;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason11 = new HatchDevicePairingFailureReason("SDK_TOKEN_MISSING", 10, "sdk_token_missing");
        SDK_TOKEN_MISSING = hatchDevicePairingFailureReason11;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason12 = new HatchDevicePairingFailureReason("SDK_TOKEN_INVALID", 11, "sdk_token_invalid");
        SDK_TOKEN_INVALID = hatchDevicePairingFailureReason12;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason13 = new HatchDevicePairingFailureReason("SDK_TOKEN_DEVICE_LIMIT_REACHED", 12, "sdk_token_device_limit_reached");
        SDK_TOKEN_DEVICE_LIMIT_REACHED = hatchDevicePairingFailureReason13;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason14 = new HatchDevicePairingFailureReason("DEVICE_KEY_FAILED", 13, "device_key_failed");
        DEVICE_KEY_FAILED = hatchDevicePairingFailureReason14;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason15 = new HatchDevicePairingFailureReason("FIRMWARE_UPDATE_REQUIRED", 14, "firmware_update_required");
        FIRMWARE_UPDATE_REQUIRED = hatchDevicePairingFailureReason15;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason16 = new HatchDevicePairingFailureReason("CVM_UNSUPPORTED", 15, "cvm_unsupported");
        CVM_UNSUPPORTED = hatchDevicePairingFailureReason16;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason17 = new HatchDevicePairingFailureReason("DEVICE_ID_IN_USE", 16, "device_id_in_use");
        DEVICE_ID_IN_USE = hatchDevicePairingFailureReason17;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason18 = new HatchDevicePairingFailureReason("PAIRED_NODES_UNAVAILABLE", 17, "paired_nodes_unavailable");
        PAIRED_NODES_UNAVAILABLE = hatchDevicePairingFailureReason18;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason19 = new HatchDevicePairingFailureReason("DEVICE_BUSY", 18, "device_busy");
        DEVICE_BUSY = hatchDevicePairingFailureReason19;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason20 = new HatchDevicePairingFailureReason("AUTH_FAILED", 19, "auth_failed");
        AUTH_FAILED = hatchDevicePairingFailureReason20;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason21 = new HatchDevicePairingFailureReason("VM_FAILED", 20, "vm_failed");
        VM_FAILED = hatchDevicePairingFailureReason21;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason22 = new HatchDevicePairingFailureReason("OTA_FAILED", 21, "ota_failed");
        OTA_FAILED = hatchDevicePairingFailureReason22;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason23 = new HatchDevicePairingFailureReason("OTA_WIFI_REQUIRED", 22, "ota_wifi_required");
        OTA_WIFI_REQUIRED = hatchDevicePairingFailureReason23;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason24 = new HatchDevicePairingFailureReason("OTA_RECONNECT_FAILED", 23, "ota_reconnect_failed");
        OTA_RECONNECT_FAILED = hatchDevicePairingFailureReason24;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason25 = new HatchDevicePairingFailureReason("DEVICE_ERROR", 24, "device_error");
        DEVICE_ERROR = hatchDevicePairingFailureReason25;
        HatchDevicePairingFailureReason[] hatchDevicePairingFailureReasonArr = {hatchDevicePairingFailureReason, hatchDevicePairingFailureReason2, hatchDevicePairingFailureReason3, hatchDevicePairingFailureReason4, hatchDevicePairingFailureReason5, hatchDevicePairingFailureReason6, hatchDevicePairingFailureReason7, hatchDevicePairingFailureReason8, hatchDevicePairingFailureReason9, hatchDevicePairingFailureReason10, hatchDevicePairingFailureReason11, hatchDevicePairingFailureReason12, hatchDevicePairingFailureReason13, hatchDevicePairingFailureReason14, hatchDevicePairingFailureReason15, hatchDevicePairingFailureReason16, hatchDevicePairingFailureReason17, hatchDevicePairingFailureReason18, hatchDevicePairingFailureReason19, hatchDevicePairingFailureReason20, hatchDevicePairingFailureReason21, hatchDevicePairingFailureReason22, hatchDevicePairingFailureReason23, hatchDevicePairingFailureReason24, hatchDevicePairingFailureReason25};
        $VALUES = hatchDevicePairingFailureReasonArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingFailureReasonArr);
    }

    public static Ey9<HatchDevicePairingFailureReason> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingFailureReason valueOf(String str) {
        return (HatchDevicePairingFailureReason) Enum.valueOf(HatchDevicePairingFailureReason.class, str);
    }

    public static HatchDevicePairingFailureReason[] values() {
        return (HatchDevicePairingFailureReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchDevicePairingFailureReason(String str, int i, String str2) {
        this.value = str2;
    }
}
