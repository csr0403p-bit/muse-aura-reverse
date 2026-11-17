package com.facebook.aura.status.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ActivityListResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<ActivityDayResponseJson> days;
    public final List<ActivityEntry> entries;
    public final String next_cursor;

    public final class Companion {
        public final C9hr<ActivityListResponseJson> serializer() {
            return ActivityListResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ActivityListResponseJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ActivityListResponseJson$Companion$$childSerializers$2.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityListResponseJson) {
                ActivityListResponseJson activityListResponseJson = (ActivityListResponseJson) obj;
                if (!C7384Etj.areEqual(this.days, activityListResponseJson.days) || !C7384Etj.areEqual(this.entries, activityListResponseJson.entries) || !C7384Etj.areEqual(this.next_cursor, activityListResponseJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityListResponseJson copy$default(ActivityListResponseJson activityListResponseJson, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activityListResponseJson.days;
        }
        if ((i & 2) != 0) {
            list2 = activityListResponseJson.entries;
        }
        if ((i & 4) != 0) {
            str = activityListResponseJson.next_cursor;
        }
        return new ActivityListResponseJson(list, list2, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityListResponseJson activityListResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityListResponseJson.days != null) {
            c9j5.AAP(activityListResponseJson.days, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || activityListResponseJson.entries != null) {
            c9j5.AAP(activityListResponseJson.entries, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || activityListResponseJson.next_cursor != null) {
            c9j5.AAP(activityListResponseJson.next_cursor, C07779iq.A01, c9iZ, 2);
        }
    }

    public final List<ActivityDayResponseJson> component1() {
        return this.days;
    }

    public final List<ActivityEntry> component2() {
        return this.entries;
    }

    public final String component3() {
        return this.next_cursor;
    }

    public final ActivityListResponseJson copy(List<ActivityDayResponseJson> list, List<ActivityEntry> list2, String str) {
        return new ActivityListResponseJson(list, list2, str);
    }

    public final List<ActivityDayResponseJson> getDays() {
        return this.days;
    }

    public final List<ActivityEntry> getEntries() {
        return this.entries;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.days) * 31) + AnonymousClass006.A0D(this.entries)) * 31) + AnonymousClass005.A0H(this.next_cursor);
    }

    public ActivityListResponseJson(List<ActivityDayResponseJson> list, List<ActivityEntry> list2, String str) {
        this.days = list;
        this.entries = list2;
        this.next_cursor = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityListResponseJson(int i, List list, List list2, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.days = null;
        } else {
            this.days = list;
        }
        if ((i & 2) == 0) {
            this.entries = null;
        } else {
            this.entries = list2;
        }
        if ((i & 4) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public /* synthetic */ ActivityListResponseJson(List list, List list2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }

    public ActivityListResponseJson() {
        this(null, null, null);
    }
}
