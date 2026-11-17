package com.facebook.pushlite;

import X.BV4;
import X.BV6;
import X.C3944Cha;
import X.C3947Chg;
import X.C3961Ci5;
import X.C4001CjU;
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
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.common.jobscheduler.compat.IllegalRemoteArgumentException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: classes5.dex */
public final class PushLiteGCMJobService extends Cad {
    public static C4001CjU A00 = C4001CjU.A00;

    @Override // X.Cad, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws IllegalRemoteArgumentException {
        try {
        } catch (IllegalRemoteArgumentException e) {
            CFK.A08("GcmTaskServiceCompat", "Unexpected service start parameters", e);
            return 2;
        }
        if (intent == null) {
            throw new IllegalRemoteArgumentException("Received a null intent, did you ever return START_STICKY?");
        }
        String action = intent.getAction();
        if (action != null) {
            if (action.startsWith("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-")) {
                Bundle extras = intent.getExtras();
                if (extras.getString("job_tag", null) == null) {
                    throw new IllegalRemoteArgumentException(C8j3.A14(extras.get("job_tag"), C60O.A0x("Invalid job_tag: ")));
                }
                OneoffTask oneoffTask = (OneoffTask) extras.getParcelable(AuraDeeplinkRouteMapper.TASK_ROUTE);
                if (oneoffTask == null) {
                    throw new IllegalRemoteArgumentException("Missing task");
                }
                int i3 = extras.getInt("num_failures", -1);
                if (i3 <= 0) {
                    throw new IllegalRemoteArgumentException(FGI.A0H("invalid num_failures: ", i3));
                }
                int iA01 = A00.A01(this, 12451000);
                if (iA01 == 0) {
                    try {
                        C3947Chg.A01(this).A03(oneoffTask);
                        return 2;
                    } catch (IllegalArgumentException e2) {
                        CHV.A00(new ComponentName(this, oneoffTask.A04), this, e2);
                        return 2;
                    }
                }
                String str = oneoffTask.A05;
                boolean z = GooglePlayServicesUtil.A00;
                if (i3 >= 3) {
                    CFK.A0I("GcmTaskServiceCompat", "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", str, ConnectionResult.A00(iA01));
                    return 2;
                }
                CFK.A02(str, ConnectionResult.A00(iA01), "GcmTaskServiceCompat", "Job: %s Scheduling Google Play Services retry due to: %s");
                int i4 = i3 + 1;
                try {
                    Intent intent2 = new Intent(this, Class.forName(oneoffTask.A04)).setAction(FGI.A0M("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str)).setPackage(getPackageName());
                    Bundle bundleA0N = BV6.A0N();
                    bundleA0N.putString("job_tag", str);
                    bundleA0N.putParcelable(AuraDeeplinkRouteMapper.TASK_ROUTE, oneoffTask);
                    bundleA0N.putInt("num_failures", i4);
                    intent2.putExtras(bundleA0N);
                    long jElapsedRealtime = SystemClock.elapsedRealtime() + 300000;
                    AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                    C7m8 c7m8 = new C7m8();
                    c7m8.A04(intent2, null);
                    ((C7m7) c7m8).A01 |= 8;
                    PendingIntent service = PendingIntent.getService(this, 0, c7m8.A03(this), C7m7.A00(c7m8, 134217728));
                    if (alarmManager != null) {
                        alarmManager.set(2, jElapsedRealtime, service);
                        return 2;
                    }
                } catch (ClassNotFoundException e3) {
                    throw BV4.A0e(e3);
                }
                CFK.A08("GcmTaskServiceCompat", "Unexpected service start parameters", e);
                return 2;
            }
            if (action.startsWith("com.google")) {
                return super.onStartCommand(intent, i, i2);
            }
            C3961Ci5 c3961Ci5 = C3944Cha.A02;
        }
        return 2;
    }

    public PushLiteGCMJobService(int i) {
    }

    public PushLiteGCMJobService() {
    }
}
