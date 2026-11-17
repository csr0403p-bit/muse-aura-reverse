package com.facebook.aura.devices.intf;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DeviceModule {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DeviceModule[] $VALUES;
    public static final DeviceModule HATCH_LINK;

    static {
        DeviceModule deviceModule = new DeviceModule("HATCH_LINK", 0);
        HATCH_LINK = deviceModule;
        DeviceModule[] deviceModuleArr = {deviceModule};
        $VALUES = deviceModuleArr;
        $ENTRIES = new F3w(deviceModuleArr);
    }

    public static Ey9<DeviceModule> getEntries() {
        return $ENTRIES;
    }

    public static DeviceModule valueOf(String str) {
        return (DeviceModule) Enum.valueOf(DeviceModule.class, str);
    }

    public static DeviceModule[] values() {
        return (DeviceModule[]) $VALUES.clone();
    }

    public DeviceModule(String str, int i) {
    }
}
