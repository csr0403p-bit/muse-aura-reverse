package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C2Um;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$2$1 extends AbstractC7559F3s implements G0U<C2Um, Unit> {
    public final /* synthetic */ MutableState<Boolean> $awaitingSelectionStart$delegate;
    public final /* synthetic */ MutableState<Boolean> $selectionActive$delegate;
    public final /* synthetic */ MutableState<Boolean> $selectionHasFocus$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2Um c2Um) {
        C7384Etj.A0Y(c2Um, 0);
        MutableState<Boolean> mutableState = this.$selectionHasFocus$delegate;
        float f = HatchMessageLongPressMenuHostKt.MenuGap;
        boolean zA0A = MutableState.A0A((MutableState) mutableState);
        MutableState.A09(c2Um.AG5(), this.$selectionHasFocus$delegate);
        if (!zA0A || c2Um.AG5() || MutableState.A0A((MutableState) this.$awaitingSelectionStart$delegate)) {
            return;
        }
        MutableState.A09(false, this.$selectionActive$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$2$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.$selectionHasFocus$delegate = mutableState;
        this.$awaitingSelectionStart$delegate = mutableState2;
        this.$selectionActive$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2Um c2Um) {
        invoke2(c2Um);
        return Unit.INSTANCE;
    }
}
