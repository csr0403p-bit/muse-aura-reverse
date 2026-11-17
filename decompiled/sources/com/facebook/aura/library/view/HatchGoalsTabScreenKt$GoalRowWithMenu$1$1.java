package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalRowWithMenu$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ boolean $dragEnabled;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ Function0<Unit> $onPickUp;
    public final /* synthetic */ Function0<Unit> $openMenu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalRowWithMenu$1$1(C0dx c0dx, boolean z, Function0<Unit> function0, Goal goal, int i, Function0<Unit> function02) {
        super(0);
        this.$haptic = c0dx;
        this.$dragEnabled = z;
        this.$onPickUp = function0;
        this.$goal = goal;
        this.$absolutePosition = i;
        this.$openMenu = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        this.$haptic.AXr(0);
        if (this.$dragEnabled) {
            function0 = this.$onPickUp;
        } else {
            HatchGoalsTabScreenKt.logGoalRowLongPress(this.$goal.id, Integer.valueOf(this.$absolutePosition));
            function0 = this.$openMenu;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
