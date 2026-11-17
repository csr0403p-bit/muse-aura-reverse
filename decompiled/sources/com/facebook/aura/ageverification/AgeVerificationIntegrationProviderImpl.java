package com.facebook.aura.ageverification;

import com.facebook.aura.ageverification.intf.AgeVerificationIntegration;
import com.facebook.aura.ageverification.intf.AgeVerificationIntegrationProvider;

/* loaded from: classes2.dex */
public final class AgeVerificationIntegrationProviderImpl implements AgeVerificationIntegrationProvider {
    public static final int $stable = 0;
    public static final AgeVerificationIntegrationProviderImpl INSTANCE = new AgeVerificationIntegrationProviderImpl();

    @Override // com.facebook.aura.ageverification.intf.AgeVerificationIntegrationProvider
    public AgeVerificationIntegration integration() {
        return AgeVerificationIntegrationImpl.INSTANCE;
    }
}
