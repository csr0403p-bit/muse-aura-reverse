package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;
import com.facebook.aura.conversation.api.ConversationCardRequest;

/* loaded from: classes2.dex */
public interface ConversationCardRenderer {
    void Render(ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i);

    boolean canRender(ConversationCardRequest conversationCardRequest);
}
