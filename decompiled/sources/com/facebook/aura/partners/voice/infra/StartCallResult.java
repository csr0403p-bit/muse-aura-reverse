package com.facebook.aura.partners.voice.infra;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class StartCallResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StartCallResult[] $VALUES;
    public static final StartCallResult FAILED;
    public static final StartCallResult OK;
    public static final StartCallResult OUT_OF_CREDITS;

    static {
        StartCallResult startCallResult = new StartCallResult("OK", 0);
        OK = startCallResult;
        StartCallResult startCallResult2 = new StartCallResult("OUT_OF_CREDITS", 1);
        OUT_OF_CREDITS = startCallResult2;
        StartCallResult startCallResult3 = new StartCallResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = startCallResult3;
        StartCallResult[] startCallResultArr = {startCallResult, startCallResult2, startCallResult3};
        $VALUES = startCallResultArr;
        $ENTRIES = C3cG.A0w(startCallResultArr);
    }

    public static Ey9<StartCallResult> getEntries() {
        return $ENTRIES;
    }

    public static StartCallResult valueOf(String str) {
        return (StartCallResult) Enum.valueOf(StartCallResult.class, str);
    }

    public static StartCallResult[] values() {
        return (StartCallResult[]) $VALUES.clone();
    }

    public StartCallResult(String str, int i) {
    }
}
