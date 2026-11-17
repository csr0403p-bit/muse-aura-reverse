package com.facebook.aura.ageverification;

import X.C3cG;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class AgeVerificationSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final AgeVerificationSignOutCleanup INSTANCE = new AgeVerificationSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AgeVerificationFiles.INSTANCE.clearAll(C3cG.A06());
    }
}
