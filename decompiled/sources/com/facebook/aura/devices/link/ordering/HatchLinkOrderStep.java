package com.facebook.aura.devices.link.ordering;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkOrderStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderStep[] $VALUES;
    public static final HatchLinkOrderStep ADDRESS_ENTRY;
    public static final HatchLinkOrderStep CONFIRMED;
    public static final HatchLinkOrderStep DETAILS;
    public static final HatchLinkOrderStep INFO;
    public static final HatchLinkOrderStep SUBMITTING;

    static {
        HatchLinkOrderStep hatchLinkOrderStep = new HatchLinkOrderStep("INFO", 0);
        INFO = hatchLinkOrderStep;
        HatchLinkOrderStep hatchLinkOrderStep2 = new HatchLinkOrderStep("DETAILS", 1);
        DETAILS = hatchLinkOrderStep2;
        HatchLinkOrderStep hatchLinkOrderStep3 = new HatchLinkOrderStep("ADDRESS_ENTRY", 2);
        ADDRESS_ENTRY = hatchLinkOrderStep3;
        HatchLinkOrderStep hatchLinkOrderStep4 = new HatchLinkOrderStep("SUBMITTING", 3);
        SUBMITTING = hatchLinkOrderStep4;
        HatchLinkOrderStep hatchLinkOrderStep5 = new HatchLinkOrderStep("CONFIRMED", 4);
        CONFIRMED = hatchLinkOrderStep5;
        HatchLinkOrderStep[] hatchLinkOrderStepArr = {hatchLinkOrderStep, hatchLinkOrderStep2, hatchLinkOrderStep3, hatchLinkOrderStep4, hatchLinkOrderStep5};
        $VALUES = hatchLinkOrderStepArr;
        $ENTRIES = C3cG.A0w(hatchLinkOrderStepArr);
    }

    public static Ey9<HatchLinkOrderStep> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderStep valueOf(String str) {
        return (HatchLinkOrderStep) Enum.valueOf(HatchLinkOrderStep.class, str);
    }

    public static HatchLinkOrderStep[] values() {
        return (HatchLinkOrderStep[]) $VALUES.clone();
    }

    public HatchLinkOrderStep(String str, int i) {
    }
}
