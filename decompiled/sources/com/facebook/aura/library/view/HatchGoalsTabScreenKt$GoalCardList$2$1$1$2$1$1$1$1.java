package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$2$1$1$2$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ G0U<String, Unit> $toggleTrackingExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$GoalCardList$2$1$1$2$1$1$1$1(G0U<? super String, Unit> g0u, Goal goal) {
        super(0);
        this.$toggleTrackingExpanded = g0u;
        this.$goal = goal;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$toggleTrackingExpanded.invoke(this.$goal.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
