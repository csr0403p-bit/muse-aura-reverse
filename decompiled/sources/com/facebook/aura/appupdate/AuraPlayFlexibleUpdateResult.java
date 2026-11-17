package com.facebook.aura.appupdate;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuraPlayFlexibleUpdateResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraPlayFlexibleUpdateResult[] $VALUES;
    public static final AuraPlayFlexibleUpdateResult ACCEPTED;
    public static final AuraPlayFlexibleUpdateResult DECLINED;
    public static final AuraPlayFlexibleUpdateResult FAILED;
    public static final AuraPlayFlexibleUpdateResult NOT_OFFERED;

    static {
        AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult = new AuraPlayFlexibleUpdateResult("ACCEPTED", 0);
        ACCEPTED = auraPlayFlexibleUpdateResult;
        AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult2 = new AuraPlayFlexibleUpdateResult("DECLINED", 1);
        DECLINED = auraPlayFlexibleUpdateResult2;
        AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult3 = new AuraPlayFlexibleUpdateResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = auraPlayFlexibleUpdateResult3;
        AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult4 = new AuraPlayFlexibleUpdateResult("NOT_OFFERED", 3);
        NOT_OFFERED = auraPlayFlexibleUpdateResult4;
        AuraPlayFlexibleUpdateResult[] auraPlayFlexibleUpdateResultArr = {auraPlayFlexibleUpdateResult, auraPlayFlexibleUpdateResult2, auraPlayFlexibleUpdateResult3, auraPlayFlexibleUpdateResult4};
        $VALUES = auraPlayFlexibleUpdateResultArr;
        $ENTRIES = C3cG.A0w(auraPlayFlexibleUpdateResultArr);
    }

    public static Ey9<AuraPlayFlexibleUpdateResult> getEntries() {
        return $ENTRIES;
    }

    public static AuraPlayFlexibleUpdateResult valueOf(String str) {
        return (AuraPlayFlexibleUpdateResult) Enum.valueOf(AuraPlayFlexibleUpdateResult.class, str);
    }

    public static AuraPlayFlexibleUpdateResult[] values() {
        return (AuraPlayFlexibleUpdateResult[]) $VALUES.clone();
    }

    public AuraPlayFlexibleUpdateResult(String str, int i) {
    }
}
