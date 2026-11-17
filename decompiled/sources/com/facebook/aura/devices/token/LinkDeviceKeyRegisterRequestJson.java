package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class LinkDeviceKeyRegisterRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_family;
    public final String label;
    public final String node_id;
    public final String replace_key_id;
    public final String role;

    public final class Companion {
        public final C9hr<LinkDeviceKeyRegisterRequestJson> serializer() {
            return LinkDeviceKeyRegisterRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyRegisterRequestJson linkDeviceKeyRegisterRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(linkDeviceKeyRegisterRequestJson.role, c9iZ, 0);
        c9j5.AAV(linkDeviceKeyRegisterRequestJson.label, c9iZ, 1);
        c9j5.AAV(linkDeviceKeyRegisterRequestJson.node_id, c9iZ, 2);
        c9j5.AAV(linkDeviceKeyRegisterRequestJson.device_family, c9iZ, 3);
        if (c9j5.AfR() || linkDeviceKeyRegisterRequestJson.replace_key_id != null) {
            c9j5.AAP(linkDeviceKeyRegisterRequestJson.replace_key_id, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyRegisterRequestJson) {
                LinkDeviceKeyRegisterRequestJson linkDeviceKeyRegisterRequestJson = (LinkDeviceKeyRegisterRequestJson) obj;
                if (!C7384Etj.areEqual(this.role, linkDeviceKeyRegisterRequestJson.role) || !C7384Etj.areEqual(this.label, linkDeviceKeyRegisterRequestJson.label) || !C7384Etj.areEqual(this.node_id, linkDeviceKeyRegisterRequestJson.node_id) || !C7384Etj.areEqual(this.device_family, linkDeviceKeyRegisterRequestJson.device_family) || !C7384Etj.areEqual(this.replace_key_id, linkDeviceKeyRegisterRequestJson.replace_key_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LinkDeviceKeyRegisterRequestJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(LinkDeviceKeyRegisterRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.role = str;
        this.label = str2;
        this.node_id = str3;
        this.device_family = str4;
        this.replace_key_id = (i & 16) == 0 ? null : str5;
    }

    public static /* synthetic */ LinkDeviceKeyRegisterRequestJson copy$default(LinkDeviceKeyRegisterRequestJson linkDeviceKeyRegisterRequestJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyRegisterRequestJson.role;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyRegisterRequestJson.label;
        }
        if ((i & 4) != 0) {
            str3 = linkDeviceKeyRegisterRequestJson.node_id;
        }
        if ((i & 8) != 0) {
            str4 = linkDeviceKeyRegisterRequestJson.device_family;
        }
        if ((i & 16) != 0) {
            str5 = linkDeviceKeyRegisterRequestJson.replace_key_id;
        }
        return linkDeviceKeyRegisterRequestJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.node_id;
    }

    public final String component4() {
        return this.device_family;
    }

    public final String component5() {
        return this.replace_key_id;
    }

    public final String getDevice_family() {
        return this.device_family;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getReplace_key_id() {
        return this.replace_key_id;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.device_family, AnonymousClass005.A0I(this.node_id, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.role)))) + AnonymousClass006.A0G(this.replace_key_id);
    }

    public final LinkDeviceKeyRegisterRequestJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new LinkDeviceKeyRegisterRequestJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public LinkDeviceKeyRegisterRequestJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.role = str;
        this.label = str2;
        this.node_id = str3;
        this.device_family = str4;
        this.replace_key_id = str5;
    }

    public /* synthetic */ LinkDeviceKeyRegisterRequestJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }
}
