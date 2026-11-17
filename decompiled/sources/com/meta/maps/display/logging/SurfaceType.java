package com.meta.maps.display.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SurfaceType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SurfaceType[] $VALUES;
    public static final SurfaceType BLOKS;
    public static final SurfaceType NATIVE;
    public static final SurfaceType REACT_NATIVE;
    public static final SurfaceType UNKNOWN;
    public final int value;

    static {
        SurfaceType surfaceType = new SurfaceType("REACT_NATIVE", 0, 0);
        REACT_NATIVE = surfaceType;
        SurfaceType surfaceType2 = new SurfaceType("BLOKS", 1, 1);
        BLOKS = surfaceType2;
        SurfaceType surfaceType3 = new SurfaceType("NATIVE", 2, 2);
        NATIVE = surfaceType3;
        SurfaceType surfaceType4 = new SurfaceType("UNKNOWN", 3, 3);
        UNKNOWN = surfaceType4;
        SurfaceType[] surfaceTypeArr = {surfaceType, surfaceType2, surfaceType3, surfaceType4};
        $VALUES = surfaceTypeArr;
        $ENTRIES = C3cG.A0w(surfaceTypeArr);
    }

    public static Ey9<SurfaceType> getEntries() {
        return $ENTRIES;
    }

    public static SurfaceType valueOf(String str) {
        return (SurfaceType) Enum.valueOf(SurfaceType.class, str);
    }

    public static SurfaceType[] values() {
        return (SurfaceType[]) $VALUES.clone();
    }

    public SurfaceType(String str, int i, int i2) {
        this.value = i2;
    }
}
