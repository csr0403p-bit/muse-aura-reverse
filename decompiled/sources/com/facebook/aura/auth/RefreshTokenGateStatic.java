package com.facebook.aura.auth;

import X.AnonymousClass005;
import com.facebook.aura.startup.login.HatchRefreshTokenGate;

/* loaded from: classes5.dex */
public class RefreshTokenGateStatic {
    public static int[] getKeys() {
        return new int[]{0};
    }

    public static boolean isEnabled(int i) {
        if (i == 0) {
            return HatchRefreshTokenGate.INSTANCE.isEnabled();
        }
        throw AnonymousClass005.A0c(i);
    }
}
