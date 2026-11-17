package com.facebook.aura.network.state;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C4JM;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.FGI;
import X.HnJ;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.SystemClock;
import com.facebook.aura.network.state.AuraNetworkState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class AuraNetworkMonitor {
    public static final AuraNetworkMonitor INSTANCE = new AuraNetworkMonitor();
    public static final String TAG = "AuraNetworkMonitor";
    public static final BLG<AuraNetworkState> _state;
    public static final Map<Network, NetworkCapabilities> activeNetworks;
    public static final Object lock;
    public static Long offlineSinceMs;
    public static final AtomicBoolean started;
    public static final C1BN<AuraNetworkState> state;

    private final ConnectivityManager defaultConnectivityManager() {
        try {
            Object systemService = C4JM.A00().getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                return (ConnectivityManager) systemService;
            }
            return null;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to resolve ConnectivityManager", e);
            return null;
        }
    }

    private final Transport transportOf(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) ? Transport.WIFI : networkCapabilities.hasTransport(0) ? Transport.CELLULAR : (networkCapabilities.hasTransport(2) && isWatch()) ? Transport.BLUETOOTH : networkCapabilities.hasTransport(4) ? Transport.VPN : Transport.OTHER;
    }

    public final void setStateForTesting$fbandroid_express_aura_java_com_facebook_aura_network_state_state(AuraNetworkState auraNetworkState) {
        C7384Etj.A0Y(auraNetworkState, 0);
        _state.Af8(auraNetworkState);
    }

    public final class Callback extends ConnectivityManager.NetworkCallback {
        public final ConnectivityManager cm;

        public Callback(ConnectivityManager connectivityManager) {
            C7384Etj.A0Y(connectivityManager, 0);
            this.cm = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C7384Etj.A0Y(network, 0);
            try {
                NetworkCapabilities networkCapabilities = this.cm.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    AuraNetworkMonitor.INSTANCE.handleNetworkCapabilities(network, networkCapabilities);
                }
            } catch (SecurityException e) {
                CFK.A06(AuraNetworkMonitor.TAG, FGI.A0M("getNetworkCapabilities denied: ", e.getMessage()));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C7384Etj.A0Y(network, 0);
            AuraNetworkMonitor.INSTANCE.handleLost(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AnonymousClass003.A0u(network, networkCapabilities);
            AuraNetworkMonitor.INSTANCE.handleNetworkCapabilities(network, networkCapabilities);
        }
    }

    static {
        C9286GCn c9286GCnA01 = HnJ.A01(AuraNetworkState.Unknown.INSTANCE);
        _state = c9286GCnA01;
        state = C3Pi.A00(c9286GCnA01);
        started = C60O.A1E();
        activeNetworks = C3cG.A0j();
        lock = C3cG.A0T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLost(Network network) {
        synchronized (lock) {
            activeNetworks.remove(network);
            INSTANCE.recomputeState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNetworkCapabilities(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (lock) {
            activeNetworks.put(network, networkCapabilities);
            INSTANCE.recomputeState();
        }
    }

    private final void publish(AuraNetworkState auraNetworkState) {
        Long lValueOf;
        if (C7384Etj.areEqual(auraNetworkState, AuraNetworkState.Offline.INSTANCE)) {
            Long l = offlineSinceMs;
            lValueOf = Long.valueOf(l != null ? l.longValue() : SystemClock.elapsedRealtime());
        } else {
            lValueOf = null;
        }
        offlineSinceMs = lValueOf;
        _state.Af8(auraNetworkState);
    }

    private final void recomputeState() {
        Object next;
        NetworkCapabilities networkCapabilities;
        AuraNetworkState auraNetworkStateOnlineFrom;
        Map<Network, NetworkCapabilities> map = activeNetworks;
        if (map.isEmpty()) {
            auraNetworkStateOnlineFrom = AuraNetworkState.Offline.INSTANCE;
        } else {
            Iterator itA0n = AnonymousClass002.A0n(map);
            if (itA0n.hasNext()) {
                next = itA0n.next();
                if (itA0n.hasNext()) {
                    NetworkCapabilities networkCapabilities2 = (NetworkCapabilities) ((Map.Entry) next).getValue();
                    AuraNetworkMonitor auraNetworkMonitor = INSTANCE;
                    int iScoreCapabilities = auraNetworkMonitor.scoreCapabilities(networkCapabilities2);
                    do {
                        Object next2 = itA0n.next();
                        int iScoreCapabilities2 = auraNetworkMonitor.scoreCapabilities((NetworkCapabilities) ((Map.Entry) next2).getValue());
                        if (iScoreCapabilities < iScoreCapabilities2) {
                            next = next2;
                            iScoreCapabilities = iScoreCapabilities2;
                        }
                    } while (itA0n.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (networkCapabilities = (NetworkCapabilities) entry.getValue()) == null) {
                return;
            } else {
                auraNetworkStateOnlineFrom = onlineFrom(networkCapabilities);
            }
        }
        publish(auraNetworkStateOnlineFrom);
    }

    private final int scoreCapabilities(NetworkCapabilities networkCapabilities) {
        int i = networkCapabilities.hasCapability(12) ? 1000 : 0;
        if (networkCapabilities.hasCapability(16)) {
            i += 500;
        }
        return networkCapabilities.hasTransport(1) ? i + 30 : networkCapabilities.hasTransport(0) ? i + 20 : networkCapabilities.hasTransport(4) ? i + 10 : i;
    }

    public static /* synthetic */ void start$default(AuraNetworkMonitor auraNetworkMonitor, ConnectivityManager connectivityManager, int i, Object obj) {
        if ((i & 1) != 0) {
            connectivityManager = null;
        }
        auraNetworkMonitor.start(connectivityManager);
    }

    public final Long getOfflineForMs() {
        Long l;
        synchronized (lock) {
            l = offlineSinceMs;
        }
        if (l != null) {
            return Long.valueOf(C3cG.A04(l.longValue()));
        }
        return null;
    }

    public final C1BN<AuraNetworkState> getState() {
        return state;
    }

    public final List<Transport> getTransports() {
        ArrayList arrayListA0i;
        synchronized (lock) {
            Collection<NetworkCapabilities> collectionValues = activeNetworks.values();
            AuraNetworkMonitor auraNetworkMonitor = INSTANCE;
            arrayListA0i = AnonymousClass003.A0i(collectionValues);
            Iterator<NetworkCapabilities> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(auraNetworkMonitor.transportOf(it.next()));
            }
        }
        return AbstractC0878AGe.A0W(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayListA0i)));
    }

    public final boolean isKnownOffline() {
        return _state.getValue() instanceof AuraNetworkState.Offline;
    }

    public final boolean isOnBluetooth() {
        AuraNetworkState.Online online;
        AuraNetworkState value = _state.getValue();
        Transport transport = null;
        if ((value instanceof AuraNetworkState.Online) && (online = (AuraNetworkState.Online) value) != null) {
            transport = online.transport;
        }
        return AnonymousClass002.A1Z(transport, Transport.BLUETOOTH);
    }

    public final boolean isOnline() {
        return _state.getValue() instanceof AuraNetworkState.Online;
    }

    public final void resetForTesting$fbandroid_express_aura_java_com_facebook_aura_network_state_state() {
        started.set(false);
        synchronized (lock) {
            activeNetworks.clear();
            INSTANCE.publish(AuraNetworkState.Unknown.INSTANCE);
        }
    }

    public final void start(ConnectivityManager connectivityManager) {
        AtomicBoolean atomicBoolean = started;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (connectivityManager == null) {
                connectivityManager = defaultConnectivityManager();
            }
            if (connectivityManager == null) {
                CFK.A06(TAG, "ConnectivityManager unavailable, cannot register network callback");
                atomicBoolean.set(false);
                return;
            }
            NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(4).addTransportType(1).addTransportType(0);
            if (INSTANCE.isWatch()) {
                builderAddTransportType.addTransportType(2);
            }
            try {
                connectivityManager.registerNetworkCallback(builderAddTransportType.removeCapability(15).build(), new Callback(connectivityManager));
                seedStateFromActiveNetwork(connectivityManager);
            } catch (Exception e) {
                CFK.A08(TAG, "Failed to register network callback", e);
                atomicBoolean.set(false);
            }
        }
    }

    private final boolean isWatch() {
        return C3cG.A06().getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    private final AuraNetworkState.Online onlineFrom(NetworkCapabilities networkCapabilities) {
        return new AuraNetworkState.Online(transportOf(networkCapabilities), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11));
    }

    private final void seedStateFromActiveNetwork(ConnectivityManager connectivityManager) {
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
            synchronized (lock) {
                if (activeNetworks.isEmpty()) {
                    AuraNetworkMonitor auraNetworkMonitor = INSTANCE;
                    auraNetworkMonitor.publish(networkCapabilities != null ? auraNetworkMonitor.onlineFrom(networkCapabilities) : AuraNetworkState.Offline.INSTANCE);
                }
            }
        } catch (SecurityException e) {
            C3cG.A1G("getNetworkCapabilities denied while seeding: ", e.getMessage(), TAG);
        }
    }
}
