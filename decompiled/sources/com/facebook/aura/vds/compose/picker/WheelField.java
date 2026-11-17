package com.facebook.aura.vds.compose.picker;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WheelField {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WheelField[] $VALUES;
    public static final WheelField DAY;
    public static final WheelField MONTH;
    public static final WheelField YEAR;

    static {
        WheelField wheelField = new WheelField("MONTH", 0);
        MONTH = wheelField;
        WheelField wheelField2 = new WheelField("DAY", 1);
        DAY = wheelField2;
        WheelField wheelField3 = new WheelField("YEAR", 2);
        YEAR = wheelField3;
        WheelField[] wheelFieldArr = {wheelField, wheelField2, wheelField3};
        $VALUES = wheelFieldArr;
        $ENTRIES = new F3w(wheelFieldArr);
    }

    public static Ey9<WheelField> getEntries() {
        return $ENTRIES;
    }

    public static WheelField valueOf(String str) {
        return (WheelField) Enum.valueOf(WheelField.class, str);
    }

    public static WheelField[] values() {
        return (WheelField[]) $VALUES.clone();
    }

    public WheelField(String str, int i) {
    }
}
