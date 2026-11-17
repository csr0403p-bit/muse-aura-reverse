package com.facebook.aura.library.view;

import X.AHD;
import X.AHG;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AHD<Goal> $goals;
    public final /* synthetic */ boolean $goalsHasNextPage;
    public final /* synthetic */ boolean $isLoadingMoreGoals;
    public final /* synthetic */ boolean $isLoadingMoreTracking;
    public final /* synthetic */ boolean $isTopSectionExpanded;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
    public final /* synthetic */ Function0<Unit> $onExpandTopSection;
    public final /* synthetic */ Function0<Unit> $onLoadMoreGoals;
    public final /* synthetic */ Function0<Unit> $onLoadMoreTracking;
    public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
    public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
    public final /* synthetic */ AHG<String> $pendingCompletionIds;
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ boolean $showGoalsFirst;
    public final /* synthetic */ boolean $showSubtitles;
    public final /* synthetic */ boolean $showTrackingSection;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ AHD<Goal> $trackingGoals;
    public final /* synthetic */ boolean $trackingHasNextPage;

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$GoalCardList$5(AHD<Goal> ahd, AHD<Goal> ahd2, LazyListState lazyListState, float f, boolean z, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, boolean z5, boolean z6, Function0<Unit> function02, boolean z7, boolean z8, Function0<Unit> function03, Function0<Unit> function04, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, GoalReorderActions goalReorderActions, BRg bRg, int i, int i2, int i3, int i4) {
        super(2);
        this.$goals = ahd;
        this.$trackingGoals = ahd2;
        this.$listState = lazyListState;
        this.$topPadding = f;
        this.$showSubtitles = z;
        this.$showTrackingSection = z2;
        this.$showGoalsFirst = z3;
        this.$isTopSectionExpanded = z4;
        this.$onExpandTopSection = function0;
        this.$goalsHasNextPage = z5;
        this.$isLoadingMoreGoals = z6;
        this.$onLoadMoreGoals = function02;
        this.$trackingHasNextPage = z7;
        this.$isLoadingMoreTracking = z8;
        this.$onLoadMoreTracking = function03;
        this.$onOpenGoalDetail = function04;
        this.$onDeleteGoal = g0u;
        this.$onRenameGoal = g0w;
        this.$onToggleComplete = g0v;
        this.$pendingCompletionIds = ahg;
        this.$reorderActions = goalReorderActions;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    public final void invoke(BFM bfm, int i) {
        HatchGoalsTabScreenKt.m1164GoalCardListcSuvAI(this.$goals, this.$trackingGoals, this.$listState, this.$topPadding, this.$showSubtitles, this.$showTrackingSection, this.$showGoalsFirst, this.$isTopSectionExpanded, this.$onExpandTopSection, this.$goalsHasNextPage, this.$isLoadingMoreGoals, this.$onLoadMoreGoals, this.$trackingHasNextPage, this.$isLoadingMoreTracking, this.$onLoadMoreTracking, this.$onOpenGoalDetail, this.$onDeleteGoal, this.$onRenameGoal, this.$onToggleComplete, this.$pendingCompletionIds, this.$reorderActions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
