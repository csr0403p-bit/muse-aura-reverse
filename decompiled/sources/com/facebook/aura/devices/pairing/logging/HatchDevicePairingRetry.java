package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingRetry {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingRetry[] $VALUES;
    public static final HatchDevicePairingRetry BLE_SCAN;
    public static final HatchDevicePairingRetry WIFI_SCAN;
    public final String annotation;

    static {
        HatchDevicePairingRetry hatchDevicePairingRetry = new HatchDevicePairingRetry("BLE_SCAN", 0, "ble_scan_retry_count");
        BLE_SCAN = hatchDevicePairingRetry;
        HatchDevicePairingRetry hatchDevicePairingRetry2 = new HatchDevicePairingRetry("WIFI_SCAN", 1, "wifi_scan_retry_count");
        WIFI_SCAN = hatchDevicePairingRetry2;
        HatchDevicePairingRetry[] hatchDevicePairingRetryArr = {hatchDevicePairingRetry, hatchDevicePairingRetry2};
        $VALUES = hatchDevicePairingRetryArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingRetryArr);
    }

    public static Ey9<HatchDevicePairingRetry> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingRetry valueOf(String str) {
        return (HatchDevicePairingRetry) Enum.valueOf(HatchDevicePairingRetry.class, str);
    }

    public static HatchDevicePairingRetry[] values() {
        return (HatchDevicePairingRetry[]) $VALUES.clone();
    }

    public final String getAnnotation() {
        return this.annotation;
    }

    public HatchDevicePairingRetry(String str, int i, String str2) {
        this.annotation = str2;
    }
}
