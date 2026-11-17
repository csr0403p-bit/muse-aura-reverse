package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityGoalAction extends C06G {
    public final Long actionIndex;
    public final String agentId;
    public final String createdAt;
    public final boolean hasReport;
    public final String icon;
    public final String id;
    public final String report;
    public final String status;
    public final String subtitle;
    public final String title;

    public ActivityGoalAction() {
        this(null, null, null, null, null, null, null, null, null, false);
    }

    public static /* synthetic */ ActivityGoalAction copy$default(ActivityGoalAction activityGoalAction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, boolean z, int i, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        Long l2 = l;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str9 = activityGoalAction.id;
        }
        if ((i & 2) != 0) {
            str10 = activityGoalAction.agentId;
        }
        if ((i & 4) != 0) {
            str11 = activityGoalAction.icon;
        }
        if ((i & 8) != 0) {
            str12 = activityGoalAction.title;
        }
        if ((i & 16) != 0) {
            str13 = activityGoalAction.subtitle;
        }
        if ((i & 32) != 0) {
            str14 = activityGoalAction.report;
        }
        if ((i & 64) != 0) {
            str15 = activityGoalAction.status;
        }
        if ((i & 128) != 0) {
            str16 = activityGoalAction.createdAt;
        }
        if ((i & 256) != 0) {
            l2 = activityGoalAction.actionIndex;
        }
        if ((i & 512) != 0) {
            z2 = activityGoalAction.hasReport;
        }
        return new ActivityGoalAction(str9, str10, str11, str12, str13, str14, str15, str16, l2, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalAction) {
                ActivityGoalAction activityGoalAction = (ActivityGoalAction) obj;
                if (!C7384Etj.areEqual(this.id, activityGoalAction.id) || !C7384Etj.areEqual(this.agentId, activityGoalAction.agentId) || !C7384Etj.areEqual(this.icon, activityGoalAction.icon) || !C7384Etj.areEqual(this.title, activityGoalAction.title) || !C7384Etj.areEqual(this.subtitle, activityGoalAction.subtitle) || !C7384Etj.areEqual(this.report, activityGoalAction.report) || !C7384Etj.areEqual(this.status, activityGoalAction.status) || !C7384Etj.areEqual(this.createdAt, activityGoalAction.createdAt) || !C7384Etj.areEqual(this.actionIndex, activityGoalAction.actionIndex) || this.hasReport != activityGoalAction.hasReport) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.hasReport;
    }

    public final String component2() {
        return this.agentId;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.report;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.createdAt;
    }

    public final Long component9() {
        return this.actionIndex;
    }

    public final ActivityGoalAction copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, boolean z) {
        return new ActivityGoalAction(str, str2, str3, str4, str5, str6, str7, str8, l, z);
    }

    public final Long getActionIndex() {
        return this.actionIndex;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getHasReport() {
        return this.hasReport;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReport() {
        return this.report;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(((((((((((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.agentId)) * 31) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.report)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + C3cH.A02(this.actionIndex)) * 31, this.hasReport);
    }

    public String toString() {
        return super.toString();
    }

    public ActivityGoalAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, boolean z) {
        this.id = str;
        this.agentId = str2;
        this.icon = str3;
        this.title = str4;
        this.subtitle = str5;
        this.report = str6;
        this.status = str7;
        this.createdAt = str8;
        this.actionIndex = l;
        this.hasReport = z;
    }

    public /* synthetic */ ActivityGoalAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : l, C3cG.A1K(i & 512, z));
    }
}
