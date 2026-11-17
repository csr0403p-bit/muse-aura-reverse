package com.facebook.aura.skills.model;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorCatalogHomepage extends C06G {
    public final AHD<ConnectorCatalogSection> categories;
    public final int customCount;
    public final AHD<Skill> featured;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogHomepage) {
                ConnectorCatalogHomepage connectorCatalogHomepage = (ConnectorCatalogHomepage) obj;
                if (!C7384Etj.areEqual(this.featured, connectorCatalogHomepage.featured) || !C7384Etj.areEqual(this.categories, connectorCatalogHomepage.categories) || this.customCount != connectorCatalogHomepage.customCount) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorCatalogHomepage copy$default(ConnectorCatalogHomepage connectorCatalogHomepage, AHD ahd, AHD ahd2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ahd = connectorCatalogHomepage.featured;
        }
        if ((i2 & 2) != 0) {
            ahd2 = connectorCatalogHomepage.categories;
        }
        if ((i2 & 4) != 0) {
            i = connectorCatalogHomepage.customCount;
        }
        return connectorCatalogHomepage.copy(ahd, ahd2, i);
    }

    public final AHD<Skill> component1() {
        return this.featured;
    }

    public final AHD<ConnectorCatalogSection> component2() {
        return this.categories;
    }

    public final int component3() {
        return this.customCount;
    }

    public final AHD<ConnectorCatalogSection> getCategories() {
        return this.categories;
    }

    public final int getCustomCount() {
        return this.customCount;
    }

    public final AHD<Skill> getFeatured() {
        return this.featured;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.categories, AnonymousClass005.A0E(this.featured)) + this.customCount;
    }

    public ConnectorCatalogHomepage(AHD<Skill> ahd, AHD<ConnectorCatalogSection> ahd2, int i) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.featured = ahd;
        this.categories = ahd2;
        this.customCount = i;
    }

    public final ConnectorCatalogHomepage copy(AHD<Skill> ahd, AHD<ConnectorCatalogSection> ahd2, int i) {
        AnonymousClass003.A0u(ahd, ahd2);
        return new ConnectorCatalogHomepage(ahd, ahd2, i);
    }

    public String toString() {
        return super.toString();
    }
}
