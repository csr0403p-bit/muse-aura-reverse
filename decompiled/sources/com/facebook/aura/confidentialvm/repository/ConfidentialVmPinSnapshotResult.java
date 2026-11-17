package com.facebook.aura.confidentialvm.repository;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConfidentialVmPinSnapshotResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmPinSnapshotResult[] $VALUES;
    public static final ConfidentialVmPinSnapshotResult APPLIED;
    public static final ConfidentialVmPinSnapshotResult AUTHENTICATION_FAILED;
    public static final ConfidentialVmPinSnapshotResult IDEMPOTENT;
    public static final ConfidentialVmPinSnapshotResult IGNORED_LOWER_REVISION;
    public static final ConfidentialVmPinSnapshotResult MALFORMED;
    public static final ConfidentialVmPinSnapshotResult MISSING_SECRET;
    public static final ConfidentialVmPinSnapshotResult STORAGE_FAILURE;

    static {
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult = new ConfidentialVmPinSnapshotResult("APPLIED", 0);
        APPLIED = confidentialVmPinSnapshotResult;
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult2 = new ConfidentialVmPinSnapshotResult("IGNORED_LOWER_REVISION", 1);
        IGNORED_LOWER_REVISION = confidentialVmPinSnapshotResult2;
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult3 = new ConfidentialVmPinSnapshotResult("IDEMPOTENT", 2);
        IDEMPOTENT = confidentialVmPinSnapshotResult3;
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult4 = new ConfidentialVmPinSnapshotResult("MALFORMED", 3);
        MALFORMED = confidentialVmPinSnapshotResult4;
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult5 = new ConfidentialVmPinSnapshotResult("AUTHENTICATION_FAILED", 4);
        AUTHENTICATION_FAILED = confidentialVmPinSnapshotResult5;
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult6 = new ConfidentialVmPinSnapshotResult("MISSING_SECRET", 5);
        MISSING_SECRET = confidentialVmPinSnapshotResult6;
        ConfidentialVmPinSnapshotResult confidentialVmPinSnapshotResult7 = new ConfidentialVmPinSnapshotResult("STORAGE_FAILURE", 6);
        STORAGE_FAILURE = confidentialVmPinSnapshotResult7;
        ConfidentialVmPinSnapshotResult[] confidentialVmPinSnapshotResultArr = {confidentialVmPinSnapshotResult, confidentialVmPinSnapshotResult2, confidentialVmPinSnapshotResult3, confidentialVmPinSnapshotResult4, confidentialVmPinSnapshotResult5, confidentialVmPinSnapshotResult6, confidentialVmPinSnapshotResult7};
        $VALUES = confidentialVmPinSnapshotResultArr;
        $ENTRIES = C3cG.A0w(confidentialVmPinSnapshotResultArr);
    }

    public static Ey9<ConfidentialVmPinSnapshotResult> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmPinSnapshotResult valueOf(String str) {
        return (ConfidentialVmPinSnapshotResult) Enum.valueOf(ConfidentialVmPinSnapshotResult.class, str);
    }

    public static ConfidentialVmPinSnapshotResult[] values() {
        return (ConfidentialVmPinSnapshotResult[]) $VALUES.clone();
    }

    public ConfidentialVmPinSnapshotResult(String str, int i) {
    }
}
