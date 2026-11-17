package com.facebook.mobileconfig;

import X.CFK;
import X.ETi;

/* loaded from: classes5.dex */
public class MobileConfigNativeFileRepository {
    public static String TAG = "MobileConfigNativeFileRepository";
    public static boolean isNativeBridgeInitialized;

    public static native void registerNativeBridge();

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }

    public static synchronized void registerFileRepository() {
        if (isNativeBridgeInitialized) {
            CFK.A05(TAG, "Attempting to initialize the native JNI bridge when it is already init. Skipping...");
        } else {
            CFK.A05(TAG, "Initializing the native JNI bridge for MobileConfigFileRepository.");
            registerNativeBridge();
            isNativeBridgeInitialized = true;
        }
    }
}
