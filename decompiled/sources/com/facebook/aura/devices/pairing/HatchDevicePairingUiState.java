package com.facebook.aura.devices.pairing;

import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import java.util.List;

/* loaded from: classes.dex */
public interface HatchDevicePairingUiState {
    boolean getBlePermissionsGranted();

    List<HatchDiscoveredDevice> getDiscoveredDevices();

    LinkAppConfirmationState getLinkAppConfirmation();

    Long getLinkConfirmationRequestId();

    LinkDeviceKeyRecord getLinkDeviceKeyReplacement();

    LinkDeviceVerification getLinkDeviceVerification();

    LinkWifiRequirement getLinkWifiRequirement();

    List<HatchDeviceWiFiNetwork> getOtherWifiNetworks();

    HatchDeviceBleState getPairingBleState();

    HatchDevicePairingDialog getPairingDialog();

    HatchDeviceProvisioningStatus getPairingProvisioningStatus();

    HatchDevicePairingStep getPairingStep();

    String getPairingTargetName();

    boolean getProvisioningWifiJoined();

    List<HatchDeviceWiFiNetwork> getSavedWifiNetworks();

    String getSelectedWifiSsid();

    boolean getShowPairingFlow();

    boolean getShowsDeveloperModeHint();

    List<HatchDeviceWiFiNetwork> getWifiNetworks();

    String getWifiPassword();

    boolean getWifiScanFailed();

    boolean isDeveloperModeEnabled();

    boolean isInitialConnectionInProgress();

    boolean isManualWifiEntry();

    boolean isTokenOnlyProvisioning();

    boolean isWaitingForWifiScan();

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingUiState$-CC, reason: invalid class name */
    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class CC {
        public static LinkAppConfirmationState $default$getLinkAppConfirmation(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static Long $default$getLinkConfirmationRequestId(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static LinkDeviceKeyRecord $default$getLinkDeviceKeyReplacement(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static LinkDeviceVerification $default$getLinkDeviceVerification(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static boolean $default$getShowsDeveloperModeHint(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        public static boolean $default$isDeveloperModeEnabled(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        public static boolean $default$isTokenOnlyProvisioning(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        public static /* synthetic */ LinkAppConfirmationState access$getLinkAppConfirmation$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static /* synthetic */ Long access$getLinkConfirmationRequestId$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static /* synthetic */ LinkDeviceKeyRecord access$getLinkDeviceKeyReplacement$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static /* synthetic */ LinkDeviceVerification access$getLinkDeviceVerification$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        public static /* synthetic */ boolean access$getShowsDeveloperModeHint$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        public static /* synthetic */ boolean access$isDeveloperModeEnabled$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        public static /* synthetic */ boolean access$isTokenOnlyProvisioning$jd(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static LinkAppConfirmationState getLinkAppConfirmation(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        @Deprecated
        public static Long getLinkConfirmationRequestId(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        @Deprecated
        public static LinkDeviceKeyRecord getLinkDeviceKeyReplacement(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        @Deprecated
        public static LinkDeviceVerification getLinkDeviceVerification(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return null;
        }

        @Deprecated
        public static boolean getShowsDeveloperModeHint(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        @Deprecated
        public static boolean isDeveloperModeEnabled(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        @Deprecated
        public static boolean isTokenOnlyProvisioning(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return false;
        }

        @Deprecated
        public static LinkWifiRequirement getLinkWifiRequirement(HatchDevicePairingUiState hatchDevicePairingUiState) {
            return LinkWifiRequirement.REQUIRED;
        }
    }
}
