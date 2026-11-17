package com.facebook.aura.network.transport;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchRequestCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchRequestCategory[] $VALUES;
    public static final HatchRequestCategory API;
    public static final HatchRequestCategory CRITICAL_API;
    public static final HatchRequestCategory IMAGE;
    public static final HatchRequestCategory VIDEO;

    static {
        HatchRequestCategory hatchRequestCategory = new HatchRequestCategory("API", 0);
        API = hatchRequestCategory;
        HatchRequestCategory hatchRequestCategory2 = new HatchRequestCategory("CRITICAL_API", 1);
        CRITICAL_API = hatchRequestCategory2;
        HatchRequestCategory hatchRequestCategory3 = new HatchRequestCategory("IMAGE", 2);
        IMAGE = hatchRequestCategory3;
        HatchRequestCategory hatchRequestCategory4 = new HatchRequestCategory("VIDEO", 3);
        VIDEO = hatchRequestCategory4;
        HatchRequestCategory[] hatchRequestCategoryArr = {hatchRequestCategory, hatchRequestCategory2, hatchRequestCategory3, hatchRequestCategory4};
        $VALUES = hatchRequestCategoryArr;
        $ENTRIES = C3cG.A0w(hatchRequestCategoryArr);
    }

    public static Ey9<HatchRequestCategory> getEntries() {
        return $ENTRIES;
    }

    public static HatchRequestCategory valueOf(String str) {
        return (HatchRequestCategory) Enum.valueOf(HatchRequestCategory.class, str);
    }

    public static HatchRequestCategory[] values() {
        return (HatchRequestCategory[]) $VALUES.clone();
    }

    public HatchRequestCategory(String str, int i) {
    }
}
