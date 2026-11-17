package com.facebook.aura.status.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ActivityGoalActionsPageJson extends C06G {
    public final List<ActivityGoalActionJson> actions;
    public final long goal_action_count;
    public final String next_cursor;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, ActivityGoalActionsPageJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ActivityGoalActionsPageJson> serializer() {
            return ActivityGoalActionsPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivityGoalActionsPageJson(long j, List<ActivityGoalActionJson> list, String str) {
        C7384Etj.A0Y(list, 1);
        this.goal_action_count = j;
        this.actions = list;
        this.next_cursor = str;
    }

    public final ActivityGoalActionsPageJson copy(long j, List<ActivityGoalActionJson> list, String str) {
        C7384Etj.A0Y(list, 1);
        return new ActivityGoalActionsPageJson(j, list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalActionsPageJson) {
                ActivityGoalActionsPageJson activityGoalActionsPageJson = (ActivityGoalActionsPageJson) obj;
                if (this.goal_action_count != activityGoalActionsPageJson.goal_action_count || !C7384Etj.areEqual(this.actions, activityGoalActionsPageJson.actions) || !C7384Etj.areEqual(this.next_cursor, activityGoalActionsPageJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityGoalActionsPageJson copy$default(ActivityGoalActionsPageJson activityGoalActionsPageJson, long j, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = activityGoalActionsPageJson.goal_action_count;
        }
        if ((i & 2) != 0) {
            list = activityGoalActionsPageJson.actions;
        }
        if ((i & 4) != 0) {
            str = activityGoalActionsPageJson.next_cursor;
        }
        return activityGoalActionsPageJson.copy(j, list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityGoalActionsPageJson activityGoalActionsPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityGoalActionsPageJson.goal_action_count != 0) {
            c9j5.AAN(c9iZ, 0, activityGoalActionsPageJson.goal_action_count);
        }
        if (zAfR || !C3cG.A1L(activityGoalActionsPageJson.actions)) {
            c9j5.AAQ(activityGoalActionsPageJson.actions, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || activityGoalActionsPageJson.next_cursor != null) {
            c9j5.AAP(activityGoalActionsPageJson.next_cursor, C07779iq.A01, c9iZ, 2);
        }
    }

    public final long component1() {
        return this.goal_action_count;
    }

    public final List<ActivityGoalActionJson> component2() {
        return this.actions;
    }

    public final String component3() {
        return this.next_cursor;
    }

    public final List<ActivityGoalActionJson> getActions() {
        return this.actions;
    }

    public final long getGoal_action_count() {
        return this.goal_action_count;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.actions, C3cI.A01(this.goal_action_count)) + AnonymousClass006.A0G(this.next_cursor);
    }

    public final ActivityGoalActionsPage toDomain() {
        long j = this.goal_action_count;
        List<ActivityGoalActionJson> list = this.actions;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<ActivityGoalActionJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new ActivityGoalActionsPage(j, arrayListA0i, this.next_cursor);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityGoalActionsPageJson(int i, long j, List list, String str, C2hx c2hx) {
        this.goal_action_count = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.actions = C0881AGi.A00;
        } else {
            this.actions = list;
        }
        if ((i & 4) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public /* synthetic */ ActivityGoalActionsPageJson(long j, List list, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j, C3cI.A11(list, i), AnonymousClass006.A0t(i, str));
    }

    public ActivityGoalActionsPageJson() {
        this(0L, C0881AGi.A00, null);
    }
}
