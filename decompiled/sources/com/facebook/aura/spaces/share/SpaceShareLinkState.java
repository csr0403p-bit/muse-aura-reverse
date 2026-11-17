package com.facebook.aura.spaces.share;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SpaceShareLinkState extends C06G {
    public static final int $stable = 0;
    public final boolean canPublish;
    public final boolean currentBuildPublished;
    public final boolean isPublished;
    public final Long lastSyncedAtMs;
    public final SpaceShareLinkPhase phase;
    public final String publishError;
    public final boolean publishFailed;
    public final boolean publishing;
    public final boolean unpublishing;
    public final String url;

    public final SpaceShareLinkState copy(SpaceShareLinkPhase spaceShareLinkPhase, String str, boolean z, boolean z2, boolean z3, boolean z4, Long l, boolean z5, String str2) {
        C7384Etj.A0Y(spaceShareLinkPhase, 0);
        return new SpaceShareLinkState(spaceShareLinkPhase, str, z, z2, z3, z4, l, z5, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareLinkState) {
                SpaceShareLinkState spaceShareLinkState = (SpaceShareLinkState) obj;
                if (this.phase != spaceShareLinkState.phase || !C7384Etj.areEqual(this.url, spaceShareLinkState.url) || this.canPublish != spaceShareLinkState.canPublish || this.publishing != spaceShareLinkState.publishing || this.unpublishing != spaceShareLinkState.unpublishing || this.currentBuildPublished != spaceShareLinkState.currentBuildPublished || !C7384Etj.areEqual(this.lastSyncedAtMs, spaceShareLinkState.lastSyncedAtMs) || this.publishFailed != spaceShareLinkState.publishFailed || !C7384Etj.areEqual(this.publishError, spaceShareLinkState.publishError)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SpaceShareLinkState(SpaceShareLinkPhase spaceShareLinkPhase, String str, boolean z, boolean z2, boolean z3, boolean z4, Long l, boolean z5, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? SpaceShareLinkPhase.LOADING : spaceShareLinkPhase, (i & 2) != 0 ? null : str, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), AnonymousClass005.A1Q(i, z3), (i & 32) != 0 ? true : z4, (i & 64) != 0 ? null : l, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? null : str2);
    }

    public static /* synthetic */ SpaceShareLinkState copy$default(SpaceShareLinkState spaceShareLinkState, SpaceShareLinkPhase spaceShareLinkPhase, String str, boolean z, boolean z2, boolean z3, boolean z4, Long l, boolean z5, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            spaceShareLinkPhase = spaceShareLinkState.phase;
        }
        if ((i & 2) != 0) {
            str = spaceShareLinkState.url;
        }
        if ((i & 4) != 0) {
            z = spaceShareLinkState.canPublish;
        }
        if ((i & 8) != 0) {
            z2 = spaceShareLinkState.publishing;
        }
        if ((i & 16) != 0) {
            z3 = spaceShareLinkState.unpublishing;
        }
        if ((i & 32) != 0) {
            z4 = spaceShareLinkState.currentBuildPublished;
        }
        if ((i & 64) != 0) {
            l = spaceShareLinkState.lastSyncedAtMs;
        }
        if ((i & 128) != 0) {
            z5 = spaceShareLinkState.publishFailed;
        }
        if ((i & 256) != 0) {
            str2 = spaceShareLinkState.publishError;
        }
        return spaceShareLinkState.copy(spaceShareLinkPhase, str, z, z2, z3, z4, l, z5, str2);
    }

    public final SpaceShareLinkPhase component1() {
        return this.phase;
    }

    public final String component2() {
        return this.url;
    }

    public final boolean component3() {
        return this.canPublish;
    }

    public final boolean component4() {
        return this.publishing;
    }

    public final boolean component5() {
        return this.unpublishing;
    }

    public final boolean component6() {
        return this.currentBuildPublished;
    }

    public final Long component7() {
        return this.lastSyncedAtMs;
    }

    public final boolean component8() {
        return this.publishFailed;
    }

    public final String component9() {
        return this.publishError;
    }

    public final boolean getCanPublish() {
        return this.canPublish;
    }

    public final boolean getCurrentBuildPublished() {
        return this.currentBuildPublished;
    }

    public final Long getLastSyncedAtMs() {
        return this.lastSyncedAtMs;
    }

    public final SpaceShareLinkPhase getPhase() {
        return this.phase;
    }

    public final String getPublishError() {
        return this.publishError;
    }

    public final boolean getPublishFailed() {
        return this.publishFailed;
    }

    public final boolean getPublishing() {
        return this.publishing;
    }

    public final boolean getUnpublishing() {
        return this.unpublishing;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass005.A0E(this.phase) + AnonymousClass006.A0G(this.url)) * 31, this.canPublish), this.publishing), this.unpublishing), this.currentBuildPublished) + AnonymousClass006.A0D(this.lastSyncedAtMs)) * 31, this.publishFailed) + AnonymousClass005.A0H(this.publishError);
    }

    public final boolean isPublished() {
        return this.isPublished;
    }

    public String toString() {
        return super.toString();
    }

    public SpaceShareLinkState(SpaceShareLinkPhase spaceShareLinkPhase, String str, boolean z, boolean z2, boolean z3, boolean z4, Long l, boolean z5, String str2) {
        C7384Etj.A0Y(spaceShareLinkPhase, 0);
        this.phase = spaceShareLinkPhase;
        this.url = str;
        this.canPublish = z;
        this.publishing = z2;
        this.unpublishing = z3;
        this.currentBuildPublished = z4;
        this.lastSyncedAtMs = l;
        this.publishFailed = z5;
        this.publishError = str2;
        this.isPublished = AnonymousClass002.A1X(str);
    }

    public SpaceShareLinkState() {
        this(SpaceShareLinkPhase.LOADING, null, false, false, false, true, null, false, null);
    }
}
