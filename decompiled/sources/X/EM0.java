package X;

import android.net.NetworkRequest;

/* loaded from: classes5.dex */
public abstract class EM0 {
    public static final int[] A00(NetworkRequest networkRequest) {
        int[] capabilities = networkRequest.getCapabilities();
        C7384Etj.A0U(capabilities);
        return capabilities;
    }

    public static final int[] A01(NetworkRequest networkRequest) {
        int[] transportTypes = networkRequest.getTransportTypes();
        C7384Etj.A0U(transportTypes);
        return transportTypes;
    }
}
