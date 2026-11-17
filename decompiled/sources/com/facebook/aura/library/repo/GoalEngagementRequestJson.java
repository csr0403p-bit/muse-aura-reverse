package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class GoalEngagementRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String event_type;
    public final JsonObject metadata;
    public final String surface;
    public final Double value;

    public final class Companion {
        public final C9hr<GoalEngagementRequestJson> serializer() {
            return GoalEngagementRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GoalEngagementRequestJson(String str, String str2, Double d, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        this.event_type = str;
        this.surface = str2;
        this.value = d;
        this.metadata = jsonObject;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalEngagementRequestJson goalEngagementRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(goalEngagementRequestJson.event_type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || goalEngagementRequestJson.surface != null) {
            c9j5.AAP(goalEngagementRequestJson.surface, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || goalEngagementRequestJson.value != null) {
            c9j5.AAP(goalEngagementRequestJson.value, C07799it.A00, c9iZ, 2);
        }
        if (zAfR || goalEngagementRequestJson.metadata != null) {
            c9j5.AAP(goalEngagementRequestJson.metadata, JsonObjectSerializer.A01, c9iZ, 3);
        }
    }

    public final GoalEngagementRequestJson copy(String str, String str2, Double d, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        return new GoalEngagementRequestJson(str, str2, d, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalEngagementRequestJson) {
                GoalEngagementRequestJson goalEngagementRequestJson = (GoalEngagementRequestJson) obj;
                if (!C7384Etj.areEqual(this.event_type, goalEngagementRequestJson.event_type) || !C7384Etj.areEqual(this.surface, goalEngagementRequestJson.surface) || !C7384Etj.areEqual(this.value, goalEngagementRequestJson.value) || !C7384Etj.areEqual(this.metadata, goalEngagementRequestJson.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalEngagementRequestJson copy$default(GoalEngagementRequestJson goalEngagementRequestJson, String str, String str2, Double d, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goalEngagementRequestJson.event_type;
        }
        if ((i & 2) != 0) {
            str2 = goalEngagementRequestJson.surface;
        }
        if ((i & 4) != 0) {
            d = goalEngagementRequestJson.value;
        }
        if ((i & 8) != 0) {
            jsonObject = goalEngagementRequestJson.metadata;
        }
        C7384Etj.A0Y(str, 0);
        return new GoalEngagementRequestJson(str, str2, d, jsonObject);
    }

    public final String component1() {
        return this.event_type;
    }

    public final String component2() {
        return this.surface;
    }

    public final Double component3() {
        return this.value;
    }

    public final JsonObject component4() {
        return this.metadata;
    }

    public final String getEvent_type() {
        return this.event_type;
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.event_type) + AnonymousClass006.A0G(this.surface)) * 31) + AnonymousClass006.A0D(this.value)) * 31) + C3cH.A02(this.metadata);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalEngagementRequestJson(int i, String str, String str2, Double d, JsonObject jsonObject, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(GoalEngagementRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.event_type = str;
        if ((i & 2) == 0) {
            this.surface = null;
        } else {
            this.surface = str2;
        }
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = d;
        }
        if ((i & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = jsonObject;
        }
    }

    public /* synthetic */ GoalEngagementRequestJson(String str, String str2, Double d, JsonObject jsonObject, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : jsonObject);
    }
}
