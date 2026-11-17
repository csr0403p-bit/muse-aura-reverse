package com.facebook.aura.status.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityDetailItem extends C06G {
    public final String action;
    public final String query;
    public final String tool;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailItem) {
                ActivityDetailItem activityDetailItem = (ActivityDetailItem) obj;
                if (!C7384Etj.areEqual(this.tool, activityDetailItem.tool) || !C7384Etj.areEqual(this.query, activityDetailItem.query) || !C7384Etj.areEqual(this.action, activityDetailItem.action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityDetailItem copy$default(ActivityDetailItem activityDetailItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailItem.tool;
        }
        if ((i & 2) != 0) {
            str2 = activityDetailItem.query;
        }
        if ((i & 4) != 0) {
            str3 = activityDetailItem.action;
        }
        return new ActivityDetailItem(str, str2, str3);
    }

    public final String component1() {
        return this.tool;
    }

    public final String component2() {
        return this.query;
    }

    public final String component3() {
        return this.action;
    }

    public final ActivityDetailItem copy(String str, String str2, String str3) {
        return new ActivityDetailItem(str, str2, str3);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getTool() {
        return this.tool;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.tool) * 31) + AnonymousClass006.A0G(this.query)) * 31) + AnonymousClass005.A0H(this.action);
    }

    public ActivityDetailItem(String str, String str2, String str3) {
        this.tool = str;
        this.query = str2;
        this.action = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityDetailItem(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ActivityDetailItem() {
        this(null, null, null);
    }
}
