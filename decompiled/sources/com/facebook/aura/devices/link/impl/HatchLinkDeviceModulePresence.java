package com.facebook.aura.devices.link.impl;

import com.facebook.aura.devices.intf.DeviceModule;
import com.facebook.aura.devices.intf.DeviceModulePresence;

/* loaded from: classes.dex */
public final class HatchLinkDeviceModulePresence implements DeviceModulePresence {
    public static final HatchLinkDeviceModulePresence INSTANCE = new HatchLinkDeviceModulePresence();

    @Override // com.facebook.aura.devices.intf.DeviceModulePresence
    public DeviceModule module() {
        return DeviceModule.HATCH_LINK;
    }
}
