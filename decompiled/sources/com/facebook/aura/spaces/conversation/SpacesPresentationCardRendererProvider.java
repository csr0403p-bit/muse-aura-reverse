package com.facebook.aura.spaces.conversation;

import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRendererProvider;

/* loaded from: classes3.dex */
public final class SpacesPresentationCardRendererProvider implements ConversationPresentationCardRendererProvider {
    public static final int $stable = 0;
    public static final SpacesPresentationCardRendererProvider INSTANCE = new SpacesPresentationCardRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRendererProvider
    public ConversationPresentationCardRenderer renderer() {
        return SpacesPresentationCardRenderer.INSTANCE;
    }
}
