package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityGoalBottomSheetComponentKt$GoalActionRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$GoalActionRow$1$1(C0dx c0dx, Function0<Unit> function0) {
        super(0);
        this.$haptics = c0dx;
        this.$onClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptics.AXr(AuraHaptics.BUTTON_TAP);
        this.$onClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
