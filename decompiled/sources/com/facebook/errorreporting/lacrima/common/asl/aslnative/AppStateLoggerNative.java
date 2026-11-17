package com.facebook.errorreporting.lacrima.common.asl.aslnative;

/* loaded from: classes.dex */
public class AppStateLoggerNative {
    public static final String[] SELF_SIGKILL_HOOK_SECTIONS = {"registerSelfSigkill:kill", "registerSelfSigkill:raise", "registerSelfSigkill:pthread_kill", "registerSelfSigkill:killpg", "registerSelfSigkill:tgkill", "registerSelfSigkill:_exit"};

    public static native void appInForeground(boolean z, boolean z2);

    public static native void disableSelfSigkillHandlers();

    public static native void enableSelfSigkillHandlingForFADv2();

    public static native boolean isShuttingDownNative();

    public static native void registerForMonitoringThreadLocalKeys(String str, boolean z);

    public static native boolean registerOomHandler();

    public static native boolean registerSelfSigkillHandler(int i);

    public static native int registerSelfSigkillHandlers();

    public static native void registerStreamWithBreakpad();

    public static native void registerWithNativeCrashHandler(String str, String str2, String str3, String str4, boolean z);

    public static native void selfSigkillWithoutUpdatingAppStateLogStatus();

    public static native void setBreakpadStreamDataNative(byte[] bArr);
}
