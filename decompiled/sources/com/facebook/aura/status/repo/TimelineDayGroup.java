package com.facebook.aura.status.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class TimelineDayGroup extends C06G {
    public final AHD<ActivityAction> activities;
    public final int count;
    public final String date;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimelineDayGroup) {
                TimelineDayGroup timelineDayGroup = (TimelineDayGroup) obj;
                if (!C7384Etj.areEqual(this.date, timelineDayGroup.date) || this.count != timelineDayGroup.count || !C7384Etj.areEqual(this.activities, timelineDayGroup.activities)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimelineDayGroup copy$default(TimelineDayGroup timelineDayGroup, String str, int i, AHD ahd, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = timelineDayGroup.date;
        }
        if ((i2 & 2) != 0) {
            i = timelineDayGroup.count;
        }
        if ((i2 & 4) != 0) {
            ahd = timelineDayGroup.activities;
        }
        return timelineDayGroup.copy(str, i, ahd);
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.count;
    }

    public final AHD<ActivityAction> component3() {
        return this.activities;
    }

    public final AHD<ActivityAction> getActivities() {
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

    public TimelineDayGroup(String str, int i, AHD<ActivityAction> ahd) {
        AnonymousClass003.A0v(str, ahd);
        this.date = str;
        this.count = i;
        this.activities = ahd;
    }

    public final TimelineDayGroup copy(String str, int i, AHD<ActivityAction> ahd) {
        AnonymousClass003.A0v(str, ahd);
        return new TimelineDayGroup(str, i, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
