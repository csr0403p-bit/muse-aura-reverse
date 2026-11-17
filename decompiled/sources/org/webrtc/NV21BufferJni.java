package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.NV21Buffer;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class NV21BufferJni implements NV21Buffer.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, Object obj2, int i9, Object obj3, int i10, Object obj4, int i11);

    @Override // org.webrtc.NV21Buffer.Natives
    public void cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11) {
        nativeCropAndScale(i, i2, i3, i4, i5, i6, bArr, i7, i8, byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11);
    }

    public static NV21Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new NV21BufferJni() : (NV21Buffer.Natives) obj;
    }

    public static void setInstanceForTesting(NV21Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }
}
