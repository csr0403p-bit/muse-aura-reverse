package com.facebook.aura.devices.token;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkDeviceKeyRevokeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String key_id;
    public final String node_id;

    public final class Companion {
        public final C9hr<LinkDeviceKeyRevokeRequestJson> serializer() {
            return LinkDeviceKeyRevokeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyRevokeRequestJson linkDeviceKeyRevokeRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || linkDeviceKeyRevokeRequestJson.key_id != null) {
            c9j5.AAP(linkDeviceKeyRevokeRequestJson.key_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || linkDeviceKeyRevokeRequestJson.node_id != null) {
            c9j5.AAP(linkDeviceKeyRevokeRequestJson.node_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyRevokeRequestJson) {
                LinkDeviceKeyRevokeRequestJson linkDeviceKeyRevokeRequestJson = (LinkDeviceKeyRevokeRequestJson) obj;
                if (!C7384Etj.areEqual(this.key_id, linkDeviceKeyRevokeRequestJson.key_id) || !C7384Etj.areEqual(this.node_id, linkDeviceKeyRevokeRequestJson.node_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyRevokeRequestJson copy$default(LinkDeviceKeyRevokeRequestJson linkDeviceKeyRevokeRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyRevokeRequestJson.key_id;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyRevokeRequestJson.node_id;
        }
        return new LinkDeviceKeyRevokeRequestJson(str, str2);
    }

    public final String component1() {
        return this.key_id;
    }

    public final String component2() {
        return this.node_id;
    }

    public final LinkDeviceKeyRevokeRequestJson copy(String str, String str2) {
        return new LinkDeviceKeyRevokeRequestJson(str, str2);
    }

    public final String getKey_id() {
        return this.key_id;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.key_id) * 31) + AnonymousClass005.A0H(this.node_id);
    }

    public LinkDeviceKeyRevokeRequestJson(String str, String str2) {
        this.key_id = str;
        this.node_id = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkDeviceKeyRevokeRequestJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key_id = null;
        } else {
            this.key_id = str;
        }
        if ((i & 2) == 0) {
            this.node_id = null;
        } else {
            this.node_id = str2;
        }
    }

    public /* synthetic */ LinkDeviceKeyRevokeRequestJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public LinkDeviceKeyRevokeRequestJson() {
        this(null, null);
    }
}
