package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
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
public final class ActivityGoalActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long action_index;
    public final String agent_id;
    public final String created_at;
    public final Boolean has_report;
    public final String icon;
    public final String id;
    public final String report;
    public final String status;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<ActivityGoalActionJson> serializer() {
            return ActivityGoalActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ActivityGoalActionJson copy$default(ActivityGoalActionJson activityGoalActionJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Boolean bool, int i, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        Long l2 = l;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            str9 = activityGoalActionJson.id;
        }
        if ((i & 2) != 0) {
            str10 = activityGoalActionJson.agent_id;
        }
        if ((i & 4) != 0) {
            str11 = activityGoalActionJson.icon;
        }
        if ((i & 8) != 0) {
            str12 = activityGoalActionJson.title;
        }
        if ((i & 16) != 0) {
            str13 = activityGoalActionJson.subtitle;
        }
        if ((i & 32) != 0) {
            str14 = activityGoalActionJson.report;
        }
        if ((i & 64) != 0) {
            str15 = activityGoalActionJson.status;
        }
        if ((i & 128) != 0) {
            str16 = activityGoalActionJson.created_at;
        }
        if ((i & 256) != 0) {
            l2 = activityGoalActionJson.action_index;
        }
        if ((i & 512) != 0) {
            bool2 = activityGoalActionJson.has_report;
        }
        return new ActivityGoalActionJson(str9, str10, str11, str12, str13, str14, str15, str16, l2, bool2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityGoalActionJson activityGoalActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityGoalActionJson.id != null) {
            c9j5.AAP(activityGoalActionJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activityGoalActionJson.agent_id != null) {
            c9j5.AAP(activityGoalActionJson.agent_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activityGoalActionJson.icon != null) {
            c9j5.AAP(activityGoalActionJson.icon, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activityGoalActionJson.title != null) {
            c9j5.AAP(activityGoalActionJson.title, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activityGoalActionJson.subtitle != null) {
            c9j5.AAP(activityGoalActionJson.subtitle, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || activityGoalActionJson.report != null) {
            c9j5.AAP(activityGoalActionJson.report, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || activityGoalActionJson.status != null) {
            c9j5.AAP(activityGoalActionJson.status, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || activityGoalActionJson.created_at != null) {
            c9j5.AAP(activityGoalActionJson.created_at, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || activityGoalActionJson.action_index != null) {
            c9j5.AAP(activityGoalActionJson.action_index, C9j1.A00, c9iZ, 8);
        }
        if (zAfR || activityGoalActionJson.has_report != null) {
            c9j5.AAP(activityGoalActionJson.has_report, C07839ix.A00, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalActionJson) {
                ActivityGoalActionJson activityGoalActionJson = (ActivityGoalActionJson) obj;
                if (!C7384Etj.areEqual(this.id, activityGoalActionJson.id) || !C7384Etj.areEqual(this.agent_id, activityGoalActionJson.agent_id) || !C7384Etj.areEqual(this.icon, activityGoalActionJson.icon) || !C7384Etj.areEqual(this.title, activityGoalActionJson.title) || !C7384Etj.areEqual(this.subtitle, activityGoalActionJson.subtitle) || !C7384Etj.areEqual(this.report, activityGoalActionJson.report) || !C7384Etj.areEqual(this.status, activityGoalActionJson.status) || !C7384Etj.areEqual(this.created_at, activityGoalActionJson.created_at) || !C7384Etj.areEqual(this.action_index, activityGoalActionJson.action_index) || !C7384Etj.areEqual(this.has_report, activityGoalActionJson.has_report)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final Boolean component10() {
        return this.has_report;
    }

    public final String component2() {
        return this.agent_id;
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
        return this.created_at;
    }

    public final Long component9() {
        return this.action_index;
    }

    public final ActivityGoalActionJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Boolean bool) {
        return new ActivityGoalActionJson(str, str2, str3, str4, str5, str6, str7, str8, l, bool);
    }

    public final Long getAction_index() {
        return this.action_index;
    }

    public final String getAgent_id() {
        return this.agent_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final Boolean getHas_report() {
        return this.has_report;
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
        return (((((((((((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.agent_id)) * 31) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.report)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.created_at)) * 31) + AnonymousClass006.A0D(this.action_index)) * 31) + C3cH.A02(this.has_report);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.status.repo.ActivityGoalAction toDomain() {
        /*
            r10 = this;
            java.lang.String r1 = r10.id
            java.lang.String r2 = r10.agent_id
            java.lang.String r3 = r10.icon
            java.lang.String r4 = r10.title
            java.lang.String r5 = r10.subtitle
            java.lang.String r6 = r10.report
            java.lang.String r7 = r10.status
            java.lang.String r8 = r10.created_at
            java.lang.Long r9 = r10.action_index
            java.lang.Boolean r0 = r10.has_report
            if (r0 == 0) goto L20
            boolean r10 = r0.booleanValue()
        L1a:
            com.facebook.aura.status.repo.ActivityGoalAction r0 = new com.facebook.aura.status.repo.ActivityGoalAction
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L20:
            if (r6 == 0) goto L29
            boolean r0 = X.C7BY.A0j(r6)
            r10 = 1
            if (r0 == 0) goto L1a
        L29:
            r10 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityGoalActionJson.toDomain():com.facebook.aura.status.repo.ActivityGoalAction");
    }

    public ActivityGoalActionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Boolean bool) {
        this.id = str;
        this.agent_id = str2;
        this.icon = str3;
        this.title = str4;
        this.subtitle = str5;
        this.report = str6;
        this.status = str7;
        this.created_at = str8;
        this.action_index = l;
        this.has_report = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityGoalActionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : bool);
    }

    public /* synthetic */ ActivityGoalActionJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str2;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str5;
        }
        if ((i & 32) == 0) {
            this.report = null;
        } else {
            this.report = str6;
        }
        if ((i & 64) == 0) {
            this.status = null;
        } else {
            this.status = str7;
        }
        if ((i & 128) == 0) {
            this.created_at = null;
        } else {
            this.created_at = str8;
        }
        if ((i & 256) == 0) {
            this.action_index = null;
        } else {
            this.action_index = l;
        }
        if ((i & 512) == 0) {
            this.has_report = null;
        } else {
            this.has_report = bool;
        }
    }

    public ActivityGoalActionJson() {
        this(null, null, null, null, null, null, null, null, null, null);
    }
}
