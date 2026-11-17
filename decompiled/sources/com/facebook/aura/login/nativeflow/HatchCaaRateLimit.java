package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRateLimit {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRateLimit[] $VALUES;
    public static final HatchCaaRateLimit ATTEMPT_BLOCK;
    public static final HatchCaaRateLimit PLATFORM_BUDGET;

    static {
        HatchCaaRateLimit hatchCaaRateLimit = new HatchCaaRateLimit("PLATFORM_BUDGET", 0);
        PLATFORM_BUDGET = hatchCaaRateLimit;
        HatchCaaRateLimit hatchCaaRateLimit2 = new HatchCaaRateLimit("ATTEMPT_BLOCK", 1);
        ATTEMPT_BLOCK = hatchCaaRateLimit2;
        HatchCaaRateLimit[] hatchCaaRateLimitArr = {hatchCaaRateLimit, hatchCaaRateLimit2};
        $VALUES = hatchCaaRateLimitArr;
        $ENTRIES = C3cG.A0w(hatchCaaRateLimitArr);
    }

    public static Ey9<HatchCaaRateLimit> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRateLimit valueOf(String str) {
        return (HatchCaaRateLimit) Enum.valueOf(HatchCaaRateLimit.class, str);
    }

    public static HatchCaaRateLimit[] values() {
        return (HatchCaaRateLimit[]) $VALUES.clone();
    }

    public HatchCaaRateLimit(String str, int i) {
    }
}
