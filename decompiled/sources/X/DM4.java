package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;

/* loaded from: classes5.dex */
public final class DM4 extends AbstractC3584CVf<DM6> {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final Context A04;

    public final void A03(String str, long j) {
        StringBuilder sbA0x = C3cI.A0x("Consecutive ", str);
        sbA0x.append("broadcasts: (");
        sbA0x.append(this.A02);
        C8j3.A1K(sbA0x);
        sbA0x.append(j);
        Log.e("DeviceBatteryMetricsCollector", BV7.A10(sbA0x), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Intent] */
    public DM4(Context context) {
        Intent intent;
        this.A04 = context;
        ?? RegisterReceiver = 0;
        try {
            RegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intent = RegisterReceiver;
        } catch (Exception unused) {
            Log.e("DeviceBatteryMetricsCollector", "Exception registering receiver for ACTION_BATTERY_CHANGED", RegisterReceiver);
            intent = RegisterReceiver;
        }
        boolean z = false;
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(AuraDeeplinkRouteMapper.STATUS_ROUTE, -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                }
            } catch (IllegalArgumentException e) {
                Log.e("DeviceBatteryMetricsCollector", "Corrupt battery intent extras reading status", e);
            }
        }
        this.A03 = z;
        this.A02 = SystemClock.elapsedRealtime();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new DM5(this), intentFilter);
    }
}
