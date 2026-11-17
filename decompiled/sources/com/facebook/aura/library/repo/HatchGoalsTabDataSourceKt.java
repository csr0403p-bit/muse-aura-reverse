package com.facebook.aura.library.repo;

import X.AGI;
import X.AGJ;
import X.AHD;
import X.AHH;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C2FI;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.InterfaceC0962AJp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class HatchGoalsTabDataSourceKt {
    public static final String DRAG_TAG = "HatchDrag";
    public static final int GOALS_PAGE_SIZE = 10;
    public static final String GOAL_LIFECYCLE_CONFLICT = "goal_lifecycle_transition_in_progress";
    public static final int MAX_CONCURRENT_PIN_WRITES = 4;
    public static final int MAX_TREE_DEPTH = 8;
    public static final long ORDER_SYNC_DEBOUNCE_MS = 300;
    public static final long PIN_SPACING = 1000000;
    public static final String SHOW_GOALS_FIRST_KEY = "show_goals_section_first";
    public static final String SHOW_SUBTITLES_KEY = "show_goal_subtitles";
    public static final String TAG = "HatchGoalsTabDataSource";
    public static final String USER_FILE_PATH = "USER.md";

    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt$inDisplayOrder$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Goal, Comparable<?>> {
        public final /* synthetic */ GoalsStore $this_inDisplayOrder;

        @Override // X.G0U
        public final Comparable<?> invoke(Goal goal) {
            C7384Etj.A0Y(goal, 0);
            return HatchGoalsTabDataSourceKt.positionOf(this.$this_inDisplayOrder, goal.id);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(GoalsStore goalsStore) {
            super(1);
            this.$this_inDisplayOrder = goalsStore;
        }
    }

    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt$inDisplayOrder$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Goal, Comparable<?>> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Comparable<?> invoke(Goal goal) {
            Goal goal2 = goal;
            C7384Etj.A0Y(goal2, 0);
            return goal2.id;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Comparable<?> invoke2(Goal goal) {
            C7384Etj.A0Y(goal, 0);
            return goal.id;
        }
    }

    public static final AHH<String> applyLocalOrder$rootsFor(GoalsLocalOrder goalsLocalOrder, InterfaceC0962AJp<String, GoalNode> interfaceC0962AJp, GoalListSection goalListSection, AHH<String> ahh) {
        GoalNode goalNodeA0P;
        C7384Etj.A0Y(ahh, 0);
        HashSet hashSet = new HashSet(C3cG.A03(ahh, 12));
        AbstractC0878AGe.A0j(ahh, hashSet);
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJp2 = goalsLocalOrder.promoted;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(interfaceC0962AJp2);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (entryA0l.getValue() == goalListSection) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        Set setKeySet = linkedHashMapA0j.keySet();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : setKeySet) {
            if (!hashSet.contains(obj) && (goalNodeA0P = C3cH.A0P(obj, interfaceC0962AJp)) != null && goalNodeA0P.goal.parentGoalId == null) {
                arrayListA0h.add(obj);
            }
        }
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJp3 = goalsLocalOrder.promoted;
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        Iterator itA0n2 = AnonymousClass002.A0n(interfaceC0962AJp3);
        while (itA0n2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
            if (entryA0l2.getValue() != goalListSection) {
                AnonymousClass006.A1R(linkedHashMapA0j2, entryA0l2);
            }
        }
        return ahh.A3M(arrayListA0h).Aai(linkedHashMapA0j2.keySet()).Aai(goalsLocalOrder.nested.keySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[PHI: r2
  0x001b: PHI (r2v3 X.AHD) = (r2v0 X.AHD), (r2v4 X.AHD) binds: [B:10:0x0019, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[PHI: r2
  0x001f: PHI (r2v2 X.AHD) = (r2v0 X.AHD), (r2v3 X.AHD) binds: [B:10:0x0019, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.repo.GoalDetail buildDetail(com.facebook.aura.library.repo.GoalsStore r4, java.lang.String r5) {
        /*
            r1 = 0
            r0 = 0
            com.facebook.aura.library.repo.Goal r3 = buildTree(r4, r5, r0)
            if (r3 != 0) goto L9
            return r1
        L9:
            X.AJp<java.lang.String, com.facebook.aura.library.repo.GoalDetailExtras> r0 = r4.goalExtras
            java.lang.Object r0 = r0.get(r5)
            com.facebook.aura.library.repo.GoalDetailExtras r0 = (com.facebook.aura.library.repo.GoalDetailExtras) r0
            if (r0 == 0) goto L17
            X.AHD<com.facebook.aura.library.repo.GoalUpdate> r2 = r0.updates
            if (r2 != 0) goto L1b
        L17:
            X.AHI r2 = X.AHI.A01
            if (r0 == 0) goto L1f
        L1b:
            X.AHD<com.facebook.aura.library.repo.GoalAssociation> r1 = r0.associations
            if (r1 != 0) goto L21
        L1f:
            X.AHI r1 = X.AHI.A01
        L21:
            com.facebook.aura.library.repo.GoalDetail r0 = new com.facebook.aura.library.repo.GoalDetail
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt.buildDetail(com.facebook.aura.library.repo.GoalsStore, java.lang.String):com.facebook.aura.library.repo.GoalDetail");
    }

    public static final boolean isInAnyCollection(GoalsStore goalsStore, String str) {
        Goal goal;
        int i = 0;
        while (!goalsStore.listOrder.contains(str) && !goalsStore.trackingOrder.contains(str) && !goalsStore.completedOrder.contains(str)) {
            GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
            if (goalNodeA0B == null || (goal = goalNodeA0B.goal) == null || (str = goal.parentGoalId) == null || (i = i + 1) >= 8) {
                return false;
            }
        }
        return true;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final GoalsStore applyLocalOrder(GoalsStore goalsStore, GoalsLocalOrder goalsLocalOrder) {
        GoalNode goalNodeA0P;
        String str;
        if (goalsLocalOrder.isEmpty()) {
            return goalsStore;
        }
        AGJ<String, GoalNode> agjA5b = goalsStore.goalsById.A5b();
        for (String str2 : goalsLocalOrder.promoted.keySet()) {
            GoalNode goalNodeA0P2 = C3cH.A0P(str2, agjA5b);
            if (goalNodeA0P2 != null && (str = goalNodeA0P2.goal.parentGoalId) != null) {
                GoalNode goalNodeA0P3 = C3cH.A0P(str, agjA5b);
                if (goalNodeA0P3 != null) {
                    C3cI.A1D(goalNodeA0P3, str, agjA5b, C3cJ.A0U(goalNodeA0P3.childIds, str2));
                }
                Goal goalCopy$default = Goal.copy$default(goalNodeA0P2.goal, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65023, null);
                AHH<String> ahh = goalNodeA0P2.childIds;
                AnonymousClass003.A0u(goalCopy$default, ahh);
                agjA5b.put(str2, new GoalNode(goalCopy$default, ahh));
            }
        }
        Iterator itA0n = AnonymousClass002.A0n(goalsLocalOrder.nested);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            String str3 = (String) entryA0l.getValue();
            GoalNode goalNodeA0P4 = C3cH.A0P(key, agjA5b);
            if (goalNodeA0P4 != null && agjA5b.containsKey(str3)) {
                String str4 = goalNodeA0P4.goal.parentGoalId;
                if (str4 != null && !str4.equals(str3) && (goalNodeA0P = C3cH.A0P(str4, agjA5b)) != null) {
                    C3cI.A1D(goalNodeA0P, str4, agjA5b, C3cJ.A0U(goalNodeA0P.childIds, key));
                }
                Goal goalCopy$default2 = Goal.copy$default(goalNodeA0P4.goal, null, null, null, null, null, null, null, null, null, str3, null, null, null, null, null, null, 65023, null);
                AHH<String> ahh2 = goalNodeA0P4.childIds;
                AnonymousClass003.A0u(goalCopy$default2, ahh2);
                agjA5b.put(key, new GoalNode(goalCopy$default2, ahh2));
                GoalNode goalNodeA0P5 = C3cH.A0P(str3, agjA5b);
                if (goalNodeA0P5 != null && !goalNodeA0P5.childIds.contains(key)) {
                    C3cI.A1D(goalNodeA0P5, str3, agjA5b, goalNodeA0P5.childIds.A3D(key, 0));
                }
            }
        }
        InterfaceC0962AJp interfaceC0962AJpA5S = agjA5b.A5S();
        return GoalsStore.copy$default(goalsStore, interfaceC0962AJpA5S, applyLocalOrder$rootsFor(goalsLocalOrder, interfaceC0962AJpA5S, GoalListSection.GOALS, goalsStore.listOrder), applyLocalOrder$rootsFor(goalsLocalOrder, interfaceC0962AJpA5S, GoalListSection.TRACKING, goalsStore.trackingOrder), null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524280, null);
    }

    public static final Goal buildTree(GoalsStore goalsStore, String str, int i) {
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
        if (goalNodeA0B == null) {
            return null;
        }
        if (i >= 8) {
            return Goal.copy$default(goalNodeA0B.goal, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 61439, null);
        }
        AHH<String> ahh = goalNodeA0B.childIds;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahh.iterator();
        while (it.hasNext()) {
            Goal goalBuildTree = buildTree(goalsStore, AnonymousClass005.A0j(it), i + 1);
            if (goalBuildTree != null) {
                arrayListA0h.add(goalBuildTree);
            }
        }
        List<Goal> listInDisplayOrder = inDisplayOrder(goalsStore, arrayListA0h);
        return Goal.copy$default(goalNodeA0B.goal, null, null, null, null, null, null, null, null, null, null, null, null, listInDisplayOrder.isEmpty() ? null : AGI.A07(listInDisplayOrder), null, null, null, 61439, null);
    }

    public static final boolean canLoadMoreCompleted(GoalsStore goalsStore) {
        return (goalsStore.isLoadingMoreCompleted || !goalsStore.completedHasNextPage || goalsStore.completedNextCursor == null) ? false : true;
    }

    public static final boolean canLoadMoreList(GoalsStore goalsStore) {
        return (goalsStore.isLoadingMoreList || !goalsStore.listHasNextPage || goalsStore.listNextCursor == null) ? false : true;
    }

    public static final boolean canLoadMoreTracking(GoalsStore goalsStore) {
        return (goalsStore.isLoadingMoreTracking || !goalsStore.trackingHasNextPage || goalsStore.trackingNextCursor == null) ? false : true;
    }

    public static final Set<String> completionStatusChangeIds(GoalsStore goalsStore, String str, boolean z) {
        GoalNode goalNodeA0B;
        Goal goal;
        if (z) {
            return subtreeIds(goalsStore, str);
        }
        Set<String> setAncestorIds = ancestorIds(goalsStore, str);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (String str2 : setAncestorIds) {
            if (C7384Etj.areEqual(str2, str) || ((goalNodeA0B = C3cI.A0B(goalsStore, str2)) != null && (goal = goalNodeA0B.goal) != null && goal.isCompleted())) {
                linkedHashSetA0k.add(str2);
            }
        }
        return linkedHashSetA0k;
    }

    public static final List<Goal> inDisplayOrder(GoalsStore goalsStore, List<Goal> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<Goal> it = list.iterator();
            while (it.hasNext()) {
                if (positionOf(goalsStore, C3cI.A0c(it)) != null) {
                    ArrayList arrayListA0h = C3cG.A0h();
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    for (Goal goal : list) {
                        if (positionOf(goalsStore, goal.id) != null) {
                            arrayListA0h.add(goal);
                        } else {
                            arrayListA0h2.add(goal);
                        }
                    }
                    return AbstractC0878AGe.A0P(arrayListA0h2, AbstractC0878AGe.A0c(arrayListA0h, new C2FI(new G0U[]{new AnonymousClass3(goalsStore), AnonymousClass4.INSTANCE})));
                }
            }
        }
        return list;
    }

    public static final Goal mergeForStore(Goal goal, Goal goal2) {
        String str = goal.title;
        GoalStatus goalStatus = null;
        if (str == null) {
            str = goal2 != null ? goal2.title : null;
        }
        String str2 = goal.summary;
        if (str2 == null) {
            str2 = goal2 != null ? goal2.summary : null;
        }
        String str3 = goal.momentum;
        if (str3 == null) {
            str3 = goal2 != null ? goal2.momentum : null;
        }
        GoalMomentumStatus goalMomentumStatus = goal.momentumStatus;
        if (goalMomentumStatus == null) {
            goalMomentumStatus = goal2 != null ? goal2.momentumStatus : null;
        }
        String str4 = goal.description;
        if (str4 == null) {
            str4 = goal2 != null ? goal2.description : null;
        }
        String str5 = goal.emoji;
        if (str5 == null) {
            str5 = goal2 != null ? goal2.emoji : null;
        }
        String str6 = goal.imageUrl;
        if (str6 == null) {
            str6 = goal2 != null ? goal2.imageUrl : null;
        }
        String str7 = goal.createdAt;
        if (str7 == null) {
            str7 = goal2 != null ? goal2.createdAt : null;
        }
        Integer num = goal.sortOrder;
        if (num == null) {
            num = goal2 != null ? goal2.sortOrder : null;
        }
        Long l = goal.fixedPosition;
        if (l == null) {
            l = goal2 != null ? goal2.fixedPosition : null;
        }
        String str8 = goal.sessionId;
        if (str8 == null) {
            str8 = goal2 != null ? goal2.sessionId : null;
        }
        Boolean bool = goal.isThread;
        if (bool == null) {
            bool = goal2 != null ? goal2.isThread : null;
        }
        GoalStatus goalStatus2 = goal.status;
        if (goalStatus2 != null) {
            goalStatus = goalStatus2;
        } else if (goal2 != null) {
            goalStatus = goal2.status;
        }
        return goal.copy(goal.id, str, str2, str3, goalMomentumStatus, str4, str5, str6, str7, goal.parentGoalId, num, l, null, str8, bool, goalStatus);
    }

    public static final GoalsStore mergeGoalDetail(GoalsStore goalsStore, GoalDetail goalDetail) {
        AGJ<String, GoalNode> agjA5b = goalsStore.goalsById.A5b();
        Goal goal = goalDetail.goal;
        putGoalTree(agjA5b, goal, goal.parentGoalId, true, 0);
        return pruneStaleExtras(GoalsStore.copy$default(goalsStore, agjA5b.A5S(), null, null, goalsStore.goalExtras.AYj(goalDetail.goal.id, new GoalDetailExtras(goalDetail.updates, goalDetail.associations)), null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524278, null));
    }

    public static final Long positionOf(GoalsStore goalsStore, String str) {
        Goal goal;
        Long l = goalsStore.pendingPins.get(str);
        if (l != null) {
            return l;
        }
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
        if (goalNodeA0B == null || (goal = goalNodeA0B.goal) == null) {
            return null;
        }
        return goal.fixedPosition;
    }

    public static final GoalsStore pruneStaleExtras(GoalsStore goalsStore) {
        Set<String> setKeySet = goalsStore.goalExtras.keySet();
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : setKeySet) {
            if (!goalsStore.goalsById.containsKey(str)) {
                arrayListA0h.add(str);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return goalsStore;
        }
        AGJ<String, GoalDetailExtras> agjA5b = goalsStore.goalExtras.A5b();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            agjA5b.remove(it.next());
        }
        return GoalsStore.copy$default(goalsStore, null, null, null, agjA5b.A5S(), null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524279, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e A[PHI: r2 r6
  0x011e: PHI (r2v4 X.AHH) = (r2v9 X.AHH), (r2v10 X.AHH) binds: [B:15:0x0033, B:63:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x011e: PHI (r6v2 java.lang.String) = (r6v6 java.lang.String), (r6v8 java.lang.String) binds: [B:15:0x0033, B:63:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void putGoalTree(java.util.Map<java.lang.String, com.facebook.aura.library.repo.GoalNode> r25, com.facebook.aura.library.repo.Goal r26, java.lang.String r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt.putGoalTree(java.util.Map, com.facebook.aura.library.repo.Goal, java.lang.String, boolean, int):void");
    }

    public static /* synthetic */ void putGoalTree$default(Map map, Goal goal, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        putGoalTree(map, goal, str, z, i);
    }

    public static final InterfaceC0962AJp<String, GoalNode> putGoalTrees(GoalsStore goalsStore, List<Goal> list, boolean z) {
        AGJ<String, GoalNode> agjA5b = goalsStore.goalsById.A5b();
        for (Goal goal : list) {
            putGoalTree(agjA5b, goal, goal.parentGoalId, z, 0);
        }
        return agjA5b.A5S();
    }

    public static final GoalsStore removeGoalSubtree(GoalsStore goalsStore, String str) {
        GoalNode goalNodeA0P;
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
        if (goalNodeA0B == null) {
            return goalsStore;
        }
        Set<String> setSubtreeIds = subtreeIds(goalsStore, str);
        AGJ<String, GoalNode> agjA5b = goalsStore.goalsById.A5b();
        AGJ<String, GoalDetailExtras> agjA5b2 = goalsStore.goalExtras.A5b();
        for (String str2 : setSubtreeIds) {
            agjA5b.remove(str2);
            agjA5b2.remove(str2);
        }
        String str3 = goalNodeA0B.goal.parentGoalId;
        if (str3 != null && (goalNodeA0P = C3cH.A0P(str3, agjA5b)) != null) {
            C3cI.A1D(goalNodeA0P, str3, agjA5b, C3cJ.A0U(goalNodeA0P.childIds, str));
        }
        return GoalsStore.copy$default(goalsStore, agjA5b.A5S(), goalsStore.listOrder.Aai(setSubtreeIds), goalsStore.trackingOrder.Aai(setSubtreeIds), agjA5b2.A5S(), null, null, null, false, false, null, false, false, goalsStore.completedOrder.Aai(setSubtreeIds), null, null, false, false, null, null, 520176, null);
    }

    public static final GoalsStore restoreGoalSubtreeFrom(GoalsStore goalsStore, GoalsStore goalsStore2, String str) {
        Goal goal;
        String str2;
        GoalDetailExtras goalDetailExtras;
        GoalNode goalNode;
        Set<String> setSubtreeIds = subtreeIds(goalsStore2, str);
        if (setSubtreeIds.isEmpty()) {
            return goalsStore;
        }
        AGJ<String, GoalNode> agjA5b = goalsStore.goalsById.A5b();
        AGJ<String, GoalDetailExtras> agjA5b2 = goalsStore.goalExtras.A5b();
        for (String str3 : setSubtreeIds) {
            if (!agjA5b.containsKey(str3) && (goalNode = goalsStore2.goalsById.get(str3)) != null) {
                agjA5b.put(str3, goalNode);
            }
            if (!agjA5b2.containsKey(str3) && (goalDetailExtras = goalsStore2.goalExtras.get(str3)) != null) {
                agjA5b2.put(str3, goalDetailExtras);
            }
        }
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore2, str);
        if (goalNodeA0B != null && (goal = goalNodeA0B.goal) != null && (str2 = goal.parentGoalId) != null) {
            GoalNode goalNodeA0P = C3cH.A0P(str2, agjA5b);
            GoalNode goalNodeA0B2 = C3cI.A0B(goalsStore2, str2);
            if (goalNodeA0P != null && goalNodeA0B2 != null) {
                C3cI.A1D(goalNodeA0P, str2, agjA5b, restoreIdsFrom(goalNodeA0P.childIds, goalNodeA0B2.childIds, Collections.singleton(str)));
            }
        }
        return GoalsStore.copy$default(goalsStore, agjA5b.A5S(), restoreIdsFrom(goalsStore.listOrder, goalsStore2.listOrder, setSubtreeIds), restoreIdsFrom(goalsStore.trackingOrder, goalsStore2.trackingOrder, setSubtreeIds), agjA5b2.A5S(), null, null, null, false, false, null, false, false, restoreIdsFrom(goalsStore.completedOrder, goalsStore2.completedOrder, setSubtreeIds), null, null, false, false, null, null, 520176, null);
    }

    public static final GoalsState toCompletedState(GoalsStore goalsStore) {
        return new GoalsState(buildTrees(goalsStore, goalsStore.completedOrder), goalsStore.completedLoadingState, goalsStore.completedHasNextPage, goalsStore.isLoadingMoreCompleted, goalsStore.sessionCompleted);
    }

    public static final GoalsState toGoalsState(GoalsStore goalsStore) {
        return new GoalsState(buildTrees(goalsStore, goalsStore.listOrder), goalsStore.listLoadingState, goalsStore.listHasNextPage, goalsStore.isLoadingMoreList, goalsStore.sessionCompleted);
    }

    public static final GoalsState toTrackingState(GoalsStore goalsStore) {
        return new GoalsState(buildTrees(goalsStore, goalsStore.trackingOrder), goalsStore.trackingLoadingState, goalsStore.trackingHasNextPage, goalsStore.isLoadingMoreTracking, goalsStore.sessionCompleted);
    }

    public static final GoalsStore withGoalText(GoalsStore goalsStore, String str, String str2, String str3) {
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
        if (goalNodeA0B == null || (C7384Etj.areEqual(goalNodeA0B.goal.title, str2) && C7384Etj.areEqual(goalNodeA0B.goal.description, str3))) {
            return goalsStore;
        }
        InterfaceC0962AJp<String, GoalNode> interfaceC0962AJp = goalsStore.goalsById;
        Goal goalCopy$default = Goal.copy$default(goalNodeA0B.goal, null, str2, null, null, null, str3, null, null, null, null, null, null, null, null, null, null, 65501, null);
        AHH<String> ahh = goalNodeA0B.childIds;
        AnonymousClass003.A0u(goalCopy$default, ahh);
        return GoalsStore.copy$default(goalsStore, interfaceC0962AJp.AYj(str, new GoalNode(goalCopy$default, ahh)), null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524286, null);
    }

    public static final GoalsStore withParentLink(GoalsStore goalsStore, String str, String str2) {
        GoalNode goalNodeA0P;
        GoalNode goalNodeA0P2;
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
        if (goalNodeA0B != null) {
            String str3 = goalNodeA0B.goal.parentGoalId;
            if (!C7384Etj.areEqual(str3, str2)) {
                AGJ<String, GoalNode> agjA5b = goalsStore.goalsById.A5b();
                if (str3 != null && (goalNodeA0P2 = C3cH.A0P(str3, agjA5b)) != null) {
                    C3cI.A1D(goalNodeA0P2, str3, agjA5b, C3cJ.A0U(goalNodeA0P2.childIds, str));
                }
                Goal goalCopy$default = Goal.copy$default(goalNodeA0B.goal, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, 65023, null);
                AHH<String> ahh = goalNodeA0B.childIds;
                AnonymousClass003.A0u(goalCopy$default, ahh);
                agjA5b.put(str, new GoalNode(goalCopy$default, ahh));
                if (str2 != null && (goalNodeA0P = C3cH.A0P(str2, agjA5b)) != null && !goalNodeA0P.childIds.contains(str)) {
                    C3cI.A1D(goalNodeA0P, str2, agjA5b, goalNodeA0P.childIds.A34(str));
                }
                return GoalsStore.copy$default(goalsStore, agjA5b.A5S(), null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524286, null);
            }
        }
        return goalsStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final GoalsStore withPendingPins(GoalsStore goalsStore, Map<String, Long> map) {
        Goal goal;
        Long l;
        AGJ<String, Long> agjA5b = goalsStore.pendingPins.A5b();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            long jA05 = C3cG.A05(entryA0l.getValue());
            GoalNode goalNodeA0B = C3cI.A0B(goalsStore, key);
            if (goalNodeA0B == null || (goal = goalNodeA0B.goal) == null || (l = goal.fixedPosition) == null || l.longValue() != jA05) {
                agjA5b.put(key, Long.valueOf(jA05));
            } else {
                agjA5b.remove(key);
            }
        }
        return GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, agjA5b.A5S(), 262143, null);
    }

    public static final GoalsStore withoutPendingPin(GoalsStore goalsStore, String str) {
        return goalsStore.pendingPins.containsKey(str) ? GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, goalsStore.pendingPins.AaZ(str), 262143, null) : goalsStore;
    }

    public static final Set<String> ancestorIds(GoalsStore goalsStore, String str) {
        Goal goal;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        while (str != null && linkedHashSetA0k.size() < 8 && linkedHashSetA0k.add(str)) {
            GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
            if (goalNodeA0B == null || (goal = goalNodeA0B.goal) == null) {
                break;
            }
            str = goal.parentGoalId;
        }
        return linkedHashSetA0k;
    }

    public static final AHD<Goal> buildTrees(GoalsStore goalsStore, List<String> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Goal goalBuildTree = buildTree(goalsStore, AnonymousClass005.A0j(it), 0);
            if (goalBuildTree != null) {
                arrayListA0h.add(goalBuildTree);
            }
        }
        return AGI.A07(inDisplayOrder(goalsStore, arrayListA0h));
    }

    public static final List<String> displayedOrder(GoalsStore goalsStore, List<String> list) {
        Goal goal;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            GoalNode goalNodeA0B = C3cI.A0B(goalsStore, it.next());
            if (goalNodeA0B != null && (goal = goalNodeA0B.goal) != null) {
                arrayListA0h.add(goal);
            }
        }
        List<Goal> listInDisplayOrder = inDisplayOrder(goalsStore, arrayListA0h);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listInDisplayOrder);
        Iterator<Goal> it2 = listInDisplayOrder.iterator();
        while (it2.hasNext()) {
            C3cI.A1R(arrayListA0i, it2);
        }
        return arrayListA0i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r8 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Long> placementFor(com.facebook.aura.library.repo.GoalsStore r9, java.util.List<java.lang.String> r10, java.lang.String r11) {
        /*
            X.AbK r1 = X.AbstractC0878AGe.A0h(r10)
            int r0 = X.AnonymousClass005.A0C(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L11:
            boolean r0 = r5.hasNext()
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r8 = 1
            if (r0 == 0) goto L31
            java.lang.Object r1 = r5.next()
            X.BRq r1 = (X.C2273BRq) r1
            int r0 = r1.A00
            T r4 = r1.A01
            int r0 = r0 + 1
            long r0 = (long) r0
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.put(r4, r0)
            goto L11
        L31:
            if (r11 == 0) goto L4a
            int r4 = r10.indexOf(r11)
            if (r4 < 0) goto L4a
            int r0 = r4 + (-1)
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            r7 = 0
            if (r0 == 0) goto L4b
            java.lang.Long r1 = positionOf(r9, r0)
            if (r1 != 0) goto L4c
        L4a:
            return r6
        L4b:
            r1 = r7
        L4c:
            int r0 = r4 + 1
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5a
            java.lang.Long r7 = positionOf(r9, r0)
        L5a:
            if (r1 != 0) goto L7e
            if (r7 == 0) goto L75
            long r2 = r7.longValue()
            r0 = 2
            long r2 = r2 / r0
        L65:
            r1 = 1
        L66:
            if (r7 == 0) goto L71
            long r4 = r7.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L71
            r8 = 0
        L71:
            if (r1 == 0) goto L4a
            if (r8 == 0) goto L4a
        L75:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.Map r0 = java.util.Collections.singletonMap(r11, r0)
            return r0
        L7e:
            long r4 = r1.longValue()
            if (r7 == 0) goto L8c
            long r2 = r7.longValue()
            long r2 = r2 - r4
            r0 = 2
            long r2 = r2 / r0
        L8c:
            long r2 = r2 + r4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L66
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt.placementFor(com.facebook.aura.library.repo.GoalsStore, java.util.List, java.lang.String):java.util.Map");
    }

    public static final void removeNodeSubtree(Map<String, GoalNode> map, String str, int i) {
        GoalNode goalNodeRemove = map.remove(str);
        if (goalNodeRemove == null || i >= 8) {
            return;
        }
        Iterator it = goalNodeRemove.childIds.iterator();
        while (it.hasNext()) {
            removeNodeSubtree(map, AnonymousClass005.A0j(it), i + 1);
        }
    }

    public static final AHH<String> restoreIdsFrom(AHH<String> ahh, List<String> list, Set<String> set) {
        int i;
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(ahh);
        int i2 = 0;
        for (String str : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0885AGm.A14();
            } else {
                if (set.contains(str) && !arrayListA0R.contains(str)) {
                    List listA0a = AbstractC0878AGe.A0a(list, i2);
                    if ((listA0a instanceof Collection) && listA0a.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = listA0a.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (arrayListA0R.contains(it.next()) && (i = i + 1) < 0) {
                                AbstractC0885AGm.A13();
                            }
                        }
                    }
                    arrayListA0R.add(i, str);
                }
                i2 = i3;
            }
            throw F60.createAndThrow();
        }
        return AGI.A0C(arrayListA0R);
    }

    public static final AHH<String> rootOrder(GoalsStore goalsStore, GoalListSection goalListSection) {
        int iOrdinal = goalListSection.ordinal();
        if (iOrdinal == 0) {
            return goalsStore.listOrder;
        }
        if (iOrdinal == 1) {
            return goalsStore.trackingOrder;
        }
        throw C3cG.A0q();
    }

    public static final Set<String> subtreeIds(GoalsStore goalsStore, String str) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        subtreeIds$collect(goalsStore, linkedHashSetA0k, str, 0);
        return linkedHashSetA0k;
    }

    public static final void subtreeIds$collect(GoalsStore goalsStore, LinkedHashSet<String> linkedHashSet, String str, int i) {
        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
        if (goalNodeA0B == null || !linkedHashSet.add(str) || i >= 8) {
            return;
        }
        Iterator it = goalNodeA0B.childIds.iterator();
        while (it.hasNext()) {
            subtreeIds$collect(goalsStore, linkedHashSet, AnonymousClass005.A0j(it), i + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[PHI: r9
  0x00d3: PHI (r9v1 com.facebook.aura.library.repo.Goal) = 
  (r9v0 com.facebook.aura.library.repo.Goal)
  (r9v6 com.facebook.aura.library.repo.Goal)
  (r9v6 com.facebook.aura.library.repo.Goal)
  (r9v6 com.facebook.aura.library.repo.Goal)
 binds: [B:17:0x0067, B:19:0x006b, B:21:0x006f, B:25:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.repo.GoalsStore withCompletion(com.facebook.aura.library.repo.GoalsStore r25, java.util.Set<java.lang.String> r26, java.lang.String r27, boolean r28) {
        /*
            boolean r0 = r26.isEmpty()
            r7 = r25
            if (r0 == 0) goto L9
            return r25
        L9:
            X.AJp<java.lang.String, com.facebook.aura.library.repo.GoalNode> r0 = r7.goalsById
            X.AGJ r2 = r0.A5b()
            java.util.Iterator r6 = r26.iterator()
        L13:
            boolean r0 = r6.hasNext()
            r9 = 0
            r5 = r28
            if (r0 == 0) goto L61
            java.lang.Object r4 = r6.next()
            com.facebook.aura.library.repo.GoalNode r1 = X.C3cH.A0P(r4, r2)
            if (r1 == 0) goto L13
            com.facebook.aura.library.repo.Goal r8 = r1.goal
            boolean r0 = r8.isCompleted()
            if (r0 == r5) goto L13
            if (r28 == 0) goto L5e
            com.facebook.aura.library.repo.GoalStatus r24 = com.facebook.aura.library.repo.GoalStatus.COMPLETED
        L32:
            r25 = 32767(0x7fff, float:4.5916E-41)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r26 = r9
            com.facebook.aura.library.repo.Goal r3 = com.facebook.aura.library.repo.Goal.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.AHH<java.lang.String> r1 = r1.childIds
            X.AnonymousClass003.A0u(r3, r1)
            com.facebook.aura.library.repo.GoalNode r0 = new com.facebook.aura.library.repo.GoalNode
            r0.<init>(r3, r1)
            r2.put(r4, r0)
            goto L13
        L5e:
            com.facebook.aura.library.repo.GoalStatus r24 = com.facebook.aura.library.repo.GoalStatus.ACTIVE
            goto L32
        L61:
            r4 = r27
            com.facebook.aura.library.repo.GoalNode r0 = X.C3cI.A0B(r7, r4)
            if (r0 == 0) goto Ld3
            com.facebook.aura.library.repo.Goal r9 = r0.goal
            if (r9 == 0) goto Ld3
            java.lang.String r0 = r9.parentGoalId
            if (r0 != 0) goto Ld3
            X.AHH<java.lang.String> r3 = r7.completedOrder
            if (r28 == 0) goto Lc5
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto Ld3
            X.AHH<java.lang.String> r0 = r7.completedOrder
            X.AHH r3 = r0.A34(r4)
        L81:
            if (r28 != 0) goto Lc2
            if (r9 == 0) goto Lc2
            java.lang.String r0 = r9.parentGoalId
            if (r0 != 0) goto Lc2
            X.AHH<java.lang.String> r0 = r7.listOrder
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto Lc2
            X.AHH<java.lang.String> r1 = r7.listOrder
            r0 = 0
            X.AHH r9 = r1.A3D(r4, r0)
        L98:
            X.AJp r8 = r2.A5S()
            r27 = 520188(0x7effc, float:7.28939E-40)
            r10 = 0
            r15 = 0
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r16 = r15
            r17 = r10
            r18 = r15
            r19 = r15
            r20 = r3
            r21 = r10
            r22 = r10
            r23 = r15
            r24 = r15
            r25 = r10
            r26 = r10
            r28 = r10
            com.facebook.aura.library.repo.GoalsStore r0 = com.facebook.aura.library.repo.GoalsStore.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        Lc2:
            X.AHH<java.lang.String> r9 = r7.listOrder
            goto L98
        Lc5:
            X.AHF r3 = (X.AHF) r3
            int r1 = r3.indexOf(r4)
            r0 = -1
            if (r1 == r0) goto L81
            X.AHH r3 = r3.Aam(r1)
            goto L81
        Ld3:
            X.AHH<java.lang.String> r3 = r7.completedOrder
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt.withCompletion(com.facebook.aura.library.repo.GoalsStore, java.util.Set, java.lang.String, boolean):com.facebook.aura.library.repo.GoalsStore");
    }
}
