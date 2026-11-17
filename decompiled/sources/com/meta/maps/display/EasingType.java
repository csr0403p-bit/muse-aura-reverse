package com.meta.maps.display;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EasingType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EasingType[] $VALUES;
    public static final EasingType EASE_IN_OUT;
    public static final EasingType LINEAR;
    public final int value;

    static {
        EasingType easingType = new EasingType("LINEAR", 0, 0);
        LINEAR = easingType;
        EasingType easingType2 = new EasingType("EASE_IN_OUT", 1, 1);
        EASE_IN_OUT = easingType2;
        EasingType[] easingTypeArr = {easingType, easingType2};
        $VALUES = easingTypeArr;
        $ENTRIES = C3cG.A0w(easingTypeArr);
    }

    public static Ey9<EasingType> getEntries() {
        return $ENTRIES;
    }

    public static EasingType valueOf(String str) {
        return (EasingType) Enum.valueOf(EasingType.class, str);
    }

    public static EasingType[] values() {
        return (EasingType[]) $VALUES.clone();
    }

    public EasingType(String str, int i, int i2) {
        this.value = i2;
    }
}
