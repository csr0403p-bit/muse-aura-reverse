package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;
import com.facebook.aura.model.HatchWidget;

/* loaded from: classes.dex */
public interface ConversationWidgetRenderer {
    void Render(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, BFM bfm, int i);

    boolean canRender(HatchWidget hatchWidget);
}
