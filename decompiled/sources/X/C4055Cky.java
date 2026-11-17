package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.analytics2.logger.legacy.uploader.HighPriUploadRetryReceiver;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Cky, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4055Cky {
    public static C4055Cky A02;
    public PowerManager A00;
    public AlarmManager A01;

    private synchronized AlarmManager A00(Context context) {
        AlarmManager alarmManager;
        alarmManager = this.A01;
        if (alarmManager == null) {
            alarmManager = (AlarmManager) context.getSystemService("alarm");
            this.A01 = alarmManager;
        }
        return alarmManager;
    }

    public static C4055Cky A01() {
        C4055Cky c4055Cky;
        synchronized (C4055Cky.class) {
            c4055Cky = A02;
            if (c4055Cky == null) {
                c4055Cky = new C4055Cky();
                A02 = c4055Cky;
            }
        }
        return c4055Cky;
    }

    public final void A02(Context context) {
        PendingIntent service = PendingIntent.getService(context, 1, new Intent().setComponent(((C4043Ckm) AbstractC4063Cl8.A00(context)).A00).setAction("com.facebook.analytics2.logger.UPLOAD_NOW"), Build.VERSION.SDK_INT >= 30 ? 603979776 : 536870912);
        if (service != null) {
            A00(context).cancel(service);
        }
    }

    public final void A03(Context context, Bundle bundle, C4045Cko c4045Cko, Cl7 cl7, String str, int i) {
        PowerManager powerManager;
        List<Handler> listSynchronizedList;
        if (cl7 != null && (cl7.A01 < 0 || cl7.A00 < 0)) {
            throw C3cG.A0Q("fallback delay ms must be >= 0");
        }
        ComponentName componentName = ((C4043Ckm) AbstractC4063Cl8.A00(context)).A00;
        synchronized (C4055Cky.class) {
            powerManager = this.A00;
            if (powerManager == null) {
                powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
                this.A00 = powerManager;
            }
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, FGI.A0d("JobSchedulerHack-", componentName.getShortClassName(), "-client-", String.valueOf(i)));
        wakeLockNewWakeLock.setReferenceCounted(false);
        HandlerC4060Cl3 handlerC4060Cl3 = new HandlerC4060Cl3(new C4067ClE(wakeLockNewWakeLock));
        Messenger messenger = new Messenger(handlerC4060Cl3);
        synchronized (C4054Ckx.class) {
            listSynchronizedList = C4054Ckx.A09;
            if (listSynchronizedList == null) {
                listSynchronizedList = Collections.synchronizedList(C60O.A11(1));
                C4054Ckx.A09 = listSynchronizedList;
            }
        }
        listSynchronizedList.add(handlerC4060Cl3);
        Intent intentPutExtras = new Intent().setComponent(componentName).setAction(str).putExtras(new C4054Ckx(context, bundle, messenger, c4045Cko, cl7, str, i).A01());
        wakeLockNewWakeLock.acquire(90000L);
        try {
            C7n3 c7n3A01 = C7mU.A00().A01();
            C7n7 c7n7A01 = C7n0.A01(context, intentPutExtras, c7n3A01);
            Intent intentAAi = c7n3A01.A00.AAi(context, intentPutExtras, c7n3A01.A01);
            if (intentAAi != null) {
                C7n0.A04(context, intentPutExtras, intentAAi, c7n3A01, c7n7A01);
                context.startService(intentAAi);
            }
        } catch (IllegalStateException unused) {
            A04(context, c4045Cko, str, i, 0L, true);
        }
    }

    public final void A04(Context context, C4045Cko c4045Cko, String str, int i, long j, boolean z) {
        String str2;
        try {
            PendingIntent service = PendingIntent.getService(context, 1, new Intent().setComponent(z ? new ComponentName(context, (Class<?>) HighPriUploadRetryReceiver.class) : ((C4043Ckm) AbstractC4063Cl8.A00(context)).A00).setAction("com.facebook.analytics2.logger.UPLOAD_NOW").putExtras(new C4054Ckx(context, null, null, c4045Cko, new Cl7(900000L, 1800000L, str), str, i).A01()), Build.VERSION.SDK_INT >= 30 ? 201326592 : 134217728);
            try {
                if (AbstractC7488Exs.A00(A00(context), context)) {
                    A00(context).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, service);
                } else {
                    A00(context).set(2, SystemClock.elapsedRealtime() + j, service);
                }
            } catch (IllegalStateException e) {
                e = e;
                str2 = "IllegalStateException thrown when scheduling alarm.";
                CFK.A0A("JobSchedulerHack", str2, e);
            } catch (NullPointerException e2) {
                e = e2;
                str2 = "Unexpected NPE when scheduling alarm. This is most likely an OS bug.";
                CFK.A0A("JobSchedulerHack", str2, e);
            }
        } catch (SecurityException e3) {
            CFK.A0H("JobSchedulerHack", "Exception while calling PendingIntent.getService: %s", BV7.A1b(e3));
        }
    }
}
