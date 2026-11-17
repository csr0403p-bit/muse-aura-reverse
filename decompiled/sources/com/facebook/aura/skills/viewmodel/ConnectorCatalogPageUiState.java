package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.skills.model.ConnectorCatalogCategory;

/* loaded from: classes.dex */
public final class ConnectorCatalogPageUiState extends C06G {
    public final boolean canLoadMore;
    public final ConnectorCatalogCategory category;
    public final AHD<ConnectorCatalogRowUiState> featuredRows;
    public final boolean hasLoaded;
    public final boolean isRefreshing;
    public final AHD<ConnectorCatalogRowUiState> rows;
    public final boolean showEmpty;
    public final boolean showError;
    public final boolean showFeatured;
    public final boolean showFeaturedSpacing;
    public final boolean showLoading;

    public static /* synthetic */ ConnectorCatalogPageUiState copy$default(ConnectorCatalogPageUiState connectorCatalogPageUiState, ConnectorCatalogCategory connectorCatalogCategory, AHD ahd, AHD ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        ConnectorCatalogCategory connectorCatalogCategory2 = connectorCatalogCategory;
        AHD ahd3 = ahd;
        AHD ahd4 = ahd2;
        boolean z9 = z;
        boolean z10 = z2;
        boolean z11 = z3;
        boolean z12 = z4;
        boolean z13 = z5;
        boolean z14 = z6;
        boolean z15 = z7;
        boolean z16 = z8;
        if ((i & 1) != 0) {
            connectorCatalogCategory2 = connectorCatalogPageUiState.category;
        }
        if ((i & 2) != 0) {
            ahd3 = connectorCatalogPageUiState.rows;
        }
        if ((i & 4) != 0) {
            ahd4 = connectorCatalogPageUiState.featuredRows;
        }
        if ((i & 8) != 0) {
            z9 = connectorCatalogPageUiState.showFeatured;
        }
        if ((i & 16) != 0) {
            z10 = connectorCatalogPageUiState.showFeaturedSpacing;
        }
        if ((i & 32) != 0) {
            z11 = connectorCatalogPageUiState.hasLoaded;
        }
        if ((i & 64) != 0) {
            z12 = connectorCatalogPageUiState.isRefreshing;
        }
        if ((i & 128) != 0) {
            z13 = connectorCatalogPageUiState.showLoading;
        }
        if ((i & 256) != 0) {
            z14 = connectorCatalogPageUiState.showError;
        }
        if ((i & 512) != 0) {
            z15 = connectorCatalogPageUiState.showEmpty;
        }
        if ((i & 1024) != 0) {
            z16 = connectorCatalogPageUiState.canLoadMore;
        }
        AnonymousClass003.A0x(ahd3, ahd4);
        return new ConnectorCatalogPageUiState(connectorCatalogCategory2, ahd3, ahd4, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogPageUiState) {
                ConnectorCatalogPageUiState connectorCatalogPageUiState = (ConnectorCatalogPageUiState) obj;
                if (!C7384Etj.areEqual(this.category, connectorCatalogPageUiState.category) || !C7384Etj.areEqual(this.rows, connectorCatalogPageUiState.rows) || !C7384Etj.areEqual(this.featuredRows, connectorCatalogPageUiState.featuredRows) || this.showFeatured != connectorCatalogPageUiState.showFeatured || this.showFeaturedSpacing != connectorCatalogPageUiState.showFeaturedSpacing || this.hasLoaded != connectorCatalogPageUiState.hasLoaded || this.isRefreshing != connectorCatalogPageUiState.isRefreshing || this.showLoading != connectorCatalogPageUiState.showLoading || this.showError != connectorCatalogPageUiState.showError || this.showEmpty != connectorCatalogPageUiState.showEmpty || this.canLoadMore != connectorCatalogPageUiState.canLoadMore) {
                }
            }
            return false;
        }
        return true;
    }

    public final ConnectorCatalogCategory component1() {
        return this.category;
    }

    public final boolean component10() {
        return this.showEmpty;
    }

    public final boolean component11() {
        return this.canLoadMore;
    }

    public final AHD<ConnectorCatalogRowUiState> component2() {
        return this.rows;
    }

    public final AHD<ConnectorCatalogRowUiState> component3() {
        return this.featuredRows;
    }

    public final boolean component4() {
        return this.showFeatured;
    }

    public final boolean component5() {
        return this.showFeaturedSpacing;
    }

    public final boolean component6() {
        return this.hasLoaded;
    }

    public final boolean component7() {
        return this.isRefreshing;
    }

    public final boolean component8() {
        return this.showLoading;
    }

    public final boolean component9() {
        return this.showError;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final ConnectorCatalogCategory getCategory() {
        return this.category;
    }

    public final AHD<ConnectorCatalogRowUiState> getFeaturedRows() {
        return this.featuredRows;
    }

    public final boolean getHasLoaded() {
        return this.hasLoaded;
    }

    public final AHD<ConnectorCatalogRowUiState> getRows() {
        return this.rows;
    }

    public final boolean getShowEmpty() {
        return this.showEmpty;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowFeatured() {
        return this.showFeatured;
    }

    public final boolean getShowFeaturedSpacing() {
        return this.showFeaturedSpacing;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.featuredRows, AnonymousClass005.A0F(this.rows, AnonymousClass006.A0D(this.category) * 31)), this.showFeatured), this.showFeaturedSpacing), this.hasLoaded), this.isRefreshing), this.showLoading), this.showError), this.showEmpty), this.canLoadMore);
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public ConnectorCatalogPageUiState(ConnectorCatalogCategory connectorCatalogCategory, AHD<ConnectorCatalogRowUiState> ahd, AHD<ConnectorCatalogRowUiState> ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AnonymousClass003.A0x(ahd, ahd2);
        this.category = connectorCatalogCategory;
        this.rows = ahd;
        this.featuredRows = ahd2;
        this.showFeatured = z;
        this.showFeaturedSpacing = z2;
        this.hasLoaded = z3;
        this.isRefreshing = z4;
        this.showLoading = z5;
        this.showError = z6;
        this.showEmpty = z7;
        this.canLoadMore = z8;
    }

    public final ConnectorCatalogPageUiState copy(ConnectorCatalogCategory connectorCatalogCategory, AHD<ConnectorCatalogRowUiState> ahd, AHD<ConnectorCatalogRowUiState> ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AnonymousClass003.A0x(ahd, ahd2);
        return new ConnectorCatalogPageUiState(connectorCatalogCategory, ahd, ahd2, z, z2, z3, z4, z5, z6, z7, z8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogPageUiState(ConnectorCatalogCategory connectorCatalogCategory, AHD ahd, AHD ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, C06H c06h) {
        this((i & 1) != 0 ? null : connectorCatalogCategory, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? AHI.A01 : ahd2, AnonymousClass005.A1P(i, z), AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? false : z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectorCatalogPageUiState() {
        AHI ahi = AHI.A01;
        this(null, ahi, ahi, false, false, false, false, false, false, false, false);
    }
}
