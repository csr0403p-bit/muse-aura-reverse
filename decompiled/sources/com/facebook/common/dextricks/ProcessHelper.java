package com.facebook.common.dextricks;

import X.BV4;
import X.BV5;
import X.C5M;
import X.FGI;
import android.app.Application;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class ProcessHelper {
    public static final String TAG = "ProcessHelper";
    public static String cachedProcessName;

    public static synchronized String getProcessNameByPid(int i) {
        String strTrim;
        strTrim = cachedProcessName;
        if (strTrim == null) {
            C5M.A01(TAG, "Enter slow path of getProcessNameByPid", BV4.A1W());
            strTrim = "";
            try {
                File fileA0G = BV4.A0G(FGI.A0I("/proc/", i, "/cmdline"));
                if (fileA0G.exists() && fileA0G.canRead()) {
                    BufferedReader bufferedReaderA0I = BV5.A0I(fileA0G);
                    String line = bufferedReaderA0I.readLine();
                    strTrim = line != null ? line.trim() : "";
                    bufferedReaderA0I.close();
                }
            } catch (IOException e) {
                C5M.A01(TAG, FGI.A0H("Unable to get process name for pid from /proc", i), e);
            }
            cachedProcessName = strTrim;
        }
        return strTrim;
    }

    public static boolean isAppZygoteProcess(int i) {
        String processName = Application.getProcessName();
        if (processName == null) {
            processName = getProcessNameByPid(Process.myPid());
        }
        return processName.contains("_zygote");
    }

    public static boolean isIsolated() {
        return Process.isIsolated();
    }

    public static boolean isIsolatedOrAppZygoteProcess() {
        return Process.isIsolated() || isAppZygoteProcess(Process.myPid());
    }
}
