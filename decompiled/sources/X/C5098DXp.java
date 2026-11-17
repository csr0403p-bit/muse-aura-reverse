package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.DXp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5098DXp extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C5099DXq A00;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C7384Etj.A0Y(network, 0);
        try {
            C5099DXq c5099DXq = this.A00;
            C5099DXq.A01(c5099DXq.A01.getNetworkCapabilities(network), c5099DXq);
        } catch (SecurityException e) {
            BzX.A01("NetworkPropertiesMonitor", e, "Failed to get network capabilities");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C7384Etj.A0Y(networkCapabilities, 1);
        C5099DXq.A01(networkCapabilities, this.A00);
    }

    public C5098DXp(C5099DXq c5099DXq) {
        this.A00 = c5099DXq;
    }
}
