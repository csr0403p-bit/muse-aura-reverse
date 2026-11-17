package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.CH0;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes5.dex */
public final class HatchCameraSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final HatchCameraSignOutCleanup INSTANCE = new HatchCameraSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            HatchCameraFiles.INSTANCE.clear$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(((CH0) currentSession).A01);
        }
    }
}
