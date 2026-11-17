package com.facebook.aura.nudge;

import com.facebook.aura.conversation.widget.api.ConversationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationCardRendererProvider;

/* loaded from: classes3.dex */
public final class NudgeActionCardRendererProvider implements ConversationCardRendererProvider {
    public static final int $stable = 0;
    public static final NudgeActionCardRendererProvider INSTANCE = new NudgeActionCardRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationCardRendererProvider
    public ConversationCardRenderer renderer() {
        return NudgeActionCardRenderer.INSTANCE;
    }
}
