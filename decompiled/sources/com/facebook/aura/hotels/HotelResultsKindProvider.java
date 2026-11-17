package com.facebook.aura.hotels;

import X.AbstractC3358CGz;
import com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider;

/* loaded from: classes3.dex */
public final class HotelResultsKindProvider implements ConversationWidgetKindProvider {
    public static final int $stable = 0;
    public static final HotelResultsKindProvider INSTANCE = new HotelResultsKindProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider
    public String kind() {
        return HotelResultModelsKt.HOTEL_RESULTS_KIND;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider
    public boolean supportsStandalonePresentation(AbstractC3358CGz abstractC3358CGz) {
        return true;
    }
}
