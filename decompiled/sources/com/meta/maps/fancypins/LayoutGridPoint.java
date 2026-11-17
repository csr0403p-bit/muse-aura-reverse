package com.meta.maps.fancypins;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LayoutGridPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LayoutGridPoint[] $VALUES;
    public static final LayoutGridPoint BOTTOM_CENTER;
    public static final LayoutGridPoint BOTTOM_LEFT;
    public static final LayoutGridPoint BOTTOM_RIGHT;
    public static final LayoutGridPoint CENTER;
    public static final LayoutGridPoint CENTER_LEFT;
    public static final LayoutGridPoint CENTER_RIGHT;
    public static final LayoutGridPoint TOP_CENTER;
    public static final LayoutGridPoint TOP_LEFT;
    public static final LayoutGridPoint TOP_RIGHT;
    public final String jsonValue;

    static {
        LayoutGridPoint layoutGridPoint = new LayoutGridPoint("TOP_LEFT", 0, "topLeft");
        TOP_LEFT = layoutGridPoint;
        LayoutGridPoint layoutGridPoint2 = new LayoutGridPoint("TOP_CENTER", 1, "topCenter");
        TOP_CENTER = layoutGridPoint2;
        LayoutGridPoint layoutGridPoint3 = new LayoutGridPoint("TOP_RIGHT", 2, "topRight");
        TOP_RIGHT = layoutGridPoint3;
        LayoutGridPoint layoutGridPoint4 = new LayoutGridPoint("CENTER_LEFT", 3, "centerLeft");
        CENTER_LEFT = layoutGridPoint4;
        LayoutGridPoint layoutGridPoint5 = new LayoutGridPoint("CENTER", 4, "center");
        CENTER = layoutGridPoint5;
        LayoutGridPoint layoutGridPoint6 = new LayoutGridPoint("CENTER_RIGHT", 5, "centerRight");
        CENTER_RIGHT = layoutGridPoint6;
        LayoutGridPoint layoutGridPoint7 = new LayoutGridPoint("BOTTOM_LEFT", 6, "bottomLeft");
        BOTTOM_LEFT = layoutGridPoint7;
        LayoutGridPoint layoutGridPoint8 = new LayoutGridPoint("BOTTOM_CENTER", 7, "bottomCenter");
        BOTTOM_CENTER = layoutGridPoint8;
        LayoutGridPoint layoutGridPoint9 = new LayoutGridPoint("BOTTOM_RIGHT", 8, "bottomRight");
        BOTTOM_RIGHT = layoutGridPoint9;
        LayoutGridPoint[] layoutGridPointArr = {layoutGridPoint, layoutGridPoint2, layoutGridPoint3, layoutGridPoint4, layoutGridPoint5, layoutGridPoint6, layoutGridPoint7, layoutGridPoint8, layoutGridPoint9};
        $VALUES = layoutGridPointArr;
        $ENTRIES = C3cG.A0w(layoutGridPointArr);
    }

    public static Ey9<LayoutGridPoint> getEntries() {
        return $ENTRIES;
    }

    public static LayoutGridPoint valueOf(String str) {
        return (LayoutGridPoint) Enum.valueOf(LayoutGridPoint.class, str);
    }

    public static LayoutGridPoint[] values() {
        return (LayoutGridPoint[]) $VALUES.clone();
    }

    public final String getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.jsonValue;
    }

    public LayoutGridPoint(String str, int i, String str2) {
        this.jsonValue = str2;
    }
}
