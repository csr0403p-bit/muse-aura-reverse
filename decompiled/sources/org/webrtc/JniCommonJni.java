package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class JniCommonJni implements JniCommon.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeAddRef(long j);

    public static native Object nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(Object obj);

    public static native void nativeReleaseRef(long j);

    public static JniCommon.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JniCommonJni() : (JniCommon.Natives) obj;
    }

    public static void setInstanceForTesting(JniCommon.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.JniCommon.Natives
    public void addRef(long j) {
        nativeAddRef(j);
    }

    @Override // org.webrtc.JniCommon.Natives
    public ByteBuffer allocateByteBuffer(int i) {
        return (ByteBuffer) nativeAllocateByteBuffer(i);
    }

    @Override // org.webrtc.JniCommon.Natives
    public void freeByteBuffer(ByteBuffer byteBuffer) {
        nativeFreeByteBuffer(byteBuffer);
    }

    @Override // org.webrtc.JniCommon.Natives
    public void releaseRef(long j) {
        nativeReleaseRef(j);
    }
}
