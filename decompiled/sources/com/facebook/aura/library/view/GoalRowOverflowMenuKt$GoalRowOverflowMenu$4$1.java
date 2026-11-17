package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$4$1(HatchScreen hatchScreen, Goal goal, MutableState<Boolean> mutableState) {
        super(0);
        this.$screen = hatchScreen;
        this.$goal = goal;
        this.$showRenameDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_RENAME_CANCEL_BUTTON, this.$screen, this.$goal.id, HatchSubsurface.GOAL_RENAME_DIALOG, null);
        MutableState.A09(false, this.$showRenameDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
