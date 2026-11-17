package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.skills.model.ConsentBullet;
import com.facebook.aura.skills.model.ConsentBulletIcon;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ConnectorConsentBulletJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String icon;
    public final String text;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectorConsentBulletJson> serializer() {
            return ConnectorConsentBulletJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorConsentBulletJson connectorConsentBulletJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectorConsentBulletJson.icon)) {
            c9j5.AAV(connectorConsentBulletJson.icon, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectorConsentBulletJson.text)) {
            c9j5.AAV(connectorConsentBulletJson.text, c9iZ, 1);
        }
        if (zAfR || connectorConsentBulletJson.title != null) {
            c9j5.AAP(connectorConsentBulletJson.title, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorConsentBulletJson) {
                ConnectorConsentBulletJson connectorConsentBulletJson = (ConnectorConsentBulletJson) obj;
                if (!C7384Etj.areEqual(this.icon, connectorConsentBulletJson.icon) || !C7384Etj.areEqual(this.text, connectorConsentBulletJson.text) || !C7384Etj.areEqual(this.title, connectorConsentBulletJson.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorConsentBulletJson copy$default(ConnectorConsentBulletJson connectorConsentBulletJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorConsentBulletJson.icon;
        }
        if ((i & 2) != 0) {
            str2 = connectorConsentBulletJson.text;
        }
        if ((i & 4) != 0) {
            str3 = connectorConsentBulletJson.title;
        }
        return connectorConsentBulletJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.title;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.icon)) + AnonymousClass006.A0G(this.title);
    }

    public final ConsentBullet toDomain() {
        ConsentBulletIcon consentBulletIcon = HatchConnectorCatalogRepositoryJsonKt.toConsentBulletIcon(this.icon);
        String str = this.text;
        String str2 = this.title;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        return new ConsentBullet(consentBulletIcon, str, str2);
    }

    public ConnectorConsentBulletJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.icon = str;
        this.text = str2;
        this.title = str3;
    }

    public final ConnectorConsentBulletJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new ConnectorConsentBulletJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorConsentBulletJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
    }

    public /* synthetic */ ConnectorConsentBulletJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public ConnectorConsentBulletJson() {
        this("", "", null);
    }
}
