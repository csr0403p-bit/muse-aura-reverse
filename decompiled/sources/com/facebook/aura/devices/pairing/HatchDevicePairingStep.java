package com.facebook.aura.devices.pairing;

import X.Ey9;
import X.F3w;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchDevicePairingStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingStep[] $VALUES;
    public static final HatchDevicePairingStep BLE_SCAN;
    public static final HatchDevicePairingStep CONNECTING_DEVICE;
    public static final HatchDevicePairingStep CREDENTIALS;
    public static final HatchDevicePairingStep DEVICE_FOUND;
    public static final HatchDevicePairingStep LINK_BUTTON_CONFIRMATION;
    public static final HatchDevicePairingStep LINK_INFO;
    public static final HatchDevicePairingStep NETWORK_SCAN;
    public static final HatchDevicePairingStep PROVISIONING;

    static {
        HatchDevicePairingStep hatchDevicePairingStep = new HatchDevicePairingStep("BLE_SCAN", 0);
        BLE_SCAN = hatchDevicePairingStep;
        HatchDevicePairingStep hatchDevicePairingStep2 = new HatchDevicePairingStep("DEVICE_FOUND", 1);
        DEVICE_FOUND = hatchDevicePairingStep2;
        HatchDevicePairingStep hatchDevicePairingStep3 = new HatchDevicePairingStep("CONNECTING_DEVICE", 2);
        CONNECTING_DEVICE = hatchDevicePairingStep3;
        HatchDevicePairingStep hatchDevicePairingStep4 = new HatchDevicePairingStep("LINK_BUTTON_CONFIRMATION", 3);
        LINK_BUTTON_CONFIRMATION = hatchDevicePairingStep4;
        HatchDevicePairingStep hatchDevicePairingStep5 = new HatchDevicePairingStep("LINK_INFO", 4);
        LINK_INFO = hatchDevicePairingStep5;
        HatchDevicePairingStep hatchDevicePairingStep6 = new HatchDevicePairingStep("NETWORK_SCAN", 5);
        NETWORK_SCAN = hatchDevicePairingStep6;
        HatchDevicePairingStep hatchDevicePairingStep7 = new HatchDevicePairingStep("CREDENTIALS", 6);
        CREDENTIALS = hatchDevicePairingStep7;
        HatchDevicePairingStep hatchDevicePairingStep8 = new HatchDevicePairingStep(AuraSubscriptionRepositoryJsonKt.PROVISIONING_STATUS, 7);
        PROVISIONING = hatchDevicePairingStep8;
        HatchDevicePairingStep[] hatchDevicePairingStepArr = {hatchDevicePairingStep, hatchDevicePairingStep2, hatchDevicePairingStep3, hatchDevicePairingStep4, hatchDevicePairingStep5, hatchDevicePairingStep6, hatchDevicePairingStep7, hatchDevicePairingStep8};
        $VALUES = hatchDevicePairingStepArr;
        $ENTRIES = new F3w(hatchDevicePairingStepArr);
    }

    public static Ey9<HatchDevicePairingStep> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingStep valueOf(String str) {
        return (HatchDevicePairingStep) Enum.valueOf(HatchDevicePairingStep.class, str);
    }

    public static HatchDevicePairingStep[] values() {
        return (HatchDevicePairingStep[]) $VALUES.clone();
    }

    public HatchDevicePairingStep(String str, int i) {
    }
}
