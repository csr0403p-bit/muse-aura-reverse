package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchMessageShareAttemptResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMessageShareAttemptResult[] $VALUES;
    public static final HatchMessageShareAttemptResult ALLOWED;
    public static final HatchMessageShareAttemptResult ALLOWED_WITH_FRICTION;
    public static final HatchMessageShareAttemptResult BLOCKED;
    public static final HatchMessageShareAttemptResult UNAVAILABLE;

    static {
        HatchMessageShareAttemptResult hatchMessageShareAttemptResult = new HatchMessageShareAttemptResult("ALLOWED", 0);
        ALLOWED = hatchMessageShareAttemptResult;
        HatchMessageShareAttemptResult hatchMessageShareAttemptResult2 = new HatchMessageShareAttemptResult("ALLOWED_WITH_FRICTION", 1);
        ALLOWED_WITH_FRICTION = hatchMessageShareAttemptResult2;
        HatchMessageShareAttemptResult hatchMessageShareAttemptResult3 = new HatchMessageShareAttemptResult("BLOCKED", 2);
        BLOCKED = hatchMessageShareAttemptResult3;
        HatchMessageShareAttemptResult hatchMessageShareAttemptResult4 = new HatchMessageShareAttemptResult("UNAVAILABLE", 3);
        UNAVAILABLE = hatchMessageShareAttemptResult4;
        HatchMessageShareAttemptResult[] hatchMessageShareAttemptResultArr = {hatchMessageShareAttemptResult, hatchMessageShareAttemptResult2, hatchMessageShareAttemptResult3, hatchMessageShareAttemptResult4};
        $VALUES = hatchMessageShareAttemptResultArr;
        $ENTRIES = new F3w(hatchMessageShareAttemptResultArr);
    }

    public static Ey9<HatchMessageShareAttemptResult> getEntries() {
        return $ENTRIES;
    }

    public static HatchMessageShareAttemptResult valueOf(String str) {
        return (HatchMessageShareAttemptResult) Enum.valueOf(HatchMessageShareAttemptResult.class, str);
    }

    public static HatchMessageShareAttemptResult[] values() {
        return (HatchMessageShareAttemptResult[]) $VALUES.clone();
    }

    public HatchMessageShareAttemptResult(String str, int i) {
    }
}
