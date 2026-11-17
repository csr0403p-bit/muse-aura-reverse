package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ChannelUiItem extends C06G {
    public static final int $stable = 0;
    public final MessagingChannel channel;
    public final boolean linked;
    public final boolean needsAttention;

    public ChannelUiItem(MessagingChannel messagingChannel, boolean z, boolean z2) {
        C7384Etj.A0Y(messagingChannel, 0);
        this.channel = messagingChannel;
        this.linked = z;
        this.needsAttention = z2;
    }

    public final ChannelUiItem copy(MessagingChannel messagingChannel, boolean z, boolean z2) {
        C7384Etj.A0Y(messagingChannel, 0);
        return new ChannelUiItem(messagingChannel, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelUiItem) {
                ChannelUiItem channelUiItem = (ChannelUiItem) obj;
                if (this.channel != channelUiItem.channel || this.linked != channelUiItem.linked || this.needsAttention != channelUiItem.needsAttention) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelUiItem copy$default(ChannelUiItem channelUiItem, MessagingChannel messagingChannel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            messagingChannel = channelUiItem.channel;
        }
        if ((i & 2) != 0) {
            z = channelUiItem.linked;
        }
        if ((i & 4) != 0) {
            z2 = channelUiItem.needsAttention;
        }
        return channelUiItem.copy(messagingChannel, z, z2);
    }

    public final MessagingChannel component1() {
        return this.channel;
    }

    public final boolean component2() {
        return this.linked;
    }

    public final boolean component3() {
        return this.needsAttention;
    }

    public final MessagingChannel getChannel() {
        return this.channel;
    }

    public final boolean getLinked() {
        return this.linked;
    }

    public final boolean getNeedsAttention() {
        return this.needsAttention;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.channel), this.linked), this.needsAttention);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChannelUiItem(MessagingChannel messagingChannel, boolean z, boolean z2, int i, C06H c06h) {
        this(messagingChannel, z, AnonymousClass005.A1O(i, z2));
    }
}
