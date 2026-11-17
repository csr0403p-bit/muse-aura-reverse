package com.facebook.aura.gateway.store;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LocationSharingMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocationSharingMode[] $VALUES;
    public static final LocationSharingMode ALWAYS;
    public static final LocationSharingMode NEVER;
    public static final LocationSharingMode WHEN_CHATTING;

    static {
        LocationSharingMode locationSharingMode = new LocationSharingMode("NEVER", 0);
        NEVER = locationSharingMode;
        LocationSharingMode locationSharingMode2 = new LocationSharingMode("WHEN_CHATTING", 1);
        WHEN_CHATTING = locationSharingMode2;
        LocationSharingMode locationSharingMode3 = new LocationSharingMode("ALWAYS", 2);
        ALWAYS = locationSharingMode3;
        LocationSharingMode[] locationSharingModeArr = {locationSharingMode, locationSharingMode2, locationSharingMode3};
        $VALUES = locationSharingModeArr;
        $ENTRIES = new F3w(locationSharingModeArr);
    }

    public static Ey9<LocationSharingMode> getEntries() {
        return $ENTRIES;
    }

    public static LocationSharingMode valueOf(String str) {
        return (LocationSharingMode) Enum.valueOf(LocationSharingMode.class, str);
    }

    public static LocationSharingMode[] values() {
        return (LocationSharingMode[]) $VALUES.clone();
    }

    public LocationSharingMode(String str, int i) {
    }
}
