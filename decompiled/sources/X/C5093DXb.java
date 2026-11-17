package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;

/* renamed from: X.DXb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5093DXb extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C5092DXa A00;

    public C5093DXb(C5092DXa c5092DXa) {
        this.A00 = c5092DXa;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        DXW dxw;
        C5092DXa c5092DXa = this.A00;
        if (c5092DXa.A09) {
            c5092DXa.A09 = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (c5092DXa) {
                if (jElapsedRealtime - c5092DXa.A00 < c5092DXa.A01) {
                    return;
                }
                c5092DXa.A00 = jElapsedRealtime;
                C5094DXc c5094DXc = c5092DXa.A03;
                if (c5094DXc == null || (dxw = c5094DXc.A00.A0Z) == null) {
                    return;
                }
                Trace.beginSection("HeroServicePlayerPool.retryStalledOrErroredPlayers");
                try {
                    boolean z = dxw.A05.retryOnNetworkRestoredForegroundOnly;
                    Iterator itA10 = BV5.A10(dxw.A03.A04());
                    while (itA10.hasNext()) {
                        Dlw dlw = (Dlw) itA10.next();
                        if (!z || dlw.A2v) {
                            if (!dlw.A2m.isEmpty() || (dlw.A2S == 2 && dlw.A2W > 0 && SystemClock.elapsedRealtime() - dlw.A2W > dlw.A2C.retryOnNetworkRestoredStallThresholdMs)) {
                                Dlw.A0v(dlw, "retryWithStop", new Object[0]);
                                Dlw.A1C(dlw.A0f.obtainMessage(28, 1, 0), dlw);
                            }
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.A00.A09 = true;
    }
}
