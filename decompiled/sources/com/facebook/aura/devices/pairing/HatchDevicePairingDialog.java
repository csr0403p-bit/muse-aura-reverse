package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingDialog {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingDialog[] $VALUES;
    public static final HatchDevicePairingDialog BUTTON_PRESS_TIMED_OUT;
    public static final HatchDevicePairingDialog CONNECTION_FAILED;
    public static final HatchDevicePairingDialog CVM_UNSUPPORTED;
    public static final HatchDevicePairingDialog DEVICE_BUSY;
    public static final HatchDevicePairingDialog DEVICE_ID_IN_USE;
    public static final HatchDevicePairingDialog FIRMWARE_UPDATE_REQUIRED;
    public static final HatchDevicePairingDialog GADGET_FIRMWARE_UPDATE_REQUIRED;
    public static final HatchDevicePairingDialog PROVISIONING_FAILED;
    public static final HatchDevicePairingDialog SDK_TOKEN_DEVICE_LIMIT_REACHED;
    public static final HatchDevicePairingDialog SDK_TOKEN_INVALID;
    public static final HatchDevicePairingDialog SDK_TOKEN_MISSING;
    public static final HatchDevicePairingDialog SETUP_HANDOFF_FAILED;

    static {
        HatchDevicePairingDialog hatchDevicePairingDialog = new HatchDevicePairingDialog("CONNECTION_FAILED", 0);
        CONNECTION_FAILED = hatchDevicePairingDialog;
        HatchDevicePairingDialog hatchDevicePairingDialog2 = new HatchDevicePairingDialog("PROVISIONING_FAILED", 1);
        PROVISIONING_FAILED = hatchDevicePairingDialog2;
        HatchDevicePairingDialog hatchDevicePairingDialog3 = new HatchDevicePairingDialog("SETUP_HANDOFF_FAILED", 2);
        SETUP_HANDOFF_FAILED = hatchDevicePairingDialog3;
        HatchDevicePairingDialog hatchDevicePairingDialog4 = new HatchDevicePairingDialog("SDK_TOKEN_MISSING", 3);
        SDK_TOKEN_MISSING = hatchDevicePairingDialog4;
        HatchDevicePairingDialog hatchDevicePairingDialog5 = new HatchDevicePairingDialog("SDK_TOKEN_INVALID", 4);
        SDK_TOKEN_INVALID = hatchDevicePairingDialog5;
        HatchDevicePairingDialog hatchDevicePairingDialog6 = new HatchDevicePairingDialog("SDK_TOKEN_DEVICE_LIMIT_REACHED", 5);
        SDK_TOKEN_DEVICE_LIMIT_REACHED = hatchDevicePairingDialog6;
        HatchDevicePairingDialog hatchDevicePairingDialog7 = new HatchDevicePairingDialog("GADGET_FIRMWARE_UPDATE_REQUIRED", 6);
        GADGET_FIRMWARE_UPDATE_REQUIRED = hatchDevicePairingDialog7;
        HatchDevicePairingDialog hatchDevicePairingDialog8 = new HatchDevicePairingDialog("BUTTON_PRESS_TIMED_OUT", 7);
        BUTTON_PRESS_TIMED_OUT = hatchDevicePairingDialog8;
        HatchDevicePairingDialog hatchDevicePairingDialog9 = new HatchDevicePairingDialog("FIRMWARE_UPDATE_REQUIRED", 8);
        FIRMWARE_UPDATE_REQUIRED = hatchDevicePairingDialog9;
        HatchDevicePairingDialog hatchDevicePairingDialog10 = new HatchDevicePairingDialog("CVM_UNSUPPORTED", 9);
        CVM_UNSUPPORTED = hatchDevicePairingDialog10;
        HatchDevicePairingDialog hatchDevicePairingDialog11 = new HatchDevicePairingDialog("DEVICE_ID_IN_USE", 10);
        DEVICE_ID_IN_USE = hatchDevicePairingDialog11;
        HatchDevicePairingDialog hatchDevicePairingDialog12 = new HatchDevicePairingDialog("DEVICE_BUSY", 11);
        DEVICE_BUSY = hatchDevicePairingDialog12;
        HatchDevicePairingDialog[] hatchDevicePairingDialogArr = {hatchDevicePairingDialog, hatchDevicePairingDialog2, hatchDevicePairingDialog3, hatchDevicePairingDialog4, hatchDevicePairingDialog5, hatchDevicePairingDialog6, hatchDevicePairingDialog7, hatchDevicePairingDialog8, hatchDevicePairingDialog9, hatchDevicePairingDialog10, hatchDevicePairingDialog11, hatchDevicePairingDialog12};
        $VALUES = hatchDevicePairingDialogArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingDialogArr);
    }

    public static Ey9<HatchDevicePairingDialog> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingDialog valueOf(String str) {
        return (HatchDevicePairingDialog) Enum.valueOf(HatchDevicePairingDialog.class, str);
    }

    public static HatchDevicePairingDialog[] values() {
        return (HatchDevicePairingDialog[]) $VALUES.clone();
    }

    public HatchDevicePairingDialog(String str, int i) {
    }
}
