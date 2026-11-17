package com.facebook.aura.analytics.hatch;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchNavigationLogEvent extends C06G {
    public static final int $stable = 0;
    public final String clickPoint;
    public final String destModule;
    public final String eventSubtype;
    public final String sourceModule;
    public final long timestamp;

    public HatchNavigationLogEvent(String str, String str2, String str3, String str4, long j) {
        C7384Etj.A0Y(str2, 1);
        this.sourceModule = str;
        this.destModule = str2;
        this.clickPoint = str3;
        this.eventSubtype = str4;
        this.timestamp = j;
    }

    public final HatchNavigationLogEvent copy(String str, String str2, String str3, String str4, long j) {
        C7384Etj.A0Y(str2, 1);
        return new HatchNavigationLogEvent(str, str2, str3, str4, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNavigationLogEvent) {
                HatchNavigationLogEvent hatchNavigationLogEvent = (HatchNavigationLogEvent) obj;
                if (!C7384Etj.areEqual(this.sourceModule, hatchNavigationLogEvent.sourceModule) || !C7384Etj.areEqual(this.destModule, hatchNavigationLogEvent.destModule) || !C7384Etj.areEqual(this.clickPoint, hatchNavigationLogEvent.clickPoint) || !C7384Etj.areEqual(this.eventSubtype, hatchNavigationLogEvent.eventSubtype) || this.timestamp != hatchNavigationLogEvent.timestamp) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchNavigationLogEvent copy$default(HatchNavigationLogEvent hatchNavigationLogEvent, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchNavigationLogEvent.sourceModule;
        }
        if ((i & 2) != 0) {
            str2 = hatchNavigationLogEvent.destModule;
        }
        if ((i & 4) != 0) {
            str3 = hatchNavigationLogEvent.clickPoint;
        }
        if ((i & 8) != 0) {
            str4 = hatchNavigationLogEvent.eventSubtype;
        }
        if ((i & 16) != 0) {
            j = hatchNavigationLogEvent.timestamp;
        }
        return hatchNavigationLogEvent.copy(str, str2, str3, str4, j);
    }

    public final String component1() {
        return this.sourceModule;
    }

    public final String component2() {
        return this.destModule;
    }

    public final String component3() {
        return this.clickPoint;
    }

    public final String component4() {
        return this.eventSubtype;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final String getClickPoint() {
        return this.clickPoint;
    }

    public final String getDestModule() {
        return this.destModule;
    }

    public final String getEventSubtype() {
        return this.eventSubtype;
    }

    public final String getSourceModule() {
        return this.sourceModule;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.timestamp, (((AnonymousClass005.A0I(this.destModule, AnonymousClass006.A0G(this.sourceModule) * 31) + AnonymousClass006.A0G(this.clickPoint)) * 31) + AnonymousClass005.A0H(this.eventSubtype)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
