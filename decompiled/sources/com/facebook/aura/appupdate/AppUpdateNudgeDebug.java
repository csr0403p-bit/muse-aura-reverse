package com.facebook.aura.appupdate;

import X.BzK;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes5.dex */
public final class AppUpdateNudgeDebug {
    public static final int $stable = 0;
    public static final AppUpdateNudgeDebug INSTANCE = new AppUpdateNudgeDebug();

    public final void clearForcedEligible$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate() {
        setForcedEligible(false);
    }

    public final void forceEligible() {
        setForcedEligible(true);
    }

    public final boolean isForcedEligible$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate() {
        return HatchPrefsStore.INSTANCE.internalPrefs().getBoolean(AppUpdateNudgeKt.FORCED_ELIGIBLE_KEY, false);
    }

    private final void setForcedEligible(boolean z) {
        BzK bzKA01 = BzK.A01();
        bzKA01.A0A(AppUpdateNudgeKt.FORCED_ELIGIBLE_KEY, z);
        bzKA01.apply();
    }
}
