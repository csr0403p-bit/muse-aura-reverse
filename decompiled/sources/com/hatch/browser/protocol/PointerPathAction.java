package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PointerPathAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PointerPathAction[] $VALUES;
    public static final PointerPathAction CLICK;
    public static final Companion Companion;
    public static final PointerPathAction DRAG;
    public static final PointerPathAction HOVER;
    public static final PointerPathAction MOVE;
    public static final PointerPathAction PRESS;
    public static final PointerPathAction RELEASE;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        PointerPathAction pointerPathAction = new PointerPathAction("CLICK", 0);
        CLICK = pointerPathAction;
        PointerPathAction pointerPathAction2 = new PointerPathAction("HOVER", 1);
        HOVER = pointerPathAction2;
        PointerPathAction pointerPathAction3 = new PointerPathAction("DRAG", 2);
        DRAG = pointerPathAction3;
        PointerPathAction pointerPathAction4 = new PointerPathAction("PRESS", 3);
        PRESS = pointerPathAction4;
        PointerPathAction pointerPathAction5 = new PointerPathAction("MOVE", 4);
        MOVE = pointerPathAction5;
        PointerPathAction pointerPathAction6 = new PointerPathAction("RELEASE", 5);
        RELEASE = pointerPathAction6;
        PointerPathAction[] pointerPathActionArr = {pointerPathAction, pointerPathAction2, pointerPathAction3, pointerPathAction4, pointerPathAction5, pointerPathAction6};
        $VALUES = pointerPathActionArr;
        $ENTRIES = C3cG.A0w(pointerPathActionArr);
        Companion = new Companion();
    }

    public static Ey9<PointerPathAction> getEntries() {
        return $ENTRIES;
    }

    public static PointerPathAction valueOf(String str) {
        return (PointerPathAction) Enum.valueOf(PointerPathAction.class, str);
    }

    public static PointerPathAction[] values() {
        return (PointerPathAction[]) $VALUES.clone();
    }

    public PointerPathAction(String str, int i) {
    }
}
