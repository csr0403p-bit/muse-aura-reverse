package com.facebook.aura.devices.intf;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import android.os.ParcelUuid;
import java.util.List;

/* loaded from: classes4.dex */
public final class DiscoveredAdvertisement extends C06G {
    public static final int $stable = 8;
    public final String address;
    public final boolean advertisesBluetoothGadget;
    public final boolean alreadyConnected;
    public final boolean listsCommunityGadgets;
    public final boolean matchesLinkName;
    public final String name;
    public final List<ParcelUuid> serviceUuids;

    public static /* synthetic */ DiscoveredAdvertisement copy$default(DiscoveredAdvertisement discoveredAdvertisement, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        List list2 = list;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        if ((i & 1) != 0) {
            str3 = discoveredAdvertisement.address;
        }
        if ((i & 2) != 0) {
            str4 = discoveredAdvertisement.name;
        }
        if ((i & 4) != 0) {
            list2 = discoveredAdvertisement.serviceUuids;
        }
        if ((i & 8) != 0) {
            z5 = discoveredAdvertisement.matchesLinkName;
        }
        if ((i & 16) != 0) {
            z6 = discoveredAdvertisement.alreadyConnected;
        }
        if ((i & 32) != 0) {
            z7 = discoveredAdvertisement.advertisesBluetoothGadget;
        }
        if ((i & 64) != 0) {
            z8 = discoveredAdvertisement.listsCommunityGadgets;
        }
        AnonymousClass005.A0x(str3, str4, list2);
        return new DiscoveredAdvertisement(str3, str4, list2, z5, z6, z7, z8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveredAdvertisement) {
                DiscoveredAdvertisement discoveredAdvertisement = (DiscoveredAdvertisement) obj;
                if (!C7384Etj.areEqual(this.address, discoveredAdvertisement.address) || !C7384Etj.areEqual(this.name, discoveredAdvertisement.name) || !C7384Etj.areEqual(this.serviceUuids, discoveredAdvertisement.serviceUuids) || this.matchesLinkName != discoveredAdvertisement.matchesLinkName || this.alreadyConnected != discoveredAdvertisement.alreadyConnected || this.advertisesBluetoothGadget != discoveredAdvertisement.advertisesBluetoothGadget || this.listsCommunityGadgets != discoveredAdvertisement.listsCommunityGadgets) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final List<ParcelUuid> component3() {
        return this.serviceUuids;
    }

    public final boolean component4() {
        return this.matchesLinkName;
    }

    public final boolean component5() {
        return this.alreadyConnected;
    }

    public final boolean component6() {
        return this.advertisesBluetoothGadget;
    }

    public final boolean component7() {
        return this.listsCommunityGadgets;
    }

    public final String getAddress() {
        return this.address;
    }

    public final boolean getAdvertisesBluetoothGadget() {
        return this.advertisesBluetoothGadget;
    }

    public final boolean getAlreadyConnected() {
        return this.alreadyConnected;
    }

    public final boolean getListsCommunityGadgets() {
        return this.listsCommunityGadgets;
    }

    public final boolean getMatchesLinkName() {
        return this.matchesLinkName;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ParcelUuid> getServiceUuids() {
        return this.serviceUuids;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.serviceUuids, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.address))), this.matchesLinkName), this.alreadyConnected), this.advertisesBluetoothGadget), this.listsCommunityGadgets);
    }

    public DiscoveredAdvertisement(String str, String str2, List<ParcelUuid> list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A0x(str, str2, list);
        this.address = str;
        this.name = str2;
        this.serviceUuids = list;
        this.matchesLinkName = z;
        this.alreadyConnected = z2;
        this.advertisesBluetoothGadget = z3;
        this.listsCommunityGadgets = z4;
    }

    public final DiscoveredAdvertisement copy(String str, String str2, List<ParcelUuid> list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A0x(str, str2, list);
        return new DiscoveredAdvertisement(str, str2, list, z, z2, z3, z4);
    }

    public String toString() {
        return super.toString();
    }
}
