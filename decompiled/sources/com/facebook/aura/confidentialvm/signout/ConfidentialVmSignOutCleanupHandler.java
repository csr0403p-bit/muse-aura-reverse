package com.facebook.aura.confidentialvm.signout;

import X.AbstractC3358CGz;
import X.CH0;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;

/* loaded from: classes3.dex */
public final class ConfidentialVmSignOutCleanupHandler implements SignOutCleanupHandler {
    public static final ConfidentialVmSignOutCleanupHandler INSTANCE = new ConfidentialVmSignOutCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            ConfidentialVmRepository.Companion companion = ConfidentialVmRepository.Companion;
            companion.clearStoredSecret(((CH0) currentSession).A01);
            companion.clearPinState(currentSession);
        }
    }
}
