package X;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: X.ExP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7475ExP {
    public static int A00(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.getLinkDownstreamBandwidthKbps();
        }
        return -1;
    }
}
