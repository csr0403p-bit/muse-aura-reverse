package com.meta.maps.display;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class GeometryType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GeometryType[] $VALUES;
    public static final GeometryType GEOMETRY_COLLECTION;
    public static final GeometryType LINE_STRING;
    public static final GeometryType MULTI_LINE_STRING;
    public static final GeometryType MULTI_POINT;
    public static final GeometryType MULTI_POLYGON;
    public static final GeometryType POINT;
    public static final GeometryType POLYGON;
    public final int value;

    static {
        GeometryType geometryType = new GeometryType("POINT", 0, 0);
        POINT = geometryType;
        GeometryType geometryType2 = new GeometryType("LINE_STRING", 1, 1);
        LINE_STRING = geometryType2;
        GeometryType geometryType3 = new GeometryType("POLYGON", 2, 2);
        POLYGON = geometryType3;
        GeometryType geometryType4 = new GeometryType("MULTI_POINT", 3, 3);
        MULTI_POINT = geometryType4;
        GeometryType geometryType5 = new GeometryType("MULTI_LINE_STRING", 4, 4);
        MULTI_LINE_STRING = geometryType5;
        GeometryType geometryType6 = new GeometryType("MULTI_POLYGON", 5, 5);
        MULTI_POLYGON = geometryType6;
        GeometryType geometryType7 = new GeometryType("GEOMETRY_COLLECTION", 6, 6);
        GEOMETRY_COLLECTION = geometryType7;
        GeometryType[] geometryTypeArr = {geometryType, geometryType2, geometryType3, geometryType4, geometryType5, geometryType6, geometryType7};
        $VALUES = geometryTypeArr;
        $ENTRIES = new F3w(geometryTypeArr);
    }

    public static Ey9<GeometryType> getEntries() {
        return $ENTRIES;
    }

    public static GeometryType valueOf(String str) {
        return (GeometryType) Enum.valueOf(GeometryType.class, str);
    }

    public static GeometryType[] values() {
        return (GeometryType[]) $VALUES.clone();
    }

    public GeometryType(String str, int i, int i2) {
        this.value = i2;
    }
}
