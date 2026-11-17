package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Unit;

/* renamed from: X.EKv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6626EKv extends ConnectivityManager.NetworkCallback {
    public final G0U<ENN, Unit> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C6626EKv(G0U<? super ENN, Unit> g0u) {
        this.A00 = g0u;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.A00.invoke(EN9.A00);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController onLost callback");
        this.A00.invoke(new C6645ELp(7));
    }
}
