package com.facebook.aura.partners.voice.infra;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GreetingDelayWriteResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GreetingDelayWriteResult[] $VALUES;
    public static final GreetingDelayWriteResult FAILED;
    public static final GreetingDelayWriteResult NOOP_VERIFIED;
    public static final GreetingDelayWriteResult WRITTEN;

    static {
        GreetingDelayWriteResult greetingDelayWriteResult = new GreetingDelayWriteResult("NOOP_VERIFIED", 0);
        NOOP_VERIFIED = greetingDelayWriteResult;
        GreetingDelayWriteResult greetingDelayWriteResult2 = new GreetingDelayWriteResult("WRITTEN", 1);
        WRITTEN = greetingDelayWriteResult2;
        GreetingDelayWriteResult greetingDelayWriteResult3 = new GreetingDelayWriteResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = greetingDelayWriteResult3;
        GreetingDelayWriteResult[] greetingDelayWriteResultArr = {greetingDelayWriteResult, greetingDelayWriteResult2, greetingDelayWriteResult3};
        $VALUES = greetingDelayWriteResultArr;
        $ENTRIES = C3cG.A0w(greetingDelayWriteResultArr);
    }

    public static Ey9<GreetingDelayWriteResult> getEntries() {
        return $ENTRIES;
    }

    public static GreetingDelayWriteResult valueOf(String str) {
        return (GreetingDelayWriteResult) Enum.valueOf(GreetingDelayWriteResult.class, str);
    }

    public static GreetingDelayWriteResult[] values() {
        return (GreetingDelayWriteResult[]) $VALUES.clone();
    }

    public GreetingDelayWriteResult(String str, int i) {
    }
}
