package com.facebook.aura.network.transport;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class HatchVmInboundTrafficSignOutCleanup implements SignOutCleanupHandler {
    public static final HatchVmInboundTrafficSignOutCleanup INSTANCE = new HatchVmInboundTrafficSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        HatchVmInboundTraffic.lastReceivedAtMs.clear();
    }
}
