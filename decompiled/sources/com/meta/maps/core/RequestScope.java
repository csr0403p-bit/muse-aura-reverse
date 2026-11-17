package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class RequestScope extends NativeBase {
    public static final Companion Companion = new Companion();
    public final String uniqueId;

    private final native void cacheThisInstance();

    public static final native long create();

    public static final native void disposeNativeHandle(long j);

    public final native void cancel();

    public final native String getUniqueId();

    public final native boolean isCancelled();

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        public final long create() {
            return RequestScope.create();
        }

        private final void disposeNativeHandle(long j) {
            RequestScope.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            RequestScope.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public RequestScope() {
        super(create(), Companion);
        cacheThisInstance();
    }

    public RequestScope(long j, Object obj) {
        super(j, Companion);
    }
}
