package com.facebook.aura.rentalcars;

import com.facebook.aura.conversation.widget.api.ConversationGenericListRenderer;
import com.facebook.aura.conversation.widget.api.ConversationGenericListRendererProvider;

/* loaded from: classes.dex */
public final class RentalCarResultsRendererProvider implements ConversationGenericListRendererProvider {
    public static final int $stable = 0;
    public static final RentalCarResultsRendererProvider INSTANCE = new RentalCarResultsRendererProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationGenericListRendererProvider
    public ConversationGenericListRenderer renderer() {
        return RentalCarResultsRenderer.INSTANCE;
    }
}
