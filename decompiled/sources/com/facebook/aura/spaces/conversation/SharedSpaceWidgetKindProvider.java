package com.facebook.aura.spaces.conversation;

import X.AbstractC3358CGz;
import com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider;

/* loaded from: classes3.dex */
public final class SharedSpaceWidgetKindProvider implements ConversationWidgetKindProvider {
    public static final int $stable = 0;
    public static final SharedSpaceWidgetKindProvider INSTANCE = new SharedSpaceWidgetKindProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider
    public String kind() {
        return SharedSpaceWidgetRendererKt.SHARED_SPACE_KIND;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider
    public boolean supportsStandalonePresentation(AbstractC3358CGz abstractC3358CGz) {
        return false;
    }
}
