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
public final class LinkDeviceKeyPendingRevokeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int attempts;
    public final String host_label;
    public final String key_id;
    public final String node_id;
    public final String vm_id;
    public final String vm_kind;

    public final class Companion {
        public final C9hr<LinkDeviceKeyPendingRevokeJson> serializer() {
            return LinkDeviceKeyPendingRevokeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(linkDeviceKeyPendingRevokeJson.host_label, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || linkDeviceKeyPendingRevokeJson.vm_id != null) {
            c9j5.AAP(linkDeviceKeyPendingRevokeJson.vm_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || linkDeviceKeyPendingRevokeJson.vm_kind != null) {
            c9j5.AAP(linkDeviceKeyPendingRevokeJson.vm_kind, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || linkDeviceKeyPendingRevokeJson.key_id != null) {
            c9j5.AAP(linkDeviceKeyPendingRevokeJson.key_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || linkDeviceKeyPendingRevokeJson.node_id != null) {
            c9j5.AAP(linkDeviceKeyPendingRevokeJson.node_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || linkDeviceKeyPendingRevokeJson.attempts != 0) {
            c9j5.AAK(c9iZ, 5, linkDeviceKeyPendingRevokeJson.attempts);
        }
    }

    public final LinkDeviceKeyPendingRevokeJson copy(String str, String str2, String str3, String str4, String str5, int i) {
        C7384Etj.A0Y(str, 0);
        return new LinkDeviceKeyPendingRevokeJson(str, str2, str3, str4, str5, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyPendingRevokeJson) {
                LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson = (LinkDeviceKeyPendingRevokeJson) obj;
                if (!C7384Etj.areEqual(this.host_label, linkDeviceKeyPendingRevokeJson.host_label) || !C7384Etj.areEqual(this.vm_id, linkDeviceKeyPendingRevokeJson.vm_id) || !C7384Etj.areEqual(this.vm_kind, linkDeviceKeyPendingRevokeJson.vm_kind) || !C7384Etj.areEqual(this.key_id, linkDeviceKeyPendingRevokeJson.key_id) || !C7384Etj.areEqual(this.node_id, linkDeviceKeyPendingRevokeJson.node_id) || this.attempts != linkDeviceKeyPendingRevokeJson.attempts) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LinkDeviceKeyPendingRevokeJson(int i, String str, String str2, String str3, String str4, String str5, int i2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LinkDeviceKeyPendingRevokeJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.host_label = str;
        if ((i & 2) == 0) {
            this.vm_id = null;
        } else {
            this.vm_id = str2;
        }
        if ((i & 4) == 0) {
            this.vm_kind = null;
        } else {
            this.vm_kind = str3;
        }
        if ((i & 8) == 0) {
            this.key_id = null;
        } else {
            this.key_id = str4;
        }
        if ((i & 16) == 0) {
            this.node_id = null;
        } else {
            this.node_id = str5;
        }
        if ((i & 32) == 0) {
            this.attempts = 0;
        } else {
            this.attempts = i2;
        }
    }

    public static /* synthetic */ LinkDeviceKeyPendingRevokeJson copy$default(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = linkDeviceKeyPendingRevokeJson.host_label;
        }
        if ((i2 & 2) != 0) {
            str2 = linkDeviceKeyPendingRevokeJson.vm_id;
        }
        if ((i2 & 4) != 0) {
            str3 = linkDeviceKeyPendingRevokeJson.vm_kind;
        }
        if ((i2 & 8) != 0) {
            str4 = linkDeviceKeyPendingRevokeJson.key_id;
        }
        if ((i2 & 16) != 0) {
            str5 = linkDeviceKeyPendingRevokeJson.node_id;
        }
        if ((i2 & 32) != 0) {
            i = linkDeviceKeyPendingRevokeJson.attempts;
        }
        return linkDeviceKeyPendingRevokeJson.copy(str, str2, str3, str4, str5, i);
    }

    public final String component1() {
        return this.host_label;
    }

    public final String component2() {
        return this.vm_id;
    }

    public final String component3() {
        return this.vm_kind;
    }

    public final String component4() {
        return this.key_id;
    }

    public final String component5() {
        return this.node_id;
    }

    public final int component6() {
        return this.attempts;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final String getHost_label() {
        return this.host_label;
    }

    public final String getKey_id() {
        return this.key_id;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public final String getVm_kind() {
        return this.vm_kind;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.host_label) + AnonymousClass006.A0G(this.vm_id)) * 31) + AnonymousClass006.A0G(this.vm_kind)) * 31) + AnonymousClass006.A0G(this.key_id)) * 31) + AnonymousClass005.A0H(this.node_id)) * 31) + this.attempts;
    }

    public String toString() {
        return super.toString();
    }

    public LinkDeviceKeyPendingRevokeJson(String str, String str2, String str3, String str4, String str5, int i) {
        C7384Etj.A0Y(str, 0);
        this.host_label = str;
        this.vm_id = str2;
        this.vm_kind = str3;
        this.key_id = str4;
        this.node_id = str5;
        this.attempts = i;
    }

    public /* synthetic */ LinkDeviceKeyPendingRevokeJson(String str, String str2, String str3, String str4, String str5, int i, int i2, C06H c06h) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 0 : i);
    }
}
