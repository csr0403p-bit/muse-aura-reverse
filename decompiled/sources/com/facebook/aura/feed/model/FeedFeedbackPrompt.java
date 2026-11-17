package com.facebook.aura.feed.model;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedFeedbackPrompt extends C06G {
    public static final int $stable = 0;
    public final String unitId;

    public FeedFeedbackPrompt(String str) {
        C7384Etj.A0Y(str, 0);
        this.unitId = str;
    }

    public final FeedFeedbackPrompt copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new FeedFeedbackPrompt(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedFeedbackPrompt) && C7384Etj.areEqual(this.unitId, ((FeedFeedbackPrompt) obj).unitId));
    }

    public static /* synthetic */ FeedFeedbackPrompt copy$default(FeedFeedbackPrompt feedFeedbackPrompt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedFeedbackPrompt.unitId;
        }
        C7384Etj.A0Y(str, 0);
        return new FeedFeedbackPrompt(str);
    }

    public final String component1() {
        return this.unitId;
    }

    public final String getUnitId() {
        return this.unitId;
    }

    public int hashCode() {
        return this.unitId.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
