package com.facebook.aura.appupdate;

import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes5.dex */
public final class AuraPlayInAppUpdater {
    public static final int $stable = 0;
    public static final AuraPlayInAppUpdater INSTANCE = new AuraPlayInAppUpdater();

    public final boolean shouldForceUpdate() {
        String playStoreMinVersionForceUpdate = HatchUtil.INSTANCE.getPlayStoreMinVersionForceUpdate();
        if (playStoreMinVersionForceUpdate.length() == 0) {
            return false;
        }
        return AppUpdateChecker.INSTANCE.isVersionOlderThan$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate("16.0.0.11.159", playStoreMinVersionForceUpdate);
    }
}
