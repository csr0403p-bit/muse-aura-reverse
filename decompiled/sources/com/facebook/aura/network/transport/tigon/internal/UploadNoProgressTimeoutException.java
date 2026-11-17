package com.facebook.aura.network.transport.tigon.internal;

/* loaded from: classes5.dex */
public final class UploadNoProgressTimeoutException extends RuntimeException {
    public final long timeoutMs;

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public UploadNoProgressTimeoutException(long j) {
        this.timeoutMs = j;
    }
}
