package X;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C6o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3265C6o {
    public static String A00;
    public static final Object A01 = C3cG.A0T();

    public static final String A00(Context context) {
        C7384Etj.A0Y(context, 0);
        synchronized (A01) {
            String str = A00;
            if (str != null) {
                return str;
            }
            String processName = Application.getProcessName();
            A00 = processName;
            if (processName == null) {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == iMyPid) {
                            A00 = next.processName;
                            break;
                        }
                    }
                }
            }
            String string = A00;
            if (string == null) {
                string = (String) BXy.A00().first;
                A00 = string;
                if (string != null) {
                    int length = string.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        boolean z2 = string.charAt(i2) <= ' ';
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    string = string.subSequence(i, length + 1).toString();
                    A00 = string;
                }
            }
            if (string == null) {
                string = "unknown";
                A00 = "unknown";
            }
            return string;
        }
    }
}
