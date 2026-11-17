package X;

import android.location.LocationManager;
import com.google.common.collect.EvictingQueue;

/* loaded from: classes5.dex */
public final class CwR implements InterfaceC4454CwW {
    public static final String[] A05 = {"gps", "network"};
    public EuR A00;
    public final LocationManager A01;
    public final C4449CwQ A02;
    public final C4448CwP A03;
    public final EvictingQueue A04 = new EvictingQueue(10);

    public CwR(LocationManager locationManager, C4449CwQ c4449CwQ, C4448CwP c4448CwP) {
        this.A02 = c4449CwQ;
        this.A01 = locationManager;
        this.A03 = c4448CwP;
    }
}
