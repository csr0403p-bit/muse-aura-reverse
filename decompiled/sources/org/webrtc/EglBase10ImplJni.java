package org.webrtc;

import org.webrtc.EglBase10Impl;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class EglBase10ImplJni implements EglBase10Impl.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native long nativeGetCurrentNativeEGLContext();

    public static EglBase10Impl.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new EglBase10ImplJni() : (EglBase10Impl.Natives) obj;
    }

    public static void setInstanceForTesting(EglBase10Impl.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.EglBase10Impl.Natives
    public long getCurrentNativeEGLContext() {
        return nativeGetCurrentNativeEGLContext();
    }
}
