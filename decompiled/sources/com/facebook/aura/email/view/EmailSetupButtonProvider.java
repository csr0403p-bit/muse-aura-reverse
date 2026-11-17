package com.facebook.aura.email.view;

import com.facebook.aura.conversation.widget.api.ConversationPresentationButtonPolicy;
import com.facebook.aura.conversation.widget.api.ConversationPresentationButtonProvider;

/* loaded from: classes3.dex */
public final class EmailSetupButtonProvider implements ConversationPresentationButtonProvider {
    public static final int $stable = 0;
    public static final EmailSetupButtonProvider INSTANCE = new EmailSetupButtonProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationButtonProvider
    public ConversationPresentationButtonPolicy policy() {
        return EmailSetupButtonPolicy.INSTANCE;
    }
}
