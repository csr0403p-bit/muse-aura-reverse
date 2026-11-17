package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.YuvHelper;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class YuvHelperJni implements YuvHelper.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeAbgrToI420(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, int i5, int i6);

    public static native void nativeCopyPlane(Object obj, int i, Object obj2, int i2, int i3, int i4);

    public static native void nativeI420Copy(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, Object obj5, int i5, Object obj6, int i6, int i7, int i8);

    public static native void nativeI420Rotate(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, Object obj5, int i5, Object obj6, int i6, int i7, int i8, int i9);

    public static native void nativeI420ToNV12(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, Object obj5, int i5, int i6, int i7);

    @Override // org.webrtc.YuvHelper.Natives
    public void abgrToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        nativeAbgrToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6);
    }

    @Override // org.webrtc.YuvHelper.Natives
    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    @Override // org.webrtc.YuvHelper.Natives
    public void i420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }

    @Override // org.webrtc.YuvHelper.Natives
    public void i420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }

    @Override // org.webrtc.YuvHelper.Natives
    public void i420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static YuvHelper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new YuvHelperJni() : (YuvHelper.Natives) obj;
    }

    public static void setInstanceForTesting(YuvHelper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }
}
