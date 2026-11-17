package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedStatus extends C06G {
    public static final int $stable = 0;
    public final Long freshestGeneratedAtMs;
    public final FeedEditionKind nextEditionKind;
    public final Long nextScheduledAtMs;
    public final String promptId;
    public final boolean refreshInProgress;
    public final String runId;
    public final Long startedAtMs;
    public final String trigger;

    public static /* synthetic */ FeedStatus copy$default(FeedStatus feedStatus, String str, boolean z, String str2, String str3, Long l, Long l2, FeedEditionKind feedEditionKind, Long l3, int i, Object obj) {
        String str4 = str;
        boolean z2 = z;
        String str5 = str2;
        String str6 = str3;
        Long l4 = l;
        Long l5 = l2;
        FeedEditionKind feedEditionKind2 = feedEditionKind;
        Long l6 = l3;
        if ((i & 1) != 0) {
            str4 = feedStatus.promptId;
        }
        if ((i & 2) != 0) {
            z2 = feedStatus.refreshInProgress;
        }
        if ((i & 4) != 0) {
            str5 = feedStatus.runId;
        }
        if ((i & 8) != 0) {
            str6 = feedStatus.trigger;
        }
        if ((i & 16) != 0) {
            l4 = feedStatus.startedAtMs;
        }
        if ((i & 32) != 0) {
            l5 = feedStatus.nextScheduledAtMs;
        }
        if ((i & 64) != 0) {
            feedEditionKind2 = feedStatus.nextEditionKind;
        }
        if ((i & 128) != 0) {
            l6 = feedStatus.freshestGeneratedAtMs;
        }
        return new FeedStatus(str4, z2, str5, str6, l4, l5, feedEditionKind2, l6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedStatus) {
                FeedStatus feedStatus = (FeedStatus) obj;
                if (!C7384Etj.areEqual(this.promptId, feedStatus.promptId) || this.refreshInProgress != feedStatus.refreshInProgress || !C7384Etj.areEqual(this.runId, feedStatus.runId) || !C7384Etj.areEqual(this.trigger, feedStatus.trigger) || !C7384Etj.areEqual(this.startedAtMs, feedStatus.startedAtMs) || !C7384Etj.areEqual(this.nextScheduledAtMs, feedStatus.nextScheduledAtMs) || this.nextEditionKind != feedStatus.nextEditionKind || !C7384Etj.areEqual(this.freshestGeneratedAtMs, feedStatus.freshestGeneratedAtMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.promptId;
    }

    public final boolean component2() {
        return this.refreshInProgress;
    }

    public final String component3() {
        return this.runId;
    }

    public final String component4() {
        return this.trigger;
    }

    public final Long component5() {
        return this.startedAtMs;
    }

    public final Long component6() {
        return this.nextScheduledAtMs;
    }

    public final FeedEditionKind component7() {
        return this.nextEditionKind;
    }

    public final Long component8() {
        return this.freshestGeneratedAtMs;
    }

    public final FeedStatus copy(String str, boolean z, String str2, String str3, Long l, Long l2, FeedEditionKind feedEditionKind, Long l3) {
        return new FeedStatus(str, z, str2, str3, l, l2, feedEditionKind, l3);
    }

    public final Long getFreshestGeneratedAtMs() {
        return this.freshestGeneratedAtMs;
    }

    public final FeedEditionKind getNextEditionKind() {
        return this.nextEditionKind;
    }

    public final Long getNextScheduledAtMs() {
        return this.nextScheduledAtMs;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final boolean getRefreshInProgress() {
        return this.refreshInProgress;
    }

    public final String getRunId() {
        return this.runId;
    }

    public final Long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return ((((((((((C0KA.A01(AnonymousClass006.A0G(this.promptId) * 31, this.refreshInProgress) + AnonymousClass006.A0G(this.runId)) * 31) + AnonymousClass006.A0G(this.trigger)) * 31) + AnonymousClass006.A0D(this.startedAtMs)) * 31) + AnonymousClass006.A0D(this.nextScheduledAtMs)) * 31) + AnonymousClass006.A0D(this.nextEditionKind)) * 31) + C06G.A04(this.freshestGeneratedAtMs);
    }

    public FeedStatus(String str, boolean z, String str2, String str3, Long l, Long l2, FeedEditionKind feedEditionKind, Long l3) {
        this.promptId = str;
        this.refreshInProgress = z;
        this.runId = str2;
        this.trigger = str3;
        this.startedAtMs = l;
        this.nextScheduledAtMs = l2;
        this.nextEditionKind = feedEditionKind;
        this.freshestGeneratedAtMs = l3;
    }

    public String toString() {
        return super.toString();
    }
}
