package com.facebook.aura.appupdate;

import X.BV5;
import X.BzK;
import X.C7384Etj;
import X.C8j3;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes5.dex */
public final class AppUpdateNudgeCooldown {
    public static final int $stable = 0;
    public final long cooldownMs;
    public final String key;

    public AppUpdateNudgeCooldown(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.key = str;
        this.cooldownMs = j;
    }

    public final boolean isElapsed() {
        return C8j3.A1Q(((System.currentTimeMillis() - BV5.A08(HatchPrefsStore.INSTANCE.internalPrefs(), this.key)) > this.cooldownMs ? 1 : ((System.currentTimeMillis() - BV5.A08(HatchPrefsStore.INSTANCE.internalPrefs(), this.key)) == this.cooldownMs ? 0 : -1)));
    }

    public final void record() {
        BzK bzKA01 = BzK.A01();
        bzKA01.AYp(this.key, System.currentTimeMillis());
        bzKA01.apply();
    }
}
