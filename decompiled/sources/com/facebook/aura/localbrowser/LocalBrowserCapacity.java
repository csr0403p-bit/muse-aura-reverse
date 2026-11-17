package com.facebook.aura.localbrowser;

import X.C7384Etj;
import X.CFK;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class LocalBrowserCapacity {
    public static final int $stable = 0;
    public static final LocalBrowserCapacity INSTANCE = new LocalBrowserCapacity();

    public final int forDevice(long j, boolean z) {
        if (z) {
            return 1;
        }
        if (j >= LocalBrowserCapacityKt.THREE_TASKS_MIN_RAM_BYTES) {
            return 3;
        }
        return j >= LocalBrowserCapacityKt.TWO_TASKS_MIN_RAM_BYTES ? 2 : 1;
    }

    public final boolean isLowRam(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                if (totalRam(activityManager) >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException e) {
            CFK.A0A(LocalBrowserCapacityKt.TAG, "Device memory lookup failed; treating the device as low on RAM", e);
            return true;
        }
    }

    public final int read(Context context) {
        int iForDevice = 1;
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                if (activityManager != null) {
                    iForDevice = forDevice(totalRam(activityManager), activityManager.isLowRamDevice());
                    return iForDevice;
                }
            } catch (RuntimeException e) {
                CFK.A0A(LocalBrowserCapacityKt.TAG, "Device memory lookup failed; limiting local browser capacity to 1", e);
            }
        }
        return iForDevice;
    }

    private final long totalRam(ActivityManager activityManager) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
