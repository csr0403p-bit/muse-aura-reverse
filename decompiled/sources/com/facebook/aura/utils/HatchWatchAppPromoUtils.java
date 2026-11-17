package com.facebook.aura.utils;

import X.AnonymousClass002;
import X.BV5;
import X.BzK;
import X.C4oT;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes5.dex */
public final class HatchWatchAppPromoUtils {
    public static final int $stable = 0;
    public static final HatchWatchAppPromoUtils INSTANCE = new HatchWatchAppPromoUtils();
    public static final String PROMPTS_KEY = "watch_app_promo_prompts";
    public static final String SHOWN_KEY = "watch_app_promo_shown";

    public final boolean hasPromptedMoreThan(long j) {
        return AnonymousClass002.A1N((BV5.A08(HatchPrefsStore.INSTANCE.internalPrefs(), PROMPTS_KEY) > j ? 1 : (BV5.A08(HatchPrefsStore.INSTANCE.internalPrefs(), PROMPTS_KEY) == j ? 0 : -1)));
    }

    public final boolean isShown() {
        return HatchPrefsStore.INSTANCE.internalPrefs().getBoolean(SHOWN_KEY, false);
    }

    public final void onUserMessageSent() {
        C4oT c4oTInternalPrefs = HatchPrefsStore.INSTANCE.internalPrefs();
        if (c4oTInternalPrefs.getBoolean(SHOWN_KEY, false)) {
            return;
        }
        HatchUtil hatchUtil = HatchUtil.INSTANCE;
        if (hatchUtil.isWatchAppPromoEnabled()) {
            long j = c4oTInternalPrefs.getLong(PROMPTS_KEY, 0L);
            if (j <= hatchUtil.watchAppPromoPromptCount()) {
                BzK bzKA02 = BzK.A02(c4oTInternalPrefs);
                bzKA02.AYp(PROMPTS_KEY, j + 1);
                bzKA02.apply();
            }
        }
    }

    public final void clear() {
        BzK bzKA01 = BzK.A01();
        bzKA01.Aae(SHOWN_KEY);
        bzKA01.Aae(PROMPTS_KEY);
        bzKA01.apply();
    }

    public final void markReady() {
        BzK bzKA01 = BzK.A01();
        bzKA01.Aae(SHOWN_KEY);
        bzKA01.AYp(PROMPTS_KEY, 2147483647L);
        bzKA01.apply();
    }

    public final void markShown() {
        BzK bzKA01 = BzK.A01();
        bzKA01.A0A(SHOWN_KEY, true);
        bzKA01.Aae(PROMPTS_KEY);
        bzKA01.apply();
    }
}
