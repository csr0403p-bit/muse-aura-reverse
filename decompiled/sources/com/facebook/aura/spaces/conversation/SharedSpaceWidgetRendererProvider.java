package com.facebook.aura.spaces.conversation;

import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider;

/* loaded from: classes3.dex */
public final class SharedSpaceWidgetRendererProvider implements ConversationWidgetRendererProvider {
    public static final int $stable = 0;
    public static final SharedSpaceWidgetRendererProvider INSTANCE = new SharedSpaceWidgetRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider
    public ConversationWidgetRenderer renderer() {
        return SharedSpaceWidgetRenderer.INSTANCE;
    }
}
