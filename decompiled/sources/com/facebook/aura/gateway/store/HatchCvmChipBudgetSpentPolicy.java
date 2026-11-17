package com.facebook.aura.gateway.store;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchCvmChipBudgetSpentPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmChipBudgetSpentPolicy[] $VALUES;
    public static final HatchCvmChipBudgetSpentPolicy DRAW;
    public static final HatchCvmChipBudgetSpentPolicy RESEND;
    public static final HatchCvmChipBudgetSpentPolicy STOP;

    static {
        HatchCvmChipBudgetSpentPolicy hatchCvmChipBudgetSpentPolicy = new HatchCvmChipBudgetSpentPolicy("STOP", 0);
        STOP = hatchCvmChipBudgetSpentPolicy;
        HatchCvmChipBudgetSpentPolicy hatchCvmChipBudgetSpentPolicy2 = new HatchCvmChipBudgetSpentPolicy("RESEND", 1);
        RESEND = hatchCvmChipBudgetSpentPolicy2;
        HatchCvmChipBudgetSpentPolicy hatchCvmChipBudgetSpentPolicy3 = new HatchCvmChipBudgetSpentPolicy("DRAW", 2);
        DRAW = hatchCvmChipBudgetSpentPolicy3;
        HatchCvmChipBudgetSpentPolicy[] hatchCvmChipBudgetSpentPolicyArr = {hatchCvmChipBudgetSpentPolicy, hatchCvmChipBudgetSpentPolicy2, hatchCvmChipBudgetSpentPolicy3};
        $VALUES = hatchCvmChipBudgetSpentPolicyArr;
        $ENTRIES = C3cG.A0w(hatchCvmChipBudgetSpentPolicyArr);
    }

    public static Ey9<HatchCvmChipBudgetSpentPolicy> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmChipBudgetSpentPolicy valueOf(String str) {
        return (HatchCvmChipBudgetSpentPolicy) Enum.valueOf(HatchCvmChipBudgetSpentPolicy.class, str);
    }

    public static HatchCvmChipBudgetSpentPolicy[] values() {
        return (HatchCvmChipBudgetSpentPolicy[]) $VALUES.clone();
    }

    public HatchCvmChipBudgetSpentPolicy(String str, int i) {
    }
}
