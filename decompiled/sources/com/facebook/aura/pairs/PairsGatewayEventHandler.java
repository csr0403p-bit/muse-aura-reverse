package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.gateway.intf.GatewayEventHandler;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class PairsGatewayEventHandler implements GatewayEventHandler {
    public static final int $stable = 0;
    public static final PairsGatewayEventHandler INSTANCE = new PairsGatewayEventHandler();

    @Override // com.facebook.aura.gateway.intf.GatewayEventHandler
    public boolean handle(String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        String strActivityEventId;
        boolean zA1Z = AnonymousClass005.A1Z(str, jsonObject, abstractC3358CGz);
        if (!PairsGatewayEventHandlerKt.PEER_EVENTS.contains(str)) {
            return false;
        }
        if (str.equals(PairsGatewayEventHandlerKt.ACTIVITY_ADDED) && (strActivityEventId = PairsGatewayEventHandlerKt.activityEventId(jsonObject)) != null) {
            ConnectionsActivityEvents.Companion.getInstance(abstractC3358CGz).add(strActivityEventId);
        }
        PairsRepository.Companion.getInstance(abstractC3358CGz).invalidate();
        return zA1Z;
    }
}
