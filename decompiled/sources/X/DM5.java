package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class DM5 extends BroadcastReceiver {
    public final /* synthetic */ DM4 A00;

    public DM5(DM4 dm4) {
        this.A00 = dm4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        DM4 dm4 = this.A00;
        synchronized (dm4) {
            String action = intent.getAction();
            int iHashCode = action.hashCode();
            if (iHashCode != -1886648615) {
                if (iHashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    if (dm4.A03) {
                        dm4.A01 += jElapsedRealtime - dm4.A02;
                        dm4.A03("CONNECTED", jElapsedRealtime);
                    } else {
                        dm4.A00 += jElapsedRealtime - dm4.A02;
                    }
                    z = true;
                    dm4.A03 = z;
                }
                dm4.A02 = jElapsedRealtime;
            } else {
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    if (dm4.A03) {
                        dm4.A01 += jElapsedRealtime - dm4.A02;
                    } else {
                        dm4.A00 += jElapsedRealtime - dm4.A02;
                        dm4.A03(AnonymousClass000.A00(10), jElapsedRealtime);
                    }
                    z = false;
                    dm4.A03 = z;
                }
                dm4.A02 = jElapsedRealtime;
            }
        }
    }
}
