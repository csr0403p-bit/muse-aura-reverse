package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.skills.model.ConnectorCatalogCategory;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConnectorCatalogCategoryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String id;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectorCatalogCategoryJson> serializer() {
            return ConnectorCatalogCategoryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorCatalogCategoryJson connectorCatalogCategoryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectorCatalogCategoryJson.id)) {
            c9j5.AAV(connectorCatalogCategoryJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectorCatalogCategoryJson.title)) {
            c9j5.AAV(connectorCatalogCategoryJson.title, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogCategoryJson) {
                ConnectorCatalogCategoryJson connectorCatalogCategoryJson = (ConnectorCatalogCategoryJson) obj;
                if (!C7384Etj.areEqual(this.id, connectorCatalogCategoryJson.id) || !C7384Etj.areEqual(this.title, connectorCatalogCategoryJson.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorCatalogCategoryJson copy$default(ConnectorCatalogCategoryJson connectorCatalogCategoryJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorCatalogCategoryJson.id;
        }
        if ((i & 2) != 0) {
            str2 = connectorCatalogCategoryJson.title;
        }
        AnonymousClass003.A0u(str, str2);
        return new ConnectorCatalogCategoryJson(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass001.A0G(this.id));
    }

    public final ConnectorCatalogCategory toDomain() {
        String str = this.id;
        if (C7BY.A0j(str) || str == null) {
            return null;
        }
        return new ConnectorCatalogCategory(str, this.title);
    }

    public ConnectorCatalogCategoryJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.title = str2;
    }

    public final ConnectorCatalogCategoryJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ConnectorCatalogCategoryJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogCategoryJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ ConnectorCatalogCategoryJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    public ConnectorCatalogCategoryJson() {
        this("", "");
    }
}
