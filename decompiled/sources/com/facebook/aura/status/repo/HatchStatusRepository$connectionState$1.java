package com.facebook.aura.status.repo;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.gateway.HatchGatewayConnectionState;

/* loaded from: classes4.dex */
public final class HatchStatusRepository$connectionState$1 extends AbstractC7559F3s implements G0V<HatchGatewayConnectionState, HatchGatewayConnectionState, Boolean> {
    public static final HatchStatusRepository$connectionState$1 INSTANCE = new HatchStatusRepository$connectionState$1();

    public HatchStatusRepository$connectionState$1() {
        super(2);
    }

    @Override // X.G0V
    public final Boolean invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HatchGatewayConnectionState hatchGatewayConnectionState2) {
        AnonymousClass003.A0u(hatchGatewayConnectionState, hatchGatewayConnectionState2);
        return Boolean.valueOf(hatchGatewayConnectionState.equals(hatchGatewayConnectionState2) || ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Reconnecting) && (hatchGatewayConnectionState2 instanceof HatchGatewayConnectionState.Reconnecting)));
    }
}
