package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ChannelLinkResult extends C06G {
    public static final int $stable = 0;
    public final String agentId;
    public final boolean isPaired;
    public final String message;
    public final boolean ok;
    public final String pairingUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelLinkResult) {
                ChannelLinkResult channelLinkResult = (ChannelLinkResult) obj;
                if (!C7384Etj.areEqual(this.pairingUrl, channelLinkResult.pairingUrl) || this.isPaired != channelLinkResult.isPaired || this.ok != channelLinkResult.ok || !C7384Etj.areEqual(this.message, channelLinkResult.message) || !C7384Etj.areEqual(this.agentId, channelLinkResult.agentId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelLinkResult copy$default(ChannelLinkResult channelLinkResult, String str, boolean z, boolean z2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelLinkResult.pairingUrl;
        }
        if ((i & 2) != 0) {
            z = channelLinkResult.isPaired;
        }
        if ((i & 4) != 0) {
            z2 = channelLinkResult.ok;
        }
        if ((i & 8) != 0) {
            str2 = channelLinkResult.message;
        }
        if ((i & 16) != 0) {
            str3 = channelLinkResult.agentId;
        }
        return channelLinkResult.copy(str, z, z2, str2, str3);
    }

    public final String component1() {
        return this.pairingUrl;
    }

    public final boolean component2() {
        return this.isPaired;
    }

    public final boolean component3() {
        return this.ok;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.agentId;
    }

    public final ChannelLinkResult copy(String str, boolean z, boolean z2, String str2, String str3) {
        return new ChannelLinkResult(str, z, z2, str2, str3);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getPairingUrl() {
        return this.pairingUrl;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01(AnonymousClass006.A0G(this.pairingUrl) * 31, this.isPaired), this.ok) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass005.A0H(this.agentId);
    }

    public final boolean isPaired() {
        return this.isPaired;
    }

    public ChannelLinkResult(String str, boolean z, boolean z2, String str2, String str3) {
        this.pairingUrl = str;
        this.isPaired = z;
        this.ok = z2;
        this.message = str2;
        this.agentId = str3;
    }

    public String toString() {
        return super.toString();
    }
}
