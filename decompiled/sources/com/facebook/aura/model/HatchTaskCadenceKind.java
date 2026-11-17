package com.facebook.aura.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchTaskCadenceKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchTaskCadenceKind[] $VALUES;
    public static final HatchTaskCadenceKind DAILY;
    public static final HatchTaskCadenceKind INTERVAL;
    public static final HatchTaskCadenceKind MONTHLY;
    public static final HatchTaskCadenceKind RUNONCE;
    public static final HatchTaskCadenceKind WEEKLY;
    public static final HatchTaskCadenceKind YEARLY;

    static {
        HatchTaskCadenceKind hatchTaskCadenceKind = new HatchTaskCadenceKind("RUNONCE", 0);
        RUNONCE = hatchTaskCadenceKind;
        HatchTaskCadenceKind hatchTaskCadenceKind2 = new HatchTaskCadenceKind("INTERVAL", 1);
        INTERVAL = hatchTaskCadenceKind2;
        HatchTaskCadenceKind hatchTaskCadenceKind3 = new HatchTaskCadenceKind("DAILY", 2);
        DAILY = hatchTaskCadenceKind3;
        HatchTaskCadenceKind hatchTaskCadenceKind4 = new HatchTaskCadenceKind("WEEKLY", 3);
        WEEKLY = hatchTaskCadenceKind4;
        HatchTaskCadenceKind hatchTaskCadenceKind5 = new HatchTaskCadenceKind("MONTHLY", 4);
        MONTHLY = hatchTaskCadenceKind5;
        HatchTaskCadenceKind hatchTaskCadenceKind6 = new HatchTaskCadenceKind("YEARLY", 5);
        YEARLY = hatchTaskCadenceKind6;
        HatchTaskCadenceKind[] hatchTaskCadenceKindArr = {hatchTaskCadenceKind, hatchTaskCadenceKind2, hatchTaskCadenceKind3, hatchTaskCadenceKind4, hatchTaskCadenceKind5, hatchTaskCadenceKind6};
        $VALUES = hatchTaskCadenceKindArr;
        $ENTRIES = C3cG.A0w(hatchTaskCadenceKindArr);
    }

    public static Ey9<HatchTaskCadenceKind> getEntries() {
        return $ENTRIES;
    }

    public static HatchTaskCadenceKind valueOf(String str) {
        return (HatchTaskCadenceKind) Enum.valueOf(HatchTaskCadenceKind.class, str);
    }

    public static HatchTaskCadenceKind[] values() {
        return (HatchTaskCadenceKind[]) $VALUES.clone();
    }

    public HatchTaskCadenceKind(String str, int i) {
    }
}
