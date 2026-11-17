package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class MarkChatAsSeenResult extends C06G {
    public static final int $stable = 0;
    public final Boolean hasUnreadThreads;
    public final boolean success;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarkChatAsSeenResult) {
                MarkChatAsSeenResult markChatAsSeenResult = (MarkChatAsSeenResult) obj;
                if (this.success != markChatAsSeenResult.success || !C7384Etj.areEqual(this.hasUnreadThreads, markChatAsSeenResult.hasUnreadThreads)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarkChatAsSeenResult copy$default(MarkChatAsSeenResult markChatAsSeenResult, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = markChatAsSeenResult.success;
        }
        if ((i & 2) != 0) {
            bool = markChatAsSeenResult.hasUnreadThreads;
        }
        return new MarkChatAsSeenResult(z, bool);
    }

    public final boolean component1() {
        return this.success;
    }

    public final Boolean component2() {
        return this.hasUnreadThreads;
    }

    public final MarkChatAsSeenResult copy(boolean z, Boolean bool) {
        return new MarkChatAsSeenResult(z, bool);
    }

    public final Boolean getHasUnreadThreads() {
        return this.hasUnreadThreads;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return C0KA.A02(this.success) + AnonymousClass006.A0D(this.hasUnreadThreads);
    }

    public MarkChatAsSeenResult(boolean z, Boolean bool) {
        this.success = z;
        this.hasUnreadThreads = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarkChatAsSeenResult(boolean z, Boolean bool, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : bool);
    }
}
