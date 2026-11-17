package com.facebook.aura.analytics.hatch;

/* loaded from: classes.dex */
public final class HatchSendButtonOrigin {
    public static final int $stable = 0;
    public final HatchComposerEntryPoint entryPoint;
    public final boolean isPrimaryThread;
    public final String originId;
    public final String threadId;

    public final HatchComposerEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final String getOriginId() {
        return this.originId;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final boolean isPrimaryThread() {
        return this.isPrimaryThread;
    }

    public HatchSendButtonOrigin(boolean z, String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2) {
        this.isPrimaryThread = z;
        this.threadId = str;
        this.entryPoint = hatchComposerEntryPoint;
        this.originId = str2;
    }
}
