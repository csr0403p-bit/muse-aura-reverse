package com.facebook.animated.webp;

import X.C7285EkC;
import X.C79;
import X.EnumC2379BWs;
import X.InterfaceC7173Ehi;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class WebPImage implements InterfaceC7173Ehi {
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.InterfaceC7173Ehi
    /* renamed from: nativeGetFrame, reason: merged with bridge method [inline-methods] */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X.InterfaceC7173Ehi
    public boolean doesRenderSupportScaling() {
        return true;
    }

    @Override // X.InterfaceC7173Ehi
    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.InterfaceC7173Ehi
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // X.InterfaceC7173Ehi
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // X.InterfaceC7173Ehi
    public C7285EkC getFrameInfo(int i) {
        WebPFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            return new C7285EkC(frame.shouldDisposeToBackgroundColor() ? EnumC2379BWs.DISPOSE_TO_BACKGROUND : EnumC2379BWs.DISPOSE_DO_NOT, frame.isBlendWithPreviousFrame() ? C79.A00 : C79.A01, xOffset, yOffset, width, height);
        } finally {
            frame.dispose();
        }
    }

    @Override // X.InterfaceC7173Ehi
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC7173Ehi
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // X.InterfaceC7173Ehi
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.InterfaceC7173Ehi
    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }
}
