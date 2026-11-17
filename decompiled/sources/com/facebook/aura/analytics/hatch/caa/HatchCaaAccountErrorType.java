package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaAccountErrorType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaAccountErrorType[] $VALUES;
    public static final HatchCaaAccountErrorType INTEGRITY_ERROR;
    public static final HatchCaaAccountErrorType SYSTEM_ERROR;
    public static final HatchCaaAccountErrorType UNKNOWN_ERROR;
    public static final HatchCaaAccountErrorType USER_ERROR;
    public final String value;

    static {
        HatchCaaAccountErrorType hatchCaaAccountErrorType = new HatchCaaAccountErrorType("USER_ERROR", 0, "user_error");
        USER_ERROR = hatchCaaAccountErrorType;
        HatchCaaAccountErrorType hatchCaaAccountErrorType2 = new HatchCaaAccountErrorType("INTEGRITY_ERROR", 1, "integrity_error");
        INTEGRITY_ERROR = hatchCaaAccountErrorType2;
        HatchCaaAccountErrorType hatchCaaAccountErrorType3 = new HatchCaaAccountErrorType("SYSTEM_ERROR", 2, "system_error");
        SYSTEM_ERROR = hatchCaaAccountErrorType3;
        HatchCaaAccountErrorType hatchCaaAccountErrorType4 = new HatchCaaAccountErrorType("UNKNOWN_ERROR", 3, "unknown_error");
        UNKNOWN_ERROR = hatchCaaAccountErrorType4;
        HatchCaaAccountErrorType[] hatchCaaAccountErrorTypeArr = {hatchCaaAccountErrorType, hatchCaaAccountErrorType2, hatchCaaAccountErrorType3, hatchCaaAccountErrorType4};
        $VALUES = hatchCaaAccountErrorTypeArr;
        $ENTRIES = C3cG.A0w(hatchCaaAccountErrorTypeArr);
    }

    public static Ey9<HatchCaaAccountErrorType> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaAccountErrorType valueOf(String str) {
        return (HatchCaaAccountErrorType) Enum.valueOf(HatchCaaAccountErrorType.class, str);
    }

    public static HatchCaaAccountErrorType[] values() {
        return (HatchCaaAccountErrorType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaAccountErrorType(String str, int i, String str2) {
        this.value = str2;
    }
}
