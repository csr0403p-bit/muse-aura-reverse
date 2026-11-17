package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class HatchDevicePairingStateExtKt {
    public static final boolean connectFailedWhileConnecting(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDeviceBleState hatchDeviceBleState) {
        boolean zA1a = AnonymousClass002.A1a(hatchDevicePairingUiState, hatchDeviceBleState);
        if (hatchDeviceBleState.isConnectionFailed() && isAwaitingInitialConnect(hatchDevicePairingUiState)) {
            return zA1a;
        }
        return false;
    }

    public static final boolean isAwaitingInitialConnect(HatchDevicePairingUiState hatchDevicePairingUiState) {
        C7384Etj.A0Y(hatchDevicePairingUiState, 0);
        return hatchDevicePairingUiState.getPairingStep() == HatchDevicePairingStep.CONNECTING_DEVICE && hatchDevicePairingUiState.isInitialConnectionInProgress();
    }

    public static final boolean isDeviceSelectionStep(HatchDevicePairingStep hatchDevicePairingStep) {
        C7384Etj.A0Y(hatchDevicePairingStep, 0);
        return hatchDevicePairingStep == HatchDevicePairingStep.BLE_SCAN || hatchDevicePairingStep == HatchDevicePairingStep.DEVICE_FOUND;
    }

    public static final boolean isProvisioningFailure(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus) {
        boolean zA1a = AnonymousClass002.A1a(hatchDevicePairingUiState, hatchDeviceProvisioningStatus);
        if (hatchDeviceProvisioningStatus.isFailure() && hatchDevicePairingUiState.getPairingStep() == HatchDevicePairingStep.PROVISIONING) {
            return zA1a;
        }
        return false;
    }
}
