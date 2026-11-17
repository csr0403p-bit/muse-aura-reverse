package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkDeviceKeyRegisterResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long created_at_ms;
    public final String device_key;
    public final String key_id;
    public final String node_id;
    public final String replaced_key_id;
    public final String role;
    public final String vm_id;

    public final class Companion {
        public final C9hr<LinkDeviceKeyRegisterResponseJson> serializer() {
            return LinkDeviceKeyRegisterResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyRegisterResponseJson linkDeviceKeyRegisterResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(linkDeviceKeyRegisterResponseJson.key_id)) {
            c9j5.AAV(linkDeviceKeyRegisterResponseJson.key_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(linkDeviceKeyRegisterResponseJson.device_key)) {
            c9j5.AAV(linkDeviceKeyRegisterResponseJson.device_key, c9iZ, 1);
        }
        if (zAfR || !"".equals(linkDeviceKeyRegisterResponseJson.role)) {
            c9j5.AAV(linkDeviceKeyRegisterResponseJson.role, c9iZ, 2);
        }
        if (zAfR || !"".equals(linkDeviceKeyRegisterResponseJson.node_id)) {
            c9j5.AAV(linkDeviceKeyRegisterResponseJson.node_id, c9iZ, 3);
        }
        if (zAfR || linkDeviceKeyRegisterResponseJson.created_at_ms != 0) {
            c9j5.AAN(c9iZ, 4, linkDeviceKeyRegisterResponseJson.created_at_ms);
        }
        if (zAfR || linkDeviceKeyRegisterResponseJson.vm_id != null) {
            c9j5.AAP(linkDeviceKeyRegisterResponseJson.vm_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || linkDeviceKeyRegisterResponseJson.replaced_key_id != null) {
            c9j5.AAP(linkDeviceKeyRegisterResponseJson.replaced_key_id, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyRegisterResponseJson) {
                LinkDeviceKeyRegisterResponseJson linkDeviceKeyRegisterResponseJson = (LinkDeviceKeyRegisterResponseJson) obj;
                if (!C7384Etj.areEqual(this.key_id, linkDeviceKeyRegisterResponseJson.key_id) || !C7384Etj.areEqual(this.device_key, linkDeviceKeyRegisterResponseJson.device_key) || !C7384Etj.areEqual(this.role, linkDeviceKeyRegisterResponseJson.role) || !C7384Etj.areEqual(this.node_id, linkDeviceKeyRegisterResponseJson.node_id) || this.created_at_ms != linkDeviceKeyRegisterResponseJson.created_at_ms || !C7384Etj.areEqual(this.vm_id, linkDeviceKeyRegisterResponseJson.vm_id) || !C7384Etj.areEqual(this.replaced_key_id, linkDeviceKeyRegisterResponseJson.replaced_key_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyRegisterResponseJson copy$default(LinkDeviceKeyRegisterResponseJson linkDeviceKeyRegisterResponseJson, String str, String str2, String str3, String str4, long j, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyRegisterResponseJson.key_id;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyRegisterResponseJson.device_key;
        }
        if ((i & 4) != 0) {
            str3 = linkDeviceKeyRegisterResponseJson.role;
        }
        if ((i & 8) != 0) {
            str4 = linkDeviceKeyRegisterResponseJson.node_id;
        }
        if ((i & 16) != 0) {
            j = linkDeviceKeyRegisterResponseJson.created_at_ms;
        }
        if ((i & 32) != 0) {
            str5 = linkDeviceKeyRegisterResponseJson.vm_id;
        }
        if ((i & 64) != 0) {
            str6 = linkDeviceKeyRegisterResponseJson.replaced_key_id;
        }
        return linkDeviceKeyRegisterResponseJson.copy(str, str2, str3, str4, j, str5, str6);
    }

    public final String component1() {
        return this.key_id;
    }

    public final String component2() {
        return this.device_key;
    }

    public final String component3() {
        return this.role;
    }

    public final String component4() {
        return this.node_id;
    }

    public final long component5() {
        return this.created_at_ms;
    }

    public final String component6() {
        return this.vm_id;
    }

    public final String component7() {
        return this.replaced_key_id;
    }

    public final long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final String getDevice_key() {
        return this.device_key;
    }

    public final String getKey_id() {
        return this.key_id;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getReplaced_key_id() {
        return this.replaced_key_id;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return ((C60R.A00(this.created_at_ms, AnonymousClass005.A0I(this.node_id, AnonymousClass005.A0I(this.role, AnonymousClass005.A0I(this.device_key, AnonymousClass001.A0G(this.key_id))))) + AnonymousClass006.A0G(this.vm_id)) * 31) + AnonymousClass005.A0H(this.replaced_key_id);
    }

    public LinkDeviceKeyRegisterResponseJson(String str, String str2, String str3, String str4, long j, String str5, String str6) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.key_id = str;
        this.device_key = str2;
        this.role = str3;
        this.node_id = str4;
        this.created_at_ms = j;
        this.vm_id = str5;
        this.replaced_key_id = str6;
    }

    public final LinkDeviceKeyRegisterResponseJson copy(String str, String str2, String str3, String str4, long j, String str5, String str6) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new LinkDeviceKeyRegisterResponseJson(str, str2, str3, str4, j, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkDeviceKeyRegisterResponseJson(String str, String str2, String str3, String str4, long j, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public /* synthetic */ LinkDeviceKeyRegisterResponseJson(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key_id = "";
        } else {
            this.key_id = str;
        }
        if ((i & 2) == 0) {
            this.device_key = "";
        } else {
            this.device_key = str2;
        }
        if ((i & 4) == 0) {
            this.role = "";
        } else {
            this.role = str3;
        }
        if ((i & 8) == 0) {
            this.node_id = "";
        } else {
            this.node_id = str4;
        }
        if ((i & 16) == 0) {
            this.created_at_ms = 0L;
        } else {
            this.created_at_ms = j;
        }
        if ((i & 32) == 0) {
            this.vm_id = null;
        } else {
            this.vm_id = str5;
        }
        if ((i & 64) == 0) {
            this.replaced_key_id = null;
        } else {
            this.replaced_key_id = str6;
        }
    }

    public LinkDeviceKeyRegisterResponseJson() {
        this("", "", "", "", 0L, null, null);
    }
}
