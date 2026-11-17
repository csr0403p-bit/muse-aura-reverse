package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectedDeviceNavigation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectedDeviceNavigation[] $VALUES;
    public static final ConnectedDeviceNavigation DETAILS;
    public static final ConnectedDeviceNavigation META_AI;

    static {
        ConnectedDeviceNavigation connectedDeviceNavigation = new ConnectedDeviceNavigation("META_AI", 0);
        META_AI = connectedDeviceNavigation;
        ConnectedDeviceNavigation connectedDeviceNavigation2 = new ConnectedDeviceNavigation("DETAILS", 1);
        DETAILS = connectedDeviceNavigation2;
        ConnectedDeviceNavigation[] connectedDeviceNavigationArr = {connectedDeviceNavigation, connectedDeviceNavigation2};
        $VALUES = connectedDeviceNavigationArr;
        $ENTRIES = new F3w(connectedDeviceNavigationArr);
    }

    public static Ey9<ConnectedDeviceNavigation> getEntries() {
        return $ENTRIES;
    }

    public static ConnectedDeviceNavigation valueOf(String str) {
        return (ConnectedDeviceNavigation) Enum.valueOf(ConnectedDeviceNavigation.class, str);
    }

    public static ConnectedDeviceNavigation[] values() {
        return (ConnectedDeviceNavigation[]) $VALUES.clone();
    }

    public ConnectedDeviceNavigation(String str, int i) {
    }
}
