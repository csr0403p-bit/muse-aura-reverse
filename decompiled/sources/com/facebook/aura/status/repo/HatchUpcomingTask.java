package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchUpcomingTask extends C06G {
    public final String id;
    public final String time;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchUpcomingTask) {
                HatchUpcomingTask hatchUpcomingTask = (HatchUpcomingTask) obj;
                if (!C7384Etj.areEqual(this.id, hatchUpcomingTask.id) || !C7384Etj.areEqual(this.title, hatchUpcomingTask.title) || !C7384Etj.areEqual(this.time, hatchUpcomingTask.time)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchUpcomingTask copy$default(HatchUpcomingTask hatchUpcomingTask, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchUpcomingTask.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchUpcomingTask.title;
        }
        if ((i & 4) != 0) {
            str3 = hatchUpcomingTask.time;
        }
        return hatchUpcomingTask.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.time;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.time, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)));
    }

    public HatchUpcomingTask(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.time = str3;
    }

    public final HatchUpcomingTask copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchUpcomingTask(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
