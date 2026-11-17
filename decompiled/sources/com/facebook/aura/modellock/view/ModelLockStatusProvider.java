package com.facebook.aura.modellock.view;

import com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusProvider;

/* loaded from: classes.dex */
public final class ModelLockStatusProvider implements ConversationComposerStatusProvider {
    public static final int $stable = 0;
    public static final ModelLockStatusProvider INSTANCE = new ModelLockStatusProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusProvider
    public ConversationComposerStatusCard card() {
        return ModelLockStatusCard.INSTANCE;
    }
}
