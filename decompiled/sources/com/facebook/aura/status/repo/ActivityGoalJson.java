package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivityGoalJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String icon;
    public final String id;
    public final String name;
    public final String subtitle;

    public final class Companion {
        public final C9hr<ActivityGoalJson> serializer() {
            return ActivityGoalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityGoalJson activityGoalJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(activityGoalJson.id)) {
            c9j5.AAV(activityGoalJson.id, c9iZ, 0);
        }
        if (zAfR || activityGoalJson.name != null) {
            c9j5.AAP(activityGoalJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activityGoalJson.subtitle != null) {
            c9j5.AAP(activityGoalJson.subtitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activityGoalJson.icon != null) {
            c9j5.AAP(activityGoalJson.icon, C07779iq.A01, c9iZ, 3);
        }
    }

    public final ActivityGoalJson copy(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ActivityGoalJson(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalJson) {
                ActivityGoalJson activityGoalJson = (ActivityGoalJson) obj;
                if (!C7384Etj.areEqual(this.id, activityGoalJson.id) || !C7384Etj.areEqual(this.name, activityGoalJson.name) || !C7384Etj.areEqual(this.subtitle, activityGoalJson.subtitle) || !C7384Etj.areEqual(this.icon, activityGoalJson.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityGoalJson copy$default(ActivityGoalJson activityGoalJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityGoalJson.id;
        }
        if ((i & 2) != 0) {
            str2 = activityGoalJson.name;
        }
        if ((i & 4) != 0) {
            str3 = activityGoalJson.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = activityGoalJson.icon;
        }
        C7384Etj.A0Y(str, 0);
        return new ActivityGoalJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.icon;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass005.A0H(this.icon);
    }

    public final ActivityGoal toDomain() {
        return new ActivityGoal(this.id, this.name, this.subtitle, this.icon);
    }

    public /* synthetic */ ActivityGoalJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        this.id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ActivityGoalJson(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.name = str2;
        this.subtitle = str3;
        this.icon = str4;
    }

    public /* synthetic */ ActivityGoalJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public ActivityGoalJson() {
        this("", null, null, null);
    }
}
