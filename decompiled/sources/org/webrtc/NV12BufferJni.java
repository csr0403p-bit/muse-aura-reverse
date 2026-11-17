package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.NV12Buffer;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class NV12BufferJni implements NV12Buffer.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, int i10, Object obj2, int i11, Object obj3, int i12, Object obj4, int i13);

    @Override // org.webrtc.NV12Buffer.Natives
    public void cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13) {
        nativeCropAndScale(i, i2, i3, i4, i5, i6, byteBuffer, i7, i8, i9, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13);
    }

    public static NV12Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new NV12BufferJni() : (NV12Buffer.Natives) obj;
    }

    public static void setInstanceForTesting(NV12Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }
}
