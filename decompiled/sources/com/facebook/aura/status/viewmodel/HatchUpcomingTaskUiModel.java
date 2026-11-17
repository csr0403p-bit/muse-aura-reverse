package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchUpcomingTaskUiModel extends C06G {
    public final String id;
    public final String scheduledTime;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchUpcomingTaskUiModel) {
                HatchUpcomingTaskUiModel hatchUpcomingTaskUiModel = (HatchUpcomingTaskUiModel) obj;
                if (!C7384Etj.areEqual(this.id, hatchUpcomingTaskUiModel.id) || !C7384Etj.areEqual(this.title, hatchUpcomingTaskUiModel.title) || !C7384Etj.areEqual(this.scheduledTime, hatchUpcomingTaskUiModel.scheduledTime)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchUpcomingTaskUiModel copy$default(HatchUpcomingTaskUiModel hatchUpcomingTaskUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchUpcomingTaskUiModel.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchUpcomingTaskUiModel.title;
        }
        if ((i & 4) != 0) {
            str3 = hatchUpcomingTaskUiModel.scheduledTime;
        }
        return hatchUpcomingTaskUiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.scheduledTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.scheduledTime, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)));
    }

    public HatchUpcomingTaskUiModel(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.scheduledTime = str3;
    }

    public final HatchUpcomingTaskUiModel copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchUpcomingTaskUiModel(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
