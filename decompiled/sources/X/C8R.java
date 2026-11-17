package X;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes5.dex */
public abstract class C8R {
    public static final long A00;

    static {
        long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (jSysconf <= 0) {
            jSysconf = 100;
        }
        A00 = jSysconf;
    }
}
