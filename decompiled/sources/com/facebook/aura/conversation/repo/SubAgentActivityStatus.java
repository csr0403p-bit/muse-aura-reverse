package com.facebook.aura.conversation.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SubAgentActivityStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubAgentActivityStatus[] $VALUES;
    public static final SubAgentActivityStatus ACTIVE;
    public static final SubAgentActivityStatus COMPLETED;

    static {
        SubAgentActivityStatus subAgentActivityStatus = new SubAgentActivityStatus("ACTIVE", 0);
        ACTIVE = subAgentActivityStatus;
        SubAgentActivityStatus subAgentActivityStatus2 = new SubAgentActivityStatus("COMPLETED", 1);
        COMPLETED = subAgentActivityStatus2;
        SubAgentActivityStatus[] subAgentActivityStatusArr = {subAgentActivityStatus, subAgentActivityStatus2};
        $VALUES = subAgentActivityStatusArr;
        $ENTRIES = C3cG.A0w(subAgentActivityStatusArr);
    }

    public static Ey9<SubAgentActivityStatus> getEntries() {
        return $ENTRIES;
    }

    public static SubAgentActivityStatus valueOf(String str) {
        return (SubAgentActivityStatus) Enum.valueOf(SubAgentActivityStatus.class, str);
    }

    public static SubAgentActivityStatus[] values() {
        return (SubAgentActivityStatus[]) $VALUES.clone();
    }

    public SubAgentActivityStatus(String str, int i) {
    }
}
