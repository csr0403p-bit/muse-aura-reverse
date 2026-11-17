package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.devices.token.HatchDeviceNodeIdKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkPairingReadyJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer confirm_timeout_seconds;
    public final String device_id;
    public final String device_nonce;
    public final String device_proof;
    public final String device_pub;
    public final String firmware_version;
    public final String mac;
    public final String model;
    public final String node_id;
    public final String pairing_auth;
    public final int pairing_auth_epoch;
    public final String pairing_policy;
    public final String selected_cipher_suite;
    public final String session_id;
    public final String transcript_hash;
    public final Integer transcript_version;
    public final String type;
    public final int version;

    public final class Companion {
        public final C9hr<LinkPairingReadyJson> serializer() {
            return LinkPairingReadyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LinkPairingReadyJson(String str, int i, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14) {
        AnonymousClass005.A16(str, str2, str3, str4, 0);
        AnonymousClass005.A13(str5, str6, str7, 6);
        C7384Etj.A0Y(str8, 9);
        AnonymousClass002.A1H(str10, 13, str11);
        AnonymousClass003.A12(str12, str13);
        this.type = str;
        this.version = i;
        this.transcript_version = num;
        this.device_id = str2;
        this.node_id = str3;
        this.mac = str4;
        this.model = str5;
        this.firmware_version = str6;
        this.selected_cipher_suite = str7;
        this.pairing_auth = str8;
        this.pairing_auth_epoch = i2;
        this.pairing_policy = str9;
        this.confirm_timeout_seconds = num2;
        this.device_pub = str10;
        this.device_nonce = str11;
        this.transcript_hash = str12;
        this.session_id = str13;
        this.device_proof = str14;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkPairingReadyJson linkPairingReadyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(linkPairingReadyJson.type)) {
            c9j5.AAV(linkPairingReadyJson.type, c9iZ, 0);
        }
        if (zAfR || linkPairingReadyJson.version != 0) {
            c9j5.AAK(c9iZ, 1, linkPairingReadyJson.version);
        }
        if (zAfR || linkPairingReadyJson.transcript_version != null) {
            c9j5.AAP(linkPairingReadyJson.transcript_version, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.device_id)) {
            c9j5.AAV(linkPairingReadyJson.device_id, c9iZ, 3);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.node_id)) {
            c9j5.AAV(linkPairingReadyJson.node_id, c9iZ, 4);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.mac)) {
            c9j5.AAV(linkPairingReadyJson.mac, c9iZ, 5);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.model)) {
            c9j5.AAV(linkPairingReadyJson.model, c9iZ, 6);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.firmware_version)) {
            c9j5.AAV(linkPairingReadyJson.firmware_version, c9iZ, 7);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.selected_cipher_suite)) {
            c9j5.AAV(linkPairingReadyJson.selected_cipher_suite, c9iZ, 8);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.pairing_auth)) {
            c9j5.AAV(linkPairingReadyJson.pairing_auth, c9iZ, 9);
        }
        if (zAfR || linkPairingReadyJson.pairing_auth_epoch != -1) {
            c9j5.AAK(c9iZ, 10, linkPairingReadyJson.pairing_auth_epoch);
        }
        if (zAfR || linkPairingReadyJson.pairing_policy != null) {
            c9j5.AAP(linkPairingReadyJson.pairing_policy, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || linkPairingReadyJson.confirm_timeout_seconds != null) {
            c9j5.AAP(linkPairingReadyJson.confirm_timeout_seconds, C07729ii.A00, c9iZ, 12);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.device_pub)) {
            c9j5.AAV(linkPairingReadyJson.device_pub, c9iZ, 13);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.device_nonce)) {
            c9j5.AAV(linkPairingReadyJson.device_nonce, c9iZ, 14);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.transcript_hash)) {
            c9j5.AAV(linkPairingReadyJson.transcript_hash, c9iZ, 15);
        }
        if (zAfR || !"".equals(linkPairingReadyJson.session_id)) {
            c9j5.AAV(linkPairingReadyJson.session_id, c9iZ, 16);
        }
        if (zAfR || linkPairingReadyJson.device_proof != null) {
            c9j5.AAP(linkPairingReadyJson.device_proof, C07779iq.A01, c9iZ, 17);
        }
    }

    public final LinkPairingReadyJson copy(String str, int i, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14) {
        AnonymousClass005.A16(str, str2, str3, str4, 0);
        AnonymousClass005.A13(str5, str6, str7, 6);
        C7384Etj.A0Y(str8, 9);
        AnonymousClass002.A1H(str10, 13, str11);
        AnonymousClass003.A12(str12, str13);
        return new LinkPairingReadyJson(str, i, num, str2, str3, str4, str5, str6, str7, str8, i2, str9, num2, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkPairingReadyJson) {
                LinkPairingReadyJson linkPairingReadyJson = (LinkPairingReadyJson) obj;
                if (!C7384Etj.areEqual(this.type, linkPairingReadyJson.type) || this.version != linkPairingReadyJson.version || !C7384Etj.areEqual(this.transcript_version, linkPairingReadyJson.transcript_version) || !C7384Etj.areEqual(this.device_id, linkPairingReadyJson.device_id) || !C7384Etj.areEqual(this.node_id, linkPairingReadyJson.node_id) || !C7384Etj.areEqual(this.mac, linkPairingReadyJson.mac) || !C7384Etj.areEqual(this.model, linkPairingReadyJson.model) || !C7384Etj.areEqual(this.firmware_version, linkPairingReadyJson.firmware_version) || !C7384Etj.areEqual(this.selected_cipher_suite, linkPairingReadyJson.selected_cipher_suite) || !C7384Etj.areEqual(this.pairing_auth, linkPairingReadyJson.pairing_auth) || this.pairing_auth_epoch != linkPairingReadyJson.pairing_auth_epoch || !C7384Etj.areEqual(this.pairing_policy, linkPairingReadyJson.pairing_policy) || !C7384Etj.areEqual(this.confirm_timeout_seconds, linkPairingReadyJson.confirm_timeout_seconds) || !C7384Etj.areEqual(this.device_pub, linkPairingReadyJson.device_pub) || !C7384Etj.areEqual(this.device_nonce, linkPairingReadyJson.device_nonce) || !C7384Etj.areEqual(this.transcript_hash, linkPairingReadyJson.transcript_hash) || !C7384Etj.areEqual(this.session_id, linkPairingReadyJson.session_id) || !C7384Etj.areEqual(this.device_proof, linkPairingReadyJson.device_proof)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkPairingReadyJson copy$default(LinkPairingReadyJson linkPairingReadyJson, String str, int i, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, int i3, Object obj) {
        String str15 = str;
        int i4 = i;
        Integer num3 = num;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        int i5 = i2;
        String str23 = str9;
        Integer num4 = num2;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        if ((i3 & 1) != 0) {
            str15 = linkPairingReadyJson.type;
        }
        if ((i3 & 2) != 0) {
            i4 = linkPairingReadyJson.version;
        }
        if ((i3 & 4) != 0) {
            num3 = linkPairingReadyJson.transcript_version;
        }
        if ((i3 & 8) != 0) {
            str16 = linkPairingReadyJson.device_id;
        }
        if ((i3 & 16) != 0) {
            str17 = linkPairingReadyJson.node_id;
        }
        if ((i3 & 32) != 0) {
            str18 = linkPairingReadyJson.mac;
        }
        if ((i3 & 64) != 0) {
            str19 = linkPairingReadyJson.model;
        }
        if ((i3 & 128) != 0) {
            str20 = linkPairingReadyJson.firmware_version;
        }
        if ((i3 & 256) != 0) {
            str21 = linkPairingReadyJson.selected_cipher_suite;
        }
        if ((i3 & 512) != 0) {
            str22 = linkPairingReadyJson.pairing_auth;
        }
        if ((i3 & 1024) != 0) {
            i5 = linkPairingReadyJson.pairing_auth_epoch;
        }
        if ((i3 & 2048) != 0) {
            str23 = linkPairingReadyJson.pairing_policy;
        }
        if ((i3 & 4096) != 0) {
            num4 = linkPairingReadyJson.confirm_timeout_seconds;
        }
        if ((i3 & 8192) != 0) {
            str24 = linkPairingReadyJson.device_pub;
        }
        if ((i3 & 16384) != 0) {
            str25 = linkPairingReadyJson.device_nonce;
        }
        if ((i3 & 32768) != 0) {
            str26 = linkPairingReadyJson.transcript_hash;
        }
        if ((i3 & 65536) != 0) {
            str27 = linkPairingReadyJson.session_id;
        }
        if ((i3 & 131072) != 0) {
            str28 = linkPairingReadyJson.device_proof;
        }
        String str29 = str18;
        String str30 = str19;
        String str31 = str20;
        return linkPairingReadyJson.copy(str15, i4, num3, str16, str17, str29, str30, str31, str21, str22, i5, str23, num4, str24, str25, str26, str27, str28);
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.pairing_auth;
    }

    public final int component11() {
        return this.pairing_auth_epoch;
    }

    public final String component12() {
        return this.pairing_policy;
    }

    public final Integer component13() {
        return this.confirm_timeout_seconds;
    }

    public final String component14() {
        return this.device_pub;
    }

    public final String component15() {
        return this.device_nonce;
    }

    public final String component16() {
        return this.transcript_hash;
    }

    public final String component17() {
        return this.session_id;
    }

    public final String component18() {
        return this.device_proof;
    }

    public final int component2() {
        return this.version;
    }

    public final Integer component3() {
        return this.transcript_version;
    }

    public final String component4() {
        return this.device_id;
    }

    public final String component5() {
        return this.node_id;
    }

    public final String component6() {
        return this.mac;
    }

    public final String component7() {
        return this.model;
    }

    public final String component8() {
        return this.firmware_version;
    }

    public final String component9() {
        return this.selected_cipher_suite;
    }

    public final Integer getConfirm_timeout_seconds() {
        return this.confirm_timeout_seconds;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getDevice_nonce() {
        return this.device_nonce;
    }

    public final String getDevice_proof() {
        return this.device_proof;
    }

    public final String getDevice_pub() {
        return this.device_pub;
    }

    public final String getFirmware_version() {
        return this.firmware_version;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getPairing_auth() {
        return this.pairing_auth;
    }

    public final int getPairing_auth_epoch() {
        return this.pairing_auth_epoch;
    }

    public final String getPairing_policy() {
        return this.pairing_policy;
    }

    public final String getSelected_cipher_suite() {
        return this.selected_cipher_suite;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getTranscript_hash() {
        return this.transcript_hash;
    }

    public final Integer getTranscript_version() {
        return this.transcript_version;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.session_id, AnonymousClass005.A0I(this.transcript_hash, AnonymousClass005.A0I(this.device_nonce, AnonymousClass005.A0I(this.device_pub, (((((AnonymousClass005.A0I(this.pairing_auth, AnonymousClass005.A0I(this.selected_cipher_suite, AnonymousClass005.A0I(this.firmware_version, AnonymousClass005.A0I(this.model, AnonymousClass005.A0I(this.mac, AnonymousClass005.A0I(this.node_id, AnonymousClass005.A0I(this.device_id, (((AnonymousClass001.A0G(this.type) + this.version) * 31) + AnonymousClass006.A0D(this.transcript_version)) * 31))))))) + this.pairing_auth_epoch) * 31) + AnonymousClass006.A0G(this.pairing_policy)) * 31) + AnonymousClass006.A0D(this.confirm_timeout_seconds)) * 31)))) + AnonymousClass005.A0H(this.device_proof);
    }

    public final LinkPairingReady toDomain() {
        String strNormalizeHatchDeviceNodeId;
        Integer numValueOf;
        String strSizedBase64;
        String strSizedBase642;
        String strSizedBase643;
        String strSizedBase644;
        int i;
        String strA0l = this.version == 5 ? LinkEncryptedPairingKt.LINK_PAIRING_CIPHER_SUITE : AnonymousClass002.A0l(this.selected_cipher_suite);
        String strA0l2 = AnonymousClass002.A0l(this.pairing_auth);
        int i2 = this.version;
        String str = LinkEncryptedPairingKt.LINK_PAIRING_FLEET_ECDSA_P256_AUTH;
        String str2 = null;
        if (i2 != 4) {
            if (i2 != 5) {
                return null;
            }
            if (!LinkEncryptedPairingKt.LINK_PAIRING_FLEET_ECDSA_P256_AUTH.equals(strA0l2) || this.pairing_auth_epoch != 1) {
                if (!"none".equals(strA0l2) || this.pairing_auth_epoch != 0) {
                    return null;
                }
                str = "none";
            }
        }
        if (!LinkEncryptedPairingKt.LINK_PAIRING_CIPHER_SUITE.equals(strA0l) || !str.equals(strA0l2)) {
            return null;
        }
        boolean zEquals = "none".equals(strA0l2);
        if (zEquals && this.device_proof != null) {
            return null;
        }
        Integer num = this.transcript_version;
        String strNonEmptyTrimmed = LinkEncryptedPairingKt.nonEmptyTrimmed(this.device_id);
        if (strNonEmptyTrimmed == null || (strNormalizeHatchDeviceNodeId = HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(this.node_id)) == null) {
            return null;
        }
        String strA0l3 = AnonymousClass002.A0l(this.mac);
        String strA0l4 = AnonymousClass002.A0l(this.model);
        String strA0l5 = AnonymousClass002.A0l(this.firmware_version);
        int i3 = this.pairing_auth_epoch;
        String str3 = this.pairing_policy;
        String strA0l6 = str3 != null ? AnonymousClass002.A0l(str3) : null;
        if (this.version == 5) {
            String str4 = this.pairing_policy;
            String strA0l7 = str4 != null ? AnonymousClass002.A0l(str4) : null;
            if (LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_PRESS.equals(strA0l7)) {
                i = 60;
            } else {
                if (!LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_APP.equals(strA0l7) || !zEquals) {
                    return null;
                }
                i = 0;
            }
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = this.confirm_timeout_seconds;
        }
        String strValidP256PublicKey = LinkEncryptedPairingKt.validP256PublicKey(this.device_pub);
        if (strValidP256PublicKey == null || (strSizedBase64 = LinkEncryptedPairingKt.sizedBase64(this.device_nonce, 16)) == null || (strSizedBase642 = LinkEncryptedPairingKt.sizedBase64(this.transcript_hash, 32)) == null || (strSizedBase643 = LinkEncryptedPairingKt.sizedBase64(this.session_id, 16)) == null) {
            return null;
        }
        if (!zEquals) {
            String str5 = this.device_proof;
            if (str5 == null || (strSizedBase644 = LinkEncryptedPairingKt.sizedBase64(str5, 64)) == null) {
                return null;
            }
            str2 = strSizedBase644;
        }
        return new LinkPairingReady(i2, strNonEmptyTrimmed, strNormalizeHatchDeviceNodeId, strA0l3, strA0l4, strA0l5, strA0l, strA0l2, i3, strValidP256PublicKey, strSizedBase64, strSizedBase642, strSizedBase643, str2, num, strA0l6, numValueOf);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkPairingReadyJson(String str, int i, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? -1 : i2, C3cG.A0e(str9, i3 & 2048), (i3 & 4096) != 0 ? null : num2, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? "" : str11, (i3 & 32768) != 0 ? "" : str12, (i3 & 65536) == 0 ? str13 : "", C3cG.A0e(str14, i3 & 131072));
    }

    public /* synthetic */ LinkPairingReadyJson(int i, String str, int i2, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.version = 0;
        } else {
            this.version = i2;
        }
        if ((i & 4) == 0) {
            this.transcript_version = null;
        } else {
            this.transcript_version = num;
        }
        if ((i & 8) == 0) {
            this.device_id = "";
        } else {
            this.device_id = str2;
        }
        if ((i & 16) == 0) {
            this.node_id = "";
        } else {
            this.node_id = str3;
        }
        if ((i & 32) == 0) {
            this.mac = "";
        } else {
            this.mac = str4;
        }
        if ((i & 64) == 0) {
            this.model = "";
        } else {
            this.model = str5;
        }
        if ((i & 128) == 0) {
            this.firmware_version = "";
        } else {
            this.firmware_version = str6;
        }
        if ((i & 256) == 0) {
            this.selected_cipher_suite = "";
        } else {
            this.selected_cipher_suite = str7;
        }
        if ((i & 512) == 0) {
            this.pairing_auth = "";
        } else {
            this.pairing_auth = str8;
        }
        if ((i & 1024) == 0) {
            this.pairing_auth_epoch = -1;
        } else {
            this.pairing_auth_epoch = i3;
        }
        if ((i & 2048) == 0) {
            this.pairing_policy = null;
        } else {
            this.pairing_policy = str9;
        }
        if ((i & 4096) == 0) {
            this.confirm_timeout_seconds = null;
        } else {
            this.confirm_timeout_seconds = num2;
        }
        if ((i & 8192) == 0) {
            this.device_pub = "";
        } else {
            this.device_pub = str10;
        }
        if ((i & 16384) == 0) {
            this.device_nonce = "";
        } else {
            this.device_nonce = str11;
        }
        if ((32768 & i) == 0) {
            this.transcript_hash = "";
        } else {
            this.transcript_hash = str12;
        }
        if ((65536 & i) == 0) {
            this.session_id = "";
        } else {
            this.session_id = str13;
        }
        if ((i & 131072) == 0) {
            this.device_proof = null;
        } else {
            this.device_proof = str14;
        }
    }

    public LinkPairingReadyJson() {
        this("", 0, null, "", "", "", "", "", "", "", -1, null, null, "", "", "", "", null);
    }
}
