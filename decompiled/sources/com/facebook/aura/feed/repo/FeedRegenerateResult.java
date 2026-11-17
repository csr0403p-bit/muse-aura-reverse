package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class FeedRegenerateResult extends C06G {
    public static final int $stable = 0;
    public final boolean alreadyInProgress;
    public final String runId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedRegenerateResult) {
                FeedRegenerateResult feedRegenerateResult = (FeedRegenerateResult) obj;
                if (!C7384Etj.areEqual(this.runId, feedRegenerateResult.runId) || this.alreadyInProgress != feedRegenerateResult.alreadyInProgress) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedRegenerateResult copy$default(FeedRegenerateResult feedRegenerateResult, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedRegenerateResult.runId;
        }
        if ((i & 2) != 0) {
            z = feedRegenerateResult.alreadyInProgress;
        }
        return new FeedRegenerateResult(str, z);
    }

    public final String component1() {
        return this.runId;
    }

    public final boolean component2() {
        return this.alreadyInProgress;
    }

    public final FeedRegenerateResult copy(String str, boolean z) {
        return new FeedRegenerateResult(str, z);
    }

    public final boolean getAlreadyInProgress() {
        return this.alreadyInProgress;
    }

    public final String getRunId() {
        return this.runId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.runId) * 31, this.alreadyInProgress);
    }

    public FeedRegenerateResult(String str, boolean z) {
        this.runId = str;
        this.alreadyInProgress = z;
    }

    public String toString() {
        return super.toString();
    }
}
