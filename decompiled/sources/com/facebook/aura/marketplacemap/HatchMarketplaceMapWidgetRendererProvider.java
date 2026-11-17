package com.facebook.aura.marketplacemap;

import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider;

/* loaded from: classes3.dex */
public final class HatchMarketplaceMapWidgetRendererProvider implements ConversationWidgetRendererProvider {
    public static final int $stable = 0;
    public static final HatchMarketplaceMapWidgetRendererProvider INSTANCE = new HatchMarketplaceMapWidgetRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider
    public ConversationWidgetRenderer renderer() {
        return HatchMarketplaceMapWidgetRenderer.INSTANCE;
    }
}
