package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;

/* loaded from: classes.dex */
public interface ConversationTopBanner {
    void Render(BRg bRg, BFM bfm, int i);

    String getKey();

    int getRank();

    boolean rememberIsVisible(ConversationComposerStatusContext conversationComposerStatusContext, BFM bfm, int i);
}
