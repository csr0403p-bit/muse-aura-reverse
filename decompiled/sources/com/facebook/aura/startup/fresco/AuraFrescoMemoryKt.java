package com.facebook.aura.startup.fresco;

import X.ATD;
import X.C7167Ehc;
import X.C7384Etj;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes5.dex */
public abstract class AuraFrescoMemoryKt {
    public static final long BITMAP_CACHE_HEAP_FRACTION_DENOMINATOR = 8;
    public static final int BITMAP_CACHE_MAX_ENTRY_FRACTION = 2;
    public static final long BYTES_PER_MIB = 1048576;
    public static final int DEFAULT_MEMORY_CLASS_MB = 192;
    public static final int LOW_RAM_BITMAP_CACHE_BYTES = 8388608;
    public static final int MAX_BITMAP_CACHE_BYTES = 25165824;
    public static final int MIN_BITMAP_CACHE_BYTES = 8388608;

    public static final C7167Ehc createAuraBitmapMemoryCacheParams(Context context) {
        int memoryClass;
        int iA07;
        ActivityManager activityManager;
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("activity");
        if (!(systemService instanceof ActivityManager) || (activityManager = (ActivityManager) systemService) == null) {
            memoryClass = 192;
        } else {
            if (activityManager.isLowRamDevice()) {
                iA07 = 8388608;
                return new C7167Ehc(iA07, Integer.MAX_VALUE, iA07, iA07 / 2);
            }
            memoryClass = activityManager.getMemoryClass();
        }
        iA07 = (int) ATD.A07((memoryClass * 1048576) / 8, 8388608L, 25165824L);
        return new C7167Ehc(iA07, Integer.MAX_VALUE, iA07, iA07 / 2);
    }
}
