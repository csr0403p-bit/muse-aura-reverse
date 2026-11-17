package com.facebook.aura.devices.pairing;

import X.C7384Etj;
import X.C8j3;
import java.util.List;

/* loaded from: classes4.dex */
public interface HatchDeviceBleListener {

    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleListener$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$onBleScanError(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static void $default$onBluetoothUnavailable(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static boolean $default$onLinkDisconnected(HatchDeviceBleListener hatchDeviceBleListener) {
            return false;
        }

        public static void $default$onLinkPairingConfirmationRequired(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static void $default$onLinkPairingConfirmed(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static void $default$onWiFiScanError(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static void $default$onWiFiScanStarted(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static /* synthetic */ void access$onBleScanError$jd(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static /* synthetic */ void access$onBluetoothUnavailable$jd(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static /* synthetic */ boolean access$onLinkDisconnected$jd(HatchDeviceBleListener hatchDeviceBleListener) {
            return false;
        }

        public static /* synthetic */ void access$onLinkPairingConfirmationRequired$jd(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static /* synthetic */ void access$onLinkPairingConfirmed$jd(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static /* synthetic */ void access$onWiFiScanError$jd(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static /* synthetic */ void access$onWiFiScanStarted$jd(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        public static void $default$onDeviceInfo(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static void $default$onDeviceReportedStatus(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static void $default$onDevicesDiscovered(HatchDeviceBleListener hatchDeviceBleListener, List list) {
        }

        public static void $default$onLinkPairingConfirmationTimedOut(HatchDeviceBleListener hatchDeviceBleListener, boolean z) {
        }

        public static void $default$onLinkPairingUnavailable(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static void $default$onLinkSetupServiceMissing(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static /* synthetic */ void access$onDeviceInfo$jd(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static /* synthetic */ void access$onDeviceReportedStatus$jd(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static /* synthetic */ void access$onDevicesDiscovered$jd(HatchDeviceBleListener hatchDeviceBleListener, List list) {
        }

        public static /* synthetic */ void access$onLinkPairingConfirmationTimedOut$jd(HatchDeviceBleListener hatchDeviceBleListener, boolean z) {
        }

        public static /* synthetic */ void access$onLinkPairingUnavailable$jd(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static /* synthetic */ void access$onLinkSetupServiceMissing$jd(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }

        public static /* synthetic */ void onStateChanged$default(HatchDeviceBleListener hatchDeviceBleListener, HatchDeviceBleState hatchDeviceBleState, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: onStateChanged");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            hatchDeviceBleListener.onStateChanged(hatchDeviceBleState, str, num);
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static void onBleScanError(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        @Deprecated
        public static void onBluetoothUnavailable(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        @Deprecated
        public static void onDeviceInfo(HatchDeviceBleListener hatchDeviceBleListener, String str) {
            C7384Etj.A0Y(str, 1);
        }

        @Deprecated
        public static void onDeviceReportedStatus(HatchDeviceBleListener hatchDeviceBleListener, String str) {
            C7384Etj.A0Y(str, 1);
        }

        @Deprecated
        public static void onDevicesDiscovered(HatchDeviceBleListener hatchDeviceBleListener, List<HatchDiscoveredDevice> list) {
            C7384Etj.A0Y(list, 1);
        }

        @Deprecated
        public static boolean onLinkDisconnected(HatchDeviceBleListener hatchDeviceBleListener) {
            return false;
        }

        @Deprecated
        public static void onLinkPairingConfirmationRequired(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        @Deprecated
        public static void onLinkPairingConfirmed(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        @Deprecated
        public static void onLinkSetupServiceMissing(HatchDeviceBleListener hatchDeviceBleListener, String str) {
            C7384Etj.A0Y(str, 1);
        }

        @Deprecated
        public static void onWiFiScanError(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        @Deprecated
        public static void onWiFiScanStarted(HatchDeviceBleListener hatchDeviceBleListener) {
        }

        @Deprecated
        public static void onLinkPairingConfirmationTimedOut(HatchDeviceBleListener hatchDeviceBleListener, boolean z) {
        }

        @Deprecated
        public static void onLinkPairingUnavailable(HatchDeviceBleListener hatchDeviceBleListener, String str) {
        }
    }

    void onBleScanError();

    void onBluetoothUnavailable();

    void onDebugLog(String str);

    void onDeviceInfo(String str);

    void onDeviceReportedStatus(String str);

    void onDevicesDiscovered(List<HatchDiscoveredDevice> list);

    boolean onLinkDisconnected();

    void onLinkPairingConfirmationRequired();

    void onLinkPairingConfirmationTimedOut(boolean z);

    void onLinkPairingConfirmed();

    void onLinkPairingUnavailable(String str);

    void onLinkSetupServiceMissing(String str);

    void onProvisioningStatusChanged(HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus);

    void onStateChanged(HatchDeviceBleState hatchDeviceBleState, String str, Integer num);

    void onWiFiScanError();

    void onWiFiScanResult(List<HatchDeviceWiFiNetwork> list);

    void onWiFiScanStarted();
}
