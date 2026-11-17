package com.facebook.aura.email.view;

import X.AbstractC3358CGz;
import com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider;

/* loaded from: classes3.dex */
public final class EmailSetupCapabilityProvider implements ConversationWidgetKindProvider {
    public static final int $stable = 0;
    public static final EmailSetupCapabilityProvider INSTANCE = new EmailSetupCapabilityProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider
    public String kind() {
        return "text_with_button.email_setup";
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider
    public boolean supportsStandalonePresentation(AbstractC3358CGz abstractC3358CGz) {
        return true;
    }
}
