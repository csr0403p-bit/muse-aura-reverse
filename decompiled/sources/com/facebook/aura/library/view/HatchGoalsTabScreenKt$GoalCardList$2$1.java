package com.facebook.aura.library.view;

import X.AHD;
import X.AHG;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.C0CD;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.ui.ReorderableLazyListState;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<Object> $armedRowKey;
    public final /* synthetic */ GoalsTabSection $bottomSection;
    public final /* synthetic */ GoalDragState $dragState;
    public final /* synthetic */ MutableState<AHG<String>> $expandedGoalIds$delegate;
    public final /* synthetic */ boolean $goalsHasNextPage;
    public final /* synthetic */ int $goalsHiddenCount;
    public final /* synthetic */ boolean $isLoadingMoreGoals;
    public final /* synthetic */ boolean $isLoadingMoreTracking;
    public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
    public final /* synthetic */ Function0<Unit> $onExpandTopSection;
    public final /* synthetic */ Function0<Unit> $onLoadMoreGoals;
    public final /* synthetic */ Function0<Unit> $onLoadMoreTracking;
    public final /* synthetic */ Function0<Unit> $onOpenGoalDetail;
    public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
    public final /* synthetic */ AHG<String> $pendingCompletionIds;
    public final /* synthetic */ AHD<Goal> $renderedGoals;
    public final /* synthetic */ AHD<Goal> $renderedTrackingGoals;
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ ReorderableLazyListState $reorderState;
    public final /* synthetic */ boolean $showGoalsFirst;
    public final /* synthetic */ boolean $showSubtitles;
    public final /* synthetic */ boolean $showTrackingSection;
    public final /* synthetic */ SubGoalDragOut $subGoalDragOut;
    public final /* synthetic */ G0U<String, Unit> $toggleExpanded;
    public final /* synthetic */ G0U<String, Unit> $toggleTrackingExpanded;
    public final /* synthetic */ MutableState<AHG<String>> $trackingExpandedGoalIds$delegate;
    public final /* synthetic */ boolean $trackingHasNextPage;
    public final /* synthetic */ int $trackingHiddenCount;
    public final /* synthetic */ AHD<String> $visibleGoalIds;
    public final /* synthetic */ List<Goal> $visibleGoals;
    public final /* synthetic */ AHD<String> $visibleTrackingGoalIds;
    public final /* synthetic */ List<Goal> $visibleTrackingGoals;

    /* renamed from: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalCardList$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<Goal> $renderedGoals;
        public final /* synthetic */ AHD<Goal> $renderedTrackingGoals;
        public final /* synthetic */ boolean $showTrackingSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<Goal> ahd, boolean z, AHD<Goal> ahd2) {
            super(3);
            this.$renderedGoals = ahd;
            this.$showTrackingSection = z;
            this.$renderedTrackingGoals = ahd2;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.AnonymousClass037 r4, X.BFM r5, int r6) {
            /*
                r3 = this;
                boolean r0 = X.AnonymousClass004.A1G(r6)
                r4 = r5
                boolean r0 = X.AnonymousClass001.A1b(r0, r5, r6)
                if (r0 == 0) goto L37
                X.AHD<com.facebook.aura.library.repo.Goal> r0 = r3.$renderedGoals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L18
                boolean r0 = r3.$showTrackingSection
                r1 = 0
                if (r0 == 0) goto L19
            L18:
                r1 = 1
            L19:
                X.AHD<com.facebook.aura.library.repo.Goal> r0 = r3.$renderedGoals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L35
                boolean r0 = r3.$showTrackingSection
                if (r0 == 0) goto L2d
                X.AHD<com.facebook.aura.library.repo.Goal> r0 = r3.$renderedTrackingGoals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L35
            L2d:
                r2 = 1
            L2e:
                r3 = 0
                r5 = 0
                r6 = 4
                com.facebook.aura.library.view.HatchGoalsTabScreenKt.AddGoalSection(r1, r2, r3, r4, r5, r6)
                return
            L35:
                r2 = 0
                goto L2e
            L37:
                r5.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGoalsTabScreenKt$GoalCardList$2$1.AnonymousClass2.invoke(X.037, X.BFM, int):void");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        GoalsTabSection goalsTabSection;
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("goals_page_header", "header", ComposableSingletons$HatchGoalsTabScreenKt.lambda$1294432925);
        GoalsTabSection[] goalsTabSectionArr = new GoalsTabSection[2];
        if (this.$showGoalsFirst) {
            goalsTabSectionArr[0] = GoalsTabSection.GOALS;
            goalsTabSection = GoalsTabSection.TRACKING;
        } else {
            goalsTabSectionArr[0] = GoalsTabSection.TRACKING;
            goalsTabSection = GoalsTabSection.GOALS;
        }
        goalsTabSectionArr[1] = goalsTabSection;
        List listAsList = Arrays.asList(goalsTabSectionArr);
        boolean z = this.$showTrackingSection;
        List<Goal> list = this.$visibleTrackingGoals;
        ReorderableLazyListState reorderableLazyListState = this.$reorderState;
        AHD<String> ahd = this.$visibleTrackingGoalIds;
        GoalsTabSection goalsTabSection2 = this.$bottomSection;
        boolean z2 = this.$isLoadingMoreTracking;
        AHD<Goal> ahd2 = this.$renderedTrackingGoals;
        boolean z3 = this.$trackingHasNextPage;
        int i = this.$trackingHiddenCount;
        AHD<Goal> ahd3 = this.$renderedGoals;
        List<Goal> list2 = this.$visibleGoals;
        AHD<String> ahd4 = this.$visibleGoalIds;
        boolean z4 = this.$isLoadingMoreGoals;
        boolean z5 = this.$goalsHasNextPage;
        int i2 = this.$goalsHiddenCount;
        boolean z6 = this.$showSubtitles;
        Function0<Unit> function0 = this.$onOpenGoalDetail;
        G0V<String, Boolean, Boolean> g0v = this.$onToggleComplete;
        AHG<String> ahg = this.$pendingCompletionIds;
        G0U<String, Unit> g0u = this.$onDeleteGoal;
        G0W<String, String, String, Unit> g0w = this.$onRenameGoal;
        GoalReorderActions goalReorderActions = this.$reorderActions;
        SubGoalDragOut subGoalDragOut = this.$subGoalDragOut;
        GoalDragState goalDragState = this.$dragState;
        MutableState<Object> mutableState = this.$armedRowKey;
        MutableState<AHG<String>> mutableState2 = this.$trackingExpandedGoalIds$delegate;
        G0U<String, Unit> g0u2 = this.$toggleTrackingExpanded;
        Function0<Unit> function02 = this.$onExpandTopSection;
        Function0<Unit> function03 = this.$onLoadMoreTracking;
        MutableState<AHG<String>> mutableState3 = this.$expandedGoalIds$delegate;
        G0U<String, Unit> g0u3 = this.$toggleExpanded;
        Function0<Unit> function04 = this.$onLoadMoreGoals;
        Iterator it = listAsList.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            int iOrdinal = ((GoalsTabSection) it.next()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                if (z && !ahd3.isEmpty()) {
                    c0cd.APJ(HatchGoalsTabScreenKt.GOALS_HEADER_KEY, null, B1V.A01(new HatchGoalsTabScreenKt$GoalCardList$2$1$1$4(z7), -1070864974, true));
                }
                int i3 = 0;
                for (Goal goal : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    Goal goal2 = goal;
                    HatchGoalsTabScreenKt.roomSpacer(c0cd, reorderableLazyListState, new GoalRootPlacement(GoalListSection.GOALS, goal2.id));
                    c0cd.APJ(goal2.id, "user_goal_row", B1V.A01(new HatchGoalsTabScreenKt$GoalCardList$2$1$1$5$1(reorderableLazyListState, goal2, i3, z6, function0, g0v, ahg, g0u, g0w, goalReorderActions, subGoalDragOut, ahd4, goalDragState, mutableState, mutableState3, g0u3), 1062806715, true));
                    i3 = i4;
                }
                HatchGoalsTabScreenKt.roomSpacer(c0cd, reorderableLazyListState, HatchGoalsTabScreenKt.GoalCardList_cSuvA_I$sectionEndPlacement(ahd3, ahd2, GoalListSection.GOALS, ahd4));
                if (goalsTabSection2 == GoalsTabSection.GOALS) {
                    if (z4) {
                        c0cd.APJ("goals_loading_more", "loading_more", ComposableSingletons$HatchGoalsTabScreenKt.f71lambda$384494972);
                    }
                } else if (!ahd3.isEmpty()) {
                    if (z4 || z5 || i2 > 0) {
                        c0cd.APJ("goals_show_more", "show_more", B1V.A01(new HatchGoalsTabScreenKt$GoalCardList$2$1$1$6(z4, i2, function02, function04), -1013346926, true));
                    } else {
                        z4 = false;
                    }
                }
                if (!ahd3.isEmpty()) {
                    z7 = true;
                }
            } else if (z) {
                c0cd.APJ(HatchGoalsTabScreenKt.TRACKING_HEADER_KEY, "section_header", B1V.A01(new HatchGoalsTabScreenKt$GoalCardList$2$1$1$1(z7, ahd2), 1943605641, true));
                int i5 = 0;
                for (Goal goal3 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    Goal goal4 = goal3;
                    String str = goal4.id;
                    float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
                    HatchGoalsTabScreenKt.roomSpacer(c0cd, reorderableLazyListState, new GoalRootPlacement(GoalListSection.TRACKING, str));
                    c0cd.APJ(str, "tracking_goal_row", B1V.A01(new HatchGoalsTabScreenKt$GoalCardList$2$1$1$2$1(reorderableLazyListState, str, goal4, i5, z6, function0, g0v, ahg, g0u, g0w, goalReorderActions, subGoalDragOut, ahd, goalDragState, mutableState, mutableState2, g0u2), 2129294637, true));
                    i5 = i6;
                }
                HatchGoalsTabScreenKt.roomSpacer(c0cd, reorderableLazyListState, HatchGoalsTabScreenKt.GoalCardList_cSuvA_I$sectionEndPlacement(ahd3, ahd2, GoalListSection.TRACKING, ahd));
                if (goalsTabSection2 == GoalsTabSection.TRACKING) {
                    if (z2) {
                        c0cd.APJ("tracking_loading_more", "loading_more", ComposableSingletons$HatchGoalsTabScreenKt.lambda$1434420991);
                    }
                } else if (!ahd2.isEmpty() && (z2 || z3 || i > 0)) {
                    c0cd.APJ("tracking_show_more", "show_more", B1V.A01(new HatchGoalsTabScreenKt$GoalCardList$2$1$1$3(z2, i, function02, function03), -1072496755, true));
                }
                z7 = true;
            } else {
                continue;
            }
        }
        c0cd.APJ(HatchGoalsTabScreenKt.ADD_GOAL_KEY, HatchGoalsTabScreenKt.ADD_GOAL_KEY, B1V.A01(new AnonymousClass2(this.$renderedGoals, this.$showTrackingSection, this.$renderedTrackingGoals), 525289300, true));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoalsTabSection.values().length];
            try {
                AnonymousClass002.A13(GoalsTabSection.TRACKING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GoalsTabSection.GOALS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$GoalCardList$2$1(boolean z, boolean z2, List<Goal> list, ReorderableLazyListState reorderableLazyListState, AHD<String> ahd, GoalsTabSection goalsTabSection, boolean z3, AHD<Goal> ahd2, boolean z4, int i, AHD<Goal> ahd3, List<Goal> list2, AHD<String> ahd4, boolean z5, boolean z6, int i2, boolean z7, Function0<Unit> function0, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, GoalReorderActions goalReorderActions, SubGoalDragOut subGoalDragOut, GoalDragState goalDragState, MutableState<Object> mutableState, MutableState<AHG<String>> mutableState2, G0U<? super String, Unit> g0u2, Function0<Unit> function02, Function0<Unit> function03, MutableState<AHG<String>> mutableState3, G0U<? super String, Unit> g0u3, Function0<Unit> function04) {
        super(1);
        this.$showGoalsFirst = z;
        this.$showTrackingSection = z2;
        this.$visibleTrackingGoals = list;
        this.$reorderState = reorderableLazyListState;
        this.$visibleTrackingGoalIds = ahd;
        this.$bottomSection = goalsTabSection;
        this.$isLoadingMoreTracking = z3;
        this.$renderedTrackingGoals = ahd2;
        this.$trackingHasNextPage = z4;
        this.$trackingHiddenCount = i;
        this.$renderedGoals = ahd3;
        this.$visibleGoals = list2;
        this.$visibleGoalIds = ahd4;
        this.$isLoadingMoreGoals = z5;
        this.$goalsHasNextPage = z6;
        this.$goalsHiddenCount = i2;
        this.$showSubtitles = z7;
        this.$onOpenGoalDetail = function0;
        this.$onToggleComplete = g0v;
        this.$pendingCompletionIds = ahg;
        this.$onDeleteGoal = g0u;
        this.$onRenameGoal = g0w;
        this.$reorderActions = goalReorderActions;
        this.$subGoalDragOut = subGoalDragOut;
        this.$dragState = goalDragState;
        this.$armedRowKey = mutableState;
        this.$trackingExpandedGoalIds$delegate = mutableState2;
        this.$toggleTrackingExpanded = g0u2;
        this.$onExpandTopSection = function02;
        this.$onLoadMoreTracking = function03;
        this.$expandedGoalIds$delegate = mutableState3;
        this.$toggleExpanded = g0u3;
        this.$onLoadMoreGoals = function04;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
