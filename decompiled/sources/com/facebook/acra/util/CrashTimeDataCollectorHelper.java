package com.facebook.acra.util;

import X.BV4;
import X.BV5;
import X.BV6;
import X.BzX;
import X.C60O;
import X.CFK;
import X.FGI;
import android.os.Build;
import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class CrashTimeDataCollectorHelper {
    public static final String LOG_TAG = "ACRA";
    public static final String TIME_STAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ";

    public static String formatTimestamp(long j) {
        return new SimpleDateFormat(TIME_STAMP_FORMAT, Locale.US).format(new Date(j));
    }

    public static String getJailStatus() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return "yes";
        }
        try {
            if (BV5.A1V("/system/app/Superuser.apk")) {
                return "yes";
            }
        } catch (Exception e) {
            CFK.A0J(LOG_TAG, e, "Failed to find Superuser.pak");
        }
        Map<String, String> map = System.getenv();
        if (map == null) {
            return "no";
        }
        for (String str2 : ((String) BV6.A0l("PATH", map)).split(":")) {
            try {
            } catch (Exception e2) {
                CFK.A0J(LOG_TAG, e2, "Failed to find su binary in the PATH");
            }
            if (BV5.A1V(FGI.A0M(str2, "/su"))) {
                return "yes";
            }
        }
        return "no";
    }

    public static String formatAppInstallTime(long j) {
        return formatTimestamp(j);
    }

    public static String formatAppUpgradeTime(long j) {
        return formatTimestamp(j);
    }

    public static UUID generateReportUuid() {
        try {
            return UUID.randomUUID();
        } catch (Throwable th) {
            BzX.A00(LOG_TAG, "Failed to generate random UUID", th);
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(System.currentTimeMillis());
            sbA0w.append("-");
            sbA0w.append(System.nanoTime());
            sbA0w.append("-");
            return UUID.nameUUIDFromBytes(BV4.A0l(sbA0w, Process.myTid()).getBytes());
        }
    }
}
