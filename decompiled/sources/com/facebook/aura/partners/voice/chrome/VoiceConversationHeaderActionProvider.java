package com.facebook.aura.partners.voice.chrome;

import com.facebook.aura.header.api.ConversationHeaderActionContributor;
import com.facebook.aura.header.api.ConversationHeaderActionProvider;

/* loaded from: classes.dex */
public final class VoiceConversationHeaderActionProvider implements ConversationHeaderActionProvider {
    public static final int $stable = 0;
    public static final VoiceConversationHeaderActionProvider INSTANCE = new VoiceConversationHeaderActionProvider();

    @Override // com.facebook.aura.header.api.ConversationHeaderActionProvider
    public ConversationHeaderActionContributor contributor() {
        return VoiceConversationHeaderAction.INSTANCE;
    }
}
