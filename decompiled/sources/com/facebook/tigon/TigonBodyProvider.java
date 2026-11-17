package com.facebook.tigon;

import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonPropertyContainer;

/* loaded from: classes5.dex */
public abstract class TigonBodyProvider {
    public HybridData mHybridData;
    public final TigonPropertyContainer mProperties = new TigonPropertyContainer();

    public abstract void beginStream(TigonBodyStream tigonBodyStream);

    public abstract long getContentLength();

    public abstract String getName();

    public TigonPropertyContainer properties() {
        return this.mProperties;
    }

    public boolean supportsOutboundBackpressurePause() {
        return false;
    }

    public void setPausedForOutboundBackpressure(boolean z) {
    }
}
