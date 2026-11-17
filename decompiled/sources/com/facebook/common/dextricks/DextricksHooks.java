package com.facebook.common.dextricks;

import X.AbstractC3145Bzb;
import X.BV4;
import X.BV7;
import X.C3146Bzc;
import X.C5M;
import X.C5P;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.common.dextricks.jit.ScopedJitSuspend;

/* loaded from: classes5.dex */
public class DextricksHooks {
    public static void onColdStartDone() {
        synchronized (C5P.class) {
            ScopedJitSuspend scopedJitSuspend = C5P.A00;
            if (scopedJitSuspend != null) {
                try {
                    try {
                        scopedJitSuspend.close();
                        C5M.A01("GlobalJitSuspend", "Resuming JIT", new Object[0]);
                    } catch (Exception e) {
                        Log.e("GlobalJitSuspend", C5M.A00("Failed to resume JIT", new Object[0]), e);
                    }
                    C5P.A00 = null;
                } finally {
                }
            }
        }
    }

    public static void onDexLoadStart(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && RuntimeInternals.installArtHacks(256, i) != 256) {
            C5M.A01("DextricksHooks", "Could not install ART_HACK_DEX_PC_LINENUM", BV4.A1W());
        }
        C3146Bzc c3146Bzc = new C3146Bzc();
        c3146Bzc.A00 = context;
        try {
            if (BV7.A1Q(AbstractC3145Bzb.A00(c3146Bzc, Experiments.STARTUP_JIT_SUSPEND))) {
                synchronized (C5P.class) {
                    if (C5P.A00 == null) {
                        C5P.A00 = new ScopedJitSuspend();
                        C5M.A01("GlobalJitSuspend", "Suspending JIT", new Object[0]);
                    }
                }
            }
        } finally {
            AbstractC3145Bzb.A02(c3146Bzc);
        }
    }
}
