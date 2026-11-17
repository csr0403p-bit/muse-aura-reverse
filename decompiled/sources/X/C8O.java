package X;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes5.dex */
public final class C8O {
    public static volatile C8O A01;
    public final C8N A00 = new C8N();

    static {
        Os.sysconf(OsConstants._SC_CLK_TCK);
    }
}
