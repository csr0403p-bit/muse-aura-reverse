package com.facebook.aura.flights;

import com.facebook.aura.conversation.widget.api.ConversationListPresentationRenderer;
import com.facebook.aura.conversation.widget.api.ConversationListPresentationRendererProvider;

/* loaded from: classes.dex */
public final class FlightResultsListRendererProvider implements ConversationListPresentationRendererProvider {
    public static final int $stable = 0;
    public static final FlightResultsListRendererProvider INSTANCE = new FlightResultsListRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationListPresentationRendererProvider
    public ConversationListPresentationRenderer renderer() {
        return FlightResultsListRenderer.INSTANCE;
    }
}
