package com.facebook.aura.devices.intf;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.devices.link.impl.HatchLinkDeviceModulePresence;

/* loaded from: classes.dex */
public final class DeviceModules {
    public static final int $stable = 0;
    public static final DeviceModules INSTANCE = new DeviceModules();

    public final boolean isPresent(DeviceModule deviceModule) {
        C7384Etj.A0Y(deviceModule, 0);
        int i = new int[]{0}[0];
        if (i == 0) {
            return HatchLinkDeviceModulePresence.INSTANCE.module() == deviceModule;
        }
        throw AnonymousClass005.A0c(i);
    }
}
