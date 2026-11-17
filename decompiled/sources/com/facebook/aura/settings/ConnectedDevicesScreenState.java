package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQI;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectedDevicesScreenState extends C06G {
    public static final int $stable = HomeLinkOffer.$stable | ConnectedDeviceSections.$stable;
    public final HomeLinkOffer homeLinkOffer;
    public final BQI<String> removableDeviceNodeIds;
    public final ConnectedDeviceSections sections;
    public final ConnectedDevicesUiState ui;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectedDevicesScreenState) {
                ConnectedDevicesScreenState connectedDevicesScreenState = (ConnectedDevicesScreenState) obj;
                if (!C7384Etj.areEqual(this.ui, connectedDevicesScreenState.ui) || !C7384Etj.areEqual(this.sections, connectedDevicesScreenState.sections) || !C7384Etj.areEqual(this.removableDeviceNodeIds, connectedDevicesScreenState.removableDeviceNodeIds) || !C7384Etj.areEqual(this.homeLinkOffer, connectedDevicesScreenState.homeLinkOffer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectedDevicesScreenState copy$default(ConnectedDevicesScreenState connectedDevicesScreenState, ConnectedDevicesUiState connectedDevicesUiState, ConnectedDeviceSections connectedDeviceSections, BQI bqi, HomeLinkOffer homeLinkOffer, int i, Object obj) {
        if ((i & 1) != 0) {
            connectedDevicesUiState = connectedDevicesScreenState.ui;
        }
        if ((i & 2) != 0) {
            connectedDeviceSections = connectedDevicesScreenState.sections;
        }
        if ((i & 4) != 0) {
            bqi = connectedDevicesScreenState.removableDeviceNodeIds;
        }
        if ((i & 8) != 0) {
            homeLinkOffer = connectedDevicesScreenState.homeLinkOffer;
        }
        AnonymousClass005.A0x(connectedDevicesUiState, connectedDeviceSections, bqi);
        return new ConnectedDevicesScreenState(connectedDevicesUiState, connectedDeviceSections, bqi, homeLinkOffer);
    }

    public final ConnectedDevicesUiState component1() {
        return this.ui;
    }

    public final ConnectedDeviceSections component2() {
        return this.sections;
    }

    public final BQI<String> component3() {
        return this.removableDeviceNodeIds;
    }

    public final HomeLinkOffer component4() {
        return this.homeLinkOffer;
    }

    public final HomeLinkOffer getHomeLinkOffer() {
        return this.homeLinkOffer;
    }

    public final BQI<String> getRemovableDeviceNodeIds() {
        return this.removableDeviceNodeIds;
    }

    public final ConnectedDeviceSections getSections() {
        return this.sections;
    }

    public final ConnectedDevicesUiState getUi() {
        return this.ui;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.removableDeviceNodeIds, AnonymousClass005.A0F(this.sections, AnonymousClass005.A0E(this.ui))) + AnonymousClass006.A0D(this.homeLinkOffer);
    }

    public ConnectedDevicesScreenState(ConnectedDevicesUiState connectedDevicesUiState, ConnectedDeviceSections connectedDeviceSections, BQI<String> bqi, HomeLinkOffer homeLinkOffer) {
        AnonymousClass005.A0x(connectedDevicesUiState, connectedDeviceSections, bqi);
        this.ui = connectedDevicesUiState;
        this.sections = connectedDeviceSections;
        this.removableDeviceNodeIds = bqi;
        this.homeLinkOffer = homeLinkOffer;
    }

    public final ConnectedDevicesScreenState copy(ConnectedDevicesUiState connectedDevicesUiState, ConnectedDeviceSections connectedDeviceSections, BQI<String> bqi, HomeLinkOffer homeLinkOffer) {
        AnonymousClass005.A0x(connectedDevicesUiState, connectedDeviceSections, bqi);
        return new ConnectedDevicesScreenState(connectedDevicesUiState, connectedDeviceSections, bqi, homeLinkOffer);
    }

    public String toString() {
        return super.toString();
    }
}
