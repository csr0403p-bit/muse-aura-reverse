package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchTwoFactorMethodType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchTwoFactorMethodType[] $VALUES;
    public static final HatchTwoFactorMethodType ADMIN_CODES;
    public static final HatchTwoFactorMethodType RECOVERY_CODES;
    public static final HatchTwoFactorMethodType SMS;
    public static final HatchTwoFactorMethodType TOTP;
    public static final HatchTwoFactorMethodType UNKNOWN;

    static {
        HatchTwoFactorMethodType hatchTwoFactorMethodType = new HatchTwoFactorMethodType("SMS", 0);
        SMS = hatchTwoFactorMethodType;
        HatchTwoFactorMethodType hatchTwoFactorMethodType2 = new HatchTwoFactorMethodType("TOTP", 1);
        TOTP = hatchTwoFactorMethodType2;
        HatchTwoFactorMethodType hatchTwoFactorMethodType3 = new HatchTwoFactorMethodType("RECOVERY_CODES", 2);
        RECOVERY_CODES = hatchTwoFactorMethodType3;
        HatchTwoFactorMethodType hatchTwoFactorMethodType4 = new HatchTwoFactorMethodType("ADMIN_CODES", 3);
        ADMIN_CODES = hatchTwoFactorMethodType4;
        HatchTwoFactorMethodType hatchTwoFactorMethodType5 = new HatchTwoFactorMethodType("UNKNOWN", 4);
        UNKNOWN = hatchTwoFactorMethodType5;
        HatchTwoFactorMethodType[] hatchTwoFactorMethodTypeArr = {hatchTwoFactorMethodType, hatchTwoFactorMethodType2, hatchTwoFactorMethodType3, hatchTwoFactorMethodType4, hatchTwoFactorMethodType5};
        $VALUES = hatchTwoFactorMethodTypeArr;
        $ENTRIES = C3cG.A0w(hatchTwoFactorMethodTypeArr);
    }

    public static Ey9<HatchTwoFactorMethodType> getEntries() {
        return $ENTRIES;
    }

    public static HatchTwoFactorMethodType valueOf(String str) {
        return (HatchTwoFactorMethodType) Enum.valueOf(HatchTwoFactorMethodType.class, str);
    }

    public static HatchTwoFactorMethodType[] values() {
        return (HatchTwoFactorMethodType[]) $VALUES.clone();
    }

    public HatchTwoFactorMethodType(String str, int i) {
    }
}
