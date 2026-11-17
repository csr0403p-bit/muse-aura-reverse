package com.facebook.aura.partners.voice.chrome;

import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionProvider;

/* loaded from: classes3.dex */
public final class VoiceConversationPresentationActionProvider implements ConversationPresentationActionProvider {
    public static final int $stable = 0;
    public static final VoiceConversationPresentationActionProvider INSTANCE = new VoiceConversationPresentationActionProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationActionProvider
    public ConversationPresentationActionContributor contributor() {
        return VoiceConversationPresentationAction.INSTANCE;
    }
}
