package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ChatUnreadState extends C06G {
    public static final int $stable = 0;
    public final Long seenAtMs;
    public final int unreadCount;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatUnreadState) {
                ChatUnreadState chatUnreadState = (ChatUnreadState) obj;
                if (this.unreadCount != chatUnreadState.unreadCount || !C7384Etj.areEqual(this.seenAtMs, chatUnreadState.seenAtMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatUnreadState copy$default(ChatUnreadState chatUnreadState, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatUnreadState.unreadCount;
        }
        if ((i2 & 2) != 0) {
            l = chatUnreadState.seenAtMs;
        }
        return new ChatUnreadState(i, l);
    }

    public final int component1() {
        return this.unreadCount;
    }

    public final Long component2() {
        return this.seenAtMs;
    }

    public final ChatUnreadState copy(int i, Long l) {
        return new ChatUnreadState(i, l);
    }

    public final Long getSeenAtMs() {
        return this.seenAtMs;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        return (this.unreadCount * 31) + AnonymousClass006.A0D(this.seenAtMs);
    }

    public ChatUnreadState(int i, Long l) {
        this.unreadCount = i;
        this.seenAtMs = l;
    }

    public String toString() {
        return super.toString();
    }
}
