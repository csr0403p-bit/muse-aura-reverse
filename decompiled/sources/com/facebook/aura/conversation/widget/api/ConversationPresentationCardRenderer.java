package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;
import com.facebook.aura.model.HatchPresentationData;

/* loaded from: classes.dex */
public interface ConversationPresentationCardRenderer {
    void Render(HatchPresentationData hatchPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, BFM bfm, int i);

    boolean canRender(HatchPresentationData hatchPresentationData);
}
