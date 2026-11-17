package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$3$1(HatchScreen hatchScreen, Goal goal, G0W<? super String, ? super String, ? super String, Unit> g0w, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$screen = hatchScreen;
        this.$goal = goal;
        this.$onRenameGoal = g0w;
        this.$renameText$delegate = mutableState;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_SAVE_BUTTON, this.$screen, this.$goal.id, HatchSubsurface.GOAL_RENAME_DIALOG, null);
        String strA0l = AnonymousClass002.A0l(MutableState.A05(this.$renameText$delegate));
        MutableState.A09(false, this.$showRenameDialog$delegate);
        if (strA0l.length() > 0) {
            G0W<String, String, String, Unit> g0w = this.$onRenameGoal;
            Goal goal = this.$goal;
            g0w.invoke(goal.id, strA0l, goal.description);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
