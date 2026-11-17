package com.facebook.aura.devices.pairing;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkDeviceInfoJson extends C06G {
    public static final int $stable = 8;
    public final String build_sha;
    public final List<String> cipher_suites;
    public final Boolean cvm_supported;
    public final String device_id;
    public final Integer device_key_auth;
    public final String mac;
    public final Integer mgcommands;
    public final String model;
    public final String node_id;
    public final Boolean ota_supported;
    public final String pairing_auth;
    public final int pairing_auth_epoch;
    public final String pairing_policy;
    public final int pairing_protocol;
    public final boolean pairing_required;
    public final Integer pairing_transcript_version;
    public final String type;
    public final String version;
    public final String wifi;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, LinkDeviceInfoJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null};

    public final class Companion {
        public final C9hr<LinkDeviceInfoJson> serializer() {
            return LinkDeviceInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LinkDeviceInfoJson() {
        this("", "", "", "", "", "", "", 0, null, false, "", -1, null, C0881AGi.A00, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceInfoJson) {
                LinkDeviceInfoJson linkDeviceInfoJson = (LinkDeviceInfoJson) obj;
                if (!C7384Etj.areEqual(this.type, linkDeviceInfoJson.type) || !C7384Etj.areEqual(this.node_id, linkDeviceInfoJson.node_id) || !C7384Etj.areEqual(this.device_id, linkDeviceInfoJson.device_id) || !C7384Etj.areEqual(this.mac, linkDeviceInfoJson.mac) || !C7384Etj.areEqual(this.model, linkDeviceInfoJson.model) || !C7384Etj.areEqual(this.version, linkDeviceInfoJson.version) || !C7384Etj.areEqual(this.build_sha, linkDeviceInfoJson.build_sha) || this.pairing_protocol != linkDeviceInfoJson.pairing_protocol || !C7384Etj.areEqual(this.pairing_transcript_version, linkDeviceInfoJson.pairing_transcript_version) || this.pairing_required != linkDeviceInfoJson.pairing_required || !C7384Etj.areEqual(this.pairing_auth, linkDeviceInfoJson.pairing_auth) || this.pairing_auth_epoch != linkDeviceInfoJson.pairing_auth_epoch || !C7384Etj.areEqual(this.pairing_policy, linkDeviceInfoJson.pairing_policy) || !C7384Etj.areEqual(this.cipher_suites, linkDeviceInfoJson.cipher_suites) || !C7384Etj.areEqual(this.ota_supported, linkDeviceInfoJson.ota_supported) || !C7384Etj.areEqual(this.wifi, linkDeviceInfoJson.wifi) || !C7384Etj.areEqual(this.mgcommands, linkDeviceInfoJson.mgcommands) || !C7384Etj.areEqual(this.device_key_auth, linkDeviceInfoJson.device_key_auth) || !C7384Etj.areEqual(this.cvm_supported, linkDeviceInfoJson.cvm_supported)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkDeviceInfoJson linkDeviceInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(linkDeviceInfoJson.type)) {
            c9j5.AAV(linkDeviceInfoJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.node_id)) {
            c9j5.AAV(linkDeviceInfoJson.node_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.device_id)) {
            c9j5.AAV(linkDeviceInfoJson.device_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.mac)) {
            c9j5.AAV(linkDeviceInfoJson.mac, c9iZ, 3);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.model)) {
            c9j5.AAV(linkDeviceInfoJson.model, c9iZ, 4);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.version)) {
            c9j5.AAV(linkDeviceInfoJson.version, c9iZ, 5);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.build_sha)) {
            c9j5.AAV(linkDeviceInfoJson.build_sha, c9iZ, 6);
        }
        if (zAfR || linkDeviceInfoJson.pairing_protocol != 0) {
            c9j5.AAK(c9iZ, 7, linkDeviceInfoJson.pairing_protocol);
        }
        if (zAfR || linkDeviceInfoJson.pairing_transcript_version != null) {
            c9j5.AAP(linkDeviceInfoJson.pairing_transcript_version, C07729ii.A00, c9iZ, 8);
        }
        if (zAfR || linkDeviceInfoJson.pairing_required) {
            c9j5.AA7(c9iZ, 9, linkDeviceInfoJson.pairing_required);
        }
        if (zAfR || !"".equals(linkDeviceInfoJson.pairing_auth)) {
            c9j5.AAV(linkDeviceInfoJson.pairing_auth, c9iZ, 10);
        }
        if (zAfR || linkDeviceInfoJson.pairing_auth_epoch != -1) {
            c9j5.AAK(c9iZ, 11, linkDeviceInfoJson.pairing_auth_epoch);
        }
        if (zAfR || linkDeviceInfoJson.pairing_policy != null) {
            c9j5.AAP(linkDeviceInfoJson.pairing_policy, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || !C3cG.A1L(linkDeviceInfoJson.cipher_suites)) {
            c9j5.AAQ(linkDeviceInfoJson.cipher_suites, C3cH.A15(f0cArr, 13), c9iZ, 13);
        }
        if (zAfR || linkDeviceInfoJson.ota_supported != null) {
            c9j5.AAP(linkDeviceInfoJson.ota_supported, C07839ix.A00, c9iZ, 14);
        }
        if (zAfR || linkDeviceInfoJson.wifi != null) {
            c9j5.AAP(linkDeviceInfoJson.wifi, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || linkDeviceInfoJson.mgcommands != null) {
            c9j5.AAP(linkDeviceInfoJson.mgcommands, C07729ii.A00, c9iZ, 16);
        }
        if (zAfR || linkDeviceInfoJson.device_key_auth != null) {
            c9j5.AAP(linkDeviceInfoJson.device_key_auth, C07729ii.A00, c9iZ, 17);
        }
        if (zAfR || linkDeviceInfoJson.cvm_supported != null) {
            c9j5.AAP(linkDeviceInfoJson.cvm_supported, C07839ix.A00, c9iZ, 18);
        }
    }

    public final String component1() {
        return this.type;
    }

    public final boolean component10() {
        return this.pairing_required;
    }

    public final String component11() {
        return this.pairing_auth;
    }

    public final int component12() {
        return this.pairing_auth_epoch;
    }

    public final String component13() {
        return this.pairing_policy;
    }

    public final List<String> component14() {
        return this.cipher_suites;
    }

    public final Boolean component15() {
        return this.ota_supported;
    }

    public final String component16() {
        return this.wifi;
    }

    public final Integer component17() {
        return this.mgcommands;
    }

    public final Integer component18() {
        return this.device_key_auth;
    }

    public final Boolean component19() {
        return this.cvm_supported;
    }

    public final String component2() {
        return this.node_id;
    }

    public final String component3() {
        return this.device_id;
    }

    public final String component4() {
        return this.mac;
    }

    public final String component5() {
        return this.model;
    }

    public final String component6() {
        return this.version;
    }

    public final String component7() {
        return this.build_sha;
    }

    public final int component8() {
        return this.pairing_protocol;
    }

    public final Integer component9() {
        return this.pairing_transcript_version;
    }

    public final String getBuild_sha() {
        return this.build_sha;
    }

    public final List<String> getCipher_suites() {
        return this.cipher_suites;
    }

    public final Boolean getCvm_supported() {
        return this.cvm_supported;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final Integer getDevice_key_auth() {
        return this.device_key_auth;
    }

    public final String getMac() {
        return this.mac;
    }

    public final Integer getMgcommands() {
        return this.mgcommands;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final Boolean getOta_supported() {
        return this.ota_supported;
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

    public final int getPairing_protocol() {
        return this.pairing_protocol;
    }

    public final boolean getPairing_required() {
        return this.pairing_required;
    }

    public final Integer getPairing_transcript_version() {
        return this.pairing_transcript_version;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0F(this.cipher_suites, (((AnonymousClass005.A0I(this.pairing_auth, C0KA.A01((((AnonymousClass005.A0I(this.build_sha, AnonymousClass005.A0I(this.version, AnonymousClass005.A0I(this.model, AnonymousClass005.A0I(this.mac, AnonymousClass005.A0I(this.device_id, AnonymousClass005.A0I(this.node_id, AnonymousClass001.A0G(this.type))))))) + this.pairing_protocol) * 31) + AnonymousClass006.A0D(this.pairing_transcript_version)) * 31, this.pairing_required)) + this.pairing_auth_epoch) * 31) + AnonymousClass006.A0G(this.pairing_policy)) * 31) + AnonymousClass006.A0D(this.ota_supported)) * 31) + AnonymousClass006.A0G(this.wifi)) * 31) + AnonymousClass006.A0D(this.mgcommands)) * 31) + AnonymousClass006.A0D(this.device_key_auth)) * 31) + C3cH.A02(this.cvm_supported);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.devices.pairing.LinkDeviceInfo toDomain() {
        /*
            r26 = this;
            r0 = r26
            java.lang.String r1 = r0.node_id
            java.lang.String r9 = com.facebook.aura.devices.token.HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(r1)
            r20 = 0
            if (r9 == 0) goto L8a
            java.lang.String r7 = r0.node_id
            java.lang.String r1 = r0.device_id
            java.lang.String r10 = com.facebook.aura.devices.pairing.LinkEncryptedPairingKt.nonEmptyTrimmed(r1)
            if (r10 == 0) goto L8a
            java.lang.String r1 = r0.mac
            java.lang.String r11 = X.AnonymousClass002.A0l(r1)
            java.lang.String r1 = r0.model
            java.lang.String r12 = X.AnonymousClass002.A0l(r1)
            java.lang.String r1 = r0.version
            java.lang.String r13 = X.AnonymousClass002.A0l(r1)
            int r14 = r0.pairing_protocol
            java.lang.Integer r6 = r0.pairing_transcript_version
            boolean r15 = r0.pairing_required
            java.lang.String r1 = r0.pairing_auth
            java.lang.String r16 = X.AnonymousClass002.A0l(r1)
            int r4 = r0.pairing_auth_epoch
            java.lang.String r1 = r0.pairing_policy
            if (r1 == 0) goto L3e
            java.lang.String r20 = X.AnonymousClass002.A0l(r1)
        L3e:
            java.util.List<java.lang.String> r3 = r0.cipher_suites
            java.lang.Boolean r2 = r0.ota_supported
            java.lang.String r5 = r0.wifi
            java.lang.String r1 = "optional"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L7c
            com.facebook.aura.devices.pairing.LinkWifiRequirement r23 = com.facebook.aura.devices.pairing.LinkWifiRequirement.OPTIONAL
        L4e:
            java.lang.Integer r1 = r0.mgcommands
            if (r1 == 0) goto L7a
            int r5 = r1.intValue()
            r1 = 1
            if (r5 != r1) goto L7a
        L59:
            java.lang.Integer r5 = r0.device_key_auth
            if (r5 == 0) goto L77
            int r25 = r5.intValue()
        L61:
            java.lang.Boolean r0 = r0.cvm_supported
            com.facebook.aura.devices.pairing.LinkDeviceInfo r8 = new com.facebook.aura.devices.pairing.LinkDeviceInfo
            r24 = r1
            r26 = r0
            r22 = r7
            r21 = r2
            r19 = r6
            r18 = r3
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r8
        L77:
            r25 = 0
            goto L61
        L7a:
            r1 = 0
            goto L59
        L7c:
            java.lang.String r1 = "none"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L87
            com.facebook.aura.devices.pairing.LinkWifiRequirement r23 = com.facebook.aura.devices.pairing.LinkWifiRequirement.NONE
            goto L4e
        L87:
            com.facebook.aura.devices.pairing.LinkWifiRequirement r23 = com.facebook.aura.devices.pairing.LinkWifiRequirement.REQUIRED
            goto L4e
        L8a:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkDeviceInfoJson.toDomain():com.facebook.aura.devices.pairing.LinkDeviceInfo");
    }

    public final LinkDeviceInfoJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, boolean z, String str8, int i2, String str9, List<String> list, Boolean bool, String str10, Integer num2, Integer num3, Boolean bool2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, str7);
        C7384Etj.A0Y(str8, 10);
        C7384Etj.A0Y(list, 13);
        return new LinkDeviceInfoJson(str, str2, str3, str4, str5, str6, str7, i, num, z, str8, i2, str9, list, bool, str10, num2, num3, bool2);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ LinkDeviceInfoJson copy$default(LinkDeviceInfoJson linkDeviceInfoJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, boolean z, String str8, int i2, String str9, List list, Boolean bool, String str10, Integer num2, Integer num3, Boolean bool2, int i3, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        int i4 = i;
        Integer num4 = num;
        boolean z2 = z;
        String str18 = str8;
        int i5 = i2;
        String str19 = str9;
        List list2 = list;
        Boolean bool3 = bool;
        String str20 = str10;
        Integer num5 = num2;
        Integer num6 = num3;
        Boolean bool4 = bool2;
        if ((i3 & 1) != 0) {
            str11 = linkDeviceInfoJson.type;
        }
        if ((i3 & 2) != 0) {
            str12 = linkDeviceInfoJson.node_id;
        }
        if ((i3 & 4) != 0) {
            str13 = linkDeviceInfoJson.device_id;
        }
        if ((i3 & 8) != 0) {
            str14 = linkDeviceInfoJson.mac;
        }
        if ((i3 & 16) != 0) {
            str15 = linkDeviceInfoJson.model;
        }
        if ((i3 & 32) != 0) {
            str16 = linkDeviceInfoJson.version;
        }
        if ((i3 & 64) != 0) {
            str17 = linkDeviceInfoJson.build_sha;
        }
        if ((i3 & 128) != 0) {
            i4 = linkDeviceInfoJson.pairing_protocol;
        }
        if ((i3 & 256) != 0) {
            num4 = linkDeviceInfoJson.pairing_transcript_version;
        }
        if ((i3 & 512) != 0) {
            z2 = linkDeviceInfoJson.pairing_required;
        }
        if ((i3 & 1024) != 0) {
            str18 = linkDeviceInfoJson.pairing_auth;
        }
        if ((i3 & 2048) != 0) {
            i5 = linkDeviceInfoJson.pairing_auth_epoch;
        }
        if ((i3 & 4096) != 0) {
            str19 = linkDeviceInfoJson.pairing_policy;
        }
        if ((i3 & 8192) != 0) {
            list2 = linkDeviceInfoJson.cipher_suites;
        }
        if ((i3 & 16384) != 0) {
            bool3 = linkDeviceInfoJson.ota_supported;
        }
        if ((i3 & 32768) != 0) {
            str20 = linkDeviceInfoJson.wifi;
        }
        if ((i3 & 65536) != 0) {
            num5 = linkDeviceInfoJson.mgcommands;
        }
        if ((i3 & 131072) != 0) {
            num6 = linkDeviceInfoJson.device_key_auth;
        }
        if ((i3 & 262144) != 0) {
            bool4 = linkDeviceInfoJson.cvm_supported;
        }
        String str21 = str17;
        return linkDeviceInfoJson.copy(str11, str12, str13, str14, str15, str16, str21, i4, num4, z2, str18, i5, str19, list2, bool3, str20, num5, num6, bool4);
    }

    public /* synthetic */ LinkDeviceInfoJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Integer num, boolean z, String str8, int i3, String str9, List list, Boolean bool, String str10, Integer num2, Integer num3, Boolean bool2, C2hx c2hx) {
        List list2 = list;
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.node_id = "";
        } else {
            this.node_id = str2;
        }
        if ((i & 4) == 0) {
            this.device_id = "";
        } else {
            this.device_id = str3;
        }
        if ((i & 8) == 0) {
            this.mac = "";
        } else {
            this.mac = str4;
        }
        if ((i & 16) == 0) {
            this.model = "";
        } else {
            this.model = str5;
        }
        if ((i & 32) == 0) {
            this.version = "";
        } else {
            this.version = str6;
        }
        if ((i & 64) == 0) {
            this.build_sha = "";
        } else {
            this.build_sha = str7;
        }
        if ((i & 128) == 0) {
            this.pairing_protocol = 0;
        } else {
            this.pairing_protocol = i2;
        }
        if ((i & 256) == 0) {
            this.pairing_transcript_version = null;
        } else {
            this.pairing_transcript_version = num;
        }
        if ((i & 512) == 0) {
            this.pairing_required = false;
        } else {
            this.pairing_required = z;
        }
        if ((i & 1024) == 0) {
            this.pairing_auth = "";
        } else {
            this.pairing_auth = str8;
        }
        if ((i & 2048) == 0) {
            this.pairing_auth_epoch = -1;
        } else {
            this.pairing_auth_epoch = i3;
        }
        if ((i & 4096) == 0) {
            this.pairing_policy = null;
        } else {
            this.pairing_policy = str9;
        }
        this.cipher_suites = (i & 8192) == 0 ? C0881AGi.A00 : list2;
        if ((i & 16384) == 0) {
            this.ota_supported = null;
        } else {
            this.ota_supported = bool;
        }
        if ((32768 & i) == 0) {
            this.wifi = null;
        } else {
            this.wifi = str10;
        }
        if ((65536 & i) == 0) {
            this.mgcommands = null;
        } else {
            this.mgcommands = num2;
        }
        if ((131072 & i) == 0) {
            this.device_key_auth = null;
        } else {
            this.device_key_auth = num3;
        }
        if ((i & 262144) == 0) {
            this.cvm_supported = null;
        } else {
            this.cvm_supported = bool2;
        }
    }

    public /* synthetic */ LinkDeviceInfoJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, boolean z, String str8, int i2, String str9, List list, Boolean bool, String str10, Integer num2, Integer num3, Boolean bool2, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? null : num, (i3 & 512) == 0 ? z : false, (i3 & 1024) == 0 ? str8 : "", (i3 & 2048) != 0 ? -1 : i2, C3cG.A0e(str9, i3 & 4096), (i3 & 8192) != 0 ? C0881AGi.A00 : list, (i3 & 16384) != 0 ? null : bool, C3cG.A0e(str10, i3 & 32768), (i3 & 65536) != 0 ? null : num2, (i3 & 131072) != 0 ? null : num3, (i3 & 262144) != 0 ? null : bool2);
    }

    public LinkDeviceInfoJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, boolean z, String str8, int i2, String str9, List<String> list, Boolean bool, String str10, Integer num2, Integer num3, Boolean bool2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, str7);
        C7384Etj.A0Y(str8, 10);
        C7384Etj.A0Y(list, 13);
        this.type = str;
        this.node_id = str2;
        this.device_id = str3;
        this.mac = str4;
        this.model = str5;
        this.version = str6;
        this.build_sha = str7;
        this.pairing_protocol = i;
        this.pairing_transcript_version = num;
        this.pairing_required = z;
        this.pairing_auth = str8;
        this.pairing_auth_epoch = i2;
        this.pairing_policy = str9;
        this.cipher_suites = list;
        this.ota_supported = bool;
        this.wifi = str10;
        this.mgcommands = num2;
        this.device_key_auth = num3;
        this.cvm_supported = bool2;
    }
}
