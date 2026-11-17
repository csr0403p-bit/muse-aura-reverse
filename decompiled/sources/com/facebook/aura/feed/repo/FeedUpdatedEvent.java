package com.facebook.aura.feed.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FeedUpdatedEvent extends C06G {
    public static final int $stable = 0;
    public final FeedEditionKind editionKind;
    public final String editionLocalDate;
    public final String promptId;
    public final String runId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUpdatedEvent) {
                FeedUpdatedEvent feedUpdatedEvent = (FeedUpdatedEvent) obj;
                if (!C7384Etj.areEqual(this.promptId, feedUpdatedEvent.promptId) || this.editionKind != feedUpdatedEvent.editionKind || !C7384Etj.areEqual(this.editionLocalDate, feedUpdatedEvent.editionLocalDate) || !C7384Etj.areEqual(this.runId, feedUpdatedEvent.runId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedUpdatedEvent copy$default(FeedUpdatedEvent feedUpdatedEvent, String str, FeedEditionKind feedEditionKind, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedUpdatedEvent.promptId;
        }
        if ((i & 2) != 0) {
            feedEditionKind = feedUpdatedEvent.editionKind;
        }
        if ((i & 4) != 0) {
            str2 = feedUpdatedEvent.editionLocalDate;
        }
        if ((i & 8) != 0) {
            str3 = feedUpdatedEvent.runId;
        }
        return new FeedUpdatedEvent(str, feedEditionKind, str2, str3);
    }

    public final String component1() {
        return this.promptId;
    }

    public final FeedEditionKind component2() {
        return this.editionKind;
    }

    public final String component3() {
        return this.editionLocalDate;
    }

    public final String component4() {
        return this.runId;
    }

    public final FeedUpdatedEvent copy(String str, FeedEditionKind feedEditionKind, String str2, String str3) {
        return new FeedUpdatedEvent(str, feedEditionKind, str2, str3);
    }

    public final FeedEditionKind getEditionKind() {
        return this.editionKind;
    }

    public final String getEditionLocalDate() {
        return this.editionLocalDate;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final String getRunId() {
        return this.runId;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.promptId) * 31) + AnonymousClass006.A0D(this.editionKind)) * 31) + AnonymousClass006.A0G(this.editionLocalDate)) * 31) + AnonymousClass005.A0H(this.runId);
    }

    public FeedUpdatedEvent(String str, FeedEditionKind feedEditionKind, String str2, String str3) {
        this.promptId = str;
        this.editionKind = feedEditionKind;
        this.editionLocalDate = str2;
        this.runId = str3;
    }

    public String toString() {
        return super.toString();
    }
}
