package androidx.camera.core;

import android.graphics.Bitmap;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class ImageProcessingUtil {
    public static int A00;

    public static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    public static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    public static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    public static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2876Bnj A00(X.InterfaceC2873Bng r25, X.InterfaceC2864BnO r26, java.nio.ByteBuffer r27, int r28, boolean r29) {
        /*
            r7 = r25
            int r1 = r7.AFp()
            r0 = 35
            if (r1 != r0) goto L13
            X.Bo0[] r0 = r7.AIj()
            int r2 = r0.length
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L14
        L13:
            r0 = 0
        L14:
            r1 = 0
            java.lang.String r6 = "ImageProcessingUtil"
            if (r0 != 0) goto L1f
            java.lang.String r0 = "Unsupported format for YUV to RGB"
        L1b:
            X.AbstractC2875Bni.A02(r6, r0)
            return r1
        L1f:
            long r8 = java.lang.System.currentTimeMillis()
            r4 = r28
            if (r28 == 0) goto L36
            r0 = 90
            if (r4 == r0) goto L36
            r0 = 180(0xb4, float:2.52E-43)
            if (r4 == r0) goto L36
            r0 = 270(0x10e, float:3.78E-43)
            if (r4 == r0) goto L36
            java.lang.String r0 = "Unsupported rotation degrees for rotate RGB"
            goto L1b
        L36:
            android.view.Surface r18 = r26.getSurface()
            int r20 = r7.getWidth()
            int r21 = r7.getHeight()
            X.Bo0[] r2 = r7.AIj()
            r0 = 0
            int r11 = X.C2887Bnv.A01(r2, r0)
            r3 = 1
            int r13 = X.C2887Bnv.A01(r2, r3)
            r5 = 2
            int r15 = X.C2887Bnv.A01(r2, r5)
            int r16 = X.C2887Bnv.A00(r2, r0)
            int r17 = X.C2887Bnv.A00(r2, r3)
            r22 = 0
            r23 = 0
            if (r29 == 0) goto L67
            r22 = r16
            r23 = r17
        L67:
            java.nio.ByteBuffer r10 = X.C2887Bnv.A02(r2, r0)
            java.nio.ByteBuffer r12 = X.C2887Bnv.A02(r2, r3)
            java.nio.ByteBuffer r14 = X.C2887Bnv.A02(r2, r5)
            r19 = r27
            r24 = r23
            r25 = r4
            int r2 = nativeConvertAndroid420ToABGR(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r2 == 0) goto L88
            java.lang.Integer r3 = X.C79.A0C
        L81:
            java.lang.Integer r2 = X.C79.A0C
            if (r3 != r2) goto L8b
            java.lang.String r0 = "YUV to RGB conversion failure"
            goto L1b
        L88:
            java.lang.Integer r3 = X.C79.A01
            goto L81
        L8b:
            java.lang.String r2 = "MH"
            boolean r2 = X.BV4.A1U(r2)
            if (r2 == 0) goto Lb3
            java.util.Locale r4 = java.util.Locale.US
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r8
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            int r2 = androidx.camera.core.ImageProcessingUtil.A00
            java.lang.Object[] r3 = X.BV5.A1a(r3, r2)
            java.lang.String r2 = "Image processing performance profiling, duration: [%d], image count: %d"
            java.lang.String r2 = java.lang.String.format(r4, r2, r3)
            X.AbstractC2875Bni.A01(r6, r2)
            int r2 = androidx.camera.core.ImageProcessingUtil.A00
            int r2 = r2 + 1
            androidx.camera.core.ImageProcessingUtil.A00 = r2
        Lb3:
            X.Bng r3 = r26.A30()
            if (r3 != 0) goto Lbd
            java.lang.String r0 = "YUV to RGB acquireLatestImage failure"
            goto L1b
        Lbd:
            X.Bnj r1 = new X.Bnj
            r1.<init>(r3)
            X.F4Y r2 = new X.F4Y
            r2.<init>(r3, r7, r0)
            r1.A00(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.A00(X.Bng, X.BnO, java.nio.ByteBuffer, int, boolean):X.Bnj");
    }
}
