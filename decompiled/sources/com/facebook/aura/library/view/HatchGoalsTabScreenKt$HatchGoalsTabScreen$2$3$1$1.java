package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isTopSectionExpanded$delegate;
    public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$1$1(HatchGoalsTabViewModel hatchGoalsTabViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.$viewModel = hatchGoalsTabViewModel;
        this.$isTopSectionExpanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logPullToRefresh(HatchSurface.GOALS, null, HatchScreen.GOALS_HOME, null);
        MutableState<Boolean> mutableState = this.$isTopSectionExpanded$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        MutableState.A09(false, mutableState);
        this.$viewModel.refresh(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
