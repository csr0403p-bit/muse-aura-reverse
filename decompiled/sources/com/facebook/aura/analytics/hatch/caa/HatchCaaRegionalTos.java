package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRegionalTos {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRegionalTos[] $VALUES;
    public static final HatchCaaRegionalTos KOREA;
    public final String value;

    static {
        HatchCaaRegionalTos hatchCaaRegionalTos = new HatchCaaRegionalTos("KOREA", 0, "kr");
        KOREA = hatchCaaRegionalTos;
        HatchCaaRegionalTos[] hatchCaaRegionalTosArr = {hatchCaaRegionalTos};
        $VALUES = hatchCaaRegionalTosArr;
        $ENTRIES = C3cG.A0w(hatchCaaRegionalTosArr);
    }

    public static Ey9<HatchCaaRegionalTos> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRegionalTos valueOf(String str) {
        return (HatchCaaRegionalTos) Enum.valueOf(HatchCaaRegionalTos.class, str);
    }

    public static HatchCaaRegionalTos[] values() {
        return (HatchCaaRegionalTos[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaRegionalTos(String str, int i, String str2) {
        this.value = str2;
    }
}
