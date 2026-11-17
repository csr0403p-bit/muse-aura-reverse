package com.facebook.aura.conversation.view;

import X.AaC;
import X.Ab8;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C1795ArE;
import X.C78N;
import X.C9xg;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $awaitingSelectionStart$delegate;
    public final /* synthetic */ G2j<BRg, Boolean, BFM, Integer, Unit> $content;
    public final /* synthetic */ MutableState<AaC> $selectableBoundsInWindow$delegate;
    public final /* synthetic */ MutableState<Boolean> $selectionActive$delegate;
    public final /* synthetic */ boolean $selectionEnabled;
    public final /* synthetic */ MutableState<Boolean> $selectionHasFocus$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1(G2j<? super BRg, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, MutableState<AaC> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, boolean z) {
        super(2);
        this.$content = g2j;
        this.$selectableBoundsInWindow$delegate = mutableState;
        this.$selectionHasFocus$delegate = mutableState2;
        this.$awaitingSelectionStart$delegate = mutableState3;
        this.$selectionActive$delegate = mutableState4;
        this.$selectionEnabled = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            G2j<BRg, Boolean, BFM, Integer, Unit> g2j = this.$content;
            BS0 bs0 = BRg.A00;
            boolean zA65 = bfm.A65(this.$selectableBoundsInWindow$delegate);
            MutableState<AaC> mutableState = this.$selectableBoundsInWindow$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass005.A0W(bs0, objAaT);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$selectionActive$delegate, AnonymousClass001.A1R(bfm, this.$awaitingSelectionStart$delegate, bfm.A65(this.$selectionHasFocus$delegate)));
            MutableState<Boolean> mutableState2 = this.$selectionHasFocus$delegate;
            MutableState<Boolean> mutableState3 = this.$awaitingSelectionStart$delegate;
            MutableState<Boolean> mutableState4 = this.$selectionActive$delegate;
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$2$1(mutableState2, mutableState3, mutableState4);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA00 = C9xg.A00(bRgA0W, (G0U) objAaT2);
            boolean zA652 = bfm.A65(this.$selectionHasFocus$delegate);
            MutableState<Boolean> mutableState5 = this.$selectionHasFocus$delegate;
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$3$1(mutableState5);
                bfm.Ai0(objAaT3);
            }
            final G0U g0u = (G0U) objAaT3;
            AnonymousClass001.A1F(bRgA00.then(new Ab8<C1795ArE>(g0u) { // from class: X.3UB
                public final G0U<C7dn, Boolean> A00;

                @Override // X.Ab8
                public final boolean equals(Object obj) {
                    return this == obj || ((obj instanceof C3UB) && this.A00 == ((C3UB) obj).A00);
                }

                @Override // X.Ab8
                public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                    G0U<C7dn, Boolean> g0u2 = this.A00;
                    C1795ArE c1795ArE = new C1795ArE();
                    c1795ArE.A00 = g0u2;
                    return c1795ArE;
                }

                @Override // X.Ab8
                public final int hashCode() {
                    return this.A00.hashCode();
                }

                @Override // X.Ab8
                public final void inspectableProperties(ASF asf) {
                    asf.A01 = "filterTextContextMenuDataComponents";
                    asf.A02.A01("filter", this.A00);
                }

                @Override // X.Ab8
                public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                    ((C1795ArE) abstractC1439Aj8).A00 = this.A00;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.A00 = g0u;
                }
            }), Boolean.valueOf(this.$selectionEnabled), bfm, g2j, 0);
            return;
        }
        bfm.Afo();
    }
}
