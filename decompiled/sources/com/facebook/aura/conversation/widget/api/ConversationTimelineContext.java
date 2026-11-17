package com.facebook.aura.conversation.widget.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C20Q;

/* loaded from: classes.dex */
public final class ConversationTimelineContext {
    public static final int $stable = 8;
    public final String conversationId;
    public final C20Q<Boolean> isConversationIdle;
    public final ConversationTimelineSurface surface;
    public final AbstractC3358CGz userSession;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final ConversationTimelineSurface getSurface() {
        return this.surface;
    }

    public final AbstractC3358CGz getUserSession() {
        return this.userSession;
    }

    public final C20Q<Boolean> isConversationIdle() {
        return this.isConversationIdle;
    }

    public ConversationTimelineContext(AbstractC3358CGz abstractC3358CGz, String str, ConversationTimelineSurface conversationTimelineSurface, C20Q<Boolean> c20q) {
        AnonymousClass005.A14(abstractC3358CGz, str, conversationTimelineSurface, c20q);
        this.userSession = abstractC3358CGz;
        this.conversationId = str;
        this.surface = conversationTimelineSurface;
        this.isConversationIdle = c20q;
    }
}
