package com.facebook.aura.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchSendErrorCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSendErrorCategory[] $VALUES;
    public static final HatchSendErrorCategory NON_TRANSPORT;
    public static final HatchSendErrorCategory TRANSPORT;

    static {
        HatchSendErrorCategory hatchSendErrorCategory = new HatchSendErrorCategory("TRANSPORT", 0);
        TRANSPORT = hatchSendErrorCategory;
        HatchSendErrorCategory hatchSendErrorCategory2 = new HatchSendErrorCategory("NON_TRANSPORT", 1);
        NON_TRANSPORT = hatchSendErrorCategory2;
        HatchSendErrorCategory[] hatchSendErrorCategoryArr = {hatchSendErrorCategory, hatchSendErrorCategory2};
        $VALUES = hatchSendErrorCategoryArr;
        $ENTRIES = C3cG.A0w(hatchSendErrorCategoryArr);
    }

    public static Ey9<HatchSendErrorCategory> getEntries() {
        return $ENTRIES;
    }

    public static HatchSendErrorCategory valueOf(String str) {
        return (HatchSendErrorCategory) Enum.valueOf(HatchSendErrorCategory.class, str);
    }

    public static HatchSendErrorCategory[] values() {
        return (HatchSendErrorCategory[]) $VALUES.clone();
    }

    public HatchSendErrorCategory(String str, int i) {
    }
}
