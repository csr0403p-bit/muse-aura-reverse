package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ActivityGoalActionReportChunk extends C06G {
    public final Long nextOffset;
    public final String text;

    public ActivityGoalActionReportChunk(String str, Long l) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.nextOffset = l;
    }

    public final ActivityGoalActionReportChunk copy(String str, Long l) {
        C7384Etj.A0Y(str, 0);
        return new ActivityGoalActionReportChunk(str, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalActionReportChunk) {
                ActivityGoalActionReportChunk activityGoalActionReportChunk = (ActivityGoalActionReportChunk) obj;
                if (!C7384Etj.areEqual(this.text, activityGoalActionReportChunk.text) || !C7384Etj.areEqual(this.nextOffset, activityGoalActionReportChunk.nextOffset)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityGoalActionReportChunk copy$default(ActivityGoalActionReportChunk activityGoalActionReportChunk, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityGoalActionReportChunk.text;
        }
        if ((i & 2) != 0) {
            l = activityGoalActionReportChunk.nextOffset;
        }
        C7384Etj.A0Y(str, 0);
        return new ActivityGoalActionReportChunk(str, l);
    }

    public final String component1() {
        return this.text;
    }

    public final Long component2() {
        return this.nextOffset;
    }

    public final Long getNextOffset() {
        return this.nextOffset;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0D(this.nextOffset);
    }

    public String toString() {
        return super.toString();
    }
}
