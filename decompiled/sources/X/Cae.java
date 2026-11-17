package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.facebook.analytics2.logger.GooglePlayUploadService;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.pushlite.PushLiteGCMJobService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class Cae implements Runnable {
    public static final String __redex_internal_original_name = "GcmTaskService$Job";
    public final Bundle A00;
    public final InterfaceC3633Cah A01;
    public final String A02;
    public final /* synthetic */ Cad A03;

    public Cae(Bundle bundle, Cad cad, InterfaceC3633Cah interfaceC3633Cah, String str) {
        this.A03 = cad;
        this.A02 = str;
        this.A01 = interfaceC3633Cah;
        this.A00 = bundle;
    }

    private void A00(int i) {
        Cad cad = this.A03;
        synchronized (cad.A03) {
            try {
                try {
                    this.A01.APP(i);
                } catch (RemoteException e) {
                    CFK.A0F("GcmTaskService", "Error reporting result of operation to scheduler for %s", this.A02, e);
                }
            } finally {
                Cad.A02(cad, this.A02);
            }
        }
    }

    public final void A01() {
        ExecutorService executorServiceNewFixedThreadPool;
        try {
            Cad cad = this.A03;
            synchronized (cad) {
                executorServiceNewFixedThreadPool = cad.A01;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC3017Bs4());
                    cad.A01 = executorServiceNewFixedThreadPool;
                }
            }
            executorServiceNewFixedThreadPool.execute(this);
        } catch (RejectedExecutionException e) {
            CFK.A08("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            A00(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IllegalRemoteArgumentException, TimeoutException {
        int i;
        AlarmManager alarmManager;
        Cad cad = this.A03;
        C3631Caf c3631Caf = new C3631Caf(this.A02, this.A00);
        if (cad instanceof PushLiteGCMJobService) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            String str = c3631Caf.A01;
            CHZ chzA00 = CHZ.A00(cad, 1);
            int i2 = str.matches("[0-9]+") ? Integer.parseInt(str) : 0;
            Class<?> cls = cad.getClass();
            if (chzA00.A01(cls, i2)) {
                C3955Cht c3955Cht = new C3955Cht();
                C3944Cha c3944Cha = C3944Cha.A03;
                c3944Cha.A00(c3955Cht);
                long jUptimeMillis2 = 120000 - (SystemClock.uptimeMillis() - jUptimeMillis);
                try {
                    while (true) {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            jUptimeMillis2 = (SystemClock.uptimeMillis() + jUptimeMillis2) - SystemClock.uptimeMillis();
                        }
                    }
                } catch (TimeoutException unused2) {
                    C3946Chd c3946Chd = c3944Cha.A00;
                    AtomicReference<RunnableC3943ChZ> atomicReference = c3946Chd.A02;
                    RunnableC3943ChZ runnableC3943ChZ = atomicReference.get();
                    if (runnableC3943ChZ != null) {
                        runnableC3943ChZ.A02 = true;
                        c3946Chd.A00.removeCallbacks(runnableC3943ChZ);
                        Bs8.A00(runnableC3943ChZ, null, atomicReference);
                    }
                }
                if (!c3955Cht.A00.await(jUptimeMillis2, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException();
                }
                if (c3955Cht.A01) {
                    i = 1;
                }
            } else {
                CFK.A0F("GcmTaskServiceCompat", "Invalid GCM task id, cancelling: %s", str);
                try {
                    C3947Chg c3947ChgA01 = C3947Chg.A01(cad);
                    Context context = c3947ChgA01.A00;
                    ComponentName componentName = new ComponentName(context, cls);
                    OneoffTask.A01(str);
                    C3947Chg.A02(c3947ChgA01, componentName.getClassName());
                    Intent intentA00 = C3947Chg.A00(componentName, c3947ChgA01, "CANCEL_TASK");
                    if (intentA00 != null) {
                        intentA00.putExtra("tag", str);
                        intentA00.putExtra("component", componentName);
                        context.sendBroadcast(intentA00);
                    }
                } catch (IllegalArgumentException e) {
                    CHV.A00(new ComponentName(cad, cls), cad, e);
                }
                Intent intent = new Intent(cad, cls).setAction(FGI.A0M("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str)).setPackage(cad.getPackageName());
                C7m8 c7m8 = new C7m8();
                c7m8.A04(intent, null);
                ((C7m7) c7m8).A01 |= 8;
                PendingIntent service = PendingIntent.getService(cad, 0, c7m8.A03(cad), C7m7.A00(c7m8, 536870912));
                if (service != null && (alarmManager = (AlarmManager) cad.getSystemService("alarm")) != null) {
                    alarmManager.cancel(service);
                }
            }
            i = 0;
        } else {
            GooglePlayUploadService googlePlayUploadService = (GooglePlayUploadService) cad;
            try {
                Bundle bundle = c3631Caf.A00;
                if (bundle == null) {
                    CFK.A04("GooglePlayUploadService", "Job with no build ID, cancelling job");
                } else {
                    int i3 = bundle.getInt("__VERSION_CODE", 0);
                    int iA01 = BuildConstants.A01();
                    i = 1;
                    if (iA01 != i3) {
                        CFK.A0F("GooglePlayUploadService", "Job with old build ID: %d, cancelling job, expected: %d", Integer.valueOf(i3), Integer.valueOf(iA01));
                    } else {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        try {
                            int iA0F = BV6.A0F(c3631Caf.A01.split("-", 3), 2);
                            C4045Cko c4045Cko = new C4045Cko(bundle);
                            String string = bundle.getString("action");
                            C3954Chs c3954Chs = new C3954Chs();
                            googlePlayUploadService.A00.A05(c4045Cko, c3954Chs, string, iA0F);
                            try {
                                long jUptimeMillis4 = 120000 - (SystemClock.uptimeMillis() - jUptimeMillis3);
                                while (true) {
                                    try {
                                        break;
                                    } catch (InterruptedException unused3) {
                                        jUptimeMillis4 = (SystemClock.uptimeMillis() + jUptimeMillis4) - SystemClock.uptimeMillis();
                                    }
                                }
                                if (!c3954Chs.A00.await(jUptimeMillis4, TimeUnit.MILLISECONDS)) {
                                    throw new TimeoutException();
                                }
                                i = c3954Chs.A01;
                            } catch (TimeoutException unused4) {
                                googlePlayUploadService.A00.A04(iA0F);
                            }
                        } catch (RuntimeException e2) {
                            throw new IllegalRemoteArgumentException(e2.getMessage());
                        }
                    }
                }
            } catch (IllegalRemoteArgumentException | NumberFormatException e3) {
                CFK.A0A("GooglePlayUploadService", "Misunderstood job extras: %s", e3);
            }
            i = 2;
        }
        A00(i);
    }
}
