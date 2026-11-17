package com.facebook.aura.ccv.nativeflow.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCcvLinkingError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCcvLinkingError[] $VALUES;
    public static final HatchCcvLinkingError ACCOUNT_NOT_ELIGIBLE;
    public static final HatchCcvLinkingError GENERIC;

    static {
        HatchCcvLinkingError hatchCcvLinkingError = new HatchCcvLinkingError("ACCOUNT_NOT_ELIGIBLE", 0);
        ACCOUNT_NOT_ELIGIBLE = hatchCcvLinkingError;
        HatchCcvLinkingError hatchCcvLinkingError2 = new HatchCcvLinkingError("GENERIC", 1);
        GENERIC = hatchCcvLinkingError2;
        HatchCcvLinkingError[] hatchCcvLinkingErrorArr = {hatchCcvLinkingError, hatchCcvLinkingError2};
        $VALUES = hatchCcvLinkingErrorArr;
        $ENTRIES = C3cG.A0w(hatchCcvLinkingErrorArr);
    }

    public static Ey9<HatchCcvLinkingError> getEntries() {
        return $ENTRIES;
    }

    public static HatchCcvLinkingError valueOf(String str) {
        return (HatchCcvLinkingError) Enum.valueOf(HatchCcvLinkingError.class, str);
    }

    public static HatchCcvLinkingError[] values() {
        return (HatchCcvLinkingError[]) $VALUES.clone();
    }

    public HatchCcvLinkingError(String str, int i) {
    }
}
