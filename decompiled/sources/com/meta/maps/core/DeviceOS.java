package com.meta.maps.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DeviceOS {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DeviceOS[] $VALUES;
    public static final DeviceOS ANDROID_OS;
    public static final DeviceOS IOS;
    public static final DeviceOS UNKNOWN;
    public final int value;

    static {
        DeviceOS deviceOS = new DeviceOS("IOS", 0, 0);
        IOS = deviceOS;
        DeviceOS deviceOS2 = new DeviceOS("ANDROID_OS", 1, 1);
        ANDROID_OS = deviceOS2;
        DeviceOS deviceOS3 = new DeviceOS("UNKNOWN", 2, 2);
        UNKNOWN = deviceOS3;
        DeviceOS[] deviceOSArr = {deviceOS, deviceOS2, deviceOS3};
        $VALUES = deviceOSArr;
        $ENTRIES = C3cG.A0w(deviceOSArr);
    }

    public static Ey9<DeviceOS> getEntries() {
        return $ENTRIES;
    }

    public static DeviceOS valueOf(String str) {
        return (DeviceOS) Enum.valueOf(DeviceOS.class, str);
    }

    public static DeviceOS[] values() {
        return (DeviceOS[]) $VALUES.clone();
    }

    public DeviceOS(String str, int i, int i2) {
        this.value = i2;
    }
}
