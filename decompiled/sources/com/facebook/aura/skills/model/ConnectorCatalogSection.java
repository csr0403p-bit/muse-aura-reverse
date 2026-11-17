package com.facebook.aura.skills.model;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorCatalogSection extends C06G {
    public final ConnectorCatalogCategory category;
    public final AHD<Skill> connectors;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogSection) {
                ConnectorCatalogSection connectorCatalogSection = (ConnectorCatalogSection) obj;
                if (!C7384Etj.areEqual(this.category, connectorCatalogSection.category) || !C7384Etj.areEqual(this.connectors, connectorCatalogSection.connectors)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorCatalogSection copy$default(ConnectorCatalogSection connectorCatalogSection, ConnectorCatalogCategory connectorCatalogCategory, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            connectorCatalogCategory = connectorCatalogSection.category;
        }
        if ((i & 2) != 0) {
            ahd = connectorCatalogSection.connectors;
        }
        AnonymousClass003.A0u(connectorCatalogCategory, ahd);
        return new ConnectorCatalogSection(connectorCatalogCategory, ahd);
    }

    public final ConnectorCatalogCategory component1() {
        return this.category;
    }

    public final AHD<Skill> component2() {
        return this.connectors;
    }

    public final ConnectorCatalogCategory getCategory() {
        return this.category;
    }

    public final AHD<Skill> getConnectors() {
        return this.connectors;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connectors, AnonymousClass005.A0E(this.category));
    }

    public ConnectorCatalogSection(ConnectorCatalogCategory connectorCatalogCategory, AHD<Skill> ahd) {
        AnonymousClass003.A0u(connectorCatalogCategory, ahd);
        this.category = connectorCatalogCategory;
        this.connectors = ahd;
    }

    public final ConnectorCatalogSection copy(ConnectorCatalogCategory connectorCatalogCategory, AHD<Skill> ahd) {
        AnonymousClass003.A0u(connectorCatalogCategory, ahd);
        return new ConnectorCatalogSection(connectorCatalogCategory, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
