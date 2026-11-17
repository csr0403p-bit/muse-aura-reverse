package com.facebook.aura.feedback.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeedbackResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final FeedbackReceiptJson feedback;

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<FeedbackResponseJson> serializer() {
            return FeedbackResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feedback_repo_repo(FeedbackResponseJson feedbackResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || feedbackResponseJson.feedback != null) {
            c9j5.AAP(feedbackResponseJson.feedback, FeedbackReceiptJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedbackResponseJson) && C7384Etj.areEqual(this.feedback, ((FeedbackResponseJson) obj).feedback));
    }

    public static /* synthetic */ FeedbackResponseJson copy$default(FeedbackResponseJson feedbackResponseJson, FeedbackReceiptJson feedbackReceiptJson, int i, Object obj) {
        if ((i & 1) != 0) {
            feedbackReceiptJson = feedbackResponseJson.feedback;
        }
        return new FeedbackResponseJson(feedbackReceiptJson);
    }

    public final FeedbackReceiptJson component1() {
        return this.feedback;
    }

    public final FeedbackResponseJson copy(FeedbackReceiptJson feedbackReceiptJson) {
        return new FeedbackResponseJson(feedbackReceiptJson);
    }

    public final FeedbackReceiptJson getFeedback() {
        return this.feedback;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.feedback);
    }

    public /* synthetic */ FeedbackResponseJson(int i, FeedbackReceiptJson feedbackReceiptJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.feedback = null;
        } else {
            this.feedback = feedbackReceiptJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FeedbackResponseJson(FeedbackReceiptJson feedbackReceiptJson) {
        this.feedback = feedbackReceiptJson;
    }

    public /* synthetic */ FeedbackResponseJson(FeedbackReceiptJson feedbackReceiptJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : feedbackReceiptJson);
    }

    public FeedbackResponseJson() {
        this(null);
    }
}
