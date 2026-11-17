package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class SelectableFeatureVisibilityChangedCallbackImpl extends NativeBase implements SelectableFeatureVisibilityChangedCallback {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.SelectableFeatureVisibilityChangedCallback
    public native void apply(VisibilityChange visibilityChange);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            SelectableFeatureVisibilityChangedCallbackImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            SelectableFeatureVisibilityChangedCallbackImpl.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public SelectableFeatureVisibilityChangedCallbackImpl(long j, Object obj) {
        super(j, Companion);
    }
}
