package com.facebook.aura.nudge;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.pairs.ConnectionsActivityKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NudgeOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NudgeOutcome[] $VALUES;
    public static final NudgeOutcome COMPLETED;
    public static final NudgeOutcome DECLINED;
    public static final NudgeOutcome FAILED;
    public static final NudgeOutcome UNKNOWN;
    public final String wireValue;

    static {
        NudgeOutcome nudgeOutcome = new NudgeOutcome("COMPLETED", 0, "completed");
        COMPLETED = nudgeOutcome;
        NudgeOutcome nudgeOutcome2 = new NudgeOutcome("DECLINED", 1, ConnectionsActivityKt.FILE_STATE_DECLINED);
        DECLINED = nudgeOutcome2;
        NudgeOutcome nudgeOutcome3 = new NudgeOutcome(CvmMigrationStatusJson.STAGE_FAILED, 2, "failed");
        FAILED = nudgeOutcome3;
        NudgeOutcome nudgeOutcome4 = new NudgeOutcome("UNKNOWN", 3, "unknown");
        UNKNOWN = nudgeOutcome4;
        NudgeOutcome[] nudgeOutcomeArr = {nudgeOutcome, nudgeOutcome2, nudgeOutcome3, nudgeOutcome4};
        $VALUES = nudgeOutcomeArr;
        $ENTRIES = C3cG.A0w(nudgeOutcomeArr);
    }

    public static Ey9<NudgeOutcome> getEntries() {
        return $ENTRIES;
    }

    public static NudgeOutcome valueOf(String str) {
        return (NudgeOutcome) Enum.valueOf(NudgeOutcome.class, str);
    }

    public static NudgeOutcome[] values() {
        return (NudgeOutcome[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NudgeOutcome(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
