package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class LinkDeviceInfo extends C06G {
    public static final int $stable = 8;
    public final List<String> cipherSuites;
    public final Boolean cvmSupported;
    public final String deviceId;
    public final int deviceKeyAuth;
    public final String firmwareVersion;
    public final String mac;
    public final String model;
    public final String nodeId;
    public final Boolean otaSupported;
    public final String pairingAuth;
    public final int pairingAuthEpoch;
    public final String pairingPolicy;
    public final int pairingProtocol;
    public final boolean pairingRequired;
    public final Integer pairingTranscriptVersion;
    public final String reportedNodeId;
    public final boolean servesMgCommands;
    public final LinkWifiRequirement wifi;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceInfo) {
                LinkDeviceInfo linkDeviceInfo = (LinkDeviceInfo) obj;
                if (!C7384Etj.areEqual(this.nodeId, linkDeviceInfo.nodeId) || !C7384Etj.areEqual(this.deviceId, linkDeviceInfo.deviceId) || !C7384Etj.areEqual(this.mac, linkDeviceInfo.mac) || !C7384Etj.areEqual(this.model, linkDeviceInfo.model) || !C7384Etj.areEqual(this.firmwareVersion, linkDeviceInfo.firmwareVersion) || this.pairingProtocol != linkDeviceInfo.pairingProtocol || this.pairingRequired != linkDeviceInfo.pairingRequired || !C7384Etj.areEqual(this.pairingAuth, linkDeviceInfo.pairingAuth) || this.pairingAuthEpoch != linkDeviceInfo.pairingAuthEpoch || !C7384Etj.areEqual(this.cipherSuites, linkDeviceInfo.cipherSuites) || !C7384Etj.areEqual(this.pairingTranscriptVersion, linkDeviceInfo.pairingTranscriptVersion) || !C7384Etj.areEqual(this.pairingPolicy, linkDeviceInfo.pairingPolicy) || !C7384Etj.areEqual(this.otaSupported, linkDeviceInfo.otaSupported) || !C7384Etj.areEqual(this.reportedNodeId, linkDeviceInfo.reportedNodeId) || this.wifi != linkDeviceInfo.wifi || this.servesMgCommands != linkDeviceInfo.servesMgCommands || this.deviceKeyAuth != linkDeviceInfo.deviceKeyAuth || !C7384Etj.areEqual(this.cvmSupported, linkDeviceInfo.cvmSupported)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceInfo copy$default(LinkDeviceInfo linkDeviceInfo, String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, int i2, List list, Integer num, String str7, Boolean bool, String str8, LinkWifiRequirement linkWifiRequirement, boolean z2, int i3, Boolean bool2, int i4, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        int i5 = i;
        boolean z3 = z;
        String str14 = str6;
        int i6 = i2;
        List list2 = list;
        Integer num2 = num;
        String str15 = str7;
        Boolean bool3 = bool;
        String str16 = str8;
        LinkWifiRequirement linkWifiRequirement2 = linkWifiRequirement;
        boolean z4 = z2;
        int i7 = i3;
        Boolean bool4 = bool2;
        if ((i4 & 1) != 0) {
            str9 = linkDeviceInfo.nodeId;
        }
        if ((i4 & 2) != 0) {
            str10 = linkDeviceInfo.deviceId;
        }
        if ((i4 & 4) != 0) {
            str11 = linkDeviceInfo.mac;
        }
        if ((i4 & 8) != 0) {
            str12 = linkDeviceInfo.model;
        }
        if ((i4 & 16) != 0) {
            str13 = linkDeviceInfo.firmwareVersion;
        }
        if ((i4 & 32) != 0) {
            i5 = linkDeviceInfo.pairingProtocol;
        }
        if ((i4 & 64) != 0) {
            z3 = linkDeviceInfo.pairingRequired;
        }
        if ((i4 & 128) != 0) {
            str14 = linkDeviceInfo.pairingAuth;
        }
        if ((i4 & 256) != 0) {
            i6 = linkDeviceInfo.pairingAuthEpoch;
        }
        if ((i4 & 512) != 0) {
            list2 = linkDeviceInfo.cipherSuites;
        }
        if ((i4 & 1024) != 0) {
            num2 = linkDeviceInfo.pairingTranscriptVersion;
        }
        if ((i4 & 2048) != 0) {
            str15 = linkDeviceInfo.pairingPolicy;
        }
        if ((i4 & 4096) != 0) {
            bool3 = linkDeviceInfo.otaSupported;
        }
        if ((i4 & 8192) != 0) {
            str16 = linkDeviceInfo.reportedNodeId;
        }
        if ((i4 & 16384) != 0) {
            linkWifiRequirement2 = linkDeviceInfo.wifi;
        }
        if ((i4 & 32768) != 0) {
            z4 = linkDeviceInfo.servesMgCommands;
        }
        if ((i4 & 65536) != 0) {
            i7 = linkDeviceInfo.deviceKeyAuth;
        }
        if ((i4 & 131072) != 0) {
            bool4 = linkDeviceInfo.cvmSupported;
        }
        int i8 = i5;
        boolean z5 = z3;
        String str17 = str14;
        return linkDeviceInfo.copy(str9, str10, str11, str12, str13, i8, z5, str17, i6, list2, num2, str15, bool3, str16, linkWifiRequirement2, z4, i7, bool4);
    }

    public final String component1() {
        return this.nodeId;
    }

    public final List<String> component10() {
        return this.cipherSuites;
    }

    public final Integer component11() {
        return this.pairingTranscriptVersion;
    }

    public final String component12() {
        return this.pairingPolicy;
    }

    public final Boolean component13() {
        return this.otaSupported;
    }

    public final String component14() {
        return this.reportedNodeId;
    }

    public final LinkWifiRequirement component15() {
        return this.wifi;
    }

    public final boolean component16() {
        return this.servesMgCommands;
    }

    public final int component17() {
        return this.deviceKeyAuth;
    }

    public final Boolean component18() {
        return this.cvmSupported;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.mac;
    }

    public final String component4() {
        return this.model;
    }

    public final String component5() {
        return this.firmwareVersion;
    }

    public final int component6() {
        return this.pairingProtocol;
    }

    public final boolean component7() {
        return this.pairingRequired;
    }

    public final String component8() {
        return this.pairingAuth;
    }

    public final int component9() {
        return this.pairingAuthEpoch;
    }

    public final boolean getCanBindConfidentialVm() {
        return this.deviceKeyAuth >= 1 && !AnonymousClass002.A1b(this.cvmSupported, false);
    }

    public final List<String> getCipherSuites() {
        return this.cipherSuites;
    }

    public final Boolean getCvmSupported() {
        return this.cvmSupported;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceKeyAuth() {
        return this.deviceKeyAuth;
    }

    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final Boolean getOtaSupported() {
        return this.otaSupported;
    }

    public final String getPairingAuth() {
        return this.pairingAuth;
    }

    public final int getPairingAuthEpoch() {
        return this.pairingAuthEpoch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (com.facebook.aura.devices.pairing.LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_APP.equals(r1) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.devices.pairing.LinkPairingMode getPairingMode() {
        /*
            r6 = this;
            java.lang.String r1 = r6.model
            java.lang.String r0 = "hatch_link"
            boolean r0 = r0.equals(r1)
            r5 = 0
            if (r0 == 0) goto L1e
            int r0 = r6.pairingProtocol
            r4 = 5
            if (r0 == r4) goto L1f
            boolean r0 = r6.pairingRequired
            if (r0 == 0) goto L1e
            java.util.List<java.lang.String> r1 = r6.cipherSuites
            java.lang.String r0 = "p256-hkdf-sha256-aes-gcm-v1"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1f
        L1e:
            return r5
        L1f:
            int r3 = r6.pairingProtocol
            r0 = 4
            java.lang.String r1 = "fleet_ecdsa_p256_v1"
            java.lang.String r2 = "confirm_press"
            if (r3 == r0) goto L5e
            if (r3 != r4) goto L1e
            java.lang.String r3 = r6.pairingAuth
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L3f
            int r1 = r6.pairingAuthEpoch
            r0 = 1
            if (r1 != r0) goto L3f
            java.lang.String r0 = r6.pairingPolicy
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5b
        L3f:
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            int r0 = r6.pairingAuthEpoch
            if (r0 != 0) goto L1e
            java.lang.String r1 = r6.pairingPolicy
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "confirm_app"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
        L5b:
            com.facebook.aura.devices.pairing.LinkPairingMode r5 = com.facebook.aura.devices.pairing.LinkPairingMode.V5
            return r5
        L5e:
            java.lang.String r0 = r6.pairingAuth
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            java.lang.Integer r0 = r6.pairingTranscriptVersion
            if (r0 == 0) goto L1e
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L1e
            java.lang.String r0 = r6.pairingPolicy
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1e
            com.facebook.aura.devices.pairing.LinkPairingMode r5 = com.facebook.aura.devices.pairing.LinkPairingMode.V4_CONFIRM_PRESS
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkDeviceInfo.getPairingMode():com.facebook.aura.devices.pairing.LinkPairingMode");
    }

    public final String getPairingPolicy() {
        return this.pairingPolicy;
    }

    public final int getPairingProtocol() {
        return this.pairingProtocol;
    }

    public final boolean getPairingRequired() {
        return this.pairingRequired;
    }

    public final Integer getPairingTranscriptVersion() {
        return this.pairingTranscriptVersion;
    }

    public final String getReportedNodeId() {
        return this.reportedNodeId;
    }

    public final boolean getRequiresButtonPress() {
        return LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_PRESS.equals(this.pairingPolicy);
    }

    public final boolean getServesMgCommands() {
        return this.servesMgCommands;
    }

    public final LinkWifiRequirement getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0F(this.wifi, AnonymousClass005.A0I(this.reportedNodeId, (((((AnonymousClass005.A0F(this.cipherSuites, (AnonymousClass005.A0I(this.pairingAuth, C0KA.A01((AnonymousClass005.A0I(this.firmwareVersion, AnonymousClass005.A0I(this.model, AnonymousClass005.A0I(this.mac, AnonymousClass005.A0I(this.deviceId, AnonymousClass001.A0G(this.nodeId))))) + this.pairingProtocol) * 31, this.pairingRequired)) + this.pairingAuthEpoch) * 31) + AnonymousClass006.A0D(this.pairingTranscriptVersion)) * 31) + AnonymousClass006.A0G(this.pairingPolicy)) * 31) + AnonymousClass006.A0D(this.otaSupported)) * 31)), this.servesMgCommands) + this.deviceKeyAuth) * 31) + C3cH.A02(this.cvmSupported);
    }

    public final boolean isBluetoothGadget() {
        return this.servesMgCommands || this.wifi == LinkWifiRequirement.NONE;
    }

    public LinkDeviceInfo(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, int i2, List<String> list, Integer num, String str7, Boolean bool, String str8, LinkWifiRequirement linkWifiRequirement, boolean z2, int i3, Boolean bool2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass002.A1F(str6, 7, list);
        AnonymousClass002.A1H(str8, 13, linkWifiRequirement);
        this.nodeId = str;
        this.deviceId = str2;
        this.mac = str3;
        this.model = str4;
        this.firmwareVersion = str5;
        this.pairingProtocol = i;
        this.pairingRequired = z;
        this.pairingAuth = str6;
        this.pairingAuthEpoch = i2;
        this.cipherSuites = list;
        this.pairingTranscriptVersion = num;
        this.pairingPolicy = str7;
        this.otaSupported = bool;
        this.reportedNodeId = str8;
        this.wifi = linkWifiRequirement;
        this.servesMgCommands = z2;
        this.deviceKeyAuth = i3;
        this.cvmSupported = bool2;
    }

    public final LinkDeviceInfo copy(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, int i2, List<String> list, Integer num, String str7, Boolean bool, String str8, LinkWifiRequirement linkWifiRequirement, boolean z2, int i3, Boolean bool2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass002.A1F(str6, 7, list);
        AnonymousClass002.A1H(str8, 13, linkWifiRequirement);
        return new LinkDeviceInfo(str, str2, str3, str4, str5, i, z, str6, i2, list, num, str7, bool, str8, linkWifiRequirement, z2, i3, bool2);
    }

    public final boolean getRequiresAppConfirmation() {
        return isCommunity() && LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_APP.equals(this.pairingPolicy);
    }

    public final boolean isCommunity() {
        return getPairingMode() == LinkPairingMode.V5 && "none".equals(this.pairingAuth);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkDeviceInfo(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, int i2, List list, Integer num, String str7, Boolean bool, String str8, LinkWifiRequirement linkWifiRequirement, boolean z2, int i3, Boolean bool2, int i4, C06H c06h) {
        this(str, str2, str3, str4, str5, i, z, str6, i2, list, (i4 & 1024) != 0 ? null : num, (i4 & 2048) != 0 ? null : str7, (i4 & 4096) != 0 ? null : bool, (i4 & 8192) != 0 ? str : str8, (i4 & 16384) != 0 ? LinkWifiRequirement.REQUIRED : linkWifiRequirement, C3cH.A1L(32768, i4, z2), (65536 & i4) != 0 ? 0 : i3, (i4 & 131072) != 0 ? null : bool2);
    }
}
