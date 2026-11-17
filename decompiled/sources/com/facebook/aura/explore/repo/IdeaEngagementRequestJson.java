package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
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
/* loaded from: classes.dex */
public final class IdeaEngagementRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String anchor_id;
    public final String anchor_kind;
    public final String event_type;
    public final String lane;
    public final JsonObject metadata;
    public final String surface;
    public final Double value;

    public final class Companion {
        public final C9hr<IdeaEngagementRequestJson> serializer() {
            return IdeaEngagementRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaEngagementRequestJson(String str, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        this.event_type = str;
        this.surface = str2;
        this.value = d;
        this.anchor_kind = str3;
        this.anchor_id = str4;
        this.lane = str5;
        this.metadata = jsonObject;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaEngagementRequestJson ideaEngagementRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(ideaEngagementRequestJson.event_type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || ideaEngagementRequestJson.surface != null) {
            c9j5.AAP(ideaEngagementRequestJson.surface, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || ideaEngagementRequestJson.value != null) {
            c9j5.AAP(ideaEngagementRequestJson.value, C07799it.A00, c9iZ, 2);
        }
        if (zAfR || ideaEngagementRequestJson.anchor_kind != null) {
            c9j5.AAP(ideaEngagementRequestJson.anchor_kind, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || ideaEngagementRequestJson.anchor_id != null) {
            c9j5.AAP(ideaEngagementRequestJson.anchor_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || ideaEngagementRequestJson.lane != null) {
            c9j5.AAP(ideaEngagementRequestJson.lane, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || ideaEngagementRequestJson.metadata != null) {
            c9j5.AAP(ideaEngagementRequestJson.metadata, JsonObjectSerializer.A01, c9iZ, 6);
        }
    }

    public final IdeaEngagementRequestJson copy(String str, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        return new IdeaEngagementRequestJson(str, str2, d, str3, str4, str5, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaEngagementRequestJson) {
                IdeaEngagementRequestJson ideaEngagementRequestJson = (IdeaEngagementRequestJson) obj;
                if (!C7384Etj.areEqual(this.event_type, ideaEngagementRequestJson.event_type) || !C7384Etj.areEqual(this.surface, ideaEngagementRequestJson.surface) || !C7384Etj.areEqual(this.value, ideaEngagementRequestJson.value) || !C7384Etj.areEqual(this.anchor_kind, ideaEngagementRequestJson.anchor_kind) || !C7384Etj.areEqual(this.anchor_id, ideaEngagementRequestJson.anchor_id) || !C7384Etj.areEqual(this.lane, ideaEngagementRequestJson.lane) || !C7384Etj.areEqual(this.metadata, ideaEngagementRequestJson.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaEngagementRequestJson copy$default(IdeaEngagementRequestJson ideaEngagementRequestJson, String str, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaEngagementRequestJson.event_type;
        }
        if ((i & 2) != 0) {
            str2 = ideaEngagementRequestJson.surface;
        }
        if ((i & 4) != 0) {
            d = ideaEngagementRequestJson.value;
        }
        if ((i & 8) != 0) {
            str3 = ideaEngagementRequestJson.anchor_kind;
        }
        if ((i & 16) != 0) {
            str4 = ideaEngagementRequestJson.anchor_id;
        }
        if ((i & 32) != 0) {
            str5 = ideaEngagementRequestJson.lane;
        }
        if ((i & 64) != 0) {
            jsonObject = ideaEngagementRequestJson.metadata;
        }
        return ideaEngagementRequestJson.copy(str, str2, d, str3, str4, str5, jsonObject);
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

    public final String component4() {
        return this.anchor_kind;
    }

    public final String component5() {
        return this.anchor_id;
    }

    public final String component6() {
        return this.lane;
    }

    public final JsonObject component7() {
        return this.metadata;
    }

    public final String getAnchor_id() {
        return this.anchor_id;
    }

    public final String getAnchor_kind() {
        return this.anchor_kind;
    }

    public final String getEvent_type() {
        return this.event_type;
    }

    public final String getLane() {
        return this.lane;
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
        return ((((((((((AnonymousClass001.A0G(this.event_type) + AnonymousClass006.A0G(this.surface)) * 31) + AnonymousClass006.A0D(this.value)) * 31) + AnonymousClass006.A0G(this.anchor_kind)) * 31) + AnonymousClass006.A0G(this.anchor_id)) * 31) + AnonymousClass006.A0G(this.lane)) * 31) + C06G.A04(this.metadata);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaEngagementRequestJson(String str, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : jsonObject);
    }

    public /* synthetic */ IdeaEngagementRequestJson(int i, String str, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(IdeaEngagementRequestJson$$serializer.descriptor, i, 1);
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
            this.anchor_kind = null;
        } else {
            this.anchor_kind = str3;
        }
        if ((i & 16) == 0) {
            this.anchor_id = null;
        } else {
            this.anchor_id = str4;
        }
        if ((i & 32) == 0) {
            this.lane = null;
        } else {
            this.lane = str5;
        }
        if ((i & 64) == 0) {
            this.metadata = null;
        } else {
            this.metadata = jsonObject;
        }
    }
}
