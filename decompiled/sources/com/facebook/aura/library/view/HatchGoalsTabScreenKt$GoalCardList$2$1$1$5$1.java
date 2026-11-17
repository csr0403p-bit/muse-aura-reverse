package com.facebook.aura.library.view;

import X.AHD;
import X.AHG;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC05151eP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.ui.ReorderableLazyListState;
import com.facebook.aura.ui.ReorderableListKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$2$1$1$5$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Object> $armedRowKey;
    public final /* synthetic */ GoalDragState $dragState;
    public final /* synthetic */ MutableState<AHG<String>> $expandedGoalIds$delegate;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
    public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
    public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
    public final /* synthetic */ AHG<String> $pendingCompletionIds;
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ ReorderableLazyListState $reorderState;
    public final /* synthetic */ boolean $showSubtitles;
    public final /* synthetic */ SubGoalDragOut $subGoalDragOut;
    public final /* synthetic */ G0U<String, Unit> $toggleExpanded;
    public final /* synthetic */ AHD<String> $visibleGoalIds;

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalCardList$2$1$1$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<InterfaceC05151eP, Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Object> $armedRowKey;
        public final /* synthetic */ GoalDragState $dragState;
        public final /* synthetic */ MutableState<AHG<String>> $expandedGoalIds$delegate;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ int $index;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ GoalReorderActions $reorderActions;
        public final /* synthetic */ boolean $showSubtitles;
        public final /* synthetic */ SubGoalDragOut $subGoalDragOut;
        public final /* synthetic */ G0U<String, Unit> $toggleExpanded;
        public final /* synthetic */ AHD<String> $visibleGoalIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Goal goal, int i, boolean z, Function0<Unit> function0, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, GoalReorderActions goalReorderActions, SubGoalDragOut subGoalDragOut, AHD<String> ahd, GoalDragState goalDragState, MutableState<Object> mutableState, MutableState<AHG<String>> mutableState2, G0U<? super String, Unit> g0u2) {
            super(4);
            this.$goal = goal;
            this.$index = i;
            this.$showSubtitles = z;
            this.$onOpenGoalDetail = function0;
            this.$onToggleComplete = g0v;
            this.$pendingCompletionIds = ahg;
            this.$onDeleteGoal = g0u;
            this.$onRenameGoal = g0w;
            this.$reorderActions = goalReorderActions;
            this.$subGoalDragOut = subGoalDragOut;
            this.$visibleGoalIds = ahd;
            this.$dragState = goalDragState;
            this.$armedRowKey = mutableState;
            this.$expandedGoalIds$delegate = mutableState2;
            this.$toggleExpanded = g0u2;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, boolean z, BFM bfm, int i) {
            int iA0o = i;
            C7384Etj.A0Y(interfaceC05151eP, 0);
            if ((i & 48) == 0) {
                iA0o = i | AnonymousClass004.A0o(bfm, z);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0o & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0o)) {
                bfm.Afo();
                return;
            }
            Goal goal = this.$goal;
            int i2 = this.$index;
            MutableState<AHG<String>> mutableState = this.$expandedGoalIds$delegate;
            float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
            boolean zContains = mutableState.getValue().contains(this.$goal.id);
            boolean z2 = this.$showSubtitles;
            boolean zA67 = bfm.A67(this.$goal);
            G0U<String, Unit> g0u = this.$toggleExpanded;
            Goal goal2 = this.$goal;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGoalsTabScreenKt$GoalCardList$2$1$1$5$1$1$1$1(g0u, goal2);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            Function0<Unit> function02 = this.$onOpenGoalDetail;
            G0V<String, Boolean, Boolean> g0v = this.$onToggleComplete;
            AHG<String> ahg = this.$pendingCompletionIds;
            G0U<String, Unit> g0u2 = this.$onDeleteGoal;
            G0W<String, String, String, Unit> g0w = this.$onRenameGoal;
            GoalReorderActions goalReorderActions = this.$reorderActions;
            SubGoalDragOut subGoalDragOut = this.$subGoalDragOut;
            GoalListSection goalListSection = GoalListSection.GOALS;
            AHD<String> ahd = this.$visibleGoalIds;
            boolean zA672 = bfm.A67(this.$goal);
            MutableState<Object> mutableState2 = this.$armedRowKey;
            Goal goal3 = this.$goal;
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchGoalsTabScreenKt$GoalCardList$2$1$1$5$1$1$2$1(mutableState2, goal3);
                bfm.Ai0(objAaT2);
            }
            HatchGoalsTabScreenKt.GoalWithSubGoals(goal, i2, zContains, z2, function0, function02, g0v, ahg, g0u2, g0w, goalReorderActions, subGoalDragOut, goalListSection, ahd, z, (Function0) objAaT2, this.$dragState.rowModifier(this.$goal.id, this.$armedRowKey), HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.GOALS, HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOALS_HOME, HatchComponent.GOAL_CARD, null, AnonymousClass006.A10(HatchMetadataKey.GOAL_ID.getValue(), this.$goal.id), Integer.valueOf(this.$index), 500L, 0.0f, null, null, null), bfm, 0, ((iA0o << 9) & 57344) | 384, 0);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, Boolean bool, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$GoalCardList$2$1$1$5$1(ReorderableLazyListState reorderableLazyListState, Goal goal, int i, boolean z, Function0<Unit> function0, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, GoalReorderActions goalReorderActions, SubGoalDragOut subGoalDragOut, AHD<String> ahd, GoalDragState goalDragState, MutableState<Object> mutableState, MutableState<AHG<String>> mutableState2, G0U<? super String, Unit> g0u2) {
        super(3);
        this.$reorderState = reorderableLazyListState;
        this.$goal = goal;
        this.$index = i;
        this.$showSubtitles = z;
        this.$onOpenGoalDetail = function0;
        this.$onToggleComplete = g0v;
        this.$pendingCompletionIds = ahg;
        this.$onDeleteGoal = g0u;
        this.$onRenameGoal = g0w;
        this.$reorderActions = goalReorderActions;
        this.$subGoalDragOut = subGoalDragOut;
        this.$visibleGoalIds = ahd;
        this.$dragState = goalDragState;
        this.$armedRowKey = mutableState;
        this.$expandedGoalIds$delegate = mutableState2;
        this.$toggleExpanded = g0u2;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        int iA0d = i;
        if (AnonymousClass002.A0B(anonymousClass037, iA0d) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, anonymousClass037);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        ReorderableLazyListState reorderableLazyListState = this.$reorderState;
        Goal goal = this.$goal;
        ReorderableListKt.ReorderableItem(anonymousClass037, reorderableLazyListState, goal.id, null, null, B1V.A00(bfm, new AnonymousClass1(goal, this.$index, this.$showSubtitles, this.$onOpenGoalDetail, this.$onToggleComplete, this.$pendingCompletionIds, this.$onDeleteGoal, this.$onRenameGoal, this.$reorderActions, this.$subGoalDragOut, this.$visibleGoalIds, this.$dragState, this.$armedRowKey, this.$expandedGoalIds$delegate, this.$toggleExpanded), -1844005539), bfm, (iA0d & 14) | 196608 | (ReorderableLazyListState.$stable << 3), 12);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
