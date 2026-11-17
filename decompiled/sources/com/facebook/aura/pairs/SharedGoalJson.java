package com.facebook.aura.pairs;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class SharedGoalJson extends C06G {
    public static final int $stable = 8;
    public final Integer completed_tasks;
    public final String description;
    public final String goal_id;
    public final String revision;
    public final String status;
    public final String summary;
    public final List<JsonElement> tasks;
    public final String title;
    public final Integer total_tasks;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, SharedGoalJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<SharedGoalJson> serializer() {
            return SharedGoalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedGoalJson) {
                SharedGoalJson sharedGoalJson = (SharedGoalJson) obj;
                if (!C7384Etj.areEqual(this.goal_id, sharedGoalJson.goal_id) || !C7384Etj.areEqual(this.title, sharedGoalJson.title) || !C7384Etj.areEqual(this.summary, sharedGoalJson.summary) || !C7384Etj.areEqual(this.description, sharedGoalJson.description) || !C7384Etj.areEqual(this.status, sharedGoalJson.status) || !C7384Etj.areEqual(this.revision, sharedGoalJson.revision) || !C7384Etj.areEqual(this.tasks, sharedGoalJson.tasks) || !C7384Etj.areEqual(this.total_tasks, sharedGoalJson.total_tasks) || !C7384Etj.areEqual(this.completed_tasks, sharedGoalJson.completed_tasks)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedGoalJson copy$default(SharedGoalJson sharedGoalJson, String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedGoalJson.goal_id;
        }
        if ((i & 2) != 0) {
            str2 = sharedGoalJson.title;
        }
        if ((i & 4) != 0) {
            str3 = sharedGoalJson.summary;
        }
        if ((i & 8) != 0) {
            str4 = sharedGoalJson.description;
        }
        if ((i & 16) != 0) {
            str5 = sharedGoalJson.status;
        }
        if ((i & 32) != 0) {
            str6 = sharedGoalJson.revision;
        }
        if ((i & 64) != 0) {
            list = sharedGoalJson.tasks;
        }
        if ((i & 128) != 0) {
            num = sharedGoalJson.total_tasks;
        }
        if ((i & 256) != 0) {
            num2 = sharedGoalJson.completed_tasks;
        }
        return sharedGoalJson.copy(str, str2, str3, str4, str5, str6, list, num, num2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SharedGoalJson sharedGoalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(sharedGoalJson.goal_id)) {
            c9j5.AAV(sharedGoalJson.goal_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(sharedGoalJson.title)) {
            c9j5.AAV(sharedGoalJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(sharedGoalJson.summary)) {
            c9j5.AAV(sharedGoalJson.summary, c9iZ, 2);
        }
        if (zAfR || !"".equals(sharedGoalJson.description)) {
            c9j5.AAV(sharedGoalJson.description, c9iZ, 3);
        }
        if (zAfR || !"".equals(sharedGoalJson.status)) {
            c9j5.AAV(sharedGoalJson.status, c9iZ, 4);
        }
        if (zAfR || !"".equals(sharedGoalJson.revision)) {
            c9j5.AAV(sharedGoalJson.revision, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(sharedGoalJson.tasks)) {
            c9j5.AAQ(sharedGoalJson.tasks, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || sharedGoalJson.total_tasks != null) {
            c9j5.AAP(sharedGoalJson.total_tasks, C07729ii.A00, c9iZ, 7);
        }
        if (zAfR || sharedGoalJson.completed_tasks != null) {
            c9j5.AAP(sharedGoalJson.completed_tasks, C07729ii.A00, c9iZ, 8);
        }
    }

    public final String component1() {
        return this.goal_id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.status;
    }

    public final String component6() {
        return this.revision;
    }

    public final List<JsonElement> component7() {
        return this.tasks;
    }

    public final Integer component8() {
        return this.total_tasks;
    }

    public final Integer component9() {
        return this.completed_tasks;
    }

    public final Integer getCompleted_tasks() {
        return this.completed_tasks;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGoal_id() {
        return this.goal_id;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<JsonElement> getTasks() {
        return this.tasks;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotal_tasks() {
        return this.total_tasks;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.tasks, AnonymousClass005.A0I(this.revision, AnonymousClass005.A0I(this.status, AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.goal_id))))))) + AnonymousClass006.A0D(this.total_tasks)) * 31) + C3cH.A02(this.completed_tasks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedGoalJson(String str, String str2, String str3, String str4, String str5, String str6, List<? extends JsonElement> list, Integer num, Integer num2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, list);
        this.goal_id = str;
        this.title = str2;
        this.summary = str3;
        this.description = str4;
        this.status = str5;
        this.revision = str6;
        this.tasks = list;
        this.total_tasks = num;
        this.completed_tasks = num2;
    }

    public final SharedGoalJson copy(String str, String str2, String str3, String str4, String str5, String str6, List<? extends JsonElement> list, Integer num, Integer num2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, list);
        return new SharedGoalJson(str, str2, str3, str4, str5, str6, list, num, num2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedGoalJson(String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num, Integer num2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? C0881AGi.A00 : list, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2);
    }

    public /* synthetic */ SharedGoalJson(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num, Integer num2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.goal_id = "";
        } else {
            this.goal_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
        if ((i & 32) == 0) {
            this.revision = "";
        } else {
            this.revision = str6;
        }
        if ((i & 64) == 0) {
            this.tasks = C0881AGi.A00;
        } else {
            this.tasks = list;
        }
        if ((i & 128) == 0) {
            this.total_tasks = null;
        } else {
            this.total_tasks = num;
        }
        if ((i & 256) == 0) {
            this.completed_tasks = null;
        } else {
            this.completed_tasks = num2;
        }
    }

    public SharedGoalJson() {
        this("", "", "", "", "", "", C0881AGi.A00, null, null);
    }
}
