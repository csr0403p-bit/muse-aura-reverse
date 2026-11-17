package com.facebook.aura.confidentialvm.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmDataChoice {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmDataChoice[] $VALUES;
    public static final ConfidentialVmDataChoice START_FRESH;
    public static final ConfidentialVmDataChoice UPGRADE_MIGRATION;

    static {
        ConfidentialVmDataChoice confidentialVmDataChoice = new ConfidentialVmDataChoice("UPGRADE_MIGRATION", 0);
        UPGRADE_MIGRATION = confidentialVmDataChoice;
        ConfidentialVmDataChoice confidentialVmDataChoice2 = new ConfidentialVmDataChoice("START_FRESH", 1);
        START_FRESH = confidentialVmDataChoice2;
        ConfidentialVmDataChoice[] confidentialVmDataChoiceArr = {confidentialVmDataChoice, confidentialVmDataChoice2};
        $VALUES = confidentialVmDataChoiceArr;
        $ENTRIES = new F3w(confidentialVmDataChoiceArr);
    }

    public static Ey9<ConfidentialVmDataChoice> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmDataChoice valueOf(String str) {
        return (ConfidentialVmDataChoice) Enum.valueOf(ConfidentialVmDataChoice.class, str);
    }

    public static ConfidentialVmDataChoice[] values() {
        return (ConfidentialVmDataChoice[]) $VALUES.clone();
    }

    public ConfidentialVmDataChoice(String str, int i) {
    }
}
