package androidx.work.impl.foreground;

import X.AbstractServiceC5061DSu;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BV7;
import X.BV9;
import X.C3cG;
import X.C60O;
import X.C6616EKj;
import X.C6617EKk;
import X.C6630ELa;
import X.EK9;
import X.EKZ;
import X.EKy;
import X.ENP;
import X.InterfaceC6632ELc;
import X.RunnableC6613EKf;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class SystemForegroundService extends AbstractServiceC5061DSu implements InterfaceC6632ELc {
    public static SystemForegroundService A03;
    public static final String A04 = EK9.A01("SystemFgService");
    public NotificationManager A00;
    public EKZ A01;
    public boolean A02;

    @Override // X.InterfaceC6632ELc
    public final void Ag3(final int notificationId, final Notification notificationType, final int notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            EKy.A00(notificationType, this, notificationId, notification);
        } else {
            startForeground(notificationId, notificationType, notification);
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int startId) {
        if (Build.VERSION.SDK_INT < 35) {
            this.A01.A01(startId, 2048);
        }
    }

    private void A00() {
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        EKZ ekz = new EKZ(getApplicationContext());
        this.A01 = ekz;
        if (ekz.A01 == null) {
            ekz.A01 = this;
        } else {
            EK9.A00();
            Log.e(EKZ.A0A, "A callback already exists.");
        }
    }

    @Override // X.AbstractServiceC5061DSu, android.app.Service
    public final void onCreate() {
        super.onCreate();
        A03 = this;
        A00();
    }

    @Override // X.AbstractServiceC5061DSu, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.A01.A00();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.A02) {
            EK9.A00();
            Log.i(A04, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.A01.A00();
            A00();
            this.A02 = false;
        }
        if (intent == null) {
            return 3;
        }
        EKZ ekz = this.A01;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            EK9.A00();
            Log.i(EKZ.A0A, AnonymousClass007.A0a("Started foreground service ", intent));
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ENP enp = ekz.A05;
            ((C6616EKj) enp).A01.execute(new RunnableC6613EKf(ekz, stringExtra));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if (!"ACTION_CANCEL_WORK".equals(action)) {
                if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                }
                EK9.A00();
                Log.i(EKZ.A0A, "Stopping foreground service");
                BV9.A04(ekz, startId);
                return 3;
            }
            EK9.A00();
            Log.i(EKZ.A0A, AnonymousClass007.A0a("Stopping foreground work for ", intent));
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            ekz.A00.A05(UUID.fromString(stringExtra2));
            return 3;
        }
        if (ekz.A01 == null) {
            throw C3cG.A0Q("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra3 = intent.getStringExtra("KEY_WORKSPEC_ID");
        C6630ELa c6630ELa = new C6630ELa(stringExtra3, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        EK9 ek9A00 = EK9.A00();
        String str = EKZ.A0A;
        StringBuilder sbA0y = C60O.A0y("Notifying with (id:", intExtra);
        sbA0y.append(", workSpecId: ");
        sbA0y.append(stringExtra3);
        sbA0y.append(", notificationType :");
        sbA0y.append(intExtra2);
        ek9A00.A02(str, BV7.A10(sbA0y));
        if (notification == null) {
            throw C60O.A0i("Notification passed in the intent was null.");
        }
        C6617EKk c6617EKk = new C6617EKk(intExtra, notification, intExtra2);
        Map<C6630ELa, C6617EKk> map = ekz.A07;
        map.put(c6630ELa, c6617EKk);
        C6617EKk c6617EKk2 = map.get(ekz.A02);
        if (c6617EKk2 == null) {
            ekz.A02 = c6630ELa;
        } else {
            ((SystemForegroundService) ekz.A01).A00.notify(intExtra, notification);
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                i |= ((C6617EKk) BV7.A0s(itA0n)).A00;
            }
            c6617EKk = new C6617EKk(c6617EKk2.A01, c6617EKk2.A02, i);
        }
        ekz.A01.Ag3(c6617EKk.A01, c6617EKk.A02, c6617EKk.A00);
        return 3;
    }

    public final void onTimeout(int startId, int fgsType) {
        this.A01.A01(startId, fgsType);
    }
}
