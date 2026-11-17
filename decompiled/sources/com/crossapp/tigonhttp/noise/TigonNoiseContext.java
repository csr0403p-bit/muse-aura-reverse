package com.crossapp.tigonhttp.noise;

import X.C06H;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.ERo;
import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class TigonNoiseContext implements AutoCloseable {
    public final AtomicBoolean locallyClosed;
    public final HybridData mHybridData;
    public final NoiseChannelManagerHolder managerHolder;

    private final native void closeNative();

    private final native HybridData createManagerHolderHybridDataNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native boolean isClosedNative();

    private final native long routeTokenNative();

    public final long registerConnectionDemandListener(NoiseConnectionDemandListener noiseConnectionDemandListener) {
        C7384Etj.A0Y(noiseConnectionDemandListener, 0);
        if (isClosed()) {
            return 0L;
        }
        return this.managerHolder.tryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context(noiseConnectionDemandListener);
    }

    public final void rejectConnectionDemand(long j, ERo eRo) {
        C7384Etj.A0Y(eRo, 1);
        this.managerHolder.rejectConnectionDemand(j, eRo);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (C3cI.A1W(this.locallyClosed)) {
            closeNative();
        }
    }

    public final boolean isClosed() {
        return this.locallyClosed.get() || isClosedNative();
    }

    public final long routeToken() {
        if (this.locallyClosed.get()) {
            return 0L;
        }
        return routeTokenNative();
    }

    public final void unregisterConnectionDemandListener(long j) {
        this.managerHolder.unregisterConnectionDemandListener(j);
    }

    public TigonNoiseContext(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.managerHolder = new NoiseChannelManagerHolder(createManagerHolderHybridDataNative());
        this.locallyClosed = C60O.A1E();
    }

    public /* synthetic */ TigonNoiseContext(HybridData hybridData, C06H c06h) {
        this(hybridData);
    }
}
