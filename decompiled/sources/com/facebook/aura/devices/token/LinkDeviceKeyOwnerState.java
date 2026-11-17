package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyOwnerState extends C06G {
    public final String connectedGatewayUrl;
    public final boolean cvmAuthenticationReady;
    public final String gatewayUrl;
    public final boolean handshakeConfidential;
    public final boolean handshakeProvenCvm;
    public final boolean handshakeStandard;
    public final String hatcheryVmId;
    public final boolean inventoryListsSelectedVm;
    public final String inventoryVmId;
    public final String inventoryVmUrl;
    public final boolean privateAuthActive;
    public final boolean vmHttpRoutedOverNoise;

    public LinkDeviceKeyOwnerState(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7) {
        C7384Etj.A0Y(str, 0);
        this.gatewayUrl = str;
        this.hatcheryVmId = str2;
        this.handshakeConfidential = z;
        this.handshakeStandard = z2;
        this.handshakeProvenCvm = z3;
        this.inventoryListsSelectedVm = z4;
        this.inventoryVmId = str3;
        this.inventoryVmUrl = str4;
        this.connectedGatewayUrl = str5;
        this.cvmAuthenticationReady = z5;
        this.privateAuthActive = z6;
        this.vmHttpRoutedOverNoise = z7;
    }

    public final LinkDeviceKeyOwnerState copy(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7) {
        C7384Etj.A0Y(str, 0);
        return new LinkDeviceKeyOwnerState(str, str2, z, z2, z3, z4, str3, str4, str5, z5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyOwnerState) {
                LinkDeviceKeyOwnerState linkDeviceKeyOwnerState = (LinkDeviceKeyOwnerState) obj;
                if (!C7384Etj.areEqual(this.gatewayUrl, linkDeviceKeyOwnerState.gatewayUrl) || !C7384Etj.areEqual(this.hatcheryVmId, linkDeviceKeyOwnerState.hatcheryVmId) || this.handshakeConfidential != linkDeviceKeyOwnerState.handshakeConfidential || this.handshakeStandard != linkDeviceKeyOwnerState.handshakeStandard || this.handshakeProvenCvm != linkDeviceKeyOwnerState.handshakeProvenCvm || this.inventoryListsSelectedVm != linkDeviceKeyOwnerState.inventoryListsSelectedVm || !C7384Etj.areEqual(this.inventoryVmId, linkDeviceKeyOwnerState.inventoryVmId) || !C7384Etj.areEqual(this.inventoryVmUrl, linkDeviceKeyOwnerState.inventoryVmUrl) || !C7384Etj.areEqual(this.connectedGatewayUrl, linkDeviceKeyOwnerState.connectedGatewayUrl) || this.cvmAuthenticationReady != linkDeviceKeyOwnerState.cvmAuthenticationReady || this.privateAuthActive != linkDeviceKeyOwnerState.privateAuthActive || this.vmHttpRoutedOverNoise != linkDeviceKeyOwnerState.vmHttpRoutedOverNoise) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyOwnerState copy$default(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyOwnerState.gatewayUrl;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyOwnerState.hatcheryVmId;
        }
        if ((i & 4) != 0) {
            z = linkDeviceKeyOwnerState.handshakeConfidential;
        }
        if ((i & 8) != 0) {
            z2 = linkDeviceKeyOwnerState.handshakeStandard;
        }
        if ((i & 16) != 0) {
            z3 = linkDeviceKeyOwnerState.handshakeProvenCvm;
        }
        if ((i & 32) != 0) {
            z4 = linkDeviceKeyOwnerState.inventoryListsSelectedVm;
        }
        if ((i & 64) != 0) {
            str3 = linkDeviceKeyOwnerState.inventoryVmId;
        }
        if ((i & 128) != 0) {
            str4 = linkDeviceKeyOwnerState.inventoryVmUrl;
        }
        if ((i & 256) != 0) {
            str5 = linkDeviceKeyOwnerState.connectedGatewayUrl;
        }
        if ((i & 512) != 0) {
            z5 = linkDeviceKeyOwnerState.cvmAuthenticationReady;
        }
        if ((i & 1024) != 0) {
            z6 = linkDeviceKeyOwnerState.privateAuthActive;
        }
        if ((i & 2048) != 0) {
            z7 = linkDeviceKeyOwnerState.vmHttpRoutedOverNoise;
        }
        return linkDeviceKeyOwnerState.copy(str, str2, z, z2, z3, z4, str3, str4, str5, z5, z6, z7);
    }

    public final String component1() {
        return this.gatewayUrl;
    }

    public final boolean component10() {
        return this.cvmAuthenticationReady;
    }

    public final boolean component11() {
        return this.privateAuthActive;
    }

    public final boolean component12() {
        return this.vmHttpRoutedOverNoise;
    }

    public final String component2() {
        return this.hatcheryVmId;
    }

    public final boolean component3() {
        return this.handshakeConfidential;
    }

    public final boolean component4() {
        return this.handshakeStandard;
    }

    public final boolean component5() {
        return this.handshakeProvenCvm;
    }

    public final boolean component6() {
        return this.inventoryListsSelectedVm;
    }

    public final String component7() {
        return this.inventoryVmId;
    }

    public final String component8() {
        return this.inventoryVmUrl;
    }

    public final String component9() {
        return this.connectedGatewayUrl;
    }

    public final String getConnectedGatewayUrl() {
        return this.connectedGatewayUrl;
    }

    public final boolean getCvmAuthenticationReady() {
        return this.cvmAuthenticationReady;
    }

    public final String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public final boolean getHandshakeConfidential() {
        return this.handshakeConfidential;
    }

    public final boolean getHandshakeProvenCvm() {
        return this.handshakeProvenCvm;
    }

    public final boolean getHandshakeStandard() {
        return this.handshakeStandard;
    }

    public final String getHatcheryVmId() {
        return this.hatcheryVmId;
    }

    public final boolean getInventoryListsSelectedVm() {
        return this.inventoryListsSelectedVm;
    }

    public final String getInventoryVmId() {
        return this.inventoryVmId;
    }

    public final String getInventoryVmUrl() {
        return this.inventoryVmUrl;
    }

    public final boolean getPrivateAuthActive() {
        return this.privateAuthActive;
    }

    public final boolean getVmHttpRoutedOverNoise() {
        return this.vmHttpRoutedOverNoise;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((((((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass001.A0G(this.gatewayUrl) + AnonymousClass006.A0G(this.hatcheryVmId)) * 31, this.handshakeConfidential), this.handshakeStandard), this.handshakeProvenCvm), this.inventoryListsSelectedVm) + AnonymousClass006.A0G(this.inventoryVmId)) * 31) + AnonymousClass006.A0G(this.inventoryVmUrl)) * 31) + AnonymousClass005.A0H(this.connectedGatewayUrl)) * 31, this.cvmAuthenticationReady), this.privateAuthActive), this.vmHttpRoutedOverNoise);
    }

    public String toString() {
        return super.toString();
    }
}
