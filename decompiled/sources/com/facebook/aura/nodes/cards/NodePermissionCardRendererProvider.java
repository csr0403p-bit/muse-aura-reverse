package com.facebook.aura.nodes.cards;

import com.facebook.aura.conversation.widget.api.ConversationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationCardRendererProvider;

/* loaded from: classes3.dex */
public final class NodePermissionCardRendererProvider implements ConversationCardRendererProvider {
    public static final int $stable = 0;
    public static final NodePermissionCardRendererProvider INSTANCE = new NodePermissionCardRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationCardRendererProvider
    public ConversationCardRenderer renderer() {
        return NodePermissionCardRenderer.INSTANCE;
    }
}
