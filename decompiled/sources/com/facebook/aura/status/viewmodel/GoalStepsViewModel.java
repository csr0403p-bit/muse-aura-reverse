package com.facebook.aura.status.viewmodel;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C3pU;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.F2X;
import X.FGI;
import X.G0V;
import X.HoC;
import X.Ht9;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC2349BUy;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.repo.ActivityDataSource;
import com.facebook.aura.status.repo.ActivityGoalAction;
import com.facebook.aura.status.repo.ActivityGoalActionReportChunk;
import com.facebook.aura.status.repo.ActivityGoalActionsResult;
import com.facebook.aura.status.repo.ActivityGoalUpdate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class GoalStepsViewModel extends AEs {
    public final BLG<ReportUiState> _report;
    public final BLG<StepsUiState> _steps;
    public final ActivityDataSource dataSource;
    public String earlierCursor;
    public List<ActivityGoalAction> earlierSteps;
    public final String goalId;
    public boolean hasLoadedEarlierPage;
    public String newestCursor;
    public final BLG<Integer> newestPageRequests;
    public List<ActivityGoalAction> newestSteps;
    public final C1BN<ReportUiState> report;
    public HoC reportJob;
    public Long reportNextOffset;
    public final C1BN<StepsUiState> steps;

    /* loaded from: classes3.dex */
    public final class Factory extends AuraViewModelFactory<GoalStepsViewModel> {
        public final String goalId;
        public final List<ActivityGoalAction> previewSteps;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public GoalStepsViewModel create() {
            return new GoalStepsViewModel(ActivityDataSource.Companion.getInstance(this.userSession), this.goalId, this.previewSteps);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, List<ActivityGoalAction> list) {
            AnonymousClass005.A0x(abstractC3358CGz, str, list);
            this.userSession = abstractC3358CGz;
            this.goalId = str;
            this.previewSteps = list;
        }
    }

    public final class ReportUiState extends C06G {
        public final String actionId;
        public final boolean hasMore;
        public final boolean isLoading;
        public final boolean loadFailed;
        public final String text;

        public ReportUiState(String str, String str2, boolean z, boolean z2, boolean z3) {
            C7384Etj.A0Y(str2, 1);
            this.actionId = str;
            this.text = str2;
            this.hasMore = z;
            this.isLoading = z2;
            this.loadFailed = z3;
        }

        public final ReportUiState copy(String str, String str2, boolean z, boolean z2, boolean z3) {
            C7384Etj.A0Y(str2, 1);
            return new ReportUiState(str, str2, z, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReportUiState) {
                    ReportUiState reportUiState = (ReportUiState) obj;
                    if (!C7384Etj.areEqual(this.actionId, reportUiState.actionId) || !C7384Etj.areEqual(this.text, reportUiState.text) || this.hasMore != reportUiState.hasMore || this.isLoading != reportUiState.isLoading || this.loadFailed != reportUiState.loadFailed) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ReportUiState copy$default(ReportUiState reportUiState, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reportUiState.actionId;
            }
            if ((i & 2) != 0) {
                str2 = reportUiState.text;
            }
            if ((i & 4) != 0) {
                z = reportUiState.hasMore;
            }
            if ((i & 8) != 0) {
                z2 = reportUiState.isLoading;
            }
            if ((i & 16) != 0) {
                z3 = reportUiState.loadFailed;
            }
            return reportUiState.copy(str, str2, z, z2, z3);
        }

        public final String component1() {
            return this.actionId;
        }

        public final String component2() {
            return this.text;
        }

        public final boolean component3() {
            return this.hasMore;
        }

        public final boolean component4() {
            return this.isLoading;
        }

        public final boolean component5() {
            return this.loadFailed;
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final boolean getLoadFailed() {
            return this.loadFailed;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.text, AnonymousClass006.A0G(this.actionId) * 31), this.hasMore), this.isLoading), this.loadFailed);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ReportUiState(String str, String str2, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
            this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), C3cI.A1S(i, z3));
        }

        public ReportUiState() {
            this(null, "", false, false, false);
        }
    }

    public final class StepsUiState extends C06G {
        public final boolean hasEarlierSteps;
        public final boolean isLoading;
        public final boolean isLoadingEarlier;
        public final boolean loadEarlierFailed;
        public final boolean loadFailed;
        public final AHD<ActivityGoalAction> steps;

        public final StepsUiState copy(AHD<ActivityGoalAction> ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C7384Etj.A0Y(ahd, 0);
            return new StepsUiState(ahd, z, z2, z3, z4, z5);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StepsUiState) {
                    StepsUiState stepsUiState = (StepsUiState) obj;
                    if (!C7384Etj.areEqual(this.steps, stepsUiState.steps) || this.hasEarlierSteps != stepsUiState.hasEarlierSteps || this.isLoading != stepsUiState.isLoading || this.isLoadingEarlier != stepsUiState.isLoadingEarlier || this.loadFailed != stepsUiState.loadFailed || this.loadEarlierFailed != stepsUiState.loadEarlierFailed) {
                    }
                }
                return false;
            }
            return true;
        }

        public StepsUiState() {
            this(AHI.A01, false, false, false, false, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StepsUiState copy$default(StepsUiState stepsUiState, AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = stepsUiState.steps;
            }
            if ((i & 2) != 0) {
                z = stepsUiState.hasEarlierSteps;
            }
            if ((i & 4) != 0) {
                z2 = stepsUiState.isLoading;
            }
            if ((i & 8) != 0) {
                z3 = stepsUiState.isLoadingEarlier;
            }
            if ((i & 16) != 0) {
                z4 = stepsUiState.loadFailed;
            }
            if ((i & 32) != 0) {
                z5 = stepsUiState.loadEarlierFailed;
            }
            return stepsUiState.copy(ahd, z, z2, z3, z4, z5);
        }

        public final AHD<ActivityGoalAction> component1() {
            return this.steps;
        }

        public final boolean component2() {
            return this.hasEarlierSteps;
        }

        public final boolean component3() {
            return this.isLoading;
        }

        public final boolean component4() {
            return this.isLoadingEarlier;
        }

        public final boolean component5() {
            return this.loadFailed;
        }

        public final boolean component6() {
            return this.loadEarlierFailed;
        }

        public final boolean getHasEarlierSteps() {
            return this.hasEarlierSteps;
        }

        public final boolean getLoadEarlierFailed() {
            return this.loadEarlierFailed;
        }

        public final boolean getLoadFailed() {
            return this.loadFailed;
        }

        public final AHD<ActivityGoalAction> getSteps() {
            return this.steps;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.steps), this.hasEarlierSteps), this.isLoading), this.isLoadingEarlier), this.loadFailed), this.loadEarlierFailed);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isLoadingEarlier() {
            return this.isLoadingEarlier;
        }

        public String toString() {
            return super.toString();
        }

        public StepsUiState(AHD<ActivityGoalAction> ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C7384Etj.A0Y(ahd, 0);
            this.steps = ahd;
            this.hasEarlierSteps = z;
            this.isLoading = z2;
            this.isLoadingEarlier = z3;
            this.loadFailed = z4;
            this.loadEarlierFailed = z5;
        }

        public /* synthetic */ StepsUiState(AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C06H c06h) {
            this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), AnonymousClass005.A1P(i, z3), AnonymousClass005.A1Q(i, z4), AnonymousClass002.A1R(i, z5));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2", f = "GoalStepsViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2$1", f = "GoalStepsViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ GoalStepsViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2$1$1", f = "GoalStepsViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03991 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Unit>, Object> {
                public int label;
                public final /* synthetic */ GoalStepsViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03991(GoalStepsViewModel goalStepsViewModel, HtJ<? super C03991> htJ) {
                    super(2, htJ);
                    this.this$0 = goalStepsViewModel;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C03991(this.this$0, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        GoalStepsViewModel goalStepsViewModel = this.this$0;
                        this.label = 1;
                        if (goalStepsViewModel.loadNewestPage(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Unit> htJ) {
                    return invoke(AnonymousClass001.A0F(num), htJ);
                }

                public final Object invoke(int i, HtJ<? super Unit> htJ) {
                    return new C03991(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GoalStepsViewModel goalStepsViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = goalStepsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    GoalStepsViewModel goalStepsViewModel = this.this$0;
                    BLG<Integer> blg = goalStepsViewModel.newestPageRequests;
                    C03991 c03991 = new C03991(goalStepsViewModel, null);
                    C7384Etj.A0Z(blg, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (C3pU.A00(this, c03991, blg) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$followGoalUpdates$2$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ GoalStepsViewModel $tmp0;

            public AnonymousClass3(GoalStepsViewModel goalStepsViewModel) {
                this.$tmp0 = goalStepsViewModel;
            }

            public final Object emit(ActivityGoalUpdate activityGoalUpdate, HtJ<? super Unit> htJ) {
                this.$tmp0.onGoalUpdate(activityGoalUpdate);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, GoalStepsViewModel.class, "onGoalUpdate", "onGoalUpdate(Lcom/facebook/aura/status/repo/ActivityGoalUpdate;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.onGoalUpdate((ActivityGoalUpdate) obj);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = GoalStepsViewModel.this.new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass001.A1J(new AnonymousClass1(GoalStepsViewModel.this, null), c3ux);
                GoalStepsViewModel goalStepsViewModel = GoalStepsViewModel.this;
                GoalStepsViewModel$followGoalUpdates$2$invokeSuspend$$inlined$filter$1 goalStepsViewModel$followGoalUpdates$2$invokeSuspend$$inlined$filter$1 = new GoalStepsViewModel$followGoalUpdates$2$invokeSuspend$$inlined$filter$1(goalStepsViewModel.dataSource.goalUpdates, goalStepsViewModel);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(goalStepsViewModel);
                this.L$0 = null;
                this.label = 1;
                if (goalStepsViewModel$followGoalUpdates$2$invokeSuspend$$inlined$filter$1.collect(anonymousClass3, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadEarlierSteps$2", f = "GoalStepsViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadEarlierSteps$2, reason: invalid class name and case insensitive filesystem */
    public final class C140992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140992(String str, HtJ<? super C140992> htJ) {
            super(2, htJ);
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalStepsViewModel.this.new C140992(this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            StepsUiState value;
            StepsUiState stepsUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GoalStepsViewModel goalStepsViewModel = GoalStepsViewModel.this;
                ActivityDataSource activityDataSource = goalStepsViewModel.dataSource;
                String str = goalStepsViewModel.goalId;
                String str2 = this.$cursor;
                this.label = 1;
                obj = activityDataSource.loadGoalActions(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ActivityGoalActionsResult activityGoalActionsResult = (ActivityGoalActionsResult) obj;
            if (activityGoalActionsResult instanceof ActivityGoalActionsResult.Loaded) {
                GoalStepsViewModel goalStepsViewModel2 = GoalStepsViewModel.this;
                ActivityGoalActionsResult.Loaded loaded = (ActivityGoalActionsResult.Loaded) activityGoalActionsResult;
                goalStepsViewModel2.earlierSteps = AbstractC0878AGe.A0P(goalStepsViewModel2.earlierSteps, loaded.page.actions);
                GoalStepsViewModel goalStepsViewModel3 = GoalStepsViewModel.this;
                goalStepsViewModel3.earlierCursor = loaded.page.nextCursor;
                goalStepsViewModel3.hasLoadedEarlierPage = true;
            } else if (C7384Etj.areEqual(activityGoalActionsResult, ActivityGoalActionsResult.CursorExpired.INSTANCE)) {
                GoalStepsViewModel goalStepsViewModel4 = GoalStepsViewModel.this;
                goalStepsViewModel4.resetEarlierPages();
                goalStepsViewModel4.refresh();
            } else if (!C7384Etj.areEqual(activityGoalActionsResult, ActivityGoalActionsResult.Failed.INSTANCE)) {
                throw C3cG.A0q();
            }
            GoalStepsViewModel goalStepsViewModel5 = GoalStepsViewModel.this;
            BLG<StepsUiState> blg = goalStepsViewModel5._steps;
            do {
                value = blg.getValue();
                stepsUiState = value;
            } while (!blg.A6e(value, stepsUiState.copy(goalStepsViewModel5.mergedSteps(), goalStepsViewModel5.hasEarlierSteps(), stepsUiState.isLoading, false, stepsUiState.loadFailed, C7384Etj.areEqual(activityGoalActionsResult, ActivityGoalActionsResult.Failed.INSTANCE))));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C140992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.GoalStepsViewModel", f = "GoalStepsViewModel.kt", l = {157}, m = "loadNewestPage", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadNewestPage$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoalStepsViewModel.this.loadNewestPage(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadReportChunk$2", f = "GoalStepsViewModel.kt", l = {HatchMessageShareDocumentRenderer.CONTENT_TOP_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadReportChunk$2, reason: invalid class name and case insensitive filesystem */
    public final class C141002 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $actionId;
        public final /* synthetic */ boolean $append;
        public final /* synthetic */ long $offset;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141002(String str, long j, boolean z, HtJ<? super C141002> htJ) {
            super(2, htJ);
            this.$actionId = str;
            this.$offset = j;
            this.$append = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalStepsViewModel.this.new C141002(this.$actionId, this.$offset, this.$append, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ReportUiState value;
            ReportUiState reportUiState;
            ReportUiState value2;
            ReportUiState reportUiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GoalStepsViewModel goalStepsViewModel = GoalStepsViewModel.this;
                ActivityDataSource activityDataSource = goalStepsViewModel.dataSource;
                String str = goalStepsViewModel.goalId;
                String str2 = this.$actionId;
                long j = this.$offset;
                this.label = 1;
                obj = activityDataSource.loadGoalActionReport(str, str2, j, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ActivityGoalActionReportChunk activityGoalActionReportChunk = (ActivityGoalActionReportChunk) obj;
            GoalStepsViewModel goalStepsViewModel2 = GoalStepsViewModel.this;
            if (activityGoalActionReportChunk == null) {
                BLG<ReportUiState> blg = goalStepsViewModel2._report;
                do {
                    value2 = blg.getValue();
                    reportUiState2 = value2;
                } while (!blg.A6e(value2, reportUiState2.copy(reportUiState2.actionId, reportUiState2.text, reportUiState2.hasMore, false, true)));
            } else {
                goalStepsViewModel2.reportNextOffset = activityGoalActionReportChunk.nextOffset;
                BLG<ReportUiState> blg2 = goalStepsViewModel2._report;
                boolean z = this.$append;
                do {
                    value = blg2.getValue();
                    reportUiState = value;
                } while (!blg2.A6e(value, reportUiState.copy(reportUiState.actionId, z ? FGI.A0M(reportUiState.text, activityGoalActionReportChunk.text) : activityGoalActionReportChunk.text, AnonymousClass002.A1X(activityGoalActionReportChunk.nextOffset), false, reportUiState.loadFailed)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C141002) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public GoalStepsViewModel(ActivityDataSource activityDataSource, String str, List<ActivityGoalAction> list) {
        boolean zA1Z = AnonymousClass005.A1Z(activityDataSource, str, list);
        this.dataSource = activityDataSource;
        this.goalId = str;
        C9286GCn c9286GCnA14 = C3cG.A14(new StepsUiState(AGI.A07(list), false, zA1Z, false, false, false));
        this._steps = c9286GCnA14;
        this.steps = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(new ReportUiState(null, "", false, false, false));
        this._report = c9286GCnA142;
        this.report = C3cG.A11(c9286GCnA142);
        this.newestPageRequests = C3cG.A14(0);
        this.newestSteps = list;
        this.earlierSteps = C0881AGi.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadNewestPage(X.HtJ<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            r4 = r15
            boolean r0 = r15 instanceof com.facebook.aura.status.viewmodel.GoalStepsViewModel.AnonymousClass1
            r1 = r14
            if (r0 == 0) goto La6
            r5 = r4
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadNewestPage$1 r5 = (com.facebook.aura.status.viewmodel.GoalStepsViewModel.AnonymousClass1) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto La6
            int r3 = r3 - r2
            r5.label = r3
        L14:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L79
            if (r0 != r8) goto Lad
            X.Hwg.A00(r2)
        L23:
            boolean r0 = r2 instanceof com.facebook.aura.status.repo.ActivityGoalActionsResult.Loaded
            if (r0 == 0) goto L5c
            com.facebook.aura.status.repo.ActivityGoalActionsResult$Loaded r2 = (com.facebook.aura.status.repo.ActivityGoalActionsResult.Loaded) r2
            if (r2 == 0) goto L5c
            com.facebook.aura.status.repo.ActivityGoalActionsPage r2 = r2.page
            if (r2 == 0) goto L5c
            java.util.List<com.facebook.aura.status.repo.ActivityGoalAction> r0 = r2.actions
            r1.newestSteps = r0
            java.lang.String r0 = r2.nextCursor
            r1.newestCursor = r0
            X.BLG<com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState> r3 = r1._steps
        L39:
            java.lang.Object r2 = r3.getValue()
            r4 = r2
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState r4 = (com.facebook.aura.status.viewmodel.GoalStepsViewModel.StepsUiState) r4
            X.AHD r5 = r1.mergedSteps()
            boolean r6 = r1.hasEarlierSteps()
            r7 = 0
            boolean r8 = r4.isLoadingEarlier
            boolean r9 = r4.loadFailed
            boolean r10 = r4.loadEarlierFailed
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState r0 = r4.copy(r5, r6, r7, r8, r9, r10)
            boolean r0 = r3.A6e(r2, r0)
            if (r0 == 0) goto L39
        L59:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L5c:
            X.BLG<com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState> r2 = r1._steps
        L5e:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState r3 = (com.facebook.aura.status.viewmodel.GoalStepsViewModel.StepsUiState) r3
            r6 = 0
            X.AHD<com.facebook.aura.status.repo.ActivityGoalAction> r4 = r3.steps
            boolean r5 = r3.hasEarlierSteps
            boolean r7 = r3.isLoadingEarlier
            boolean r9 = r3.loadEarlierFailed
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState r0 = r3.copy(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L5e
            goto L59
        L79:
            X.Hwg.A00(r2)
            X.BLG<com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState> r6 = r14._steps
        L7e:
            java.lang.Object r2 = r6.getValue()
            r9 = r2
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState r9 = (com.facebook.aura.status.viewmodel.GoalStepsViewModel.StepsUiState) r9
            X.AHD<com.facebook.aura.status.repo.ActivityGoalAction> r10 = r9.steps
            boolean r11 = r9.hasEarlierSteps
            boolean r13 = r9.isLoadingEarlier
            boolean r15 = r9.loadEarlierFailed
            r14 = 0
            r12 = r8
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$StepsUiState r0 = r9.copy(r10, r11, r12, r13, r14, r15)
            boolean r0 = r6.A6e(r2, r0)
            if (r0 == 0) goto L7e
            com.facebook.aura.status.repo.ActivityDataSource r2 = r1.dataSource
            java.lang.String r0 = r1.goalId
            r5.label = r8
            java.lang.Object r2 = r2.loadGoalActions(r0, r3, r5)
            if (r2 != r4) goto L23
            return r4
        La6:
            com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadNewestPage$1 r5 = new com.facebook.aura.status.viewmodel.GoalStepsViewModel$loadNewestPage$1
            r5.<init>(r15)
            goto L14
        Lad:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.GoalStepsViewModel.loadNewestPage(X.HtJ):java.lang.Object");
    }

    private final void loadReportChunk(String str, long j, boolean z) {
        ReportUiState value;
        ReportUiState reportUiState;
        AnonymousClass002.A1K(this.reportJob);
        BLG<ReportUiState> blg = this._report;
        do {
            value = blg.getValue();
            reportUiState = value;
        } while (!blg.A6e(value, reportUiState.copy(reportUiState.actionId, reportUiState.text, reportUiState.hasMore, true, false)));
        this.reportJob = AnonymousClass001.A11(new C141002(str, j, z, null), AEu.A00(this));
    }

    private final void reloadReport(String str) {
        this.reportNextOffset = null;
        AnonymousClass001.A1E(this._report, null, new ReportUiState(str, "", false, false, false));
        loadReportChunk(str, 0L, false);
    }

    public final void openReport(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this._report.getValue().actionId)) {
            return;
        }
        reloadReport(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasEarlierSteps() {
        return (this.hasLoadedEarlierPage ? this.earlierCursor : this.newestCursor) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AHD<ActivityGoalAction> mergedSteps() {
        Long lValueOf;
        List<ActivityGoalAction> list = this.newestSteps;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<ActivityGoalAction> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().id;
            if (str != null) {
                linkedHashSetA0k.add(str);
            }
        }
        Iterator<ActivityGoalAction> it2 = this.newestSteps.iterator();
        if (it2.hasNext()) {
            Long l = it2.next().actionIndex;
            lValueOf = Long.valueOf(l != null ? l.longValue() : Long.MIN_VALUE);
            while (it2.hasNext()) {
                Long l2 = it2.next().actionIndex;
                Long lValueOf2 = Long.valueOf(l2 != null ? l2.longValue() : Long.MIN_VALUE);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        List<ActivityGoalAction> list2 = this.earlierSteps;
        ArrayList arrayListA0h = C3cG.A0h();
        for (ActivityGoalAction activityGoalAction : list2) {
            ActivityGoalAction activityGoalAction2 = activityGoalAction;
            if (!AbstractC0878AGe.A0k(linkedHashSetA0k, activityGoalAction2.id)) {
                if (lValueOf != null) {
                    Long l3 = activityGoalAction2.actionIndex;
                    if ((l3 != null ? l3.longValue() : Long.MIN_VALUE) <= lValueOf.longValue()) {
                    }
                }
                arrayListA0h.add(activityGoalAction);
            }
        }
        return AGI.A07(AbstractC0878AGe.A0P(this.newestSteps, arrayListA0h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGoalUpdate(ActivityGoalUpdate activityGoalUpdate) {
        Set<String> set = activityGoalUpdate.changedActionIds;
        if (set == null) {
            resetEarlierPages();
            break;
        }
        List<ActivityGoalAction> list = this.earlierSteps;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<ActivityGoalAction> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC0878AGe.A0k(set, it.next().id)) {
                    resetEarlierPages();
                    break;
                }
            }
        }
        refresh();
        String str = this._report.getValue().actionId;
        if (str != null) {
            if (set == null || set.contains(str)) {
                reloadReport(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetEarlierPages() {
        this.earlierSteps = C0881AGi.A00;
        this.earlierCursor = null;
        this.hasLoadedEarlierPage = false;
    }

    public final void closeReport() {
        HoC hoC = this.reportJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.reportNextOffset = null;
        AnonymousClass001.A1E(this._report, null, new ReportUiState(null, "", false, false, false));
    }

    public final C1BN<ReportUiState> getReport() {
        return this.report;
    }

    public final C1BN<StepsUiState> getSteps() {
        return this.steps;
    }

    public final void loadEarlierSteps() {
        StepsUiState value;
        StepsUiState stepsUiState;
        String str = this.hasLoadedEarlierPage ? this.earlierCursor : this.newestCursor;
        if (str == null || this._steps.getValue().isLoadingEarlier) {
            return;
        }
        BLG<StepsUiState> blg = this._steps;
        do {
            value = blg.getValue();
            stepsUiState = value;
        } while (!blg.A6e(value, stepsUiState.copy(stepsUiState.steps, stepsUiState.hasEarlierSteps, stepsUiState.isLoading, true, stepsUiState.loadFailed, false)));
        AnonymousClass001.A1J(new C140992(str, null), AEu.A00(this));
    }

    public final void loadMoreReport() {
        Long l;
        ReportUiState value = this._report.getValue();
        String str = value.actionId;
        if (str == null || (l = this.reportNextOffset) == null) {
            return;
        }
        long jLongValue = l.longValue();
        if (value.isLoading) {
            return;
        }
        loadReportChunk(str, jLongValue, true);
    }

    public final void refresh() {
        while (!C3cJ.A11(this.newestPageRequests)) {
        }
    }

    public final void retryReport() {
        ReportUiState value = this._report.getValue();
        String str = value.actionId;
        if (str != null) {
            if (value.text.length() == 0) {
                reloadReport(str);
            } else {
                loadMoreReport();
            }
        }
    }

    public final Object followGoalUpdates(HtJ<? super Unit> htJ) {
        resetEarlierPages();
        return C3cG.A0U(Hxb.A00(new AnonymousClass2(null), htJ));
    }
}
