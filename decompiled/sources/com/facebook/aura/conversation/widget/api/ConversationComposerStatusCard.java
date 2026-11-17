package com.facebook.aura.conversation.widget.api;

import X.BFM;
import X.BRg;

/* loaded from: classes.dex */
public interface ConversationComposerStatusCard {
    void Render(ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, BFM bfm, int i);

    String getKey();

    int getRank();

    boolean rememberIsVisible(ConversationComposerStatusContext conversationComposerStatusContext, BFM bfm, int i);

    /* renamed from: com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static int $default$getRank(ConversationComposerStatusCard conversationComposerStatusCard) {
            return 0;
        }

        public static /* synthetic */ int access$getRank$jd(ConversationComposerStatusCard conversationComposerStatusCard) {
            return 0;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static int getRank(ConversationComposerStatusCard conversationComposerStatusCard) {
            return 0;
        }
    }
}
