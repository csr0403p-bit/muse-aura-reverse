package com.facebook.aura.status.repo;

import X.AbstractC0852A5y;
import X.AbstractC7559F3s;
import X.C0851A5x;
import X.C7384Etj;
import X.F24;
import X.G0U;
import com.facebook.aura.gateway.HatchGatewayConnectionState;

/* loaded from: classes4.dex */
public final class HatchStatusRepository$connectionState$2 extends AbstractC7559F3s implements G0U<HatchGatewayConnectionState, C0851A5x> {
    public static final HatchStatusRepository$connectionState$2 INSTANCE = new HatchStatusRepository$connectionState$2();

    public HatchStatusRepository$connectionState$2() {
        super(1);
    }

    /* renamed from: invoke-5sfh64U, reason: not valid java name */
    public final long m2208invoke5sfh64U(HatchGatewayConnectionState hatchGatewayConnectionState) {
        C7384Etj.A0Y(hatchGatewayConnectionState, 0);
        return AbstractC0852A5y.A01(F24.A04, hatchGatewayConnectionState.equals(HatchGatewayConnectionState.Connected.INSTANCE) ? 0 : 1000);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C0851A5x invoke(HatchGatewayConnectionState hatchGatewayConnectionState) {
        return new C0851A5x(m2208invoke5sfh64U(hatchGatewayConnectionState));
    }
}
