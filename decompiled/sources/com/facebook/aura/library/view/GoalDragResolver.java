package com.facebook.aura.library.view;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.library.view.GoalDropOutcome;
import com.facebook.aura.ui.DragRelease;
import com.facebook.aura.ui.ItemPosition;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalDragResolver {
    public final Set<String> childlessGoalIds;
    public final Map<Object, GoalDragTarget> dragTargets;
    public final List<String> goalIds;
    public final G0V<GoalListSection, String, Unit> onNested;
    public final GoalReorderActions reorderActions;
    public final SubGoalDragSource subGoalDragSource;
    public final List<String> trackingGoalIds;

    private final NestRejectionReason nestRejectionReason(Object obj, Object obj2) {
        String str;
        GoalDragTarget goalDragTarget = obj != null ? this.dragTargets.get(obj) : null;
        GoalDragSource goalDragSourceSourceFor = obj2 != null ? sourceFor(obj2) : null;
        if (obj == null) {
            return NestRejectionReason.NO_TARGET;
        }
        if (goalDragTarget == null || (str = goalDragTarget.goalId) == null) {
            return NestRejectionReason.TARGET_NOT_ROOT;
        }
        if (goalDragSourceSourceFor == null) {
            return NestRejectionReason.SOURCE_NOT_FOUND;
        }
        if (str.equals(goalDragSourceSourceFor.goalId)) {
            return NestRejectionReason.SAME_ROW;
        }
        if (C7384Etj.areEqual(goalDragSourceSourceFor.parentGoalId, goalDragTarget.goalId)) {
            return NestRejectionReason.ALREADY_CHILD;
        }
        if (!this.childlessGoalIds.contains(goalDragSourceSourceFor.goalId)) {
            return NestRejectionReason.SOURCE_HAS_CHILDREN;
        }
        if (HatchGoalsTabScreenKt.canCrossSection(goalDragSourceSourceFor.section, goalDragTarget.section)) {
            return null;
        }
        return NestRejectionReason.CROSS_SECTION_DISABLED;
    }

    public final boolean canNest(ItemPosition itemPosition, Object obj) {
        boolean zA1a = AnonymousClass002.A1a(itemPosition, obj);
        if (nestRejectionReason(itemPosition.key, obj) == null) {
            return zA1a;
        }
        return false;
    }

    public final GoalDropOutcome onRelease(DragRelease dragRelease) {
        String str;
        C7384Etj.A0Y(dragRelease, 0);
        Object obj = dragRelease.key;
        GoalDragSource goalDragSourceSourceFor = obj != null ? sourceFor(obj) : null;
        Object obj2 = dragRelease.roomBeforeKey;
        GoalRootPlacement goalRootPlacement = obj2 instanceof GoalRootPlacement ? (GoalRootPlacement) obj2 : null;
        Object obj3 = dragRelease.nestTargetKey;
        GoalDragTarget goalDragTarget = obj3 != null ? this.dragTargets.get(obj3) : null;
        if (goalDragSourceSourceFor != null) {
            if (goalRootPlacement != null) {
                if (!changesRootPlacement(goalDragSourceSourceFor, goalRootPlacement)) {
                    return null;
                }
                this.reorderActions.placeGoalAtRoot.invoke(goalDragSourceSourceFor.goalId, goalDragSourceSourceFor.section, goalRootPlacement.section, goalRootPlacement.beforeGoalId);
                return new GoalDropOutcome.Root(goalDragSourceSourceFor.goalId, goalDragSourceSourceFor.section, goalDragSourceSourceFor.parentGoalId, goalRootPlacement.section, goalRootPlacement.beforeGoalId);
            }
            if (goalDragTarget != null && (str = goalDragTarget.goalId) != null) {
                this.reorderActions.nestGoalUnder.invoke(goalDragSourceSourceFor.goalId, str);
                this.onNested.invoke(goalDragTarget.section, goalDragTarget.goalId);
                return new GoalDropOutcome.Nested(goalDragSourceSourceFor.goalId, goalDragSourceSourceFor.section, goalDragSourceSourceFor.parentGoalId, goalDragTarget.goalId, goalDragTarget.section);
            }
        }
        return null;
    }

    public final GoalRootPlacement roomBefore(ItemPosition itemPosition, Object obj, boolean z) {
        List<String> list;
        boolean zA1a = AnonymousClass002.A1a(itemPosition, obj);
        GoalDragTarget goalDragTarget = this.dragTargets.get(itemPosition.key);
        GoalDragSource goalDragSourceSourceFor = sourceFor(obj);
        if (goalDragTarget == null || goalDragSourceSourceFor == null || !(goalDragSourceSourceFor.section == goalDragTarget.section || HatchUtil.INSTANCE.isTrackingToGoalsDragEnabled())) {
            return null;
        }
        int iOrdinal = goalDragTarget.section.ordinal();
        if (iOrdinal == 0) {
            list = this.goalIds;
        } else {
            if (iOrdinal != zA1a) {
                throw C3cG.A0q();
            }
            list = this.trackingGoalIds;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            if (!C7384Etj.areEqual(str, goalDragSourceSourceFor.goalId)) {
                arrayListA0h.add(str);
            }
        }
        String str2 = goalDragTarget.goalId;
        return new GoalRootPlacement(goalDragTarget.section, str2 != null ? z ? (String) AbstractC0878AGe.A0A(arrayListA0h.indexOf(str2) + 1, arrayListA0h) : str2 : null);
    }

    public final int roomTopHint(ItemPosition itemPosition, int i, int i2, boolean z) {
        C7384Etj.A0Y(itemPosition, 0);
        Object obj = itemPosition.key;
        return (C7384Etj.areEqual(obj, HatchGoalsTabScreenKt.TRACKING_HEADER_KEY) || C7384Etj.areEqual(obj, HatchGoalsTabScreenKt.GOALS_HEADER_KEY) || (!C7384Etj.areEqual(obj, HatchGoalsTabScreenKt.ADD_GOAL_KEY) && z)) ? i + i2 : i;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoalListSection.values().length];
            try {
                AnonymousClass002.A13(GoalListSection.GOALS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GoalListSection.TRACKING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean changesRootPlacement(com.facebook.aura.library.view.GoalDragSource r5, com.facebook.aura.library.view.GoalRootPlacement r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.parentGoalId
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L64
            com.facebook.aura.library.repo.GoalListSection r1 = r5.section
            com.facebook.aura.library.repo.GoalListSection r0 = r6.section
            if (r1 != r0) goto L64
            int r0 = r1.ordinal()
            if (r0 == r2) goto L34
            if (r0 != r3) goto L5f
            java.util.List<java.lang.String> r4 = r4.trackingGoalIds
        L16:
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r4.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r5.goalId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L1e
            r3.add(r1)
            goto L1e
        L34:
            java.util.List<java.lang.String> r4 = r4.goalIds
            goto L16
        L37:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.lang.String r0 = r6.beforeGoalId
            if (r0 == 0) goto L5a
            int r1 = r2.indexOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            if (r0 < 0) goto L5a
        L4e:
            java.lang.String r0 = r5.goalId
            r2.add(r1, r0)
            boolean r0 = r2.equals(r4)
            r0 = r0 ^ 1
            return r0
        L5a:
            int r1 = r2.size()
            goto L4e
        L5f:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalDragResolver.changesRootPlacement(com.facebook.aura.library.view.GoalDragSource, com.facebook.aura.library.view.GoalRootPlacement):boolean");
    }

    private final GoalDragSource sourceFor(Object obj) {
        String str;
        GoalDragTarget goalDragTarget = this.dragTargets.get(obj);
        if (goalDragTarget != null && (str = goalDragTarget.goalId) != null) {
            return new GoalDragSource(goalDragTarget.section, str, null);
        }
        SubGoalDragSource subGoalDragSource = this.subGoalDragSource;
        String str2 = subGoalDragSource.subGoalId;
        GoalListSection goalListSection = subGoalDragSource.section;
        String str3 = subGoalDragSource.parentGoalId;
        if (!C7384Etj.areEqual(str2, obj) || goalListSection == null || str3 == null) {
            return null;
        }
        return new GoalDragSource(goalListSection, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalDragResolver(List<String> list, List<String> list2, Map<Object, GoalDragTarget> map, Set<String> set, SubGoalDragSource subGoalDragSource, GoalReorderActions goalReorderActions, G0V<? super GoalListSection, ? super String, Unit> g0v) {
        AnonymousClass005.A17(list, list2, map, set, subGoalDragSource);
        AnonymousClass003.A0z(goalReorderActions, g0v);
        this.goalIds = list;
        this.trackingGoalIds = list2;
        this.dragTargets = map;
        this.childlessGoalIds = set;
        this.subGoalDragSource = subGoalDragSource;
        this.reorderActions = goalReorderActions;
        this.onNested = g0v;
    }
}
