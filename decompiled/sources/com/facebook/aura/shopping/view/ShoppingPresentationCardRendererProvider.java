package com.facebook.aura.shopping.view;

import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRendererProvider;

/* loaded from: classes3.dex */
public final class ShoppingPresentationCardRendererProvider implements ConversationPresentationCardRendererProvider {
    public static final int $stable = 0;
    public static final ShoppingPresentationCardRendererProvider INSTANCE = new ShoppingPresentationCardRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRendererProvider
    public ConversationPresentationCardRenderer renderer() {
        return ShoppingPresentationCardRenderer.INSTANCE;
    }
}
