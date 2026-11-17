package com.facebook.aura.ccv.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchThreeDSChallengeResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchThreeDSChallengeResult[] $VALUES;
    public static final HatchThreeDSChallengeResult AUTHENTICATED;
    public static final HatchThreeDSChallengeResult AUTH_FAILED;
    public static final HatchThreeDSChallengeResult DISMISSED;
    public static final HatchThreeDSChallengeResult INVALID_URL;
    public static final HatchThreeDSChallengeResult NOT_PRESENTED;

    static {
        HatchThreeDSChallengeResult hatchThreeDSChallengeResult = new HatchThreeDSChallengeResult("AUTHENTICATED", 0);
        AUTHENTICATED = hatchThreeDSChallengeResult;
        HatchThreeDSChallengeResult hatchThreeDSChallengeResult2 = new HatchThreeDSChallengeResult("AUTH_FAILED", 1);
        AUTH_FAILED = hatchThreeDSChallengeResult2;
        HatchThreeDSChallengeResult hatchThreeDSChallengeResult3 = new HatchThreeDSChallengeResult("DISMISSED", 2);
        DISMISSED = hatchThreeDSChallengeResult3;
        HatchThreeDSChallengeResult hatchThreeDSChallengeResult4 = new HatchThreeDSChallengeResult("INVALID_URL", 3);
        INVALID_URL = hatchThreeDSChallengeResult4;
        HatchThreeDSChallengeResult hatchThreeDSChallengeResult5 = new HatchThreeDSChallengeResult("NOT_PRESENTED", 4);
        NOT_PRESENTED = hatchThreeDSChallengeResult5;
        HatchThreeDSChallengeResult[] hatchThreeDSChallengeResultArr = {hatchThreeDSChallengeResult, hatchThreeDSChallengeResult2, hatchThreeDSChallengeResult3, hatchThreeDSChallengeResult4, hatchThreeDSChallengeResult5};
        $VALUES = hatchThreeDSChallengeResultArr;
        $ENTRIES = C3cG.A0w(hatchThreeDSChallengeResultArr);
    }

    public static Ey9<HatchThreeDSChallengeResult> getEntries() {
        return $ENTRIES;
    }

    public static HatchThreeDSChallengeResult valueOf(String str) {
        return (HatchThreeDSChallengeResult) Enum.valueOf(HatchThreeDSChallengeResult.class, str);
    }

    public static HatchThreeDSChallengeResult[] values() {
        return (HatchThreeDSChallengeResult[]) $VALUES.clone();
    }

    public HatchThreeDSChallengeResult(String str, int i) {
    }
}
