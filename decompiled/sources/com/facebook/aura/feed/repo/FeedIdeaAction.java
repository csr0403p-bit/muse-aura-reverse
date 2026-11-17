package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedIdeaAction extends C06G {
    public static final int $stable = 0;
    public final String ideaId;
    public final FeedIdeaActionState state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedIdeaAction) {
                FeedIdeaAction feedIdeaAction = (FeedIdeaAction) obj;
                if (!C7384Etj.areEqual(this.ideaId, feedIdeaAction.ideaId) || this.state != feedIdeaAction.state) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedIdeaAction copy$default(FeedIdeaAction feedIdeaAction, String str, FeedIdeaActionState feedIdeaActionState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedIdeaAction.ideaId;
        }
        if ((i & 2) != 0) {
            feedIdeaActionState = feedIdeaAction.state;
        }
        AnonymousClass003.A0u(str, feedIdeaActionState);
        return new FeedIdeaAction(str, feedIdeaActionState);
    }

    public final String component1() {
        return this.ideaId;
    }

    public final FeedIdeaActionState component2() {
        return this.state;
    }

    public final String getIdeaId() {
        return this.ideaId;
    }

    public final FeedIdeaActionState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, AnonymousClass001.A0G(this.ideaId));
    }

    public FeedIdeaAction(String str, FeedIdeaActionState feedIdeaActionState) {
        AnonymousClass003.A0u(str, feedIdeaActionState);
        this.ideaId = str;
        this.state = feedIdeaActionState;
    }

    public final FeedIdeaAction copy(String str, FeedIdeaActionState feedIdeaActionState) {
        AnonymousClass003.A0u(str, feedIdeaActionState);
        return new FeedIdeaAction(str, feedIdeaActionState);
    }

    public String toString() {
        return super.toString();
    }
}
