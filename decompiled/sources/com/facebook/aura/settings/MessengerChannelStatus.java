package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class MessengerChannelStatus extends C06G {
    public static final int $stable = 0;
    public final String agentId;
    public final boolean isLinked;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessengerChannelStatus) {
                MessengerChannelStatus messengerChannelStatus = (MessengerChannelStatus) obj;
                if (this.isLinked != messengerChannelStatus.isLinked || !C7384Etj.areEqual(this.agentId, messengerChannelStatus.agentId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessengerChannelStatus copy$default(MessengerChannelStatus messengerChannelStatus, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messengerChannelStatus.isLinked;
        }
        if ((i & 2) != 0) {
            str = messengerChannelStatus.agentId;
        }
        return new MessengerChannelStatus(z, str);
    }

    public final boolean component1() {
        return this.isLinked;
    }

    public final String component2() {
        return this.agentId;
    }

    public final MessengerChannelStatus copy(boolean z, String str) {
        return new MessengerChannelStatus(z, str);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public int hashCode() {
        return C0KA.A02(this.isLinked) + AnonymousClass006.A0G(this.agentId);
    }

    public final boolean isLinked() {
        return this.isLinked;
    }

    public MessengerChannelStatus(boolean z, String str) {
        this.isLinked = z;
        this.agentId = str;
    }

    public String toString() {
        return super.toString();
    }
}
