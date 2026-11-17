package com.facebook.aura.skills.model;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorCatalogPage extends C06G {
    public final ConnectorCatalogCategory category;
    public final AHD<Skill> connectors;
    public final AHD<Skill> featured;
    public final String nextCursor;
    public final int totalCount;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogPage) {
                ConnectorCatalogPage connectorCatalogPage = (ConnectorCatalogPage) obj;
                if (!C7384Etj.areEqual(this.category, connectorCatalogPage.category) || !C7384Etj.areEqual(this.featured, connectorCatalogPage.featured) || !C7384Etj.areEqual(this.connectors, connectorCatalogPage.connectors) || !C7384Etj.areEqual(this.nextCursor, connectorCatalogPage.nextCursor) || this.totalCount != connectorCatalogPage.totalCount) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorCatalogPage copy$default(ConnectorCatalogPage connectorCatalogPage, ConnectorCatalogCategory connectorCatalogCategory, AHD ahd, AHD ahd2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            connectorCatalogCategory = connectorCatalogPage.category;
        }
        if ((i2 & 2) != 0) {
            ahd = connectorCatalogPage.featured;
        }
        if ((i2 & 4) != 0) {
            ahd2 = connectorCatalogPage.connectors;
        }
        if ((i2 & 8) != 0) {
            str = connectorCatalogPage.nextCursor;
        }
        if ((i2 & 16) != 0) {
            i = connectorCatalogPage.totalCount;
        }
        return connectorCatalogPage.copy(connectorCatalogCategory, ahd, ahd2, str, i);
    }

    public final ConnectorCatalogCategory component1() {
        return this.category;
    }

    public final AHD<Skill> component2() {
        return this.featured;
    }

    public final AHD<Skill> component3() {
        return this.connectors;
    }

    public final String component4() {
        return this.nextCursor;
    }

    public final int component5() {
        return this.totalCount;
    }

    public final ConnectorCatalogCategory getCategory() {
        return this.category;
    }

    public final AHD<Skill> getConnectors() {
        return this.connectors;
    }

    public final AHD<Skill> getFeatured() {
        return this.featured;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.connectors, AnonymousClass005.A0F(this.featured, AnonymousClass006.A0D(this.category) * 31)) + AnonymousClass005.A0H(this.nextCursor)) * 31) + this.totalCount;
    }

    public ConnectorCatalogPage(ConnectorCatalogCategory connectorCatalogCategory, AHD<Skill> ahd, AHD<Skill> ahd2, String str, int i) {
        AnonymousClass003.A0x(ahd, ahd2);
        this.category = connectorCatalogCategory;
        this.featured = ahd;
        this.connectors = ahd2;
        this.nextCursor = str;
        this.totalCount = i;
    }

    public final ConnectorCatalogPage copy(ConnectorCatalogCategory connectorCatalogCategory, AHD<Skill> ahd, AHD<Skill> ahd2, String str, int i) {
        AnonymousClass003.A0x(ahd, ahd2);
        return new ConnectorCatalogPage(connectorCatalogCategory, ahd, ahd2, str, i);
    }

    public String toString() {
        return super.toString();
    }
}
