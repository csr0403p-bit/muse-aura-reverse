package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalUpdateJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String created_at;
    public final String description;
    public final String effective_at;
    public final String goal_id;
    public final String summary;
    public final String title;
    public final String update_id;

    public final class Companion {
        public final C9hr<GoalUpdateJson> serializer() {
            return GoalUpdateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GoalUpdateJson() {
        this("", "", "", null, null, null, null);
    }

    public static /* synthetic */ GoalUpdateJson copy$default(GoalUpdateJson goalUpdateJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            str8 = goalUpdateJson.update_id;
        }
        if ((i & 2) != 0) {
            str9 = goalUpdateJson.goal_id;
        }
        if ((i & 4) != 0) {
            str10 = goalUpdateJson.title;
        }
        if ((i & 8) != 0) {
            str11 = goalUpdateJson.summary;
        }
        if ((i & 16) != 0) {
            str12 = goalUpdateJson.description;
        }
        if ((i & 32) != 0) {
            str13 = goalUpdateJson.effective_at;
        }
        if ((i & 64) != 0) {
            str14 = goalUpdateJson.created_at;
        }
        AnonymousClass005.A0x(str8, str9, str10);
        return new GoalUpdateJson(str8, str9, str10, str11, str12, str13, str14);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalUpdateJson goalUpdateJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(goalUpdateJson.update_id)) {
            c9j5.AAV(goalUpdateJson.update_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(goalUpdateJson.goal_id)) {
            c9j5.AAV(goalUpdateJson.goal_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(goalUpdateJson.title)) {
            c9j5.AAV(goalUpdateJson.title, c9iZ, 2);
        }
        if (zAfR || goalUpdateJson.summary != null) {
            c9j5.AAP(goalUpdateJson.summary, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || goalUpdateJson.description != null) {
            c9j5.AAP(goalUpdateJson.description, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || goalUpdateJson.effective_at != null) {
            c9j5.AAP(goalUpdateJson.effective_at, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || goalUpdateJson.created_at != null) {
            c9j5.AAP(goalUpdateJson.created_at, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalUpdateJson) {
                GoalUpdateJson goalUpdateJson = (GoalUpdateJson) obj;
                if (!C7384Etj.areEqual(this.update_id, goalUpdateJson.update_id) || !C7384Etj.areEqual(this.goal_id, goalUpdateJson.goal_id) || !C7384Etj.areEqual(this.title, goalUpdateJson.title) || !C7384Etj.areEqual(this.summary, goalUpdateJson.summary) || !C7384Etj.areEqual(this.description, goalUpdateJson.description) || !C7384Etj.areEqual(this.effective_at, goalUpdateJson.effective_at) || !C7384Etj.areEqual(this.created_at, goalUpdateJson.created_at)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.update_id;
    }

    public final String component2() {
        return this.goal_id;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.effective_at;
    }

    public final String component7() {
        return this.created_at;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEffective_at() {
        return this.effective_at;
    }

    public final String getGoal_id() {
        return this.goal_id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpdate_id() {
        return this.update_id;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.goal_id, AnonymousClass001.A0G(this.update_id))) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.effective_at)) * 31) + AnonymousClass005.A0H(this.created_at);
    }

    public final GoalUpdate toDomain() {
        return new GoalUpdate(this.update_id, this.goal_id, this.title, this.summary, this.description, this.effective_at, this.created_at);
    }

    public final GoalUpdateJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        return new GoalUpdateJson(str, str2, str3, str4, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalUpdateJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.update_id = "";
        } else {
            this.update_id = str;
        }
        if ((i & 2) == 0) {
            this.goal_id = "";
        } else {
            this.goal_id = str2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.summary = null;
        } else {
            this.summary = str4;
        }
        if ((i & 16) == 0) {
            this.description = null;
        } else {
            this.description = str5;
        }
        if ((i & 32) == 0) {
            this.effective_at = null;
        } else {
            this.effective_at = str6;
        }
        if ((i & 64) == 0) {
            this.created_at = null;
        } else {
            this.created_at = str7;
        }
    }

    public GoalUpdateJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        this.update_id = str;
        this.goal_id = str2;
        this.title = str3;
        this.summary = str4;
        this.description = str5;
        this.effective_at = str6;
        this.created_at = str7;
    }

    public /* synthetic */ GoalUpdateJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
