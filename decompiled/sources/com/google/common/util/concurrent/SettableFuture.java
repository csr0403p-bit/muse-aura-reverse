package com.google.common.util.concurrent;

import X.AbstractC3446CNr;

/* loaded from: classes5.dex */
public final class SettableFuture<V> extends AbstractC3446CNr<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // X.CQU
    public boolean set(V value) {
        return super.set(value);
    }

    @Override // X.CQU
    public boolean setException(Throwable throwable) {
        return super.setException(throwable);
    }

    @Override // X.CQU
    public boolean setFuture(ListenableFuture<? extends V> future) {
        return super.setFuture(future);
    }
}
