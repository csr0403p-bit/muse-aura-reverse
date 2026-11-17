package com.facebook.aura.gateway.service;

import X.AbstractC3358CGz;
import X.C4JM;
import X.F3R;
import android.app.Application;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.nodes.HatchNodeClient;

/* loaded from: classes3.dex */
public final class NodeCommandSignOutCleanup implements SignOutCleanupHandler {
    public static final NodeCommandSignOutCleanup INSTANCE = new NodeCommandSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        HatchNodeClient hatchNodeClient;
        Application applicationA00 = C4JM.A00();
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null && (hatchNodeClient = (HatchNodeClient) currentSession.A02(HatchNodeClient.class)) != null) {
            hatchNodeClient.sessionEnded = true;
        }
        NodeCommandService.Companion.cancelAll(applicationA00);
        F3R.A02(applicationA00).A09(NodeCommandFallbackWorker.class.getName());
    }
}
