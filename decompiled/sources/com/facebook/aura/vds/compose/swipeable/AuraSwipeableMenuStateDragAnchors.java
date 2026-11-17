package com.facebook.aura.vds.compose.swipeable;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuraSwipeableMenuStateDragAnchors {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraSwipeableMenuStateDragAnchors[] $VALUES;
    public static final AuraSwipeableMenuStateDragAnchors END_DISMISS;
    public static final AuraSwipeableMenuStateDragAnchors IDLE;
    public static final AuraSwipeableMenuStateDragAnchors PEEK_END;
    public static final AuraSwipeableMenuStateDragAnchors START_ACTION;

    static {
        AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors = new AuraSwipeableMenuStateDragAnchors("IDLE", 0);
        IDLE = auraSwipeableMenuStateDragAnchors;
        AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors2 = new AuraSwipeableMenuStateDragAnchors("END_DISMISS", 1);
        END_DISMISS = auraSwipeableMenuStateDragAnchors2;
        AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors3 = new AuraSwipeableMenuStateDragAnchors("START_ACTION", 2);
        START_ACTION = auraSwipeableMenuStateDragAnchors3;
        AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors4 = new AuraSwipeableMenuStateDragAnchors("PEEK_END", 3);
        PEEK_END = auraSwipeableMenuStateDragAnchors4;
        AuraSwipeableMenuStateDragAnchors[] auraSwipeableMenuStateDragAnchorsArr = {auraSwipeableMenuStateDragAnchors, auraSwipeableMenuStateDragAnchors2, auraSwipeableMenuStateDragAnchors3, auraSwipeableMenuStateDragAnchors4};
        $VALUES = auraSwipeableMenuStateDragAnchorsArr;
        $ENTRIES = C3cG.A0w(auraSwipeableMenuStateDragAnchorsArr);
    }

    public static Ey9<AuraSwipeableMenuStateDragAnchors> getEntries() {
        return $ENTRIES;
    }

    public static AuraSwipeableMenuStateDragAnchors valueOf(String str) {
        return (AuraSwipeableMenuStateDragAnchors) Enum.valueOf(AuraSwipeableMenuStateDragAnchors.class, str);
    }

    public static AuraSwipeableMenuStateDragAnchors[] values() {
        return (AuraSwipeableMenuStateDragAnchors[]) $VALUES.clone();
    }

    public AuraSwipeableMenuStateDragAnchors(String str, int i) {
    }
}
