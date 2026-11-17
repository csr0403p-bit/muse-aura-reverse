package com.facebook.aura.hotels;

import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider;

/* loaded from: classes3.dex */
public final class HotelResultsRendererProvider implements ConversationWidgetRendererProvider {
    public static final int $stable = 0;
    public static final HotelResultsRendererProvider INSTANCE = new HotelResultsRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRendererProvider
    public ConversationWidgetRenderer renderer() {
        return HotelResultsRenderer.INSTANCE;
    }
}
