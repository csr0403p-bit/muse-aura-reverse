package com.facebook.aura.library.view;

import X.AHD;
import X.AHG;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1DG;
import X.C1YD;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.library.model.CompletedGoalsSection;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class GoalsCompletedScreenKt {
    public static final float LoadMoreFooterHeight = 56.0f;

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ boolean $pending;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Goal goal, G0U<? super Boolean, Boolean> g0u, boolean z) {
            super(2);
            this.$goal = goal;
            this.$onToggleComplete = g0u;
            this.$pending = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                Goal goal = this.$goal;
                boolean zIsCompleted = goal.isCompleted();
                G0U<Boolean, Boolean> g0u = this.$onToggleComplete;
                String str = goal.title;
                if (str == null) {
                    str = "";
                }
                GoalCheckboxKt.GoalCheckbox(zIsCompleted, g0u, str, null, this.$pending, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
        public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Function0<Unit> $openMenu;
        public final /* synthetic */ boolean $pending;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Goal goal, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, boolean z, int i, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(2);
            this.$goal = goal;
            this.$openMenu = function0;
            this.$onToggleComplete = g0u;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$pending = z;
            this.$absolutePosition = i;
            this.$menuExpanded$delegate = mutableState;
            this.$menuGoalCompleted$delegate = mutableState2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                Goal goal = this.$goal;
                boolean zA0A = MutableState.A0A((MutableState) this.$menuExpanded$delegate);
                boolean zA0A2 = MutableState.A0A((MutableState) this.$menuGoalCompleted$delegate);
                HatchScreen hatchScreen = HatchScreen.GOALS_COMPLETED;
                Function0<Unit> function0 = this.$openMenu;
                MutableState<Boolean> mutableState = this.$menuExpanded$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new GoalsCompletedScreenKt$CompletedGoalRow$3$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                GoalRowOverflowMenuKt.GoalRowOverflowMenu(goal, zA0A, zA0A2, hatchScreen, function0, (Function0) objAaT, this.$onToggleComplete, this.$onDeleteGoal, this.$onRenameGoal, false, null, this.$pending, false, Integer.valueOf(this.$absolutePosition), null, bfm, 199680, 0, 22016);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenDetail;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ boolean $pending;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Goal goal, int i, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, boolean z, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, int i2, int i3) {
            super(2);
            this.$goal = goal;
            this.$absolutePosition = i;
            this.$onOpenDetail = function0;
            this.$onToggleComplete = g0u;
            this.$pending = z;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalsCompletedScreenKt.CompletedGoalRow(this.$goal, this.$absolutePosition, this.$onOpenDetail, this.$onToggleComplete, this.$pending, this.$onDeleteGoal, this.$onRenameGoal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalsMonthHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C123622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123622(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalsCompletedScreenKt.CompletedGoalsMonthHeader(this.$label, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalsTitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C123632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123632(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalsCompletedScreenKt.CompletedGoalsTitle(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$GoalsCompletedScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C123643 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<CompletedGoalsSection> $completedSections;
        public final /* synthetic */ boolean $isInitialLoading;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<HatchGoalsTabViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123643(boolean z, AHD<CompletedGoalsSection> ahd, HatchGoalsTabViewModel hatchGoalsTabViewModel, AuraNavigator auraNavigator, C1BO<HatchGoalsTabViewModel.UiState> c1bo) {
            super(4);
            this.$isInitialLoading = z;
            this.$completedSections = ahd;
            this.$viewModel = hatchGoalsTabViewModel;
            this.$navigator = auraNavigator;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1156invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1156invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$isInitialLoading) {
                bfm.AgE(-951704741);
                GoalsCompletedScreenKt.m1153CompletedGoalsPlaceholderAjpBEmI(f, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a72), ComposableSingletons$GoalsCompletedScreenKt.f69lambda$1492621787, bfm, (iA04 & 14) | 3072, 2);
            } else if (this.$completedSections.isEmpty()) {
                bfm.AgE(-951696530);
                GoalsCompletedScreenKt.m1153CompletedGoalsPlaceholderAjpBEmI(f, null, null, ComposableSingletons$GoalsCompletedScreenKt.f70lambda$1661463012, bfm, (iA04 & 14) | 3072, 6);
            } else {
                bfm.AgE(-951685684);
                AHD<CompletedGoalsSection> ahd = this.$completedSections;
                boolean z = C3cH.A0O(this.$uiState$delegate).completedHasNextPage;
                boolean z2 = C3cH.A0O(this.$uiState$delegate).isLoadingMoreCompleted;
                HatchGoalsTabViewModel hatchGoalsTabViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(hatchGoalsTabViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new GoalsCompletedScreenKt$GoalsCompletedScreen$3$1$1(hatchGoalsTabViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                boolean zA672 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new GoalsCompletedScreenKt$GoalsCompletedScreen$3$2$1(auraNavigator);
                    bfm.Ai0(objAaT2);
                }
                G0V g0v = (G0V) objAaT2;
                HatchGoalsTabViewModel hatchGoalsTabViewModel2 = this.$viewModel;
                boolean zA673 = bfm.A67(hatchGoalsTabViewModel2);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new GoalsCompletedScreenKt$GoalsCompletedScreen$3$3$1(hatchGoalsTabViewModel2);
                    bfm.Ai0(objAaT3);
                }
                G0V g0v2 = (G0V) ((InterfaceC7353EnQ) objAaT3);
                AHG<String> ahg = C3cH.A0O(this.$uiState$delegate).pendingCompletionIds;
                HatchGoalsTabViewModel hatchGoalsTabViewModel3 = this.$viewModel;
                boolean zA674 = bfm.A67(hatchGoalsTabViewModel3);
                Object objAaT4 = bfm.AaT();
                if (zA674 || objAaT4 == C78N.A00) {
                    objAaT4 = new GoalsCompletedScreenKt$GoalsCompletedScreen$3$4$1(hatchGoalsTabViewModel3);
                    bfm.Ai0(objAaT4);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT4);
                HatchGoalsTabViewModel hatchGoalsTabViewModel4 = this.$viewModel;
                boolean zA675 = bfm.A67(hatchGoalsTabViewModel4);
                Object objAaT5 = bfm.AaT();
                if (zA675 || objAaT5 == C78N.A00) {
                    objAaT5 = new GoalsCompletedScreenKt$GoalsCompletedScreen$3$5$1(hatchGoalsTabViewModel4);
                    bfm.Ai0(objAaT5);
                }
                int i2 = iA04 << 3;
                GoalsCompletedScreenKt.m1152CompletedGoalsListH2JDbgA(ahd, f, f2, z, z2, function0, g0v, g0v2, ahg, g0u, (G0W) ((InterfaceC7353EnQ) objAaT5), null, bfm, (i2 & 896) | CompletedGoalsSection.$stable | (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0, 2048);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$GoalsCompletedScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C123654 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123654(BRg bRg, HatchGoalsTabViewModel hatchGoalsTabViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = hatchGoalsTabViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalsCompletedScreenKt.GoalsCompletedScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CompletedGoalRow(Goal goal, int i, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, boolean z, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-679022763);
        int iA0T = (i2 & 6) == 0 ? AnonymousClass004.A0T(bfm, goal) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0T |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i2 & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i2) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if ((1572864 & i2) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, g0w);
        }
        int i4 = i3 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA0T |= iA0k;
        } else if ((12582912 & i2) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0T |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0T, 4793490), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0S(bfm, goal.isCompleted());
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            boolean zA67 = bfm.A67(goal);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new GoalsCompletedScreenKt$CompletedGoalRow$openMenu$1$1(goal, mutableState2, mutableState);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            String str = goal.title;
            if (str == null) {
                str = "";
            }
            C1YD c1ydA0A = C3cG.A0A(0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704);
            boolean zA1N = AnonymousClass003.A1N(bfm, c0dxA0T, function02);
            Object objAaT4 = bfm.AaT();
            if (zA1N || objAaT4 == obj) {
                objAaT4 = new GoalsCompletedScreenKt$CompletedGoalRow$1$1(c0dxA0T, function02);
                bfm.Ai0(objAaT4);
            }
            GoalListItemRowKt.GoalListItemRow(str, C0v5.A03(bRg2, c1ydA0A, strA01, (Function0) objAaT4, function0, true), null, false, false, null, null, B1V.A00(bfm, new AnonymousClass2(goal, g0u, z), 1178990265), B1V.A00(bfm, new AnonymousClass3(goal, function02, g0u, g0u2, g0w, z, i, mutableState, mutableState2), 195996888), bfm, 113249280, 116);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(goal, i, function0, g0u, z, g0u2, g0w, bRg2, i2, i3);
        }
    }

    public static final void CompletedGoalsMonthHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-553732929);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24));
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA05 = C3cI.A05(bfm, bRg2, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = GoalsCompletedScreenKt$CompletedGoalsMonthHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA05, objAaT, false), jA06, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123622(str, bRg2, i, i2);
        }
    }

    /* renamed from: CompletedGoalsPlaceholder-AjpBEmI, reason: not valid java name */
    public static final void m1153CompletedGoalsPlaceholderAjpBEmI(float f, BRg bRg, String str, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str2 = str;
        bfm.AgG(-1790129290);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 1171, 1170), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str2 = null;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, BRg.A00, f);
            CompletedGoalsTitle(null, bfm, 0, 1);
            BRg bRgAiP = c90l.AiP(C10G.A02, 1.0f, true);
            boolean zA1K = AnonymousClass004.A1K(iA04);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new GoalsCompletedScreenKt$CompletedGoalsPlaceholder$1$1$1(str2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgAiP, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass003.A13(bfm, g0v, iA04 >> 9);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new GoalsCompletedScreenKt$CompletedGoalsPlaceholder$2(f, bRg2, str2, g0v, i, i2);
        }
    }

    public static final void CompletedGoalsTitle(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1083073239);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a73);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title2Medium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(28));
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0C = C3U4.A0C(bRg2, C3cG.A00(bfm, auraTheme), 0.0f, C3cG.A00(bfm, auraTheme), AuraDimensKt.SpacingXsmallPlusNano);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = GoalsCompletedScreenKt$CompletedGoalsTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA06, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123632(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalsCompletedScreen(X.BRg r43, com.facebook.aura.library.model.HatchGoalsTabViewModel r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalsCompletedScreenKt.GoalsCompletedScreen(X.BRg, com.facebook.aura.library.model.HatchGoalsTabViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* renamed from: CompletedGoalsList-H2JDbgA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1152CompletedGoalsListH2JDbgA(X.AHD<com.facebook.aura.library.model.CompletedGoalsSection> r30, float r31, float r32, boolean r33, boolean r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.G0V<? super com.facebook.aura.library.repo.Goal, ? super java.lang.Integer, kotlin.Unit> r36, X.G0V<? super java.lang.String, ? super java.lang.Boolean, java.lang.Boolean> r37, X.AHG<java.lang.String> r38, X.G0U<? super java.lang.String, kotlin.Unit> r39, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r40, X.BRg r41, X.BFM r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalsCompletedScreenKt.m1152CompletedGoalsListH2JDbgA(X.AHD, float, float, boolean, boolean, kotlin.jvm.functions.Function0, X.G0V, X.G0V, X.AHG, X.G0U, X.G0W, X.BRg, X.BFM, int, int, int):void");
    }
}
