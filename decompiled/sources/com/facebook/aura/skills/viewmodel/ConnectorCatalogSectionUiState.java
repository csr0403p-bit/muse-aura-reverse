package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.skills.model.ConnectorCatalogCategory;

/* loaded from: classes.dex */
public final class ConnectorCatalogSectionUiState extends C06G {
    public final ConnectorCatalogCategory category;
    public final AHD<ConnectorCatalogRowUiState> rows;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogSectionUiState) {
                ConnectorCatalogSectionUiState connectorCatalogSectionUiState = (ConnectorCatalogSectionUiState) obj;
                if (!C7384Etj.areEqual(this.category, connectorCatalogSectionUiState.category) || !C7384Etj.areEqual(this.rows, connectorCatalogSectionUiState.rows)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorCatalogSectionUiState copy$default(ConnectorCatalogSectionUiState connectorCatalogSectionUiState, ConnectorCatalogCategory connectorCatalogCategory, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            connectorCatalogCategory = connectorCatalogSectionUiState.category;
        }
        if ((i & 2) != 0) {
            ahd = connectorCatalogSectionUiState.rows;
        }
        AnonymousClass003.A0u(connectorCatalogCategory, ahd);
        return new ConnectorCatalogSectionUiState(connectorCatalogCategory, ahd);
    }

    public final ConnectorCatalogCategory component1() {
        return this.category;
    }

    public final AHD<ConnectorCatalogRowUiState> component2() {
        return this.rows;
    }

    public final ConnectorCatalogCategory getCategory() {
        return this.category;
    }

    public final AHD<ConnectorCatalogRowUiState> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rows, AnonymousClass005.A0E(this.category));
    }

    public ConnectorCatalogSectionUiState(ConnectorCatalogCategory connectorCatalogCategory, AHD<ConnectorCatalogRowUiState> ahd) {
        AnonymousClass003.A0u(connectorCatalogCategory, ahd);
        this.category = connectorCatalogCategory;
        this.rows = ahd;
    }

    public final ConnectorCatalogSectionUiState copy(ConnectorCatalogCategory connectorCatalogCategory, AHD<ConnectorCatalogRowUiState> ahd) {
        AnonymousClass003.A0u(connectorCatalogCategory, ahd);
        return new ConnectorCatalogSectionUiState(connectorCatalogCategory, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
