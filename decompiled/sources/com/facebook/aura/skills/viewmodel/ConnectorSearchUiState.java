package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorSearchUiState extends C06G {
    public final boolean canLoadMore;
    public final AHD<ConnectorCatalogRowUiState> deviceRows;
    public final String query;
    public final AHD<ConnectorCatalogRowUiState> rows;
    public final boolean showDeviceSection;
    public final boolean showDeviceSpacing;
    public final boolean showEmpty;
    public final boolean showError;
    public final boolean showLoading;

    public static /* synthetic */ ConnectorSearchUiState copy$default(ConnectorSearchUiState connectorSearchUiState, String str, AHD ahd, AHD ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        String str2 = str;
        AHD ahd3 = ahd;
        AHD ahd4 = ahd2;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        if ((i & 1) != 0) {
            str2 = connectorSearchUiState.query;
        }
        if ((i & 2) != 0) {
            ahd3 = connectorSearchUiState.rows;
        }
        if ((i & 4) != 0) {
            ahd4 = connectorSearchUiState.deviceRows;
        }
        if ((i & 8) != 0) {
            z7 = connectorSearchUiState.showDeviceSection;
        }
        if ((i & 16) != 0) {
            z8 = connectorSearchUiState.showDeviceSpacing;
        }
        if ((i & 32) != 0) {
            z9 = connectorSearchUiState.showLoading;
        }
        if ((i & 64) != 0) {
            z10 = connectorSearchUiState.showError;
        }
        if ((i & 128) != 0) {
            z11 = connectorSearchUiState.showEmpty;
        }
        if ((i & 256) != 0) {
            z12 = connectorSearchUiState.canLoadMore;
        }
        AnonymousClass005.A0x(str2, ahd3, ahd4);
        return new ConnectorSearchUiState(str2, ahd3, ahd4, z7, z8, z9, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorSearchUiState) {
                ConnectorSearchUiState connectorSearchUiState = (ConnectorSearchUiState) obj;
                if (!C7384Etj.areEqual(this.query, connectorSearchUiState.query) || !C7384Etj.areEqual(this.rows, connectorSearchUiState.rows) || !C7384Etj.areEqual(this.deviceRows, connectorSearchUiState.deviceRows) || this.showDeviceSection != connectorSearchUiState.showDeviceSection || this.showDeviceSpacing != connectorSearchUiState.showDeviceSpacing || this.showLoading != connectorSearchUiState.showLoading || this.showError != connectorSearchUiState.showError || this.showEmpty != connectorSearchUiState.showEmpty || this.canLoadMore != connectorSearchUiState.canLoadMore) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ConnectorSearchUiState(String str, AHD ahd, AHD ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? AHI.A01 : ahd2, AnonymousClass005.A1P(i, z), AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6);
    }

    public final String component1() {
        return this.query;
    }

    public final AHD<ConnectorCatalogRowUiState> component2() {
        return this.rows;
    }

    public final AHD<ConnectorCatalogRowUiState> component3() {
        return this.deviceRows;
    }

    public final boolean component4() {
        return this.showDeviceSection;
    }

    public final boolean component5() {
        return this.showDeviceSpacing;
    }

    public final boolean component6() {
        return this.showLoading;
    }

    public final boolean component7() {
        return this.showError;
    }

    public final boolean component8() {
        return this.showEmpty;
    }

    public final boolean component9() {
        return this.canLoadMore;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final AHD<ConnectorCatalogRowUiState> getDeviceRows() {
        return this.deviceRows;
    }

    public final String getQuery() {
        return this.query;
    }

    public final AHD<ConnectorCatalogRowUiState> getRows() {
        return this.rows;
    }

    public final boolean getShowDeviceSection() {
        return this.showDeviceSection;
    }

    public final boolean getShowDeviceSpacing() {
        return this.showDeviceSpacing;
    }

    public final boolean getShowEmpty() {
        return this.showEmpty;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.deviceRows, AnonymousClass005.A0F(this.rows, AnonymousClass001.A0G(this.query))), this.showDeviceSection), this.showDeviceSpacing), this.showLoading), this.showError), this.showEmpty), this.canLoadMore);
    }

    public final ConnectorSearchUiState copy(String str, AHD<ConnectorCatalogRowUiState> ahd, AHD<ConnectorCatalogRowUiState> ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass005.A0x(str, ahd, ahd2);
        return new ConnectorSearchUiState(str, ahd, ahd2, z, z2, z3, z4, z5, z6);
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorSearchUiState(String str, AHD<ConnectorCatalogRowUiState> ahd, AHD<ConnectorCatalogRowUiState> ahd2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass005.A0x(str, ahd, ahd2);
        this.query = str;
        this.rows = ahd;
        this.deviceRows = ahd2;
        this.showDeviceSection = z;
        this.showDeviceSpacing = z2;
        this.showLoading = z3;
        this.showError = z4;
        this.showEmpty = z5;
        this.canLoadMore = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectorSearchUiState() {
        AHI ahi = AHI.A01;
        this("", ahi, ahi, false, false, false, false, false, false);
    }
}
