package com.facebook.aura.library.view;

import X.AFs;
import X.AGI;
import X.AHD;
import X.AHG;
import X.AHH;
import X.AII;
import X.AIM;
import X.AIW;
import X.AKQ;
import X.ARL;
import X.AVy;
import X.AXN;
import X.AbstractC0871AFr;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHP;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0881AGi;
import X.C0924AIa;
import X.C0A8;
import X.C0CD;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11T;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C3UX;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchTabScreenKt;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.HeaderLeadingButton;
import com.facebook.aura.header.view.ScrimScrollConnectionKt;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.library.repo.GoalsState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.DraggedRowPosition;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.ReorderableColumnKt;
import com.facebook.aura.ui.ReorderableLazyListState;
import com.facebook.aura.ui.ReorderableListKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchGoalsTabScreenKt {
    public static final String ADD_GOAL_KEY = "add_goal_section";
    public static final String GOALS_HEADER_KEY = "user_goals_section_header";
    public static final String GOALS_SECTION_GOALS = "goals";
    public static final String GOALS_SECTION_TRACKING = "tracking";
    public static final int MAX_COLLAPSED_TOP_SECTION_ROWS = 4;
    public static final int MENU_ID_COMPLETED_GOALS = 4;
    public static final int MENU_ID_DIVIDER = 3;
    public static final int MENU_ID_DIVIDER_BELOW_SHOW_FIRST = 8;
    public static final int MENU_ID_DIVIDER_BELOW_SORT = 10;
    public static final int MENU_ID_HIDE_SUBTITLES = 2;
    public static final int MENU_ID_SHOW_FIRST_GOALS = 7;
    public static final int MENU_ID_SHOW_FIRST_LABEL = 5;
    public static final int MENU_ID_SHOW_FIRST_TRACKING = 6;
    public static final int MENU_ID_SHOW_SUBTITLES = 1;
    public static final int MENU_ID_SORT_AUTOMATICALLY = 9;
    public static final String TRACKING_HEADER_KEY = "tracking_section_header";
    public static final float LoadMoreFooterHeight = 56.0f;
    public static final AFs<AHG<String>, Object> expandedGoalIdsSaver = AbstractC0871AFr.A00(HatchGoalsTabScreenKt$expandedGoalIdsSaver$2.INSTANCE, HatchGoalsTabScreenKt$expandedGoalIdsSaver$1.INSTANCE);
    public static final float MENU_BELOW_HEADER_GAP = 8.0f;

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$AddGoalSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showDescription;
        public final /* synthetic */ boolean $showDivider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$showDivider = z;
            this.$showDescription = z2;
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
            HatchGoalsTabScreenKt.AddGoalSection(this.$showDivider, this.$showDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$CreateGoalHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C123682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123682(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$showDescription = z;
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
            HatchGoalsTabScreenKt.CreateGoalHeader(this.$showDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$ExpandCollapseCaret$2, reason: invalid class name and case insensitive filesystem */
    public final class C123692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123692(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isExpanded = z;
            this.$onToggle = function0;
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
            HatchGoalsTabScreenKt.ExpandCollapseCaret(this.$isExpanded, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalCategoryRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C123702 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123702(int i, String str, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$title = str;
            this.$onClick = function0;
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
            HatchGoalsTabScreenKt.GoalCategoryRow(this.$iconRes, this.$title, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ boolean $hasSubGoals;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Function0<Unit> $onToggleExpanded;
        public final /* synthetic */ boolean $pending;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, boolean z2, Goal goal, int i, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, boolean z3) {
            super(2);
            this.$hasSubGoals = z;
            this.$isExpanded = z2;
            this.$goal = goal;
            this.$absolutePosition = i;
            this.$onToggleExpanded = function0;
            this.$onToggleComplete = g0u;
            this.$pending = z3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (this.$hasSubGoals) {
                    bfm.AgE(-1958822513);
                    boolean z = this.$isExpanded;
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$onToggleExpanded, AnonymousClass001.A1a(AnonymousClass001.A1T(bfm, this.$goal, bfm.A66(z)), bfm, this.$absolutePosition));
                    boolean z2 = this.$isExpanded;
                    Goal goal = this.$goal;
                    int i2 = this.$absolutePosition;
                    Function0<Unit> function0 = this.$onToggleExpanded;
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new HatchGoalsTabScreenKt$GoalRow$1$1$1(z2, goal, i2, function0);
                        bfm.Ai0(objAaT);
                    }
                    HatchGoalsTabScreenKt.ExpandCollapseCaret(z, (Function0) objAaT, null, bfm, 0, 4);
                } else {
                    bfm.AgE(-1958328838);
                    boolean zIsCompleted = this.$goal.isCompleted();
                    boolean zA1a = AnonymousClass001.A1a(AnonymousClass001.A1T(bfm, this.$goal, bfm.A65(this.$onToggleComplete)), bfm, this.$absolutePosition);
                    G0U<Boolean, Boolean> g0u = this.$onToggleComplete;
                    Goal goal2 = this.$goal;
                    int i3 = this.$absolutePosition;
                    Object objAaT2 = bfm.AaT();
                    if (zA1a || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchGoalsTabScreenKt$GoalRow$1$2$1(g0u, goal2, i3);
                        bfm.Ai0(objAaT2);
                    }
                    G0U g0u2 = (G0U) objAaT2;
                    String str = this.$goal.title;
                    if (str == null) {
                        str = "";
                    }
                    GoalCheckboxKt.GoalCheckbox(zIsCompleted, g0u2, str, null, this.$pending, bfm, 0, 8);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C123712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ boolean $hasSubGoals;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ Function0<Unit> $onPickUp;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Function0<Unit> $onToggleExpanded;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ AHD<BHP> $reorderAccessibilityActions;
        public final /* synthetic */ boolean $showSubtitles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123712(Goal goal, int i, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, G0U<? super Boolean, Boolean> g0u2, boolean z4, Function0<Unit> function03, AHD<BHP> ahd, BRg bRg, int i2, int i3, int i4) {
            super(2);
            this.$goal = goal;
            this.$absolutePosition = i;
            this.$hasSubGoals = z;
            this.$isExpanded = z2;
            this.$showSubtitles = z3;
            this.$onOpenGoalDetail = function0;
            this.$onToggleExpanded = function02;
            this.$onDeleteGoal = g0u;
            this.$onRenameGoal = g0w;
            this.$onToggleComplete = g0u2;
            this.$pending = z4;
            this.$onPickUp = function03;
            this.$reorderAccessibilityActions = ahd;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGoalsTabScreenKt.GoalRow(this.$goal, this.$absolutePosition, this.$hasSubGoals, this.$isExpanded, this.$showSubtitles, this.$onOpenGoalDetail, this.$onToggleExpanded, this.$onDeleteGoal, this.$onRenameGoal, this.$onToggleComplete, this.$pending, this.$onPickUp, this.$reorderAccessibilityActions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalRowWithMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ boolean $isSubGoal;
        public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
        public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onPromoteToGoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Function0<Unit> $openMenu;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ boolean $replaceOverflowWithPendingIndicator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Goal goal, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, boolean z, boolean z2, boolean z3, int i, Function0<Unit> function02, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(2);
            this.$goal = goal;
            this.$openMenu = function0;
            this.$onToggleComplete = g0u;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$isSubGoal = z;
            this.$pending = z2;
            this.$replaceOverflowWithPendingIndicator = z3;
            this.$absolutePosition = i;
            this.$onPromoteToGoal = function02;
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
                MutableState<Boolean> mutableState = this.$menuExpanded$delegate;
                float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
                boolean zA0A = MutableState.A0A((MutableState) mutableState);
                boolean zA0A2 = MutableState.A0A((MutableState) this.$menuGoalCompleted$delegate);
                HatchScreen hatchScreen = HatchScreen.GOALS_HOME;
                Function0<Unit> function0 = this.$openMenu;
                MutableState<Boolean> mutableState2 = this.$menuExpanded$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new HatchGoalsTabScreenKt$GoalRowWithMenu$3$1$1(mutableState2);
                    bfm.Ai0(objAaT);
                }
                GoalRowOverflowMenuKt.GoalRowOverflowMenu(goal, zA0A, zA0A2, hatchScreen, function0, (Function0) objAaT, this.$onToggleComplete, this.$onDeleteGoal, this.$onRenameGoal, this.$isSubGoal, null, this.$pending, this.$replaceOverflowWithPendingIndicator, Integer.valueOf(this.$absolutePosition), this.$onPromoteToGoal, bfm, 199680, 0, 1024);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalRowWithMenu$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ boolean $handlesDragGesture;
        public final /* synthetic */ boolean $isSubGoal;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ Function0<Unit> $onPickUp;
        public final /* synthetic */ Function0<Unit> $onPromoteToGoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ String $parentGoalTitle;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ AHD<BHP> $reorderAccessibilityActions;
        public final /* synthetic */ boolean $replaceOverflowWithPendingIndicator;
        public final /* synthetic */ boolean $showSubtitle;
        public final /* synthetic */ String $subtitle;

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Goal goal, int i, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, boolean z2, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function02, AHD<BHP> ahd, boolean z3, BRg bRg, boolean z4, String str, C3TQ c3tq, boolean z5, String str2, Function0<Unit> function03, int i2, int i3, int i4) {
            super(2);
            this.$goal = goal;
            this.$absolutePosition = i;
            this.$showSubtitle = z;
            this.$leading = g0v;
            this.$onOpenGoalDetail = function0;
            this.$onToggleComplete = g0u;
            this.$pending = z2;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$onPickUp = function02;
            this.$reorderAccessibilityActions = ahd;
            this.$handlesDragGesture = z3;
            this.$modifier = bRg;
            this.$replaceOverflowWithPendingIndicator = z4;
            this.$subtitle = str;
            this.$contentPadding = c3tq;
            this.$isSubGoal = z5;
            this.$parentGoalTitle = str2;
            this.$onPromoteToGoal = function03;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGoalsTabScreenKt.GoalRowWithMenu(this.$goal, this.$absolutePosition, this.$showSubtitle, this.$leading, this.$onOpenGoalDetail, this.$onToggleComplete, this.$pending, this.$onDeleteGoal, this.$onRenameGoal, this.$onPickUp, this.$reorderAccessibilityActions, this.$handlesDragGesture, this.$modifier, this.$replaceOverflowWithPendingIndicator, this.$subtitle, this.$contentPadding, this.$isSubGoal, this.$parentGoalTitle, this.$onPromoteToGoal, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalWithSubGoals$2, reason: invalid class name and case insensitive filesystem */
    public final class C123722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $dragModifier;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ boolean $isDragging;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ Function0<Unit> $onPickUp;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Function0<Unit> $onToggleExpanded;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ GoalReorderActions $reorderActions;
        public final /* synthetic */ GoalListSection $section;
        public final /* synthetic */ boolean $showSubtitles;
        public final /* synthetic */ AHD<String> $siblingGoalIds;
        public final /* synthetic */ SubGoalDragOut $subGoalDragOut;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123722(Goal goal, int i, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, GoalReorderActions goalReorderActions, SubGoalDragOut subGoalDragOut, GoalListSection goalListSection, AHD<String> ahd, boolean z3, Function0<Unit> function03, BRg bRg, BRg bRg2, int i2, int i3, int i4) {
            super(2);
            this.$goal = goal;
            this.$absolutePosition = i;
            this.$isExpanded = z;
            this.$showSubtitles = z2;
            this.$onToggleExpanded = function0;
            this.$onOpenGoalDetail = function02;
            this.$onToggleComplete = g0v;
            this.$pendingCompletionIds = ahg;
            this.$onDeleteGoal = g0u;
            this.$onRenameGoal = g0w;
            this.$reorderActions = goalReorderActions;
            this.$subGoalDragOut = subGoalDragOut;
            this.$section = goalListSection;
            this.$siblingGoalIds = ahd;
            this.$isDragging = z3;
            this.$onPickUp = function03;
            this.$dragModifier = bRg;
            this.$modifier = bRg2;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGoalsTabScreenKt.GoalWithSubGoals(this.$goal, this.$absolutePosition, this.$isExpanded, this.$showSubtitles, this.$onToggleExpanded, this.$onOpenGoalDetail, this.$onToggleComplete, this.$pendingCompletionIds, this.$onDeleteGoal, this.$onRenameGoal, this.$reorderActions, this.$subGoalDragOut, this.$section, this.$siblingGoalIds, this.$isDragging, this.$onPickUp, this.$dragModifier, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalsLoadingMoreFooter$3, reason: invalid class name and case insensitive filesystem */
    public final class C123733 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $descriptionRes;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123733(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$descriptionRes = i;
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
            HatchGoalsTabScreenKt.GoalsLoadingMoreFooter(this.$descriptionRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalsOverflowMenu$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C123742 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHD<AuraContextMenuItem> $menuItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123742(AHD<AuraContextMenuItem> ahd) {
            super(2);
            this.$menuItems = ahd;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(1713988685);
            AHD<AuraContextMenuItem> ahd = this.$menuItems;
            AnonymousClass002.A19(bfm);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalsOverflowMenu$3, reason: invalid class name and case insensitive filesystem */
    public final class C123753 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenCompletedGoals;
        public final /* synthetic */ G0U<Boolean, Unit> $onSetShowGoalsFirst;
        public final /* synthetic */ G0U<Boolean, Unit> $onSetShowSubtitles;
        public final /* synthetic */ Function0<Unit> $onSortAutomatically;
        public final /* synthetic */ boolean $showGoalsFirst;
        public final /* synthetic */ boolean $showSortAutomatically;
        public final /* synthetic */ boolean $showSubtitles;
        public final /* synthetic */ boolean $showTrackingSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123753(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$expanded = z;
            this.$showSubtitles = z2;
            this.$showGoalsFirst = z3;
            this.$showTrackingSection = z4;
            this.$showSortAutomatically = z5;
            this.$onDismiss = function0;
            this.$onSetShowSubtitles = g0u;
            this.$onSetShowGoalsFirst = g0u2;
            this.$onSortAutomatically = function02;
            this.$onOpenCompletedGoals = function03;
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
            HatchGoalsTabScreenKt.GoalsOverflowMenu(this.$expanded, this.$showSubtitles, this.$showGoalsFirst, this.$showTrackingSection, this.$showSortAutomatically, this.$onDismiss, this.$onSetShowSubtitles, this.$onSetShowGoalsFirst, this.$onSortAutomatically, this.$onOpenCompletedGoals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalsPageHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C123761 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123761(BRg bRg, int i, int i2) {
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
            HatchGoalsTabScreenKt.GoalsPageHeader(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalsSectionDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C123771 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123771(BRg bRg, int i, int i2) {
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
            HatchGoalsTabScreenKt.GoalsSectionDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$HatchGoalsTabScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C123783 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123783(HatchGoalsTabViewModel hatchGoalsTabViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchGoalsTabViewModel;
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
            HatchGoalsTabScreenKt.HatchGoalsTabScreen(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$ShowMoreRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C123792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123792(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$isLoading = z;
            this.$onClick = function0;
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
            HatchGoalsTabScreenKt.ShowMoreRow(this.$text, this.$isLoading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$ShowMoreRow$4, reason: invalid class name and case insensitive filesystem */
    public final class C123804 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123804(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$isLoading = z;
            this.$onClick = function0;
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
            HatchGoalsTabScreenKt.ShowMoreRow(this.$text, this.$isLoading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$SubGoalList$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G2k<Goal, Boolean, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Goal $parentGoal;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ GoalReorderActions $reorderActions;
        public final /* synthetic */ GoalListSection $section;
        public final /* synthetic */ boolean $showSubtitles;
        public final /* synthetic */ AHD<String> $subGoalIds;

        public final void invoke(Goal goal, boolean z, BRg bRg, BFM bfm, int i) {
            int iA0C = AnonymousClass002.A0C(goal, bRg, 0);
            int iIndexOf = this.$subGoalIds.indexOf(goal.id);
            String str = this.$parentGoal.title;
            boolean zContains = this.$pendingCompletionIds.contains(goal.id);
            String str2 = goal.id;
            AHD<String> ahd = this.$subGoalIds;
            boolean zA1S = AnonymousClass004.A1S(bfm, this.$subGoalIds, goal, AnonymousClass001.A1T(bfm, this.$parentGoal, bfm.A65(this.$reorderActions)));
            GoalReorderActions goalReorderActions = this.$reorderActions;
            Goal goal2 = this.$parentGoal;
            AHD<String> ahd2 = this.$subGoalIds;
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HatchGoalsTabScreenKt$SubGoalList$6$1$1(goalReorderActions, goal2, ahd2, goal);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            boolean zA1H = AnonymousClass003.A1H(bfm, this.$section, AnonymousClass003.A1J(bfm, this.$reorderActions, goal));
            GoalReorderActions goalReorderActions2 = this.$reorderActions;
            GoalListSection goalListSection = this.$section;
            Object objAaT2 = bfm.AaT();
            if (zA1H || objAaT2 == C78N.A00) {
                objAaT2 = new HatchGoalsTabScreenKt$SubGoalList$6$2$1(goalReorderActions2, goal, goalListSection);
                bfm.Ai0(objAaT2);
            }
            AHD<BHP> ahdRememberReorderAccessibilityActions = HatchGoalsTabScreenKt.rememberReorderAccessibilityActions(str2, ahd, g0u, (Function0) objAaT2, bfm, 0);
            BRg bRgM2332reorderableItemElevation6a0pyJM = ReorderableColumnKt.m2332reorderableItemElevation6a0pyJM(bRg, z, 0.0f, bfm, ((i >> 6) & 14) | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), iA0C);
            boolean z2 = this.$showSubtitles;
            Function0<Unit> function0 = this.$onOpenGoalDetail;
            boolean zA1J = AnonymousClass003.A1J(bfm, this.$onToggleComplete, goal);
            G0V<String, Boolean, Boolean> g0v = this.$onToggleComplete;
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == C78N.A00) {
                objAaT3 = new HatchGoalsTabScreenKt$SubGoalList$6$3$1(g0v, goal);
                bfm.Ai0(objAaT3);
            }
            G0U g0u2 = (G0U) objAaT3;
            G0U<String, Unit> g0u3 = this.$onDeleteGoal;
            G0W<String, String, String, Unit> g0w = this.$onRenameGoal;
            boolean zA1H2 = AnonymousClass003.A1H(bfm, this.$section, AnonymousClass003.A1J(bfm, this.$reorderActions, goal));
            GoalReorderActions goalReorderActions3 = this.$reorderActions;
            GoalListSection goalListSection2 = this.$section;
            Object objAaT4 = bfm.AaT();
            if (zA1H2 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchGoalsTabScreenKt$SubGoalList$6$4$1(goalReorderActions3, goal, goalListSection2);
                bfm.Ai0(objAaT4);
            }
            HatchGoalsTabScreenKt.SubGoalRow(goal, iIndexOf, str, z2, function0, g0u2, zContains, g0u3, g0w, ahdRememberReorderAccessibilityActions, (Function0) objAaT4, bRgM2332reorderableItemElevation6a0pyJM, bfm, i & 14, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AHD<String> ahd, Goal goal, AHG<String> ahg, GoalReorderActions goalReorderActions, GoalListSection goalListSection, boolean z, Function0<Unit> function0, G0V<? super String, ? super Boolean, Boolean> g0v, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w) {
            super(5);
            this.$subGoalIds = ahd;
            this.$parentGoal = goal;
            this.$pendingCompletionIds = ahg;
            this.$reorderActions = goalReorderActions;
            this.$section = goalListSection;
            this.$showSubtitles = z;
            this.$onOpenGoalDetail = function0;
            this.$onToggleComplete = g0v;
            this.$onDeleteGoal = g0u;
            this.$onRenameGoal = g0w;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(Goal goal, Boolean bool, BRg bRg, BFM bfm, Integer num) {
            invoke(goal, AnonymousClass001.A1X(bool), bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$SubGoalList$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Goal $parentGoal;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ GoalReorderActions $reorderActions;
        public final /* synthetic */ GoalListSection $section;
        public final /* synthetic */ boolean $showSubtitles;
        public final /* synthetic */ SubGoalDragOut $subGoalDragOut;
        public final /* synthetic */ List<Goal> $subGoals;
        public final /* synthetic */ C07C $this_SubGoalList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(C07C c07c, Goal goal, List<Goal> list, boolean z, Function0<Unit> function0, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, GoalReorderActions goalReorderActions, SubGoalDragOut subGoalDragOut, GoalListSection goalListSection, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$this_SubGoalList = c07c;
            this.$parentGoal = goal;
            this.$subGoals = list;
            this.$showSubtitles = z;
            this.$onOpenGoalDetail = function0;
            this.$onToggleComplete = g0v;
            this.$pendingCompletionIds = ahg;
            this.$onDeleteGoal = g0u;
            this.$onRenameGoal = g0w;
            this.$reorderActions = goalReorderActions;
            this.$subGoalDragOut = subGoalDragOut;
            this.$section = goalListSection;
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
            HatchGoalsTabScreenKt.SubGoalList(this.$this_SubGoalList, this.$parentGoal, this.$subGoals, this.$showSubtitles, this.$onOpenGoalDetail, this.$onToggleComplete, this.$pendingCompletionIds, this.$onDeleteGoal, this.$onRenameGoal, this.$reorderActions, this.$subGoalDragOut, this.$section, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$SubGoalRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C123811 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ boolean $pending;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123811(Goal goal, G0U<? super Boolean, Boolean> g0u, int i, boolean z) {
            super(2);
            this.$goal = goal;
            this.$onToggleComplete = g0u;
            this.$absolutePosition = i;
            this.$pending = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zIsCompleted = this.$goal.isCompleted();
                boolean zA1a = AnonymousClass001.A1a(AnonymousClass001.A1T(bfm, this.$goal, bfm.A65(this.$onToggleComplete)), bfm, this.$absolutePosition);
                G0U<Boolean, Boolean> g0u = this.$onToggleComplete;
                Goal goal = this.$goal;
                int i2 = this.$absolutePosition;
                Object objAaT = bfm.AaT();
                if (zA1a || objAaT == C78N.A00) {
                    objAaT = new HatchGoalsTabScreenKt$SubGoalRow$1$1$1(g0u, goal, i2);
                    bfm.Ai0(objAaT);
                }
                G0U g0u2 = (G0U) objAaT;
                String str = this.$goal.title;
                if (str == null) {
                    str = "";
                }
                GoalCheckboxKt.GoalCheckbox(zIsCompleted, g0u2, str, null, this.$pending, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$SubGoalRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C123823 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ Function0<Unit> $onPromoteToGoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ String $parentGoalTitle;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ AHD<BHP> $reorderAccessibilityActions;
        public final /* synthetic */ boolean $showSubtitles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123823(Goal goal, int i, String str, boolean z, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, boolean z2, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, AHD<BHP> ahd, Function0<Unit> function02, BRg bRg, int i2, int i3, int i4) {
            super(2);
            this.$goal = goal;
            this.$absolutePosition = i;
            this.$parentGoalTitle = str;
            this.$showSubtitles = z;
            this.$onOpenGoalDetail = function0;
            this.$onToggleComplete = g0u;
            this.$pending = z2;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$reorderAccessibilityActions = ahd;
            this.$onPromoteToGoal = function02;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGoalsTabScreenKt.SubGoalRow(this.$goal, this.$absolutePosition, this.$parentGoalTitle, this.$showSubtitles, this.$onOpenGoalDetail, this.$onToggleComplete, this.$pending, this.$onDeleteGoal, this.$onRenameGoal, this.$reorderAccessibilityActions, this.$onPromoteToGoal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$TrackingSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C123832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $hasTrackingGoals;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showDivider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123832(boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$showDivider = z;
            this.$hasTrackingGoals = z2;
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
            HatchGoalsTabScreenKt.TrackingSectionHeader(this.$showDivider, this.$hasTrackingGoals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$UserGoalsSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C123842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showDivider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123842(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$showDivider = z;
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
            HatchGoalsTabScreenKt.UserGoalsSectionHeader(this.$showDivider, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$1, reason: invalid class name and case insensitive filesystem */
    public final class C123851 extends AbstractC7559F3s implements G2k<Object, String, GoalListSection, String, DraggedRowPosition, Boolean> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;
        public final /* synthetic */ SubGoalDragSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123851(ReorderableLazyListState reorderableLazyListState, SubGoalDragSource subGoalDragSource) {
            super(5);
            this.$reorderState = reorderableLazyListState;
            this.$source = subGoalDragSource;
        }

        @Override // X.G2k
        public final Boolean invoke(Object obj, String str, GoalListSection goalListSection, String str2, DraggedRowPosition draggedRowPosition) {
            AnonymousClass005.A17(obj, str, goalListSection, str2, draggedRowPosition);
            boolean zStartExternalDrag = this.$reorderState.startExternalDrag(str2, obj, draggedRowPosition.height, draggedRowPosition.restingTopFromGroupBottom);
            SubGoalDragSource subGoalDragSource = this.$source;
            if (zStartExternalDrag) {
                subGoalDragSource.parentGoalId = str;
                subGoalDragSource.section = goalListSection;
                subGoalDragSource.subGoalId = str2;
            } else {
                subGoalDragSource.clear();
            }
            return Boolean.valueOf(zStartExternalDrag);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$2, reason: invalid class name and case insensitive filesystem */
    public final class C123862 extends AbstractC7559F3s implements G0U<DraggedRowPosition, Unit> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;
        public final /* synthetic */ SubGoalDragSource $source;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DraggedRowPosition draggedRowPosition) {
            C7384Etj.A0Y(draggedRowPosition, 0);
            if (this.$reorderState.onExternalDrag(draggedRowPosition.offsetY)) {
                return;
            }
            this.$source.clear();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123862(ReorderableLazyListState reorderableLazyListState, SubGoalDragSource subGoalDragSource) {
            super(1);
            this.$reorderState = reorderableLazyListState;
            this.$source = subGoalDragSource;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(DraggedRowPosition draggedRowPosition) {
            invoke2(draggedRowPosition);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$3, reason: invalid class name and case insensitive filesystem */
    public final class C123873 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;
        public final /* synthetic */ SubGoalDragSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123873(ReorderableLazyListState reorderableLazyListState, SubGoalDragSource subGoalDragSource) {
            super(0);
            this.$reorderState = reorderableLazyListState;
            this.$source = subGoalDragSource;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean zEndExternalDrag = this.$reorderState.endExternalDrag();
            this.$source.clear();
            return Boolean.valueOf(zEndExternalDrag);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$4, reason: invalid class name and case insensitive filesystem */
    public final class C123884 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;
        public final /* synthetic */ SubGoalDragSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123884(ReorderableLazyListState reorderableLazyListState, SubGoalDragSource subGoalDragSource) {
            super(0);
            this.$reorderState = reorderableLazyListState;
            this.$source = subGoalDragSource;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$reorderState.abortExternalDrag();
            this.$source.clear();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Object> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ReorderableLazyListState reorderableLazyListState) {
            super(0);
            this.$reorderState = reorderableLazyListState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.$reorderState.getDraggingItemKey();
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$6, reason: invalid class name and case insensitive filesystem */
    public final class C123896 extends AbstractC7559F3s implements Function0<Float> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123896(ReorderableLazyListState reorderableLazyListState) {
            super(0);
            this.$reorderState = reorderableLazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.$reorderState.getExternalDragTranslationY());
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$createSubGoalDragOut$7, reason: invalid class name and case insensitive filesystem */
    public final class C123907 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ ReorderableLazyListState $reorderState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123907(ReorderableLazyListState reorderableLazyListState) {
            super(0);
            this.$reorderState = reorderableLazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AnonymousClass002.A1X(this.$reorderState.roomBeforeKey$delegate.getValue()));
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$roomSpacer$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C123911 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ReorderableLazyListState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123911(ReorderableLazyListState reorderableLazyListState) {
            super(3);
            this.$state = reorderableLazyListState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, C10G.A02, ((AXN) bfm.A6v(Am0.A04)).Agy(this.$state.getDraggingItemSize()));
                return;
            }
            bfm.Afo();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoalsTabSection.values().length];
            try {
                AnonymousClass002.A13(GoalsTabSection.GOALS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GoalsTabSection.TRACKING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AddGoalSection(boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2084815253);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(-998311303);
                AuraDividerKt.AuraDivider(C3U4.A06(c1062ATq, AuraDimensKt.SpacingXsmallPlusNano), AuraDividerStyle.Secondary.INSTANCE, false, bfm, 48, 4);
            } else {
                bfm.AgE(-998149855);
            }
            BBI.A0R(bbi, false);
            CreateGoalHeader(z2, null, bfm, (iA0n >> 3) & 14, 2);
            bfm.AgE(-586384855);
            for (GoalCategory goalCategory : GoalCategory.getEntries()) {
                int iconRes = goalCategory.getIconRes();
                String strA01 = AbstractC2271BQs.A01(bfm, goalCategory.getLabelRes());
                boolean zA1H = AnonymousClass003.A1H(bfm, goalCategory, bfm.A67(auraNavigatorA0b));
                Object objAaT = bfm.AaT();
                if (zA1H || objAaT == C78N.A00) {
                    objAaT = new HatchGoalsTabScreenKt$AddGoalSection$1$1$1$1(auraNavigatorA0b, goalCategory);
                    bfm.Ai0(objAaT);
                }
                GoalCategoryRow(iconRes, strA01, (Function0) objAaT, null, bfm, 0, 8);
            }
            BBI.A0R(bbi, false);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a99);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchGoalsTabScreenKt$AddGoalSection$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            GoalCategoryRow(R.drawable.circlecircle_outline_24_wght600, strA012, (Function0) objAaT2, null, bfm, 0, 8);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, z2, bRg2, i, i2);
        }
    }

    public static final void CreateGoalHeader(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1801441276);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA05 = C3cI.A05(bfm, bRgA0R, auraTheme);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA05);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a74), null, C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0D(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (z) {
                bfm.AgE(320141798);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a9c), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(320341872);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123682(z, bRg2, i, i2);
        }
    }

    public static final void ExpandCollapseCaret(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0s;
        BRg bRg2 = bRg;
        bfm.AgG(-10284724);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(bRg2, C3cG.A0A(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA02);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_down_filled_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long j = C3cH.A0W(bfm).tertiaryText;
            if (z) {
                bfm.AgE(-841599510);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120a70);
            } else {
                bfm.AgE(-841512276);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120a82);
            }
            AuraIconKt.m2567AuraIconFHprtrg(C11T.A00(BRg.A00, z ? 0.0f : -90.0f), aVyA00, auraIconSize, strA0s, j, null, bfm, AnonymousClass001.A03(), 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123692(z, function0, bRg2, i, i2);
        }
    }

    public static final boolean GoalCardList_cSuvA_I$isTopSection(boolean z, GoalsTabSection goalsTabSection, GoalsTabSection goalsTabSection2) {
        return z && goalsTabSection2 != goalsTabSection;
    }

    public static final GoalRootPlacement GoalCardList_cSuvA_I$sectionEndPlacement(AHD<Goal> ahd, AHD<Goal> ahd2, GoalListSection goalListSection, List<String> list) {
        if (goalListSection != GoalListSection.GOALS) {
            ahd = ahd2;
        }
        Goal goal = (Goal) AbstractC0878AGe.A0A(list.size(), ahd);
        return new GoalRootPlacement(goalListSection, goal != null ? goal.id : null);
    }

    public static final List<Goal> GoalCardList_cSuvA_I$visibleRows(boolean z, boolean z2, GoalsTabSection goalsTabSection, AHD<Goal> ahd, GoalsTabSection goalsTabSection2) {
        return (!z2 || goalsTabSection2 == goalsTabSection || z) ? ahd : AbstractC0878AGe.A0a(ahd, 4);
    }

    public static final void GoalCategoryRow(int i, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1308249087);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(bRgA04, C3cG.A00(bfm, auraTheme), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long jA05 = C3cH.A05(bfm, auraTheme);
            int i5 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, jA05, null, bfm, (i5 << 3) | 3456, 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, BRg.A00, true), C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24)), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0D >> 3), 6, 14832);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, (i5 << 3) | 3456, 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123702(i, str, function0, bRg2, i2, i3);
        }
    }

    /* renamed from: GoalSectionHeader-oC9nPe0, reason: not valid java name */
    public static final void m1165GoalSectionHeaderoC9nPe0(String str, long j, Function0<Unit> function0, String str2, BRg bRg, String str3, boolean z, BFM bfm, int i, int i2) {
        BS0 bs0A09;
        BRg bRg2;
        boolean z2;
        String str4;
        ARL arl;
        BRg bRg3 = bRg;
        String str5 = str3;
        boolean z3 = z;
        bfm.AgG(48363115);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg3);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str5);
            iA0d |= iA0i;
        }
        int i5 = i2 & 64;
        int iA0t = 1572864;
        if (i5 != 0) {
            iA0d |= iA0t;
        } else if ((1572864 & i) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z3);
            iA0d |= iA0t;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            String str6 = i4 == 0 ? str5 : null;
            if (i5 != 0) {
                z3 = true;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA05 = C3cI.A05(bfm, bRgA0R, auraTheme);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, str6 == null ? C2VU.A04 : C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA05);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (z3) {
                bfm.AgE(1824474526);
                GoalsDotPulsingIndicatorKt.m1157GoalsDotPulsingIndicator3JVO9M(j, null, bfm, (iA0d >> 3) & 14, 2);
            } else {
                bfm.AgE(1824525459);
            }
            BBI.A0R(bbi, false);
            if (str6 == null) {
                bRg2 = null;
                str4 = null;
                arl = null;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, C1822Arm.A00(null, C3cH.A0X(bfm, auraTheme, 1824564705).bodyEmphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24)), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0, 16370);
                BBI.A0R(bbi, false);
                bs0A09 = C3cG.A09(bfm, 1825225346);
                z2 = true;
                C01N.A07(bfm, c90m.AiP(bs0A09, 1.0f, true));
            } else {
                bs0A09 = C3cG.A09(bfm, 1824731826);
                bRg2 = null;
                z2 = true;
                BRg bRgAiP = c90m.AiP(bs0A09, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgAiP);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                str4 = null;
                arl = null;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, C1822Arm.A00(null, C3cH.A0D(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24)), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0, 16370);
                AuraTextKt.m2639AuraTextUY9GdpU(str6, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 15) & 14, 0, 16370);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
                bfm.AgE(1825364691);
            }
            BBI.A0R(bbi, false);
            BRg bRgA07 = C10G.A07(bs0A09, 24.0f);
            Alignment alignment = C2VU.A09;
            BRg bRgA052 = C0v5.A05(C10G.A06(C10G.A02(alignment, bRgA07, z2), 48.0f), str4, function0, z2);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA052);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA01, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0), AuraIconSize.X_SMALL, str2, C3cH.A05(bfm, auraTheme), arl, bfm, AnonymousClass001.A03() | (iA0d & 7168), 33);
            BBI.A0R(bbi, z2);
            BBI.A0R(bbi, z2);
            str5 = str6;
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchGoalsTabScreenKt$GoalSectionHeader$2(str, j, function0, str2, bRg3, str5, z3, i, i2);
        }
    }

    public static final void GoalsPageHeader(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(530239540);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a9d);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bRg2, C3cG.A00(bfm, auraTheme), 0.0f, C3cG.A00(bfm, auraTheme), AuraDimensKt.SpacingXsmallPlusNano), C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title2Medium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(28)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123761(bRg2, i, i2);
        }
    }

    public static final void HatchGoalsTabScreen(HatchGoalsTabViewModel hatchGoalsTabViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchGoalsTabViewModel, 0);
        bfm.AgG(-295782654);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchGoalsTabViewModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchGoalsTabViewModel.uiState);
            GoalsState goalsState = C3cH.A0O(c1boA02).goalsState;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            LazyListState lazyListStateRememberScrimBoundLazyListState = ScrimScrollConnectionKt.rememberScrimBoundLazyListState(0, 0, bfm, 0, 3);
            MutableState mutableState = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            Object[] objArr = {Boolean.valueOf(C3cH.A0O(c1boA02).showGoalsFirst)};
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchGoalsTabScreenKt$HatchGoalsTabScreen$isTopSectionExpanded$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            boolean zIsGoalsTrackingSectionEnabled = HatchUtil.INSTANCE.isGoalsTrackingSectionEnabled();
            Object[] objArr2 = new Object[0];
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchGoalsTabScreenKt$HatchGoalsTabScreen$returningFromGoalDetail$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA0N2 = AnonymousClass002.A0N(bfm, objAaT3, objArr2);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$onOpenGoalDetail$1$1(mutableStateA0N2);
                bfm.Ai0(objAaT4);
            }
            Function0 function0 = (Function0) objAaT4;
            int i4 = iA05 & 14;
            boolean z = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(hatchGoalsTabViewModel));
            Object objAaT5 = bfm.AaT();
            if (z || objAaT5 == obj) {
                objAaT5 = new GoalReorderActions(new HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$1(hatchGoalsTabViewModel), new HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$2(hatchGoalsTabViewModel), new HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$3(hatchGoalsTabViewModel), new HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$4(hatchGoalsTabViewModel), new HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$5(hatchGoalsTabViewModel));
                bfm.Ai0(objAaT5);
            }
            GoalReorderActions goalReorderActions = (GoalReorderActions) objAaT5;
            Unit unit = Unit.INSTANCE;
            boolean zA1K = AnonymousClass003.A1K(bfm, mutableStateA0N2, mutableStateA0N);
            Object objAaT6 = bfm.AaT();
            if (zA1K || objAaT6 == obj) {
                objAaT6 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$1$1(mutableStateA0N2, mutableStateA0N);
                bfm.Ai0(objAaT6);
            }
            C78e.A05(bfm, unit, (G0U) objAaT6);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            HatchGoalsTabScreenKey hatchGoalsTabScreenKey = HatchGoalsTabScreenKey.INSTANCE;
            HeaderLeadingButton headerLeadingButton = HeaderLeadingButton.SidePanel;
            AHH ahhA0E = AGI.A0E(HeaderButton.MoreOptions);
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$1$1(mutableState2, mutableState);
                bfm.Ai0(objAaT7);
            }
            G0U g0u = (G0U) objAaT7;
            boolean zA1N = AnonymousClass003.A1N(bfm, c3ux, lazyListStateRememberScrimBoundLazyListState);
            Object objAaT8 = bfm.AaT();
            if (zA1N || objAaT8 == obj) {
                objAaT8 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$2$1(c3ux, lazyListStateRememberScrimBoundLazyListState);
                bfm.Ai0(objAaT8);
            }
            boolean z2 = false;
            HatchTabScreenKt.m1022HatchTabScreenTsp2nRQ(hatchGoalsTabScreenKey, null, null, null, 0L, null, null, 0.0f, false, null, null, ahhA0E, g0u, null, null, headerLeadingButton, false, false, null, (Function0) objAaT8, null, null, false, false, false, false, 0.0f, null, B1V.A00(bfm, new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3(goalsState, mutableStateA0N, hatchGoalsTabViewModel, lazyListStateRememberScrimBoundLazyListState, zIsGoalsTrackingSectionEnabled, function0, goalReorderActions, c1boA02), -711003520), bfm, 6, 197040, 100663296, 267872254);
            BRg bRgA4C = c0z7.A4C(C2VU.A0D, BRg.A00);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean z3 = C3cH.A0O(c1boA02).showSubtitles;
            boolean z4 = C3cH.A0O(c1boA02).showGoalsFirst;
            boolean zA0A2 = MutableState.A0A(mutableState2);
            Object objAaT9 = bfm.AaT();
            if (objAaT9 == obj) {
                objAaT9 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$4$1(mutableState);
                bfm.Ai0(objAaT9);
            }
            Function0 function03 = (Function0) objAaT9;
            boolean z5 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchGoalsTabViewModel));
            Object objAaT10 = bfm.AaT();
            if (z5 || objAaT10 == obj) {
                objAaT10 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$5$1(hatchGoalsTabViewModel);
                bfm.Ai0(objAaT10);
            }
            G0U g0u2 = (G0U) objAaT10;
            boolean z6 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchGoalsTabViewModel));
            Object objAaT11 = bfm.AaT();
            if (z6 || objAaT11 == obj) {
                objAaT11 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$6$1(hatchGoalsTabViewModel);
                bfm.Ai0(objAaT11);
            }
            G0U g0u3 = (G0U) objAaT11;
            boolean zA1N2 = AnonymousClass003.A1N(bfm, c3ux, lazyListStateRememberScrimBoundLazyListState);
            if (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchGoalsTabViewModel))) {
                z2 = true;
            }
            boolean z7 = zA1N2 | z2;
            Object objAaT12 = bfm.AaT();
            if (z7 || objAaT12 == obj) {
                objAaT12 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$7$1(c3ux, hatchGoalsTabViewModel, lazyListStateRememberScrimBoundLazyListState);
                bfm.Ai0(objAaT12);
            }
            Function0 function04 = (Function0) objAaT12;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT13 = bfm.AaT();
            if (zA67 || objAaT13 == obj) {
                objAaT13 = new HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$8$1(auraNavigatorA0b);
                bfm.Ai0(objAaT13);
            }
            GoalsOverflowMenu(zA0A, z3, z4, zIsGoalsTrackingSectionEnabled, zA0A2, function03, g0u2, g0u3, function04, (Function0) objAaT13, bRgA4C, bfm, 196608, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123783(hatchGoalsTabViewModel, bRg2, i, i2);
        }
    }

    public static final void ShowMoreRow(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c123804;
        BRg bRg2 = bRg;
        bfm.AgG(-831881697);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(-626187241);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a86);
                BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchGoalsTabScreenKt$ShowMoreRow$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA06, objAaT, false), bfm, 0, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c123804 = new C123792(str, z, function0, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c123804);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -625837437);
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA05 = C3cI.A05(bfm, bRgA04, auraTheme);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            int iA02 = C3cG.A02(bbiA0M.A06);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA05);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA02);
            AuraIconKt.m2567AuraIconFHprtrg(C11T.A00(BRg.A00, -90.0f), BOf.A00(bfm, R.drawable.dot6_wght400_outline_24, 0), AuraIconSize.SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 32);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A05(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24)), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c123804 = new C123804(str, z, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c123804);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SubGoalList(X.C07C r53, com.facebook.aura.library.repo.Goal r54, java.util.List<com.facebook.aura.library.repo.Goal> r55, boolean r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, X.G0V<? super java.lang.String, ? super java.lang.Boolean, java.lang.Boolean> r58, X.AHG<java.lang.String> r59, X.G0U<? super java.lang.String, kotlin.Unit> r60, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r61, com.facebook.aura.library.view.GoalReorderActions r62, com.facebook.aura.library.view.SubGoalDragOut r63, com.facebook.aura.library.repo.GoalListSection r64, X.BRg r65, X.BFM r66, int r67, int r68, int r69) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.SubGoalList(X.07C, com.facebook.aura.library.repo.Goal, java.util.List, boolean, kotlin.jvm.functions.Function0, X.G0V, X.AHG, X.G0U, X.G0W, com.facebook.aura.library.view.GoalReorderActions, com.facebook.aura.library.view.SubGoalDragOut, com.facebook.aura.library.repo.GoalListSection, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void TrackingSectionHeader(boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(1227899357);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(-826596392);
                strA01 = null;
                GoalsSectionDivider(null, bfm, 0, 1);
                BBI.A0R(bbi, false);
            } else {
                strA01 = null;
                bfm.AgE(-826562757);
                BBI.A0R(bbi, false);
            }
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a94);
            long j = z2 ? C3cI.A0K(bfm, 1913004302).success : C3cI.A0K(bfm, 1913005266).primaryText;
            BBI.A0R(bbi, false);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a80);
            if (z2) {
                bfm.AgE(-826114311);
            } else {
                bfm.AgE(-826072957);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a93);
            }
            BBI.A0R(bbi, false);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGoalsTabScreenKt$TrackingSectionHeader$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            m1165GoalSectionHeaderoC9nPe0(strA012, j, (Function0) objAaT, strA013, null, strA01, z2, bfm, (iA0n << 15) & 3670016, 16);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123832(z, z2, bRg2, i, i2);
        }
    }

    public static final void UserGoalsSectionHeader(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(660223387);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(270492974);
                GoalsSectionDivider(null, bfm, 0, 1);
            } else {
                bfm.AgE(270526609);
            }
            BBI.A0R(bbi, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a90);
            long j = C3cH.A0W(bfm).accent;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGoalsTabScreenKt$UserGoalsSectionHeader$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            m1165GoalSectionHeaderoC9nPe0(strA01, j, (Function0) objAaT, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a7d), null, null, false, bfm, 0, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123842(z, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ Object access$rowKeyFor(String str) {
        return str;
    }

    public static final boolean canCrossSection(GoalListSection goalListSection, GoalListSection goalListSection2) {
        return goalListSection == goalListSection2 || HatchUtil.INSTANCE.isTrackingToGoalsDragEnabled();
    }

    public static final SubGoalDragOut createSubGoalDragOut(ReorderableLazyListState reorderableLazyListState, SubGoalDragSource subGoalDragSource) {
        return new SubGoalDragOut(new C123851(reorderableLazyListState, subGoalDragSource), new C123862(reorderableLazyListState, subGoalDragSource), new C123873(reorderableLazyListState, subGoalDragSource), new C123884(reorderableLazyListState, subGoalDragSource), new AnonymousClass5(reorderableLazyListState), new C123896(reorderableLazyListState), new C123907(reorderableLazyListState));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isApplied(com.facebook.aura.library.view.GoalDropOutcome r10, java.util.List<com.facebook.aura.library.repo.Goal> r11, java.util.List<com.facebook.aura.library.repo.Goal> r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.isApplied(com.facebook.aura.library.view.GoalDropOutcome, java.util.List, java.util.List):boolean");
    }

    public static final boolean isApplied$isAbsentFromChildren(List<Goal> list, List<Goal> list2, String str) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<Goal> it = list.iterator();
            while (it.hasNext()) {
                List list3 = it.next().subGoals;
                if (list3 == null) {
                    list3 = C0881AGi.A00;
                }
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (C7384Etj.areEqual(C3cI.A0c(it2), str)) {
                            return false;
                        }
                    }
                }
            }
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<Goal> it3 = list2.iterator();
        while (it3.hasNext()) {
            List list4 = it3.next().subGoals;
            if (list4 == null) {
                list4 = C0881AGi.A00;
            }
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    if (C7384Etj.areEqual(C3cI.A0c(it4), str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final List<Goal> isApplied$roots(List<Goal> list, List<Goal> list2, GoalListSection goalListSection) {
        return goalListSection == GoalListSection.GOALS ? list : list2;
    }

    public static final void logGoalRowLongPress(String str, Integer num) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.GOALS;
        HatchSubsurface hatchSubsurface = HatchSubsurface.GOALS;
        HatchScreen hatchScreen = HatchScreen.GOALS_HOME;
        HatchComponent hatchComponent = HatchComponent.GOAL_CARD;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.GOAL_ID, str, c0924AIaA0u);
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIaA0u, num.intValue());
        }
        hatchInteractionLogger.logLongPress(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIaA0u));
    }

    public static final void logSectionOrderOption(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.DOT_MENU, HatchScreen.GOALS_HOME, HatchComponent.GOAL_SECTION_ORDER_OPTION, null, AnonymousClass007.A0c(HatchMetadataKey.GOALS_SECTION, str), null);
    }

    public static final void logShowMoreClick(boolean z, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOALS_HOME, z ? HatchComponent.SEE_ALL_GOALS_BUTTON : HatchComponent.GOAL_LOAD_MORE_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.GOALS_SECTION, str), null);
    }

    public static final void logSubtitlesToggle(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.GOALS, HatchSubsurface.DOT_MENU, HatchScreen.GOALS_HOME, HatchComponent.GOAL_SUBTITLES_TOGGLE, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberGoalDetailClick(com.facebook.aura.library.repo.Goal r13, int r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, java.lang.String r16, X.BFM r17, int r18, int r19) {
        /*
            r0 = r19
            r1 = r16
            java.lang.String r12 = X.AnonymousClass006.A0u(r0, r1)
            r2 = r17
            com.facebook.aura.navigation.AuraNavigator r11 = X.AnonymousClass003.A0b(r2)
            r9 = r13
            java.lang.String r3 = r13.id
            java.lang.String r1 = r13.title
            java.lang.String r0 = r13.imageUrl
            boolean r6 = X.AnonymousClass005.A1R(r2, r3, r1, r0)
            r4 = r18
            r0 = r18 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r3 = 32
            r5 = 0
            r10 = r14
            if (r0 <= r3) goto L2b
            boolean r0 = r2.A63(r14)
            if (r0 != 0) goto L30
        L2b:
            r1 = r18 & 48
            r0 = 0
            if (r1 != r3) goto L31
        L30:
            r0 = 1
        L31:
            r6 = r6 | r0
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r0 <= r3) goto L40
            boolean r0 = r2.A65(r12)
            if (r0 != 0) goto L45
        L40:
            r1 = r4 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r3) goto L46
        L45:
            r0 = 1
        L46:
            r6 = r6 | r0
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            r8 = r15
            if (r0 <= r1) goto L56
            boolean r0 = r2.A65(r15)
            if (r0 != 0) goto L5a
        L56:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L5b
        L5a:
            r5 = 1
        L5b:
            r6 = r6 | r5
            java.lang.Object r7 = r2.AaT()
            if (r6 != 0) goto L66
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L6e
        L66:
            com.facebook.aura.library.view.HatchGoalsTabScreenKt$rememberGoalDetailClick$1$1 r7 = new com.facebook.aura.library.view.HatchGoalsTabScreenKt$rememberGoalDetailClick$1$1
            r7.<init>(r8, r9, r10, r11, r12)
            r2.Ai0(r7)
        L6e:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.rememberGoalDetailClick(com.facebook.aura.library.repo.Goal, int, kotlin.jvm.functions.Function0, java.lang.String, X.BFM, int, int):kotlin.jvm.functions.Function0");
    }

    public static final void roomSpacer(C0CD c0cd, ReorderableLazyListState reorderableLazyListState, GoalRootPlacement goalRootPlacement) {
        if (C7384Etj.areEqual(reorderableLazyListState.roomBeforeKey$delegate.getValue(), goalRootPlacement)) {
            c0cd.APJ(ReorderableListKt.REORDERABLE_ROOM_ITEM_KEY, "room", AnonymousClass001.A0M(new C123911(reorderableLazyListState), 1825601273));
        }
    }

    public static final Object rowKeyFor(String str) {
        return str;
    }

    public static final void GoalsLoadingMoreFooter(int i, BRg bRg, BFM bfm, int i2, int i3) {
        bfm.AgG(317144293);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i);
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), LoadMoreFooterHeight);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchGoalsTabScreenKt$GoalsLoadingMoreFooter$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123733(i, bRg, i2, i3);
        }
    }

    public static final void GoalsSectionDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-800557636);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraDividerKt.AuraDivider(C3U4.A06(AnonymousClass001.A0R(bRg), AuraDimensKt.SpacingXsmallPlusNano), AuraDividerStyle.Secondary.INSTANCE, false, bfm, 48, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123771(bRg, i, i2);
        }
    }

    public static final /* synthetic */ AHG access$GoalCardList_cSuvA_I$lambda$1(MutableState mutableState) {
        return (AHG) mutableState.getValue();
    }

    public static final /* synthetic */ AHG access$GoalCardList_cSuvA_I$lambda$5(MutableState mutableState) {
        return (AHG) mutableState.getValue();
    }

    public static final /* synthetic */ GoalRowsSnapshot access$GoalCardList_cSuvA_I$lambda$9(MutableState mutableState) {
        return (GoalRowsSnapshot) mutableState.getValue();
    }

    public static final boolean isApplied$isAbsentFromFormerParent(GoalDropOutcome goalDropOutcome, List<Goal> list, List<Goal> list2) {
        List list3;
        String sourceParentGoalId = goalDropOutcome.getSourceParentGoalId();
        if (sourceParentGoalId != null) {
            Goal goalIsApplied$root = isApplied$root(list, list2, sourceParentGoalId);
            if (goalIsApplied$root == null || (list3 = goalIsApplied$root.subGoals) == null) {
                list3 = C0881AGi.A00;
            }
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(C3cI.A0c(it), goalDropOutcome.getGoalId())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final Goal isApplied$root(List<Goal> list, List<Goal> list2, String str) {
        Goal goal;
        Goal next;
        Iterator<Goal> it = list.iterator();
        while (true) {
            goal = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.id, str)) {
                break;
            }
        }
        Goal goal2 = next;
        if (goal2 != null) {
            return goal2;
        }
        Iterator<Goal> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Goal next2 = it2.next();
            if (C7384Etj.areEqual(next2.id, str)) {
                goal = next2;
                break;
            }
        }
        return goal;
    }

    public static final G0V<GoalListSection, String, Unit> rememberGoalDragState$lambda$0(C1BO<? extends G0V<? super GoalListSection, ? super String, Unit>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final AHD<BHP> rememberReorderAccessibilityActions(String str, AHD<String> ahd, G0U<? super String, Unit> g0u, Function0<Unit> function0, BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a8d);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a8c);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a8f);
        AHD<BHP> ahdRememberMoveAccessibilityActions = ReorderableColumnKt.rememberMoveAccessibilityActions(str, ahd, strA01, strA012, g0u, bfm, AnonymousClass001.A0B(i << 6, i & 126));
        MutableState mutableStateA00 = C1er.A00(bfm, function0);
        boolean z = function0 != null;
        boolean zA1W = AnonymousClass004.A1W(bfm, strA013, z, bfm.A65(ahdRememberMoveAccessibilityActions));
        Object objAaT = bfm.AaT();
        if (zA1W || objAaT == C78N.A00) {
            AII aiiA17 = AIM.A17();
            aiiA17.addAll(ahdRememberMoveAccessibilityActions);
            if (z) {
                aiiA17.add(new BHP(strA013, new HatchGoalsTabScreenKt$rememberReorderAccessibilityActions$1$1$1(mutableStateA00)));
            }
            objAaT = AnonymousClass001.A0z(bfm, AIM.A18(aiiA17));
        }
        return (AHD) objAaT;
    }

    public static final AHG<String> toggle(AHG<String> ahg, String str) {
        return ahg.contains(str) ? ahg.Aaa(str) : ahg.A35(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* renamed from: GoalCardList-cSuvA-I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1164GoalCardListcSuvAI(X.AHD<com.facebook.aura.library.repo.Goal> r100, X.AHD<com.facebook.aura.library.repo.Goal> r101, androidx.compose.foundation.lazy.LazyListState r102, float r103, boolean r104, boolean r105, boolean r106, boolean r107, kotlin.jvm.functions.Function0<kotlin.Unit> r108, boolean r109, boolean r110, kotlin.jvm.functions.Function0<kotlin.Unit> r111, boolean r112, boolean r113, kotlin.jvm.functions.Function0<kotlin.Unit> r114, kotlin.jvm.functions.Function0<kotlin.Unit> r115, X.G0U<? super java.lang.String, kotlin.Unit> r116, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r117, X.G0V<? super java.lang.String, ? super java.lang.Boolean, java.lang.Boolean> r118, X.AHG<java.lang.String> r119, com.facebook.aura.library.view.GoalReorderActions r120, X.BRg r121, X.BFM r122, int r123, int r124, int r125, int r126) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.m1164GoalCardListcSuvAI(X.AHD, X.AHD, androidx.compose.foundation.lazy.LazyListState, float, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0W, X.G0V, X.AHG, com.facebook.aura.library.view.GoalReorderActions, X.BRg, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalRow(com.facebook.aura.library.repo.Goal r42, int r43, boolean r44, boolean r45, boolean r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r50, X.G0U<? super java.lang.Boolean, java.lang.Boolean> r51, boolean r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, X.AHD<X.BHP> r54, X.BRg r55, X.BFM r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.GoalRow(com.facebook.aura.library.repo.Goal, int, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0W, X.G0U, boolean, kotlin.jvm.functions.Function0, X.AHD, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalRowWithMenu(com.facebook.aura.library.repo.Goal r58, int r59, boolean r60, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.G0U<? super java.lang.Boolean, java.lang.Boolean> r63, boolean r64, X.G0U<? super java.lang.String, kotlin.Unit> r65, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.AHD<X.BHP> r68, boolean r69, X.BRg r70, boolean r71, java.lang.String r72, X.C3TQ r73, boolean r74, java.lang.String r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, X.BFM r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.GoalRowWithMenu(com.facebook.aura.library.repo.Goal, int, boolean, X.G0V, kotlin.jvm.functions.Function0, X.G0U, boolean, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.AHD, boolean, X.BRg, boolean, java.lang.String, X.3TQ, boolean, java.lang.String, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalWithSubGoals(com.facebook.aura.library.repo.Goal r51, int r52, boolean r53, boolean r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, X.G0V<? super java.lang.String, ? super java.lang.Boolean, java.lang.Boolean> r57, X.AHG<java.lang.String> r58, X.G0U<? super java.lang.String, kotlin.Unit> r59, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r60, com.facebook.aura.library.view.GoalReorderActions r61, com.facebook.aura.library.view.SubGoalDragOut r62, com.facebook.aura.library.repo.GoalListSection r63, X.AHD<java.lang.String> r64, boolean r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, X.BRg r67, X.BRg r68, X.BFM r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.GoalWithSubGoals(com.facebook.aura.library.repo.Goal, int, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.AHG, X.G0U, X.G0W, com.facebook.aura.library.view.GoalReorderActions, com.facebook.aura.library.view.SubGoalDragOut, com.facebook.aura.library.repo.GoalListSection, X.AHD, boolean, kotlin.jvm.functions.Function0, X.BRg, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalsOverflowMenu(boolean r67, boolean r68, boolean r69, boolean r70, boolean r71, kotlin.jvm.functions.Function0<kotlin.Unit> r72, X.G0U<? super java.lang.Boolean, kotlin.Unit> r73, X.G0U<? super java.lang.Boolean, kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, X.BRg r77, X.BFM r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.GoalsOverflowMenu(boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SubGoalRow(com.facebook.aura.library.repo.Goal r37, int r38, java.lang.String r39, boolean r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.G0U<? super java.lang.Boolean, java.lang.Boolean> r42, boolean r43, X.G0U<? super java.lang.String, kotlin.Unit> r44, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r45, X.AHD<X.BHP> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.BRg r48, X.BFM r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.SubGoalRow(com.facebook.aura.library.repo.Goal, int, java.lang.String, boolean, kotlin.jvm.functions.Function0, X.G0U, boolean, X.G0U, X.G0W, X.AHD, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.view.GoalDragState rememberGoalDragState(X.AHD<com.facebook.aura.library.repo.Goal> r18, X.AHD<com.facebook.aura.library.repo.Goal> r19, java.util.List<com.facebook.aura.library.repo.Goal> r20, java.util.List<com.facebook.aura.library.repo.Goal> r21, androidx.compose.foundation.lazy.LazyListState r22, com.facebook.aura.library.view.GoalReorderActions r23, X.G0V<? super com.facebook.aura.library.repo.GoalListSection, ? super java.lang.String, kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, X.G0U<? super com.facebook.aura.library.view.GoalDropOutcome, kotlin.Unit> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, X.BFM r28, int r29) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt.rememberGoalDragState(X.AHD, X.AHD, java.util.List, java.util.List, androidx.compose.foundation.lazy.LazyListState, com.facebook.aura.library.view.GoalReorderActions, X.G0V, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.BFM, int):com.facebook.aura.library.view.GoalDragState");
    }
}
