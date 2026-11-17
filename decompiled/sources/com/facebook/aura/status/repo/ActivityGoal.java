package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityGoal extends C06G {
    public final String icon;
    public final String id;
    public final String name;
    public final String subtitle;

    public final ActivityGoal copy(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ActivityGoal(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoal) {
                ActivityGoal activityGoal = (ActivityGoal) obj;
                if (!C7384Etj.areEqual(this.id, activityGoal.id) || !C7384Etj.areEqual(this.name, activityGoal.name) || !C7384Etj.areEqual(this.subtitle, activityGoal.subtitle) || !C7384Etj.areEqual(this.icon, activityGoal.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityGoal copy$default(ActivityGoal activityGoal, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityGoal.id;
        }
        if ((i & 2) != 0) {
            str2 = activityGoal.name;
        }
        if ((i & 4) != 0) {
            str3 = activityGoal.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = activityGoal.icon;
        }
        C7384Etj.A0Y(str, 0);
        return new ActivityGoal(str, str2, str3, str4);
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

    public /* synthetic */ ActivityGoal(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public String toString() {
        return super.toString();
    }

    public ActivityGoal(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.name = str2;
        this.subtitle = str3;
        this.icon = str4;
    }

    public ActivityGoal() {
        this("", null, null, null);
    }
}
