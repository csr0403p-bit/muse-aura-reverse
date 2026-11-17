package com.facebook.animated.webp;

import X.C7384Etj;
import X.InterfaceC7287EkE;
import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class WebPFrame implements InterfaceC7287EkE {
    public long mNativeContext;

    private final native void nativeDispose();

    private final native void nativeFinalize();

    private final native int nativeGetDurationMs();

    private final native int nativeGetHeight();

    private final native int nativeGetWidth();

    private final native int nativeGetXOffset();

    private final native int nativeGetYOffset();

    private final native boolean nativeIsBlendWithPreviousFrame();

    private final native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private final native boolean nativeShouldDisposeToBackgroundColor();

    @Override // X.InterfaceC7287EkE
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 2);
        nativeRenderFrame(i, i2, bitmap);
    }

    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // X.InterfaceC7287EkE
    public void dispose() {
        nativeDispose();
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // X.InterfaceC7287EkE
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC7287EkE
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.InterfaceC7287EkE
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.InterfaceC7287EkE
    public int getYOffset() {
        return nativeGetYOffset();
    }

    public final boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    public final boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }
}
