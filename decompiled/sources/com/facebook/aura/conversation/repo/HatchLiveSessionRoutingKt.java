package com.facebook.aura.conversation.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.model.HatchSendMessage;

/* loaded from: classes.dex */
public abstract class HatchLiveSessionRoutingKt {
    public static final HatchSendMessage resolveLiveSessionRoute(HatchSendMessage hatchSendMessage, AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1a = AnonymousClass002.A1a(hatchSendMessage, abstractC3358CGz);
        if (!hatchSendMessage.routeToLiveSession) {
            return hatchSendMessage;
        }
        LiveSession liveSessionForSession = LiveSessions.INSTANCE.forSession(abstractC3358CGz);
        return (liveSessionForSession == null || liveSessionForSession.isActiveIn(str) != zA1a) ? HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, null, null, null, null, null, false, null, null, null, 7679, null) : HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, null, null, null, null, null, false, str, null, null, 7167, null);
    }
}
