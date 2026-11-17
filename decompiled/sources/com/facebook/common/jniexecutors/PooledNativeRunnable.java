package com.facebook.common.jniexecutors;

import X.C60O;
import X.EUL;
import X.EUO;
import X.EUP;
import android.util.Log;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class PooledNativeRunnable extends NativeRunnable {
    public static final EUP Companion = new EUP();
    public static final EUL<PooledNativeRunnable> pool;

    public PooledNativeRunnable() {
        super(null);
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        EUO euo = new EUO();
        if (awakeTimeSinceBootClock == null) {
            throw C60O.A0i("Must add a clock to the object pool builder");
        }
        pool = new EUL<>(euo, awakeTimeSinceBootClock, PooledNativeRunnable.class);
    }

    public static final PooledNativeRunnable allocate(HybridData hybridData) {
        return Companion.allocate(hybridData);
    }

    @Override // com.facebook.common.jniexecutors.NativeRunnable, java.lang.Runnable
    public void run() {
        try {
            runNativeDirectly();
        } catch (Exception e) {
            Log.e("PooledNativeRunnable", "run crashed", e);
        }
        pool.A02(this);
    }
}
