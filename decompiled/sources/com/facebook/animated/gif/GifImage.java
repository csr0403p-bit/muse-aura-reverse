package com.facebook.animated.gif;

import X.C3463COl;
import X.InterfaceC7173Ehi;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class GifImage implements InterfaceC7173Ehi {
    public static volatile boolean sInitialized;
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.InterfaceC7173Ehi
    /* renamed from: nativeGetFrame, reason: merged with bridge method [inline-methods] */
    public native GifFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    public static synchronized void ensure() {
        if (!sInitialized) {
            C3463COl.loadLibrary("gifimage");
            sInitialized = true;
        }
    }

    @Override // X.InterfaceC7173Ehi
    public boolean doesRenderSupportScaling() {
        return false;
    }

    @Override // X.InterfaceC7173Ehi
    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public GifImage(long j) {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0004, B:9:0x0022, B:15:0x002e, B:14:0x002c, B:13:0x0029), top: B:21:0x0004 }] */
    @Override // X.InterfaceC7173Ehi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C7285EkC getFrameInfo(int r9) {
        /*
            r8 = this;
            com.facebook.animated.gif.GifFrame r2 = r8.getFrame(r9)
            int r6 = r2.getXOffset()     // Catch: java.lang.Throwable -> L37
            int r7 = r2.getYOffset()     // Catch: java.lang.Throwable -> L37
            int r8 = r2.getWidth()     // Catch: java.lang.Throwable -> L37
            int r9 = r2.getHeight()     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r5 = X.C79.A00     // Catch: java.lang.Throwable -> L37
            int r1 = r2.getDisposalMode()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L29
            r0 = 1
            if (r1 == r0) goto L29
            r0 = 2
            if (r1 != r0) goto L25
            X.BWs r4 = X.EnumC2379BWs.DISPOSE_TO_BACKGROUND     // Catch: java.lang.Throwable -> L37
            goto L2e
        L25:
            r0 = 3
            if (r1 != r0) goto L29
            goto L2c
        L29:
            X.BWs r4 = X.EnumC2379BWs.DISPOSE_DO_NOT     // Catch: java.lang.Throwable -> L37
            goto L2e
        L2c:
            X.BWs r4 = X.EnumC2379BWs.DISPOSE_TO_PREVIOUS     // Catch: java.lang.Throwable -> L37
        L2e:
            X.EkC r3 = new X.EkC     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L37
            r2.dispose()
            return r3
        L37:
            r0 = move-exception
            r2.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.animated.gif.GifImage.getFrameInfo(int):X.EkC");
    }

    @Override // X.InterfaceC7173Ehi
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC7173Ehi
    public int getLoopCount() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // X.InterfaceC7173Ehi
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.InterfaceC7173Ehi
    public int getWidth() {
        return nativeGetWidth();
    }

    public GifImage() {
    }
}
