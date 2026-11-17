package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$4$1 extends AbstractC7559F3s implements G0U<Integer, Boolean> {
    public final /* synthetic */ SubGoalDragOut $subGoalDragOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$SubGoalList$4$1(SubGoalDragOut subGoalDragOut) {
        super(1);
        this.$subGoalDragOut = subGoalDragOut;
    }

    public final Boolean invoke(int i) {
        return this.$subGoalDragOut.onReleased.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
