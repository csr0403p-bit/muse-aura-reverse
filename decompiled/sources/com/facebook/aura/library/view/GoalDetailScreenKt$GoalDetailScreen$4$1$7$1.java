package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ GoalDetail $detail;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$7$1(GoalDetail goalDetail, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$detail = goalDetail;
        this.$renameText$delegate = mutableState;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        Goal goal;
        MutableState<String> mutableState = this.$renameText$delegate;
        GoalDetail goalDetail = this.$detail;
        if (goalDetail == null || (goal = goalDetail.goal) == null || (str = goal.title) == null) {
            str = "";
        }
        mutableState.Af8(str);
        MutableState.A09(true, this.$showRenameDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
