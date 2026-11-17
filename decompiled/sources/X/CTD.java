package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class CTD {
    public boolean A00 = false;
    public final Intent A01;
    public final BroadcastReceiver.PendingResult A02;
    public final ScheduledFuture<?> A03;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A02.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }

    public CTD(BroadcastReceiver.PendingResult pendingResult, final Intent intent, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = intent;
        this.A02 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(new Runnable(intent, this) { // from class: X.CTE
            public static final String __redex_internal_original_name = "zzd";
            public final Intent A00;
            public final CTD A01;

            @Override // java.lang.Runnable
            public final void run() {
                CTD ctd = this.A01;
                String action = this.A00.getAction();
                StringBuilder sbA0p = BV4.A0p(BV5.A04(action) + 61);
                sbA0p.append("Service took too long to process intent: ");
                sbA0p.append(action);
                Log.w("EnhancedIntentService", AnonymousClass001.A0v(" App may get closed.", sbA0p));
                ctd.A00();
            }

            {
                this.A01 = this;
                this.A00 = intent;
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }
}
