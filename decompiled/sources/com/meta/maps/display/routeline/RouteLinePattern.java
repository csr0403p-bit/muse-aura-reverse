package com.meta.maps.display.routeline;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RouteLinePattern {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RouteLinePattern[] $VALUES;
    public static final RouteLinePattern DASHED;
    public static final RouteLinePattern DOTTED;
    public static final RouteLinePattern SOLID;
    public final int value;

    static {
        RouteLinePattern routeLinePattern = new RouteLinePattern("SOLID", 0, 0);
        SOLID = routeLinePattern;
        RouteLinePattern routeLinePattern2 = new RouteLinePattern("DOTTED", 1, 1);
        DOTTED = routeLinePattern2;
        RouteLinePattern routeLinePattern3 = new RouteLinePattern("DASHED", 2, 2);
        DASHED = routeLinePattern3;
        RouteLinePattern[] routeLinePatternArr = {routeLinePattern, routeLinePattern2, routeLinePattern3};
        $VALUES = routeLinePatternArr;
        $ENTRIES = C3cG.A0w(routeLinePatternArr);
    }

    public static Ey9<RouteLinePattern> getEntries() {
        return $ENTRIES;
    }

    public static RouteLinePattern valueOf(String str) {
        return (RouteLinePattern) Enum.valueOf(RouteLinePattern.class, str);
    }

    public static RouteLinePattern[] values() {
        return (RouteLinePattern[]) $VALUES.clone();
    }

    public RouteLinePattern(String str, int i, int i2) {
        this.value = i2;
    }
}
