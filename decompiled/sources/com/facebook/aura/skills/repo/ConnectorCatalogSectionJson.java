package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConnectorCatalogSectionJson extends C06G {
    public final List<ConnectorJson> connectors;
    public final String id;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, ConnectorCatalogSectionJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ConnectorCatalogSectionJson> serializer() {
            return ConnectorCatalogSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogSectionJson) {
                ConnectorCatalogSectionJson connectorCatalogSectionJson = (ConnectorCatalogSectionJson) obj;
                if (!C7384Etj.areEqual(this.id, connectorCatalogSectionJson.id) || !C7384Etj.areEqual(this.title, connectorCatalogSectionJson.title) || !C7384Etj.areEqual(this.connectors, connectorCatalogSectionJson.connectors)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorCatalogSectionJson copy$default(ConnectorCatalogSectionJson connectorCatalogSectionJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorCatalogSectionJson.id;
        }
        if ((i & 2) != 0) {
            str2 = connectorCatalogSectionJson.title;
        }
        if ((i & 4) != 0) {
            list = connectorCatalogSectionJson.connectors;
        }
        return connectorCatalogSectionJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorCatalogSectionJson connectorCatalogSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectorCatalogSectionJson.id)) {
            c9j5.AAV(connectorCatalogSectionJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectorCatalogSectionJson.title)) {
            c9j5.AAV(connectorCatalogSectionJson.title, c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(connectorCatalogSectionJson.connectors, C0881AGi.A00)) {
            c9j5.AAQ(connectorCatalogSectionJson.connectors, C06G.A0e(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final List<ConnectorJson> component3() {
        return this.connectors;
    }

    public final List<ConnectorJson> getConnectors() {
        return this.connectors;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connectors, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)));
    }

    public ConnectorCatalogSectionJson(String str, String str2, List<ConnectorJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.id = str;
        this.title = str2;
        this.connectors = list;
    }

    public final ConnectorCatalogSectionJson copy(String str, String str2, List<ConnectorJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new ConnectorCatalogSectionJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogSectionJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ ConnectorCatalogSectionJson(int i, String str, String str2, List list, C2hx c2hx) {
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
        if ((i & 4) == 0) {
            this.connectors = C0881AGi.A00;
        } else {
            this.connectors = list;
        }
    }

    public ConnectorCatalogSectionJson() {
        this("", "", C0881AGi.A00);
    }
}
