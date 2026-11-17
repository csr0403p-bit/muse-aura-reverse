package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class ChannelStatusSnapshot extends C06G {
    public final List<ChannelJson> channels;
    public final long ticket;

    public ChannelStatusSnapshot() {
        this(null, 0L);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelStatusSnapshot) {
                ChannelStatusSnapshot channelStatusSnapshot = (ChannelStatusSnapshot) obj;
                if (!C7384Etj.areEqual(this.channels, channelStatusSnapshot.channels) || this.ticket != channelStatusSnapshot.ticket) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelStatusSnapshot copy$default(ChannelStatusSnapshot channelStatusSnapshot, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = channelStatusSnapshot.channels;
        }
        if ((i & 2) != 0) {
            j = channelStatusSnapshot.ticket;
        }
        return new ChannelStatusSnapshot(list, j);
    }

    public final List<ChannelJson> component1() {
        return this.channels;
    }

    public final long component2() {
        return this.ticket;
    }

    public final ChannelStatusSnapshot copy(List<ChannelJson> list, long j) {
        return new ChannelStatusSnapshot(list, j);
    }

    public final List<ChannelJson> getChannels() {
        return this.channels;
    }

    public final long getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.ticket, AnonymousClass006.A0D(this.channels) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public ChannelStatusSnapshot(List<ChannelJson> list, long j) {
        this.channels = list;
        this.ticket = j;
    }

    public /* synthetic */ ChannelStatusSnapshot(List list, long j, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0L : j);
    }
}
