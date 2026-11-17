package org.webrtc;

import org.webrtc.Environment;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class EnvironmentJni implements Environment.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native long nativeCreate(Object obj);

    public static native long nativeCurrentTimeNanos(long j);

    public static native void nativeFree(long j);

    public static Environment.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new EnvironmentJni() : (Environment.Natives) obj;
    }

    public static void setInstanceForTesting(Environment.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.Environment.Natives
    public long create(String str) {
        return nativeCreate(str);
    }

    @Override // org.webrtc.Environment.Natives
    public long currentTimeNanos(long j) {
        return nativeCurrentTimeNanos(j);
    }

    @Override // org.webrtc.Environment.Natives
    public void free(long j) {
        nativeFree(j);
    }
}
