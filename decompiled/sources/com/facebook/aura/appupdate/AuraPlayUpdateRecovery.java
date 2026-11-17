package com.facebook.aura.appupdate;

import X.BV5;
import X.BzK;
import X.C4oT;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes5.dex */
public final class AuraPlayUpdateRecovery {
    public static final int $stable = 0;
    public static final String ATTEMPTED_VERSION_KEY = "play_update_attempted_version";
    public static final String BLOCKED_VERSION_KEY = "play_update_blocked_version";
    public static final long FALLBACK_COOLDOWN_MS = 86400000;
    public static final String FALLBACK_SHOWN_AT_KEY = "play_update_fallback_shown_at";
    public static final String FALLBACK_SHOWN_VERSION_KEY = "play_update_fallback_shown_version";
    public static final String FALLBACK_VERSION_KEY = "play_update_fallback_version";
    public static final AuraPlayUpdateRecovery INSTANCE = new AuraPlayUpdateRecovery();

    public final boolean isBlocked(int i) {
        return i > 0 && HatchPrefsStore.INSTANCE.internalPrefs().getInt(BLOCKED_VERSION_KEY, 0) == i;
    }

    public final boolean needsFallback(int i) {
        return i > 0 && HatchPrefsStore.INSTANCE.internalPrefs().getInt(FALLBACK_VERSION_KEY, 0) == i;
    }

    public static /* synthetic */ boolean canShowFallback$default(AuraPlayUpdateRecovery auraPlayUpdateRecovery, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = auraPlayUpdateRecovery.getAttemptedVersion();
        }
        return auraPlayUpdateRecovery.canShowFallback(i);
    }

    public final void block(int i, boolean z) {
        if (i > 0) {
            BzK bzKA01 = BzK.A01();
            bzKA01.AYo(BLOCKED_VERSION_KEY, i);
            if (!z && !needsFallback(i)) {
                i = 0;
            }
            bzKA01.AYo(FALLBACK_VERSION_KEY, i);
            bzKA01.apply();
        }
    }

    public final boolean canShowFallback(int i) {
        C4oT c4oTInternalPrefs = HatchPrefsStore.INSTANCE.internalPrefs();
        return c4oTInternalPrefs.getInt(FALLBACK_SHOWN_VERSION_KEY, 0) != i || System.currentTimeMillis() - BV5.A08(c4oTInternalPrefs, FALLBACK_SHOWN_AT_KEY) >= 86400000;
    }

    public final int getAttemptedVersion() {
        return HatchPrefsStore.INSTANCE.internalPrefs().getInt(ATTEMPTED_VERSION_KEY, 0);
    }

    public final void recordAttempt(int i) {
        BzK bzKA01 = BzK.A01();
        bzKA01.AYo(ATTEMPTED_VERSION_KEY, i);
        bzKA01.apply();
    }

    public final void recordFallbackShown(int i) {
        BzK bzKA01 = BzK.A01();
        bzKA01.AYo(FALLBACK_SHOWN_VERSION_KEY, i);
        bzKA01.AYp(FALLBACK_SHOWN_AT_KEY, System.currentTimeMillis());
        bzKA01.apply();
    }
}
