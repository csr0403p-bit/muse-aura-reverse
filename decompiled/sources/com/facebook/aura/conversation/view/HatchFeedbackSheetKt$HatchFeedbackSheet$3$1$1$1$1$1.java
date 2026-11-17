package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BGK;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ MutableState<Set<Integer>> $selectedIndices$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$1$1$1$1(int i, MutableState<Set<Integer>> mutableState) {
        super(1);
        this.$index = i;
        this.$selectedIndices$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        MutableState<Set<Integer>> mutableState = this.$selectedIndices$delegate;
        Set<Integer> value = mutableState.getValue();
        Integer numValueOf = Integer.valueOf(this.$index);
        mutableState.Af8(z ? BGK.A02(numValueOf, value) : BGK.A04(numValueOf, value));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
