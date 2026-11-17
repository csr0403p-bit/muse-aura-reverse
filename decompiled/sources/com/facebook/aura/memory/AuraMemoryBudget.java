package com.facebook.aura.memory;

import X.C4JM;
import android.app.ActivityManager;
import android.app.Application;

/* loaded from: classes2.dex */
public final class AuraMemoryBudget {
    public static final long BYTES_PER_CHAR = 2;
    public static final AuraMemoryBudget INSTANCE = new AuraMemoryBudget();
    public static volatile Boolean resolvedLowRam;

    public static /* synthetic */ long budgetBytes$default(AuraMemoryBudget auraMemoryBudget, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j / 2;
        }
        return !auraMemoryBudget.isLowRamDevice() ? j : j2;
    }

    public final boolean isLowRamDevice() {
        ActivityManager activityManager;
        Boolean bool = resolvedLowRam;
        if (bool != null) {
            return bool.booleanValue();
        }
        Application application = C4JM.A00;
        Object systemService = application != null ? application.getSystemService("activity") : null;
        if (!(systemService instanceof ActivityManager) || (activityManager = (ActivityManager) systemService) == null) {
            return false;
        }
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        resolvedLowRam = Boolean.valueOf(zIsLowRamDevice);
        return zIsLowRamDevice;
    }

    public final long stringBytes(String str) {
        return (str != null ? str.length() : 0) * 2;
    }

    public final long budgetBytes(long j, long j2) {
        return isLowRamDevice() ? j2 : j;
    }
}
