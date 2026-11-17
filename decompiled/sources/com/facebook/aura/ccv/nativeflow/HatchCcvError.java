package com.facebook.aura.ccv.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCcvError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCcvError[] $VALUES;
    public static final HatchCcvError CARD_SAVE;
    public static final HatchCcvError CHECKOUT_INIT;
    public static final HatchCcvError ENCRYPTION_KEY;
    public static final HatchCcvError FINALIZE;
    public static final HatchCcvError PTT_GENERATION;
    public static final HatchCcvError THREE_DS_STEP_UP;

    static {
        HatchCcvError hatchCcvError = new HatchCcvError("CHECKOUT_INIT", 0);
        CHECKOUT_INIT = hatchCcvError;
        HatchCcvError hatchCcvError2 = new HatchCcvError("ENCRYPTION_KEY", 1);
        ENCRYPTION_KEY = hatchCcvError2;
        HatchCcvError hatchCcvError3 = new HatchCcvError("PTT_GENERATION", 2);
        PTT_GENERATION = hatchCcvError3;
        HatchCcvError hatchCcvError4 = new HatchCcvError("CARD_SAVE", 3);
        CARD_SAVE = hatchCcvError4;
        HatchCcvError hatchCcvError5 = new HatchCcvError("FINALIZE", 4);
        FINALIZE = hatchCcvError5;
        HatchCcvError hatchCcvError6 = new HatchCcvError("THREE_DS_STEP_UP", 5);
        THREE_DS_STEP_UP = hatchCcvError6;
        HatchCcvError[] hatchCcvErrorArr = {hatchCcvError, hatchCcvError2, hatchCcvError3, hatchCcvError4, hatchCcvError5, hatchCcvError6};
        $VALUES = hatchCcvErrorArr;
        $ENTRIES = C3cG.A0w(hatchCcvErrorArr);
    }

    public static Ey9<HatchCcvError> getEntries() {
        return $ENTRIES;
    }

    public static HatchCcvError valueOf(String str) {
        return (HatchCcvError) Enum.valueOf(HatchCcvError.class, str);
    }

    public static HatchCcvError[] values() {
        return (HatchCcvError[]) $VALUES.clone();
    }

    public HatchCcvError(String str, int i) {
    }
}
