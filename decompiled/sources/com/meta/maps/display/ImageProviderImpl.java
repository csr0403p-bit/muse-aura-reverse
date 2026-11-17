package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.display.ImageProvider;

/* loaded from: classes4.dex */
public final class ImageProviderImpl extends NativeBase implements ImageProvider {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.ImageProvider
    public native void getImage(String str, ImageProvider.ImageCallback imageCallback);

    @Override // com.meta.maps.display.ImageProvider
    public native boolean match(String str);

    public ImageProviderImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            ImageProviderImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            ImageProviderImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
