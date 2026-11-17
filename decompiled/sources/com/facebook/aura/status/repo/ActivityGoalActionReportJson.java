package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ActivityGoalActionReportJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long next_report_offset;
    public final String report;

    public final class Companion {
        public final C9hr<ActivityGoalActionReportJson> serializer() {
            return ActivityGoalActionReportJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityGoalActionReportJson activityGoalActionReportJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityGoalActionReportJson.report != null) {
            c9j5.AAP(activityGoalActionReportJson.report, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activityGoalActionReportJson.next_report_offset != null) {
            c9j5.AAP(activityGoalActionReportJson.next_report_offset, C9j1.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalActionReportJson) {
                ActivityGoalActionReportJson activityGoalActionReportJson = (ActivityGoalActionReportJson) obj;
                if (!C7384Etj.areEqual(this.report, activityGoalActionReportJson.report) || !C7384Etj.areEqual(this.next_report_offset, activityGoalActionReportJson.next_report_offset)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityGoalActionReportJson copy$default(ActivityGoalActionReportJson activityGoalActionReportJson, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityGoalActionReportJson.report;
        }
        if ((i & 2) != 0) {
            l = activityGoalActionReportJson.next_report_offset;
        }
        return new ActivityGoalActionReportJson(str, l);
    }

    public final String component1() {
        return this.report;
    }

    public final Long component2() {
        return this.next_report_offset;
    }

    public final ActivityGoalActionReportJson copy(String str, Long l) {
        return new ActivityGoalActionReportJson(str, l);
    }

    public final Long getNext_report_offset() {
        return this.next_report_offset;
    }

    public final String getReport() {
        return this.report;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.report) * 31) + C3cH.A02(this.next_report_offset);
    }

    public final ActivityGoalActionReportChunk toDomain() {
        String str = this.report;
        if (str == null) {
            str = "";
        }
        return new ActivityGoalActionReportChunk(str, this.next_report_offset);
    }

    public ActivityGoalActionReportJson(String str, Long l) {
        this.report = str;
        this.next_report_offset = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityGoalActionReportJson(int i, String str, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.report = null;
        } else {
            this.report = str;
        }
        if ((i & 2) == 0) {
            this.next_report_offset = null;
        } else {
            this.next_report_offset = l;
        }
    }

    public /* synthetic */ ActivityGoalActionReportJson(String str, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }

    public ActivityGoalActionReportJson() {
        this(null, null);
    }
}
