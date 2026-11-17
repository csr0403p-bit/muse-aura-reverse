package com.facebook.aura.flights;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FlightDetailNavigation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FlightDetailNavigation[] $VALUES;
    public static final FlightDetailNavigation CLOSE_FLOW;
    public static final FlightDetailNavigation OPEN_BOOKING;

    static {
        FlightDetailNavigation flightDetailNavigation = new FlightDetailNavigation("CLOSE_FLOW", 0);
        CLOSE_FLOW = flightDetailNavigation;
        FlightDetailNavigation flightDetailNavigation2 = new FlightDetailNavigation("OPEN_BOOKING", 1);
        OPEN_BOOKING = flightDetailNavigation2;
        FlightDetailNavigation[] flightDetailNavigationArr = {flightDetailNavigation, flightDetailNavigation2};
        $VALUES = flightDetailNavigationArr;
        $ENTRIES = C3cG.A0w(flightDetailNavigationArr);
    }

    public static Ey9<FlightDetailNavigation> getEntries() {
        return $ENTRIES;
    }

    public static FlightDetailNavigation valueOf(String str) {
        return (FlightDetailNavigation) Enum.valueOf(FlightDetailNavigation.class, str);
    }

    public static FlightDetailNavigation[] values() {
        return (FlightDetailNavigation[]) $VALUES.clone();
    }

    public FlightDetailNavigation(String str, int i) {
    }
}
