package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.status.repo.ActivityGoalAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityGoalBottomSheetComponentKt$GoalActionSectionsSection$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ActivityGoalAction $goalAction;
    public final /* synthetic */ G0U<ActivityGoalAction, Unit> $onGoalActionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityGoalBottomSheetComponentKt$GoalActionSectionsSection$1$1$1$1$1(G0U<? super ActivityGoalAction, Unit> g0u, ActivityGoalAction activityGoalAction) {
        super(0);
        this.$onGoalActionClick = g0u;
        this.$goalAction = activityGoalAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onGoalActionClick.invoke(this.$goalAction);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
