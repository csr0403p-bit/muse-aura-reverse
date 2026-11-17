package com.facebook.aura.library.view;

import X.AnonymousClass005;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.library.repo.GoalListSection;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalReorderActions {
    public final G0W<GoalListSection, String, String, Unit> moveGoal;
    public final G0V<String, String, Unit> nestGoalUnder;
    public final G2j<String, GoalListSection, GoalListSection, String, Unit> placeGoalAtRoot;
    public final G0V<String, GoalListSection, Unit> promoteSubGoal;
    public final G0W<String, List<String>, String, Unit> reorderSubGoals;

    public final G0W<GoalListSection, String, String, Unit> getMoveGoal() {
        return this.moveGoal;
    }

    public final G0V<String, String, Unit> getNestGoalUnder() {
        return this.nestGoalUnder;
    }

    public final G2j<String, GoalListSection, GoalListSection, String, Unit> getPlaceGoalAtRoot() {
        return this.placeGoalAtRoot;
    }

    public final G0V<String, GoalListSection, Unit> getPromoteSubGoal() {
        return this.promoteSubGoal;
    }

    public final G0W<String, List<String>, String, Unit> getReorderSubGoals() {
        return this.reorderSubGoals;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalReorderActions(G0W<? super GoalListSection, ? super String, ? super String, Unit> g0w, G0W<? super String, ? super List<String>, ? super String, Unit> g0w2, G0V<? super String, ? super GoalListSection, Unit> g0v, G0V<? super String, ? super String, Unit> g0v2, G2j<? super String, ? super GoalListSection, ? super GoalListSection, ? super String, Unit> g2j) {
        AnonymousClass005.A17(g0w, g0w2, g0v, g0v2, g2j);
        this.moveGoal = g0w;
        this.reorderSubGoals = g0w2;
        this.promoteSubGoal = g0v;
        this.nestGoalUnder = g0v2;
        this.placeGoalAtRoot = g2j;
    }
}
