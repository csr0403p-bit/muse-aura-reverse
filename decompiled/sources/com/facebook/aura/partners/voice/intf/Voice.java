package com.facebook.aura.partners.voice.intf;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.partners.voice.impl.HatchVoiceIntegrationProvider;

/* loaded from: classes2.dex */
public final class Voice {
    public static final int $stable = 0;
    public static final Voice INSTANCE = new Voice();

    public final VoiceIntegration getIntegration() {
        int i = new int[]{0}[0];
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            return HatchVoiceIntegrationProvider.INSTANCE.integration();
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
    }

    public final boolean isCallSupported(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        VoiceIntegration integration = getIntegration();
        return integration != null && integration.isCallSupported(abstractC3358CGz);
    }

    public final boolean isVoiceDesignSupported() {
        VoiceIntegration integration = getIntegration();
        return integration != null && integration.isVoiceDesignSupported();
    }
}
