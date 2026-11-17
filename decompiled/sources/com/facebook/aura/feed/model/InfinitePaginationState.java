package com.facebook.aura.feed.model;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;

/* loaded from: classes3.dex */
public final class InfinitePaginationState extends C06G {
    public final boolean isExhausted;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InfinitePaginationState) && this.isExhausted == ((InfinitePaginationState) obj).isExhausted);
    }

    public static /* synthetic */ InfinitePaginationState copy$default(InfinitePaginationState infinitePaginationState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = infinitePaginationState.isExhausted;
        }
        return new InfinitePaginationState(z);
    }

    public final boolean component1() {
        return this.isExhausted;
    }

    public final InfinitePaginationState copy(boolean z) {
        return new InfinitePaginationState(z);
    }

    public int hashCode() {
        return this.isExhausted ? 1231 : 1237;
    }

    public final boolean isExhausted() {
        return this.isExhausted;
    }

    public /* synthetic */ InfinitePaginationState(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public String toString() {
        return super.toString();
    }

    public InfinitePaginationState(boolean z) {
        this.isExhausted = z;
    }

    public InfinitePaginationState() {
        this(false);
    }
}
