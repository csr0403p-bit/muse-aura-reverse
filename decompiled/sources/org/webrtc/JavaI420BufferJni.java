package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class JavaI420BufferJni implements JavaI420Buffer.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeCropAndScaleI420(Object obj, int i, Object obj2, int i2, Object obj3, int i3, int i4, int i5, int i6, int i7, Object obj4, int i8, Object obj5, int i9, Object obj6, int i10, int i11, int i12);

    @Override // org.webrtc.JavaI420Buffer.Natives
    public void cropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12) {
        nativeCropAndScaleI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, i5, i6, i7, byteBuffer4, i8, byteBuffer5, i9, byteBuffer6, i10, i11, i12);
    }

    public static JavaI420Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JavaI420BufferJni() : (JavaI420Buffer.Natives) obj;
    }

    public static void setInstanceForTesting(JavaI420Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }
}
