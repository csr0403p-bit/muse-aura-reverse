package com.facebook.aura.partners.voice.impl;

import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider;

/* loaded from: classes3.dex */
public final class HatchVoiceOptionsWidgetRendererProvider implements ConversationWidgetRendererProvider {
    public static final int $stable = 0;
    public static final HatchVoiceOptionsWidgetRendererProvider INSTANCE = new HatchVoiceOptionsWidgetRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider
    public ConversationWidgetRenderer renderer() {
        return HatchVoiceOptionsWidgetRenderer.INSTANCE;
    }
}
