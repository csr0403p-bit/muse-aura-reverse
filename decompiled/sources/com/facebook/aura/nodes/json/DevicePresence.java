package com.facebook.aura.nodes.json;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DevicePresence {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DevicePresence[] $VALUES;
    public static final DevicePresence OFFLINE;
    public static final DevicePresence ONLINE;
    public static final DevicePresence WAKEABLE;

    static {
        DevicePresence devicePresence = new DevicePresence("ONLINE", 0);
        ONLINE = devicePresence;
        DevicePresence devicePresence2 = new DevicePresence("WAKEABLE", 1);
        WAKEABLE = devicePresence2;
        DevicePresence devicePresence3 = new DevicePresence("OFFLINE", 2);
        OFFLINE = devicePresence3;
        DevicePresence[] devicePresenceArr = {devicePresence, devicePresence2, devicePresence3};
        $VALUES = devicePresenceArr;
        $ENTRIES = new F3w(devicePresenceArr);
    }

    public static Ey9<DevicePresence> getEntries() {
        return $ENTRIES;
    }

    public static DevicePresence valueOf(String str) {
        return (DevicePresence) Enum.valueOf(DevicePresence.class, str);
    }

    public static DevicePresence[] values() {
        return (DevicePresence[]) $VALUES.clone();
    }

    public DevicePresence(String str, int i) {
    }
}
