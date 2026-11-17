package com.facebook.aura.library.repo;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class GoalUpdateRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final JsonElement fixed_position;
    public final JsonElement parent_goal_id;
    public final String source;
    public final String status;
    public final String title;

    public final class Companion {
        public final C9hr<GoalUpdateRequestJson> serializer() {
            return GoalUpdateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GoalUpdateRequestJson() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ GoalUpdateRequestJson copy$default(GoalUpdateRequestJson goalUpdateRequestJson, String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        JsonElement jsonElement3 = jsonElement;
        JsonElement jsonElement4 = jsonElement2;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = goalUpdateRequestJson.title;
        }
        if ((i & 2) != 0) {
            str6 = goalUpdateRequestJson.description;
        }
        if ((i & 4) != 0) {
            str7 = goalUpdateRequestJson.status;
        }
        if ((i & 8) != 0) {
            jsonElement3 = goalUpdateRequestJson.parent_goal_id;
        }
        if ((i & 16) != 0) {
            jsonElement4 = goalUpdateRequestJson.fixed_position;
        }
        if ((i & 32) != 0) {
            str8 = goalUpdateRequestJson.source;
        }
        return new GoalUpdateRequestJson(str5, str6, str7, jsonElement3, jsonElement4, str8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalUpdateRequestJson goalUpdateRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || goalUpdateRequestJson.title != null) {
            c9j5.AAP(goalUpdateRequestJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || goalUpdateRequestJson.description != null) {
            c9j5.AAP(goalUpdateRequestJson.description, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || goalUpdateRequestJson.status != null) {
            c9j5.AAP(goalUpdateRequestJson.status, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || goalUpdateRequestJson.parent_goal_id != null) {
            c9j5.AAP(goalUpdateRequestJson.parent_goal_id, JsonElementSerializer.A00, c9iZ, 3);
        }
        if (zAfR || goalUpdateRequestJson.fixed_position != null) {
            c9j5.AAP(goalUpdateRequestJson.fixed_position, JsonElementSerializer.A00, c9iZ, 4);
        }
        if (zAfR || goalUpdateRequestJson.source != null) {
            c9j5.AAP(goalUpdateRequestJson.source, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalUpdateRequestJson) {
                GoalUpdateRequestJson goalUpdateRequestJson = (GoalUpdateRequestJson) obj;
                if (!C7384Etj.areEqual(this.title, goalUpdateRequestJson.title) || !C7384Etj.areEqual(this.description, goalUpdateRequestJson.description) || !C7384Etj.areEqual(this.status, goalUpdateRequestJson.status) || !C7384Etj.areEqual(this.parent_goal_id, goalUpdateRequestJson.parent_goal_id) || !C7384Etj.areEqual(this.fixed_position, goalUpdateRequestJson.fixed_position) || !C7384Etj.areEqual(this.source, goalUpdateRequestJson.source)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.status;
    }

    public final JsonElement component4() {
        return this.parent_goal_id;
    }

    public final JsonElement component5() {
        return this.fixed_position;
    }

    public final String component6() {
        return this.source;
    }

    public final GoalUpdateRequestJson copy(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4) {
        return new GoalUpdateRequestJson(str, str2, str3, jsonElement, jsonElement2, str4);
    }

    public final String getDescription() {
        return this.description;
    }

    public final JsonElement getFixed_position() {
        return this.fixed_position;
    }

    public final JsonElement getParent_goal_id() {
        return this.parent_goal_id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0D(this.parent_goal_id)) * 31) + AnonymousClass006.A0D(this.fixed_position)) * 31) + AnonymousClass005.A0H(this.source);
    }

    public String toString() {
        return super.toString();
    }

    public GoalUpdateRequestJson(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4) {
        this.title = str;
        this.description = str2;
        this.status = str3;
        this.parent_goal_id = jsonElement;
        this.fixed_position = jsonElement2;
        this.source = str4;
    }

    public /* synthetic */ GoalUpdateRequestJson(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : jsonElement, (i & 16) != 0 ? null : jsonElement2, (i & 32) != 0 ? null : str4);
    }

    public /* synthetic */ GoalUpdateRequestJson(int i, String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.parent_goal_id = null;
        } else {
            this.parent_goal_id = jsonElement;
        }
        if ((i & 16) == 0) {
            this.fixed_position = null;
        } else {
            this.fixed_position = jsonElement2;
        }
        if ((i & 32) == 0) {
            this.source = null;
        } else {
            this.source = str4;
        }
    }
}
