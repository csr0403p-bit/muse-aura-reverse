package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass007;
import X.C3cG;
import com.facebook.aura.memory.AuraRetainedSizeSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchGatewayRetainedSizes implements AuraRetainedSizeSource {
    public static final int $stable = 0;
    public static final HatchGatewayRetainedSizes INSTANCE = new HatchGatewayRetainedSizes();

    @Override // com.facebook.aura.memory.AuraRetainedSizeSource
    public Map<String, Long> retainedSizes(AbstractC3358CGz abstractC3358CGz) {
        HatchGatewayEventsHandler hatchGatewayEventsHandler;
        return (abstractC3358CGz == null || (hatchGatewayEventsHandler = (HatchGatewayEventsHandler) abstractC3358CGz.A02(HatchGatewayEventsHandler.class)) == null) ? AGH.A0E() : AnonymousClass007.A0d("root_agent_sessions", Long.valueOf(hatchGatewayEventsHandler.rootAgentIdsBySession.getValue().size()), C3cG.A0r("completed_sub_agents", Long.valueOf(hatchGatewayEventsHandler.completedSubAgents.getValue().size())));
    }
}
