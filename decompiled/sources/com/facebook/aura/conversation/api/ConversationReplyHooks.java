package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import com.facebook.aura.appreview.HatchInAppReviewReplyHook;
import com.facebook.aura.onboarding.FirstChatReplyHook;

/* loaded from: classes3.dex */
public final class ConversationReplyHooks {
    public static final int $stable = 0;
    public static final ConversationReplyHooks INSTANCE = new ConversationReplyHooks();

    public final void notify(AbstractC3358CGz abstractC3358CGz, ConversationReplyOutcome conversationReplyOutcome) {
        int[] iArr = {0, AnonymousClass002.A1a(abstractC3358CGz, conversationReplyOutcome)};
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 == 0) {
                FirstChatReplyHook.INSTANCE.onReplyOutcome(abstractC3358CGz, conversationReplyOutcome);
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                HatchInAppReviewReplyHook.INSTANCE.onReplyOutcome(abstractC3358CGz, conversationReplyOutcome);
            }
            i++;
        } while (i < 2);
    }
}
