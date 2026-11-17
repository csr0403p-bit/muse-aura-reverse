package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaAccountRecoveryEventStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaAccountRecoveryEventStep[] $VALUES;
    public static final HatchCaaAccountRecoveryEventStep PASSWORD_FORM;
    public final String value;

    static {
        HatchCaaAccountRecoveryEventStep hatchCaaAccountRecoveryEventStep = new HatchCaaAccountRecoveryEventStep("PASSWORD_FORM", 0, "PASWORD_FORM");
        PASSWORD_FORM = hatchCaaAccountRecoveryEventStep;
        HatchCaaAccountRecoveryEventStep[] hatchCaaAccountRecoveryEventStepArr = {hatchCaaAccountRecoveryEventStep};
        $VALUES = hatchCaaAccountRecoveryEventStepArr;
        $ENTRIES = C3cG.A0w(hatchCaaAccountRecoveryEventStepArr);
    }

    public static Ey9<HatchCaaAccountRecoveryEventStep> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaAccountRecoveryEventStep valueOf(String str) {
        return (HatchCaaAccountRecoveryEventStep) Enum.valueOf(HatchCaaAccountRecoveryEventStep.class, str);
    }

    public static HatchCaaAccountRecoveryEventStep[] values() {
        return (HatchCaaAccountRecoveryEventStep[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaAccountRecoveryEventStep(String str, int i, String str2) {
        this.value = str2;
    }
}
