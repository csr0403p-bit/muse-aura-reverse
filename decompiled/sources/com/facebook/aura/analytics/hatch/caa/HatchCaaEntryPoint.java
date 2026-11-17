package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaEntryPoint[] $VALUES;
    public static final HatchCaaEntryPoint AYMH;
    public static final HatchCaaEntryPoint LOGIN_HOME;
    public static final HatchCaaEntryPoint NTP_LANDING;
    public static final HatchCaaEntryPoint NTP_UPSELL;
    public static final HatchCaaEntryPoint ZARI_AUTO_REGISTER;
    public final String value;

    static {
        HatchCaaEntryPoint hatchCaaEntryPoint = new HatchCaaEntryPoint("LOGIN_HOME", 0, "login_home");
        LOGIN_HOME = hatchCaaEntryPoint;
        HatchCaaEntryPoint hatchCaaEntryPoint2 = new HatchCaaEntryPoint("ZARI_AUTO_REGISTER", 1, "zari_auto_register");
        ZARI_AUTO_REGISTER = hatchCaaEntryPoint2;
        HatchCaaEntryPoint hatchCaaEntryPoint3 = new HatchCaaEntryPoint("AYMH", 2, "aymh");
        AYMH = hatchCaaEntryPoint3;
        HatchCaaEntryPoint hatchCaaEntryPoint4 = new HatchCaaEntryPoint("NTP_LANDING", 3, "ntp_landing");
        NTP_LANDING = hatchCaaEntryPoint4;
        HatchCaaEntryPoint hatchCaaEntryPoint5 = new HatchCaaEntryPoint("NTP_UPSELL", 4, "ntp_upsell");
        NTP_UPSELL = hatchCaaEntryPoint5;
        HatchCaaEntryPoint[] hatchCaaEntryPointArr = {hatchCaaEntryPoint, hatchCaaEntryPoint2, hatchCaaEntryPoint3, hatchCaaEntryPoint4, hatchCaaEntryPoint5};
        $VALUES = hatchCaaEntryPointArr;
        $ENTRIES = C3cG.A0w(hatchCaaEntryPointArr);
    }

    public static Ey9<HatchCaaEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaEntryPoint valueOf(String str) {
        return (HatchCaaEntryPoint) Enum.valueOf(HatchCaaEntryPoint.class, str);
    }

    public static HatchCaaEntryPoint[] values() {
        return (HatchCaaEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
