package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ G0V<Goal, Integer, Unit> $onOpenGoalDetail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$4$1$1(G0V<? super Goal, ? super Integer, Unit> g0v, Goal goal, int i) {
        super(0);
        this.$onOpenGoalDetail = g0v;
        this.$goal = goal;
        this.$absolutePosition = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1H(this.$goal, this.$onOpenGoalDetail, this.$absolutePosition);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
