package com.facebook.aura.navigation;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DragDismissPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DragDismissPhase[] $VALUES;
    public static final DragDismissPhase CANCELLING;
    public static final DragDismissPhase COMPLETING;
    public static final DragDismissPhase DRAGGING;
    public static final DragDismissPhase IDLE;

    static {
        DragDismissPhase dragDismissPhase = new DragDismissPhase("IDLE", 0);
        IDLE = dragDismissPhase;
        DragDismissPhase dragDismissPhase2 = new DragDismissPhase("DRAGGING", 1);
        DRAGGING = dragDismissPhase2;
        DragDismissPhase dragDismissPhase3 = new DragDismissPhase("CANCELLING", 2);
        CANCELLING = dragDismissPhase3;
        DragDismissPhase dragDismissPhase4 = new DragDismissPhase("COMPLETING", 3);
        COMPLETING = dragDismissPhase4;
        DragDismissPhase[] dragDismissPhaseArr = {dragDismissPhase, dragDismissPhase2, dragDismissPhase3, dragDismissPhase4};
        $VALUES = dragDismissPhaseArr;
        $ENTRIES = new F3w(dragDismissPhaseArr);
    }

    public static Ey9<DragDismissPhase> getEntries() {
        return $ENTRIES;
    }

    public static DragDismissPhase valueOf(String str) {
        return (DragDismissPhase) Enum.valueOf(DragDismissPhase.class, str);
    }

    public static DragDismissPhase[] values() {
        return (DragDismissPhase[]) $VALUES.clone();
    }

    public DragDismissPhase(String str, int i) {
    }
}
