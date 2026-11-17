package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.impl.HatchVoiceIntegrationProvider;

/* loaded from: classes2.dex */
public class VoiceIntegrationProviderStatic {
    public static VoiceIntegration integration(int i) {
        if (i == 0) {
            return HatchVoiceIntegrationProvider.INSTANCE.integration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
