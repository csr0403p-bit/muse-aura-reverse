package com.facebook.common.classmarkers;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder;

/* loaded from: classes5.dex */
public final class IsColdStartRun {
    public static final int BETAMAP_MARKER_VALUE = 1;
    public static final IsColdStartRun INSTANCE = new IsColdStartRun();

    static {
        if (ClassTracingLogger.A02) {
            ClassTracingLoggerNativeHolder.classLoadStarted(null);
            ClassTracingLoggerNativeHolder.classLoaded((1 << 32) | 2425405050L);
        }
    }
}
