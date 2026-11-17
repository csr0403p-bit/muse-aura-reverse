package com.facebook.aura.spaces.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NavigationTabSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NavigationTabSource[] $VALUES;
    public static final NavigationTabSource PEER_SPACE;
    public static final NavigationTabSource SAVED_SPACE;
    public static final NavigationTabSource SPACE;
    public static final NavigationTabSource SYSTEM;
    public final String wireValue;

    static {
        NavigationTabSource navigationTabSource = new NavigationTabSource("SYSTEM", 0, PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM);
        SYSTEM = navigationTabSource;
        NavigationTabSource navigationTabSource2 = new NavigationTabSource("SPACE", 1, "space");
        SPACE = navigationTabSource2;
        NavigationTabSource navigationTabSource3 = new NavigationTabSource("SAVED_SPACE", 2, PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SAVED_SPACE);
        SAVED_SPACE = navigationTabSource3;
        NavigationTabSource navigationTabSource4 = new NavigationTabSource("PEER_SPACE", 3, "peer_space");
        PEER_SPACE = navigationTabSource4;
        NavigationTabSource[] navigationTabSourceArr = {navigationTabSource, navigationTabSource2, navigationTabSource3, navigationTabSource4};
        $VALUES = navigationTabSourceArr;
        $ENTRIES = new F3w(navigationTabSourceArr);
    }

    public static Ey9<NavigationTabSource> getEntries() {
        return $ENTRIES;
    }

    public static NavigationTabSource valueOf(String str) {
        return (NavigationTabSource) Enum.valueOf(NavigationTabSource.class, str);
    }

    public static NavigationTabSource[] values() {
        return (NavigationTabSource[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NavigationTabSource(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
