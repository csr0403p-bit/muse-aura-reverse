package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRegistrationEventCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRegistrationEventCategory[] $VALUES;
    public static final HatchCaaRegistrationEventCategory CONFIRMATION_FUNNEL;
    public static final HatchCaaRegistrationEventCategory REGISTRATION_FUNNEL;
    public final String value;

    static {
        HatchCaaRegistrationEventCategory hatchCaaRegistrationEventCategory = new HatchCaaRegistrationEventCategory("REGISTRATION_FUNNEL", 0, "registration_funnel");
        REGISTRATION_FUNNEL = hatchCaaRegistrationEventCategory;
        HatchCaaRegistrationEventCategory hatchCaaRegistrationEventCategory2 = new HatchCaaRegistrationEventCategory("CONFIRMATION_FUNNEL", 1, "confirmation_funnel");
        CONFIRMATION_FUNNEL = hatchCaaRegistrationEventCategory2;
        HatchCaaRegistrationEventCategory[] hatchCaaRegistrationEventCategoryArr = {hatchCaaRegistrationEventCategory, hatchCaaRegistrationEventCategory2};
        $VALUES = hatchCaaRegistrationEventCategoryArr;
        $ENTRIES = C3cG.A0w(hatchCaaRegistrationEventCategoryArr);
    }

    public static Ey9<HatchCaaRegistrationEventCategory> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRegistrationEventCategory valueOf(String str) {
        return (HatchCaaRegistrationEventCategory) Enum.valueOf(HatchCaaRegistrationEventCategory.class, str);
    }

    public static HatchCaaRegistrationEventCategory[] values() {
        return (HatchCaaRegistrationEventCategory[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaRegistrationEventCategory(String str, int i, String str2) {
        this.value = str2;
    }
}
