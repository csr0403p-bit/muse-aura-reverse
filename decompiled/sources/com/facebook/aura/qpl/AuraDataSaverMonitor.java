package com.facebook.aura.qpl;

import X.AbstractC4103Cmd;
import X.BV4;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.F0C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class AuraDataSaverMonitor {
    public static final String TAG = "AuraDataSaverMonitor";
    public static volatile boolean failureLogged;
    public static volatile String restrictBackgroundStatus;
    public static volatile boolean startFailed;
    public static final AuraDataSaverMonitor INSTANCE = new AuraDataSaverMonitor();
    public static final AtomicBoolean starting = C60O.A1E();

    public final void ensureStarted(Context context) {
        C7384Etj.A0Y(context, 0);
        AtomicBoolean atomicBoolean = starting;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Object systemService = context.getSystemService((Class<Object>) ConnectivityManager.class);
                if (systemService == null) {
                    throw BV4.A0U();
                }
                final ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                refresh(connectivityManager);
                AbstractC4103Cmd.A05(new BroadcastReceiver() { // from class: com.facebook.aura.qpl.AuraDataSaverMonitor.ensureStarted.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        Executor executorA05 = F0C.A05();
                        final ConnectivityManager connectivityManager2 = connectivityManager;
                        executorA05.execute(new Runnable() { // from class: com.facebook.aura.qpl.AuraDataSaverMonitor$ensureStarted$1$onReceive$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AuraDataSaverMonitor.INSTANCE.refresh(connectivityManager2);
                            }
                        });
                    }
                }, context, new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"), null, 4);
                startFailed = false;
            } catch (RuntimeException e) {
                if (!failureLogged) {
                    failureLogged = true;
                    CFK.A0A(TAG, "Data Saver monitor start failed", e);
                }
                startFailed = true;
                atomicBoolean.set(false);
            }
        }
    }

    public final void ensureStartedAsync(final Context context) {
        C7384Etj.A0Y(context, 0);
        if (starting.get()) {
            return;
        }
        F0C.A05().execute(new Runnable() { // from class: com.facebook.aura.qpl.AuraDataSaverMonitor.ensureStartedAsync.1
            @Override // java.lang.Runnable
            public final void run() {
                AuraDataSaverMonitor.INSTANCE.ensureStarted(context);
            }
        });
    }

    public final String getRestrictBackgroundStatus() {
        return restrictBackgroundStatus;
    }

    public final boolean getStartFailed() {
        return startFailed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh(ConnectivityManager connectivityManager) {
        String str;
        try {
            int restrictBackgroundStatus2 = connectivityManager.getRestrictBackgroundStatus();
            str = restrictBackgroundStatus2 != 1 ? restrictBackgroundStatus2 != 2 ? restrictBackgroundStatus2 != 3 ? "unknown" : "enabled" : "whitelisted" : "disabled";
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "restrictBackgroundStatus read failed", e);
            str = restrictBackgroundStatus;
        }
        restrictBackgroundStatus = str;
    }
}
