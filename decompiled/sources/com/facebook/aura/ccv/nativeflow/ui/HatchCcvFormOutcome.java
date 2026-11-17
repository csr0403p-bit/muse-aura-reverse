package com.facebook.aura.ccv.nativeflow.ui;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.feed.repo.FeedInstructionsCardStoreKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCcvFormOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCcvFormOutcome[] $VALUES;
    public static final HatchCcvFormOutcome CHECKOUT_UNAVAILABLE;
    public static final HatchCcvFormOutcome DISMISSED;
    public static final HatchCcvFormOutcome VERIFIED;
    public final String eventType;
    public final String result;

    static {
        HatchCcvFormOutcome hatchCcvFormOutcome = new HatchCcvFormOutcome("VERIFIED", 0, "verified", "success");
        VERIFIED = hatchCcvFormOutcome;
        HatchCcvFormOutcome hatchCcvFormOutcome2 = new HatchCcvFormOutcome("DISMISSED", 1, FeedInstructionsCardStoreKt.KEY_DISMISSED, "warning");
        DISMISSED = hatchCcvFormOutcome2;
        HatchCcvFormOutcome hatchCcvFormOutcome3 = new HatchCcvFormOutcome("CHECKOUT_UNAVAILABLE", 2, "checkout_unavailable", "error");
        CHECKOUT_UNAVAILABLE = hatchCcvFormOutcome3;
        HatchCcvFormOutcome[] hatchCcvFormOutcomeArr = {hatchCcvFormOutcome, hatchCcvFormOutcome2, hatchCcvFormOutcome3};
        $VALUES = hatchCcvFormOutcomeArr;
        $ENTRIES = C3cG.A0w(hatchCcvFormOutcomeArr);
    }

    public static Ey9<HatchCcvFormOutcome> getEntries() {
        return $ENTRIES;
    }

    public static HatchCcvFormOutcome valueOf(String str) {
        return (HatchCcvFormOutcome) Enum.valueOf(HatchCcvFormOutcome.class, str);
    }

    public static HatchCcvFormOutcome[] values() {
        return (HatchCcvFormOutcome[]) $VALUES.clone();
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getResult() {
        return this.result;
    }

    public HatchCcvFormOutcome(String str, int i, String str2, String str3) {
        this.result = str2;
        this.eventType = str3;
    }
}
