package com.facebook.aura.browsertask.conversation;

import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRendererProvider;

/* loaded from: classes3.dex */
public final class BrowserTaskPresentationCardRendererProvider implements ConversationPresentationCardRendererProvider {
    public static final int $stable = 0;
    public static final BrowserTaskPresentationCardRendererProvider INSTANCE = new BrowserTaskPresentationCardRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRendererProvider
    public ConversationPresentationCardRenderer renderer() {
        return BrowserTaskPresentationCardRenderer.INSTANCE;
    }
}
