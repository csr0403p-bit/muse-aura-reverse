package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class SelectionChangedCallbackImpl extends NativeBase implements SelectionChangedCallback {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.SelectionChangedCallback
    public native void apply(SelectedFeature selectedFeature, SelectedFeature selectedFeature2);

    public SelectionChangedCallbackImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            SelectionChangedCallbackImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            SelectionChangedCallbackImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
