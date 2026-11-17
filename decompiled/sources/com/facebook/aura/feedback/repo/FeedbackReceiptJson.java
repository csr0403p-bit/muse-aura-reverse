package com.facebook.aura.feedback.repo;

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
public final class FeedbackReceiptJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String created_at;
    public final String entity_id;
    public final String entity_type;
    public final String event_id;
    public final String feedback;
    public final String reason;
    public final String request_id;
    public final String surface;

    public final class Companion {
        public final C9hr<FeedbackReceiptJson> serializer() {
            return FeedbackReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feedback_repo_repo(FeedbackReceiptJson feedbackReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedbackReceiptJson.entity_type)) {
            c9j5.AAV(feedbackReceiptJson.entity_type, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedbackReceiptJson.entity_id)) {
            c9j5.AAV(feedbackReceiptJson.entity_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(feedbackReceiptJson.feedback)) {
            c9j5.AAV(feedbackReceiptJson.feedback, c9iZ, 2);
        }
        if (zAfR || feedbackReceiptJson.reason != null) {
            c9j5.AAP(feedbackReceiptJson.reason, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || feedbackReceiptJson.surface != null) {
            c9j5.AAP(feedbackReceiptJson.surface, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !"".equals(feedbackReceiptJson.event_id)) {
            c9j5.AAV(feedbackReceiptJson.event_id, c9iZ, 5);
        }
        if (zAfR || !"".equals(feedbackReceiptJson.request_id)) {
            c9j5.AAV(feedbackReceiptJson.request_id, c9iZ, 6);
        }
        if (zAfR || !"".equals(feedbackReceiptJson.created_at)) {
            c9j5.AAV(feedbackReceiptJson.created_at, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedbackReceiptJson) {
                FeedbackReceiptJson feedbackReceiptJson = (FeedbackReceiptJson) obj;
                if (!C7384Etj.areEqual(this.entity_type, feedbackReceiptJson.entity_type) || !C7384Etj.areEqual(this.entity_id, feedbackReceiptJson.entity_id) || !C7384Etj.areEqual(this.feedback, feedbackReceiptJson.feedback) || !C7384Etj.areEqual(this.reason, feedbackReceiptJson.reason) || !C7384Etj.areEqual(this.surface, feedbackReceiptJson.surface) || !C7384Etj.areEqual(this.event_id, feedbackReceiptJson.event_id) || !C7384Etj.areEqual(this.request_id, feedbackReceiptJson.request_id) || !C7384Etj.areEqual(this.created_at, feedbackReceiptJson.created_at)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedbackReceiptJson copy$default(FeedbackReceiptJson feedbackReceiptJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackReceiptJson.entity_type;
        }
        if ((i & 2) != 0) {
            str2 = feedbackReceiptJson.entity_id;
        }
        if ((i & 4) != 0) {
            str3 = feedbackReceiptJson.feedback;
        }
        if ((i & 8) != 0) {
            str4 = feedbackReceiptJson.reason;
        }
        if ((i & 16) != 0) {
            str5 = feedbackReceiptJson.surface;
        }
        if ((i & 32) != 0) {
            str6 = feedbackReceiptJson.event_id;
        }
        if ((i & 64) != 0) {
            str7 = feedbackReceiptJson.request_id;
        }
        if ((i & 128) != 0) {
            str8 = feedbackReceiptJson.created_at;
        }
        return feedbackReceiptJson.copy(str, str2, str3, str4, str5, str6, str7, str8);
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

    public final String component5() {
        return this.surface;
    }

    public final String component6() {
        return this.event_id;
    }

    public final String component7() {
        return this.request_id;
    }

    public final String component8() {
        return this.created_at;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getEntity_type() {
        return this.entity_type;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final String getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.created_at, AnonymousClass005.A0I(this.request_id, AnonymousClass005.A0I(this.event_id, (((AnonymousClass005.A0I(this.feedback, AnonymousClass005.A0I(this.entity_id, AnonymousClass001.A0G(this.entity_type))) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass005.A0H(this.surface)) * 31)));
    }

    public /* synthetic */ FeedbackReceiptJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.entity_type = "";
        } else {
            this.entity_type = str;
        }
        if ((i & 2) == 0) {
            this.entity_id = "";
        } else {
            this.entity_id = str2;
        }
        if ((i & 4) == 0) {
            this.feedback = "";
        } else {
            this.feedback = str3;
        }
        if ((i & 8) == 0) {
            this.reason = null;
        } else {
            this.reason = str4;
        }
        if ((i & 16) == 0) {
            this.surface = null;
        } else {
            this.surface = str5;
        }
        if ((i & 32) == 0) {
            this.event_id = "";
        } else {
            this.event_id = str6;
        }
        if ((i & 64) == 0) {
            this.request_id = "";
        } else {
            this.request_id = str7;
        }
        if ((i & 128) == 0) {
            this.created_at = "";
        } else {
            this.created_at = str8;
        }
    }

    public final FeedbackReceiptJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass005.A0z(str6, str7, str8);
        return new FeedbackReceiptJson(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public FeedbackReceiptJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass005.A0z(str6, str7, str8);
        this.entity_type = str;
        this.entity_id = str2;
        this.feedback = str3;
        this.reason = str4;
        this.surface = str5;
        this.event_id = str6;
        this.request_id = str7;
        this.created_at = str8;
    }

    public /* synthetic */ FeedbackReceiptJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8);
    }

    public FeedbackReceiptJson() {
        this("", "", "", null, null, "", "", "");
    }
}
