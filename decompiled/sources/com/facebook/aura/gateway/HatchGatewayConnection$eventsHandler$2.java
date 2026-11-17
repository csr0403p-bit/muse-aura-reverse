package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchGatewayConnection$eventsHandler$2 extends AbstractC7559F3s implements Function0<HatchGatewayEventsHandler> {
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$eventsHandler$2(HatchGatewayConnection hatchGatewayConnection) {
        super(0);
        this.this$0 = hatchGatewayConnection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchGatewayEventsHandler invoke() {
        return HatchGatewayEventsHandler.Companion.getInstance(this.this$0.userSession);
    }
}
