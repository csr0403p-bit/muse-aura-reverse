package com.facebook.aura.ageverification.intf;

import com.facebook.aura.ageverification.AgeVerificationIntegrationProviderImpl;

/* loaded from: classes2.dex */
public final class AgeVerification {
    public static final int $stable = 0;
    public static final AgeVerification INSTANCE = new AgeVerification();

    public final AgeVerificationIntegration getIntegration() {
        int i = new int[]{0}[0];
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            return AgeVerificationIntegrationProviderImpl.INSTANCE.integration();
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
    }
}
