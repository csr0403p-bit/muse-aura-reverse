package com.meta.maps.display.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class GeoDisplayErrorCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GeoDisplayErrorCategory[] $VALUES;
    public static final GeoDisplayErrorCategory GLSL_COMPILE;
    public static final GeoDisplayErrorCategory NETWORK;
    public static final GeoDisplayErrorCategory RENDER;
    public static final GeoDisplayErrorCategory RESOURCE;
    public static final GeoDisplayErrorCategory STYLE_LOAD;
    public static final GeoDisplayErrorCategory TILE_PARSE;
    public static final GeoDisplayErrorCategory UNKNOWN;
    public final int value;

    static {
        GeoDisplayErrorCategory geoDisplayErrorCategory = new GeoDisplayErrorCategory("STYLE_LOAD", 0, 0);
        STYLE_LOAD = geoDisplayErrorCategory;
        GeoDisplayErrorCategory geoDisplayErrorCategory2 = new GeoDisplayErrorCategory("RENDER", 1, 1);
        RENDER = geoDisplayErrorCategory2;
        GeoDisplayErrorCategory geoDisplayErrorCategory3 = new GeoDisplayErrorCategory("RESOURCE", 2, 2);
        RESOURCE = geoDisplayErrorCategory3;
        GeoDisplayErrorCategory geoDisplayErrorCategory4 = new GeoDisplayErrorCategory("TILE_PARSE", 3, 3);
        TILE_PARSE = geoDisplayErrorCategory4;
        GeoDisplayErrorCategory geoDisplayErrorCategory5 = new GeoDisplayErrorCategory("GLSL_COMPILE", 4, 4);
        GLSL_COMPILE = geoDisplayErrorCategory5;
        GeoDisplayErrorCategory geoDisplayErrorCategory6 = new GeoDisplayErrorCategory("NETWORK", 5, 5);
        NETWORK = geoDisplayErrorCategory6;
        GeoDisplayErrorCategory geoDisplayErrorCategory7 = new GeoDisplayErrorCategory("UNKNOWN", 6, 6);
        UNKNOWN = geoDisplayErrorCategory7;
        GeoDisplayErrorCategory[] geoDisplayErrorCategoryArr = {geoDisplayErrorCategory, geoDisplayErrorCategory2, geoDisplayErrorCategory3, geoDisplayErrorCategory4, geoDisplayErrorCategory5, geoDisplayErrorCategory6, geoDisplayErrorCategory7};
        $VALUES = geoDisplayErrorCategoryArr;
        $ENTRIES = C3cG.A0w(geoDisplayErrorCategoryArr);
    }

    public static Ey9<GeoDisplayErrorCategory> getEntries() {
        return $ENTRIES;
    }

    public static GeoDisplayErrorCategory valueOf(String str) {
        return (GeoDisplayErrorCategory) Enum.valueOf(GeoDisplayErrorCategory.class, str);
    }

    public static GeoDisplayErrorCategory[] values() {
        return (GeoDisplayErrorCategory[]) $VALUES.clone();
    }

    public GeoDisplayErrorCategory(String str, int i, int i2) {
        this.value = i2;
    }
}
