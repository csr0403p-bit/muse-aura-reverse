package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;
import com.facebook.aura.model.GenericListPresentation;

/* loaded from: classes.dex */
public interface ConversationListPresentationRenderer {
    void Render(GenericListPresentation genericListPresentation, ConversationListPresentationContext conversationListPresentationContext, BRg bRg, BFM bfm, int i);

    boolean canRender(GenericListPresentation genericListPresentation);
}
