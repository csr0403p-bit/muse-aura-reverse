package com.facebook.aura.shortcut;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class HomeScreenShortcutPersonalizationCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final HomeScreenShortcutPersonalizationCleanup INSTANCE = new HomeScreenShortcutPersonalizationCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        HomeScreenShortcutPersonalization.isPersonalizedInSession = false;
    }
}
