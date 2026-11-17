package com.facebook.mobileconfig;

import X.ETi;

/* loaded from: classes5.dex */
public class MobileConfigJestE2EPanelUtils {
    public static native boolean getHasCompletedSchemaUpgrade();

    public static native boolean getHasEncounteredSchemaUpgradeFailure();

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }
}
