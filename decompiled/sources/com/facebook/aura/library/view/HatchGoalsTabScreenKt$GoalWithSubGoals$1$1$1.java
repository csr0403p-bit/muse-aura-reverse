package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalWithSubGoals$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Boolean> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$GoalWithSubGoals$1$1$1(G0V<? super String, ? super Boolean, Boolean> g0v, Goal goal) {
        super(1);
        this.$onToggleComplete = g0v;
        this.$goal = goal;
    }

    public final Boolean invoke(boolean z) {
        return this.$onToggleComplete.invoke(this.$goal.id, Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(AnonymousClass001.A1X(bool));
    }
}
