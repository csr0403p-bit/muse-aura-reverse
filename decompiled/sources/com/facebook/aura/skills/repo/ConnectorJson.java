package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.skills.model.ConnectorGroup;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConnectorJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ConnectorConsentJson consent;
    public final String description;
    public final String group;
    public final String icon_url;
    public final String id;
    public final boolean is_custom;
    public final String name;
    public final boolean needs_reauth;
    public final String state;
    public final boolean supports_multiple_accounts;

    public final class Companion {
        public final C9hr<ConnectorJson> serializer() {
            return ConnectorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectorJson() {
        this("", "", null, null, false, false, "", null, false, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorJson connectorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectorJson.id)) {
            c9j5.AAV(connectorJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectorJson.name)) {
            c9j5.AAV(connectorJson.name, c9iZ, 1);
        }
        if (zAfR || connectorJson.description != null) {
            c9j5.AAP(connectorJson.description, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || connectorJson.icon_url != null) {
            c9j5.AAP(connectorJson.icon_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || connectorJson.supports_multiple_accounts) {
            c9j5.AA7(c9iZ, 4, connectorJson.supports_multiple_accounts);
        }
        if (zAfR || connectorJson.is_custom) {
            c9j5.AA7(c9iZ, 5, connectorJson.is_custom);
        }
        if (zAfR || !"".equals(connectorJson.state)) {
            c9j5.AAV(connectorJson.state, c9iZ, 6);
        }
        if (zAfR || connectorJson.consent != null) {
            c9j5.AAP(connectorJson.consent, ConnectorConsentJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || connectorJson.needs_reauth) {
            c9j5.AA7(c9iZ, 8, connectorJson.needs_reauth);
        }
        if (zAfR || connectorJson.group != null) {
            c9j5.AAP(connectorJson.group, C07779iq.A01, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorJson) {
                ConnectorJson connectorJson = (ConnectorJson) obj;
                if (!C7384Etj.areEqual(this.id, connectorJson.id) || !C7384Etj.areEqual(this.name, connectorJson.name) || !C7384Etj.areEqual(this.description, connectorJson.description) || !C7384Etj.areEqual(this.icon_url, connectorJson.icon_url) || this.supports_multiple_accounts != connectorJson.supports_multiple_accounts || this.is_custom != connectorJson.is_custom || !C7384Etj.areEqual(this.state, connectorJson.state) || !C7384Etj.areEqual(this.consent, connectorJson.consent) || this.needs_reauth != connectorJson.needs_reauth || !C7384Etj.areEqual(this.group, connectorJson.group)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorJson copy$default(ConnectorJson connectorJson, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, ConnectorConsentJson connectorConsentJson, boolean z3, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorJson.id;
        }
        if ((i & 2) != 0) {
            str2 = connectorJson.name;
        }
        if ((i & 4) != 0) {
            str3 = connectorJson.description;
        }
        if ((i & 8) != 0) {
            str4 = connectorJson.icon_url;
        }
        if ((i & 16) != 0) {
            z = connectorJson.supports_multiple_accounts;
        }
        if ((i & 32) != 0) {
            z2 = connectorJson.is_custom;
        }
        if ((i & 64) != 0) {
            str5 = connectorJson.state;
        }
        if ((i & 128) != 0) {
            connectorConsentJson = connectorJson.consent;
        }
        if ((i & 256) != 0) {
            z3 = connectorJson.needs_reauth;
        }
        if ((i & 512) != 0) {
            str6 = connectorJson.group;
        }
        return connectorJson.copy(str, str2, str3, str4, z, z2, str5, connectorConsentJson, z3, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.group;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.icon_url;
    }

    public final boolean component5() {
        return this.supports_multiple_accounts;
    }

    public final boolean component6() {
        return this.is_custom;
    }

    public final String component7() {
        return this.state;
    }

    public final ConnectorConsentJson component8() {
        return this.consent;
    }

    public final boolean component9() {
        return this.needs_reauth;
    }

    public final ConnectorConsentJson getConsent() {
        return this.consent;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeeds_reauth() {
        return this.needs_reauth;
    }

    public final String getState() {
        return this.state;
    }

    public final boolean getSupports_multiple_accounts() {
        return this.supports_multiple_accounts;
    }

    public int hashCode() {
        return C0KA.A01((AnonymousClass005.A0I(this.state, C0KA.A01(C0KA.A01((((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.icon_url)) * 31, this.supports_multiple_accounts), this.is_custom)) + AnonymousClass006.A0D(this.consent)) * 31, this.needs_reauth) + AnonymousClass005.A0H(this.group);
    }

    public final boolean is_custom() {
        return this.is_custom;
    }

    public final Skill toDomain() {
        String str = this.id;
        if (str.length() == 0) {
            return null;
        }
        String strA0u = AnonymousClass001.A0u(this.state);
        SkillState skillState = strA0u.equals("connected") ? SkillState.CONNECTED : strA0u.equals("coming_soon") ? SkillState.COMING_SOON : SkillState.DISCONNECTED;
        String str2 = this.name;
        String str3 = this.description;
        if (str3 == null) {
            str3 = "";
        }
        boolean z = this.supports_multiple_accounts;
        String str4 = this.icon_url;
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        boolean z2 = this.is_custom;
        ConnectorConsentJson connectorConsentJson = this.consent;
        return new Skill(str, str2, str3, skillState, z, str4, z2, connectorConsentJson != null ? connectorConsentJson.toDomain() : null, this.needs_reauth, "optimized_sites".equals(this.group) ? ConnectorGroup.OPTIMIZED_SITES : null);
    }

    public final ConnectorJson copy(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, ConnectorConsentJson connectorConsentJson, boolean z3, String str6) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str5, 6);
        return new ConnectorJson(str, str2, str3, str4, z, z2, str5, connectorConsentJson, z3, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorJson(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, ConnectorConsentJson connectorConsentJson, boolean z3, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : connectorConsentJson, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : str6);
    }

    public ConnectorJson(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, ConnectorConsentJson connectorConsentJson, boolean z3, String str6) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str5, 6);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.icon_url = str4;
        this.supports_multiple_accounts = z;
        this.is_custom = z2;
        this.state = str5;
        this.consent = connectorConsentJson;
        this.needs_reauth = z3;
        this.group = str6;
    }

    public /* synthetic */ ConnectorJson(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, ConnectorConsentJson connectorConsentJson, boolean z3, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str4;
        }
        if ((i & 16) == 0) {
            this.supports_multiple_accounts = false;
        } else {
            this.supports_multiple_accounts = z;
        }
        if ((i & 32) == 0) {
            this.is_custom = false;
        } else {
            this.is_custom = z2;
        }
        if ((i & 64) == 0) {
            this.state = "";
        } else {
            this.state = str5;
        }
        if ((i & 128) == 0) {
            this.consent = null;
        } else {
            this.consent = connectorConsentJson;
        }
        if ((i & 256) == 0) {
            this.needs_reauth = false;
        } else {
            this.needs_reauth = z3;
        }
        if ((i & 512) == 0) {
            this.group = null;
        } else {
            this.group = str6;
        }
    }
}
