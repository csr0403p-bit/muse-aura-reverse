package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingPoint[] $VALUES;
    public static final HatchDevicePairingPoint AUTH_STARTED;
    public static final HatchDevicePairingPoint BLE_CONNECTED;
    public static final HatchDevicePairingPoint BLE_CONNECT_STARTED;
    public static final HatchDevicePairingPoint BLE_PERMISSION_DENIED;
    public static final HatchDevicePairingPoint BLE_PERMISSION_GRANTED;
    public static final HatchDevicePairingPoint BLE_PERMISSION_REQUESTED;
    public static final HatchDevicePairingPoint BLE_SCAN_STARTED;
    public static final HatchDevicePairingPoint DEVICE_DISCOVERED;
    public static final HatchDevicePairingPoint DEVICE_SELECTED;
    public static final HatchDevicePairingPoint LINK_INFO_CONTINUED;
    public static final HatchDevicePairingPoint LINK_INFO_SHOWN;
    public static final HatchDevicePairingPoint MANUAL_WIFI_ENTRY_SELECTED;
    public static final HatchDevicePairingPoint OTA_APPLIED;
    public static final HatchDevicePairingPoint OTA_RECONNECTED;
    public static final HatchDevicePairingPoint OTA_RECONNECT_STARTED;
    public static final HatchDevicePairingPoint OTA_SKIPPED;
    public static final HatchDevicePairingPoint OTA_STARTED;
    public static final HatchDevicePairingPoint PAIRING_COMPLETED;
    public static final HatchDevicePairingPoint PAIRING_CONFIRMATION_COMPLETED;
    public static final HatchDevicePairingPoint PAIRING_CONFIRMATION_REQUIRED;
    public static final HatchDevicePairingPoint PROVISIONING_STARTED;
    public static final HatchDevicePairingPoint WIFI_CONNECTED;
    public static final HatchDevicePairingPoint WIFI_NETWORK_SELECTED;
    public static final HatchDevicePairingPoint WIFI_SCAN_COMPLETED;
    public static final HatchDevicePairingPoint WIFI_SCAN_STARTED;
    public final String value;

    static {
        HatchDevicePairingPoint hatchDevicePairingPoint = new HatchDevicePairingPoint("BLE_PERMISSION_REQUESTED", 0, "ble_permission_requested");
        BLE_PERMISSION_REQUESTED = hatchDevicePairingPoint;
        HatchDevicePairingPoint hatchDevicePairingPoint2 = new HatchDevicePairingPoint("BLE_PERMISSION_GRANTED", 1, "ble_permission_granted");
        BLE_PERMISSION_GRANTED = hatchDevicePairingPoint2;
        HatchDevicePairingPoint hatchDevicePairingPoint3 = new HatchDevicePairingPoint("BLE_PERMISSION_DENIED", 2, "ble_permission_denied");
        BLE_PERMISSION_DENIED = hatchDevicePairingPoint3;
        HatchDevicePairingPoint hatchDevicePairingPoint4 = new HatchDevicePairingPoint("BLE_SCAN_STARTED", 3, "ble_scan_started");
        BLE_SCAN_STARTED = hatchDevicePairingPoint4;
        HatchDevicePairingPoint hatchDevicePairingPoint5 = new HatchDevicePairingPoint("DEVICE_DISCOVERED", 4, "device_discovered");
        DEVICE_DISCOVERED = hatchDevicePairingPoint5;
        HatchDevicePairingPoint hatchDevicePairingPoint6 = new HatchDevicePairingPoint("DEVICE_SELECTED", 5, "device_selected");
        DEVICE_SELECTED = hatchDevicePairingPoint6;
        HatchDevicePairingPoint hatchDevicePairingPoint7 = new HatchDevicePairingPoint("BLE_CONNECT_STARTED", 6, "ble_connect_started");
        BLE_CONNECT_STARTED = hatchDevicePairingPoint7;
        HatchDevicePairingPoint hatchDevicePairingPoint8 = new HatchDevicePairingPoint("BLE_CONNECTED", 7, "ble_connected");
        BLE_CONNECTED = hatchDevicePairingPoint8;
        HatchDevicePairingPoint hatchDevicePairingPoint9 = new HatchDevicePairingPoint("PAIRING_CONFIRMATION_REQUIRED", 8, "pairing_confirmation_required");
        PAIRING_CONFIRMATION_REQUIRED = hatchDevicePairingPoint9;
        HatchDevicePairingPoint hatchDevicePairingPoint10 = new HatchDevicePairingPoint("PAIRING_CONFIRMATION_COMPLETED", 9, "pairing_confirmation_completed");
        PAIRING_CONFIRMATION_COMPLETED = hatchDevicePairingPoint10;
        HatchDevicePairingPoint hatchDevicePairingPoint11 = new HatchDevicePairingPoint("LINK_INFO_SHOWN", 10, "link_info_shown");
        LINK_INFO_SHOWN = hatchDevicePairingPoint11;
        HatchDevicePairingPoint hatchDevicePairingPoint12 = new HatchDevicePairingPoint("LINK_INFO_CONTINUED", 11, "link_info_continued");
        LINK_INFO_CONTINUED = hatchDevicePairingPoint12;
        HatchDevicePairingPoint hatchDevicePairingPoint13 = new HatchDevicePairingPoint("WIFI_SCAN_STARTED", 12, "wifi_scan_started");
        WIFI_SCAN_STARTED = hatchDevicePairingPoint13;
        HatchDevicePairingPoint hatchDevicePairingPoint14 = new HatchDevicePairingPoint("WIFI_SCAN_COMPLETED", 13, "wifi_scan_completed");
        WIFI_SCAN_COMPLETED = hatchDevicePairingPoint14;
        HatchDevicePairingPoint hatchDevicePairingPoint15 = new HatchDevicePairingPoint("WIFI_NETWORK_SELECTED", 14, "wifi_network_selected");
        WIFI_NETWORK_SELECTED = hatchDevicePairingPoint15;
        HatchDevicePairingPoint hatchDevicePairingPoint16 = new HatchDevicePairingPoint("MANUAL_WIFI_ENTRY_SELECTED", 15, "manual_wifi_entry_selected");
        MANUAL_WIFI_ENTRY_SELECTED = hatchDevicePairingPoint16;
        HatchDevicePairingPoint hatchDevicePairingPoint17 = new HatchDevicePairingPoint("PROVISIONING_STARTED", 16, "provisioning_started");
        PROVISIONING_STARTED = hatchDevicePairingPoint17;
        HatchDevicePairingPoint hatchDevicePairingPoint18 = new HatchDevicePairingPoint("WIFI_CONNECTED", 17, "wifi_connected");
        WIFI_CONNECTED = hatchDevicePairingPoint18;
        HatchDevicePairingPoint hatchDevicePairingPoint19 = new HatchDevicePairingPoint("AUTH_STARTED", 18, "auth_started");
        AUTH_STARTED = hatchDevicePairingPoint19;
        HatchDevicePairingPoint hatchDevicePairingPoint20 = new HatchDevicePairingPoint("PAIRING_COMPLETED", 19, "pairing_completed");
        PAIRING_COMPLETED = hatchDevicePairingPoint20;
        HatchDevicePairingPoint hatchDevicePairingPoint21 = new HatchDevicePairingPoint("OTA_STARTED", 20, "ota_started");
        OTA_STARTED = hatchDevicePairingPoint21;
        HatchDevicePairingPoint hatchDevicePairingPoint22 = new HatchDevicePairingPoint("OTA_APPLIED", 21, "ota_applied");
        OTA_APPLIED = hatchDevicePairingPoint22;
        HatchDevicePairingPoint hatchDevicePairingPoint23 = new HatchDevicePairingPoint("OTA_SKIPPED", 22, "ota_skipped");
        OTA_SKIPPED = hatchDevicePairingPoint23;
        HatchDevicePairingPoint hatchDevicePairingPoint24 = new HatchDevicePairingPoint("OTA_RECONNECT_STARTED", 23, "ota_reconnect_started");
        OTA_RECONNECT_STARTED = hatchDevicePairingPoint24;
        HatchDevicePairingPoint hatchDevicePairingPoint25 = new HatchDevicePairingPoint("OTA_RECONNECTED", 24, "ota_reconnected");
        OTA_RECONNECTED = hatchDevicePairingPoint25;
        HatchDevicePairingPoint[] hatchDevicePairingPointArr = {hatchDevicePairingPoint, hatchDevicePairingPoint2, hatchDevicePairingPoint3, hatchDevicePairingPoint4, hatchDevicePairingPoint5, hatchDevicePairingPoint6, hatchDevicePairingPoint7, hatchDevicePairingPoint8, hatchDevicePairingPoint9, hatchDevicePairingPoint10, hatchDevicePairingPoint11, hatchDevicePairingPoint12, hatchDevicePairingPoint13, hatchDevicePairingPoint14, hatchDevicePairingPoint15, hatchDevicePairingPoint16, hatchDevicePairingPoint17, hatchDevicePairingPoint18, hatchDevicePairingPoint19, hatchDevicePairingPoint20, hatchDevicePairingPoint21, hatchDevicePairingPoint22, hatchDevicePairingPoint23, hatchDevicePairingPoint24, hatchDevicePairingPoint25};
        $VALUES = hatchDevicePairingPointArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingPointArr);
    }

    public static Ey9<HatchDevicePairingPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingPoint valueOf(String str) {
        return (HatchDevicePairingPoint) Enum.valueOf(HatchDevicePairingPoint.class, str);
    }

    public static HatchDevicePairingPoint[] values() {
        return (HatchDevicePairingPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchDevicePairingPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
