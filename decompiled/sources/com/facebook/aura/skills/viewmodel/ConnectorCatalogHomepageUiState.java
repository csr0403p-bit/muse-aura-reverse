package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorCatalogHomepageUiState extends C06G {
    public final int customCount;
    public final boolean error;
    public final AHD<ConnectorCatalogRowUiState> featuredRows;
    public final boolean isRefreshing;
    public final AHD<ConnectorCatalogRowUiState> localRows;
    public final AHD<ConnectorCatalogSectionUiState> sections;
    public final boolean showCustomSection;
    public final boolean showFeatured;
    public final boolean showLoading;
    public final boolean showLocalSection;

    public static /* synthetic */ ConnectorCatalogHomepageUiState copy$default(ConnectorCatalogHomepageUiState connectorCatalogHomepageUiState, AHD ahd, AHD ahd2, AHD ahd3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, Object obj) {
        AHD ahd4 = ahd;
        AHD ahd5 = ahd2;
        AHD ahd6 = ahd3;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        int i3 = i;
        if ((i2 & 1) != 0) {
            ahd4 = connectorCatalogHomepageUiState.featuredRows;
        }
        if ((i2 & 2) != 0) {
            ahd5 = connectorCatalogHomepageUiState.sections;
        }
        if ((i2 & 4) != 0) {
            ahd6 = connectorCatalogHomepageUiState.localRows;
        }
        if ((i2 & 8) != 0) {
            z7 = connectorCatalogHomepageUiState.showFeatured;
        }
        if ((i2 & 16) != 0) {
            z8 = connectorCatalogHomepageUiState.showLocalSection;
        }
        if ((i2 & 32) != 0) {
            z9 = connectorCatalogHomepageUiState.isRefreshing;
        }
        if ((i2 & 64) != 0) {
            z10 = connectorCatalogHomepageUiState.showLoading;
        }
        if ((i2 & 128) != 0) {
            z11 = connectorCatalogHomepageUiState.error;
        }
        if ((i2 & 256) != 0) {
            z12 = connectorCatalogHomepageUiState.showCustomSection;
        }
        if ((i2 & 512) != 0) {
            i3 = connectorCatalogHomepageUiState.customCount;
        }
        AnonymousClass005.A0x(ahd4, ahd5, ahd6);
        return new ConnectorCatalogHomepageUiState(ahd4, ahd5, ahd6, z7, z8, z9, z10, z11, z12, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogHomepageUiState) {
                ConnectorCatalogHomepageUiState connectorCatalogHomepageUiState = (ConnectorCatalogHomepageUiState) obj;
                if (!C7384Etj.areEqual(this.featuredRows, connectorCatalogHomepageUiState.featuredRows) || !C7384Etj.areEqual(this.sections, connectorCatalogHomepageUiState.sections) || !C7384Etj.areEqual(this.localRows, connectorCatalogHomepageUiState.localRows) || this.showFeatured != connectorCatalogHomepageUiState.showFeatured || this.showLocalSection != connectorCatalogHomepageUiState.showLocalSection || this.isRefreshing != connectorCatalogHomepageUiState.isRefreshing || this.showLoading != connectorCatalogHomepageUiState.showLoading || this.error != connectorCatalogHomepageUiState.error || this.showCustomSection != connectorCatalogHomepageUiState.showCustomSection || this.customCount != connectorCatalogHomepageUiState.customCount) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectorCatalogHomepageUiState() {
        AHI ahi = AHI.A01;
        this(ahi, ahi, ahi, false, false, false, false, false, false, 0);
    }

    public final AHD<ConnectorCatalogRowUiState> component1() {
        return this.featuredRows;
    }

    public final int component10() {
        return this.customCount;
    }

    public final AHD<ConnectorCatalogSectionUiState> component2() {
        return this.sections;
    }

    public final AHD<ConnectorCatalogRowUiState> component3() {
        return this.localRows;
    }

    public final boolean component4() {
        return this.showFeatured;
    }

    public final boolean component5() {
        return this.showLocalSection;
    }

    public final boolean component6() {
        return this.isRefreshing;
    }

    public final boolean component7() {
        return this.showLoading;
    }

    public final boolean component8() {
        return this.error;
    }

    public final boolean component9() {
        return this.showCustomSection;
    }

    public final int getCustomCount() {
        return this.customCount;
    }

    public final boolean getError() {
        return this.error;
    }

    public final AHD<ConnectorCatalogRowUiState> getFeaturedRows() {
        return this.featuredRows;
    }

    public final AHD<ConnectorCatalogRowUiState> getLocalRows() {
        return this.localRows;
    }

    public final AHD<ConnectorCatalogSectionUiState> getSections() {
        return this.sections;
    }

    public final boolean getShowCustomSection() {
        return this.showCustomSection;
    }

    public final boolean getShowFeatured() {
        return this.showFeatured;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowLocalSection() {
        return this.showLocalSection;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.localRows, AnonymousClass005.A0F(this.sections, AnonymousClass005.A0E(this.featuredRows))), this.showFeatured), this.showLocalSection), this.isRefreshing), this.showLoading), this.error), this.showCustomSection) + this.customCount;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final ConnectorCatalogHomepageUiState copy(AHD<ConnectorCatalogRowUiState> ahd, AHD<ConnectorCatalogSectionUiState> ahd2, AHD<ConnectorCatalogRowUiState> ahd3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        AnonymousClass005.A0x(ahd, ahd2, ahd3);
        return new ConnectorCatalogHomepageUiState(ahd, ahd2, ahd3, z, z2, z3, z4, z5, z6, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogHomepageUiState(AHD ahd, AHD ahd2, AHD ahd3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? AHI.A01 : ahd, (i2 & 2) != 0 ? AHI.A01 : ahd2, (i2 & 4) != 0 ? AHI.A01 : ahd3, AnonymousClass005.A1P(i2, z), AnonymousClass005.A1Q(i2, z2), (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4, (i2 & 128) != 0 ? false : z5, (i2 & 256) != 0 ? false : z6, (i2 & 512) != 0 ? 0 : i);
    }

    public ConnectorCatalogHomepageUiState(AHD<ConnectorCatalogRowUiState> ahd, AHD<ConnectorCatalogSectionUiState> ahd2, AHD<ConnectorCatalogRowUiState> ahd3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        AnonymousClass005.A0x(ahd, ahd2, ahd3);
        this.featuredRows = ahd;
        this.sections = ahd2;
        this.localRows = ahd3;
        this.showFeatured = z;
        this.showLocalSection = z2;
        this.isRefreshing = z3;
        this.showLoading = z4;
        this.error = z5;
        this.showCustomSection = z6;
        this.customCount = i;
    }
}
