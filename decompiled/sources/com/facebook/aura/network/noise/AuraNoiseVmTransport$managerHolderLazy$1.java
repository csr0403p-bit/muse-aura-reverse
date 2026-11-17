package com.facebook.aura.network.noise;

import X.AbstractC7559F3s;
import X.C6686ERv;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraNoiseVmTransport$managerHolderLazy$1 extends AbstractC7559F3s implements Function0<NoiseChannelManagerHolder> {
    public static final AuraNoiseVmTransport$managerHolderLazy$1 INSTANCE = new AuraNoiseVmTransport$managerHolderLazy$1();

    public AuraNoiseVmTransport$managerHolderLazy$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NoiseChannelManagerHolder invoke() {
        C6686ERv.A00(NoiseChannelManagerHolder.Companion);
        NoiseChannelManagerHolder noiseChannelManagerHolder = new NoiseChannelManagerHolder(NoiseChannelManagerHolder.createNative());
        noiseChannelManagerHolder.setHttpEnabled(false);
        return noiseChannelManagerHolder;
    }
}
