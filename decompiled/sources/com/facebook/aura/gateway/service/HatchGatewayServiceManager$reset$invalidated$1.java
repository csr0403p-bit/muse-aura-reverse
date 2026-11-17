package com.facebook.aura.gateway.service;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.service.NoiseHttpDemandFence;
import com.facebook.aura.network.noise.AuraNoiseConnectionDemandRejectionReason;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchGatewayServiceManager$reset$invalidated$1 extends AbstractC7559F3s implements G0U<NoiseHttpDemandFence.Demand<AbstractC3358CGz>, Unit> {
    public static final HatchGatewayServiceManager$reset$invalidated$1 INSTANCE = new HatchGatewayServiceManager$reset$invalidated$1();

    public HatchGatewayServiceManager$reset$invalidated$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NoiseHttpDemandFence.Demand<AbstractC3358CGz> demand) {
        C7384Etj.A0Y(demand, 0);
        HatchGatewayServiceManager.rejectNoiseHttpDemand$default(HatchGatewayServiceManager.INSTANCE, demand, AuraNoiseConnectionDemandRejectionReason.SESSION_ENDED, false, 4, null);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NoiseHttpDemandFence.Demand<AbstractC3358CGz> demand) {
        invoke2(demand);
        return Unit.INSTANCE;
    }
}
