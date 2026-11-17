package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CallVoicePreviewResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CallVoicePreviewResult[] $VALUES;
    public static final CallVoicePreviewResult FAILED;
    public static final CallVoicePreviewResult INTERRUPTED;
    public static final CallVoicePreviewResult SPOKEN;

    static {
        CallVoicePreviewResult callVoicePreviewResult = new CallVoicePreviewResult("SPOKEN", 0);
        SPOKEN = callVoicePreviewResult;
        CallVoicePreviewResult callVoicePreviewResult2 = new CallVoicePreviewResult("INTERRUPTED", 1);
        INTERRUPTED = callVoicePreviewResult2;
        CallVoicePreviewResult callVoicePreviewResult3 = new CallVoicePreviewResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = callVoicePreviewResult3;
        CallVoicePreviewResult[] callVoicePreviewResultArr = {callVoicePreviewResult, callVoicePreviewResult2, callVoicePreviewResult3};
        $VALUES = callVoicePreviewResultArr;
        $ENTRIES = C3cG.A0w(callVoicePreviewResultArr);
    }

    public static Ey9<CallVoicePreviewResult> getEntries() {
        return $ENTRIES;
    }

    public static CallVoicePreviewResult valueOf(String str) {
        return (CallVoicePreviewResult) Enum.valueOf(CallVoicePreviewResult.class, str);
    }

    public static CallVoicePreviewResult[] values() {
        return (CallVoicePreviewResult[]) $VALUES.clone();
    }

    public CallVoicePreviewResult(String str, int i) {
    }
}
