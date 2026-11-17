package org.webrtc;

import org.webrtc.Logging;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class LoggingJni implements Logging.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeEnableLogThreads();

    public static native void nativeEnableLogTimeStamps();

    public static native void nativeEnableLogToDebugOutput(int i);

    public static native void nativeLog(int i, Object obj, Object obj2);

    public static Logging.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LoggingJni() : (Logging.Natives) obj;
    }

    public static void setInstanceForTesting(Logging.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.Logging.Natives
    public void enableLogThreads() {
        nativeEnableLogThreads();
    }

    @Override // org.webrtc.Logging.Natives
    public void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    @Override // org.webrtc.Logging.Natives
    public void enableLogToDebugOutput(int i) {
        nativeEnableLogToDebugOutput(i);
    }

    @Override // org.webrtc.Logging.Natives
    public void log(int i, String str, String str2) {
        nativeLog(i, str, str2);
    }
}
