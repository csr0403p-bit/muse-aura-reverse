package com.crossapp.tigonhttp.noise;

import X.C60O;
import X.C6686ERv;
import X.C7384Etj;
import X.ERo;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class NoiseChannelManagerHolder {
    public static final C6686ERv Companion = new C6686ERv();
    public static volatile boolean soLoaded;
    public volatile NoiseConnectionDemandListener connectionDemandListener;
    public volatile long connectionDemandListenerRegistration;
    public final HybridData mHybridData;

    public NoiseChannelManagerHolder(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public static final native String connectionKeyFromUrlNative(String str);

    public static final native HybridData createNative();

    private final native long registerConnectionDemandListenerNative(NoiseConnectionDemandListener noiseConnectionDemandListener);

    private final native void rejectConnectionDemandNative(long j, int i);

    private final native void setHttpEnabledNative(boolean z);

    private final native void setHttpZstdEnabledNative(boolean z);

    private final native void setHttpZstdPathsNative(String str);

    private final native void setHttpZstdUploadsEnabledNative(boolean z);

    private final native void unregisterConnectionDemandListenerNative(long j);

    public final synchronized long tryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context(NoiseConnectionDemandListener noiseConnectionDemandListener) {
        long jRegisterConnectionDemandListenerNative = registerConnectionDemandListenerNative(noiseConnectionDemandListener);
        if (jRegisterConnectionDemandListenerNative <= 0) {
            return 0L;
        }
        this.connectionDemandListener = noiseConnectionDemandListener;
        this.connectionDemandListenerRegistration = jRegisterConnectionDemandListenerNative;
        return jRegisterConnectionDemandListenerNative;
    }

    public final synchronized void unregisterConnectionDemandListener(long j) {
        unregisterConnectionDemandListenerNative(j);
        if (j == this.connectionDemandListenerRegistration) {
            this.connectionDemandListenerRegistration = 0L;
            this.connectionDemandListener = null;
        }
    }

    public final void rejectConnectionDemand(long j, ERo eRo) {
        if (j <= 0) {
            throw C60O.A0i("Noise connection-demand IDs are strictly positive");
        }
        rejectConnectionDemandNative(j, eRo.nativeValue);
    }

    public final void setHttpEnabled(boolean z) {
        setHttpEnabledNative(z);
    }

    public final void setHttpZstdEnabled(boolean z) {
        setHttpZstdEnabledNative(z);
    }

    public final void setHttpZstdPaths(String str) {
        setHttpZstdPathsNative(str);
    }

    public final void setHttpZstdUploadsEnabled(boolean z) {
        setHttpZstdUploadsEnabledNative(z);
    }
}
