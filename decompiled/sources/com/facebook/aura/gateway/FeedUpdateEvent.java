package com.facebook.aura.gateway;

import X.C06G;

/* loaded from: classes3.dex */
public final class FeedUpdateEvent extends C06G {
    public static final int $stable = 0;
    public final boolean isGenerating;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedUpdateEvent) && this.isGenerating == ((FeedUpdateEvent) obj).isGenerating);
    }

    public static /* synthetic */ FeedUpdateEvent copy$default(FeedUpdateEvent feedUpdateEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = feedUpdateEvent.isGenerating;
        }
        return new FeedUpdateEvent(z);
    }

    public final boolean component1() {
        return this.isGenerating;
    }

    public final FeedUpdateEvent copy(boolean z) {
        return new FeedUpdateEvent(z);
    }

    public int hashCode() {
        return this.isGenerating ? 1231 : 1237;
    }

    public final boolean isGenerating() {
        return this.isGenerating;
    }

    public FeedUpdateEvent(boolean z) {
        this.isGenerating = z;
    }

    public String toString() {
        return super.toString();
    }
}
