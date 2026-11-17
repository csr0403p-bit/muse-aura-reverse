package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$2$1$1$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $goalsHiddenCount;
    public final /* synthetic */ Function0<Unit> $onExpandTopSection;
    public final /* synthetic */ Function0<Unit> $onLoadMoreGoals;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$2$1$1$6$1$1(int i, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$goalsHiddenCount = i;
        this.$onExpandTopSection = function0;
        this.$onLoadMoreGoals = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean zA1N = AnonymousClass002.A1N(this.$goalsHiddenCount);
        HatchGoalsTabScreenKt.logShowMoreClick(zA1N, "goals");
        (zA1N ? this.$onExpandTopSection : this.$onLoadMoreGoals).invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
