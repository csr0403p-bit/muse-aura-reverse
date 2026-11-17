package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public interface ImageProvider {

    public interface ImageCallback {
        void apply(Image image);
    }

    public final class ImageCallbackImpl extends NativeBase implements ImageCallback {
        public static final Companion Companion = new Companion();

        public static final native void disposeNativeHandle(long j);

        @Override // com.meta.maps.display.ImageProvider.ImageCallback
        public native void apply(Image image);

        public ImageCallbackImpl(long j, Object obj) {
            super(j, Companion);
        }

        public final class Companion implements NativeBase.Disposer {
            public /* synthetic */ Companion(C06H c06h) {
            }

            private final void disposeNativeHandle(long j) {
                ImageCallbackImpl.disposeNativeHandle(j);
            }

            @Override // com.meta.maps.NativeBase.Disposer
            public void dispose(long j) {
                ImageCallbackImpl.disposeNativeHandle(j);
            }

            public Companion() {
            }
        }
    }

    void getImage(String str, ImageCallback imageCallback);

    boolean match(String str);
}
