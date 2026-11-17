package com.facebook.aura.memory;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class AuraCacheSignOutCleanup implements SignOutCleanupHandler {
    public static final AuraCacheSignOutCleanup INSTANCE = new AuraCacheSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AuraMemoryPressure.INSTANCE.clearAllCaches();
    }
}
