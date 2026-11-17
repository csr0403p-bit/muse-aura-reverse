package com.facebook.aura.settings.support;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchSupportTopic {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSupportTopic[] $VALUES;
    public static final HatchSupportTopic ACCOUNT_ACCESS;
    public static final HatchSupportTopic SAFETY_INTEGRITY_LEGAL;
    public static final HatchSupportTopic TECHNICAL_PROBLEM;
    public final String wireValue;

    static {
        HatchSupportTopic hatchSupportTopic = new HatchSupportTopic("ACCOUNT_ACCESS", 0, "account_access");
        ACCOUNT_ACCESS = hatchSupportTopic;
        HatchSupportTopic hatchSupportTopic2 = new HatchSupportTopic("TECHNICAL_PROBLEM", 1, "technical_problem");
        TECHNICAL_PROBLEM = hatchSupportTopic2;
        HatchSupportTopic hatchSupportTopic3 = new HatchSupportTopic("SAFETY_INTEGRITY_LEGAL", 2, "safety_integrity_legal");
        SAFETY_INTEGRITY_LEGAL = hatchSupportTopic3;
        HatchSupportTopic[] hatchSupportTopicArr = {hatchSupportTopic, hatchSupportTopic2, hatchSupportTopic3};
        $VALUES = hatchSupportTopicArr;
        $ENTRIES = new F3w(hatchSupportTopicArr);
    }

    public static Ey9<HatchSupportTopic> getEntries() {
        return $ENTRIES;
    }

    public static HatchSupportTopic valueOf(String str) {
        return (HatchSupportTopic) Enum.valueOf(HatchSupportTopic.class, str);
    }

    public static HatchSupportTopic[] values() {
        return (HatchSupportTopic[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchSupportTopic(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
