package com.facebook.aura.devices.pairing;

import X.A3q;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class HatchDevicePairingViewState extends C06G implements HatchDevicePairingUiState {
    public static final int $stable = 8;
    public final boolean blePermissionsGranted;
    public final List<HatchDiscoveredDevice> discoveredDevices;
    public final boolean isDeveloperModeEnabled;
    public final boolean isInitialConnectionInProgress;
    public final boolean isManualWifiEntry;
    public final boolean isTokenOnlyProvisioning;
    public final boolean isWaitingForWifiScan;
    public final LinkAppConfirmationState linkAppConfirmation;
    public final Long linkConfirmationRequestId;
    public final LinkDeviceKeyRecord linkDeviceKeyReplacement;
    public final LinkDeviceVerification linkDeviceVerification;
    public final LinkWifiRequirement linkWifiRequirement;
    public final List<HatchDeviceWiFiNetwork> otherWifiNetworks;
    public final HatchDeviceBleState pairingBleState;
    public final HatchDevicePairingDialog pairingDialog;
    public final String pairingPresentationId;
    public final HatchDeviceProvisioningStatus pairingProvisioningStatus;
    public final HatchDevicePairingStep pairingStep;
    public final String pairingTargetName;
    public final boolean provisionedCommunityDevice;
    public final boolean provisioningWifiJoined;
    public final List<HatchDeviceWiFiNetwork> savedWifiNetworks;
    public final Set<String> savedWifiSsids;
    public final String selectedWifiSsid;
    public final boolean showPairingFlow;
    public final boolean showsDeveloperModeHint;
    public final List<HatchDeviceWiFiNetwork> wifiNetworks;
    public final String wifiPassword;
    public final boolean wifiScanFailed;

    public HatchDevicePairingViewState(boolean z, boolean z2, HatchDevicePairingStep hatchDevicePairingStep, HatchDeviceBleState hatchDeviceBleState, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, String str, List<HatchDiscoveredDevice> list, List<HatchDeviceWiFiNetwork> list2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, Set<String> set, HatchDevicePairingDialog hatchDevicePairingDialog, LinkDeviceVerification linkDeviceVerification, boolean z7, boolean z8, LinkAppConfirmationState linkAppConfirmationState, Long l, boolean z9, LinkWifiRequirement linkWifiRequirement, boolean z10, LinkDeviceKeyRecord linkDeviceKeyRecord, String str4, boolean z11) {
        AnonymousClass005.A12(hatchDevicePairingStep, hatchDeviceBleState, hatchDeviceProvisioningStatus, 2);
        AnonymousClass003.A10(list, list2);
        AnonymousClass002.A1H(str3, 13, set);
        C7384Etj.A0Y(linkWifiRequirement, 22);
        this.blePermissionsGranted = z;
        this.showPairingFlow = z2;
        this.pairingStep = hatchDevicePairingStep;
        this.pairingBleState = hatchDeviceBleState;
        this.pairingProvisioningStatus = hatchDeviceProvisioningStatus;
        this.pairingTargetName = str;
        this.discoveredDevices = list;
        this.wifiNetworks = list2;
        this.isWaitingForWifiScan = z3;
        this.wifiScanFailed = z4;
        this.isInitialConnectionInProgress = z5;
        this.isManualWifiEntry = z6;
        this.selectedWifiSsid = str2;
        this.wifiPassword = str3;
        this.savedWifiSsids = set;
        this.pairingDialog = hatchDevicePairingDialog;
        this.linkDeviceVerification = linkDeviceVerification;
        this.isDeveloperModeEnabled = z7;
        this.showsDeveloperModeHint = z8;
        this.linkAppConfirmation = linkAppConfirmationState;
        this.linkConfirmationRequestId = l;
        this.provisioningWifiJoined = z9;
        this.linkWifiRequirement = linkWifiRequirement;
        this.isTokenOnlyProvisioning = z10;
        this.linkDeviceKeyReplacement = linkDeviceKeyRecord;
        this.pairingPresentationId = str4;
        this.provisionedCommunityDevice = z11;
        List<HatchDeviceWiFiNetwork> wifiNetworks = getWifiNetworks();
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork : wifiNetworks) {
            if (this.savedWifiSsids.contains(hatchDeviceWiFiNetwork.ssid)) {
                arrayListA0h.add(hatchDeviceWiFiNetwork);
            }
        }
        this.savedWifiNetworks = arrayListA0h;
        List<HatchDeviceWiFiNetwork> wifiNetworks2 = getWifiNetworks();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork2 : wifiNetworks2) {
            if (!this.savedWifiSsids.contains(hatchDeviceWiFiNetwork2.ssid)) {
                arrayListA0h2.add(hatchDeviceWiFiNetwork2);
            }
        }
        this.otherWifiNetworks = arrayListA0h2;
    }

    public final HatchDevicePairingViewState copy(boolean z, boolean z2, HatchDevicePairingStep hatchDevicePairingStep, HatchDeviceBleState hatchDeviceBleState, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, String str, List<HatchDiscoveredDevice> list, List<HatchDeviceWiFiNetwork> list2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, Set<String> set, HatchDevicePairingDialog hatchDevicePairingDialog, LinkDeviceVerification linkDeviceVerification, boolean z7, boolean z8, LinkAppConfirmationState linkAppConfirmationState, Long l, boolean z9, LinkWifiRequirement linkWifiRequirement, boolean z10, LinkDeviceKeyRecord linkDeviceKeyRecord, String str4, boolean z11) {
        AnonymousClass005.A12(hatchDevicePairingStep, hatchDeviceBleState, hatchDeviceProvisioningStatus, 2);
        AnonymousClass003.A10(list, list2);
        AnonymousClass002.A1H(str3, 13, set);
        C7384Etj.A0Y(linkWifiRequirement, 22);
        return new HatchDevicePairingViewState(z, z2, hatchDevicePairingStep, hatchDeviceBleState, hatchDeviceProvisioningStatus, str, list, list2, z3, z4, z5, z6, str2, str3, set, hatchDevicePairingDialog, linkDeviceVerification, z7, z8, linkAppConfirmationState, l, z9, linkWifiRequirement, z10, linkDeviceKeyRecord, str4, z11);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDevicePairingViewState) {
                HatchDevicePairingViewState hatchDevicePairingViewState = (HatchDevicePairingViewState) obj;
                if (this.blePermissionsGranted != hatchDevicePairingViewState.blePermissionsGranted || this.showPairingFlow != hatchDevicePairingViewState.showPairingFlow || this.pairingStep != hatchDevicePairingViewState.pairingStep || this.pairingBleState != hatchDevicePairingViewState.pairingBleState || this.pairingProvisioningStatus != hatchDevicePairingViewState.pairingProvisioningStatus || !C7384Etj.areEqual(this.pairingTargetName, hatchDevicePairingViewState.pairingTargetName) || !C7384Etj.areEqual(this.discoveredDevices, hatchDevicePairingViewState.discoveredDevices) || !C7384Etj.areEqual(this.wifiNetworks, hatchDevicePairingViewState.wifiNetworks) || this.isWaitingForWifiScan != hatchDevicePairingViewState.isWaitingForWifiScan || this.wifiScanFailed != hatchDevicePairingViewState.wifiScanFailed || this.isInitialConnectionInProgress != hatchDevicePairingViewState.isInitialConnectionInProgress || this.isManualWifiEntry != hatchDevicePairingViewState.isManualWifiEntry || !C7384Etj.areEqual(this.selectedWifiSsid, hatchDevicePairingViewState.selectedWifiSsid) || !C7384Etj.areEqual(this.wifiPassword, hatchDevicePairingViewState.wifiPassword) || !C7384Etj.areEqual(this.savedWifiSsids, hatchDevicePairingViewState.savedWifiSsids) || this.pairingDialog != hatchDevicePairingViewState.pairingDialog || this.linkDeviceVerification != hatchDevicePairingViewState.linkDeviceVerification || this.isDeveloperModeEnabled != hatchDevicePairingViewState.isDeveloperModeEnabled || this.showsDeveloperModeHint != hatchDevicePairingViewState.showsDeveloperModeHint || this.linkAppConfirmation != hatchDevicePairingViewState.linkAppConfirmation || !C7384Etj.areEqual(this.linkConfirmationRequestId, hatchDevicePairingViewState.linkConfirmationRequestId) || this.provisioningWifiJoined != hatchDevicePairingViewState.provisioningWifiJoined || this.linkWifiRequirement != hatchDevicePairingViewState.linkWifiRequirement || this.isTokenOnlyProvisioning != hatchDevicePairingViewState.isTokenOnlyProvisioning || !C7384Etj.areEqual(this.linkDeviceKeyReplacement, hatchDevicePairingViewState.linkDeviceKeyReplacement) || !C7384Etj.areEqual(this.pairingPresentationId, hatchDevicePairingViewState.pairingPresentationId) || this.provisionedCommunityDevice != hatchDevicePairingViewState.provisionedCommunityDevice) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.blePermissionsGranted;
    }

    public final boolean component10() {
        return this.wifiScanFailed;
    }

    public final boolean component11() {
        return this.isInitialConnectionInProgress;
    }

    public final boolean component12() {
        return this.isManualWifiEntry;
    }

    public final String component13() {
        return this.selectedWifiSsid;
    }

    public final String component14() {
        return this.wifiPassword;
    }

    public final Set<String> component15() {
        return this.savedWifiSsids;
    }

    public final HatchDevicePairingDialog component16() {
        return this.pairingDialog;
    }

    public final LinkDeviceVerification component17() {
        return this.linkDeviceVerification;
    }

    public final boolean component18() {
        return this.isDeveloperModeEnabled;
    }

    public final boolean component19() {
        return this.showsDeveloperModeHint;
    }

    public final boolean component2() {
        return this.showPairingFlow;
    }

    public final LinkAppConfirmationState component20() {
        return this.linkAppConfirmation;
    }

    public final Long component21() {
        return this.linkConfirmationRequestId;
    }

    public final boolean component22() {
        return this.provisioningWifiJoined;
    }

    public final LinkWifiRequirement component23() {
        return this.linkWifiRequirement;
    }

    public final boolean component24() {
        return this.isTokenOnlyProvisioning;
    }

    public final LinkDeviceKeyRecord component25() {
        return this.linkDeviceKeyReplacement;
    }

    public final String component26() {
        return this.pairingPresentationId;
    }

    public final boolean component27() {
        return this.provisionedCommunityDevice;
    }

    public final HatchDevicePairingStep component3() {
        return this.pairingStep;
    }

    public final HatchDeviceBleState component4() {
        return this.pairingBleState;
    }

    public final HatchDeviceProvisioningStatus component5() {
        return this.pairingProvisioningStatus;
    }

    public final String component6() {
        return this.pairingTargetName;
    }

    public final List<HatchDiscoveredDevice> component7() {
        return this.discoveredDevices;
    }

    public final List<HatchDeviceWiFiNetwork> component8() {
        return this.wifiNetworks;
    }

    public final boolean component9() {
        return this.isWaitingForWifiScan;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean getBlePermissionsGranted() {
        return this.blePermissionsGranted;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public List<HatchDiscoveredDevice> getDiscoveredDevices() {
        return this.discoveredDevices;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public LinkAppConfirmationState getLinkAppConfirmation() {
        return this.linkAppConfirmation;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public Long getLinkConfirmationRequestId() {
        return this.linkConfirmationRequestId;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public LinkDeviceKeyRecord getLinkDeviceKeyReplacement() {
        return this.linkDeviceKeyReplacement;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public LinkDeviceVerification getLinkDeviceVerification() {
        return this.linkDeviceVerification;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public LinkWifiRequirement getLinkWifiRequirement() {
        return this.linkWifiRequirement;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public List<HatchDeviceWiFiNetwork> getOtherWifiNetworks() {
        return this.otherWifiNetworks;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public HatchDeviceBleState getPairingBleState() {
        return this.pairingBleState;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public HatchDevicePairingDialog getPairingDialog() {
        return this.pairingDialog;
    }

    public final String getPairingPresentationId() {
        return this.pairingPresentationId;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public HatchDeviceProvisioningStatus getPairingProvisioningStatus() {
        return this.pairingProvisioningStatus;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public HatchDevicePairingStep getPairingStep() {
        return this.pairingStep;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public String getPairingTargetName() {
        return this.pairingTargetName;
    }

    public final boolean getProvisionedCommunityDevice() {
        return this.provisionedCommunityDevice;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean getProvisioningWifiJoined() {
        return this.provisioningWifiJoined;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public List<HatchDeviceWiFiNetwork> getSavedWifiNetworks() {
        return this.savedWifiNetworks;
    }

    public final Set<String> getSavedWifiSsids() {
        return this.savedWifiSsids;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public String getSelectedWifiSsid() {
        return this.selectedWifiSsid;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean getShowPairingFlow() {
        return this.showPairingFlow;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean getShowsDeveloperModeHint() {
        return this.showsDeveloperModeHint;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public List<HatchDeviceWiFiNetwork> getWifiNetworks() {
        return this.wifiNetworks;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public String getWifiPassword() {
        return this.wifiPassword;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean getWifiScanFailed() {
        return this.wifiScanFailed;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01(AnonymousClass005.A0F(this.linkWifiRequirement, C0KA.A01((((C0KA.A01(C0KA.A01((((AnonymousClass005.A0F(this.savedWifiSsids, AnonymousClass005.A0I(this.wifiPassword, (C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.wifiNetworks, AnonymousClass005.A0F(this.discoveredDevices, (AnonymousClass005.A0F(this.pairingProvisioningStatus, AnonymousClass005.A0F(this.pairingBleState, AnonymousClass005.A0F(this.pairingStep, C0KA.A01(C0KA.A02(this.blePermissionsGranted), this.showPairingFlow)))) + AnonymousClass006.A0G(this.pairingTargetName)) * 31)), this.isWaitingForWifiScan), this.wifiScanFailed), this.isInitialConnectionInProgress), this.isManualWifiEntry) + AnonymousClass006.A0G(this.selectedWifiSsid)) * 31)) + AnonymousClass006.A0D(this.pairingDialog)) * 31) + AnonymousClass006.A0D(this.linkDeviceVerification)) * 31, this.isDeveloperModeEnabled), this.showsDeveloperModeHint) + AnonymousClass006.A0D(this.linkAppConfirmation)) * 31) + AnonymousClass006.A0D(this.linkConfirmationRequestId)) * 31, this.provisioningWifiJoined)), this.isTokenOnlyProvisioning) + AnonymousClass006.A0D(this.linkDeviceKeyReplacement)) * 31) + AnonymousClass005.A0H(this.pairingPresentationId)) * 31, this.provisionedCommunityDevice);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean isDeveloperModeEnabled() {
        return this.isDeveloperModeEnabled;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean isInitialConnectionInProgress() {
        return this.isInitialConnectionInProgress;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean isManualWifiEntry() {
        return this.isManualWifiEntry;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean isTokenOnlyProvisioning() {
        return this.isTokenOnlyProvisioning;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingUiState
    public boolean isWaitingForWifiScan() {
        return this.isWaitingForWifiScan;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchDevicePairingViewState copy$default(HatchDevicePairingViewState hatchDevicePairingViewState, boolean z, boolean z2, HatchDevicePairingStep hatchDevicePairingStep, HatchDeviceBleState hatchDeviceBleState, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, String str, List list, List list2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, Set set, HatchDevicePairingDialog hatchDevicePairingDialog, LinkDeviceVerification linkDeviceVerification, boolean z7, boolean z8, LinkAppConfirmationState linkAppConfirmationState, Long l, boolean z9, LinkWifiRequirement linkWifiRequirement, boolean z10, LinkDeviceKeyRecord linkDeviceKeyRecord, String str4, boolean z11, int i, Object obj) {
        boolean z12 = z;
        Set set2 = set;
        HatchDevicePairingDialog hatchDevicePairingDialog2 = hatchDevicePairingDialog;
        Long l2 = l;
        LinkWifiRequirement linkWifiRequirement2 = linkWifiRequirement;
        LinkDeviceKeyRecord linkDeviceKeyRecord2 = linkDeviceKeyRecord;
        String str5 = str4;
        LinkDeviceVerification linkDeviceVerification2 = linkDeviceVerification;
        boolean z13 = z7;
        boolean z14 = z8;
        LinkAppConfirmationState linkAppConfirmationState2 = linkAppConfirmationState;
        boolean z15 = z9;
        boolean z16 = z10;
        boolean z17 = z11;
        if ((i & 1) != 0) {
            z12 = hatchDevicePairingViewState.blePermissionsGranted;
        }
        if ((i & 2) != 0) {
            z2 = hatchDevicePairingViewState.showPairingFlow;
        }
        if ((i & 4) != 0) {
            hatchDevicePairingStep = hatchDevicePairingViewState.pairingStep;
        }
        if ((i & 8) != 0) {
            hatchDeviceBleState = hatchDevicePairingViewState.pairingBleState;
        }
        if ((i & 16) != 0) {
            hatchDeviceProvisioningStatus = hatchDevicePairingViewState.pairingProvisioningStatus;
        }
        if ((i & 32) != 0) {
            str = hatchDevicePairingViewState.pairingTargetName;
        }
        if ((i & 64) != 0) {
            list = hatchDevicePairingViewState.discoveredDevices;
        }
        if ((i & 128) != 0) {
            list2 = hatchDevicePairingViewState.wifiNetworks;
        }
        if ((i & 256) != 0) {
            z3 = hatchDevicePairingViewState.isWaitingForWifiScan;
        }
        if ((i & 512) != 0) {
            z4 = hatchDevicePairingViewState.wifiScanFailed;
        }
        if ((i & 1024) != 0) {
            z5 = hatchDevicePairingViewState.isInitialConnectionInProgress;
        }
        if ((i & 2048) != 0) {
            z6 = hatchDevicePairingViewState.isManualWifiEntry;
        }
        if ((i & 4096) != 0) {
            str2 = hatchDevicePairingViewState.selectedWifiSsid;
        }
        if ((i & 8192) != 0) {
            str3 = hatchDevicePairingViewState.wifiPassword;
        }
        if ((i & 16384) != 0) {
            set2 = hatchDevicePairingViewState.savedWifiSsids;
        }
        if ((i & 32768) != 0) {
            hatchDevicePairingDialog2 = hatchDevicePairingViewState.pairingDialog;
        }
        if ((i & 65536) != 0) {
            linkDeviceVerification2 = hatchDevicePairingViewState.linkDeviceVerification;
        }
        if ((i & 131072) != 0) {
            z13 = hatchDevicePairingViewState.isDeveloperModeEnabled;
        }
        if ((i & 262144) != 0) {
            z14 = hatchDevicePairingViewState.showsDeveloperModeHint;
        }
        if ((i & 524288) != 0) {
            linkAppConfirmationState2 = hatchDevicePairingViewState.linkAppConfirmation;
        }
        if ((i & 1048576) != 0) {
            l2 = hatchDevicePairingViewState.linkConfirmationRequestId;
        }
        if ((i & 2097152) != 0) {
            z15 = hatchDevicePairingViewState.provisioningWifiJoined;
        }
        if ((i & 4194304) != 0) {
            linkWifiRequirement2 = hatchDevicePairingViewState.linkWifiRequirement;
        }
        if ((i & 8388608) != 0) {
            z16 = hatchDevicePairingViewState.isTokenOnlyProvisioning;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            linkDeviceKeyRecord2 = hatchDevicePairingViewState.linkDeviceKeyReplacement;
        }
        if ((i & 33554432) != 0) {
            str5 = hatchDevicePairingViewState.pairingPresentationId;
        }
        if ((i & 67108864) != 0) {
            z17 = hatchDevicePairingViewState.provisionedCommunityDevice;
        }
        return hatchDevicePairingViewState.copy(z12, z2, hatchDevicePairingStep, hatchDeviceBleState, hatchDeviceProvisioningStatus, str, list, list2, z3, z4, z5, z6, str2, str3, set2, hatchDevicePairingDialog2, linkDeviceVerification2, z13, z14, linkAppConfirmationState2, l2, z15, linkWifiRequirement2, z16, linkDeviceKeyRecord2, str5, z17);
    }

    public /* synthetic */ HatchDevicePairingViewState(boolean z, boolean z2, HatchDevicePairingStep hatchDevicePairingStep, HatchDeviceBleState hatchDeviceBleState, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, String str, List list, List list2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, Set set, HatchDevicePairingDialog hatchDevicePairingDialog, LinkDeviceVerification linkDeviceVerification, boolean z7, boolean z8, LinkAppConfirmationState linkAppConfirmationState, Long l, boolean z9, LinkWifiRequirement linkWifiRequirement, boolean z10, LinkDeviceKeyRecord linkDeviceKeyRecord, String str4, boolean z11, int i, C06H c06h) {
        this(C3cG.A1K(i & 1, z), C3cG.A1K(i & 2, z2), (i & 4) != 0 ? HatchDevicePairingStep.BLE_SCAN : hatchDevicePairingStep, (i & 8) != 0 ? HatchDeviceBleState.IDLE : hatchDeviceBleState, (i & 16) != 0 ? HatchDeviceProvisioningStatus.IDLE : hatchDeviceProvisioningStatus, C3cG.A0e(str, i & 32), (i & 64) != 0 ? C0881AGi.A00 : list, (i & 128) != 0 ? C0881AGi.A00 : list2, C60Q.A1Q(i & 256, z3), C3cG.A1K(i & 512, z4), C3cG.A1K(i & 1024, z5), C3cG.A1K(i & 2048, z6), C3cG.A0e(str2, i & 4096), (i & 8192) != 0 ? "" : str3, (i & 16384) != 0 ? A3q.A00 : set, (i & 32768) != 0 ? null : hatchDevicePairingDialog, (i & 65536) != 0 ? null : linkDeviceVerification, C3cH.A1L(i, 131072, z7), C3cH.A1L(i, 262144, z8), (i & 524288) != 0 ? null : linkAppConfirmationState, (i & 1048576) != 0 ? null : l, C3cH.A1L(i, 2097152, z9), (i & 4194304) != 0 ? LinkWifiRequirement.REQUIRED : linkWifiRequirement, C3cH.A1L(i, 8388608, z10), (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : linkDeviceKeyRecord, C3cG.A0e(str4, i & 33554432), C3cH.A1L(i, 67108864, z11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDevicePairingViewState() {
        boolean z = false;
        this(z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 134217727, 0 == true ? 1 : 0);
    }
}
