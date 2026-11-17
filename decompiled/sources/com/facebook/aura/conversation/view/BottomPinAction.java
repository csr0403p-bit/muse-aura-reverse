package com.facebook.aura.conversation.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BottomPinAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BottomPinAction[] $VALUES;
    public static final BottomPinAction FOLLOW_BOTTOM;
    public static final BottomPinAction IDLE;
    public static final BottomPinAction PIN_TOP;

    static {
        BottomPinAction bottomPinAction = new BottomPinAction("IDLE", 0);
        IDLE = bottomPinAction;
        BottomPinAction bottomPinAction2 = new BottomPinAction("PIN_TOP", 1);
        PIN_TOP = bottomPinAction2;
        BottomPinAction bottomPinAction3 = new BottomPinAction("FOLLOW_BOTTOM", 2);
        FOLLOW_BOTTOM = bottomPinAction3;
        BottomPinAction[] bottomPinActionArr = {bottomPinAction, bottomPinAction2, bottomPinAction3};
        $VALUES = bottomPinActionArr;
        $ENTRIES = new F3w(bottomPinActionArr);
    }

    public static Ey9<BottomPinAction> getEntries() {
        return $ENTRIES;
    }

    public static BottomPinAction valueOf(String str) {
        return (BottomPinAction) Enum.valueOf(BottomPinAction.class, str);
    }

    public static BottomPinAction[] values() {
        return (BottomPinAction[]) $VALUES.clone();
    }

    public BottomPinAction(String str, int i) {
    }
}
