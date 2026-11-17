package com.facebook.aura.nudge;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NudgeSkipReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NudgeSkipReason[] $VALUES;
    public static final NudgeSkipReason DAILY_CAP;
    public final String wireValue;

    static {
        NudgeSkipReason nudgeSkipReason = new NudgeSkipReason("DAILY_CAP", 0, "daily_cap");
        DAILY_CAP = nudgeSkipReason;
        NudgeSkipReason[] nudgeSkipReasonArr = {nudgeSkipReason};
        $VALUES = nudgeSkipReasonArr;
        $ENTRIES = C3cG.A0w(nudgeSkipReasonArr);
    }

    public static Ey9<NudgeSkipReason> getEntries() {
        return $ENTRIES;
    }

    public static NudgeSkipReason valueOf(String str) {
        return (NudgeSkipReason) Enum.valueOf(NudgeSkipReason.class, str);
    }

    public static NudgeSkipReason[] values() {
        return (NudgeSkipReason[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NudgeSkipReason(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
