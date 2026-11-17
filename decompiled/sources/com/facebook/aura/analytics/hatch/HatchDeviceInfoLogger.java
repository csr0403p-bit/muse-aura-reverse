package com.facebook.aura.analytics.hatch;

import X.AbstractC7387EuA;
import X.BV4;
import X.BV5;
import X.BzX;
import X.C3cI;
import X.C4JM;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.DFW;
import X.DFX;
import X.F0C;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl;
import com.facebook.aura.lifecycle.AppBackgroundedListener;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class HatchDeviceInfoLogger implements AppBackgroundedListener {
    public static final int $stable = 0;
    public static final HatchDeviceInfoLogger INSTANCE = new HatchDeviceInfoLogger();
    public static final AtomicBoolean inFlight = C60O.A1E();
    public static volatile long nextBackgroundCheckElapsedMs;

    private final void requestLog() {
        if (C3cI.A1W(inFlight)) {
            F0C.A05().execute(new Runnable() { // from class: com.facebook.aura.analytics.hatch.HatchDeviceInfoLogger.requestLog.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        HatchDeviceInfoLogger.INSTANCE.maybeLog();
                    } finally {
                        HatchDeviceInfoLogger.inFlight.set(false);
                    }
                }
            });
        }
    }

    public final void onBackgroundAnalyticsEvent() {
        if (AuraAppLifecycleManager.INSTANCE.isAppInForeground() || SystemClock.elapsedRealtime() < nextBackgroundCheckElapsedMs) {
            return;
        }
        requestLog();
    }

    private final void logDeviceInfo() throws Throwable {
        Object[] objArr;
        String str;
        int iA00;
        DFW dfwA01 = DFX.A01(BV4.A0C(), C79.A00, null, "device_info", false);
        C7384Etj.A0U(dfwA01);
        if (dfwA01.A0A()) {
            dfwA01.A09("os_type", "Android");
            dfwA01.A09("os_ver", Build.VERSION.RELEASE);
            dfwA01.A09(NavigationLoggerImpl.DEVICE_TYPE_KEY, Build.MODEL);
            dfwA01.A09("brand", Build.BRAND);
            dfwA01.A09("manufacturer", Build.MANUFACTURER);
            try {
                iA00 = AbstractC7387EuA.A00("/sys/devices/system/cpu/possible");
                if (iA00 == -1) {
                    iA00 = AbstractC7387EuA.A00("/sys/devices/system/cpu/present");
                }
                if (iA00 == -1) {
                    File[] fileArrListFiles = BV4.A0G("/sys/devices/system/cpu/").listFiles(AbstractC7387EuA.A00);
                    if (fileArrListFiles == null) {
                        throw BV4.A0U();
                    }
                    iA00 = fileArrListFiles.length;
                }
            } catch (NullPointerException e) {
                objArr = new Object[]{e};
                str = "Null pointer exception while reading CPU core information";
                BzX.A00("CpuInfoHelper", str, objArr);
                iA00 = -1;
                dfwA01.A08("reliable_core_count", Integer.valueOf(iA00));
                dfwA01.A08("unreliable_core_count", Integer.valueOf(BV5.A00()));
                dfwA01.A05();
            } catch (SecurityException e2) {
                objArr = new Object[]{e2};
                str = "Security exception while reading CPU core information";
                BzX.A00("CpuInfoHelper", str, objArr);
                iA00 = -1;
                dfwA01.A08("reliable_core_count", Integer.valueOf(iA00));
                dfwA01.A08("unreliable_core_count", Integer.valueOf(BV5.A00()));
                dfwA01.A05();
            }
            dfwA01.A08("reliable_core_count", Integer.valueOf(iA00));
            dfwA01.A08("unreliable_core_count", Integer.valueOf(BV5.A00()));
            dfwA01.A05();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeLog() throws Throwable {
        SharedPreferences sharedPreferencesA07 = BV4.A07(C4JM.A00(), HatchDeviceInfoLoggerKt.PREFS_NAME);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - sharedPreferencesA07.getLong(HatchDeviceInfoLoggerKt.KEY_LAST_LOGGED_MS, 0L);
        if (0 <= j) {
            long j2 = HatchDeviceInfoLoggerKt.REPORT_INTERVAL_MS;
            if (j < j2) {
                nextBackgroundCheckElapsedMs = (SystemClock.elapsedRealtime() + j2) - j;
                return;
            }
        }
        nextBackgroundCheckElapsedMs = SystemClock.elapsedRealtime() + HatchDeviceInfoLoggerKt.REPORT_INTERVAL_MS;
        logDeviceInfo();
        sharedPreferencesA07.edit().putLong(HatchDeviceInfoLoggerKt.KEY_LAST_LOGGED_MS, jCurrentTimeMillis).apply();
    }

    @Override // com.facebook.aura.lifecycle.AppBackgroundedListener
    public void onAppBackgrounded() {
        requestLog();
    }
}
