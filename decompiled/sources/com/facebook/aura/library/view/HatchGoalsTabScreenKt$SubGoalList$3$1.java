package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.ui.DraggedRowPosition;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$3$1 extends AbstractC7559F3s implements G0V<Integer, DraggedRowPosition, Unit> {
    public final /* synthetic */ SubGoalDragOut $subGoalDragOut;

    public final void invoke(int i, DraggedRowPosition draggedRowPosition) {
        C7384Etj.A0Y(draggedRowPosition, 1);
        this.$subGoalDragOut.onMoved.invoke(draggedRowPosition);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$SubGoalList$3$1(SubGoalDragOut subGoalDragOut) {
        super(2);
        this.$subGoalDragOut = subGoalDragOut;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, DraggedRowPosition draggedRowPosition) {
        invoke(AnonymousClass001.A0F(num), draggedRowPosition);
        return Unit.INSTANCE;
    }
}
