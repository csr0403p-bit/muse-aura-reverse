package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaAccountRecoveryEventCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaAccountRecoveryEventCategory[] $VALUES;
    public static final HatchCaaAccountRecoveryEventCategory LOGIN;
    public final String value;

    static {
        HatchCaaAccountRecoveryEventCategory hatchCaaAccountRecoveryEventCategory = new HatchCaaAccountRecoveryEventCategory("LOGIN", 0, HatchStartupPoints.SURFACE_LOGIN);
        LOGIN = hatchCaaAccountRecoveryEventCategory;
        HatchCaaAccountRecoveryEventCategory[] hatchCaaAccountRecoveryEventCategoryArr = {hatchCaaAccountRecoveryEventCategory};
        $VALUES = hatchCaaAccountRecoveryEventCategoryArr;
        $ENTRIES = C3cG.A0w(hatchCaaAccountRecoveryEventCategoryArr);
    }

    public static Ey9<HatchCaaAccountRecoveryEventCategory> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaAccountRecoveryEventCategory valueOf(String str) {
        return (HatchCaaAccountRecoveryEventCategory) Enum.valueOf(HatchCaaAccountRecoveryEventCategory.class, str);
    }

    public static HatchCaaAccountRecoveryEventCategory[] values() {
        return (HatchCaaAccountRecoveryEventCategory[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaAccountRecoveryEventCategory(String str, int i, String str2) {
        this.value = str2;
    }
}
