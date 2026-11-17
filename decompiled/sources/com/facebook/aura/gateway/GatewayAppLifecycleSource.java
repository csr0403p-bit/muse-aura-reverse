package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass441;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C7384Etj;
import com.facebook.aura.gateway.connection.AppLifecycleSource;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* loaded from: classes2.dex */
public final class GatewayAppLifecycleSource implements AppLifecycleSource {
    public static final int $stable = 8;
    public final C1BN<Boolean> isForeground;

    public GatewayAppLifecycleSource(C3UX c3ux) {
        C7384Etj.A0Y(c3ux, 0);
        this.isForeground = AnonymousClass441.A00(Boolean.valueOf(AnonymousClass003.A1Z(AuraAppLifecycleManager._isAppInForegroundNormalPriority)), c3ux, AuraAppLifecycleManager.isAppInForegroundFlow, C3Ek.A00);
    }

    @Override // com.facebook.aura.gateway.connection.AppLifecycleSource
    public C1BN<Boolean> isForeground() {
        return this.isForeground;
    }
}
