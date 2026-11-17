package com.facebook.aura.localbrowser.core;

import X.C7384Etj;
import android.os.Build;
import android.os.Process;

/* loaded from: classes5.dex */
public final class BrowserEngineAvailability {
    public static final int $stable = 0;
    public static final BrowserEngineAvailability INSTANCE = new BrowserEngineAvailability();

    public final boolean isSupported() {
        if (Process.is64Bit()) {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            C7384Etj.A0V(strArr);
            if ("arm64-v8a".equals(strArr.length == 0 ? null : strArr[0])) {
                return true;
            }
        }
        return false;
    }
}
