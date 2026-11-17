package com.facebook.jni;

import X.C3463COl;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    public static native ArrayList<String> nativeGetArmFeatures();

    static {
        C3463COl.loadLibrary("fb");
    }
}
