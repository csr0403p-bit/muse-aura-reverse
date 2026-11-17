package com.facebook.aura.graduation;

import com.facebook.aura.conversation.widget.api.ConversationTopBanner;
import com.facebook.aura.conversation.widget.api.ConversationTopBannerProvider;

/* loaded from: classes.dex */
public final class GraduationTopBannerProvider implements ConversationTopBannerProvider {
    public static final int $stable = 0;
    public static final GraduationTopBannerProvider INSTANCE = new GraduationTopBannerProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBannerProvider
    public ConversationTopBanner banner() {
        return GraduationTopBanner.INSTANCE;
    }
}
