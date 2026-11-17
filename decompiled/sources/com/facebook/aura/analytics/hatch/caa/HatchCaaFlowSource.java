package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaFlowSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaFlowSource[] $VALUES;
    public static final HatchCaaFlowSource FALLBACK;
    public static final HatchCaaFlowSource SERVER;
    public final String value;

    static {
        HatchCaaFlowSource hatchCaaFlowSource = new HatchCaaFlowSource("SERVER", 0, HatchDataExportRepositoryKt.FAILURE_SERVER);
        SERVER = hatchCaaFlowSource;
        HatchCaaFlowSource hatchCaaFlowSource2 = new HatchCaaFlowSource("FALLBACK", 1, "fallback");
        FALLBACK = hatchCaaFlowSource2;
        HatchCaaFlowSource[] hatchCaaFlowSourceArr = {hatchCaaFlowSource, hatchCaaFlowSource2};
        $VALUES = hatchCaaFlowSourceArr;
        $ENTRIES = C3cG.A0w(hatchCaaFlowSourceArr);
    }

    public static Ey9<HatchCaaFlowSource> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaFlowSource valueOf(String str) {
        return (HatchCaaFlowSource) Enum.valueOf(HatchCaaFlowSource.class, str);
    }

    public static HatchCaaFlowSource[] values() {
        return (HatchCaaFlowSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaFlowSource(String str, int i, String str2) {
        this.value = str2;
    }
}
