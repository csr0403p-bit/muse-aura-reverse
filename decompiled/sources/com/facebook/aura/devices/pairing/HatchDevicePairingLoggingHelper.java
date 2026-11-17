package com.facebook.aura.devices.pairing;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.devices.pairing.HatchDevicePairingEffect;
import com.facebook.aura.devices.pairing.HatchDevicePairingEvent;
import com.facebook.aura.devices.pairing.HatchLinkOtaRepairState;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingRetry;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchDevicePairingLoggingHelper {
    public static final int $stable = 0;
    public static final HatchDevicePairingLoggingHelper INSTANCE = new HatchDevicePairingLoggingHelper();

    public final boolean isAcceptedDeviceSelection(HatchDevicePairingEvent hatchDevicePairingEvent, HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingTransition hatchDevicePairingTransition) {
        boolean zA1Z = AnonymousClass005.A1Z(hatchDevicePairingEvent, hatchDevicePairingMachineState, hatchDevicePairingTransition);
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (hatchDevicePairingViewState.getShowPairingFlow() && !hatchDevicePairingViewState.isInitialConnectionInProgress()) {
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.SelectDevice) {
                List<HatchDevicePairingEffect> list = hatchDevicePairingTransition.effects;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<HatchDevicePairingEffect> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof HatchDevicePairingEffect.ConnectToDevice) {
                            return zA1Z;
                        }
                    }
                }
            } else if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.ConnectToFoundDevice.INSTANCE) && hatchDevicePairingTransition.state.ui.isInitialConnectionInProgress()) {
                List<HatchDevicePairingEffect> list2 = hatchDevicePairingTransition.effects;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                for (HatchDevicePairingEffect hatchDevicePairingEffect : list2) {
                    if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.ConnectToDiscovered.INSTANCE)) {
                        return zA1Z;
                    }
                    if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.StartBleScan.INSTANCE)) {
                        return zA1Z;
                    }
                }
            }
        }
        return false;
    }

    public final void logPairingAction(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HatchDevicePairingEvent hatchDevicePairingEvent, HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingTransition hatchDevicePairingTransition) {
        String pairingTargetName;
        HatchDevicePairingPoint hatchDevicePairingPoint;
        HatchDiscoveredDevice next;
        HatchDevicePairingRetry hatchDevicePairingRetry;
        AnonymousClass005.A11(hatchDevicePairingEvent, hatchDevicePairingMachineState, hatchDevicePairingTransition, 1);
        if (hatchDevicePairingUserFlowLogger != null) {
            HatchDevicePairingMachineState hatchDevicePairingMachineState2 = hatchDevicePairingTransition.state;
            List<HatchDevicePairingEffect> list = hatchDevicePairingTransition.effects;
            boolean z = hatchDevicePairingEvent instanceof HatchDevicePairingEvent.SelectDevice;
            if (z || hatchDevicePairingEvent.equals(HatchDevicePairingEvent.ConnectToFoundDevice.INSTANCE)) {
                if (isAcceptedDeviceSelection(hatchDevicePairingEvent, hatchDevicePairingMachineState, hatchDevicePairingTransition)) {
                    if (z) {
                        Iterator<HatchDiscoveredDevice> it = hatchDevicePairingMachineState.ui.getDiscoveredDevices().iterator();
                        while (true) {
                            pairingTargetName = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (C7384Etj.areEqual(next.address, ((HatchDevicePairingEvent.SelectDevice) hatchDevicePairingEvent).address)) {
                                    break;
                                }
                            }
                        }
                        HatchDiscoveredDevice hatchDiscoveredDevice = next;
                        if (hatchDiscoveredDevice != null) {
                            pairingTargetName = hatchDiscoveredDevice.name;
                        }
                    } else {
                        pairingTargetName = hatchDevicePairingMachineState2.ui.getPairingTargetName();
                    }
                    hatchDevicePairingUserFlowLogger.updateDeviceDisplayName(pairingTargetName);
                    hatchDevicePairingPoint = HatchDevicePairingPoint.DEVICE_SELECTED;
                    hatchDevicePairingUserFlowLogger.markPoint(hatchDevicePairingPoint);
                }
            } else if (!hatchDevicePairingEvent.equals(HatchDevicePairingEvent.ContinueAfterDeviceConnection.INSTANCE) && !hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkInfoAcknowledged.INSTANCE)) {
                if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.SelectWifiNetwork) {
                    hatchDevicePairingPoint = HatchDevicePairingPoint.WIFI_NETWORK_SELECTED;
                } else if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.EnterManualWifiEntry.INSTANCE)) {
                    hatchDevicePairingPoint = HatchDevicePairingPoint.MANUAL_WIFI_ENTRY_SELECTED;
                } else if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.StartBleScan.INSTANCE) || hatchDevicePairingEvent.equals(HatchDevicePairingEvent.RescanDevices.INSTANCE)) {
                    if (list.contains(HatchDevicePairingEffect.StartBleScan.INSTANCE)) {
                        hatchDevicePairingRetry = HatchDevicePairingRetry.BLE_SCAN;
                        hatchDevicePairingUserFlowLogger.recordRetry(hatchDevicePairingRetry);
                    }
                } else if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.RequestWifiRescan.INSTANCE) && list.contains(HatchDevicePairingEffect.RequestLinkWifiScan.INSTANCE)) {
                    hatchDevicePairingRetry = HatchDevicePairingRetry.WIFI_SCAN;
                    hatchDevicePairingUserFlowLogger.recordRetry(hatchDevicePairingRetry);
                }
                hatchDevicePairingUserFlowLogger.markPoint(hatchDevicePairingPoint);
            } else if (hatchDevicePairingMachineState.ui.getPairingStep() == HatchDevicePairingStep.LINK_INFO) {
                hatchDevicePairingPoint = HatchDevicePairingPoint.LINK_INFO_CONTINUED;
                hatchDevicePairingUserFlowLogger.markPoint(hatchDevicePairingPoint);
            }
            if ((hatchDevicePairingEvent instanceof HatchDevicePairingEvent.BleStateChanged) || hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkDisconnected.INSTANCE) || hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkOtaRoundTwoExpired.INSTANCE)) {
                HatchLinkOtaRepairState hatchLinkOtaRepairState = hatchDevicePairingMachineState.linkOtaRepairState;
                HatchLinkOtaRepairState.Idle idle = HatchLinkOtaRepairState.Idle.INSTANCE;
                if (!C7384Etj.areEqual(hatchLinkOtaRepairState, idle) && C7384Etj.areEqual(hatchDevicePairingMachineState2.linkOtaRepairState, idle) && hatchDevicePairingMachineState2.ui.getPairingProvisioningStatus() == HatchDeviceProvisioningStatus.AUTH_FAILED) {
                    hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.OTA_RECONNECT_FAILED);
                }
            }
        }
    }

    public final void logProvisioningStatus(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus) {
        HatchDevicePairingPoint hatchDevicePairingPoint;
        HatchDevicePairingFailureReason hatchDevicePairingFailureReason;
        C7384Etj.A0Y(hatchDeviceProvisioningStatus, 1);
        if (hatchDevicePairingUserFlowLogger != null) {
            int iOrdinal = hatchDeviceProvisioningStatus.ordinal();
            switch (iOrdinal) {
                case 2:
                    hatchDevicePairingPoint = HatchDevicePairingPoint.WIFI_CONNECTED;
                    break;
                case 4:
                    hatchDevicePairingPoint = HatchDevicePairingPoint.AUTH_STARTED;
                    break;
                case 5:
                    hatchDevicePairingPoint = HatchDevicePairingPoint.PAIRING_COMPLETED;
                    break;
                case 19:
                    hatchDevicePairingPoint = HatchDevicePairingPoint.OTA_STARTED;
                    break;
                case 20:
                    hatchDevicePairingPoint = HatchDevicePairingPoint.OTA_APPLIED;
                    break;
                case 21:
                    hatchDevicePairingPoint = HatchDevicePairingPoint.OTA_SKIPPED;
                    break;
                default:
                    switch (iOrdinal) {
                        case 3:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.WIFI_PROVISION_FAILED;
                            break;
                        case 6:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.AUTH_FAILED;
                            break;
                        case 9:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.VM_FAILED;
                            break;
                        case 16:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.DEVICE_ERROR;
                            break;
                        case 17:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.CVM_UNSUPPORTED;
                            break;
                        case 18:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.DEVICE_BUSY;
                            break;
                        case 22:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.OTA_FAILED;
                            break;
                        case 23:
                            hatchDevicePairingFailureReason = HatchDevicePairingFailureReason.OTA_WIFI_REQUIRED;
                            break;
                        default:
                            return;
                    }
                    hatchDevicePairingUserFlowLogger.recordError(hatchDevicePairingFailureReason);
                    return;
            }
            hatchDevicePairingUserFlowLogger.markPoint(hatchDevicePairingPoint);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchDeviceBleState.values().length];
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.SCANNING, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.FOUND, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.CONNECTING, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.READY, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.NOT_FOUND, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.CONNECTION_FAILED, iArr, 6);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchDeviceProvisioningStatus.values().length];
            try {
                AnonymousClass005.A0v(HatchDeviceProvisioningStatus.WIFI_CONNECTED, iArr2, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceProvisioningStatus.AUTH_VALIDATING, iArr2, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceProvisioningStatus.AUTH_OK, iArr2, 3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceProvisioningStatus.OTA_STARTING, iArr2, 4);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceProvisioningStatus.OTA_APPLIED, iArr2, 5);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceProvisioningStatus.OTA_SKIPPED, iArr2, 6);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass006.A1G(HatchDeviceProvisioningStatus.WIFI_FAILED, iArr2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass006.A1H(HatchDeviceProvisioningStatus.AUTH_FAILED, iArr2);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass006.A1I(HatchDeviceProvisioningStatus.VM_FAILED, iArr2);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass006.A1J(HatchDeviceProvisioningStatus.OTA_FAILED, iArr2);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass006.A1K(HatchDeviceProvisioningStatus.OTA_WIFI_REQUIRED, iArr2);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass006.A1L(HatchDeviceProvisioningStatus.DEVICE_ERROR, iArr2);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                C60Q.A1C(HatchDeviceProvisioningStatus.CVM_UNSUPPORTED, iArr2);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                C60Q.A1D(HatchDeviceProvisioningStatus.DEVICE_BUSY, iArr2);
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logBleState(com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r2, com.facebook.aura.devices.pairing.HatchDeviceBleState r3, com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r4) {
        /*
            r1 = this;
            X.AnonymousClass003.A0x(r3, r4)
            if (r2 == 0) goto L10
            com.facebook.aura.devices.pairing.HatchLinkOtaRepairState r0 = r4.linkOtaRepairState
            boolean r1 = r0 instanceof com.facebook.aura.devices.pairing.HatchLinkOtaRepairState.Rescanning
            int r0 = r3.ordinal()
            switch(r0) {
                case 1: goto L11;
                case 2: goto L35;
                case 3: goto L3b;
                case 4: goto L10;
                case 5: goto L1b;
                case 6: goto L2a;
                case 7: goto L25;
                default: goto L10;
            }
        L10:
            return
        L11:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt.BLE_SCAN
            r2.recordAttempt(r0)
            if (r1 == 0) goto L10
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt.OTA_RECONNECT
            goto L3d
        L1b:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint.BLE_CONNECTED
            r2.markPoint(r0)
            if (r1 == 0) goto L10
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint.OTA_RECONNECTED
            goto L37
        L25:
            if (r1 != 0) goto L32
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.DEVICE_NOT_FOUND
            goto L2e
        L2a:
            if (r1 != 0) goto L32
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.BLE_CONNECTION_FAILED
        L2e:
            r2.recordError(r0)
            return
        L32:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.OTA_RECONNECT_FAILED
            goto L2e
        L35:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint.DEVICE_DISCOVERED
        L37:
            r2.markPoint(r0)
            return
        L3b:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt.BLE_CONNECTION
        L3d:
            r2.recordAttempt(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingLoggingHelper.logBleState(com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger, com.facebook.aura.devices.pairing.HatchDeviceBleState, com.facebook.aura.devices.pairing.HatchDevicePairingMachineState):void");
    }
}
