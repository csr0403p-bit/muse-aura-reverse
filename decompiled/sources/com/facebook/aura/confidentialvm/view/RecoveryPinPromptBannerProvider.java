package com.facebook.aura.confidentialvm.view;

import com.facebook.aura.conversation.widget.api.ConversationTopBanner;
import com.facebook.aura.conversation.widget.api.ConversationTopBannerProvider;

/* loaded from: classes.dex */
public final class RecoveryPinPromptBannerProvider implements ConversationTopBannerProvider {
    public static final int $stable = 0;
    public static final RecoveryPinPromptBannerProvider INSTANCE = new RecoveryPinPromptBannerProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBannerProvider
    public ConversationTopBanner banner() {
        return RecoveryPinPromptBanner.INSTANCE;
    }
}
