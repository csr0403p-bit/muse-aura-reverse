package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ActivityDayResponseJson extends C06G {
    public final List<ActivityEntry> activities;
    public final int count;
    public final String date;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, ActivityDayResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ActivityDayResponseJson> serializer() {
            return ActivityDayResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDayResponseJson) {
                ActivityDayResponseJson activityDayResponseJson = (ActivityDayResponseJson) obj;
                if (!C7384Etj.areEqual(this.date, activityDayResponseJson.date) || this.count != activityDayResponseJson.count || !C7384Etj.areEqual(this.activities, activityDayResponseJson.activities)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityDayResponseJson copy$default(ActivityDayResponseJson activityDayResponseJson, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = activityDayResponseJson.date;
        }
        if ((i2 & 2) != 0) {
            i = activityDayResponseJson.count;
        }
        if ((i2 & 4) != 0) {
            list = activityDayResponseJson.activities;
        }
        return activityDayResponseJson.copy(str, i, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityDayResponseJson activityDayResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(activityDayResponseJson.date)) {
            c9j5.AAV(activityDayResponseJson.date, c9iZ, 0);
        }
        if (zAfR || activityDayResponseJson.count != 0) {
            c9j5.AAK(c9iZ, 1, activityDayResponseJson.count);
        }
        if (zAfR || !C3cG.A1L(activityDayResponseJson.activities)) {
            c9j5.AAQ(activityDayResponseJson.activities, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.count;
    }

    public final List<ActivityEntry> component3() {
        return this.activities;
    }

    public final List<ActivityEntry> getActivities() {
        return this.activities;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.activities, (AnonymousClass001.A0G(this.date) + this.count) * 31);
    }

    public ActivityDayResponseJson(String str, int i, List<ActivityEntry> list) {
        AnonymousClass003.A0v(str, list);
        this.date = str;
        this.count = i;
        this.activities = list;
    }

    public final ActivityDayResponseJson copy(String str, int i, List<ActivityEntry> list) {
        AnonymousClass003.A0v(str, list);
        return new ActivityDayResponseJson(str, i, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityDayResponseJson(int i, String str, int i2, List list, C2hx c2hx) {
        this.date = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.count = 0;
        } else {
            this.count = i2;
        }
        if ((i & 4) == 0) {
            this.activities = C0881AGi.A00;
        } else {
            this.activities = list;
        }
    }

    public /* synthetic */ ActivityDayResponseJson(String str, int i, List list, int i2, C06H c06h) {
        this(C3cH.A0Z(i2, str), C3cG.A01(i2, i), C3cI.A12(list, i2));
    }

    public ActivityDayResponseJson() {
        this("", 0, C0881AGi.A00);
    }
}
