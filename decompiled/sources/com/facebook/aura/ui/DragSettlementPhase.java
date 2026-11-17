package com.facebook.aura.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DragSettlementPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DragSettlementPhase[] $VALUES;
    public static final DragSettlementPhase ANIMATING;
    public static final DragSettlementPhase AWAITING_PLACEMENT;
    public static final DragSettlementPhase SUPPRESSING;

    static {
        DragSettlementPhase dragSettlementPhase = new DragSettlementPhase("AWAITING_PLACEMENT", 0);
        AWAITING_PLACEMENT = dragSettlementPhase;
        DragSettlementPhase dragSettlementPhase2 = new DragSettlementPhase("ANIMATING", 1);
        ANIMATING = dragSettlementPhase2;
        DragSettlementPhase dragSettlementPhase3 = new DragSettlementPhase("SUPPRESSING", 2);
        SUPPRESSING = dragSettlementPhase3;
        DragSettlementPhase[] dragSettlementPhaseArr = {dragSettlementPhase, dragSettlementPhase2, dragSettlementPhase3};
        $VALUES = dragSettlementPhaseArr;
        $ENTRIES = C3cG.A0w(dragSettlementPhaseArr);
    }

    public static Ey9<DragSettlementPhase> getEntries() {
        return $ENTRIES;
    }

    public static DragSettlementPhase valueOf(String str) {
        return (DragSettlementPhase) Enum.valueOf(DragSettlementPhase.class, str);
    }

    public static DragSettlementPhase[] values() {
        return (DragSettlementPhase[]) $VALUES.clone();
    }

    public DragSettlementPhase(String str, int i) {
    }
}
