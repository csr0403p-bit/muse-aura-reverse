package com.facebook.aura.vds.compose.bottomsheet.state;

import X.C1E7;
import X.C1Pn;
import X.C1Vj;
import X.C3Sn;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.HtJ;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSheetState {
    public static final int $stable = 0;
    public final boolean dismissible;
    public final C1Pn sheetState;

    public AuraSheetState(C1Pn c1Pn, boolean z) {
        C7384Etj.A0Y(c1Pn, 0);
        this.sheetState = c1Pn;
        this.dismissible = z;
    }

    public final Object expand(HtJ<? super Unit> htJ) {
        AnchoredDraggableState<C1Vj> anchoredDraggableState = this.sheetState.A00;
        Object objA00 = AnchoredDraggableKt.A00(anchoredDraggableState, C1Vj.Expanded, htJ, anchoredDraggableState.A04.AFn());
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA00 != enumC10460Hji) {
            objA00 = Unit.INSTANCE;
        }
        return objA00 != enumC10460Hji ? Unit.INSTANCE : objA00;
    }

    public final boolean getDismissible() {
        return this.dismissible;
    }

    public final boolean getHasExpandedState() {
        C3Sn c3Sn = (C3Sn) this.sheetState.A00.A06.getValue();
        return ((C1E7) c3Sn).A00.containsKey(C1Vj.Expanded);
    }

    public final C1Pn getSheetState() {
        return this.sheetState;
    }

    public final Object hide(HtJ<? super Unit> htJ) {
        Object objA00 = this.sheetState.A00(htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final boolean isHiding() {
        return this.sheetState.A02() && this.sheetState.A00.A0A.getValue() == C1Vj.Hidden;
    }

    public final boolean isSettled() {
        return this.sheetState.A02() && this.sheetState.A00.A07.getValue() == this.sheetState.A00.A0A.getValue();
    }

    public final boolean isVisible() {
        return this.sheetState.A02();
    }
}
