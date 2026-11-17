package com.facebook.common.dextricks;

import X.BV5;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class MemoryEnlargementHack {
    public static final String TAG = "MemoryEnlargementHack";

    public static void growMyHeap(Context context) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str;
        if ((context.getApplicationInfo().flags & 1048576) == 0) {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            cls.getMethod("clearGrowthLimit", null).invoke(BV5.A0d("getRuntime", cls), null);
            str = "largeHeap enabled manually; was not set in manifest";
        } else {
            str = "largeHeap already enabled in manifest";
        }
        Log.v(TAG, str);
    }
}
