package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class LayerComponentImpl extends NativeBase implements LayerComponent {
    public static final Companion Companion = new Companion();
    public final String identifier;
    public final boolean isAttached;
    public final boolean isVisible;

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.ComponentBase
    public native String getIdentifier();

    @Override // com.meta.maps.display.ComponentBase
    public native boolean isAttached();

    @Override // com.meta.maps.display.LayerComponent
    public native boolean isVisible();

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            LayerComponentImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            LayerComponentImpl.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public LayerComponentImpl(long j, Object obj) {
        super(j, Companion);
    }
}
