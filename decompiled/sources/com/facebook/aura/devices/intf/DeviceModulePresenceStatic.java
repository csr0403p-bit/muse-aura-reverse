package com.facebook.aura.devices.intf;

import X.AnonymousClass005;
import com.facebook.aura.devices.link.impl.HatchLinkDeviceModulePresence;

/* loaded from: classes.dex */
public class DeviceModulePresenceStatic {
    public static DeviceModule module(int i) {
        if (i == 0) {
            return HatchLinkDeviceModulePresence.INSTANCE.module();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
