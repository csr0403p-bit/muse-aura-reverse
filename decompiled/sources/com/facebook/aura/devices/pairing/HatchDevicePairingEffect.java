package com.facebook.aura.devices.pairing;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HatchDevicePairingEffect {

    public final class ConnectToDevice extends C06G implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public final String address;

        public ConnectToDevice(String str) {
            C7384Etj.A0Y(str, 0);
            this.address = str;
        }

        public final ConnectToDevice copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConnectToDevice(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectToDevice) && C7384Etj.areEqual(this.address, ((ConnectToDevice) obj).address));
        }

        public static /* synthetic */ ConnectToDevice copy$default(ConnectToDevice connectToDevice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectToDevice.address;
            }
            C7384Etj.A0Y(str, 0);
            return new ConnectToDevice(str);
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

    public final class ConnectToDiscovered implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public static final ConnectToDiscovered INSTANCE = new ConnectToDiscovered();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectToDiscovered);
        }

        public String toString() {
            return "ConnectToDiscovered";
        }

        public int hashCode() {
            return 784701961;
        }
    }

    public final class EstablishLinkPairing implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public static final EstablishLinkPairing INSTANCE = new EstablishLinkPairing();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EstablishLinkPairing);
        }

        public String toString() {
            return "EstablishLinkPairing";
        }

        public int hashCode() {
            return 595324185;
        }
    }

    public final class ProvisionLink extends C06G implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public final boolean allowOta;
        public final String password;
        public final String ssid;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ProvisionLink) {
                    ProvisionLink provisionLink = (ProvisionLink) obj;
                    if (!C7384Etj.areEqual(this.ssid, provisionLink.ssid) || !C7384Etj.areEqual(this.password, provisionLink.password) || this.allowOta != provisionLink.allowOta) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ProvisionLink copy$default(ProvisionLink provisionLink, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = provisionLink.ssid;
            }
            if ((i & 2) != 0) {
                str2 = provisionLink.password;
            }
            if ((i & 4) != 0) {
                z = provisionLink.allowOta;
            }
            return new ProvisionLink(str, str2, z);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String component2() {
            return this.password;
        }

        public final boolean component3() {
            return this.allowOta;
        }

        public final ProvisionLink copy(String str, String str2, boolean z) {
            return new ProvisionLink(str, str2, z);
        }

        public final boolean getAllowOta() {
            return this.allowOta;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return C0KA.A00(((AnonymousClass006.A0G(this.ssid) * 31) + AnonymousClass005.A0H(this.password)) * 31, this.allowOta);
        }

        public ProvisionLink(String str, String str2, boolean z) {
            this.ssid = str;
            this.password = str2;
            this.allowOta = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class RequestLinkWifiScan implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public static final RequestLinkWifiScan INSTANCE = new RequestLinkWifiScan();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestLinkWifiScan);
        }

        public String toString() {
            return "RequestLinkWifiScan";
        }

        public int hashCode() {
            return 456858199;
        }
    }

    public final class ResetLinkSetup implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public static final ResetLinkSetup INSTANCE = new ResetLinkSetup();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetLinkSetup);
        }

        public String toString() {
            return "ResetLinkSetup";
        }

        public int hashCode() {
            return -995453000;
        }
    }

    public final class StartBleScan implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public static final StartBleScan INSTANCE = new StartBleScan();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartBleScan);
        }

        public String toString() {
            return "StartBleScan";
        }

        public int hashCode() {
            return 67285594;
        }
    }

    public final class StopBle implements HatchDevicePairingEffect {
        public static final int $stable = 0;
        public static final StopBle INSTANCE = new StopBle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StopBle);
        }

        public String toString() {
            return "StopBle";
        }

        public int hashCode() {
            return 501592277;
        }
    }
}
