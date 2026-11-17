package com.facebook.aura.status.repo;

import X.AGH;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ActivityDetails extends C06G {
    public final String action;
    public final String commit;
    public final List<String> createdFiles;
    public final Map<String, String> extras;
    public final List<ActivityFile> files;
    public final String finishMessage;
    public final ActivityGoal goal;
    public final Long goalActionCount;
    public final List<ActivityGoalAction> goalActions;
    public final boolean goalActionsHasMore;
    public final boolean goalActionsLazy;
    public final List<ActivityDetailItem> items;
    public final String query;
    public final List<ActivityDetailTask> tasks;
    public final String tool;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetails) {
                ActivityDetails activityDetails = (ActivityDetails) obj;
                if (!C7384Etj.areEqual(this.tool, activityDetails.tool) || !C7384Etj.areEqual(this.query, activityDetails.query) || !C7384Etj.areEqual(this.action, activityDetails.action) || !C7384Etj.areEqual(this.items, activityDetails.items) || !C7384Etj.areEqual(this.tasks, activityDetails.tasks) || !C7384Etj.areEqual(this.files, activityDetails.files) || !C7384Etj.areEqual(this.commit, activityDetails.commit) || !C7384Etj.areEqual(this.goal, activityDetails.goal) || !C7384Etj.areEqual(this.goalActions, activityDetails.goalActions) || !C7384Etj.areEqual(this.finishMessage, activityDetails.finishMessage) || !C7384Etj.areEqual(this.createdFiles, activityDetails.createdFiles) || !C7384Etj.areEqual(this.extras, activityDetails.extras) || !C7384Etj.areEqual(this.goalActionCount, activityDetails.goalActionCount) || this.goalActionsHasMore != activityDetails.goalActionsHasMore || this.goalActionsLazy != activityDetails.goalActionsLazy) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ActivityDetails(String str, String str2, String str3, List list, List list2, List list3, String str4, ActivityGoal activityGoal, List list4, String str5, List list5, Map map, Long l, boolean z, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : activityGoal, (i & 256) != 0 ? null : list4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : list5, (i & 2048) != 0 ? AGH.A0E() : map, (i & 4096) == 0 ? l : null, C3cG.A1K(i & 8192, z), C3cG.A1K(i & 16384, z2));
    }

    public static /* synthetic */ ActivityDetails copy$default(ActivityDetails activityDetails, String str, String str2, String str3, List list, List list2, List list3, String str4, ActivityGoal activityGoal, List list4, String str5, List list5, Map map, Long l, boolean z, boolean z2, int i, Object obj) {
        String str6 = str3;
        List list6 = list;
        List list7 = list2;
        List list8 = list3;
        String str7 = str4;
        ActivityGoal activityGoal2 = activityGoal;
        List list9 = list4;
        String str8 = str5;
        List list10 = list5;
        Map map2 = map;
        Long l2 = l;
        boolean z3 = z;
        boolean z4 = z2;
        if ((i & 1) != 0) {
            str = activityDetails.tool;
        }
        if ((i & 2) != 0) {
            str2 = activityDetails.query;
        }
        if ((i & 4) != 0) {
            str6 = activityDetails.action;
        }
        if ((i & 8) != 0) {
            list6 = activityDetails.items;
        }
        if ((i & 16) != 0) {
            list7 = activityDetails.tasks;
        }
        if ((i & 32) != 0) {
            list8 = activityDetails.files;
        }
        if ((i & 64) != 0) {
            str7 = activityDetails.commit;
        }
        if ((i & 128) != 0) {
            activityGoal2 = activityDetails.goal;
        }
        if ((i & 256) != 0) {
            list9 = activityDetails.goalActions;
        }
        if ((i & 512) != 0) {
            str8 = activityDetails.finishMessage;
        }
        if ((i & 1024) != 0) {
            list10 = activityDetails.createdFiles;
        }
        if ((i & 2048) != 0) {
            map2 = activityDetails.extras;
        }
        if ((i & 4096) != 0) {
            l2 = activityDetails.goalActionCount;
        }
        if ((i & 8192) != 0) {
            z3 = activityDetails.goalActionsHasMore;
        }
        if ((i & 16384) != 0) {
            z4 = activityDetails.goalActionsLazy;
        }
        return activityDetails.copy(str, str2, str6, list6, list7, list8, str7, activityGoal2, list9, str8, list10, map2, l2, z3, z4);
    }

    public final String component1() {
        return this.tool;
    }

    public final String component10() {
        return this.finishMessage;
    }

    public final List<String> component11() {
        return this.createdFiles;
    }

    public final Map<String, String> component12() {
        return this.extras;
    }

    public final Long component13() {
        return this.goalActionCount;
    }

    public final boolean component14() {
        return this.goalActionsHasMore;
    }

    public final boolean component15() {
        return this.goalActionsLazy;
    }

    public final String component2() {
        return this.query;
    }

    public final String component3() {
        return this.action;
    }

    public final List<ActivityDetailItem> component4() {
        return this.items;
    }

    public final List<ActivityDetailTask> component5() {
        return this.tasks;
    }

    public final List<ActivityFile> component6() {
        return this.files;
    }

    public final String component7() {
        return this.commit;
    }

    public final ActivityGoal component8() {
        return this.goal;
    }

    public final List<ActivityGoalAction> component9() {
        return this.goalActions;
    }

    public final ActivityDetails copy(String str, String str2, String str3, List<ActivityDetailItem> list, List<ActivityDetailTask> list2, List<ActivityFile> list3, String str4, ActivityGoal activityGoal, List<ActivityGoalAction> list4, String str5, List<String> list5, Map<String, String> map, Long l, boolean z, boolean z2) {
        C7384Etj.A0Y(map, 11);
        return new ActivityDetails(str, str2, str3, list, list2, list3, str4, activityGoal, list4, str5, list5, map, l, z, z2);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCommit() {
        return this.commit;
    }

    public final List<String> getCreatedFiles() {
        return this.createdFiles;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final List<ActivityFile> getFiles() {
        return this.files;
    }

    public final String getFinishMessage() {
        return this.finishMessage;
    }

    public final ActivityGoal getGoal() {
        return this.goal;
    }

    public final Long getGoalActionCount() {
        return this.goalActionCount;
    }

    public final List<ActivityGoalAction> getGoalActions() {
        return this.goalActions;
    }

    public final boolean getGoalActionsHasMore() {
        return this.goalActionsHasMore;
    }

    public final boolean getGoalActionsLazy() {
        return this.goalActionsLazy;
    }

    public final List<ActivityDetailItem> getItems() {
        return this.items;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<ActivityDetailTask> getTasks() {
        return this.tasks;
    }

    public final String getTool() {
        return this.tool;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass005.A0F(this.extras, ((((((((((((((((((((AnonymousClass006.A0G(this.tool) * 31) + AnonymousClass006.A0G(this.query)) * 31) + AnonymousClass006.A0G(this.action)) * 31) + AnonymousClass006.A0D(this.items)) * 31) + AnonymousClass006.A0D(this.tasks)) * 31) + AnonymousClass006.A0D(this.files)) * 31) + AnonymousClass006.A0G(this.commit)) * 31) + AnonymousClass006.A0D(this.goal)) * 31) + AnonymousClass006.A0D(this.goalActions)) * 31) + AnonymousClass006.A0G(this.finishMessage)) * 31) + AnonymousClass006.A0D(this.createdFiles)) * 31) + C3cH.A02(this.goalActionCount)) * 31, this.goalActionsHasMore), this.goalActionsLazy);
    }

    public String toString() {
        return super.toString();
    }

    public ActivityDetails(String str, String str2, String str3, List<ActivityDetailItem> list, List<ActivityDetailTask> list2, List<ActivityFile> list3, String str4, ActivityGoal activityGoal, List<ActivityGoalAction> list4, String str5, List<String> list5, Map<String, String> map, Long l, boolean z, boolean z2) {
        C7384Etj.A0Y(map, 11);
        this.tool = str;
        this.query = str2;
        this.action = str3;
        this.items = list;
        this.tasks = list2;
        this.files = list3;
        this.commit = str4;
        this.goal = activityGoal;
        this.goalActions = list4;
        this.finishMessage = str5;
        this.createdFiles = list5;
        this.extras = map;
        this.goalActionCount = l;
        this.goalActionsHasMore = z;
        this.goalActionsLazy = z2;
    }

    public ActivityDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, AGH.A0E(), null, false, false);
    }
}
