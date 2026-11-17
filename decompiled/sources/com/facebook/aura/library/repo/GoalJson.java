package com.facebook.aura.library.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalJson extends C06G {
    public final String created_at;
    public final String description;
    public final String emoji;
    public final Long fixed_position;
    public final String goal_id;
    public final String image_url;
    public final Boolean is_thread;
    public final String momentum;
    public final String momentum_status;
    public final String parent_goal_id;
    public final String session_id;
    public final Integer sort_order;
    public final String status;
    public final List<GoalJson> sub_goals;
    public final String summary;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, GoalJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<GoalJson> serializer() {
            return GoalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final GoalJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Long l, List<GoalJson> list, String str11, Boolean bool, String str12) {
        C7384Etj.A0Y(str, 0);
        return new GoalJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, num, l, list, str11, bool, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalJson) {
                GoalJson goalJson = (GoalJson) obj;
                if (!C7384Etj.areEqual(this.goal_id, goalJson.goal_id) || !C7384Etj.areEqual(this.title, goalJson.title) || !C7384Etj.areEqual(this.summary, goalJson.summary) || !C7384Etj.areEqual(this.momentum, goalJson.momentum) || !C7384Etj.areEqual(this.momentum_status, goalJson.momentum_status) || !C7384Etj.areEqual(this.description, goalJson.description) || !C7384Etj.areEqual(this.emoji, goalJson.emoji) || !C7384Etj.areEqual(this.image_url, goalJson.image_url) || !C7384Etj.areEqual(this.created_at, goalJson.created_at) || !C7384Etj.areEqual(this.parent_goal_id, goalJson.parent_goal_id) || !C7384Etj.areEqual(this.sort_order, goalJson.sort_order) || !C7384Etj.areEqual(this.fixed_position, goalJson.fixed_position) || !C7384Etj.areEqual(this.sub_goals, goalJson.sub_goals) || !C7384Etj.areEqual(this.session_id, goalJson.session_id) || !C7384Etj.areEqual(this.is_thread, goalJson.is_thread) || !C7384Etj.areEqual(this.status, goalJson.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalJson copy$default(GoalJson goalJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Long l, List list, String str11, Boolean bool, String str12, int i, Object obj) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        Integer num2 = num;
        Long l2 = l;
        List list2 = list;
        String str23 = str11;
        Boolean bool2 = bool;
        String str24 = str12;
        if ((i & 1) != 0) {
            str13 = goalJson.goal_id;
        }
        if ((i & 2) != 0) {
            str14 = goalJson.title;
        }
        if ((i & 4) != 0) {
            str15 = goalJson.summary;
        }
        if ((i & 8) != 0) {
            str16 = goalJson.momentum;
        }
        if ((i & 16) != 0) {
            str17 = goalJson.momentum_status;
        }
        if ((i & 32) != 0) {
            str18 = goalJson.description;
        }
        if ((i & 64) != 0) {
            str19 = goalJson.emoji;
        }
        if ((i & 128) != 0) {
            str20 = goalJson.image_url;
        }
        if ((i & 256) != 0) {
            str21 = goalJson.created_at;
        }
        if ((i & 512) != 0) {
            str22 = goalJson.parent_goal_id;
        }
        if ((i & 1024) != 0) {
            num2 = goalJson.sort_order;
        }
        if ((i & 2048) != 0) {
            l2 = goalJson.fixed_position;
        }
        if ((i & 4096) != 0) {
            list2 = goalJson.sub_goals;
        }
        if ((i & 8192) != 0) {
            str23 = goalJson.session_id;
        }
        if ((i & 16384) != 0) {
            bool2 = goalJson.is_thread;
        }
        if ((i & 32768) != 0) {
            str24 = goalJson.status;
        }
        String str25 = str16;
        return goalJson.copy(str13, str14, str15, str25, str17, str18, str19, str20, str21, str22, num2, l2, list2, str23, bool2, str24);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalJson goalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(goalJson.goal_id)) {
            c9j5.AAV(goalJson.goal_id, c9iZ, 0);
        }
        if (zAfR || goalJson.title != null) {
            c9j5.AAP(goalJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || goalJson.summary != null) {
            c9j5.AAP(goalJson.summary, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || goalJson.momentum != null) {
            c9j5.AAP(goalJson.momentum, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || goalJson.momentum_status != null) {
            c9j5.AAP(goalJson.momentum_status, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || goalJson.description != null) {
            c9j5.AAP(goalJson.description, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || goalJson.emoji != null) {
            c9j5.AAP(goalJson.emoji, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || goalJson.image_url != null) {
            c9j5.AAP(goalJson.image_url, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || goalJson.created_at != null) {
            c9j5.AAP(goalJson.created_at, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || goalJson.parent_goal_id != null) {
            c9j5.AAP(goalJson.parent_goal_id, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || goalJson.sort_order != null) {
            c9j5.AAP(goalJson.sort_order, C07729ii.A00, c9iZ, 10);
        }
        if (zAfR || goalJson.fixed_position != null) {
            c9j5.AAP(goalJson.fixed_position, C9j1.A00, c9iZ, 11);
        }
        if (zAfR || goalJson.sub_goals != null) {
            c9j5.AAP(goalJson.sub_goals, C3cH.A15(f0cArr, 12), c9iZ, 12);
        }
        if (zAfR || goalJson.session_id != null) {
            c9j5.AAP(goalJson.session_id, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || goalJson.is_thread != null) {
            c9j5.AAP(goalJson.is_thread, C07839ix.A00, c9iZ, 14);
        }
        if (zAfR || goalJson.status != null) {
            c9j5.AAP(goalJson.status, C07779iq.A01, c9iZ, 15);
        }
    }

    public final String component1() {
        return this.goal_id;
    }

    public final String component10() {
        return this.parent_goal_id;
    }

    public final Integer component11() {
        return this.sort_order;
    }

    public final Long component12() {
        return this.fixed_position;
    }

    public final List<GoalJson> component13() {
        return this.sub_goals;
    }

    public final String component14() {
        return this.session_id;
    }

    public final Boolean component15() {
        return this.is_thread;
    }

    public final String component16() {
        return this.status;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.momentum;
    }

    public final String component5() {
        return this.momentum_status;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.emoji;
    }

    public final String component8() {
        return this.image_url;
    }

    public final String component9() {
        return this.created_at;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final Long getFixed_position() {
        return this.fixed_position;
    }

    public final String getGoal_id() {
        return this.goal_id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getMomentum() {
        return this.momentum;
    }

    public final String getMomentum_status() {
        return this.momentum_status;
    }

    public final String getParent_goal_id() {
        return this.parent_goal_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final Integer getSort_order() {
        return this.sort_order;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<GoalJson> getSub_goals() {
        return this.sub_goals;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((AnonymousClass001.A0G(this.goal_id) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.momentum)) * 31) + AnonymousClass006.A0G(this.momentum_status)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0G(this.created_at)) * 31) + AnonymousClass006.A0G(this.parent_goal_id)) * 31) + AnonymousClass006.A0D(this.sort_order)) * 31) + AnonymousClass006.A0D(this.fixed_position)) * 31) + AnonymousClass006.A0D(this.sub_goals)) * 31) + AnonymousClass006.A0G(this.session_id)) * 31) + AnonymousClass006.A0D(this.is_thread)) * 31) + AnonymousClass005.A0H(this.status);
    }

    public final Boolean is_thread() {
        return this.is_thread;
    }

    public final Goal toDomain() {
        AHD ahdA07;
        String str = this.goal_id;
        String str2 = this.title;
        String str3 = this.summary;
        String str4 = this.momentum;
        GoalMomentumStatus momentumStatus = HatchGoalsTabDataSourceJsonKt.parseMomentumStatus(this.momentum_status);
        String str5 = this.description;
        String str6 = this.emoji;
        String str7 = this.image_url;
        String str8 = this.created_at;
        String str9 = this.parent_goal_id;
        Integer num = this.sort_order;
        Long l = this.fixed_position;
        List<GoalJson> list = this.sub_goals;
        if (list != null) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<GoalJson> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().toDomain());
            }
            ahdA07 = AGI.A07(arrayListA0i);
        } else {
            ahdA07 = null;
        }
        return new Goal(str, str2, str3, str4, momentumStatus, str5, str6, str7, str8, str9, num, l, ahdA07, this.session_id, this.is_thread, HatchGoalsTabDataSourceJsonKt.parseGoalStatus(this.status));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Long l, List list, String str11, Boolean bool, String str12, C2hx c2hx) {
        this.goal_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = null;
        } else {
            this.summary = str3;
        }
        if ((i & 8) == 0) {
            this.momentum = null;
        } else {
            this.momentum = str4;
        }
        if ((i & 16) == 0) {
            this.momentum_status = null;
        } else {
            this.momentum_status = str5;
        }
        if ((i & 32) == 0) {
            this.description = null;
        } else {
            this.description = str6;
        }
        if ((i & 64) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str7;
        }
        if ((i & 128) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str8;
        }
        if ((i & 256) == 0) {
            this.created_at = null;
        } else {
            this.created_at = str9;
        }
        if ((i & 512) == 0) {
            this.parent_goal_id = null;
        } else {
            this.parent_goal_id = str10;
        }
        if ((i & 1024) == 0) {
            this.sort_order = null;
        } else {
            this.sort_order = num;
        }
        if ((i & 2048) == 0) {
            this.fixed_position = null;
        } else {
            this.fixed_position = l;
        }
        if ((i & 4096) == 0) {
            this.sub_goals = null;
        } else {
            this.sub_goals = list;
        }
        if ((i & 8192) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str11;
        }
        if ((i & 16384) == 0) {
            this.is_thread = null;
        } else {
            this.is_thread = bool;
        }
        if ((i & 32768) == 0) {
            this.status = null;
        } else {
            this.status = str12;
        }
    }

    public /* synthetic */ GoalJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Long l, List list, String str11, Boolean bool, String str12, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, C3cG.A0e(str2, i & 2), C3cG.A0e(str3, i & 4), C3cG.A0e(str4, i & 8), C3cG.A0e(str5, i & 16), C3cG.A0e(str6, i & 32), C3cG.A0e(str7, i & 64), C3cG.A0e(str8, i & 128), C3cG.A0e(str9, i & 256), C3cG.A0e(str10, i & 512), (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : l, (i & 4096) != 0 ? null : list, C3cG.A0e(str11, i & 8192), (i & 16384) != 0 ? null : bool, C3cI.A0V(i, 32768, str12));
    }

    public GoalJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Long l, List<GoalJson> list, String str11, Boolean bool, String str12) {
        C7384Etj.A0Y(str, 0);
        this.goal_id = str;
        this.title = str2;
        this.summary = str3;
        this.momentum = str4;
        this.momentum_status = str5;
        this.description = str6;
        this.emoji = str7;
        this.image_url = str8;
        this.created_at = str9;
        this.parent_goal_id = str10;
        this.sort_order = num;
        this.fixed_position = l;
        this.sub_goals = list;
        this.session_id = str11;
        this.is_thread = bool;
        this.status = str12;
    }

    public GoalJson() {
        this("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
