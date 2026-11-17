package com.facebook.aura.qpl;

import X.AbstractC4103Cmd;
import X.BV4;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.F0C;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class AuraPowerStateMonitor {
    public static final String TAG = "AuraPowerStateMonitor";
    public static volatile boolean deepIdle;
    public static volatile boolean failureLogged;
    public static volatile boolean inDozeSession;
    public static volatile long lastDozeEndElapsedMs;
    public static volatile boolean lightIdle;
    public static volatile boolean startFailed;
    public static volatile boolean started;
    public static final AuraPowerStateMonitor INSTANCE = new AuraPowerStateMonitor();
    public static final AtomicBoolean starting = C60O.A1E();

    public final void ensureStarted(Context context) {
        C7384Etj.A0Y(context, 0);
        if (starting.compareAndSet(false, true)) {
            try {
                Object systemService = context.getSystemService((Class<Object>) PowerManager.class);
                if (systemService == null) {
                    throw BV4.A0U();
                }
                PowerManager powerManager = (PowerManager) systemService;
                readIdleState(powerManager);
                registerReceiver(context, powerManager);
                started = true;
                startFailed = false;
            } catch (NoSuchMethodError | RuntimeException e) {
                onStartFailed(e);
            }
        }
    }

    public final void ensureStartedAsync(final Context context) {
        C7384Etj.A0Y(context, 0);
        if (starting.get()) {
            return;
        }
        F0C.A05().execute(new Runnable() { // from class: com.facebook.aura.qpl.AuraPowerStateMonitor.ensureStartedAsync.1
            @Override // java.lang.Runnable
            public final void run() {
                AuraPowerStateMonitor.INSTANCE.ensureStarted(context);
            }
        });
    }

    public final Boolean readBackgroundRestricted(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            if (systemService != null) {
                return Boolean.valueOf(((ActivityManager) systemService).isBackgroundRestricted());
            }
            throw BV4.A0U();
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "isBackgroundRestricted read failed", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScreenOn(long j) {
        if (inDozeSession) {
            inDozeSession = false;
            lastDozeEndElapsedMs = j;
        }
    }

    private final void onStartFailed(Throwable th) {
        if (!failureLogged) {
            failureLogged = true;
            CFK.A0A(TAG, "Doze monitor start failed", th);
        }
        startFailed = true;
        starting.set(false);
    }

    private final void registerReceiver(Context context, final PowerManager powerManager) {
        IntentFilter intentFilter = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            intentFilter.addAction("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED");
        }
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        AbstractC4103Cmd.A05(new BroadcastReceiver() { // from class: com.facebook.aura.qpl.AuraPowerStateMonitor.registerReceiver.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C7384Etj.A0Y(intent, 1);
                if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                    AuraPowerStateMonitor.INSTANCE.onScreenOn(SystemClock.elapsedRealtime());
                    return;
                }
                Executor executorA05 = F0C.A05();
                final PowerManager powerManager2 = powerManager;
                executorA05.execute(new Runnable() { // from class: com.facebook.aura.qpl.AuraPowerStateMonitor$registerReceiver$1$onReceive$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuraPowerStateMonitor.INSTANCE.update(powerManager2);
                    }
                });
            }
        }, context, intentFilter, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update(PowerManager powerManager) {
        try {
            readIdleState(powerManager);
        } catch (NoSuchMethodError | RuntimeException e) {
            CFK.A0A(TAG, "Idle mode read failed", e);
        }
    }

    public final Long getDozeExitMsAgo() {
        long j = lastDozeEndElapsedMs;
        if (j <= 0 || inDozeSession) {
            return null;
        }
        return Long.valueOf(C3cG.A04(j));
    }

    public final String getDozeMode() {
        if (started) {
            return deepIdle ? "deep" : lightIdle ? AvatarMediaMapperKt.LIGHT : inDozeSession ? "maintenance" : "none";
        }
        return null;
    }

    public final boolean getStartFailed() {
        return startFailed;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readIdleState(android.os.PowerManager r3) {
        /*
            r2 = this;
            boolean r0 = r3.isDeviceIdleMode()
            com.facebook.aura.qpl.AuraPowerStateMonitor.deepIdle = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r2 = 1
            if (r1 < r0) goto L14
            boolean r1 = r3.isDeviceLightIdleMode()
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            com.facebook.aura.qpl.AuraPowerStateMonitor.lightIdle = r0
            boolean r0 = com.facebook.aura.qpl.AuraPowerStateMonitor.deepIdle
            if (r0 != 0) goto L1f
            boolean r0 = com.facebook.aura.qpl.AuraPowerStateMonitor.lightIdle
            if (r0 == 0) goto L21
        L1f:
            com.facebook.aura.qpl.AuraPowerStateMonitor.inDozeSession = r2
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.qpl.AuraPowerStateMonitor.readIdleState(android.os.PowerManager):void");
    }
}
