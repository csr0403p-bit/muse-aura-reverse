package androidx.work.impl.background.systemalarm;

import X.AnonymousClass007;
import X.EK5;
import X.EK9;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes5.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = EK9.A01("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EK9 ek9A00 = EK9.A00();
        String str = A00;
        ek9A00.A02(str, AnonymousClass007.A0a("Received intent ", intent));
        try {
            EK5 ek5A00 = EK5.A00(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (EK5.A0D) {
                BroadcastReceiver.PendingResult pendingResult = ek5A00.A00;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                ek5A00.A00 = pendingResultGoAsync;
                if (ek5A00.A08) {
                    pendingResultGoAsync.finish();
                    ek5A00.A00 = null;
                }
            }
        } catch (IllegalStateException e) {
            EK9.A00();
            Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
