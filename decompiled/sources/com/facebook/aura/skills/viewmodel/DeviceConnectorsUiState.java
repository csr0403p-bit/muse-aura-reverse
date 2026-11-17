package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class DeviceConnectorsUiState extends C06G {
    public final AHD<ConnectorCatalogRowUiState> rows;
    public final boolean showEmpty;

    public DeviceConnectorsUiState(AHD<ConnectorCatalogRowUiState> ahd, boolean z) {
        C7384Etj.A0Y(ahd, 0);
        this.rows = ahd;
        this.showEmpty = z;
    }

    public final DeviceConnectorsUiState copy(AHD<ConnectorCatalogRowUiState> ahd, boolean z) {
        C7384Etj.A0Y(ahd, 0);
        return new DeviceConnectorsUiState(ahd, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceConnectorsUiState) {
                DeviceConnectorsUiState deviceConnectorsUiState = (DeviceConnectorsUiState) obj;
                if (!C7384Etj.areEqual(this.rows, deviceConnectorsUiState.rows) || this.showEmpty != deviceConnectorsUiState.showEmpty) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceConnectorsUiState copy$default(DeviceConnectorsUiState deviceConnectorsUiState, AHD ahd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = deviceConnectorsUiState.rows;
        }
        if ((i & 2) != 0) {
            z = deviceConnectorsUiState.showEmpty;
        }
        C7384Etj.A0Y(ahd, 0);
        return new DeviceConnectorsUiState(ahd, z);
    }

    public final AHD<ConnectorCatalogRowUiState> component1() {
        return this.rows;
    }

    public final boolean component2() {
        return this.showEmpty;
    }

    public final AHD<ConnectorCatalogRowUiState> getRows() {
        return this.rows;
    }

    public final boolean getShowEmpty() {
        return this.showEmpty;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.rows), this.showEmpty);
    }

    public String toString() {
        return super.toString();
    }
}
