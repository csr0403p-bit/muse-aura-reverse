package com.facebook.traffic.nts.providers.reachability;

import X.AnonymousClass003;
import X.C60Q;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.facebook.debug.tracer.Tracer;

/* loaded from: classes5.dex */
public final class TrafficNTSReachabilityListener {
    public final ConnectivityManager connectivityManager;
    public final Context context;
    public ConnectivityManager.NetworkCallback networkCallback;
    public final ReachabilityV2ProviderAppLayer reachabilityV2ProviderAppLayer;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onNetworkConnectivityChanged(NetworkCapabilities networkCapabilities) {
        Tracer.A01("TrafficNTSReachabilityListener.onNetworkConnectivityChanged");
        int i = 0;
        if (networkCapabilities == null) {
            i = 1;
        } else {
            try {
                try {
                    if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                        i = 3;
                    } else if (networkCapabilities.hasTransport(0)) {
                        i = 2;
                    }
                } catch (SecurityException unused) {
                }
            } finally {
                Tracer.A00();
            }
        }
        this.reachabilityV2ProviderAppLayer.updateConnectionType(i);
    }

    private final void registerNetworkCallback() {
        Tracer.A01("TrafficNTSReachabilityListener.registerNetworkCallback");
        try {
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.facebook.traffic.nts.providers.reachability.TrafficNTSReachabilityListener.registerNetworkCallback.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    C7384Etj.A0Y(network, 0);
                    TrafficNTSReachabilityListener trafficNTSReachabilityListener = TrafficNTSReachabilityListener.this;
                    trafficNTSReachabilityListener.onNetworkConnectivityChanged(trafficNTSReachabilityListener.connectivityManager.getNetworkCapabilities(network));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    C7384Etj.A0Y(networkCapabilities, 1);
                    TrafficNTSReachabilityListener.this.onNetworkConnectivityChanged(networkCapabilities);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                    C7384Etj.A0Y(network, 0);
                    TrafficNTSReachabilityListener trafficNTSReachabilityListener = TrafficNTSReachabilityListener.this;
                    trafficNTSReachabilityListener.onNetworkConnectivityChanged(trafficNTSReachabilityListener.connectivityManager.getNetworkCapabilities(network));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    C7384Etj.A0Y(network, 0);
                    TrafficNTSReachabilityListener trafficNTSReachabilityListener = TrafficNTSReachabilityListener.this;
                    trafficNTSReachabilityListener.onNetworkConnectivityChanged(trafficNTSReachabilityListener.connectivityManager.getNetworkCapabilities(network));
                }
            };
            this.networkCallback = networkCallback;
            try {
                this.connectivityManager.registerDefaultNetworkCallback(networkCallback);
            } catch (SecurityException unused) {
            } catch (RuntimeException e) {
                if (!C60Q.A0e(e).equals("android.net.ConnectivityManager$TooManyRequestsException")) {
                    throw e;
                }
                CFK.A0A("TrafficNTSReachabilityListener", "Network callback limit exceeded", e);
            }
        } finally {
            Tracer.A00();
        }
    }

    public TrafficNTSReachabilityListener(Context context, ReachabilityV2ProviderAppLayer reachabilityV2ProviderAppLayer) {
        AnonymousClass003.A0u(context, reachabilityV2ProviderAppLayer);
        this.context = context;
        this.reachabilityV2ProviderAppLayer = reachabilityV2ProviderAppLayer;
        Object systemService = context.getSystemService("connectivity");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        registerNetworkCallback();
    }
}
