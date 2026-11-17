package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$HatchGoalsTabScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isTopSectionExpanded$delegate;
    public final /* synthetic */ MutableState<Boolean> $returningFromGoalDetail$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$returningFromGoalDetail$delegate = mutableState;
        this.$isTopSectionExpanded$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState<Boolean> mutableState = this.$returningFromGoalDetail$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        if (MutableState.A0A((MutableState) mutableState)) {
            MutableState.A09(false, this.$returningFromGoalDetail$delegate);
        } else {
            MutableState.A09(false, this.$isTopSectionExpanded$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.library.view.HatchGoalsTabScreenKt$HatchGoalsTabScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
