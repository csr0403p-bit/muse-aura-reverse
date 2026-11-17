package X;

import com.facebook.common.jniexecutors.NativeRunnable;
import com.facebook.common.jniexecutors.PooledNativeRunnable;

/* loaded from: classes5.dex */
public final class EUO extends EUQ<PooledNativeRunnable> {
    @Override // X.EUQ
    public final /* bridge */ /* synthetic */ Object A00() {
        return new PooledNativeRunnable(null);
    }

    @Override // X.EUQ
    public final /* bridge */ /* synthetic */ void A01(Object obj) {
        NativeRunnable nativeRunnable = (NativeRunnable) obj;
        C7384Etj.A0Y(nativeRunnable, 0);
        nativeRunnable.mNativeExecutor = null;
    }

    @Override // X.EUQ
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        NativeRunnable nativeRunnable = (NativeRunnable) obj;
        if (nativeRunnable == null) {
            throw new IllegalStateException("Required value was null.");
        }
        nativeRunnable.mHybridData = null;
    }
}
