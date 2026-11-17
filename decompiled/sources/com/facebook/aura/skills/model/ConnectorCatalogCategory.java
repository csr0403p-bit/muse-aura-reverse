package com.facebook.aura.skills.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorCatalogCategory extends C06G {
    public final String id;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogCategory) {
                ConnectorCatalogCategory connectorCatalogCategory = (ConnectorCatalogCategory) obj;
                if (!C7384Etj.areEqual(this.id, connectorCatalogCategory.id) || !C7384Etj.areEqual(this.title, connectorCatalogCategory.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorCatalogCategory copy$default(ConnectorCatalogCategory connectorCatalogCategory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorCatalogCategory.id;
        }
        if ((i & 2) != 0) {
            str2 = connectorCatalogCategory.title;
        }
        AnonymousClass003.A0u(str, str2);
        return new ConnectorCatalogCategory(str, str2);
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

    public ConnectorCatalogCategory(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.title = str2;
    }

    public final ConnectorCatalogCategory copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ConnectorCatalogCategory(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
