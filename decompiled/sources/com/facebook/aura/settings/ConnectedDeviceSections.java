package com.facebook.aura.settings;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import com.facebook.aura.nodes.json.NodeListEntry;

/* loaded from: classes.dex */
public final class ConnectedDeviceSections extends C06G {
    public static final int $stable = 8;
    public final AHD<NodeListEntry> apps;
    public final AHD<ConnectedDeviceRow> bluetoothGadgets;
    public final AHD<GadgetRow> gadgets;
    public final AHD<NodeListEntry> glasses;
    public final AHD<NodeListEntry> inactiveApps;
    public final AHD<NodeListEntry> thisDevice;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectedDeviceSections) {
                ConnectedDeviceSections connectedDeviceSections = (ConnectedDeviceSections) obj;
                if (!C7384Etj.areEqual(this.thisDevice, connectedDeviceSections.thisDevice) || !C7384Etj.areEqual(this.glasses, connectedDeviceSections.glasses) || !C7384Etj.areEqual(this.apps, connectedDeviceSections.apps) || !C7384Etj.areEqual(this.inactiveApps, connectedDeviceSections.inactiveApps) || !C7384Etj.areEqual(this.gadgets, connectedDeviceSections.gadgets) || !C7384Etj.areEqual(this.bluetoothGadgets, connectedDeviceSections.bluetoothGadgets)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectedDeviceSections copy$default(ConnectedDeviceSections connectedDeviceSections, AHD ahd, AHD ahd2, AHD ahd3, AHD ahd4, AHD ahd5, AHD ahd6, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = connectedDeviceSections.thisDevice;
        }
        if ((i & 2) != 0) {
            ahd2 = connectedDeviceSections.glasses;
        }
        if ((i & 4) != 0) {
            ahd3 = connectedDeviceSections.apps;
        }
        if ((i & 8) != 0) {
            ahd4 = connectedDeviceSections.inactiveApps;
        }
        if ((i & 16) != 0) {
            ahd5 = connectedDeviceSections.gadgets;
        }
        if ((i & 32) != 0) {
            ahd6 = connectedDeviceSections.bluetoothGadgets;
        }
        return connectedDeviceSections.copy(ahd, ahd2, ahd3, ahd4, ahd5, ahd6);
    }

    public final AHD<NodeListEntry> component1() {
        return this.thisDevice;
    }

    public final AHD<NodeListEntry> component2() {
        return this.glasses;
    }

    public final AHD<NodeListEntry> component3() {
        return this.apps;
    }

    public final AHD<NodeListEntry> component4() {
        return this.inactiveApps;
    }

    public final AHD<GadgetRow> component5() {
        return this.gadgets;
    }

    public final AHD<ConnectedDeviceRow> component6() {
        return this.bluetoothGadgets;
    }

    public final AHD<NodeListEntry> getApps() {
        return this.apps;
    }

    public final AHD<ConnectedDeviceRow> getBluetoothGadgets() {
        return this.bluetoothGadgets;
    }

    public final AHD<GadgetRow> getGadgets() {
        return this.gadgets;
    }

    public final AHD<NodeListEntry> getGlasses() {
        return this.glasses;
    }

    public final AHD<NodeListEntry> getInactiveApps() {
        return this.inactiveApps;
    }

    public final AHD<NodeListEntry> getThisDevice() {
        return this.thisDevice;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.bluetoothGadgets, AnonymousClass005.A0F(this.gadgets, AnonymousClass005.A0F(this.inactiveApps, AnonymousClass005.A0F(this.apps, AnonymousClass005.A0F(this.glasses, AnonymousClass005.A0E(this.thisDevice))))));
    }

    public ConnectedDeviceSections(AHD<NodeListEntry> ahd, AHD<NodeListEntry> ahd2, AHD<NodeListEntry> ahd3, AHD<NodeListEntry> ahd4, AHD<GadgetRow> ahd5, AHD<ConnectedDeviceRow> ahd6) {
        AnonymousClass005.A17(ahd, ahd2, ahd3, ahd4, ahd5);
        C7384Etj.A0Y(ahd6, 5);
        this.thisDevice = ahd;
        this.glasses = ahd2;
        this.apps = ahd3;
        this.inactiveApps = ahd4;
        this.gadgets = ahd5;
        this.bluetoothGadgets = ahd6;
    }

    public final ConnectedDeviceSections copy(AHD<NodeListEntry> ahd, AHD<NodeListEntry> ahd2, AHD<NodeListEntry> ahd3, AHD<NodeListEntry> ahd4, AHD<GadgetRow> ahd5, AHD<ConnectedDeviceRow> ahd6) {
        AnonymousClass005.A17(ahd, ahd2, ahd3, ahd4, ahd5);
        C7384Etj.A0Y(ahd6, 5);
        return new ConnectedDeviceSections(ahd, ahd2, ahd3, ahd4, ahd5, ahd6);
    }

    public String toString() {
        return super.toString();
    }
}
