package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.skills.model.Skill;

/* loaded from: classes.dex */
public final class ConnectedConnectorsUiState extends C06G {
    public final int connectorCount;
    public final AHD<Skill> connectors;
    public final boolean isLoading;
    public final AHD<LocalDeviceConnector> localConnectors;
    public final boolean showEmpty;
    public final boolean showError;

    public static /* synthetic */ ConnectedConnectorsUiState copy$default(ConnectedConnectorsUiState connectedConnectorsUiState, AHD ahd, AHD ahd2, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        AHD ahd3 = ahd;
        AHD ahd4 = ahd2;
        int i3 = i;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i2 & 1) != 0) {
            ahd3 = connectedConnectorsUiState.connectors;
        }
        if ((i2 & 2) != 0) {
            ahd4 = connectedConnectorsUiState.localConnectors;
        }
        if ((i2 & 4) != 0) {
            i3 = connectedConnectorsUiState.connectorCount;
        }
        if ((i2 & 8) != 0) {
            z4 = connectedConnectorsUiState.isLoading;
        }
        if ((i2 & 16) != 0) {
            z5 = connectedConnectorsUiState.showError;
        }
        if ((i2 & 32) != 0) {
            z6 = connectedConnectorsUiState.showEmpty;
        }
        AnonymousClass003.A0u(ahd3, ahd4);
        return new ConnectedConnectorsUiState(ahd3, ahd4, i3, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectedConnectorsUiState) {
                ConnectedConnectorsUiState connectedConnectorsUiState = (ConnectedConnectorsUiState) obj;
                if (!C7384Etj.areEqual(this.connectors, connectedConnectorsUiState.connectors) || !C7384Etj.areEqual(this.localConnectors, connectedConnectorsUiState.localConnectors) || this.connectorCount != connectedConnectorsUiState.connectorCount || this.isLoading != connectedConnectorsUiState.isLoading || this.showError != connectedConnectorsUiState.showError || this.showEmpty != connectedConnectorsUiState.showEmpty) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectedConnectorsUiState() {
        AHI ahi = AHI.A01;
        this(ahi, ahi, 0, true, false, false);
    }

    public final AHD<Skill> component1() {
        return this.connectors;
    }

    public final AHD<LocalDeviceConnector> component2() {
        return this.localConnectors;
    }

    public final int component3() {
        return this.connectorCount;
    }

    public final boolean component4() {
        return this.isLoading;
    }

    public final boolean component5() {
        return this.showError;
    }

    public final boolean component6() {
        return this.showEmpty;
    }

    public final int getConnectorCount() {
        return this.connectorCount;
    }

    public final AHD<Skill> getConnectors() {
        return this.connectors;
    }

    public final AHD<LocalDeviceConnector> getLocalConnectors() {
        return this.localConnectors;
    }

    public final boolean getShowEmpty() {
        return this.showEmpty;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.localConnectors, AnonymousClass005.A0E(this.connectors)) + this.connectorCount) * 31, this.isLoading), this.showError), this.showEmpty);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ConnectedConnectorsUiState copy(AHD<Skill> ahd, AHD<LocalDeviceConnector> ahd2, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(ahd, ahd2);
        return new ConnectedConnectorsUiState(ahd, ahd2, i, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectedConnectorsUiState(AHD ahd, AHD ahd2, int i, boolean z, boolean z2, boolean z3, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? AHI.A01 : ahd, (i2 & 2) != 0 ? AHI.A01 : ahd2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z, AnonymousClass005.A1Q(i2, z2), AnonymousClass002.A1R(i2, z3));
    }

    public ConnectedConnectorsUiState(AHD<Skill> ahd, AHD<LocalDeviceConnector> ahd2, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.connectors = ahd;
        this.localConnectors = ahd2;
        this.connectorCount = i;
        this.isLoading = z;
        this.showError = z2;
        this.showEmpty = z3;
    }
}
