package com.facebook.common.dextricks.jit;

import X.ETi;

/* loaded from: classes5.dex */
public class ScopedJitSuspend implements AutoCloseable {
    public long nativeScopedJitSuspend;

    private native long createNativeScopedJitSuspend();

    private native void destroyNativeScopedJitSuspend(long j);

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        long j = this.nativeScopedJitSuspend;
        if (j != 0) {
            destroyNativeScopedJitSuspend(j);
            this.nativeScopedJitSuspend = 0L;
        }
    }

    static {
        ETi.loadLibrary("dextricks-jit");
    }

    public ScopedJitSuspend() {
        this.nativeScopedJitSuspend = 0L;
        this.nativeScopedJitSuspend = createNativeScopedJitSuspend();
    }
}
