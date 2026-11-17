package com.facebook.aura.devices.pairing;

/* loaded from: classes.dex */
public interface HatchDevicePairingActions {
    void acknowledgeLinkInfo(Long l);

    void confirmLinkAppPairing(Long l);

    void connectToFoundDevice();

    void continueAfterDeviceConnection();

    void continueFromCommunityWarning(Long l);

    void dismissPairingDialog();

    void dismissPairingFlow();

    void enterManualWifiEntry();

    void goBackInPairing();

    void requestWifiRescan();

    void rescanDevices();

    void resolveLinkDeviceKeyReplacement(boolean z);

    void selectDevice(String str);

    void selectWifiNetwork(String str);

    void skipWifi();

    void startPairingBleScan();

    void startProvisioning();

    void updateWifiPassword(String str);

    void updateWifiSsid(String str);

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingActions$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$resolveLinkDeviceKeyReplacement(HatchDevicePairingActions hatchDevicePairingActions, boolean z) {
        }

        public static /* synthetic */ void access$resolveLinkDeviceKeyReplacement$jd(HatchDevicePairingActions hatchDevicePairingActions, boolean z) {
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static void resolveLinkDeviceKeyReplacement(HatchDevicePairingActions hatchDevicePairingActions, boolean z) {
        }
    }
}
