package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class ImageControllerImpl extends NativeBase implements ImageController {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.ImageController
    public native void attachImage(String str, Image image);

    @Override // com.meta.maps.display.ImageController
    public native void detachImage(String str);

    public ImageControllerImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            ImageControllerImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            ImageControllerImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
