package com.facebook.aura.network.transport;

import X.BV4;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7Je;
import android.net.Uri;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class HatchVmInboundTraffic {
    public static final HatchVmInboundTraffic INSTANCE = new HatchVmInboundTraffic();
    public static final ConcurrentHashMap<String, Long> lastReceivedAtMs = C60O.A1C();

    public final String hostOf(String str) {
        C7384Etj.A0Y(str, 0);
        Uri uriA02 = C7Je.A02(str);
        if (uriA02 != null) {
            return uriA02.getHost();
        }
        return null;
    }

    public final boolean receivedWithin(String str, long j) {
        Number numberA0j;
        C7384Etj.A0Y(str, 0);
        String strHostOf = hostOf(str);
        return (strHostOf == null || (numberA0j = BV6.A0j(strHostOf, lastReceivedAtMs)) == null || C3cG.A04(numberA0j.longValue()) >= j) ? false : true;
    }

    public final void recordBytesReceived(String str) {
        C7384Etj.A0Y(str, 0);
        BV4.A1F(str, lastReceivedAtMs, SystemClock.elapsedRealtime());
    }

    public final void clear$fbandroid_express_aura_java_com_facebook_aura_network_transport_transport() {
        lastReceivedAtMs.clear();
    }
}
