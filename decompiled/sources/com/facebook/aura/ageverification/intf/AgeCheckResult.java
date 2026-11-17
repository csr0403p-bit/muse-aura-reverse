package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AgeCheckResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckResult[] $VALUES;
    public static final AgeCheckResult BLOCKED;
    public static final AgeCheckResult CANCELLED;
    public static final AgeCheckResult ERROR;
    public static final AgeCheckResult FAILED_FINAL;
    public static final AgeCheckResult FAILED_RETRYABLE;
    public static final AgeCheckResult NOT_OFFERED;
    public static final AgeCheckResult VERIFIED;
    public final String eventType;

    static {
        AgeCheckResult ageCheckResult = new AgeCheckResult("VERIFIED", 0, "success");
        VERIFIED = ageCheckResult;
        AgeCheckResult ageCheckResult2 = new AgeCheckResult("FAILED_RETRYABLE", 1, "warning");
        FAILED_RETRYABLE = ageCheckResult2;
        AgeCheckResult ageCheckResult3 = new AgeCheckResult("FAILED_FINAL", 2, "warning");
        FAILED_FINAL = ageCheckResult3;
        AgeCheckResult ageCheckResult4 = new AgeCheckResult("BLOCKED", 3, "error");
        BLOCKED = ageCheckResult4;
        AgeCheckResult ageCheckResult5 = new AgeCheckResult("CANCELLED", 4, "warning");
        CANCELLED = ageCheckResult5;
        AgeCheckResult ageCheckResult6 = new AgeCheckResult("ERROR", 5, "error");
        ERROR = ageCheckResult6;
        AgeCheckResult ageCheckResult7 = new AgeCheckResult("NOT_OFFERED", 6, "warning");
        NOT_OFFERED = ageCheckResult7;
        AgeCheckResult[] ageCheckResultArr = {ageCheckResult, ageCheckResult2, ageCheckResult3, ageCheckResult4, ageCheckResult5, ageCheckResult6, ageCheckResult7};
        $VALUES = ageCheckResultArr;
        $ENTRIES = C3cG.A0w(ageCheckResultArr);
    }

    public static Ey9<AgeCheckResult> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckResult valueOf(String str) {
        return (AgeCheckResult) Enum.valueOf(AgeCheckResult.class, str);
    }

    public static AgeCheckResult[] values() {
        return (AgeCheckResult[]) $VALUES.clone();
    }

    public final String getEventType$fbandroid_express_aura_java_com_facebook_aura_ageverification_intf_intf() {
        return this.eventType;
    }

    public AgeCheckResult(String str, int i, String str2) {
        this.eventType = str2;
    }
}
