package com.facebook.aura.onboarding;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import com.facebook.aura.conversation.api.ConversationReplyHook;
import com.facebook.aura.conversation.api.ConversationReplyOutcome;

/* loaded from: classes3.dex */
public final class FirstChatReplyHook implements ConversationReplyHook {
    public static final FirstChatReplyHook INSTANCE = new FirstChatReplyHook();

    @Override // com.facebook.aura.conversation.api.ConversationReplyHook
    public void onReplyOutcome(AbstractC3358CGz abstractC3358CGz, ConversationReplyOutcome conversationReplyOutcome) {
        AnonymousClass003.A0u(abstractC3358CGz, conversationReplyOutcome);
        FirstChatLogging firstChatLogging = (FirstChatLogging) abstractC3358CGz.A02(FirstChatLogging.class);
        if (firstChatLogging != null) {
            firstChatLogging.onReplyOutcome(AnonymousClass002.A1Z(conversationReplyOutcome, ConversationReplyOutcome.COMPLETED));
        }
    }
}
