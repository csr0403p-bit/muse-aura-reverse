package com.facebook.aura.network.tigon;

import X.AnonymousClass003;
import X.DCW;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;

/* loaded from: classes5.dex */
public final class ScopedNoiseIdentityProbeResources {
    public final NoiseChannelManagerHolder noiseChannelManagerHolder;
    public final DCW tigonHttpClient;

    public final NoiseChannelManagerHolder getNoiseChannelManagerHolder() {
        return this.noiseChannelManagerHolder;
    }

    public final DCW getTigonHttpClient() {
        return this.tigonHttpClient;
    }

    public ScopedNoiseIdentityProbeResources(NoiseChannelManagerHolder noiseChannelManagerHolder, DCW dcw) {
        AnonymousClass003.A0u(noiseChannelManagerHolder, dcw);
        this.noiseChannelManagerHolder = noiseChannelManagerHolder;
        this.tigonHttpClient = dcw;
    }
}
