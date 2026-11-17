package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DXq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5099DXq {
    public static final C5101DXs A06 = new C5101DXs();
    public static volatile C5099DXq A07;
    public ConnectivityManager.NetworkCallback A00;
    public final ConnectivityManager A01;
    public final CopyOnWriteArraySet A02;
    public final Context A03;
    public volatile C5100DXr A04;
    public volatile Integer A05;

    public static final synchronized C5099DXq A00(Context context) {
        C5099DXq c5099DXq;
        synchronized (A06) {
            C7384Etj.A0Y(context, 0);
            if (A07 == null) {
                A07 = new C5099DXq(context);
                try {
                    C5099DXq c5099DXq2 = A07;
                    if (c5099DXq2 == null) {
                        C7384Etj.A0b("instance");
                        throw F60.createAndThrow();
                    }
                    if (c5099DXq2.A00 == null) {
                        C5098DXp c5098DXp = new C5098DXp(c5099DXq2);
                        c5099DXq2.A00 = c5098DXp;
                        c5099DXq2.A01.registerDefaultNetworkCallback(c5098DXp);
                    }
                } catch (Exception e) {
                    BzX.A01("NetworkPropertiesMonitor", e, "Failed to register network callback");
                }
            }
            c5099DXq = A07;
            if (c5099DXq == null) {
                C7384Etj.A0b("instance");
                throw F60.createAndThrow();
            }
        }
        return c5099DXq;
    }

    public static final void A01(NetworkCapabilities networkCapabilities, C5099DXq c5099DXq) {
        if (networkCapabilities != null) {
            c5099DXq.A04.A07 = Boolean.valueOf(networkCapabilities.hasTransport(4));
            c5099DXq.A04.A08 = Boolean.valueOf(networkCapabilities.hasTransport(1));
            c5099DXq.A04.A00 = Boolean.valueOf(networkCapabilities.hasTransport(0));
            c5099DXq.A04.A03 = Boolean.valueOf(!networkCapabilities.hasCapability(11));
            c5099DXq.A04.A04 = Boolean.valueOf(networkCapabilities.hasCapability(16));
            c5099DXq.A04.A02 = Boolean.valueOf(networkCapabilities.hasCapability(17));
            c5099DXq.A04.A05 = Boolean.valueOf(!networkCapabilities.hasCapability(18));
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                c5099DXq.A04.A01 = Boolean.valueOf(networkCapabilities.hasCapability(29));
                if (i >= 36) {
                    c5099DXq.A04.A06 = Boolean.valueOf(!networkCapabilities.hasCapability(37) && networkCapabilities.hasTransport(10));
                }
            }
            Integer num = c5099DXq.A05;
            int iHashCode = c5099DXq.A04.hashCode();
            if (num == null || num.intValue() != iHashCode) {
                Iterator itA0N = C7384Etj.A0N(c5099DXq.A02);
                if (itA0N.hasNext()) {
                    itA0N.next();
                    throw BV4.A0a("onNetworkPropertiesChanged");
                }
                c5099DXq.A05 = BV5.A0X(c5099DXq.A04);
            }
        }
    }

    public C5099DXq(Context context) {
        this.A03 = context;
        C5100DXr c5100DXr = new C5100DXr();
        c5100DXr.A07 = null;
        c5100DXr.A08 = null;
        c5100DXr.A00 = null;
        c5100DXr.A05 = null;
        c5100DXr.A01 = null;
        c5100DXr.A03 = null;
        c5100DXr.A04 = null;
        c5100DXr.A02 = null;
        c5100DXr.A06 = null;
        this.A04 = c5100DXr;
        this.A02 = new CopyOnWriteArraySet();
        Object systemService = context.getSystemService("connectivity");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A01 = (ConnectivityManager) systemService;
    }
}
