package com.facebook.aura.devices.pairing;

import X.AII;
import X.AIM;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C8j4;
import X.C8j5;
import com.facebook.aura.devices.pairing.HatchDevicePairingEffect;
import com.facebook.aura.devices.pairing.HatchDevicePairingEvent;
import com.facebook.aura.devices.pairing.HatchLinkOtaRepairState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchDevicePairingStateMachine {
    public static final int $stable = 0;
    public final HatchDeviceFamily deviceFamily;

    public HatchDevicePairingStateMachine(HatchDeviceFamily hatchDeviceFamily) {
        C7384Etj.A0Y(hatchDeviceFamily, 0);
        this.deviceFamily = hatchDeviceFamily;
    }

    private final HatchDevicePairingTransition onDeviceTapped(HatchDevicePairingMachineState hatchDevicePairingMachineState, String str) {
        String str2 = hatchDevicePairingMachineState.setUpAgainAddress;
        if (AbstractC2159Azp.A12(str2, str, true)) {
            HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
            if (!hatchDevicePairingViewState.isInitialConnectionInProgress()) {
                HatchDevicePairingTransition hatchDevicePairingTransitionRescanDevices = rescanDevices(hatchDevicePairingMachineState.copy(hatchDevicePairingViewState, hatchDevicePairingMachineState.pendingLinkAction, hatchDevicePairingMachineState.linkOtaRepairState, str2, true));
                ArrayList arrayListA0P = AbstractC0878AGe.A0P(hatchDevicePairingTransitionRescanDevices.effects, Collections.singletonList(HatchDevicePairingEffect.StopBle.INSTANCE));
                HatchDevicePairingMachineState hatchDevicePairingMachineState2 = hatchDevicePairingTransitionRescanDevices.state;
                AnonymousClass003.A0u(hatchDevicePairingMachineState2, arrayListA0P);
                return new HatchDevicePairingTransition(hatchDevicePairingMachineState2, arrayListA0P);
            }
        }
        return selectDevice(hatchDevicePairingMachineState, str);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[LinkDeviceKeySetupFailure.values().length];
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.FIRMWARE_UPDATE_REQUIRED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.CVM_UNSUPPORTED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.DEVICE_ROLE_CONFLICT, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.NODE_ID_IN_USE, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.PAIRED_NODES_UNAVAILABLE, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.REPLACEMENT_DECLINED, iArr, 6);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(LinkDeviceKeySetupFailure.OTA_ROUND_TWO_EXPIRED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(LinkDeviceKeySetupFailure.DEVICE_KEY_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchDevicePairingLinkAction.values().length];
            try {
                AnonymousClass005.A0v(HatchDevicePairingLinkAction.ESTABLISH_PAIRING, iArr2, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingLinkAction.WIFI_SCAN, iArr2, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingLinkAction.PROVISION, iArr2, 3);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchDeviceBleState.values().length];
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.FOUND, iArr3, 1);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.READY, iArr3, 2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.NOT_FOUND, iArr3, 3);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.CONNECTION_FAILED, iArr3, 4);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.BLUETOOTH_OFF, iArr3, 5);
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[HatchDevicePairingStep.values().length];
            try {
                AnonymousClass005.A0v(HatchDevicePairingStep.CONNECTING_DEVICE, iArr4, 1);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingStep.LINK_INFO, iArr4, 2);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION, iArr4, 3);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingStep.CREDENTIALS, iArr4, 4);
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingStep.NETWORK_SCAN, iArr4, 5);
            } catch (NoSuchFieldError unused21) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingStep.PROVISIONING, iArr4, 6);
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[LinkSetupRefusal.values().length];
            try {
                AnonymousClass005.A0v(LinkSetupRefusal.GADGET_FIRMWARE_UPDATE_REQUIRED, iArr5, 1);
            } catch (NoSuchFieldError unused23) {
            }
            try {
                AnonymousClass005.A0v(LinkSetupRefusal.BUTTON_PRESS_TIMED_OUT, iArr5, 2);
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    private final HatchDevicePairingTransition connectToFoundDevice(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0P;
        HatchDevicePairingEffect[] hatchDevicePairingEffectArr;
        HatchDevicePairingEffect hatchDevicePairingEffect;
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (!hatchDevicePairingViewState.isInitialConnectionInProgress()) {
            HatchDeviceBleState pairingBleState = hatchDevicePairingViewState.getPairingBleState();
            HatchDeviceBleState hatchDeviceBleState = HatchDeviceBleState.IDLE;
            if (pairingBleState == hatchDeviceBleState) {
                if (!hatchDevicePairingViewState.getBlePermissionsGranted()) {
                    hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.BLE_SCAN, hatchDeviceBleState, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216691, null);
                    hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
                    hatchDevicePairingEffectArr = new HatchDevicePairingEffect[0];
                    return transition(hatchDevicePairingMachineStateA0P, hatchDevicePairingViewStateCopy$default, hatchDevicePairingEffectArr);
                }
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.CONNECTING_DEVICE, HatchDeviceBleState.SCANNING, null, null, null, null, false, false, true, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216691, null);
                hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
                hatchDevicePairingEffectArr = new HatchDevicePairingEffect[1];
                hatchDevicePairingEffect = HatchDevicePairingEffect.StartBleScan.INSTANCE;
            } else if (pairingBleState == HatchDeviceBleState.FOUND) {
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.CONNECTING_DEVICE, null, null, null, null, null, false, false, true, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216699, null);
                hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
                hatchDevicePairingEffectArr = new HatchDevicePairingEffect[1];
                hatchDevicePairingEffect = HatchDevicePairingEffect.ConnectToDiscovered.INSTANCE;
            } else if (pairingBleState == HatchDeviceBleState.READY) {
                return showNetworkScan(hatchDevicePairingMachineState, new HatchDevicePairingEffect[0]);
            }
            hatchDevicePairingEffectArr[0] = hatchDevicePairingEffect;
            return transition(hatchDevicePairingMachineStateA0P, hatchDevicePairingViewStateCopy$default, hatchDevicePairingEffectArr);
        }
        return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition continueAfterDeviceConnection(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (hatchDevicePairingViewState.getPairingStep() == HatchDevicePairingStep.LINK_INFO) {
            HatchDeviceBleState pairingBleState = hatchDevicePairingViewState.getPairingBleState();
            if (pairingBleState == HatchDeviceBleState.READY) {
                return hatchDevicePairingViewState.getLinkWifiRequirement() == LinkWifiRequirement.NONE ? startTokenOnlyProvisioning(hatchDevicePairingMachineState) : showNetworkScan(C8j4.A0f(HatchDevicePairingLinkAction.WIFI_SCAN, hatchDevicePairingMachineState, hatchDevicePairingViewState, hatchDevicePairingMachineState.linkOtaRepairState), HatchDevicePairingEffect.RequestLinkWifiScan.INSTANCE);
            }
            if (pairingBleState.isConnectionFailed()) {
                HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.DEVICE_FOUND, HatchDeviceBleState.FOUND, null, null, null, null, false, false, false, false, null, null, null, HatchDevicePairingDialog.CONNECTION_FAILED, null, false, false, null, null, false, null, false, null, null, false, 134183923, null);
                return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
            }
        }
        return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition devicesDiscovered(HatchDevicePairingMachineState hatchDevicePairingMachineState, List<HatchDiscoveredDevice> list) {
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, list, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217663, null));
        String str = hatchDevicePairingMachineState.setUpAgainAddress;
        if (str != null) {
            HatchDiscoveredDevice hatchDiscoveredDevice = null;
            if (hatchDevicePairingMachineState.autoSelectsSetUpAgain) {
                Iterator<HatchDiscoveredDevice> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    HatchDiscoveredDevice next = it.next();
                    String str2 = next.address;
                    if (str2 != null && str2.equalsIgnoreCase(str)) {
                        hatchDiscoveredDevice = next;
                        break;
                    }
                }
                HatchDiscoveredDevice hatchDiscoveredDevice2 = hatchDiscoveredDevice;
                if (hatchDiscoveredDevice2 != null) {
                    return selectDevice(hatchDevicePairingMachineStateA0P.copy(hatchDevicePairingMachineStateA0P.ui, hatchDevicePairingMachineStateA0P.pendingLinkAction, hatchDevicePairingMachineStateA0P.linkOtaRepairState, hatchDevicePairingMachineStateA0P.setUpAgainAddress, false), hatchDiscoveredDevice2.address);
                }
            }
        }
        return transition(hatchDevicePairingMachineStateA0P, hatchDevicePairingMachineStateA0P.ui, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition dismissFlow(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.BLE_SCAN;
        HatchDeviceBleState hatchDeviceBleState = HatchDeviceBleState.IDLE;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus = HatchDeviceProvisioningStatus.IDLE;
        C0881AGi c0881AGi = C0881AGi.A00;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, hatchDevicePairingStep, hatchDeviceBleState, hatchDeviceProvisioningStatus, null, c0881AGi, c0881AGi, true, false, false, false, null, "", null, null, null, false, false, null, null, false, LinkWifiRequirement.REQUIRED, false, null, null, false, 119489025, null);
        return transition(hatchDevicePairingMachineState.copy(hatchDevicePairingViewStateCopy$default, null, HatchLinkOtaRepairState.Idle.INSTANCE, null, false), hatchDevicePairingViewStateCopy$default, HatchDevicePairingEffect.ResetLinkSetup.INSTANCE, HatchDevicePairingEffect.StopBle.INSTANCE);
    }

    private final HatchDevicePairingTransition enterManualWifiEntry(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.CREDENTIALS, null, HatchDeviceProvisioningStatus.IDLE, null, null, null, false, false, false, true, "", "", null, null, null, false, false, null, null, false, null, false, null, null, false, 132106219, null);
        return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition failOtaRepair(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingDialog hatchDevicePairingDialog) {
        HatchDevicePairingDialog pairingDialog = hatchDevicePairingDialog;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = hatchDevicePairingMachineState.ui;
        if (hatchDevicePairingViewStateCopy$default.getShowPairingFlow()) {
            HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.CREDENTIALS;
            HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus = HatchDeviceProvisioningStatus.AUTH_FAILED;
            if (hatchDevicePairingDialog == null) {
                pairingDialog = hatchDevicePairingViewStateCopy$default.getProvisioningWifiJoined() ? HatchDevicePairingDialog.PROVISIONING_FAILED : hatchDevicePairingViewStateCopy$default.getPairingDialog();
            }
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewStateCopy$default, false, false, hatchDevicePairingStep, null, hatchDeviceProvisioningStatus, null, null, null, false, false, false, false, null, null, null, pairingDialog, null, false, false, null, null, false, null, false, null, null, false, 134183915, null);
        }
        return transition(C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE), hatchDevicePairingViewStateCopy$default, HatchDevicePairingEffect.ResetLinkSetup.INSTANCE);
    }

    public static /* synthetic */ HatchDevicePairingTransition failOtaRepair$default(HatchDevicePairingStateMachine hatchDevicePairingStateMachine, HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingDialog hatchDevicePairingDialog, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchDevicePairingDialog = null;
        }
        return hatchDevicePairingStateMachine.failOtaRepair(hatchDevicePairingMachineState, hatchDevicePairingDialog);
    }

    private final HatchDevicePairingTransition goBack(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        switch (hatchDevicePairingViewState.getPairingStep().ordinal()) {
            case 2:
            case 3:
            case 4:
                return rescanDevices(hatchDevicePairingMachineState);
            case 5:
                HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.LINK_INFO, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217723, null);
                HatchDevicePairingLinkAction hatchDevicePairingLinkAction = hatchDevicePairingMachineState.pendingLinkAction;
                if (hatchDevicePairingLinkAction == HatchDevicePairingLinkAction.WIFI_SCAN) {
                    hatchDevicePairingLinkAction = null;
                }
                return transition(C8j4.A0f(hatchDevicePairingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, hatchDevicePairingMachineState.linkOtaRepairState), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
            case 6:
                return transition(hatchDevicePairingMachineState, HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.NETWORK_SCAN, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217723, null), new HatchDevicePairingEffect[0]);
            case 7:
                return hatchDevicePairingViewState.isTokenOnlyProvisioning() ? rescanDevices(C8j5.A0P(hatchDevicePairingMachineState, HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 125829119, null))) : transition(C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewState, HatchLinkOtaRepairState.Idle.INSTANCE), HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.CREDENTIALS, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217723, null), HatchDevicePairingEffect.ResetLinkSetup.INSTANCE);
            default:
                return dismissFlow(hatchDevicePairingMachineState);
        }
    }

    private final HatchDevicePairingTransition onBlePermissionsChanged(HatchDevicePairingMachineState hatchDevicePairingMachineState, boolean z) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, z, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217726, null);
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
        return (z && !hatchDevicePairingMachineState.ui.getBlePermissionsGranted() && hatchDevicePairingViewStateCopy$default.getShowPairingFlow() && hatchDevicePairingViewStateCopy$default.getPairingBleState() == HatchDeviceBleState.IDLE && hatchDevicePairingViewStateCopy$default.getPairingStep() == HatchDevicePairingStep.BLE_SCAN) ? startBleScan(hatchDevicePairingMachineStateA0P) : transition(hatchDevicePairingMachineStateA0P, hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158 A[PHI: r3 r5
  0x0158: PHI (r3v14 com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction) = 
  (r3v10 com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction)
  (r3v10 com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction)
  (r3v10 com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction)
  (r3v17 com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction)
 binds: [B:39:0x011e, B:40:0x0120, B:42:0x0128, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r5v5 com.facebook.aura.devices.pairing.HatchDevicePairingViewState) = 
  (r5v1 com.facebook.aura.devices.pairing.HatchDevicePairingViewState)
  (r5v1 com.facebook.aura.devices.pairing.HatchDevicePairingViewState)
  (r5v1 com.facebook.aura.devices.pairing.HatchDevicePairingViewState)
  (r5v8 com.facebook.aura.devices.pairing.HatchDevicePairingViewState)
 binds: [B:39:0x011e, B:40:0x0120, B:42:0x0128, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.devices.pairing.HatchDevicePairingTransition onBleStateChanged(com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r41, com.facebook.aura.devices.pairing.HatchDevicePairingEvent.BleStateChanged r42) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingStateMachine.onBleStateChanged(com.facebook.aura.devices.pairing.HatchDevicePairingMachineState, com.facebook.aura.devices.pairing.HatchDevicePairingEvent$BleStateChanged):com.facebook.aura.devices.pairing.HatchDevicePairingTransition");
    }

    private final HatchDevicePairingTransition onLinkDisconnected(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchLinkOtaRepairState.AwaitingReboot awaitingReboot;
        HatchLinkOtaRepairState hatchLinkOtaRepairState = hatchDevicePairingMachineState.linkOtaRepairState;
        if (!(hatchLinkOtaRepairState instanceof HatchLinkOtaRepairState.AwaitingReboot) || (awaitingReboot = (HatchLinkOtaRepairState.AwaitingReboot) hatchLinkOtaRepairState) == null) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
        }
        return restartOtaScan(C8j4.A0f(hatchDevicePairingMachineState.pendingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchLinkOtaRepairState.Rescanning(awaitingReboot.ssid, awaitingReboot.password, 0)));
    }

    private final HatchDevicePairingTransition onLinkOtaRequested(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingEvent.LinkOtaRequested linkOtaRequested) {
        if (this.deviceFamily != HatchDeviceFamily.HATCH_LINK || hatchDevicePairingMachineState.pendingLinkAction != HatchDevicePairingLinkAction.PROVISION) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
        }
        HatchLinkOtaRepairState.AwaitingReboot awaitingReboot = new HatchLinkOtaRepairState.AwaitingReboot(linkOtaRequested.ssid, linkOtaRequested.password);
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0f = C8j4.A0f(hatchDevicePairingMachineState.pendingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, awaitingReboot);
        return transition(hatchDevicePairingMachineStateA0f, hatchDevicePairingMachineStateA0f.ui, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onLinkOtaRoundTwoExpired(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchLinkOtaRepairState hatchLinkOtaRepairState = hatchDevicePairingMachineState.linkOtaRepairState;
        if ((hatchLinkOtaRepairState instanceof HatchLinkOtaRepairState.Rescanning) || (hatchLinkOtaRepairState instanceof HatchLinkOtaRepairState.Repairing)) {
            return failOtaRepair(hatchDevicePairingMachineState, HatchDevicePairingDialog.CONNECTION_FAILED);
        }
        if (!C7384Etj.areEqual(hatchLinkOtaRepairState, HatchLinkOtaRepairState.Idle.INSTANCE) && !(hatchLinkOtaRepairState instanceof HatchLinkOtaRepairState.AwaitingReboot)) {
            throw C3cG.A0q();
        }
        return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onLinkPairingConfirmationRequired(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = hatchDevicePairingMachineState.ui;
        if (hatchDevicePairingViewStateCopy$default.getShowPairingFlow()) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewStateCopy$default, false, false, HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216699, null);
        }
        return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onLinkPairingConfirmationTimedOut(HatchDevicePairingMachineState hatchDevicePairingMachineState, boolean z) {
        int iOrdinal;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0f;
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (!hatchDevicePairingViewState.getShowPairingFlow()) {
            return transition(C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewState, HatchLinkOtaRepairState.Idle.INSTANCE), hatchDevicePairingMachineState.ui, HatchDevicePairingEffect.ResetLinkSetup.INSTANCE);
        }
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction = hatchDevicePairingMachineState.pendingLinkAction;
        if (hatchDevicePairingLinkAction == null || (iOrdinal = hatchDevicePairingLinkAction.ordinal()) == -1) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
        }
        if (iOrdinal == 0) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.DEVICE_FOUND, HatchDeviceBleState.FOUND, null, null, null, null, false, false, false, false, null, null, null, z ? HatchDevicePairingDialog.BUTTON_PRESS_TIMED_OUT : HatchDevicePairingDialog.CONNECTION_FAILED, null, false, false, null, null, false, null, false, null, null, false, 134183923, null);
            hatchDevicePairingMachineStateA0f = C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
        } else if (iOrdinal == 1) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.NETWORK_SCAN, null, null, null, null, null, false, true, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216955, null);
            hatchDevicePairingMachineStateA0f = C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.PROVISIONING, null, HatchDeviceProvisioningStatus.AUTH_FAILED, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217707, null);
            hatchDevicePairingMachineStateA0f = C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
        }
        return transition(hatchDevicePairingMachineStateA0f, hatchDevicePairingViewStateCopy$default, HatchDevicePairingEffect.ResetLinkSetup.INSTANCE);
    }

    private final HatchDevicePairingTransition onLinkPairingEstablishmentFinished(HatchDevicePairingMachineState hatchDevicePairingMachineState, boolean z, LinkWifiRequirement linkWifiRequirement) {
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        if (hatchDevicePairingMachineState.pendingLinkAction != HatchDevicePairingLinkAction.ESTABLISH_PAIRING) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
        }
        if (z) {
            HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
            if (hatchDevicePairingViewState.getLinkDeviceVerification() == LinkDeviceVerification.COMMUNITY) {
                return continueAfterDeviceConnection(C8j5.A0P(hatchDevicePairingMachineState, HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, linkWifiRequirement, false, null, null, false, 130023423, null)));
            }
            hatchDevicePairingLinkAction = null;
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.LINK_INFO, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, linkWifiRequirement, false, null, null, false, 130022395, null);
        } else {
            hatchDevicePairingLinkAction = null;
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.DEVICE_FOUND, HatchDeviceBleState.FOUND, null, null, null, null, false, false, false, false, null, null, null, HatchDevicePairingDialog.CONNECTION_FAILED, null, false, false, null, null, false, null, false, null, null, false, 134183923, null);
        }
        return transition(C8j4.A0f(hatchDevicePairingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, hatchDevicePairingMachineState.linkOtaRepairState), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onLinkProvisionRequestFinished(HatchDevicePairingMachineState hatchDevicePairingMachineState, boolean z) {
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0f;
        if (hatchDevicePairingMachineState.pendingLinkAction != HatchDevicePairingLinkAction.PROVISION) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
        }
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = hatchDevicePairingMachineState.ui;
        boolean showPairingFlow = hatchDevicePairingViewStateCopy$default.getShowPairingFlow();
        if (z) {
            if (showPairingFlow) {
                HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.PROVISIONING;
                boolean zA1Z = AnonymousClass002.A1Z(hatchDevicePairingViewStateCopy$default.getLinkDeviceVerification(), LinkDeviceVerification.COMMUNITY);
                HatchDeviceProvisioningStatus pairingProvisioningStatus = hatchDevicePairingViewStateCopy$default.getPairingProvisioningStatus();
                if (pairingProvisioningStatus == HatchDeviceProvisioningStatus.IDLE) {
                    pairingProvisioningStatus = HatchDeviceProvisioningStatus.AUTH_VALIDATING;
                }
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewStateCopy$default, false, false, hatchDevicePairingStep, null, pairingProvisioningStatus, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, zA1Z, 67107819, null);
            }
            hatchDevicePairingMachineStateA0f = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
        } else {
            if (showPairingFlow) {
                if (hatchDevicePairingViewStateCopy$default.isTokenOnlyProvisioning()) {
                    hatchDevicePairingViewStateCopy$default = tokenOnlyProvisioningFailed(hatchDevicePairingViewStateCopy$default);
                } else {
                    hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewStateCopy$default, false, false, HatchDevicePairingStep.CREDENTIALS, null, HatchDeviceProvisioningStatus.AUTH_FAILED, null, null, null, false, false, false, false, null, null, null, hatchDevicePairingViewStateCopy$default.getProvisioningWifiJoined() ? HatchDevicePairingDialog.PROVISIONING_FAILED : hatchDevicePairingViewStateCopy$default.getPairingDialog(), null, false, false, null, null, false, null, false, null, null, false, 67075051, null);
                }
            }
            hatchDevicePairingMachineStateA0f = C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
        }
        return transition(hatchDevicePairingMachineStateA0f, hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchDevicePairingTransition onLinkSetupFailedWithDialog(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingDialog hatchDevicePairingDialog, boolean z) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (!hatchDevicePairingViewState.getShowPairingFlow() || (hatchDevicePairingMachineState.pendingLinkAction == null && !(z && HatchDevicePairingStateExtKt.isAwaitingInitialConnect(hatchDevicePairingViewState)))) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
        }
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.DEVICE_FOUND, HatchDeviceBleState.FOUND, null, null, null, null, false, false, false, false, null, null, null, hatchDevicePairingDialog, null, false, false, null, null, false, null, false, null, null, false, 134183923, null);
        return transition(C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onLinkSetupHandoffFailed(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(tokenOnlyProvisioningFailed(hatchDevicePairingMachineState.ui), false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, HatchDevicePairingDialog.SETUP_HANDOFF_FAILED, null, false, false, null, null, false, null, false, null, null, false, 134184959, null);
        return transition(C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onLinkWifiScanRequestFinished(HatchDevicePairingMachineState hatchDevicePairingMachineState, boolean z) {
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction = hatchDevicePairingMachineState.pendingLinkAction;
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction2 = HatchDevicePairingLinkAction.WIFI_SCAN;
        if (hatchDevicePairingLinkAction != hatchDevicePairingLinkAction2) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
        }
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = z ? HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.NETWORK_SCAN, null, null, null, null, null, true, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134215931, null) : HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, null, null, null, null, null, false, true, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216959, null);
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction3 = hatchDevicePairingMachineState.pendingLinkAction;
        if (!z && hatchDevicePairingLinkAction3 == hatchDevicePairingLinkAction2) {
            hatchDevicePairingLinkAction3 = null;
        }
        return transition(C8j4.A0f(hatchDevicePairingLinkAction3, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, hatchDevicePairingMachineState.linkOtaRepairState), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onOtaRescanStateChanged(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchLinkOtaRepairState.Rescanning rescanning, HatchDevicePairingEvent.BleStateChanged bleStateChanged) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0P;
        HatchDevicePairingEffect[] hatchDevicePairingEffectArr;
        HatchDevicePairingEffect provisionLink;
        int iOrdinal = bleStateChanged.state.ordinal();
        if (iOrdinal == 2) {
            HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
            HatchDeviceBleState hatchDeviceBleState = HatchDeviceBleState.FOUND;
            String pairingTargetName = bleStateChanged.detail;
            if (pairingTargetName == null) {
                pairingTargetName = hatchDevicePairingViewState.getPairingTargetName();
            }
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, hatchDeviceBleState, null, pairingTargetName, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217687, null);
            hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
            hatchDevicePairingEffectArr = new HatchDevicePairingEffect[1];
            provisionLink = HatchDevicePairingEffect.ConnectToDiscovered.INSTANCE;
        } else {
            if (iOrdinal != 5) {
                if (iOrdinal == 7 || iOrdinal == 6) {
                    return retryOtaScan(hatchDevicePairingMachineState, rescanning);
                }
                if (iOrdinal == 8) {
                    return failOtaRepair(hatchDevicePairingMachineState, null);
                }
                return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
            }
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, HatchDeviceBleState.READY, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217719, null);
            hatchDevicePairingMachineStateA0P = C8j4.A0f(HatchDevicePairingLinkAction.PROVISION, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, new HatchLinkOtaRepairState.Repairing(rescanning.ssid, rescanning.password));
            hatchDevicePairingEffectArr = new HatchDevicePairingEffect[1];
            provisionLink = new HatchDevicePairingEffect.ProvisionLink(rescanning.ssid, rescanning.password, false);
        }
        hatchDevicePairingEffectArr[0] = provisionLink;
        return transition(hatchDevicePairingMachineStateA0P, hatchDevicePairingViewStateCopy$default, hatchDevicePairingEffectArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.devices.pairing.HatchDevicePairingTransition onProvisioningStatusChanged(com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r33, com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r34) {
        /*
            r32 = this;
            r3 = r33
            com.facebook.aura.devices.pairing.HatchLinkOtaRepairState r1 = r3.linkOtaRepairState
            boolean r0 = r1 instanceof com.facebook.aura.devices.pairing.HatchLinkOtaRepairState.AwaitingReboot
            r4 = r32
            r10 = r34
            if (r0 == 0) goto L1b
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.OTA_SKIPPED
            if (r10 == r0) goto L14
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.OTA_FAILED
            if (r10 != r0) goto L1b
        L14:
            com.facebook.aura.devices.pairing.HatchLinkOtaRepairState$AwaitingReboot r1 = (com.facebook.aura.devices.pairing.HatchLinkOtaRepairState.AwaitingReboot) r1
            com.facebook.aura.devices.pairing.HatchDevicePairingTransition r0 = r4.startOtaRoundTwoInSession(r3, r1)
            return r0
        L1b:
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = r3.ui
            boolean r2 = com.facebook.aura.devices.pairing.HatchDevicePairingStateExtKt.isProvisioningFailure(r0, r10)
            r6 = 0
            if (r2 == 0) goto L3e
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r1 = r3.ui
            boolean r0 = r1.isTokenOnlyProvisioning()
            if (r0 == 0) goto L3e
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r5 = r4.tokenOnlyProvisioningFailed(r1)
            com.facebook.aura.devices.pairing.HatchLinkOtaRepairState$Idle r1 = com.facebook.aura.devices.pairing.HatchLinkOtaRepairState.Idle.INSTANCE
            r0 = 0
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r1 = X.C8j4.A0f(r0, r3, r5, r1)
        L37:
            com.facebook.aura.devices.pairing.HatchDevicePairingEffect[] r0 = new com.facebook.aura.devices.pairing.HatchDevicePairingEffect[r6]
            com.facebook.aura.devices.pairing.HatchDevicePairingTransition r0 = r4.transition(r1, r5, r0)
            return r0
        L3e:
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r5 = r3.ui
            boolean r0 = r10.isTerminal()
            if (r0 == 0) goto Lbf
            com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction r1 = r3.pendingLinkAction
            com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction r0 = com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction.PROVISION
            if (r1 != r0) goto Lbf
            r16 = 0
        L4e:
            boolean r1 = r5.getProvisioningWifiJoined()
            if (r1 != 0) goto L5c
            boolean r0 = r10.getJoinedWifi()
            r27 = 0
            if (r0 == 0) goto L5e
        L5c:
            r27 = 1
        L5e:
            if (r2 == 0) goto Lb6
            com.facebook.aura.devices.pairing.HatchDevicePairingStep r8 = com.facebook.aura.devices.pairing.HatchDevicePairingStep.CREDENTIALS
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.CVM_UNSUPPORTED
            if (r10 != r0) goto Laa
            com.facebook.aura.devices.pairing.HatchDevicePairingDialog r21 = com.facebook.aura.devices.pairing.HatchDevicePairingDialog.CVM_UNSUPPORTED
        L68:
            r33 = 132086763(0x7df7beb, float:3.3626143E-34)
            r9 = 0
            r7 = r6
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r6
            r15 = r6
            r17 = r6
            r18 = r9
            r19 = r9
            r20 = r9
            r22 = r9
            r23 = r6
            r24 = r6
            r25 = r9
            r26 = r9
            r28 = r9
            r29 = r6
            r30 = r9
            r31 = r9
            r32 = r6
            r34 = r9
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r5 = com.facebook.aura.devices.pairing.HatchDevicePairingViewState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction r2 = r3.pendingLinkAction
            boolean r1 = r10.isTerminal()
            if (r1 == 0) goto L9d
            r2 = r9
        L9d:
            com.facebook.aura.devices.pairing.HatchLinkOtaRepairState r0 = r3.linkOtaRepairState
            if (r1 != 0) goto La3
            if (r0 != 0) goto La5
        La3:
            com.facebook.aura.devices.pairing.HatchLinkOtaRepairState$Idle r0 = com.facebook.aura.devices.pairing.HatchLinkOtaRepairState.Idle.INSTANCE
        La5:
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r1 = X.C8j4.A0f(r2, r3, r5, r0)
            goto L37
        Laa:
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.DEVICE_BUSY
            if (r10 != r0) goto Lb1
            com.facebook.aura.devices.pairing.HatchDevicePairingDialog r21 = com.facebook.aura.devices.pairing.HatchDevicePairingDialog.DEVICE_BUSY
            goto L68
        Lb1:
            if (r1 == 0) goto Lba
            com.facebook.aura.devices.pairing.HatchDevicePairingDialog r21 = com.facebook.aura.devices.pairing.HatchDevicePairingDialog.PROVISIONING_FAILED
            goto L68
        Lb6:
            com.facebook.aura.devices.pairing.HatchDevicePairingStep r8 = r5.getPairingStep()
        Lba:
            com.facebook.aura.devices.pairing.HatchDevicePairingDialog r21 = r5.getPairingDialog()
            goto L68
        Lbf:
            boolean r16 = r5.isInitialConnectionInProgress()
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingStateMachine.onProvisioningStatusChanged(com.facebook.aura.devices.pairing.HatchDevicePairingMachineState, com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus):com.facebook.aura.devices.pairing.HatchDevicePairingTransition");
    }

    private final HatchDevicePairingTransition onWifiScanError(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, true, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216959, null);
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction = hatchDevicePairingMachineState.pendingLinkAction;
        if (hatchDevicePairingLinkAction == HatchDevicePairingLinkAction.WIFI_SCAN) {
            hatchDevicePairingLinkAction = null;
        }
        return transition(C8j4.A0f(hatchDevicePairingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, hatchDevicePairingMachineState.linkOtaRepairState), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition onWifiScanResult(HatchDevicePairingMachineState hatchDevicePairingMachineState, List<HatchDeviceWiFiNetwork> list) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.devices.pairing.HatchDevicePairingStateMachine$onWifiScanResult$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((HatchDeviceWiFiNetwork) t2).rssi).compareTo(Integer.valueOf(((HatchDeviceWiFiNetwork) t).rssi));
            }
        }), false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216831, null);
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction = hatchDevicePairingMachineState.pendingLinkAction;
        if (hatchDevicePairingLinkAction == HatchDevicePairingLinkAction.WIFI_SCAN) {
            hatchDevicePairingLinkAction = null;
        }
        return transition(C8j4.A0f(hatchDevicePairingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, hatchDevicePairingMachineState.linkOtaRepairState), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition requestWifiScan(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, C0881AGi.A00, true, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216831, null);
        return transition(C8j4.A0f(HatchDevicePairingLinkAction.WIFI_SCAN, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, hatchDevicePairingMachineState.linkOtaRepairState), hatchDevicePairingViewStateCopy$default, HatchDevicePairingEffect.RequestLinkWifiScan.INSTANCE);
    }

    private final HatchDevicePairingTransition rescanDevices(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.BLE_SCAN;
        HatchDeviceBleState hatchDeviceBleState = hatchDevicePairingViewState.getBlePermissionsGranted() ? HatchDeviceBleState.SCANNING : HatchDeviceBleState.IDLE;
        C0881AGi c0881AGi = C0881AGi.A00;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, hatchDevicePairingStep, hatchDeviceBleState, null, null, c0881AGi, c0881AGi, true, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134182931, null);
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0f = C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
        AII aiiA17 = AIM.A17();
        if (hatchDevicePairingViewStateCopy$default.getBlePermissionsGranted()) {
            aiiA17.add(HatchDevicePairingEffect.StartBleScan.INSTANCE);
        }
        return new HatchDevicePairingTransition(C8j5.A0P(hatchDevicePairingMachineStateA0f, hatchDevicePairingViewStateCopy$default), AIM.A18(aiiA17));
    }

    private final HatchDevicePairingTransition restartOtaScan(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (!hatchDevicePairingViewState.getBlePermissionsGranted()) {
            return failOtaRepair(hatchDevicePairingMachineState, null);
        }
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, HatchDeviceBleState.SCANNING, null, null, null, null, false, false, true, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216695, null);
        return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, HatchDevicePairingEffect.StartBleScan.INSTANCE);
    }

    private final HatchDevicePairingTransition retryOtaScan(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchLinkOtaRepairState.Rescanning rescanning) {
        int i = rescanning.attempts;
        if (i >= 8) {
            return failOtaRepair(hatchDevicePairingMachineState, null);
        }
        HatchLinkOtaRepairState.Rescanning rescanningCopy = rescanning.copy(rescanning.ssid, rescanning.password, i + 1);
        return restartOtaScan(C8j4.A0f(hatchDevicePairingMachineState.pendingLinkAction, hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, rescanningCopy));
    }

    private final HatchDevicePairingTransition selectDevice(HatchDevicePairingMachineState hatchDevicePairingMachineState, String str) {
        HatchDiscoveredDevice next;
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (hatchDevicePairingViewState.isInitialConnectionInProgress()) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
        }
        Iterator<HatchDiscoveredDevice> it = hatchDevicePairingViewState.getDiscoveredDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.address, str)) {
                break;
            }
        }
        HatchDiscoveredDevice hatchDiscoveredDevice = next;
        String pairingTargetName = hatchDiscoveredDevice != null ? hatchDiscoveredDevice.name : null;
        HatchDevicePairingViewState hatchDevicePairingViewState2 = hatchDevicePairingMachineState.ui;
        HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.CONNECTING_DEVICE;
        HatchDeviceBleState hatchDeviceBleState = HatchDeviceBleState.CONNECTING;
        if (pairingTargetName == null) {
            pairingTargetName = hatchDevicePairingViewState2.getPairingTargetName();
        }
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState2, false, false, hatchDevicePairingStep, hatchDeviceBleState, null, pairingTargetName, null, null, false, false, true, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216659, null);
        return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect.ConnectToDevice(str));
    }

    private final HatchDevicePairingTransition selectWifiNetwork(HatchDevicePairingMachineState hatchDevicePairingMachineState, String str, String str2) {
        String str3 = str2;
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (str2 == null) {
            str3 = "";
        }
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.CREDENTIALS, null, HatchDeviceProvisioningStatus.IDLE, null, null, null, false, false, false, false, str, str3, null, null, null, false, false, null, null, false, null, false, null, null, false, 132106219, null);
        return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition showFlow(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingEvent.ShowFlow showFlow) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        String str = showFlow.presentationId;
        HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.BLE_SCAN;
        HatchDeviceBleState hatchDeviceBleState = hatchDevicePairingViewState.getBlePermissionsGranted() ? HatchDeviceBleState.SCANNING : HatchDeviceBleState.IDLE;
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus = HatchDeviceProvisioningStatus.IDLE;
        C0881AGi c0881AGi = C0881AGi.A00;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, true, hatchDevicePairingStep, hatchDeviceBleState, hatchDeviceProvisioningStatus, null, c0881AGi, c0881AGi, true, false, false, false, null, "", null, null, null, false, false, null, null, false, LinkWifiRequirement.REQUIRED, false, null, str, false, 18825217, null);
        HatchLinkOtaRepairState.Idle idle = HatchLinkOtaRepairState.Idle.INSTANCE;
        String str2 = showFlow.setUpAgainAddress;
        HatchDevicePairingMachineState hatchDevicePairingMachineStateCopy = hatchDevicePairingMachineState.copy(hatchDevicePairingViewStateCopy$default, null, idle, str2, AnonymousClass002.A1X(str2));
        AII aiiA17 = AIM.A17();
        aiiA17.add(HatchDevicePairingEffect.ResetLinkSetup.INSTANCE);
        if (hatchDevicePairingViewStateCopy$default.getBlePermissionsGranted()) {
            aiiA17.add(HatchDevicePairingEffect.StartBleScan.INSTANCE);
        }
        return new HatchDevicePairingTransition(C8j5.A0P(hatchDevicePairingMachineStateCopy, hatchDevicePairingViewStateCopy$default), AIM.A18(aiiA17));
    }

    private final HatchDevicePairingTransition showNetworkScan(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingEffect... hatchDevicePairingEffectArr) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.NETWORK_SCAN, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216699, null);
        return transition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default), hatchDevicePairingViewStateCopy$default, (HatchDevicePairingEffect[]) Arrays.copyOf(hatchDevicePairingEffectArr, hatchDevicePairingEffectArr.length));
    }

    private final HatchDevicePairingTransition skipWifi(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        HatchDevicePairingStep pairingStep = hatchDevicePairingViewState.getPairingStep();
        return ((pairingStep == HatchDevicePairingStep.NETWORK_SCAN || pairingStep == HatchDevicePairingStep.CREDENTIALS) && hatchDevicePairingViewState.getLinkWifiRequirement() == LinkWifiRequirement.OPTIONAL && hatchDevicePairingViewState.getPairingBleState() == HatchDeviceBleState.READY) ? startTokenOnlyProvisioning(hatchDevicePairingMachineState) : transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingTransition startBleScan(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0f;
        HatchDevicePairingEffect[] hatchDevicePairingEffectArr;
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        if (hatchDevicePairingViewState.getBlePermissionsGranted()) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, HatchDeviceBleState.SCANNING, null, null, null, C0881AGi.A00, true, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134183031, null);
            hatchDevicePairingMachineStateA0f = C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
            hatchDevicePairingEffectArr = new HatchDevicePairingEffect[]{HatchDevicePairingEffect.StartBleScan.INSTANCE};
        } else {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, HatchDeviceBleState.IDLE, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134216695, null);
            hatchDevicePairingMachineStateA0f = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
            hatchDevicePairingEffectArr = new HatchDevicePairingEffect[0];
        }
        return transition(hatchDevicePairingMachineStateA0f, hatchDevicePairingViewStateCopy$default, hatchDevicePairingEffectArr);
    }

    private final HatchDevicePairingTransition startOtaRoundTwoInSession(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchLinkOtaRepairState.AwaitingReboot awaitingReboot) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.PROVISIONING, null, HatchDeviceProvisioningStatus.AUTH_VALIDATING, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134217707, null);
        return transition(C8j4.A0f(HatchDevicePairingLinkAction.PROVISION, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, new HatchLinkOtaRepairState.Repairing(awaitingReboot.ssid, awaitingReboot.password)), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect.ProvisionLink(awaitingReboot.ssid, awaitingReboot.password, false));
    }

    private final HatchDevicePairingTransition startProvisioning(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        String selectedWifiSsid;
        boolean z;
        HatchDeviceBleState pairingBleState;
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        HatchDevicePairingEffect provisionLink;
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0f;
        HatchDevicePairingEffect[] hatchDevicePairingEffectArr;
        HatchDevicePairingViewState hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        HatchDevicePairingStep pairingStep = hatchDevicePairingViewState.getPairingStep();
        HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.PROVISIONING;
        if (pairingStep == hatchDevicePairingStep || hatchDevicePairingMachineState.pendingLinkAction == HatchDevicePairingLinkAction.PROVISION || (selectedWifiSsid = hatchDevicePairingViewState.getSelectedWifiSsid()) == null) {
            return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
        }
        String wifiPassword = hatchDevicePairingViewState.getWifiPassword();
        if (this.deviceFamily != HatchDeviceFamily.HATCH_LINK || hatchDevicePairingViewState.getPairingBleState() == HatchDeviceBleState.READY || hatchDevicePairingViewState.getPairingTargetName() == null) {
            z = false;
            pairingBleState = hatchDevicePairingViewState.getPairingBleState();
        } else {
            z = true;
            if (!hatchDevicePairingViewState.getBlePermissionsGranted()) {
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, HatchDeviceBleState.IDLE, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134183927, null);
                hatchDevicePairingMachineStateA0f = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default);
                hatchDevicePairingEffectArr = new HatchDevicePairingEffect[0];
                return transition(hatchDevicePairingMachineStateA0f, hatchDevicePairingViewStateCopy$default, hatchDevicePairingEffectArr);
            }
            hatchDevicePairingStep = HatchDevicePairingStep.CONNECTING_DEVICE;
            pairingBleState = HatchDeviceBleState.SCANNING;
        }
        hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, hatchDevicePairingStep, pairingBleState, HatchDeviceProvisioningStatus.IDLE, null, null, null, false, false, z, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 132086755, null);
        if (z) {
            hatchDevicePairingMachineStateA0f = C8j4.A0f(HatchDevicePairingLinkAction.PROVISION, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
            hatchDevicePairingEffectArr = new HatchDevicePairingEffect[1];
            provisionLink = HatchDevicePairingEffect.StartBleScan.INSTANCE;
        } else {
            provisionLink = new HatchDevicePairingEffect.ProvisionLink(selectedWifiSsid, wifiPassword, true);
            hatchDevicePairingMachineStateA0f = C8j4.A0f(HatchDevicePairingLinkAction.PROVISION, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE);
            hatchDevicePairingEffectArr = new HatchDevicePairingEffect[1];
        }
        hatchDevicePairingEffectArr[0] = provisionLink;
        return transition(hatchDevicePairingMachineStateA0f, hatchDevicePairingViewStateCopy$default, hatchDevicePairingEffectArr);
    }

    private final HatchDevicePairingTransition startTokenOnlyProvisioning(HatchDevicePairingMachineState hatchDevicePairingMachineState) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, HatchDevicePairingStep.PROVISIONING, null, HatchDeviceProvisioningStatus.IDLE, null, null, null, false, false, false, false, null, "", null, null, null, false, false, null, null, false, null, true, null, null, false, 123685867, null);
        return transition(C8j4.A0f(HatchDevicePairingLinkAction.PROVISION, hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, HatchLinkOtaRepairState.Idle.INSTANCE), hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect.ProvisionLink(null, null, false));
    }

    private final HatchDevicePairingViewState tokenOnlyProvisioningFailed(HatchDevicePairingViewState hatchDevicePairingViewState) {
        return HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, HatchDevicePairingStep.DEVICE_FOUND, HatchDeviceBleState.FOUND, HatchDeviceProvisioningStatus.IDLE, null, null, null, false, false, false, false, null, null, null, HatchDevicePairingDialog.PROVISIONING_FAILED, null, false, false, null, null, false, null, false, null, null, false, 58686435, null);
    }

    public static /* synthetic */ HatchDevicePairingTransition transition$default(HatchDevicePairingStateMachine hatchDevicePairingStateMachine, HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingViewState hatchDevicePairingViewState, HatchDevicePairingEffect[] hatchDevicePairingEffectArr, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        }
        return hatchDevicePairingStateMachine.transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, hatchDevicePairingEffectArr);
    }

    public final HatchDevicePairingTransition reduce(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingEvent hatchDevicePairingEvent) {
        HatchDevicePairingViewState hatchDevicePairingViewStateCopy$default;
        HatchDevicePairingViewState hatchDevicePairingViewState;
        boolean zA1a = AnonymousClass002.A1a(hatchDevicePairingMachineState, hatchDevicePairingEvent);
        if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkConfirmationRequested) {
            hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
            if (hatchDevicePairingViewState.getShowPairingFlow()) {
                HatchDevicePairingEvent.LinkConfirmationRequested linkConfirmationRequested = (HatchDevicePairingEvent.LinkConfirmationRequested) hatchDevicePairingEvent;
                HatchDevicePairingStep hatchDevicePairingStep = linkConfirmationRequested.step;
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, hatchDevicePairingStep, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, hatchDevicePairingStep == HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION ? LinkAppConfirmationState.REQUIRED : null, Long.valueOf(linkConfirmationRequested.requestId), false, null, false, null, null, false, 132643835, null);
                return transition(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
            }
            return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
        }
        if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkInfoAcknowledged.INSTANCE)) {
            hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
            if (hatchDevicePairingViewState.getPairingStep() == HatchDevicePairingStep.LINK_INFO) {
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState, false, false, null, null, null, null, null, null, false, false, zA1a, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 133168127, null);
            }
            return transition(hatchDevicePairingMachineState, hatchDevicePairingViewState, new HatchDevicePairingEffect[0]);
        }
        if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkAppConfirmationChanged) {
            HatchDevicePairingViewState hatchDevicePairingViewState2 = hatchDevicePairingMachineState.ui;
            LinkAppConfirmationState linkAppConfirmationState = ((HatchDevicePairingEvent.LinkAppConfirmationChanged) hatchDevicePairingEvent).confirmation;
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingViewState2, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, linkAppConfirmationState, linkAppConfirmationState != null ? hatchDevicePairingViewState2.getLinkConfirmationRequestId() : null, false, null, false, null, null, false, 132644863, null);
        } else if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkDeviceVerificationChanged) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, ((HatchDevicePairingEvent.LinkDeviceVerificationChanged) hatchDevicePairingEvent).verification, false, false, null, null, false, null, false, null, null, false, 134152191, null);
        } else if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.DeveloperModeChanged) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, ((HatchDevicePairingEvent.DeveloperModeChanged) hatchDevicePairingEvent).enabled, false, null, null, false, null, false, null, null, false, 134086655, null);
        } else if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.DeveloperModeHintChanged) {
            hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, ((HatchDevicePairingEvent.DeveloperModeHintChanged) hatchDevicePairingEvent).shows, null, null, false, null, false, null, null, false, 133955583, null);
        } else {
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.BlePermissionsChanged) {
                return onBlePermissionsChanged(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.BlePermissionsChanged) hatchDevicePairingEvent).granted);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.ShowFlow) {
                return showFlow(hatchDevicePairingMachineState, (HatchDevicePairingEvent.ShowFlow) hatchDevicePairingEvent);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.DismissFlow.INSTANCE)) {
                return dismissFlow(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.StartBleScan.INSTANCE)) {
                return startBleScan(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.RescanDevices.INSTANCE)) {
                String str = hatchDevicePairingMachineState.setUpAgainAddress;
                return rescanDevices(hatchDevicePairingMachineState.copy(hatchDevicePairingMachineState.ui, hatchDevicePairingMachineState.pendingLinkAction, hatchDevicePairingMachineState.linkOtaRepairState, str, AnonymousClass002.A1X(str)));
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.BleStateChanged) {
                return onBleStateChanged(hatchDevicePairingMachineState, (HatchDevicePairingEvent.BleStateChanged) hatchDevicePairingEvent);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.DevicesDiscovered) {
                return devicesDiscovered(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.DevicesDiscovered) hatchDevicePairingEvent).devices);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.ConnectToFoundDevice.INSTANCE)) {
                return connectToFoundDevice(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.SelectDevice) {
                return onDeviceTapped(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.SelectDevice) hatchDevicePairingEvent).address);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.ContinueAfterDeviceConnection.INSTANCE)) {
                return continueAfterDeviceConnection(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.RequestWifiRescan.INSTANCE)) {
                return requestWifiScan(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.WifiScanResult) {
                return onWifiScanResult(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.WifiScanResult) hatchDevicePairingEvent).networks);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.WifiScanError.INSTANCE)) {
                return onWifiScanError(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkPairingConfirmationRequired.INSTANCE)) {
                return onLinkPairingConfirmationRequired(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkPairingEstablishmentFinished) {
                HatchDevicePairingEvent.LinkPairingEstablishmentFinished linkPairingEstablishmentFinished = (HatchDevicePairingEvent.LinkPairingEstablishmentFinished) hatchDevicePairingEvent;
                return onLinkPairingEstablishmentFinished(hatchDevicePairingMachineState, linkPairingEstablishmentFinished.success, linkPairingEstablishmentFinished.wifiRequirement);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkPairingConfirmationTimedOut) {
                return onLinkPairingConfirmationTimedOut(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.LinkPairingConfirmationTimedOut) hatchDevicePairingEvent).awaitedButtonPress);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkSdkTokenFailed) {
                return onLinkSetupFailedWithDialog(hatchDevicePairingMachineState, HatchDevicePairingStateMachineKt.getPairingDialog(((HatchDevicePairingEvent.LinkSdkTokenFailed) hatchDevicePairingEvent).failure), false);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkSetupRefused) {
                return onLinkSetupFailedWithDialog(hatchDevicePairingMachineState, getPairingDialog(((HatchDevicePairingEvent.LinkSetupRefused) hatchDevicePairingEvent).refusal), zA1a);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkDeviceKeySetupFailed) {
                return onLinkDeviceKeySetupFailed(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.LinkDeviceKeySetupFailed) hatchDevicePairingEvent).failure);
            }
            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkOtaRoundTwoExpired.INSTANCE)) {
                return onLinkOtaRoundTwoExpired(hatchDevicePairingMachineState);
            }
            if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkDeviceKeyReplacementChanged) {
                hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, ((HatchDevicePairingEvent.LinkDeviceKeyReplacementChanged) hatchDevicePairingEvent).existing, null, false, 117440511, null);
            } else {
                if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkOtaRequested) {
                    return onLinkOtaRequested(hatchDevicePairingMachineState, (HatchDevicePairingEvent.LinkOtaRequested) hatchDevicePairingEvent);
                }
                if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkDisconnected.INSTANCE)) {
                    return onLinkDisconnected(hatchDevicePairingMachineState);
                }
                if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.LinkSetupHandoffFailed.INSTANCE)) {
                    return onLinkSetupHandoffFailed(hatchDevicePairingMachineState);
                }
                if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.SelectWifiNetwork) {
                    HatchDevicePairingEvent.SelectWifiNetwork selectWifiNetwork = (HatchDevicePairingEvent.SelectWifiNetwork) hatchDevicePairingEvent;
                    return selectWifiNetwork(hatchDevicePairingMachineState, selectWifiNetwork.ssid, selectWifiNetwork.savedPassword);
                }
                if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.SavedWifiNetworksChanged) {
                    hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, null, ((HatchDevicePairingEvent.SavedWifiNetworksChanged) hatchDevicePairingEvent).ssids, null, null, false, false, null, null, false, null, false, null, null, false, 134201343, null);
                } else {
                    if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.EnterManualWifiEntry.INSTANCE)) {
                        return enterManualWifiEntry(hatchDevicePairingMachineState);
                    }
                    if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.UpdateWifiSsid) {
                        hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, ((HatchDevicePairingEvent.UpdateWifiSsid) hatchDevicePairingEvent).ssid, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134213631, null);
                    } else if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.UpdateWifiPassword) {
                        hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, ((HatchDevicePairingEvent.UpdateWifiPassword) hatchDevicePairingEvent).password, null, null, null, false, false, null, null, false, null, false, null, null, false, 134209535, null);
                    } else {
                        if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.StartProvisioning.INSTANCE)) {
                            return startProvisioning(hatchDevicePairingMachineState);
                        }
                        if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.SkipWifi.INSTANCE)) {
                            return skipWifi(hatchDevicePairingMachineState);
                        }
                        if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkWifiScanRequestFinished) {
                            return onLinkWifiScanRequestFinished(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.LinkWifiScanRequestFinished) hatchDevicePairingEvent).success);
                        }
                        if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkProvisionRequestFinished) {
                            return onLinkProvisionRequestFinished(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.LinkProvisionRequestFinished) hatchDevicePairingEvent).success);
                        }
                        if (hatchDevicePairingEvent instanceof HatchDevicePairingEvent.ProvisioningStatusChanged) {
                            return onProvisioningStatusChanged(hatchDevicePairingMachineState, ((HatchDevicePairingEvent.ProvisioningStatusChanged) hatchDevicePairingEvent).status);
                        }
                        if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.GoBack.INSTANCE)) {
                            return goBack(hatchDevicePairingMachineState);
                        }
                        if (!hatchDevicePairingEvent.equals(HatchDevicePairingEvent.DismissDialog.INSTANCE)) {
                            if (hatchDevicePairingEvent.equals(HatchDevicePairingEvent.Cleared.INSTANCE)) {
                                return transition(C8j4.A0f(null, hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, HatchLinkOtaRepairState.Idle.INSTANCE), hatchDevicePairingMachineState.ui, HatchDevicePairingEffect.ResetLinkSetup.INSTANCE, HatchDevicePairingEffect.StopBle.INSTANCE);
                            }
                            throw C3cG.A0q();
                        }
                        hatchDevicePairingViewStateCopy$default = HatchDevicePairingViewState.copy$default(hatchDevicePairingMachineState.ui, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, false, false, null, null, false, null, false, null, null, false, 134184959, null);
                    }
                }
            }
        }
        return transition(hatchDevicePairingMachineState, hatchDevicePairingViewStateCopy$default, new HatchDevicePairingEffect[0]);
    }

    private final HatchDevicePairingDialog getPairingDialog(LinkSetupRefusal linkSetupRefusal) {
        int iOrdinal = linkSetupRefusal.ordinal();
        if (iOrdinal == 0) {
            return HatchDevicePairingDialog.GADGET_FIRMWARE_UPDATE_REQUIRED;
        }
        if (iOrdinal == 1) {
            return HatchDevicePairingDialog.BUTTON_PRESS_TIMED_OUT;
        }
        throw C3cG.A0q();
    }

    private final HatchDevicePairingTransition onLinkDeviceKeySetupFailed(HatchDevicePairingMachineState hatchDevicePairingMachineState, LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
        HatchDevicePairingDialog hatchDevicePairingDialog;
        switch (linkDeviceKeySetupFailure.ordinal()) {
            case 0:
                hatchDevicePairingDialog = HatchDevicePairingDialog.FIRMWARE_UPDATE_REQUIRED;
                break;
            case 1:
                hatchDevicePairingDialog = HatchDevicePairingDialog.CVM_UNSUPPORTED;
                break;
            case 2:
                return transition(hatchDevicePairingMachineState, hatchDevicePairingMachineState.ui, new HatchDevicePairingEffect[0]);
            case 3:
            case 5:
                hatchDevicePairingDialog = HatchDevicePairingDialog.DEVICE_ID_IN_USE;
                break;
            case 4:
                hatchDevicePairingDialog = null;
                break;
            case 6:
                hatchDevicePairingDialog = HatchDevicePairingDialog.PROVISIONING_FAILED;
                break;
            case 7:
                return onLinkOtaRoundTwoExpired(hatchDevicePairingMachineState);
            default:
                throw C3cG.A0q();
        }
        return onLinkSetupFailedWithDialog(hatchDevicePairingMachineState, hatchDevicePairingDialog, false);
    }

    private final HatchDevicePairingTransition transition(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingViewState hatchDevicePairingViewState, HatchDevicePairingEffect... hatchDevicePairingEffectArr) {
        HatchDevicePairingMachineState hatchDevicePairingMachineStateA0P = C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewState);
        return new HatchDevicePairingTransition(C8j5.A0P(hatchDevicePairingMachineStateA0P, hatchDevicePairingViewState), BFI.A0G(hatchDevicePairingEffectArr));
    }

    private final HatchDevicePairingTransition transition(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingViewState hatchDevicePairingViewState, List<? extends HatchDevicePairingEffect> list) {
        return new HatchDevicePairingTransition(C8j5.A0P(hatchDevicePairingMachineState, hatchDevicePairingViewState), list);
    }
}
