package com.meta.maps.display;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GestureType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GestureType[] $VALUES;
    public static final GestureType DOUBLE_TAP;
    public static final GestureType LONG_PRESS;
    public static final GestureType SWIPE;
    public static final GestureType TAP;
    public final int value;

    static {
        GestureType gestureType = new GestureType("TAP", 0, 0);
        TAP = gestureType;
        GestureType gestureType2 = new GestureType("DOUBLE_TAP", 1, 1);
        DOUBLE_TAP = gestureType2;
        GestureType gestureType3 = new GestureType("LONG_PRESS", 2, 2);
        LONG_PRESS = gestureType3;
        GestureType gestureType4 = new GestureType("SWIPE", 3, 3);
        SWIPE = gestureType4;
        GestureType[] gestureTypeArr = {gestureType, gestureType2, gestureType3, gestureType4};
        $VALUES = gestureTypeArr;
        $ENTRIES = C3cG.A0w(gestureTypeArr);
    }

    public static Ey9<GestureType> getEntries() {
        return $ENTRIES;
    }

    public static GestureType valueOf(String str) {
        return (GestureType) Enum.valueOf(GestureType.class, str);
    }

    public static GestureType[] values() {
        return (GestureType[]) $VALUES.clone();
    }

    public GestureType(String str, int i, int i2) {
        this.value = i2;
    }
}
