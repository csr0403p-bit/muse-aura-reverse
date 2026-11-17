package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Cbe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3649Cbe {
    public static HandlerThread A05;
    public static C3649Cbe A06;
    public static final Object A07 = C3cG.A0T();
    public final Context A00;
    public final CUD A01;
    public final HashMap A02;
    public final C3648Cbd A03;
    public volatile Handler A04;

    public final void A00(ServiceConnection serviceConnection, String str, String str2, boolean z) {
        Cbb cbb = new Cbb(str, str2, z);
        HashMap map = this.A02;
        synchronized (map) {
            Cbc cbc = (Cbc) map.get(cbb);
            if (cbc == null) {
                throw BV5.A0U("Nonexistent connection status for service config: ", cbb.toString());
            }
            Map map2 = cbc.A05;
            if (!map2.containsKey(serviceConnection)) {
                throw BV5.A0U("Trying to unbind a GmsServiceConnection  that was not bound before.  config=", cbb.toString());
            }
            map2.remove(serviceConnection);
            if (map2.isEmpty()) {
                this.A04.sendMessageDelayed(this.A04.obtainMessage(0, cbb), 5000L);
            }
        }
    }

    public C3649Cbe() {
    }

    public C3649Cbe(Context context, Looper looper) {
        this.A02 = BV4.A0u();
        C3648Cbd c3648Cbd = new C3648Cbd(this);
        this.A03 = c3648Cbd;
        this.A00 = context.getApplicationContext();
        this.A04 = new HandlerC3650Cbf(looper, c3648Cbd);
        this.A01 = CUD.A00();
    }
}
