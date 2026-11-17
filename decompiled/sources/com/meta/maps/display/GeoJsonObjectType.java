package com.meta.maps.display;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GeoJsonObjectType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GeoJsonObjectType[] $VALUES;
    public static final GeoJsonObjectType FEATURE;
    public static final GeoJsonObjectType FEATURE_COLLECTION;
    public static final GeoJsonObjectType GEOMETRY;
    public final int value;

    static {
        GeoJsonObjectType geoJsonObjectType = new GeoJsonObjectType("GEOMETRY", 0, 0);
        GEOMETRY = geoJsonObjectType;
        GeoJsonObjectType geoJsonObjectType2 = new GeoJsonObjectType("FEATURE", 1, 1);
        FEATURE = geoJsonObjectType2;
        GeoJsonObjectType geoJsonObjectType3 = new GeoJsonObjectType("FEATURE_COLLECTION", 2, 2);
        FEATURE_COLLECTION = geoJsonObjectType3;
        GeoJsonObjectType[] geoJsonObjectTypeArr = {geoJsonObjectType, geoJsonObjectType2, geoJsonObjectType3};
        $VALUES = geoJsonObjectTypeArr;
        $ENTRIES = C3cG.A0w(geoJsonObjectTypeArr);
    }

    public static Ey9<GeoJsonObjectType> getEntries() {
        return $ENTRIES;
    }

    public static GeoJsonObjectType valueOf(String str) {
        return (GeoJsonObjectType) Enum.valueOf(GeoJsonObjectType.class, str);
    }

    public static GeoJsonObjectType[] values() {
        return (GeoJsonObjectType[]) $VALUES.clone();
    }

    public GeoJsonObjectType(String str, int i, int i2) {
        this.value = i2;
    }
}
