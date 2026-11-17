package com.facebook.analytics2.logger;

import X.BV5;
import X.BV6;
import X.BV7;
import X.C3947Chg;
import X.C3958Chx;
import X.C4001CjU;
import X.C4053Ckw;
import X.C60O;
import X.C7m7;
import X.C7m8;
import X.C8j3;
import X.CFK;
import X.CHV;
import X.Cad;
import X.FGI;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.common.gcmcompat.OneoffTask;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class GooglePlayUploadService extends Cad {
    public static boolean A01;
    public static boolean A02;
    public static final AtomicInteger A03 = BV5.A17();
    public C4053Ckw A00;

    @Override // X.Cad, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws IllegalRemoteArgumentException {
        try {
            if (intent == null) {
                throw new IllegalRemoteArgumentException("Received a null intent, did you ever return START_STICKY?");
            }
            String action = intent.getAction();
            if (action != null) {
                if (action.startsWith("com.facebook.analytics2.logger.gms.TRY_SCHEDULE")) {
                    Bundle extras = intent.getExtras();
                    int i3 = extras.getInt("job_id", -1);
                    if (i3 == -1) {
                        throw new IllegalRemoteArgumentException(C8j3.A14(extras.get("job_id"), C60O.A0x("Invalid job_id: ")));
                    }
                    OneoffTask oneoffTask = (OneoffTask) extras.getParcelable(AuraDeeplinkRouteMapper.TASK_ROUTE);
                    if (oneoffTask == null) {
                        throw new IllegalRemoteArgumentException("Missing task");
                    }
                    A03(this, oneoffTask, i3);
                    return 2;
                }
                if (action.startsWith("com.facebook")) {
                    return this.A00.A03(intent, new C3958Chx(this, i2));
                }
            }
            return super.onStartCommand(intent, i, i2);
        } catch (IllegalRemoteArgumentException e) {
            CFK.A0H("GooglePlayUploadService", "Unexpected service start parameters: %s", BV7.A1b(e));
            stopSelf(i2);
            return 2;
        }
    }

    public static synchronized void A01(Context context) {
        PackageManager packageManager;
        if (!A02 && (packageManager = context.getPackageManager()) != null) {
            packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) GooglePlayUploadService.class), 1, 1);
            A02 = true;
        }
    }

    public static void A03(Context context, OneoffTask oneoffTask, int i) {
        int iA01 = C4001CjU.A00.A01(context, 12451000);
        if (iA01 == 0) {
            try {
                C3947Chg.A01(context).A03(oneoffTask);
            } catch (IllegalArgumentException e) {
                CHV.A00(new ComponentName(context, oneoffTask.A04), context, e);
            }
            A03.set(0);
            return;
        }
        if (A03.incrementAndGet() == 3) {
            boolean z = GooglePlayServicesUtil.A00;
            CFK.A0I("GooglePlayUploadService", "Google Play Services became consistently unavailable after initial check: %s", ConnectionResult.A00(iA01));
            return;
        }
        boolean z2 = GooglePlayServicesUtil.A00;
        CFK.A03(ConnectionResult.A00(iA01), "GooglePlayUploadService", "Scheduling Google Play Services retry due to: %s");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        C7m8 c7m8 = new C7m8();
        Intent action = new Intent(context, (Class<?>) GooglePlayUploadService.class).setAction(FGI.A0H("com.facebook.analytics2.logger.gms.TRY_SCHEDULE-", i));
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putInt("job_id", i);
        bundleA0N.putParcelable(AuraDeeplinkRouteMapper.TASK_ROUTE, oneoffTask);
        action.putExtras(bundleA0N);
        c7m8.A06(action, context.getClassLoader());
        PendingIntent service = PendingIntent.getService(context, 0, c7m8.A03(context), C7m7.A00(c7m8, 134217728));
        if (alarmManager != null) {
            alarmManager.set(2, SystemClock.elapsedRealtime() + 300000, service);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.A00 = C4053Ckw.A00(this);
    }
}
