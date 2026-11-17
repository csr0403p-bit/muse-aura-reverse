package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EKp extends ConnectivityManager.NetworkCallback {
    public static Boolean A00;
    public static NetworkCapabilities A01;
    public static boolean A02;
    public static final EKp A03 = new EKp();
    public static final Object A04 = C3cG.A0T();
    public static final Map<G0U<ENN, Unit>, NetworkRequest> A05 = C3cG.A0j();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C7384Etj.A0Y(networkCapabilities, 1);
        EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (A04) {
            A01 = networkCapabilities;
            A02 = true;
        }
        A03();
    }

    public static final Unit A01(ConnectivityManager connectivityManager, G0U g0u) {
        Unit unit;
        synchronized (A04) {
            Map<G0U<ENN, Unit>, NetworkRequest> map = A05;
            map.remove(g0u);
            if (map.isEmpty()) {
                EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(A03);
                A00 = null;
                A01 = null;
                A02 = false;
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static final Function0<Unit> A02(ConnectivityManager connectivityManager, NetworkRequest networkRequest, G0U<? super ENN, Unit> g0u) {
        synchronized (A04) {
            Map<G0U<ENN, Unit>, NetworkRequest> map = A05;
            if (map.isEmpty()) {
                EK9 ek9A00 = EK9.A00();
                String str = AbstractC6620EKo.A00;
                ek9A00.A02(str, "NetworkRequestConstraintController register shared callback");
                try {
                    connectivityManager.registerDefaultNetworkCallback(A03);
                } catch (SecurityException e) {
                    EK9.A00();
                    Log.e(str, "NetworkRequestConstraintController couldn't register callback", e);
                    g0u.invoke(new C6645ELp(7));
                    return new C7587F5a(4);
                }
            } else if (A02 && A00 != null) {
                EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController send initial capabilities");
                NetworkCapabilities networkCapabilities = A01;
                Boolean bool = A00;
                C7384Etj.A0X(bool);
                g0u.invoke((bool.booleanValue() || !networkRequest.canBeSatisfiedBy(networkCapabilities)) ? new C6645ELp(7) : EN9.A00);
            }
            map.put(g0u, networkRequest);
        }
        return new C7593F5g(17, connectivityManager, g0u);
    }

    public static final void A03() {
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (A04) {
            if (!A02 || A00 == null) {
                EK9.A00().A02(AbstractC6620EKo.A00, C60P.A1P(", capabilitiesInitialized=", C3cG.A0f(A00, "Not dispatching constraint state yet: isBlocked="), A02));
                return;
            }
            Iterator itA0n = AnonymousClass002.A0n(A05);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                G0U g0u = (G0U) entry.getKey();
                NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                NetworkCapabilities networkCapabilities = A01;
                Boolean bool = A00;
                C7384Etj.A0X(bool);
                arrayListA0h.add(new HxE(g0u, (bool.booleanValue() || !networkRequest.canBeSatisfiedBy(networkCapabilities)) ? new C6645ELp(7) : EN9.A00));
            }
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                HxE hxE = (HxE) it.next();
                ((G0U) hxE.first).invoke(hxE.second);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        EK9.A00().A02(AbstractC6620EKo.A00, FGI.A0r("NetworkRequestConstraintController onBlockedStatusChanged callback ", z));
        synchronized (A04) {
            Boolean bool = A00;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (boolValueOf.equals(bool)) {
                return;
            }
            A00 = boolValueOf;
            A03();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController onLost callback");
        synchronized (A04) {
            A01 = null;
            Iterator itA11 = BV5.A11(A05);
            while (itA11.hasNext()) {
                ((G0U) itA11.next()).invoke(new C6645ELp(7));
            }
        }
    }
}
