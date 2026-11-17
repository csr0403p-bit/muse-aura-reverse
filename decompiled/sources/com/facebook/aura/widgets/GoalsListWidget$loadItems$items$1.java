package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class GoalsListWidget$loadItems$items$1 extends AbstractC7559F3s implements G0U<Goal, Boolean> {
    public static final GoalsListWidget$loadItems$items$1 INSTANCE = new GoalsListWidget$loadItems$items$1();

    public GoalsListWidget$loadItems$items$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Goal goal) {
        C7384Etj.A0Y(goal, 0);
        return C3cG.A0P(goal.isCompleted());
    }
}
