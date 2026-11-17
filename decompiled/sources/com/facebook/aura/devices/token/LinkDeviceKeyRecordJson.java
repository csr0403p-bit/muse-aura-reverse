package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkDeviceKeyRecordJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long created_at_ms;
    public final String device_family;
    public final String key_id;
    public final String label;
    public final Long last_seen_at_ms;
    public final String node_id;
    public final String role;

    public final class Companion {
        public final C9hr<LinkDeviceKeyRecordJson> serializer() {
            return LinkDeviceKeyRecordJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyRecordJson linkDeviceKeyRecordJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(linkDeviceKeyRecordJson.key_id)) {
            c9j5.AAV(linkDeviceKeyRecordJson.key_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(linkDeviceKeyRecordJson.role)) {
            c9j5.AAV(linkDeviceKeyRecordJson.role, c9iZ, 1);
        }
        if (zAfR || !"".equals(linkDeviceKeyRecordJson.label)) {
            c9j5.AAV(linkDeviceKeyRecordJson.label, c9iZ, 2);
        }
        if (zAfR || !"".equals(linkDeviceKeyRecordJson.node_id)) {
            c9j5.AAV(linkDeviceKeyRecordJson.node_id, c9iZ, 3);
        }
        if (zAfR || !"".equals(linkDeviceKeyRecordJson.device_family)) {
            c9j5.AAV(linkDeviceKeyRecordJson.device_family, c9iZ, 4);
        }
        if (zAfR || linkDeviceKeyRecordJson.created_at_ms != 0) {
            c9j5.AAN(c9iZ, 5, linkDeviceKeyRecordJson.created_at_ms);
        }
        if (zAfR || linkDeviceKeyRecordJson.last_seen_at_ms != null) {
            c9j5.AAP(linkDeviceKeyRecordJson.last_seen_at_ms, C9j1.A00, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyRecordJson) {
                LinkDeviceKeyRecordJson linkDeviceKeyRecordJson = (LinkDeviceKeyRecordJson) obj;
                if (!C7384Etj.areEqual(this.key_id, linkDeviceKeyRecordJson.key_id) || !C7384Etj.areEqual(this.role, linkDeviceKeyRecordJson.role) || !C7384Etj.areEqual(this.label, linkDeviceKeyRecordJson.label) || !C7384Etj.areEqual(this.node_id, linkDeviceKeyRecordJson.node_id) || !C7384Etj.areEqual(this.device_family, linkDeviceKeyRecordJson.device_family) || this.created_at_ms != linkDeviceKeyRecordJson.created_at_ms || !C7384Etj.areEqual(this.last_seen_at_ms, linkDeviceKeyRecordJson.last_seen_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyRecordJson copy$default(LinkDeviceKeyRecordJson linkDeviceKeyRecordJson, String str, String str2, String str3, String str4, String str5, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyRecordJson.key_id;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyRecordJson.role;
        }
        if ((i & 4) != 0) {
            str3 = linkDeviceKeyRecordJson.label;
        }
        if ((i & 8) != 0) {
            str4 = linkDeviceKeyRecordJson.node_id;
        }
        if ((i & 16) != 0) {
            str5 = linkDeviceKeyRecordJson.device_family;
        }
        if ((i & 32) != 0) {
            j = linkDeviceKeyRecordJson.created_at_ms;
        }
        if ((i & 64) != 0) {
            l = linkDeviceKeyRecordJson.last_seen_at_ms;
        }
        return linkDeviceKeyRecordJson.copy(str, str2, str3, str4, str5, j, l);
    }

    public final String component1() {
        return this.key_id;
    }

    public final String component2() {
        return this.role;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.node_id;
    }

    public final String component5() {
        return this.device_family;
    }

    public final long component6() {
        return this.created_at_ms;
    }

    public final Long component7() {
        return this.last_seen_at_ms;
    }

    public final long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final String getDevice_family() {
        return this.device_family;
    }

    public final String getKey_id() {
        return this.key_id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Long getLast_seen_at_ms() {
        return this.last_seen_at_ms;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return C60R.A00(this.created_at_ms, AnonymousClass005.A0I(this.device_family, AnonymousClass005.A0I(this.node_id, AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.key_id)))))) + AnonymousClass006.A0D(this.last_seen_at_ms);
    }

    public LinkDeviceKeyRecordJson(String str, String str2, String str3, String str4, String str5, long j, Long l) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.key_id = str;
        this.role = str2;
        this.label = str3;
        this.node_id = str4;
        this.device_family = str5;
        this.created_at_ms = j;
        this.last_seen_at_ms = l;
    }

    public final LinkDeviceKeyRecordJson copy(String str, String str2, String str3, String str4, String str5, long j, Long l) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new LinkDeviceKeyRecordJson(str, str2, str3, str4, str5, j, l);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkDeviceKeyRecordJson(String str, String str2, String str3, String str4, String str5, long j, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? null : l);
    }

    public /* synthetic */ LinkDeviceKeyRecordJson(int i, String str, String str2, String str3, String str4, String str5, long j, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key_id = "";
        } else {
            this.key_id = str;
        }
        if ((i & 2) == 0) {
            this.role = "";
        } else {
            this.role = str2;
        }
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.node_id = "";
        } else {
            this.node_id = str4;
        }
        if ((i & 16) == 0) {
            this.device_family = "";
        } else {
            this.device_family = str5;
        }
        if ((i & 32) == 0) {
            this.created_at_ms = 0L;
        } else {
            this.created_at_ms = j;
        }
        if ((i & 64) == 0) {
            this.last_seen_at_ms = null;
        } else {
            this.last_seen_at_ms = l;
        }
    }

    public LinkDeviceKeyRecordJson() {
        this("", "", "", "", "", 0L, null);
    }
}
