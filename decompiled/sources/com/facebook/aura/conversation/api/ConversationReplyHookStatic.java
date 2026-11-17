package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.appreview.HatchInAppReviewReplyHook;
import com.facebook.aura.onboarding.FirstChatReplyHook;

/* loaded from: classes3.dex */
public class ConversationReplyHookStatic {
    public static void onReplyOutcome(int i, AbstractC3358CGz abstractC3358CGz, ConversationReplyOutcome conversationReplyOutcome) {
        if (i == 0) {
            FirstChatReplyHook.INSTANCE.onReplyOutcome(abstractC3358CGz, conversationReplyOutcome);
        } else {
            if (i != 1) {
                throw AnonymousClass005.A0c(i);
            }
            HatchInAppReviewReplyHook.INSTANCE.onReplyOutcome(abstractC3358CGz, conversationReplyOutcome);
        }
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
