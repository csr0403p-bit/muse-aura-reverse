package com.facebook.msys.mci;

import X.C7320Ekq;
import X.CFK;

/* loaded from: classes5.dex */
public class Log {
    public static native void registerLoggerNative(int i, int i2, boolean z, int i3);

    public static native void setLogLevel(int i);

    public static void log(int i, String str) {
        if (CFK.A02.AOg(i)) {
            CFK.A02.log(i, "msys", str);
        }
    }

    static {
        C7320Ekq.A00();
    }
}
