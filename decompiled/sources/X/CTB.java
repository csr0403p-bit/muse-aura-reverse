package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class CTB extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04;

    public abstract void A04(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Binder cth;
        if (BV4.A1U("EnhancedIntentService")) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        cth = this.A02;
        if (cth == null) {
            cth = new CTH(this);
            this.A02 = cth;
        }
        return cth;
    }

    public static final void A00(Intent intent, CTB ctb) {
        int intExtra;
        if (intent != null && (intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0)) != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.A01;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", FGI.A0H("No active wake lock id #", intExtra));
                }
            }
        }
        synchronized (ctb.A04) {
            int i = ctb.A01 - 1;
            ctb.A01 = i;
            if (i == 0) {
                ctb.stopSelfResult(ctb.A00);
            }
        }
    }

    public final boolean A03(Intent intent) throws PendingIntent.CanceledException, NumberFormatException {
        if (!BV5.A1Q(intent, "com.google.firebase.messaging.NOTIFICATION_OPEN")) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!FirebaseMessagingService.A02(intent)) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            C3554CTr c3554CTrA00 = C3554CTr.A00();
            C3554CTr.A01(c3554CTrA00);
            c3554CTrA00.A02.A02(InterfaceC3552CTo.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        FirebaseMessagingService.A01(intent, "_no");
        return true;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.A04) {
            this.A00 = i2;
            this.A01++;
        }
        Intent intentPoll = C3540CSx.A00().A03.poll();
        if (intentPoll == null || A03(intentPoll)) {
            A00(intent, this);
            return 2;
        }
        this.A03.execute(new CTG(intentPoll, intent, this));
        return 3;
    }

    public CTB() {
        String strValueOf = String.valueOf(C3cI.A0Y(this));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C04(BV5.A0l(strValueOf.length(), "Firebase-", strValueOf)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A04 = C3cG.A0T();
        this.A01 = 0;
    }
}
