package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkProvisionV2Json extends C06G {
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String action;
    public final String api_url;
    public final String api_url_v2;
    public final String device_key;
    public final String device_key_id;
    public final String fleet_manager_url;
    public final String noise_host;
    public final Boolean ota_force;
    public final String ota_url;
    public final String password;
    public final String refresh_token;
    public final String ssid;
    public final String token_type;
    public final String username;
    public final String vm_id;
    public final String vm_kind;

    public final class Companion {
        public final C9hr<LinkProvisionV2Json> serializer() {
            return LinkProvisionV2Json$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkProvisionV2Json linkProvisionV2Json, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !LinkPairingProtocolStrings.ACTION_PROVISION_V2.equals(linkProvisionV2Json.action)) {
            c9j5.AAV(linkProvisionV2Json.action, c9iZ, 0);
        }
        if (zAfR || linkProvisionV2Json.ssid != null) {
            c9j5.AAP(linkProvisionV2Json.ssid, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || linkProvisionV2Json.password != null) {
            c9j5.AAP(linkProvisionV2Json.password, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAV(linkProvisionV2Json.access_token, c9iZ, 3);
        c9j5.AAV(linkProvisionV2Json.refresh_token, c9iZ, 4);
        if (zAfR || !"device".equals(linkProvisionV2Json.token_type)) {
            c9j5.AAV(linkProvisionV2Json.token_type, c9iZ, 5);
        }
        if (zAfR || linkProvisionV2Json.username != null) {
            c9j5.AAP(linkProvisionV2Json.username, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || linkProvisionV2Json.fleet_manager_url != null) {
            c9j5.AAP(linkProvisionV2Json.fleet_manager_url, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || linkProvisionV2Json.ota_url != null) {
            c9j5.AAP(linkProvisionV2Json.ota_url, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || linkProvisionV2Json.ota_force != null) {
            c9j5.AAP(linkProvisionV2Json.ota_force, C07839ix.A00, c9iZ, 9);
        }
        if (zAfR || linkProvisionV2Json.api_url != null) {
            c9j5.AAP(linkProvisionV2Json.api_url, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || linkProvisionV2Json.api_url_v2 != null) {
            c9j5.AAP(linkProvisionV2Json.api_url_v2, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || linkProvisionV2Json.noise_host != null) {
            c9j5.AAP(linkProvisionV2Json.noise_host, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || linkProvisionV2Json.device_key != null) {
            c9j5.AAP(linkProvisionV2Json.device_key, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || linkProvisionV2Json.device_key_id != null) {
            c9j5.AAP(linkProvisionV2Json.device_key_id, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || linkProvisionV2Json.vm_id != null) {
            c9j5.AAP(linkProvisionV2Json.vm_id, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || linkProvisionV2Json.vm_kind != null) {
            c9j5.AAP(linkProvisionV2Json.vm_kind, C07779iq.A01, c9iZ, 16);
        }
    }

    public final LinkProvisionV2Json copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        AnonymousClass005.A16(str, str4, str5, str6, 0);
        return new LinkProvisionV2Json(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkProvisionV2Json) {
                LinkProvisionV2Json linkProvisionV2Json = (LinkProvisionV2Json) obj;
                if (!C7384Etj.areEqual(this.action, linkProvisionV2Json.action) || !C7384Etj.areEqual(this.ssid, linkProvisionV2Json.ssid) || !C7384Etj.areEqual(this.password, linkProvisionV2Json.password) || !C7384Etj.areEqual(this.access_token, linkProvisionV2Json.access_token) || !C7384Etj.areEqual(this.refresh_token, linkProvisionV2Json.refresh_token) || !C7384Etj.areEqual(this.token_type, linkProvisionV2Json.token_type) || !C7384Etj.areEqual(this.username, linkProvisionV2Json.username) || !C7384Etj.areEqual(this.fleet_manager_url, linkProvisionV2Json.fleet_manager_url) || !C7384Etj.areEqual(this.ota_url, linkProvisionV2Json.ota_url) || !C7384Etj.areEqual(this.ota_force, linkProvisionV2Json.ota_force) || !C7384Etj.areEqual(this.api_url, linkProvisionV2Json.api_url) || !C7384Etj.areEqual(this.api_url_v2, linkProvisionV2Json.api_url_v2) || !C7384Etj.areEqual(this.noise_host, linkProvisionV2Json.noise_host) || !C7384Etj.areEqual(this.device_key, linkProvisionV2Json.device_key) || !C7384Etj.areEqual(this.device_key_id, linkProvisionV2Json.device_key_id) || !C7384Etj.areEqual(this.vm_id, linkProvisionV2Json.vm_id) || !C7384Etj.areEqual(this.vm_kind, linkProvisionV2Json.vm_kind)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LinkProvisionV2Json(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, C06H c06h) {
        this((i & 1) != 0 ? LinkPairingProtocolStrings.ACTION_PROVISION_V2 : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5, (i & 32) != 0 ? "device" : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, (i & 65536) != 0 ? null : str16);
    }

    public static /* synthetic */ LinkProvisionV2Json copy$default(LinkProvisionV2Json linkProvisionV2Json, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        Boolean bool2 = bool;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str15;
        String str32 = str16;
        if ((i & 1) != 0) {
            str17 = linkProvisionV2Json.action;
        }
        if ((i & 2) != 0) {
            str18 = linkProvisionV2Json.ssid;
        }
        if ((i & 4) != 0) {
            str19 = linkProvisionV2Json.password;
        }
        if ((i & 8) != 0) {
            str20 = linkProvisionV2Json.access_token;
        }
        if ((i & 16) != 0) {
            str21 = linkProvisionV2Json.refresh_token;
        }
        if ((i & 32) != 0) {
            str22 = linkProvisionV2Json.token_type;
        }
        if ((i & 64) != 0) {
            str23 = linkProvisionV2Json.username;
        }
        if ((i & 128) != 0) {
            str24 = linkProvisionV2Json.fleet_manager_url;
        }
        if ((i & 256) != 0) {
            str25 = linkProvisionV2Json.ota_url;
        }
        if ((i & 512) != 0) {
            bool2 = linkProvisionV2Json.ota_force;
        }
        if ((i & 1024) != 0) {
            str26 = linkProvisionV2Json.api_url;
        }
        if ((i & 2048) != 0) {
            str27 = linkProvisionV2Json.api_url_v2;
        }
        if ((i & 4096) != 0) {
            str28 = linkProvisionV2Json.noise_host;
        }
        if ((i & 8192) != 0) {
            str29 = linkProvisionV2Json.device_key;
        }
        if ((i & 16384) != 0) {
            str30 = linkProvisionV2Json.device_key_id;
        }
        if ((i & 32768) != 0) {
            str31 = linkProvisionV2Json.vm_id;
        }
        if ((i & 65536) != 0) {
            str32 = linkProvisionV2Json.vm_kind;
        }
        String str33 = str21;
        return linkProvisionV2Json.copy(str17, str18, str19, str20, str33, str22, str23, str24, str25, bool2, str26, str27, str28, str29, str30, str31, str32);
    }

    public final String component1() {
        return this.action;
    }

    public final Boolean component10() {
        return this.ota_force;
    }

    public final String component11() {
        return this.api_url;
    }

    public final String component12() {
        return this.api_url_v2;
    }

    public final String component13() {
        return this.noise_host;
    }

    public final String component14() {
        return this.device_key;
    }

    public final String component15() {
        return this.device_key_id;
    }

    public final String component16() {
        return this.vm_id;
    }

    public final String component17() {
        return this.vm_kind;
    }

    public final String component2() {
        return this.ssid;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.access_token;
    }

    public final String component5() {
        return this.refresh_token;
    }

    public final String component6() {
        return this.token_type;
    }

    public final String component7() {
        return this.username;
    }

    public final String component8() {
        return this.fleet_manager_url;
    }

    public final String component9() {
        return this.ota_url;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getApi_url() {
        return this.api_url;
    }

    public final String getApi_url_v2() {
        return this.api_url_v2;
    }

    public final String getDevice_key() {
        return this.device_key;
    }

    public final String getDevice_key_id() {
        return this.device_key_id;
    }

    public final String getFleet_manager_url() {
        return this.fleet_manager_url;
    }

    public final String getNoise_host() {
        return this.noise_host;
    }

    public final Boolean getOta_force() {
        return this.ota_force;
    }

    public final String getOta_url() {
        return this.ota_url;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public final String getToken_type() {
        return this.token_type;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public final String getVm_kind() {
        return this.vm_kind;
    }

    public int hashCode() {
        return ((((((((((((((((((((AnonymousClass005.A0I(this.token_type, AnonymousClass005.A0I(this.refresh_token, AnonymousClass005.A0I(this.access_token, (((AnonymousClass001.A0G(this.action) + AnonymousClass006.A0G(this.ssid)) * 31) + AnonymousClass006.A0G(this.password)) * 31))) + AnonymousClass006.A0G(this.username)) * 31) + AnonymousClass006.A0G(this.fleet_manager_url)) * 31) + AnonymousClass006.A0G(this.ota_url)) * 31) + AnonymousClass006.A0D(this.ota_force)) * 31) + AnonymousClass006.A0G(this.api_url)) * 31) + AnonymousClass006.A0G(this.api_url_v2)) * 31) + AnonymousClass006.A0G(this.noise_host)) * 31) + AnonymousClass006.A0G(this.device_key)) * 31) + AnonymousClass006.A0G(this.device_key_id)) * 31) + AnonymousClass006.A0G(this.vm_id)) * 31) + AnonymousClass005.A0H(this.vm_kind);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkProvisionV2Json(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, C2hx c2hx) {
        if (24 != (i & 24)) {
            C9iI.A00(LinkProvisionV2Json$$serializer.descriptor, i, 24);
            throw F60.createAndThrow();
        }
        this.action = (i & 1) == 0 ? LinkPairingProtocolStrings.ACTION_PROVISION_V2 : str;
        if ((i & 2) == 0) {
            this.ssid = null;
        } else {
            this.ssid = str2;
        }
        if ((i & 4) == 0) {
            this.password = null;
        } else {
            this.password = str3;
        }
        this.access_token = str4;
        this.refresh_token = str5;
        if ((i & 32) == 0) {
            this.token_type = "device";
        } else {
            this.token_type = str6;
        }
        if ((i & 64) == 0) {
            this.username = null;
        } else {
            this.username = str7;
        }
        if ((i & 128) == 0) {
            this.fleet_manager_url = null;
        } else {
            this.fleet_manager_url = str8;
        }
        if ((i & 256) == 0) {
            this.ota_url = null;
        } else {
            this.ota_url = str9;
        }
        if ((i & 512) == 0) {
            this.ota_force = null;
        } else {
            this.ota_force = bool;
        }
        if ((i & 1024) == 0) {
            this.api_url = null;
        } else {
            this.api_url = str10;
        }
        if ((i & 2048) == 0) {
            this.api_url_v2 = null;
        } else {
            this.api_url_v2 = str11;
        }
        if ((i & 4096) == 0) {
            this.noise_host = null;
        } else {
            this.noise_host = str12;
        }
        if ((i & 8192) == 0) {
            this.device_key = null;
        } else {
            this.device_key = str13;
        }
        if ((i & 16384) == 0) {
            this.device_key_id = null;
        } else {
            this.device_key_id = str14;
        }
        if ((32768 & i) == 0) {
            this.vm_id = null;
        } else {
            this.vm_id = str15;
        }
        if ((i & 65536) == 0) {
            this.vm_kind = null;
        } else {
            this.vm_kind = str16;
        }
    }

    public LinkProvisionV2Json(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        AnonymousClass005.A16(str, str4, str5, str6, 0);
        this.action = str;
        this.ssid = str2;
        this.password = str3;
        this.access_token = str4;
        this.refresh_token = str5;
        this.token_type = str6;
        this.username = str7;
        this.fleet_manager_url = str8;
        this.ota_url = str9;
        this.ota_force = bool;
        this.api_url = str10;
        this.api_url_v2 = str11;
        this.noise_host = str12;
        this.device_key = str13;
        this.device_key_id = str14;
        this.vm_id = str15;
        this.vm_kind = str16;
    }
}
