package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C8j4;

/* loaded from: classes6.dex */
public final class FeedUnitView extends C06G {
    public static final int $stable = 0;
    public final long seenAtMs;
    public final long timespentMs;
    public final String unitId;

    public FeedUnitView(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        this.unitId = str;
        this.timespentMs = j;
        this.seenAtMs = j2;
    }

    public final FeedUnitView copy(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        return new FeedUnitView(str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUnitView) {
                FeedUnitView feedUnitView = (FeedUnitView) obj;
                if (!C7384Etj.areEqual(this.unitId, feedUnitView.unitId) || this.timespentMs != feedUnitView.timespentMs || this.seenAtMs != feedUnitView.seenAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedUnitView copy$default(FeedUnitView feedUnitView, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedUnitView.unitId;
        }
        if ((i & 2) != 0) {
            j = feedUnitView.timespentMs;
        }
        if ((i & 4) != 0) {
            j2 = feedUnitView.seenAtMs;
        }
        return feedUnitView.copy(str, j, j2);
    }

    public final String component1() {
        return this.unitId;
    }

    public final long component2() {
        return this.timespentMs;
    }

    public final long component3() {
        return this.seenAtMs;
    }

    public final long getSeenAtMs() {
        return this.seenAtMs;
    }

    public final long getTimespentMs() {
        return this.timespentMs;
    }

    public final String getUnitId() {
        return this.unitId;
    }

    public int hashCode() {
        return C8j4.A0B(this.seenAtMs, AnonymousClass006.A06(this.timespentMs, AnonymousClass001.A0G(this.unitId)));
    }

    public String toString() {
        return super.toString();
    }
}
