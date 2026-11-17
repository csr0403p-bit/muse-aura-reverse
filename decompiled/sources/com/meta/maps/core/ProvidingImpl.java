package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class ProvidingImpl extends NativeBase implements Providing {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            ProvidingImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            ProvidingImpl.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ProvidingImpl(long j, Object obj) {
        super(j, Companion);
    }
}
