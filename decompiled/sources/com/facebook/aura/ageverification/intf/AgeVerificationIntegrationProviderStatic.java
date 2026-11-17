package com.facebook.aura.ageverification.intf;

import X.AnonymousClass005;
import com.facebook.aura.ageverification.AgeVerificationIntegrationProviderImpl;

/* loaded from: classes2.dex */
public class AgeVerificationIntegrationProviderStatic {
    public static AgeVerificationIntegration integration(int i) {
        if (i == 0) {
            return AgeVerificationIntegrationProviderImpl.INSTANCE.integration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
