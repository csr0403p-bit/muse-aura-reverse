package X;

import com.facebook.common.jniexecutors.PooledNativeRunnable;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class EUP {
    public final PooledNativeRunnable allocate(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        PooledNativeRunnable pooledNativeRunnableA01 = PooledNativeRunnable.pool.A01();
        C7384Etj.A0U(pooledNativeRunnableA01);
        PooledNativeRunnable pooledNativeRunnable = pooledNativeRunnableA01;
        pooledNativeRunnable.mHybridData = hybridData;
        return pooledNativeRunnable;
    }
}
