package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;
import com.facebook.aura.model.GenericListPresentation;

/* loaded from: classes.dex */
public interface ConversationGenericListRenderer {
    void Render(GenericListPresentation genericListPresentation, ConversationGenericListContext conversationGenericListContext, BRg bRg, BFM bfm, int i);

    boolean canRender(GenericListPresentation genericListPresentation);
}
