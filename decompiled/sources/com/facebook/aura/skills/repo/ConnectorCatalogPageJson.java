package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class ConnectorCatalogPageJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ConnectorCatalogCategoryJson category;
    public final List<ConnectorJson> connectors;
    public final List<ConnectorJson> featured;
    public final String next_cursor;
    public final int total_count;

    public final class Companion {
        public final C9hr<ConnectorCatalogPageJson> serializer() {
            return ConnectorCatalogPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, ConnectorCatalogPageJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ConnectorCatalogPageJson$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogPageJson) {
                ConnectorCatalogPageJson connectorCatalogPageJson = (ConnectorCatalogPageJson) obj;
                if (!C7384Etj.areEqual(this.category, connectorCatalogPageJson.category) || !C7384Etj.areEqual(this.featured, connectorCatalogPageJson.featured) || !C7384Etj.areEqual(this.connectors, connectorCatalogPageJson.connectors) || !C7384Etj.areEqual(this.next_cursor, connectorCatalogPageJson.next_cursor) || this.total_count != connectorCatalogPageJson.total_count) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorCatalogPageJson copy$default(ConnectorCatalogPageJson connectorCatalogPageJson, ConnectorCatalogCategoryJson connectorCatalogCategoryJson, List list, List list2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            connectorCatalogCategoryJson = connectorCatalogPageJson.category;
        }
        if ((i2 & 2) != 0) {
            list = connectorCatalogPageJson.featured;
        }
        if ((i2 & 4) != 0) {
            list2 = connectorCatalogPageJson.connectors;
        }
        if ((i2 & 8) != 0) {
            str = connectorCatalogPageJson.next_cursor;
        }
        if ((i2 & 16) != 0) {
            i = connectorCatalogPageJson.total_count;
        }
        return connectorCatalogPageJson.copy(connectorCatalogCategoryJson, list, list2, str, i);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorCatalogPageJson connectorCatalogPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || connectorCatalogPageJson.category != null) {
            c9j5.AAP(connectorCatalogPageJson.category, ConnectorCatalogCategoryJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(connectorCatalogPageJson.featured, C0881AGi.A00)) {
            c9j5.AAQ(connectorCatalogPageJson.featured, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(connectorCatalogPageJson.connectors, C0881AGi.A00)) {
            c9j5.AAQ(connectorCatalogPageJson.connectors, C06G.A0e(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || connectorCatalogPageJson.next_cursor != null) {
            c9j5.AAP(connectorCatalogPageJson.next_cursor, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || connectorCatalogPageJson.total_count != 0) {
            c9j5.AAK(c9iZ, 4, connectorCatalogPageJson.total_count);
        }
    }

    public final ConnectorCatalogCategoryJson component1() {
        return this.category;
    }

    public final List<ConnectorJson> component2() {
        return this.featured;
    }

    public final List<ConnectorJson> component3() {
        return this.connectors;
    }

    public final String component4() {
        return this.next_cursor;
    }

    public final int component5() {
        return this.total_count;
    }

    public final ConnectorCatalogCategoryJson getCategory() {
        return this.category;
    }

    public final List<ConnectorJson> getConnectors() {
        return this.connectors;
    }

    public final List<ConnectorJson> getFeatured() {
        return this.featured;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final int getTotal_count() {
        return this.total_count;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.connectors, AnonymousClass005.A0F(this.featured, AnonymousClass006.A0D(this.category) * 31)) + AnonymousClass005.A0H(this.next_cursor)) * 31) + this.total_count;
    }

    public ConnectorCatalogPageJson(ConnectorCatalogCategoryJson connectorCatalogCategoryJson, List<ConnectorJson> list, List<ConnectorJson> list2, String str, int i) {
        AnonymousClass003.A0x(list, list2);
        this.category = connectorCatalogCategoryJson;
        this.featured = list;
        this.connectors = list2;
        this.next_cursor = str;
        this.total_count = i;
    }

    public final ConnectorCatalogPageJson copy(ConnectorCatalogCategoryJson connectorCatalogCategoryJson, List<ConnectorJson> list, List<ConnectorJson> list2, String str, int i) {
        AnonymousClass003.A0x(list, list2);
        return new ConnectorCatalogPageJson(connectorCatalogCategoryJson, list, list2, str, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogPageJson(ConnectorCatalogCategoryJson connectorCatalogCategoryJson, List list, List list2, String str, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : connectorCatalogCategoryJson, (i2 & 2) != 0 ? C0881AGi.A00 : list, (i2 & 4) != 0 ? C0881AGi.A00 : list2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? 0 : i);
    }

    public /* synthetic */ ConnectorCatalogPageJson(int i, ConnectorCatalogCategoryJson connectorCatalogCategoryJson, List list, List list2, String str, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.category = null;
        } else {
            this.category = connectorCatalogCategoryJson;
        }
        if ((i & 2) == 0) {
            this.featured = C0881AGi.A00;
        } else {
            this.featured = list;
        }
        if ((i & 4) == 0) {
            this.connectors = C0881AGi.A00;
        } else {
            this.connectors = list2;
        }
        if ((i & 8) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
        if ((i & 16) == 0) {
            this.total_count = 0;
        } else {
            this.total_count = i2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectorCatalogPageJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, c0881AGi, null, 0);
    }
}
