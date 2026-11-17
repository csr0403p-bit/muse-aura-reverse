package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectorAccountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_id;
    public final String avatar_url;
    public final boolean connected;
    public final String display_name;
    public final boolean is_default;
    public final boolean needs_reauth;

    public final class Companion {
        public final C9hr<ConnectorAccountJson> serializer() {
            return ConnectorAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectorAccountJson(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        C7384Etj.A0Y(str, 0);
        this.account_id = str;
        this.display_name = str2;
        this.is_default = z;
        this.connected = z2;
        this.avatar_url = str3;
        this.needs_reauth = z3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorAccountJson connectorAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(connectorAccountJson.account_id)) {
            c9j5.AAV(connectorAccountJson.account_id, c9iZ, 0);
        }
        if (zAfR || connectorAccountJson.display_name != null) {
            c9j5.AAP(connectorAccountJson.display_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || connectorAccountJson.is_default) {
            c9j5.AA7(c9iZ, 2, connectorAccountJson.is_default);
        }
        if (zAfR || !connectorAccountJson.connected) {
            c9j5.AA7(c9iZ, 3, connectorAccountJson.connected);
        }
        if (zAfR || connectorAccountJson.avatar_url != null) {
            c9j5.AAP(connectorAccountJson.avatar_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || connectorAccountJson.needs_reauth) {
            c9j5.AA7(c9iZ, 5, connectorAccountJson.needs_reauth);
        }
    }

    public final ConnectorAccountJson copy(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        C7384Etj.A0Y(str, 0);
        return new ConnectorAccountJson(str, str2, z, z2, str3, z3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorAccountJson) {
                ConnectorAccountJson connectorAccountJson = (ConnectorAccountJson) obj;
                if (!C7384Etj.areEqual(this.account_id, connectorAccountJson.account_id) || !C7384Etj.areEqual(this.display_name, connectorAccountJson.display_name) || this.is_default != connectorAccountJson.is_default || this.connected != connectorAccountJson.connected || !C7384Etj.areEqual(this.avatar_url, connectorAccountJson.avatar_url) || this.needs_reauth != connectorAccountJson.needs_reauth) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorAccountJson copy$default(ConnectorAccountJson connectorAccountJson, String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorAccountJson.account_id;
        }
        if ((i & 2) != 0) {
            str2 = connectorAccountJson.display_name;
        }
        if ((i & 4) != 0) {
            z = connectorAccountJson.is_default;
        }
        if ((i & 8) != 0) {
            z2 = connectorAccountJson.connected;
        }
        if ((i & 16) != 0) {
            str3 = connectorAccountJson.avatar_url;
        }
        if ((i & 32) != 0) {
            z3 = connectorAccountJson.needs_reauth;
        }
        return connectorAccountJson.copy(str, str2, z, z2, str3, z3);
    }

    public final String component1() {
        return this.account_id;
    }

    public final String component2() {
        return this.display_name;
    }

    public final boolean component3() {
        return this.is_default;
    }

    public final boolean component4() {
        return this.connected;
    }

    public final String component5() {
        return this.avatar_url;
    }

    public final boolean component6() {
        return this.needs_reauth;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final boolean getNeeds_reauth() {
        return this.needs_reauth;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(C0KA.A01((AnonymousClass001.A0G(this.account_id) + AnonymousClass006.A0G(this.display_name)) * 31, this.is_default), this.connected) + AnonymousClass005.A0H(this.avatar_url)) * 31, this.needs_reauth);
    }

    public final boolean is_default() {
        return this.is_default;
    }

    public final ConnectorLinkedAccount toDomain() {
        String strA0l;
        String strA0l2;
        String strA0l3 = AnonymousClass002.A0l(this.account_id);
        if (strA0l3.length() <= 0) {
            return null;
        }
        String str = this.display_name;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = strA0l3;
        }
        String str2 = this.avatar_url;
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        return new ConnectorLinkedAccount(strA0l3, strA0l, strA0l2, this.connected, this.is_default, this.needs_reauth);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorAccountJson(String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : str3, AnonymousClass002.A1R(i, z3));
    }

    public /* synthetic */ ConnectorAccountJson(int i, String str, String str2, boolean z, boolean z2, String str3, boolean z3, C2hx c2hx) {
        this.account_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.is_default = false;
        } else {
            this.is_default = z;
        }
        if ((i & 8) == 0) {
            this.connected = true;
        } else {
            this.connected = z2;
        }
        if ((i & 16) == 0) {
            this.avatar_url = null;
        } else {
            this.avatar_url = str3;
        }
        if ((i & 32) == 0) {
            this.needs_reauth = false;
        } else {
            this.needs_reauth = z3;
        }
    }

    public ConnectorAccountJson() {
        this("", null, false, true, null, false);
    }
}
