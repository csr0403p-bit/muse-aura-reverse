package com.facebook.aura.devices.pairing;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkPairingReady extends C06G {
    public static final int $stable = 0;
    public final Integer confirmTimeoutSeconds;
    public final String deviceId;
    public final String deviceNonce;
    public final String deviceProof;
    public final String devicePub;
    public final String firmwareVersion;
    public final String mac;
    public final String model;
    public final String nodeId;
    public final String pairingAuth;
    public final int pairingAuthEpoch;
    public final String pairingPolicy;
    public final String selectedCipherSuite;
    public final String sessionId;
    public final String transcriptHash;
    public final Integer transcriptVersion;
    public final int version;

    public final LinkPairingReady copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, Integer num2) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, str3, str4, str5, 2);
        AnonymousClass003.A10(str6, str7);
        C3cH.A18(str8, str9);
        C7384Etj.A0Y(str10, 11);
        C7384Etj.A0Y(str11, 12);
        return new LinkPairingReady(i, str, str2, str3, str4, str5, str6, str7, i2, str8, str9, str10, str11, str12, num, str13, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkPairingReady) {
                LinkPairingReady linkPairingReady = (LinkPairingReady) obj;
                if (this.version != linkPairingReady.version || !C7384Etj.areEqual(this.deviceId, linkPairingReady.deviceId) || !C7384Etj.areEqual(this.nodeId, linkPairingReady.nodeId) || !C7384Etj.areEqual(this.mac, linkPairingReady.mac) || !C7384Etj.areEqual(this.model, linkPairingReady.model) || !C7384Etj.areEqual(this.firmwareVersion, linkPairingReady.firmwareVersion) || !C7384Etj.areEqual(this.selectedCipherSuite, linkPairingReady.selectedCipherSuite) || !C7384Etj.areEqual(this.pairingAuth, linkPairingReady.pairingAuth) || this.pairingAuthEpoch != linkPairingReady.pairingAuthEpoch || !C7384Etj.areEqual(this.devicePub, linkPairingReady.devicePub) || !C7384Etj.areEqual(this.deviceNonce, linkPairingReady.deviceNonce) || !C7384Etj.areEqual(this.transcriptHash, linkPairingReady.transcriptHash) || !C7384Etj.areEqual(this.sessionId, linkPairingReady.sessionId) || !C7384Etj.areEqual(this.deviceProof, linkPairingReady.deviceProof) || !C7384Etj.areEqual(this.transcriptVersion, linkPairingReady.transcriptVersion) || !C7384Etj.areEqual(this.pairingPolicy, linkPairingReady.pairingPolicy) || !C7384Etj.areEqual(this.confirmTimeoutSeconds, linkPairingReady.confirmTimeoutSeconds)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LinkPairingReady(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, Integer num2, int i3, C06H c06h) {
        this(i, str, str2, str3, str4, str5, str6, str7, i2, str8, str9, str10, str11, str12, (i3 & 16384) != 0 ? null : num, (32768 & i3) != 0 ? null : str13, (i3 & 65536) != 0 ? null : num2);
    }

    public static /* synthetic */ LinkPairingReady copy$default(LinkPairingReady linkPairingReady, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, Integer num2, int i3, Object obj) {
        int i4 = i;
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        int i5 = i2;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        Integer num3 = num;
        String str26 = str13;
        Integer num4 = num2;
        if ((i3 & 1) != 0) {
            i4 = linkPairingReady.version;
        }
        if ((i3 & 2) != 0) {
            str14 = linkPairingReady.deviceId;
        }
        if ((i3 & 4) != 0) {
            str15 = linkPairingReady.nodeId;
        }
        if ((i3 & 8) != 0) {
            str16 = linkPairingReady.mac;
        }
        if ((i3 & 16) != 0) {
            str17 = linkPairingReady.model;
        }
        if ((i3 & 32) != 0) {
            str18 = linkPairingReady.firmwareVersion;
        }
        if ((i3 & 64) != 0) {
            str19 = linkPairingReady.selectedCipherSuite;
        }
        if ((i3 & 128) != 0) {
            str20 = linkPairingReady.pairingAuth;
        }
        if ((i3 & 256) != 0) {
            i5 = linkPairingReady.pairingAuthEpoch;
        }
        if ((i3 & 512) != 0) {
            str21 = linkPairingReady.devicePub;
        }
        if ((i3 & 1024) != 0) {
            str22 = linkPairingReady.deviceNonce;
        }
        if ((i3 & 2048) != 0) {
            str23 = linkPairingReady.transcriptHash;
        }
        if ((i3 & 4096) != 0) {
            str24 = linkPairingReady.sessionId;
        }
        if ((i3 & 8192) != 0) {
            str25 = linkPairingReady.deviceProof;
        }
        if ((i3 & 16384) != 0) {
            num3 = linkPairingReady.transcriptVersion;
        }
        if ((i3 & 32768) != 0) {
            str26 = linkPairingReady.pairingPolicy;
        }
        if ((i3 & 65536) != 0) {
            num4 = linkPairingReady.confirmTimeoutSeconds;
        }
        String str27 = str17;
        return linkPairingReady.copy(i4, str14, str15, str16, str27, str18, str19, str20, i5, str21, str22, str23, str24, str25, num3, str26, num4);
    }

    public final int component1() {
        return this.version;
    }

    public final String component10() {
        return this.devicePub;
    }

    public final String component11() {
        return this.deviceNonce;
    }

    public final String component12() {
        return this.transcriptHash;
    }

    public final String component13() {
        return this.sessionId;
    }

    public final String component14() {
        return this.deviceProof;
    }

    public final Integer component15() {
        return this.transcriptVersion;
    }

    public final String component16() {
        return this.pairingPolicy;
    }

    public final Integer component17() {
        return this.confirmTimeoutSeconds;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.nodeId;
    }

    public final String component4() {
        return this.mac;
    }

    public final String component5() {
        return this.model;
    }

    public final String component6() {
        return this.firmwareVersion;
    }

    public final String component7() {
        return this.selectedCipherSuite;
    }

    public final String component8() {
        return this.pairingAuth;
    }

    public final int component9() {
        return this.pairingAuthEpoch;
    }

    public final Integer getConfirmTimeoutSeconds() {
        return this.confirmTimeoutSeconds;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceNonce() {
        return this.deviceNonce;
    }

    public final String getDeviceProof() {
        return this.deviceProof;
    }

    public final String getDevicePub() {
        return this.devicePub;
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

    public final String getPairingAuth() {
        return this.pairingAuth;
    }

    public final int getPairingAuthEpoch() {
        return this.pairingAuthEpoch;
    }

    public final String getPairingPolicy() {
        return this.pairingPolicy;
    }

    public final String getSelectedCipherSuite() {
        return this.selectedCipherSuite;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTranscriptHash() {
        return this.transcriptHash;
    }

    public final Integer getTranscriptVersion() {
        return this.transcriptVersion;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.sessionId, AnonymousClass005.A0I(this.transcriptHash, AnonymousClass005.A0I(this.deviceNonce, AnonymousClass005.A0I(this.devicePub, (AnonymousClass005.A0I(this.pairingAuth, AnonymousClass005.A0I(this.selectedCipherSuite, AnonymousClass005.A0I(this.firmwareVersion, AnonymousClass005.A0I(this.model, AnonymousClass005.A0I(this.mac, AnonymousClass005.A0I(this.nodeId, AnonymousClass005.A0I(this.deviceId, this.version * 31))))))) + this.pairingAuthEpoch) * 31)))) + AnonymousClass006.A0G(this.deviceProof)) * 31) + AnonymousClass006.A0D(this.transcriptVersion)) * 31) + AnonymousClass006.A0G(this.pairingPolicy)) * 31) + C3cH.A02(this.confirmTimeoutSeconds);
    }

    public String toString() {
        return super.toString();
    }

    public LinkPairingReady(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, Integer num2) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, str3, str4, str5, 2);
        AnonymousClass003.A10(str6, str7);
        C3cH.A18(str8, str9);
        C7384Etj.A0Y(str10, 11);
        C7384Etj.A0Y(str11, 12);
        this.version = i;
        this.deviceId = str;
        this.nodeId = str2;
        this.mac = str3;
        this.model = str4;
        this.firmwareVersion = str5;
        this.selectedCipherSuite = str6;
        this.pairingAuth = str7;
        this.pairingAuthEpoch = i2;
        this.devicePub = str8;
        this.deviceNonce = str9;
        this.transcriptHash = str10;
        this.sessionId = str11;
        this.deviceProof = str12;
        this.transcriptVersion = num;
        this.pairingPolicy = str13;
        this.confirmTimeoutSeconds = num2;
    }
}
