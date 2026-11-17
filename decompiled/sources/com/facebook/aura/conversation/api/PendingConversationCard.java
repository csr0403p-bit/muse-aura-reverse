package com.facebook.aura.conversation.api;

import X.AnonymousClass003;

/* loaded from: classes2.dex */
public final class PendingConversationCard {
    public static final int $stable = 8;
    public final boolean isInProgress;
    public final ConversationCardRequests owner;
    public final ConversationCardRequest request;
    public final long sequenceId;

    public final boolean accept() {
        return this.owner.accept$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api(this.sequenceId);
    }

    public final boolean decline() {
        return this.owner.decline$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api(this.sequenceId);
    }

    public final ConversationCardRequest getRequest() {
        return this.request;
    }

    public final long getSequenceId() {
        return this.sequenceId;
    }

    public final boolean isInProgress() {
        return this.isInProgress;
    }

    public final boolean markShown() {
        return this.owner.markShown$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api(this.sequenceId);
    }

    public PendingConversationCard(ConversationCardRequest conversationCardRequest, long j, boolean z, ConversationCardRequests conversationCardRequests) {
        AnonymousClass003.A0w(conversationCardRequest, conversationCardRequests);
        this.request = conversationCardRequest;
        this.sequenceId = j;
        this.isInProgress = z;
        this.owner = conversationCardRequests;
    }
}
