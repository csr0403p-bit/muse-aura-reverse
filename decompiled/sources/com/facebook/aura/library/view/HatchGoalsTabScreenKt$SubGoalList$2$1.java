package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.ui.DraggedRowPosition;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$2$1 extends AbstractC7559F3s implements G0V<Integer, DraggedRowPosition, Boolean> {
    public final /* synthetic */ Object $blockKey;
    public final /* synthetic */ Goal $parentGoal;
    public final /* synthetic */ GoalListSection $section;
    public final /* synthetic */ SubGoalDragOut $subGoalDragOut;
    public final /* synthetic */ AHD<String> $subGoalIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$SubGoalList$2$1(AHD<String> ahd, SubGoalDragOut subGoalDragOut, Object obj, Goal goal, GoalListSection goalListSection) {
        super(2);
        this.$subGoalIds = ahd;
        this.$subGoalDragOut = subGoalDragOut;
        this.$blockKey = obj;
        this.$parentGoal = goal;
        this.$section = goalListSection;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, DraggedRowPosition draggedRowPosition) {
        return invoke(AnonymousClass001.A0F(num), draggedRowPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean invoke(int i, DraggedRowPosition draggedRowPosition) {
        C7384Etj.A0Y(draggedRowPosition, 1);
        Object objA0A = AbstractC0878AGe.A0A(i, this.$subGoalIds);
        boolean z = false;
        if (objA0A != null) {
            SubGoalDragOut subGoalDragOut = this.$subGoalDragOut;
            Object obj = this.$blockKey;
            Goal goal = this.$parentGoal;
            if (AnonymousClass001.A1X(subGoalDragOut.onStarted.invoke(obj, goal.id, this.$section, objA0A, draggedRowPosition))) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
