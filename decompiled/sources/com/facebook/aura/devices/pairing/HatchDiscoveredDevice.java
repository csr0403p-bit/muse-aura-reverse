package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.devices.intf.ClaimedDeviceRow;
import com.facebook.aura.devices.intf.DeviceRowBadge;

/* loaded from: classes.dex */
public final class HatchDiscoveredDevice extends C06G {
    public static final int $stable = DeviceRowBadge.$stable | ClaimedDeviceRow.$stable;
    public final String address;
    public final DeviceRowBadge badge;
    public final ClaimedDeviceRow claim;
    public final boolean isBluetoothGadget;
    public final String name;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDiscoveredDevice) {
                HatchDiscoveredDevice hatchDiscoveredDevice = (HatchDiscoveredDevice) obj;
                if (!C7384Etj.areEqual(this.address, hatchDiscoveredDevice.address) || !C7384Etj.areEqual(this.name, hatchDiscoveredDevice.name) || !C7384Etj.areEqual(this.claim, hatchDiscoveredDevice.claim) || this.isBluetoothGadget != hatchDiscoveredDevice.isBluetoothGadget || !C7384Etj.areEqual(this.badge, hatchDiscoveredDevice.badge)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDiscoveredDevice copy$default(HatchDiscoveredDevice hatchDiscoveredDevice, String str, String str2, ClaimedDeviceRow claimedDeviceRow, boolean z, DeviceRowBadge deviceRowBadge, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchDiscoveredDevice.address;
        }
        if ((i & 2) != 0) {
            str2 = hatchDiscoveredDevice.name;
        }
        if ((i & 4) != 0) {
            claimedDeviceRow = hatchDiscoveredDevice.claim;
        }
        if ((i & 8) != 0) {
            z = hatchDiscoveredDevice.isBluetoothGadget;
        }
        if ((i & 16) != 0) {
            deviceRowBadge = hatchDiscoveredDevice.badge;
        }
        return hatchDiscoveredDevice.copy(str, str2, claimedDeviceRow, z, deviceRowBadge);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final ClaimedDeviceRow component3() {
        return this.claim;
    }

    public final boolean component4() {
        return this.isBluetoothGadget;
    }

    public final DeviceRowBadge component5() {
        return this.badge;
    }

    public final String getAddress() {
        return this.address;
    }

    public final DeviceRowBadge getBadge() {
        return this.badge;
    }

    public final ClaimedDeviceRow getClaim() {
        return this.claim;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return C0KA.A01((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.address)) + AnonymousClass006.A0D(this.claim)) * 31, this.isBluetoothGadget) + C06G.A04(this.badge);
    }

    public final boolean isBluetoothGadget() {
        return this.isBluetoothGadget;
    }

    public HatchDiscoveredDevice(String str, String str2, ClaimedDeviceRow claimedDeviceRow, boolean z, DeviceRowBadge deviceRowBadge) {
        AnonymousClass003.A0u(str, str2);
        this.address = str;
        this.name = str2;
        this.claim = claimedDeviceRow;
        this.isBluetoothGadget = z;
        this.badge = deviceRowBadge;
    }

    public final HatchDiscoveredDevice copy(String str, String str2, ClaimedDeviceRow claimedDeviceRow, boolean z, DeviceRowBadge deviceRowBadge) {
        AnonymousClass003.A0u(str, str2);
        return new HatchDiscoveredDevice(str, str2, claimedDeviceRow, z, deviceRowBadge);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchDiscoveredDevice(String str, String str2, ClaimedDeviceRow claimedDeviceRow, boolean z, DeviceRowBadge deviceRowBadge, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : claimedDeviceRow, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? null : deviceRowBadge);
    }
}
