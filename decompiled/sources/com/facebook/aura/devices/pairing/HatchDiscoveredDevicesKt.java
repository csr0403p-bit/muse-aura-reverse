package com.facebook.aura.devices.pairing;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchDiscoveredDevicesKt {
    public static final List<HatchDiscoveredDevice> mergeDiscoveredDevice(List<HatchDiscoveredDevice> list, HatchDiscoveredDevice hatchDiscoveredDevice) {
        AnonymousClass003.A0u(list, hatchDiscoveredDevice);
        Iterator<HatchDiscoveredDevice> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(it.next().address, hatchDiscoveredDevice.address)) {
                i++;
            } else if (i >= 0) {
                if (C7384Etj.areEqual(list.get(i), hatchDiscoveredDevice)) {
                    return list;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i, hatchDiscoveredDevice);
                return arrayList;
            }
        }
        return AbstractC0878AGe.A0Q(hatchDiscoveredDevice, list);
    }
}
