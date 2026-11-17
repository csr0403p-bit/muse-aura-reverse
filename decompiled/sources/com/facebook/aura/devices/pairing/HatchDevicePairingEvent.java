package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.devices.token.LinkSdkTokenFailure;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public interface HatchDevicePairingEvent {

    public final class BlePermissionsChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean granted;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BlePermissionsChanged) && this.granted == ((BlePermissionsChanged) obj).granted);
        }

        public static /* synthetic */ BlePermissionsChanged copy$default(BlePermissionsChanged blePermissionsChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = blePermissionsChanged.granted;
            }
            return new BlePermissionsChanged(z);
        }

        public final boolean component1() {
            return this.granted;
        }

        public final BlePermissionsChanged copy(boolean z) {
            return new BlePermissionsChanged(z);
        }

        public final boolean getGranted() {
            return this.granted;
        }

        public int hashCode() {
            return this.granted ? 1231 : 1237;
        }

        public BlePermissionsChanged(boolean z) {
            this.granted = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class BleStateChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String detail;
        public final HatchDeviceBleState state;

        public BleStateChanged(HatchDeviceBleState hatchDeviceBleState, String str) {
            C7384Etj.A0Y(hatchDeviceBleState, 0);
            this.state = hatchDeviceBleState;
            this.detail = str;
        }

        public final BleStateChanged copy(HatchDeviceBleState hatchDeviceBleState, String str) {
            C7384Etj.A0Y(hatchDeviceBleState, 0);
            return new BleStateChanged(hatchDeviceBleState, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BleStateChanged) {
                    BleStateChanged bleStateChanged = (BleStateChanged) obj;
                    if (this.state != bleStateChanged.state || !C7384Etj.areEqual(this.detail, bleStateChanged.detail)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ BleStateChanged copy$default(BleStateChanged bleStateChanged, HatchDeviceBleState hatchDeviceBleState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchDeviceBleState = bleStateChanged.state;
            }
            if ((i & 2) != 0) {
                str = bleStateChanged.detail;
            }
            C7384Etj.A0Y(hatchDeviceBleState, 0);
            return new BleStateChanged(hatchDeviceBleState, str);
        }

        public final HatchDeviceBleState component1() {
            return this.state;
        }

        public final String component2() {
            return this.detail;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final HatchDeviceBleState getState() {
            return this.state;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.state) + AnonymousClass006.A0G(this.detail);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Cleared implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final Cleared INSTANCE = new Cleared();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cleared);
        }

        public String toString() {
            return "Cleared";
        }

        public int hashCode() {
            return 1038125759;
        }
    }

    public final class ConnectToFoundDevice implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final ConnectToFoundDevice INSTANCE = new ConnectToFoundDevice();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectToFoundDevice);
        }

        public String toString() {
            return "ConnectToFoundDevice";
        }

        public int hashCode() {
            return -2030831104;
        }
    }

    public final class ContinueAfterDeviceConnection implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final ContinueAfterDeviceConnection INSTANCE = new ContinueAfterDeviceConnection();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueAfterDeviceConnection);
        }

        public String toString() {
            return "ContinueAfterDeviceConnection";
        }

        public int hashCode() {
            return 1406844988;
        }
    }

    public final class DeveloperModeChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean enabled;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DeveloperModeChanged) && this.enabled == ((DeveloperModeChanged) obj).enabled);
        }

        public static /* synthetic */ DeveloperModeChanged copy$default(DeveloperModeChanged developerModeChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = developerModeChanged.enabled;
            }
            return new DeveloperModeChanged(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final DeveloperModeChanged copy(boolean z) {
            return new DeveloperModeChanged(z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            return this.enabled ? 1231 : 1237;
        }

        public DeveloperModeChanged(boolean z) {
            this.enabled = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DeveloperModeHintChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean shows;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DeveloperModeHintChanged) && this.shows == ((DeveloperModeHintChanged) obj).shows);
        }

        public static /* synthetic */ DeveloperModeHintChanged copy$default(DeveloperModeHintChanged developerModeHintChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = developerModeHintChanged.shows;
            }
            return new DeveloperModeHintChanged(z);
        }

        public final boolean component1() {
            return this.shows;
        }

        public final DeveloperModeHintChanged copy(boolean z) {
            return new DeveloperModeHintChanged(z);
        }

        public final boolean getShows() {
            return this.shows;
        }

        public int hashCode() {
            return this.shows ? 1231 : 1237;
        }

        public DeveloperModeHintChanged(boolean z) {
            this.shows = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DevicesDiscovered extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 8;
        public final List<HatchDiscoveredDevice> devices;

        public DevicesDiscovered(List<HatchDiscoveredDevice> list) {
            C7384Etj.A0Y(list, 0);
            this.devices = list;
        }

        public final DevicesDiscovered copy(List<HatchDiscoveredDevice> list) {
            C7384Etj.A0Y(list, 0);
            return new DevicesDiscovered(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DevicesDiscovered) && C7384Etj.areEqual(this.devices, ((DevicesDiscovered) obj).devices));
        }

        public static /* synthetic */ DevicesDiscovered copy$default(DevicesDiscovered devicesDiscovered, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = devicesDiscovered.devices;
            }
            C7384Etj.A0Y(list, 0);
            return new DevicesDiscovered(list);
        }

        public final List<HatchDiscoveredDevice> component1() {
            return this.devices;
        }

        public final List<HatchDiscoveredDevice> getDevices() {
            return this.devices;
        }

        public int hashCode() {
            return this.devices.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DismissDialog implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final DismissDialog INSTANCE = new DismissDialog();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public String toString() {
            return "DismissDialog";
        }

        public int hashCode() {
            return 1683839301;
        }
    }

    public final class DismissFlow implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final DismissFlow INSTANCE = new DismissFlow();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissFlow);
        }

        public String toString() {
            return "DismissFlow";
        }

        public int hashCode() {
            return -534497173;
        }
    }

    public final class EnterManualWifiEntry implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final EnterManualWifiEntry INSTANCE = new EnterManualWifiEntry();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterManualWifiEntry);
        }

        public String toString() {
            return "EnterManualWifiEntry";
        }

        public int hashCode() {
            return -997164276;
        }
    }

    public final class GoBack implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final GoBack INSTANCE = new GoBack();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public String toString() {
            return "GoBack";
        }

        public int hashCode() {
            return 703921276;
        }
    }

    public final class LinkAppConfirmationChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final LinkAppConfirmationState confirmation;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkAppConfirmationChanged) && this.confirmation == ((LinkAppConfirmationChanged) obj).confirmation);
        }

        public static /* synthetic */ LinkAppConfirmationChanged copy$default(LinkAppConfirmationChanged linkAppConfirmationChanged, LinkAppConfirmationState linkAppConfirmationState, int i, Object obj) {
            if ((i & 1) != 0) {
                linkAppConfirmationState = linkAppConfirmationChanged.confirmation;
            }
            return new LinkAppConfirmationChanged(linkAppConfirmationState);
        }

        public final LinkAppConfirmationState component1() {
            return this.confirmation;
        }

        public final LinkAppConfirmationChanged copy(LinkAppConfirmationState linkAppConfirmationState) {
            return new LinkAppConfirmationChanged(linkAppConfirmationState);
        }

        public final LinkAppConfirmationState getConfirmation() {
            return this.confirmation;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.confirmation);
        }

        public LinkAppConfirmationChanged(LinkAppConfirmationState linkAppConfirmationState) {
            this.confirmation = linkAppConfirmationState;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkConfirmationRequested extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final long requestId;
        public final HatchDevicePairingStep step;

        public LinkConfirmationRequested(long j, HatchDevicePairingStep hatchDevicePairingStep) {
            C7384Etj.A0Y(hatchDevicePairingStep, 1);
            this.requestId = j;
            this.step = hatchDevicePairingStep;
        }

        public final LinkConfirmationRequested copy(long j, HatchDevicePairingStep hatchDevicePairingStep) {
            C7384Etj.A0Y(hatchDevicePairingStep, 1);
            return new LinkConfirmationRequested(j, hatchDevicePairingStep);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LinkConfirmationRequested) {
                    LinkConfirmationRequested linkConfirmationRequested = (LinkConfirmationRequested) obj;
                    if (this.requestId != linkConfirmationRequested.requestId || this.step != linkConfirmationRequested.step) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LinkConfirmationRequested copy$default(LinkConfirmationRequested linkConfirmationRequested, long j, HatchDevicePairingStep hatchDevicePairingStep, int i, Object obj) {
            if ((i & 1) != 0) {
                j = linkConfirmationRequested.requestId;
            }
            if ((i & 2) != 0) {
                hatchDevicePairingStep = linkConfirmationRequested.step;
            }
            C7384Etj.A0Y(hatchDevicePairingStep, 1);
            return new LinkConfirmationRequested(j, hatchDevicePairingStep);
        }

        public final long component1() {
            return this.requestId;
        }

        public final HatchDevicePairingStep component2() {
            return this.step;
        }

        public final long getRequestId() {
            return this.requestId;
        }

        public final HatchDevicePairingStep getStep() {
            return this.step;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.step, C3cI.A01(this.requestId));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkDeviceKeyReplacementChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 8;
        public final LinkDeviceKeyRecord existing;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkDeviceKeyReplacementChanged) && C7384Etj.areEqual(this.existing, ((LinkDeviceKeyReplacementChanged) obj).existing));
        }

        public static /* synthetic */ LinkDeviceKeyReplacementChanged copy$default(LinkDeviceKeyReplacementChanged linkDeviceKeyReplacementChanged, LinkDeviceKeyRecord linkDeviceKeyRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeyRecord = linkDeviceKeyReplacementChanged.existing;
            }
            return new LinkDeviceKeyReplacementChanged(linkDeviceKeyRecord);
        }

        public final LinkDeviceKeyRecord component1() {
            return this.existing;
        }

        public final LinkDeviceKeyReplacementChanged copy(LinkDeviceKeyRecord linkDeviceKeyRecord) {
            return new LinkDeviceKeyReplacementChanged(linkDeviceKeyRecord);
        }

        public final LinkDeviceKeyRecord getExisting() {
            return this.existing;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.existing);
        }

        public LinkDeviceKeyReplacementChanged(LinkDeviceKeyRecord linkDeviceKeyRecord) {
            this.existing = linkDeviceKeyRecord;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkDeviceKeySetupFailed extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final LinkDeviceKeySetupFailure failure;

        public LinkDeviceKeySetupFailed(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            this.failure = linkDeviceKeySetupFailure;
        }

        public final LinkDeviceKeySetupFailed copy(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            return new LinkDeviceKeySetupFailed(linkDeviceKeySetupFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkDeviceKeySetupFailed) && this.failure == ((LinkDeviceKeySetupFailed) obj).failure);
        }

        public static /* synthetic */ LinkDeviceKeySetupFailed copy$default(LinkDeviceKeySetupFailed linkDeviceKeySetupFailed, LinkDeviceKeySetupFailure linkDeviceKeySetupFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeySetupFailure = linkDeviceKeySetupFailed.failure;
            }
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            return new LinkDeviceKeySetupFailed(linkDeviceKeySetupFailure);
        }

        public final LinkDeviceKeySetupFailure component1() {
            return this.failure;
        }

        public final LinkDeviceKeySetupFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkDeviceVerificationChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final LinkDeviceVerification verification;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkDeviceVerificationChanged) && this.verification == ((LinkDeviceVerificationChanged) obj).verification);
        }

        public static /* synthetic */ LinkDeviceVerificationChanged copy$default(LinkDeviceVerificationChanged linkDeviceVerificationChanged, LinkDeviceVerification linkDeviceVerification, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceVerification = linkDeviceVerificationChanged.verification;
            }
            return new LinkDeviceVerificationChanged(linkDeviceVerification);
        }

        public final LinkDeviceVerification component1() {
            return this.verification;
        }

        public final LinkDeviceVerificationChanged copy(LinkDeviceVerification linkDeviceVerification) {
            return new LinkDeviceVerificationChanged(linkDeviceVerification);
        }

        public final LinkDeviceVerification getVerification() {
            return this.verification;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.verification);
        }

        public LinkDeviceVerificationChanged(LinkDeviceVerification linkDeviceVerification) {
            this.verification = linkDeviceVerification;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkDisconnected implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final LinkDisconnected INSTANCE = new LinkDisconnected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkDisconnected);
        }

        public String toString() {
            return "LinkDisconnected";
        }

        public int hashCode() {
            return 2043521442;
        }
    }

    public final class LinkInfoAcknowledged implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final LinkInfoAcknowledged INSTANCE = new LinkInfoAcknowledged();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkInfoAcknowledged);
        }

        public String toString() {
            return "LinkInfoAcknowledged";
        }

        public int hashCode() {
            return 469468413;
        }
    }

    public final class LinkOtaRequested extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String password;
        public final String ssid;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LinkOtaRequested) {
                    LinkOtaRequested linkOtaRequested = (LinkOtaRequested) obj;
                    if (!C7384Etj.areEqual(this.ssid, linkOtaRequested.ssid) || !C7384Etj.areEqual(this.password, linkOtaRequested.password)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LinkOtaRequested copy$default(LinkOtaRequested linkOtaRequested, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkOtaRequested.ssid;
            }
            if ((i & 2) != 0) {
                str2 = linkOtaRequested.password;
            }
            AnonymousClass003.A0u(str, str2);
            return new LinkOtaRequested(str, str2);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String component2() {
            return this.password;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.password, AnonymousClass001.A0G(this.ssid));
        }

        public LinkOtaRequested(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.ssid = str;
            this.password = str2;
        }

        public final LinkOtaRequested copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new LinkOtaRequested(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkOtaRoundTwoExpired implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final LinkOtaRoundTwoExpired INSTANCE = new LinkOtaRoundTwoExpired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkOtaRoundTwoExpired);
        }

        public String toString() {
            return "LinkOtaRoundTwoExpired";
        }

        public int hashCode() {
            return -1881799982;
        }
    }

    public final class LinkPairingConfirmationRequired implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final LinkPairingConfirmationRequired INSTANCE = new LinkPairingConfirmationRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkPairingConfirmationRequired);
        }

        public String toString() {
            return "LinkPairingConfirmationRequired";
        }

        public int hashCode() {
            return -359723115;
        }
    }

    public final class LinkPairingConfirmationTimedOut extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean awaitedButtonPress;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkPairingConfirmationTimedOut) && this.awaitedButtonPress == ((LinkPairingConfirmationTimedOut) obj).awaitedButtonPress);
        }

        public static /* synthetic */ LinkPairingConfirmationTimedOut copy$default(LinkPairingConfirmationTimedOut linkPairingConfirmationTimedOut, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = linkPairingConfirmationTimedOut.awaitedButtonPress;
            }
            return new LinkPairingConfirmationTimedOut(z);
        }

        public final boolean component1() {
            return this.awaitedButtonPress;
        }

        public final LinkPairingConfirmationTimedOut copy(boolean z) {
            return new LinkPairingConfirmationTimedOut(z);
        }

        public final boolean getAwaitedButtonPress() {
            return this.awaitedButtonPress;
        }

        public int hashCode() {
            return this.awaitedButtonPress ? 1231 : 1237;
        }

        public LinkPairingConfirmationTimedOut(boolean z) {
            this.awaitedButtonPress = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkPairingEstablishmentFinished extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean success;
        public final LinkWifiRequirement wifiRequirement;

        public LinkPairingEstablishmentFinished(boolean z, LinkWifiRequirement linkWifiRequirement) {
            C7384Etj.A0Y(linkWifiRequirement, 1);
            this.success = z;
            this.wifiRequirement = linkWifiRequirement;
        }

        public final LinkPairingEstablishmentFinished copy(boolean z, LinkWifiRequirement linkWifiRequirement) {
            C7384Etj.A0Y(linkWifiRequirement, 1);
            return new LinkPairingEstablishmentFinished(z, linkWifiRequirement);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LinkPairingEstablishmentFinished) {
                    LinkPairingEstablishmentFinished linkPairingEstablishmentFinished = (LinkPairingEstablishmentFinished) obj;
                    if (this.success != linkPairingEstablishmentFinished.success || this.wifiRequirement != linkPairingEstablishmentFinished.wifiRequirement) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LinkPairingEstablishmentFinished copy$default(LinkPairingEstablishmentFinished linkPairingEstablishmentFinished, boolean z, LinkWifiRequirement linkWifiRequirement, int i, Object obj) {
            if ((i & 1) != 0) {
                z = linkPairingEstablishmentFinished.success;
            }
            if ((i & 2) != 0) {
                linkWifiRequirement = linkPairingEstablishmentFinished.wifiRequirement;
            }
            C7384Etj.A0Y(linkWifiRequirement, 1);
            return new LinkPairingEstablishmentFinished(z, linkWifiRequirement);
        }

        public final boolean component1() {
            return this.success;
        }

        public final LinkWifiRequirement component2() {
            return this.wifiRequirement;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final LinkWifiRequirement getWifiRequirement() {
            return this.wifiRequirement;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.wifiRequirement, C0KA.A02(this.success));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkProvisionRequestFinished extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean success;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkProvisionRequestFinished) && this.success == ((LinkProvisionRequestFinished) obj).success);
        }

        public static /* synthetic */ LinkProvisionRequestFinished copy$default(LinkProvisionRequestFinished linkProvisionRequestFinished, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = linkProvisionRequestFinished.success;
            }
            return new LinkProvisionRequestFinished(z);
        }

        public final boolean component1() {
            return this.success;
        }

        public final LinkProvisionRequestFinished copy(boolean z) {
            return new LinkProvisionRequestFinished(z);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.success ? 1231 : 1237;
        }

        public LinkProvisionRequestFinished(boolean z) {
            this.success = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkSdkTokenFailed extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final LinkSdkTokenFailure failure;

        public LinkSdkTokenFailed(LinkSdkTokenFailure linkSdkTokenFailure) {
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            this.failure = linkSdkTokenFailure;
        }

        public final LinkSdkTokenFailed copy(LinkSdkTokenFailure linkSdkTokenFailure) {
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            return new LinkSdkTokenFailed(linkSdkTokenFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkSdkTokenFailed) && this.failure == ((LinkSdkTokenFailed) obj).failure);
        }

        public static /* synthetic */ LinkSdkTokenFailed copy$default(LinkSdkTokenFailed linkSdkTokenFailed, LinkSdkTokenFailure linkSdkTokenFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                linkSdkTokenFailure = linkSdkTokenFailed.failure;
            }
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            return new LinkSdkTokenFailed(linkSdkTokenFailure);
        }

        public final LinkSdkTokenFailure component1() {
            return this.failure;
        }

        public final LinkSdkTokenFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkSetupHandoffFailed implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final LinkSetupHandoffFailed INSTANCE = new LinkSetupHandoffFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkSetupHandoffFailed);
        }

        public String toString() {
            return "LinkSetupHandoffFailed";
        }

        public int hashCode() {
            return -942889561;
        }
    }

    public final class LinkSetupRefused extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final LinkSetupRefusal refusal;

        public LinkSetupRefused(LinkSetupRefusal linkSetupRefusal) {
            C7384Etj.A0Y(linkSetupRefusal, 0);
            this.refusal = linkSetupRefusal;
        }

        public final LinkSetupRefused copy(LinkSetupRefusal linkSetupRefusal) {
            C7384Etj.A0Y(linkSetupRefusal, 0);
            return new LinkSetupRefused(linkSetupRefusal);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkSetupRefused) && this.refusal == ((LinkSetupRefused) obj).refusal);
        }

        public static /* synthetic */ LinkSetupRefused copy$default(LinkSetupRefused linkSetupRefused, LinkSetupRefusal linkSetupRefusal, int i, Object obj) {
            if ((i & 1) != 0) {
                linkSetupRefusal = linkSetupRefused.refusal;
            }
            C7384Etj.A0Y(linkSetupRefusal, 0);
            return new LinkSetupRefused(linkSetupRefusal);
        }

        public final LinkSetupRefusal component1() {
            return this.refusal;
        }

        public final LinkSetupRefusal getRefusal() {
            return this.refusal;
        }

        public int hashCode() {
            return this.refusal.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkWifiScanRequestFinished extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final boolean success;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkWifiScanRequestFinished) && this.success == ((LinkWifiScanRequestFinished) obj).success);
        }

        public static /* synthetic */ LinkWifiScanRequestFinished copy$default(LinkWifiScanRequestFinished linkWifiScanRequestFinished, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = linkWifiScanRequestFinished.success;
            }
            return new LinkWifiScanRequestFinished(z);
        }

        public final boolean component1() {
            return this.success;
        }

        public final LinkWifiScanRequestFinished copy(boolean z) {
            return new LinkWifiScanRequestFinished(z);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.success ? 1231 : 1237;
        }

        public LinkWifiScanRequestFinished(boolean z) {
            this.success = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ProvisioningStatusChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final HatchDeviceProvisioningStatus status;

        public ProvisioningStatusChanged(HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus) {
            C7384Etj.A0Y(hatchDeviceProvisioningStatus, 0);
            this.status = hatchDeviceProvisioningStatus;
        }

        public final ProvisioningStatusChanged copy(HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus) {
            C7384Etj.A0Y(hatchDeviceProvisioningStatus, 0);
            return new ProvisioningStatusChanged(hatchDeviceProvisioningStatus);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ProvisioningStatusChanged) && this.status == ((ProvisioningStatusChanged) obj).status);
        }

        public static /* synthetic */ ProvisioningStatusChanged copy$default(ProvisioningStatusChanged provisioningStatusChanged, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchDeviceProvisioningStatus = provisioningStatusChanged.status;
            }
            C7384Etj.A0Y(hatchDeviceProvisioningStatus, 0);
            return new ProvisioningStatusChanged(hatchDeviceProvisioningStatus);
        }

        public final HatchDeviceProvisioningStatus component1() {
            return this.status;
        }

        public final HatchDeviceProvisioningStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class RequestWifiRescan implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final RequestWifiRescan INSTANCE = new RequestWifiRescan();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestWifiRescan);
        }

        public String toString() {
            return "RequestWifiRescan";
        }

        public int hashCode() {
            return 1235979751;
        }
    }

    public final class RescanDevices implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final RescanDevices INSTANCE = new RescanDevices();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RescanDevices);
        }

        public String toString() {
            return "RescanDevices";
        }

        public int hashCode() {
            return -1625352096;
        }
    }

    public final class SavedWifiNetworksChanged extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 8;
        public final Set<String> ssids;

        public SavedWifiNetworksChanged(Set<String> set) {
            C7384Etj.A0Y(set, 0);
            this.ssids = set;
        }

        public final SavedWifiNetworksChanged copy(Set<String> set) {
            C7384Etj.A0Y(set, 0);
            return new SavedWifiNetworksChanged(set);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SavedWifiNetworksChanged) && C7384Etj.areEqual(this.ssids, ((SavedWifiNetworksChanged) obj).ssids));
        }

        public static /* synthetic */ SavedWifiNetworksChanged copy$default(SavedWifiNetworksChanged savedWifiNetworksChanged, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = savedWifiNetworksChanged.ssids;
            }
            C7384Etj.A0Y(set, 0);
            return new SavedWifiNetworksChanged(set);
        }

        public final Set<String> component1() {
            return this.ssids;
        }

        public final Set<String> getSsids() {
            return this.ssids;
        }

        public int hashCode() {
            return this.ssids.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SelectDevice extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String address;

        public SelectDevice(String str) {
            C7384Etj.A0Y(str, 0);
            this.address = str;
        }

        public final SelectDevice copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SelectDevice(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SelectDevice) && C7384Etj.areEqual(this.address, ((SelectDevice) obj).address));
        }

        public static /* synthetic */ SelectDevice copy$default(SelectDevice selectDevice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectDevice.address;
            }
            C7384Etj.A0Y(str, 0);
            return new SelectDevice(str);
        }

        public final String component1() {
            return this.address;
        }

        public final String getAddress() {
            return this.address;
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SelectWifiNetwork extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String savedPassword;
        public final String ssid;

        public SelectWifiNetwork(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.ssid = str;
            this.savedPassword = str2;
        }

        public final SelectWifiNetwork copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new SelectWifiNetwork(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SelectWifiNetwork) {
                    SelectWifiNetwork selectWifiNetwork = (SelectWifiNetwork) obj;
                    if (!C7384Etj.areEqual(this.ssid, selectWifiNetwork.ssid) || !C7384Etj.areEqual(this.savedPassword, selectWifiNetwork.savedPassword)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SelectWifiNetwork copy$default(SelectWifiNetwork selectWifiNetwork, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectWifiNetwork.ssid;
            }
            if ((i & 2) != 0) {
                str2 = selectWifiNetwork.savedPassword;
            }
            C7384Etj.A0Y(str, 0);
            return new SelectWifiNetwork(str, str2);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String component2() {
            return this.savedPassword;
        }

        public final String getSavedPassword() {
            return this.savedPassword;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.ssid) + AnonymousClass006.A0G(this.savedPassword);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShowFlow extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String presentationId;
        public final String setUpAgainAddress;

        public ShowFlow(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.presentationId = str;
            this.setUpAgainAddress = str2;
        }

        public final ShowFlow copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new ShowFlow(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShowFlow) {
                    ShowFlow showFlow = (ShowFlow) obj;
                    if (!C7384Etj.areEqual(this.presentationId, showFlow.presentationId) || !C7384Etj.areEqual(this.setUpAgainAddress, showFlow.setUpAgainAddress)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ShowFlow copy$default(ShowFlow showFlow, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showFlow.presentationId;
            }
            if ((i & 2) != 0) {
                str2 = showFlow.setUpAgainAddress;
            }
            C7384Etj.A0Y(str, 0);
            return new ShowFlow(str, str2);
        }

        public final String component1() {
            return this.presentationId;
        }

        public final String component2() {
            return this.setUpAgainAddress;
        }

        public final String getPresentationId() {
            return this.presentationId;
        }

        public final String getSetUpAgainAddress() {
            return this.setUpAgainAddress;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.presentationId) + AnonymousClass006.A0G(this.setUpAgainAddress);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SkipWifi implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final SkipWifi INSTANCE = new SkipWifi();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipWifi);
        }

        public String toString() {
            return "SkipWifi";
        }

        public int hashCode() {
            return -822612863;
        }
    }

    public final class StartBleScan implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final StartBleScan INSTANCE = new StartBleScan();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartBleScan);
        }

        public String toString() {
            return "StartBleScan";
        }

        public int hashCode() {
            return 35545219;
        }
    }

    public final class StartProvisioning implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final StartProvisioning INSTANCE = new StartProvisioning();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartProvisioning);
        }

        public String toString() {
            return "StartProvisioning";
        }

        public int hashCode() {
            return 804524994;
        }
    }

    public final class UpdateWifiPassword extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String password;

        public UpdateWifiPassword(String str) {
            C7384Etj.A0Y(str, 0);
            this.password = str;
        }

        public final UpdateWifiPassword copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new UpdateWifiPassword(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof UpdateWifiPassword) && C7384Etj.areEqual(this.password, ((UpdateWifiPassword) obj).password));
        }

        public static /* synthetic */ UpdateWifiPassword copy$default(UpdateWifiPassword updateWifiPassword, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateWifiPassword.password;
            }
            C7384Etj.A0Y(str, 0);
            return new UpdateWifiPassword(str);
        }

        public final String component1() {
            return this.password;
        }

        public final String getPassword() {
            return this.password;
        }

        public int hashCode() {
            return this.password.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UpdateWifiSsid extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public final String ssid;

        public UpdateWifiSsid(String str) {
            C7384Etj.A0Y(str, 0);
            this.ssid = str;
        }

        public final UpdateWifiSsid copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new UpdateWifiSsid(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof UpdateWifiSsid) && C7384Etj.areEqual(this.ssid, ((UpdateWifiSsid) obj).ssid));
        }

        public static /* synthetic */ UpdateWifiSsid copy$default(UpdateWifiSsid updateWifiSsid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateWifiSsid.ssid;
            }
            C7384Etj.A0Y(str, 0);
            return new UpdateWifiSsid(str);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return this.ssid.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class WifiScanError implements HatchDevicePairingEvent {
        public static final int $stable = 0;
        public static final WifiScanError INSTANCE = new WifiScanError();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WifiScanError);
        }

        public String toString() {
            return "WifiScanError";
        }

        public int hashCode() {
            return 149391049;
        }
    }

    public final class WifiScanResult extends C06G implements HatchDevicePairingEvent {
        public static final int $stable = 8;
        public final List<HatchDeviceWiFiNetwork> networks;

        public WifiScanResult(List<HatchDeviceWiFiNetwork> list) {
            C7384Etj.A0Y(list, 0);
            this.networks = list;
        }

        public final WifiScanResult copy(List<HatchDeviceWiFiNetwork> list) {
            C7384Etj.A0Y(list, 0);
            return new WifiScanResult(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof WifiScanResult) && C7384Etj.areEqual(this.networks, ((WifiScanResult) obj).networks));
        }

        public static /* synthetic */ WifiScanResult copy$default(WifiScanResult wifiScanResult, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = wifiScanResult.networks;
            }
            C7384Etj.A0Y(list, 0);
            return new WifiScanResult(list);
        }

        public final List<HatchDeviceWiFiNetwork> component1() {
            return this.networks;
        }

        public final List<HatchDeviceWiFiNetwork> getNetworks() {
            return this.networks;
        }

        public int hashCode() {
            return this.networks.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
