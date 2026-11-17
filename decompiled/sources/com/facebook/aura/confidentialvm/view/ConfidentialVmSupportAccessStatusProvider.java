package com.facebook.aura.confidentialvm.view;

import com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusProvider;

/* loaded from: classes.dex */
public final class ConfidentialVmSupportAccessStatusProvider implements ConversationComposerStatusProvider {
    public static final int $stable = 0;
    public static final ConfidentialVmSupportAccessStatusProvider INSTANCE = new ConfidentialVmSupportAccessStatusProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusProvider
    public ConversationComposerStatusCard card() {
        return SupportInvestigatingStatusCard.INSTANCE;
    }
}
