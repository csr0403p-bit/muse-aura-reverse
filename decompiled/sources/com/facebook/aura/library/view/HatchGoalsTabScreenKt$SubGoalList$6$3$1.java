package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$6$3$1 extends AbstractC7559F3s implements G0U<Boolean, Boolean> {
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
    public final /* synthetic */ Goal $subGoal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$SubGoalList$6$3$1(G0V<? super String, ? super Boolean, Boolean> g0v, Goal goal) {
        super(1);
        this.$onToggleComplete = g0v;
        this.$subGoal = goal;
    }

    public final Boolean invoke(boolean z) {
        return this.$onToggleComplete.invoke(this.$subGoal.id, Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(AnonymousClass001.A1X(bool));
    }
}
