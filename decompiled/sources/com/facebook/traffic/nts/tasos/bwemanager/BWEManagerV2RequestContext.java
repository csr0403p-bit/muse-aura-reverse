package com.facebook.traffic.nts.tasos.bwemanager;

/* loaded from: classes6.dex */
public final class BWEManagerV2RequestContext {
    public final boolean isPrefetch;
    public final int requestType;

    public final int getRequestType() {
        return this.requestType;
    }

    public final boolean isPrefetch() {
        return this.isPrefetch;
    }

    public BWEManagerV2RequestContext(int i, boolean z) {
        this.requestType = i;
        this.isPrefetch = z;
    }
}
