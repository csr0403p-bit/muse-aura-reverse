package com.facebook.aura.mobileconfig;

import X.AbstractC7559F3s;
import X.BV5;
import X.CFK;
import com.facebook.aura.mobileconfig.session.AuraDeviceSession;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMobileConfig$sessionlessMC$2 extends AbstractC7559F3s implements Function0<AuraDeviceSession> {
    public static final AuraMobileConfig$sessionlessMC$2 INSTANCE = new AuraMobileConfig$sessionlessMC$2();

    public AuraMobileConfig$sessionlessMC$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraDeviceSession invoke() {
        CFK.A05(AuraMobileConfig.TAG, "Creating sessionless MC");
        return new AuraDeviceSession(AuraSessionlessMobileConfigFetcher.INSTANCE, ((AuraMobileConfigParams) BV5.A0Z(65538)).provider, AuraMobileConfig.INSTANCE.getDeviceId());
    }
}
