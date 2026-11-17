package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalCronOverflowMenu$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ String $cronId;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalCronOverflowMenu$1$1$1(String str, String str2, int i, MutableState<Boolean> mutableState) {
        super(0);
        this.$goalId = str;
        this.$cronId = str2;
        this.$absolutePosition = i;
        this.$menuExpanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOAL_DETAIL, HatchComponent.ARTIFACT_OVERFLOW_MENU, null, GoalDetailScreenKt.cronRowLogMetadata(this.$goalId, this.$cronId, this.$absolutePosition), null);
        MutableState.A09(true, this.$menuExpanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
