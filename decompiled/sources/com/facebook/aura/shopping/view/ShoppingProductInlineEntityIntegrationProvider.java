package com.facebook.aura.shopping.view;

import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegrationProvider;

/* loaded from: classes3.dex */
public final class ShoppingProductInlineEntityIntegrationProvider implements ConversationInlineEntityIntegrationProvider {
    public static final int $stable = 0;
    public static final ShoppingProductInlineEntityIntegrationProvider INSTANCE = new ShoppingProductInlineEntityIntegrationProvider();

    @Override // com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegrationProvider
    public ConversationInlineEntityIntegration integration() {
        return ShoppingProductInlineEntityIntegration.INSTANCE;
    }
}
