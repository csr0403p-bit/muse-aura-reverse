package com.facebook.aura.status.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchTaskRunTone {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchTaskRunTone[] $VALUES;
    public static final HatchTaskRunTone ERROR;
    public static final HatchTaskRunTone NEUTRAL;
    public static final HatchTaskRunTone SUCCESS;
    public static final HatchTaskRunTone WARNING;

    static {
        HatchTaskRunTone hatchTaskRunTone = new HatchTaskRunTone("SUCCESS", 0);
        SUCCESS = hatchTaskRunTone;
        HatchTaskRunTone hatchTaskRunTone2 = new HatchTaskRunTone("WARNING", 1);
        WARNING = hatchTaskRunTone2;
        HatchTaskRunTone hatchTaskRunTone3 = new HatchTaskRunTone("ERROR", 2);
        ERROR = hatchTaskRunTone3;
        HatchTaskRunTone hatchTaskRunTone4 = new HatchTaskRunTone("NEUTRAL", 3);
        NEUTRAL = hatchTaskRunTone4;
        HatchTaskRunTone[] hatchTaskRunToneArr = {hatchTaskRunTone, hatchTaskRunTone2, hatchTaskRunTone3, hatchTaskRunTone4};
        $VALUES = hatchTaskRunToneArr;
        $ENTRIES = C3cG.A0w(hatchTaskRunToneArr);
    }

    public static Ey9<HatchTaskRunTone> getEntries() {
        return $ENTRIES;
    }

    public static HatchTaskRunTone valueOf(String str) {
        return (HatchTaskRunTone) Enum.valueOf(HatchTaskRunTone.class, str);
    }

    public static HatchTaskRunTone[] values() {
        return (HatchTaskRunTone[]) $VALUES.clone();
    }

    public HatchTaskRunTone(String str, int i) {
    }
}
