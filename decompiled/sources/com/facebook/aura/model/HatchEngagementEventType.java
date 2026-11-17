package com.facebook.aura.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchEngagementEventType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchEngagementEventType[] $VALUES;
    public static final HatchEngagementEventType CLICK;
    public static final HatchEngagementEventType ENGAGEMENT;
    public static final HatchEngagementEventType FEEDBACK_DOWN;
    public static final HatchEngagementEventType FEEDBACK_UP;
    public static final HatchEngagementEventType IMPRESSION;
    public final String wireValue;

    static {
        HatchEngagementEventType hatchEngagementEventType = new HatchEngagementEventType("IMPRESSION", 0, "impression");
        IMPRESSION = hatchEngagementEventType;
        HatchEngagementEventType hatchEngagementEventType2 = new HatchEngagementEventType("CLICK", 1, "click");
        CLICK = hatchEngagementEventType2;
        HatchEngagementEventType hatchEngagementEventType3 = new HatchEngagementEventType("ENGAGEMENT", 2, "engagement");
        ENGAGEMENT = hatchEngagementEventType3;
        HatchEngagementEventType hatchEngagementEventType4 = new HatchEngagementEventType("FEEDBACK_UP", 3, "feedback_up");
        FEEDBACK_UP = hatchEngagementEventType4;
        HatchEngagementEventType hatchEngagementEventType5 = new HatchEngagementEventType("FEEDBACK_DOWN", 4, "feedback_down");
        FEEDBACK_DOWN = hatchEngagementEventType5;
        HatchEngagementEventType[] hatchEngagementEventTypeArr = {hatchEngagementEventType, hatchEngagementEventType2, hatchEngagementEventType3, hatchEngagementEventType4, hatchEngagementEventType5};
        $VALUES = hatchEngagementEventTypeArr;
        $ENTRIES = new F3w(hatchEngagementEventTypeArr);
    }

    public static Ey9<HatchEngagementEventType> getEntries() {
        return $ENTRIES;
    }

    public static HatchEngagementEventType valueOf(String str) {
        return (HatchEngagementEventType) Enum.valueOf(HatchEngagementEventType.class, str);
    }

    public static HatchEngagementEventType[] values() {
        return (HatchEngagementEventType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchEngagementEventType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
