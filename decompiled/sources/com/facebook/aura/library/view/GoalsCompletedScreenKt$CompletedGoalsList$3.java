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
import com.facebook.aura.library.model.CompletedGoalsSection;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$CompletedGoalsList$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $hasNextPage;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ G0V<Goal, Integer, Unit> $onOpenGoalDetail;
    public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
    public final /* synthetic */ AHG<String> $pendingCompletionIds;
    public final /* synthetic */ AHD<CompletedGoalsSection> $sections;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalsCompletedScreenKt$CompletedGoalsList$3(AHD<CompletedGoalsSection> ahd, float f, float f2, boolean z, boolean z2, Function0<Unit> function0, G0V<? super Goal, ? super Integer, Unit> g0v, G0V<? super String, ? super Boolean, Boolean> g0v2, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$sections = ahd;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$hasNextPage = z;
        this.$isLoadingMore = z2;
        this.$onLoadMore = function0;
        this.$onOpenGoalDetail = g0v;
        this.$onToggleComplete = g0v2;
        this.$pendingCompletionIds = ahg;
        this.$onDeleteGoal = g0u;
        this.$onRenameGoal = g0w;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        GoalsCompletedScreenKt.m1152CompletedGoalsListH2JDbgA(this.$sections, this.$topPadding, this.$bottomPadding, this.$hasNextPage, this.$isLoadingMore, this.$onLoadMore, this.$onOpenGoalDetail, this.$onToggleComplete, this.$pendingCompletionIds, this.$onDeleteGoal, this.$onRenameGoal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
