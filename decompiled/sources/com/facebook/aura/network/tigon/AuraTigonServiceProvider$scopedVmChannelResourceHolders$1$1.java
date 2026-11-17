package com.facebook.aura.network.tigon;

import X.AbstractC7559F3s;
import X.C6686ERv;
import X.FGI;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.aura.executors.AuraExecutors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraTigonServiceProvider$scopedVmChannelResourceHolders$1$1 extends AbstractC7559F3s implements Function0<ScopedNoiseIdentityProbeResources> {
    public final /* synthetic */ int $slot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTigonServiceProvider$scopedVmChannelResourceHolders$1$1(int i) {
        super(0);
        this.$slot = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ScopedNoiseIdentityProbeResources invoke() {
        C6686ERv.A00(NoiseChannelManagerHolder.Companion);
        NoiseChannelManagerHolder noiseChannelManagerHolder = new NoiseChannelManagerHolder(NoiseChannelManagerHolder.createNative());
        noiseChannelManagerHolder.setHttpEnabled(true);
        return new ScopedNoiseIdentityProbeResources(noiseChannelManagerHolder, AuraTigonServiceProvider.INSTANCE.createNoiseEnabledClient(null, AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor(FGI.A0H("AuraTigonScopedVmChannel-", this.$slot), null), noiseChannelManagerHolder, AuraTigonUnexpectedEventReporter.INSTANCE));
    }
}
