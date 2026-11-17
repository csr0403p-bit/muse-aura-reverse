package com.facebook.aura.conversation.widget.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;

/* loaded from: classes.dex */
public final class ConversationComposerStatusContext {
    public static final int $stable = 8;
    public final String conversationId;
    public final boolean isPrimaryConversation;
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

    public final boolean isPrimaryConversation() {
        return this.isPrimaryConversation;
    }

    public ConversationComposerStatusContext(AbstractC3358CGz abstractC3358CGz, String str, boolean z, ConversationTimelineSurface conversationTimelineSurface) {
        AnonymousClass005.A0y(abstractC3358CGz, str, conversationTimelineSurface);
        this.userSession = abstractC3358CGz;
        this.conversationId = str;
        this.isPrimaryConversation = z;
        this.surface = conversationTimelineSurface;
    }
}
