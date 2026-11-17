package com.facebook.aura.partners.voice.api;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes4.dex */
public final class VoiceCatalogSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final VoiceCatalogSignOutCleanup INSTANCE = new VoiceCatalogSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        VoiceCatalogRepository.Companion.clearForSignOut();
    }
}
