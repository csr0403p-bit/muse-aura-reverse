package com.facebook.aura.status.repo;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityPage extends C06G {
    public final AHD<TimelineDayGroup> days;
    public final boolean hasMore;
    public final String nextCursor;

    public ActivityPage(AHD<TimelineDayGroup> ahd, boolean z, String str) {
        C7384Etj.A0Y(ahd, 0);
        this.days = ahd;
        this.hasMore = z;
        this.nextCursor = str;
    }

    public final ActivityPage copy(AHD<TimelineDayGroup> ahd, boolean z, String str) {
        C7384Etj.A0Y(ahd, 0);
        return new ActivityPage(ahd, z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityPage) {
                ActivityPage activityPage = (ActivityPage) obj;
                if (!C7384Etj.areEqual(this.days, activityPage.days) || this.hasMore != activityPage.hasMore || !C7384Etj.areEqual(this.nextCursor, activityPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityPage copy$default(ActivityPage activityPage, AHD ahd, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = activityPage.days;
        }
        if ((i & 2) != 0) {
            z = activityPage.hasMore;
        }
        if ((i & 4) != 0) {
            str = activityPage.nextCursor;
        }
        return activityPage.copy(ahd, z, str);
    }

    public final AHD<TimelineDayGroup> component1() {
        return this.days;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final AHD<TimelineDayGroup> getDays() {
        return this.days;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0E(this.days), this.hasMore) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}
