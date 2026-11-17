package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;

/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$1 extends AbstractC7559F3s implements G0U<HatchGatewayStateSnapshot, HatchGatewayStateSnapshot> {
    public static final HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$1 INSTANCE = new HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$1();

    public HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$1() {
        super(1);
    }

    @Override // X.G0U
    public final HatchGatewayStateSnapshot invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
        C7384Etj.A0Y(hatchGatewayStateSnapshot, 0);
        return hatchGatewayStateSnapshot.copy(hatchGatewayStateSnapshot.connection, HatchCvmAuthenticationState.Disabled.INSTANCE, hatchGatewayStateSnapshot.connectionCycle);
    }
}
