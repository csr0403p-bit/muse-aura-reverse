package org.webrtc.org.jni_zero;

import org.webrtc.org.jni_zero.JniZero;

/* loaded from: classes5.dex */
public class JniZeroJni implements JniZero.Natives {
    public static JniTestInstanceHolder sOverride;

    public static JniZero.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JniZeroJni() : (JniZero.Natives) obj;
    }

    public static void setInstanceForTesting(JniZero.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.org.jni_zero.JniZero.Natives
    public void setJniClassLoader(ClassLoader classLoader) {
        GEN_JNI.org_jni_1zero_JniZero_setJniClassLoader(classLoader);
    }
}
