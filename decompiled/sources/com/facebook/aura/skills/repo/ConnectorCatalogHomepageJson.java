package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
public final class ConnectorCatalogHomepageJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<ConnectorCatalogSectionJson> categories;
    public final int custom_count;
    public final List<ConnectorJson> featured;

    public final class Companion {
        public final C9hr<ConnectorCatalogHomepageJson> serializer() {
            return ConnectorCatalogHomepageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ConnectorCatalogHomepageJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ConnectorCatalogHomepageJson$Companion$$childSerializers$2.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogHomepageJson) {
                ConnectorCatalogHomepageJson connectorCatalogHomepageJson = (ConnectorCatalogHomepageJson) obj;
                if (!C7384Etj.areEqual(this.featured, connectorCatalogHomepageJson.featured) || !C7384Etj.areEqual(this.categories, connectorCatalogHomepageJson.categories) || this.custom_count != connectorCatalogHomepageJson.custom_count) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorCatalogHomepageJson copy$default(ConnectorCatalogHomepageJson connectorCatalogHomepageJson, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = connectorCatalogHomepageJson.featured;
        }
        if ((i2 & 2) != 0) {
            list2 = connectorCatalogHomepageJson.categories;
        }
        if ((i2 & 4) != 0) {
            i = connectorCatalogHomepageJson.custom_count;
        }
        return connectorCatalogHomepageJson.copy(list, list2, i);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorCatalogHomepageJson connectorCatalogHomepageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(connectorCatalogHomepageJson.featured, C0881AGi.A00)) {
            c9j5.AAQ(connectorCatalogHomepageJson.featured, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(connectorCatalogHomepageJson.categories, C0881AGi.A00)) {
            c9j5.AAQ(connectorCatalogHomepageJson.categories, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || connectorCatalogHomepageJson.custom_count != 0) {
            c9j5.AAK(c9iZ, 2, connectorCatalogHomepageJson.custom_count);
        }
    }

    public final List<ConnectorJson> component1() {
        return this.featured;
    }

    public final List<ConnectorCatalogSectionJson> component2() {
        return this.categories;
    }

    public final int component3() {
        return this.custom_count;
    }

    public final List<ConnectorCatalogSectionJson> getCategories() {
        return this.categories;
    }

    public final int getCustom_count() {
        return this.custom_count;
    }

    public final List<ConnectorJson> getFeatured() {
        return this.featured;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.categories, AnonymousClass005.A0E(this.featured)) + this.custom_count;
    }

    public ConnectorCatalogHomepageJson(List<ConnectorJson> list, List<ConnectorCatalogSectionJson> list2, int i) {
        AnonymousClass003.A0u(list, list2);
        this.featured = list;
        this.categories = list2;
        this.custom_count = i;
    }

    public final ConnectorCatalogHomepageJson copy(List<ConnectorJson> list, List<ConnectorCatalogSectionJson> list2, int i) {
        AnonymousClass003.A0u(list, list2);
        return new ConnectorCatalogHomepageJson(list, list2, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogHomepageJson(List list, List list2, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? C0881AGi.A00 : list, (i2 & 2) != 0 ? C0881AGi.A00 : list2, (i2 & 4) != 0 ? 0 : i);
    }

    public /* synthetic */ ConnectorCatalogHomepageJson(int i, List list, List list2, int i2, C2hx c2hx) {
        this.featured = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.categories = C0881AGi.A00;
        } else {
            this.categories = list2;
        }
        if ((i & 4) == 0) {
            this.custom_count = 0;
        } else {
            this.custom_count = i2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectorCatalogHomepageJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, 0);
    }
}
