package com.facebook.aura.nodes;

/* loaded from: classes3.dex */
public final class HeldInvokeParams {
    public volatile boolean handlerStarted;
    public final String paramsJson;
    public final long receivedAtElapsedMs;

    public final boolean getHandlerStarted() {
        return this.handlerStarted;
    }

    public final String getParamsJson() {
        return this.paramsJson;
    }

    public final long getReceivedAtElapsedMs() {
        return this.receivedAtElapsedMs;
    }

    public final void setHandlerStarted(boolean z) {
        this.handlerStarted = z;
    }

    public HeldInvokeParams(String str, long j) {
        this.paramsJson = str;
        this.receivedAtElapsedMs = j;
    }
}
