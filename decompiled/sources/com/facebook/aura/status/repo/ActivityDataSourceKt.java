package com.facebook.aura.status.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.Hr7;
import X.HxE;
import com.facebook.aura.status.repo.GoalActionsUpsert;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ActivityDataSourceKt {
    public static final int ACTIVITY_PAGE_SIZE = 15;
    public static final int GOAL_ACTIONS_PAGE_SIZE = 50;
    public static final int GOAL_ACTION_PREVIEW_SIZE = 10;
    public static final String TAG = "ActivityDataSource";

    public static final String lazyGoalId(ActivityAction activityAction) {
        ActivityGoal activityGoal;
        String str;
        C7384Etj.A0Y(activityAction, 0);
        ActivityDetails activityDetails = activityAction.details;
        if (activityDetails == null || !activityDetails.goalActionsLazy || (activityGoal = activityDetails.goal) == null || (str = activityGoal.id) == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }

    public static final ActivityAction withGoalActions(ActivityAction activityAction, List<ActivityGoalAction> list) {
        ActivityDetails activityDetails = activityAction.details;
        return activityDetails == null ? activityAction : ActivityAction.copy$default(activityAction, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, ActivityDetails.copy$default(activityDetails, null, null, null, null, null, null, null, null, list, null, null, null, null, false, false, 32511, null), 262143, null);
    }

    public static final ActivityAction withGoalActionsFrom(ActivityAction activityAction, ActivityAction activityAction2, GoalActionsUpsert goalActionsUpsert) {
        List list;
        List list2;
        if (C7384Etj.areEqual(goalActionsUpsert, GoalActionsUpsert.Replace.INSTANCE)) {
            return activityAction;
        }
        List<ActivityGoalAction> listA0e = null;
        if (C7384Etj.areEqual(goalActionsUpsert, GoalActionsUpsert.KeepPrevious.INSTANCE)) {
            ActivityDetails activityDetails = activityAction2.details;
            if (activityDetails != null) {
                listA0e = activityDetails.goalActions;
            }
        } else {
            if (!(goalActionsUpsert instanceof GoalActionsUpsert.Merge)) {
                throw C3cG.A0q();
            }
            ActivityDetails activityDetails2 = activityAction.details;
            if (activityDetails2 == null || (list = activityDetails2.goalActions) == null) {
                list = C0881AGi.A00;
            }
            Set setA0f = AbstractC0878AGe.A0f(((GoalActionsUpsert.Merge) goalActionsUpsert).removedIds);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((ActivityGoalAction) it.next()).id;
                if (str != null) {
                    setA0f.add(str);
                }
            }
            ActivityDetails activityDetails3 = activityAction2.details;
            if (activityDetails3 == null || (list2 = activityDetails3.goalActions) == null) {
                list2 = C0881AGi.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : list2) {
                if (!AbstractC0878AGe.A0k(setA0f, ((ActivityGoalAction) obj).id)) {
                    arrayListA0h.add(obj);
                }
            }
            listA0e = AbstractC0878AGe.A0e(AbstractC0878AGe.A0c(AbstractC0878AGe.A0P(list, arrayListA0h), new Comparator() { // from class: com.facebook.aura.status.repo.ActivityDataSourceKt$withGoalActionsFrom$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Long l = ((ActivityGoalAction) t).actionIndex;
                    Long lValueOf = Long.valueOf(l != null ? l.longValue() : Long.MIN_VALUE);
                    Long l2 = ((ActivityGoalAction) t2).actionIndex;
                    return C60Q.A01(lValueOf, l2 != null ? l2.longValue() : Long.MIN_VALUE);
                }
            }), 10);
        }
        return withGoalActions(activityAction, listA0e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AHD<TimelineDayGroup> keepingGoals(AHD<TimelineDayGroup> ahd, Set<String> set, AHD<TimelineDayGroup> ahd2) {
        Object obj;
        if (set.isEmpty()) {
            return ahd;
        }
        ArrayList<ActivityAction> arrayListA0h = C3cG.A0h();
        Iterator it = ahd2.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(((TimelineDayGroup) it.next()).activities, arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (ActivityAction activityAction : arrayListA0h) {
            String strLazyGoalId = lazyGoalId(activityAction);
            if (strLazyGoalId != null) {
                arrayListA0h2.add(new HxE(strLazyGoalId, activityAction));
            }
        }
        Map mapA06 = AGH.A06(arrayListA0h2);
        ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
        for (TimelineDayGroup timelineDayGroup : ahd) {
            AHD<ActivityAction> ahd3 = timelineDayGroup.activities;
            ArrayList arrayList = new ArrayList(Hr7.A1D(ahd3, 10));
            for (ActivityAction activityAction2 : ahd3) {
                String strLazyGoalId2 = lazyGoalId(activityAction2);
                if (strLazyGoalId2 != null && set.contains(strLazyGoalId2) && (obj = mapA06.get(strLazyGoalId2)) != 0) {
                    activityAction2 = obj;
                }
                arrayList.add(activityAction2);
            }
            arrayListA0m.add(timelineDayGroup.copy(timelineDayGroup.date, timelineDayGroup.count, AGI.A07(arrayList)));
        }
        return AGI.A07(arrayListA0m);
    }
}
