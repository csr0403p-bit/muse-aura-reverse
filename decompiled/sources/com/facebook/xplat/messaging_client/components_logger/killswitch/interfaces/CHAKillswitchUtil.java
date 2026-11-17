package com.facebook.xplat.messaging_client.components_logger.killswitch.interfaces;

/* loaded from: classes6.dex */
public final class CHAKillswitchUtil {
    public static long getDisabledComponentsMask() {
        return 0L;
    }

    public static boolean isCHAEnabled() {
        return true;
    }

    public static boolean isCHAFeatureEnabled(long j) {
        return false;
    }

    public static boolean isCHAFlowPerfMeasurementEnabled() {
        return false;
    }

    public static boolean isCHAGlobalPerfMeasurementEnabled() {
        return false;
    }
}
