package com.facebook.aura.confidentialvm.view;

import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionProvider;

/* loaded from: classes.dex */
public final class ConfidentialVmUpsellCardActionProvider implements ConversationPresentationActionProvider {
    public static final int $stable = 0;
    public static final ConfidentialVmUpsellCardActionProvider INSTANCE = new ConfidentialVmUpsellCardActionProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationActionProvider
    public ConversationPresentationActionContributor contributor() {
        return ConfidentialVmUpsellCardActionContributor.INSTANCE;
    }
}
