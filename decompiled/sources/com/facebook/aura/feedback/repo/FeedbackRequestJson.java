package com.facebook.aura.feedback.repo;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedbackRequestJson extends C06G {
    public final String entity_id;
    public final String entity_type;
    public final String feedback;
    public final Map<String, String> metadata;
    public final String reason;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, FeedbackRequestJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FeedbackRequestJson> serializer() {
            return FeedbackRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedbackRequestJson) {
                FeedbackRequestJson feedbackRequestJson = (FeedbackRequestJson) obj;
                if (!C7384Etj.areEqual(this.entity_type, feedbackRequestJson.entity_type) || !C7384Etj.areEqual(this.entity_id, feedbackRequestJson.entity_id) || !C7384Etj.areEqual(this.feedback, feedbackRequestJson.feedback) || !C7384Etj.areEqual(this.reason, feedbackRequestJson.reason) || !C7384Etj.areEqual(this.metadata, feedbackRequestJson.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackRequestJson copy$default(FeedbackRequestJson feedbackRequestJson, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackRequestJson.entity_type;
        }
        if ((i & 2) != 0) {
            str2 = feedbackRequestJson.entity_id;
        }
        if ((i & 4) != 0) {
            str3 = feedbackRequestJson.feedback;
        }
        if ((i & 8) != 0) {
            str4 = feedbackRequestJson.reason;
        }
        if ((i & 16) != 0) {
            map = feedbackRequestJson.metadata;
        }
        return feedbackRequestJson.copy(str, str2, str3, str4, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feedback_repo_repo(FeedbackRequestJson feedbackRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(feedbackRequestJson.entity_type, c9iZ, 0);
        c9j5.AAV(feedbackRequestJson.entity_id, c9iZ, 1);
        c9j5.AAV(feedbackRequestJson.feedback, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedbackRequestJson.reason != null) {
            c9j5.AAP(feedbackRequestJson.reason, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !C7384Etj.areEqual(feedbackRequestJson.metadata, AGH.A0E())) {
            c9j5.AAQ(feedbackRequestJson.metadata, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.entity_type;
    }

    public final String component2() {
        return this.entity_id;
    }

    public final String component3() {
        return this.feedback;
    }

    public final String component4() {
        return this.reason;
    }

    public final Map<String, String> component5() {
        return this.metadata;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getEntity_type() {
        return this.entity_type;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.metadata, (AnonymousClass005.A0I(this.feedback, AnonymousClass005.A0I(this.entity_id, AnonymousClass001.A0G(this.entity_type))) + AnonymousClass006.A0G(this.reason)) * 31);
    }

    public FeedbackRequestJson(String str, String str2, String str3, String str4, Map<String, String> map) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(map, 4);
        this.entity_type = str;
        this.entity_id = str2;
        this.feedback = str3;
        this.reason = str4;
        this.metadata = map;
    }

    public final FeedbackRequestJson copy(String str, String str2, String str3, String str4, Map<String, String> map) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(map, 4);
        return new FeedbackRequestJson(str, str2, str3, str4, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedbackRequestJson(String str, String str2, String str3, String str4, Map map, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass006.A0u(i, str4), (i & 16) != 0 ? AGH.A0E() : map);
    }

    public /* synthetic */ FeedbackRequestJson(int i, String str, String str2, String str3, String str4, Map map, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(FeedbackRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.entity_type = str;
        this.entity_id = str2;
        this.feedback = str3;
        this.reason = (i & 8) == 0 ? null : str4;
        if ((i & 16) == 0) {
            this.metadata = AGH.A0E();
        } else {
            this.metadata = map;
        }
    }
}
