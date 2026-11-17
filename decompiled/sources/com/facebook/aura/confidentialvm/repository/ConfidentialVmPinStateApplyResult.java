package com.facebook.aura.confidentialvm.repository;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmPinStateApplyResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmPinStateApplyResult[] $VALUES;
    public static final ConfidentialVmPinStateApplyResult APPLIED;
    public static final ConfidentialVmPinStateApplyResult IDEMPOTENT;
    public static final ConfidentialVmPinStateApplyResult IGNORED_LOWER_REVISION;
    public static final ConfidentialVmPinStateApplyResult STORAGE_FAILURE;

    static {
        ConfidentialVmPinStateApplyResult confidentialVmPinStateApplyResult = new ConfidentialVmPinStateApplyResult("APPLIED", 0);
        APPLIED = confidentialVmPinStateApplyResult;
        ConfidentialVmPinStateApplyResult confidentialVmPinStateApplyResult2 = new ConfidentialVmPinStateApplyResult("IGNORED_LOWER_REVISION", 1);
        IGNORED_LOWER_REVISION = confidentialVmPinStateApplyResult2;
        ConfidentialVmPinStateApplyResult confidentialVmPinStateApplyResult3 = new ConfidentialVmPinStateApplyResult("IDEMPOTENT", 2);
        IDEMPOTENT = confidentialVmPinStateApplyResult3;
        ConfidentialVmPinStateApplyResult confidentialVmPinStateApplyResult4 = new ConfidentialVmPinStateApplyResult("STORAGE_FAILURE", 3);
        STORAGE_FAILURE = confidentialVmPinStateApplyResult4;
        ConfidentialVmPinStateApplyResult[] confidentialVmPinStateApplyResultArr = {confidentialVmPinStateApplyResult, confidentialVmPinStateApplyResult2, confidentialVmPinStateApplyResult3, confidentialVmPinStateApplyResult4};
        $VALUES = confidentialVmPinStateApplyResultArr;
        $ENTRIES = new F3w(confidentialVmPinStateApplyResultArr);
    }

    public static Ey9<ConfidentialVmPinStateApplyResult> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmPinStateApplyResult valueOf(String str) {
        return (ConfidentialVmPinStateApplyResult) Enum.valueOf(ConfidentialVmPinStateApplyResult.class, str);
    }

    public static ConfidentialVmPinStateApplyResult[] values() {
        return (ConfidentialVmPinStateApplyResult[]) $VALUES.clone();
    }

    public ConfidentialVmPinStateApplyResult(String str, int i) {
    }
}
