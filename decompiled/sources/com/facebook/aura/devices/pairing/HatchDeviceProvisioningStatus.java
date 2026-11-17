package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDeviceProvisioningStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDeviceProvisioningStatus[] $VALUES;
    public static final HatchDeviceProvisioningStatus AUTH_FAILED;
    public static final HatchDeviceProvisioningStatus AUTH_OK;
    public static final HatchDeviceProvisioningStatus AUTH_VALIDATING;
    public static final HatchDeviceProvisioningStatus CVM_UNSUPPORTED;
    public static final HatchDeviceProvisioningStatus DEVICE_BUSY;
    public static final HatchDeviceProvisioningStatus DEVICE_ERROR;
    public static final HatchDeviceProvisioningStatus IDLE;
    public static final HatchDeviceProvisioningStatus OTA_APPLIED;
    public static final HatchDeviceProvisioningStatus OTA_FAILED;
    public static final HatchDeviceProvisioningStatus OTA_SKIPPED;
    public static final HatchDeviceProvisioningStatus OTA_STARTING;
    public static final HatchDeviceProvisioningStatus OTA_WIFI_REQUIRED;
    public static final HatchDeviceProvisioningStatus UNPAIRED;
    public static final HatchDeviceProvisioningStatus UNPAIR_FAILED;
    public static final HatchDeviceProvisioningStatus UPDATE_CHECKING;
    public static final HatchDeviceProvisioningStatus UPDATE_CURRENT;
    public static final HatchDeviceProvisioningStatus UPDATE_FAILED;
    public static final HatchDeviceProvisioningStatus UPDATE_INSTALLED;
    public static final HatchDeviceProvisioningStatus VM_FAILED;
    public static final HatchDeviceProvisioningStatus VM_OK;
    public static final HatchDeviceProvisioningStatus VM_SWITCHING;
    public static final HatchDeviceProvisioningStatus WIFI_CONNECTED;
    public static final HatchDeviceProvisioningStatus WIFI_CONNECTING;
    public static final HatchDeviceProvisioningStatus WIFI_FAILED;

    static {
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus = new HatchDeviceProvisioningStatus("IDLE", 0);
        IDLE = hatchDeviceProvisioningStatus;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus2 = new HatchDeviceProvisioningStatus("WIFI_CONNECTING", 1);
        WIFI_CONNECTING = hatchDeviceProvisioningStatus2;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus3 = new HatchDeviceProvisioningStatus("WIFI_CONNECTED", 2);
        WIFI_CONNECTED = hatchDeviceProvisioningStatus3;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus4 = new HatchDeviceProvisioningStatus("WIFI_FAILED", 3);
        WIFI_FAILED = hatchDeviceProvisioningStatus4;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus5 = new HatchDeviceProvisioningStatus("AUTH_VALIDATING", 4);
        AUTH_VALIDATING = hatchDeviceProvisioningStatus5;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus6 = new HatchDeviceProvisioningStatus("AUTH_OK", 5);
        AUTH_OK = hatchDeviceProvisioningStatus6;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus7 = new HatchDeviceProvisioningStatus("AUTH_FAILED", 6);
        AUTH_FAILED = hatchDeviceProvisioningStatus7;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus8 = new HatchDeviceProvisioningStatus("VM_SWITCHING", 7);
        VM_SWITCHING = hatchDeviceProvisioningStatus8;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus9 = new HatchDeviceProvisioningStatus("VM_OK", 8);
        VM_OK = hatchDeviceProvisioningStatus9;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus10 = new HatchDeviceProvisioningStatus("VM_FAILED", 9);
        VM_FAILED = hatchDeviceProvisioningStatus10;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus11 = new HatchDeviceProvisioningStatus("UNPAIRED", 10);
        UNPAIRED = hatchDeviceProvisioningStatus11;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus12 = new HatchDeviceProvisioningStatus("UNPAIR_FAILED", 11);
        UNPAIR_FAILED = hatchDeviceProvisioningStatus12;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus13 = new HatchDeviceProvisioningStatus("UPDATE_CHECKING", 12);
        UPDATE_CHECKING = hatchDeviceProvisioningStatus13;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus14 = new HatchDeviceProvisioningStatus("UPDATE_CURRENT", 13);
        UPDATE_CURRENT = hatchDeviceProvisioningStatus14;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus15 = new HatchDeviceProvisioningStatus("UPDATE_INSTALLED", 14);
        UPDATE_INSTALLED = hatchDeviceProvisioningStatus15;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus16 = new HatchDeviceProvisioningStatus("UPDATE_FAILED", 15);
        UPDATE_FAILED = hatchDeviceProvisioningStatus16;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus17 = new HatchDeviceProvisioningStatus("DEVICE_ERROR", 16);
        DEVICE_ERROR = hatchDeviceProvisioningStatus17;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus18 = new HatchDeviceProvisioningStatus("CVM_UNSUPPORTED", 17);
        CVM_UNSUPPORTED = hatchDeviceProvisioningStatus18;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus19 = new HatchDeviceProvisioningStatus("DEVICE_BUSY", 18);
        DEVICE_BUSY = hatchDeviceProvisioningStatus19;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus20 = new HatchDeviceProvisioningStatus("OTA_STARTING", 19);
        OTA_STARTING = hatchDeviceProvisioningStatus20;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus21 = new HatchDeviceProvisioningStatus("OTA_APPLIED", 20);
        OTA_APPLIED = hatchDeviceProvisioningStatus21;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus22 = new HatchDeviceProvisioningStatus("OTA_SKIPPED", 21);
        OTA_SKIPPED = hatchDeviceProvisioningStatus22;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus23 = new HatchDeviceProvisioningStatus("OTA_FAILED", 22);
        OTA_FAILED = hatchDeviceProvisioningStatus23;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus24 = new HatchDeviceProvisioningStatus("OTA_WIFI_REQUIRED", 23);
        OTA_WIFI_REQUIRED = hatchDeviceProvisioningStatus24;
        HatchDeviceProvisioningStatus[] hatchDeviceProvisioningStatusArr = {hatchDeviceProvisioningStatus, hatchDeviceProvisioningStatus2, hatchDeviceProvisioningStatus3, hatchDeviceProvisioningStatus4, hatchDeviceProvisioningStatus5, hatchDeviceProvisioningStatus6, hatchDeviceProvisioningStatus7, hatchDeviceProvisioningStatus8, hatchDeviceProvisioningStatus9, hatchDeviceProvisioningStatus10, hatchDeviceProvisioningStatus11, hatchDeviceProvisioningStatus12, hatchDeviceProvisioningStatus13, hatchDeviceProvisioningStatus14, hatchDeviceProvisioningStatus15, hatchDeviceProvisioningStatus16, hatchDeviceProvisioningStatus17, hatchDeviceProvisioningStatus18, hatchDeviceProvisioningStatus19, hatchDeviceProvisioningStatus20, hatchDeviceProvisioningStatus21, hatchDeviceProvisioningStatus22, hatchDeviceProvisioningStatus23, hatchDeviceProvisioningStatus24};
        $VALUES = hatchDeviceProvisioningStatusArr;
        $ENTRIES = C3cG.A0w(hatchDeviceProvisioningStatusArr);
    }

    public static Ey9<HatchDeviceProvisioningStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchDeviceProvisioningStatus valueOf(String str) {
        return (HatchDeviceProvisioningStatus) Enum.valueOf(HatchDeviceProvisioningStatus.class, str);
    }

    public static HatchDeviceProvisioningStatus[] values() {
        return (HatchDeviceProvisioningStatus[]) $VALUES.clone();
    }

    public final boolean getJoinedWifi() {
        return this == WIFI_CONNECTED || this == AUTH_VALIDATING || isSuccess();
    }

    public final boolean isOtaInProgress() {
        return this == OTA_STARTING || this == OTA_APPLIED;
    }

    public final boolean isSuccess() {
        return this == AUTH_OK || this == VM_OK || this == UNPAIRED || this == UPDATE_INSTALLED;
    }

    public final boolean isTerminal() {
        return this == AUTH_OK || this == AUTH_FAILED || this == WIFI_FAILED || this == VM_OK || this == VM_FAILED || this == UNPAIRED || this == UNPAIR_FAILED || this == UPDATE_CURRENT || this == UPDATE_INSTALLED || this == UPDATE_FAILED || this == DEVICE_ERROR || this == CVM_UNSUPPORTED || this == DEVICE_BUSY || this == OTA_FAILED || this == OTA_WIFI_REQUIRED;
    }

    public final boolean isFailure() {
        return isTerminal() && !isSuccess();
    }

    public HatchDeviceProvisioningStatus(String str, int i) {
    }
}
