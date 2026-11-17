package com.facebook.traffic.nts.providers.reachability;

import X.AnonymousClass003;
import android.content.Context;

/* loaded from: classes5.dex */
public final class TrafficNTSReachabilityV2ProviderAppLayerUpcallsImpl implements ReachabilityV2ProviderAppLayerUpcalls {
    public final TrafficNTSReachabilityListener listener;

    public TrafficNTSReachabilityV2ProviderAppLayerUpcallsImpl(Context context, ReachabilityV2ProviderAppLayer reachabilityV2ProviderAppLayer) {
        AnonymousClass003.A0u(context, reachabilityV2ProviderAppLayer);
        this.listener = new TrafficNTSReachabilityListener(context, reachabilityV2ProviderAppLayer);
    }
}
