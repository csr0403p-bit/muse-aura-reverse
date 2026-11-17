package com.facebook.aura.login.nativeflow;

import X.C06H;

/* loaded from: classes3.dex */
public final class CheckpointBlobResponseException extends NativeLoginCheckpointLocalException {
    public static final int $stable = 8;
    public final int statusCode;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public CheckpointBlobResponseException(int i, Throwable th) {
        super(th);
        this.statusCode = i;
    }

    public /* synthetic */ CheckpointBlobResponseException(int i, Throwable th, int i2, C06H c06h) {
        this(i, (i2 & 2) != 0 ? null : th);
    }
}
