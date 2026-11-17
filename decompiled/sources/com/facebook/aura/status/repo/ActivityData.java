package com.facebook.aura.status.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityData extends C06G {
    public final AHD<TimelineDayGroup> days;
    public final ActivityError error;
    public final boolean hasMore;
    public final boolean isLoading;
    public final boolean isLoadingMore;
    public final boolean isRefreshing;
    public final String nextCursor;

    public final ActivityData copy(AHD<TimelineDayGroup> ahd, boolean z, boolean z2, boolean z3, boolean z4, ActivityError activityError, String str) {
        C7384Etj.A0Y(ahd, 0);
        return new ActivityData(ahd, z, z2, z3, z4, activityError, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityData) {
                ActivityData activityData = (ActivityData) obj;
                if (!C7384Etj.areEqual(this.days, activityData.days) || this.hasMore != activityData.hasMore || this.isLoading != activityData.isLoading || this.isLoadingMore != activityData.isLoadingMore || this.isRefreshing != activityData.isRefreshing || !C7384Etj.areEqual(this.error, activityData.error) || !C7384Etj.areEqual(this.nextCursor, activityData.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ActivityData(AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, ActivityError activityError, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), AnonymousClass005.A1P(i, z3), AnonymousClass005.A1Q(i, z4), (i & 32) != 0 ? null : activityError, (i & 64) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityData copy$default(ActivityData activityData, AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, ActivityError activityError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = activityData.days;
        }
        if ((i & 2) != 0) {
            z = activityData.hasMore;
        }
        if ((i & 4) != 0) {
            z2 = activityData.isLoading;
        }
        if ((i & 8) != 0) {
            z3 = activityData.isLoadingMore;
        }
        if ((i & 16) != 0) {
            z4 = activityData.isRefreshing;
        }
        if ((i & 32) != 0) {
            activityError = activityData.error;
        }
        if ((i & 64) != 0) {
            str = activityData.nextCursor;
        }
        return activityData.copy(ahd, z, z2, z3, z4, activityError, str);
    }

    public final AHD<TimelineDayGroup> component1() {
        return this.days;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final boolean component4() {
        return this.isLoadingMore;
    }

    public final boolean component5() {
        return this.isRefreshing;
    }

    public final ActivityError component6() {
        return this.error;
    }

    public final String component7() {
        return this.nextCursor;
    }

    public final AHD<TimelineDayGroup> getDays() {
        return this.days;
    }

    public final ActivityError getError() {
        return this.error;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.days), this.hasMore), this.isLoading), this.isLoadingMore), this.isRefreshing) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass005.A0H(this.nextCursor);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public String toString() {
        return super.toString();
    }

    public ActivityData(AHD<TimelineDayGroup> ahd, boolean z, boolean z2, boolean z3, boolean z4, ActivityError activityError, String str) {
        C7384Etj.A0Y(ahd, 0);
        this.days = ahd;
        this.hasMore = z;
        this.isLoading = z2;
        this.isLoadingMore = z3;
        this.isRefreshing = z4;
        this.error = activityError;
        this.nextCursor = str;
    }

    public ActivityData() {
        this(AHI.A01, false, false, false, false, null, null);
    }
}
