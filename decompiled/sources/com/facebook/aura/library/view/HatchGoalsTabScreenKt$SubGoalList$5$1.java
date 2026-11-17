package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$5$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ SubGoalDragOut $subGoalDragOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$SubGoalList$5$1(SubGoalDragOut subGoalDragOut) {
        super(1);
        this.$subGoalDragOut = subGoalDragOut;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$subGoalDragOut.onCancelled.invoke();
    }
}
