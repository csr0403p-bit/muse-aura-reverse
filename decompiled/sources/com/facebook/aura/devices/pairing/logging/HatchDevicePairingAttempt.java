package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingAttempt {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingAttempt[] $VALUES;
    public static final HatchDevicePairingAttempt BLE_CONNECTION;
    public static final HatchDevicePairingAttempt BLE_SCAN;
    public static final HatchDevicePairingAttempt OTA_RECONNECT;
    public static final HatchDevicePairingAttempt PROVISIONING;
    public static final HatchDevicePairingAttempt WIFI_SCAN;
    public final String annotation;
    public final HatchDevicePairingPoint point;

    static {
        HatchDevicePairingAttempt hatchDevicePairingAttempt = new HatchDevicePairingAttempt("BLE_SCAN", 0, "ble_scan_attempt_count", HatchDevicePairingPoint.BLE_SCAN_STARTED);
        BLE_SCAN = hatchDevicePairingAttempt;
        HatchDevicePairingAttempt hatchDevicePairingAttempt2 = new HatchDevicePairingAttempt("BLE_CONNECTION", 1, "ble_connection_attempt_count", HatchDevicePairingPoint.BLE_CONNECT_STARTED);
        BLE_CONNECTION = hatchDevicePairingAttempt2;
        HatchDevicePairingAttempt hatchDevicePairingAttempt3 = new HatchDevicePairingAttempt("WIFI_SCAN", 2, "wifi_scan_attempt_count", HatchDevicePairingPoint.WIFI_SCAN_STARTED);
        WIFI_SCAN = hatchDevicePairingAttempt3;
        HatchDevicePairingAttempt hatchDevicePairingAttempt4 = new HatchDevicePairingAttempt(AuraSubscriptionRepositoryJsonKt.PROVISIONING_STATUS, 3, "provisioning_attempt_count", HatchDevicePairingPoint.PROVISIONING_STARTED);
        PROVISIONING = hatchDevicePairingAttempt4;
        HatchDevicePairingAttempt hatchDevicePairingAttempt5 = new HatchDevicePairingAttempt("OTA_RECONNECT", 4, "ota_reconnect_attempt_count", HatchDevicePairingPoint.OTA_RECONNECT_STARTED);
        OTA_RECONNECT = hatchDevicePairingAttempt5;
        HatchDevicePairingAttempt[] hatchDevicePairingAttemptArr = {hatchDevicePairingAttempt, hatchDevicePairingAttempt2, hatchDevicePairingAttempt3, hatchDevicePairingAttempt4, hatchDevicePairingAttempt5};
        $VALUES = hatchDevicePairingAttemptArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingAttemptArr);
    }

    public static Ey9<HatchDevicePairingAttempt> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingAttempt valueOf(String str) {
        return (HatchDevicePairingAttempt) Enum.valueOf(HatchDevicePairingAttempt.class, str);
    }

    public static HatchDevicePairingAttempt[] values() {
        return (HatchDevicePairingAttempt[]) $VALUES.clone();
    }

    public final String getAnnotation() {
        return this.annotation;
    }

    public final HatchDevicePairingPoint getPoint() {
        return this.point;
    }

    public HatchDevicePairingAttempt(String str, int i, String str2, HatchDevicePairingPoint hatchDevicePairingPoint) {
        this.annotation = str2;
        this.point = hatchDevicePairingPoint;
    }
}
