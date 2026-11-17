package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchClientCvmOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchClientCvmOutcome[] $VALUES;
    public static final HatchClientCvmOutcome ATTEMPT;
    public static final HatchClientCvmOutcome FAILURE;
    public static final HatchClientCvmOutcome SUCCESS;

    static {
        HatchClientCvmOutcome hatchClientCvmOutcome = new HatchClientCvmOutcome("ATTEMPT", 0);
        ATTEMPT = hatchClientCvmOutcome;
        HatchClientCvmOutcome hatchClientCvmOutcome2 = new HatchClientCvmOutcome("SUCCESS", 1);
        SUCCESS = hatchClientCvmOutcome2;
        HatchClientCvmOutcome hatchClientCvmOutcome3 = new HatchClientCvmOutcome("FAILURE", 2);
        FAILURE = hatchClientCvmOutcome3;
        HatchClientCvmOutcome[] hatchClientCvmOutcomeArr = {hatchClientCvmOutcome, hatchClientCvmOutcome2, hatchClientCvmOutcome3};
        $VALUES = hatchClientCvmOutcomeArr;
        $ENTRIES = new F3w(hatchClientCvmOutcomeArr);
    }

    public static Ey9<HatchClientCvmOutcome> getEntries() {
        return $ENTRIES;
    }

    public static HatchClientCvmOutcome valueOf(String str) {
        return (HatchClientCvmOutcome) Enum.valueOf(HatchClientCvmOutcome.class, str);
    }

    public static HatchClientCvmOutcome[] values() {
        return (HatchClientCvmOutcome[]) $VALUES.clone();
    }

    public HatchClientCvmOutcome(String str, int i) {
    }
}
