package com.facebook.aura.library.view;

import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C3cH;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalsState;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ GoalsState $goalsState;
    public final /* synthetic */ MutableState<Boolean> $isTopSectionExpanded$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ boolean $showTrackingSection;
    public final /* synthetic */ C1BO<HatchGoalsTabViewModel.UiState> $uiState$delegate;
    public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ GoalsState $goalsState;
        public final /* synthetic */ MutableState<Boolean> $isTopSectionExpanded$delegate;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ GoalReorderActions $reorderActions;
        public final /* synthetic */ boolean $showTrackingSection;
        public final /* synthetic */ float $topPadding;
        public final /* synthetic */ C1BO<HatchGoalsTabViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GoalsState goalsState, LazyListState lazyListState, float f, boolean z, MutableState<Boolean> mutableState, HatchGoalsTabViewModel hatchGoalsTabViewModel, Function0<Unit> function0, GoalReorderActions goalReorderActions, C1BO<HatchGoalsTabViewModel.UiState> c1bo) {
            super(3);
            this.$goalsState = goalsState;
            this.$listState = lazyListState;
            this.$topPadding = f;
            this.$showTrackingSection = z;
            this.$isTopSectionExpanded$delegate = mutableState;
            this.$viewModel = hatchGoalsTabViewModel;
            this.$onOpenGoalDetail = function0;
            this.$reorderActions = goalReorderActions;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            LoadingState loadingState;
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                bfm.Afo();
                return;
            }
            AHD<Goal> ahd = this.$goalsState.goals;
            if (ahd.isEmpty() && ((loadingState = this.$goalsState.loadingState) == LoadingState.INITIAL || loadingState == LoadingState.LOADING)) {
                bfm.AgE(1350220093);
                C1062ATq c1062ATq = C10G.A01;
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AnonymousClass007.A0s(bfm, bbi);
            } else {
                bfm.AgE(1350394964);
                C1BO<HatchGoalsTabViewModel.UiState> c1bo = this.$uiState$delegate;
                float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
                AHD<Goal> ahd2 = C3cH.A0O(c1bo).trackingGoals;
                LazyListState lazyListState = this.$listState;
                float f2 = this.$topPadding;
                boolean z = C3cH.A0O(this.$uiState$delegate).showSubtitles;
                boolean z2 = this.$showTrackingSection;
                boolean z3 = C3cH.A0O(this.$uiState$delegate).showGoalsFirst;
                boolean zA0A = MutableState.A0A((MutableState) this.$isTopSectionExpanded$delegate);
                boolean zA65 = bfm.A65(this.$isTopSectionExpanded$delegate);
                MutableState<Boolean> mutableState = this.$isTopSectionExpanded$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$2$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                GoalsState goalsState = this.$goalsState;
                boolean z4 = goalsState.hasNextPage;
                boolean z5 = goalsState.isLoadingMore;
                HatchGoalsTabViewModel hatchGoalsTabViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(hatchGoalsTabViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$3$1(hatchGoalsTabViewModel);
                    bfm.Ai0(objAaT2);
                }
                Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                boolean z6 = C3cH.A0O(this.$uiState$delegate).trackingHasNextPage;
                boolean z7 = C3cH.A0O(this.$uiState$delegate).isLoadingMoreTracking;
                HatchGoalsTabViewModel hatchGoalsTabViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(hatchGoalsTabViewModel2);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$4$1(hatchGoalsTabViewModel2);
                    bfm.Ai0(objAaT3);
                }
                Function0 function04 = (Function0) ((InterfaceC7353EnQ) objAaT3);
                Function0<Unit> function05 = this.$onOpenGoalDetail;
                HatchGoalsTabViewModel hatchGoalsTabViewModel3 = this.$viewModel;
                boolean zA673 = bfm.A67(hatchGoalsTabViewModel3);
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$5$1(hatchGoalsTabViewModel3);
                    bfm.Ai0(objAaT4);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT4);
                HatchGoalsTabViewModel hatchGoalsTabViewModel4 = this.$viewModel;
                boolean zA674 = bfm.A67(hatchGoalsTabViewModel4);
                Object objAaT5 = bfm.AaT();
                if (zA674 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$6$1(hatchGoalsTabViewModel4);
                    bfm.Ai0(objAaT5);
                }
                G0W g0w = (G0W) ((InterfaceC7353EnQ) objAaT5);
                HatchGoalsTabViewModel hatchGoalsTabViewModel5 = this.$viewModel;
                boolean zA675 = bfm.A67(hatchGoalsTabViewModel5);
                Object objAaT6 = bfm.AaT();
                if (zA675 || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$7$1(hatchGoalsTabViewModel5);
                    bfm.Ai0(objAaT6);
                }
                HatchGoalsTabScreenKt.m1164GoalCardListcSuvAI(ahd, ahd2, lazyListState, f2, z, z2, z3, zA0A, function02, z4, z5, function03, z6, z7, function04, function05, g0u, g0w, (G0V) ((InterfaceC7353EnQ) objAaT6), C3cH.A0O(this.$uiState$delegate).pendingCompletionIds, this.$reorderActions, null, bfm, 0, 196608, 0, 2097152);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3(GoalsState goalsState, MutableState<Boolean> mutableState, HatchGoalsTabViewModel hatchGoalsTabViewModel, LazyListState lazyListState, boolean z, Function0<Unit> function0, GoalReorderActions goalReorderActions, C1BO<HatchGoalsTabViewModel.UiState> c1bo) {
        super(3);
        this.$goalsState = goalsState;
        this.$isTopSectionExpanded$delegate = mutableState;
        this.$viewModel = hatchGoalsTabViewModel;
        this.$listState = lazyListState;
        this.$showTrackingSection = z;
        this.$onOpenGoalDetail = function0;
        this.$reorderActions = goalReorderActions;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m1168invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m1168invoke8Feqmps(float f, BFM bfm, int i) {
        int iA04 = i;
        if ((i & 6) == 0) {
            iA04 = i | AnonymousClass004.A04(bfm, f);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            bfm.Afo();
            return;
        }
        boolean z = this.$goalsState.loadingState == LoadingState.REFRESH_LOADING;
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$isTopSectionExpanded$delegate));
        HatchGoalsTabViewModel hatchGoalsTabViewModel = this.$viewModel;
        MutableState<Boolean> mutableState = this.$isTopSectionExpanded$delegate;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$1$1(hatchGoalsTabViewModel, mutableState);
            bfm.Ai0(objAaT);
        }
        HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(z, (Function0) objAaT, C10G.A01, f, null, B1V.A00(bfm, new AnonymousClass2(this.$goalsState, this.$listState, f, this.$showTrackingSection, this.$isTopSectionExpanded$delegate, this.$viewModel, this.$onOpenGoalDetail, this.$reorderActions, this.$uiState$delegate), -131581860), bfm, ((iA04 << 9) & 7168) | 196992, 16);
    }
}
