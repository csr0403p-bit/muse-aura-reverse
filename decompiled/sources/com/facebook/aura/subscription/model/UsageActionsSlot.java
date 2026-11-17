package com.facebook.aura.subscription.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UsageActionsSlot {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UsageActionsSlot[] $VALUES;
    public static final UsageActionsSlot RETRY;
    public static final UsageActionsSlot ROWS;
    public static final UsageActionsSlot SETTLING;

    static {
        UsageActionsSlot usageActionsSlot = new UsageActionsSlot("ROWS", 0);
        ROWS = usageActionsSlot;
        UsageActionsSlot usageActionsSlot2 = new UsageActionsSlot("SETTLING", 1);
        SETTLING = usageActionsSlot2;
        UsageActionsSlot usageActionsSlot3 = new UsageActionsSlot("RETRY", 2);
        RETRY = usageActionsSlot3;
        UsageActionsSlot[] usageActionsSlotArr = {usageActionsSlot, usageActionsSlot2, usageActionsSlot3};
        $VALUES = usageActionsSlotArr;
        $ENTRIES = new F3w(usageActionsSlotArr);
    }

    public static Ey9<UsageActionsSlot> getEntries() {
        return $ENTRIES;
    }

    public static UsageActionsSlot valueOf(String str) {
        return (UsageActionsSlot) Enum.valueOf(UsageActionsSlot.class, str);
    }

    public static UsageActionsSlot[] values() {
        return (UsageActionsSlot[]) $VALUES.clone();
    }

    public UsageActionsSlot(String str, int i) {
    }
}
