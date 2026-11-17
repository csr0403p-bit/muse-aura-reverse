package com.facebook.aura.common.prefs;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class AuraPrefsSignOutCleanupHandler implements SignOutCleanupHandler {
    public static final AuraPrefsSignOutCleanupHandler INSTANCE = new AuraPrefsSignOutCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AuraUserPrefs.INSTANCE.clearAll();
        AuraVMPrefs.INSTANCE.clearAll();
        AuraDevicePrefs.INSTANCE.clearAll();
    }
}
