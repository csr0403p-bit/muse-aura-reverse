package com.facebook.aura.gateway.service;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.service.NoiseHttpDemandFence;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchGatewayServiceManager$initialize$sessionUpdate$1 extends AbstractC7559F3s implements G0U<NoiseHttpDemandFence.SessionToken<AbstractC3358CGz>, Unit> {
    public static final HatchGatewayServiceManager$initialize$sessionUpdate$1 INSTANCE = new HatchGatewayServiceManager$initialize$sessionUpdate$1();

    public HatchGatewayServiceManager$initialize$sessionUpdate$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken) {
        C7384Etj.A0Y(sessionToken, 0);
        HatchGatewayServiceManager.INSTANCE.registerNoiseHttpDemandHandler(sessionToken);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken) {
        invoke2(sessionToken);
        return Unit.INSTANCE;
    }
}
