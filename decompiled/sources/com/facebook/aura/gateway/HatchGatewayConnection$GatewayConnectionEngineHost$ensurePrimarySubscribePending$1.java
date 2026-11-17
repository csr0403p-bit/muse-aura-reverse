package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.network.transport.HatchWebSocketSession;

/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$ensurePrimarySubscribePending$1 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ HatchGatewayConnection this$0;

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0Y(str, 0);
        HatchWebSocketSession hatchWebSocketSession = this.this$0.transport;
        return Boolean.valueOf(hatchWebSocketSession != null ? hatchWebSocketSession.send(str) : false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$ensurePrimarySubscribePending$1(HatchGatewayConnection hatchGatewayConnection) {
        super(1);
        this.this$0 = hatchGatewayConnection;
    }
}
