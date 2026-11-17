package com.meta.maps.fancypins;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SizeConstraint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SizeConstraint[] $VALUES;
    public static final SizeConstraint AUTO;
    public static final SizeConstraint FIXED;
    public final String jsonValue;

    static {
        SizeConstraint sizeConstraint = new SizeConstraint("FIXED", 0, "fixed");
        FIXED = sizeConstraint;
        SizeConstraint sizeConstraint2 = new SizeConstraint("AUTO", 1, "auto");
        AUTO = sizeConstraint2;
        SizeConstraint[] sizeConstraintArr = {sizeConstraint, sizeConstraint2};
        $VALUES = sizeConstraintArr;
        $ENTRIES = C3cG.A0w(sizeConstraintArr);
    }

    public static Ey9<SizeConstraint> getEntries() {
        return $ENTRIES;
    }

    public static SizeConstraint valueOf(String str) {
        return (SizeConstraint) Enum.valueOf(SizeConstraint.class, str);
    }

    public static SizeConstraint[] values() {
        return (SizeConstraint[]) $VALUES.clone();
    }

    public final String getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.jsonValue;
    }

    public SizeConstraint(String str, int i, String str2) {
        this.jsonValue = str2;
    }
}
