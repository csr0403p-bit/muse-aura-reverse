package com.facebook.aura.settings;

import com.facebook.aura.devices.intf.DeviceModule;
import com.facebook.aura.devices.intf.DeviceModules;
import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes.dex */
public abstract class HatchLinkAvailabilityKt {
    public static final boolean isHatchLinkAvailable() {
        return DeviceModules.INSTANCE.isPresent(DeviceModule.HATCH_LINK) && HatchUtil.INSTANCE.isHatchLinksSettingsEnabled();
    }
}
