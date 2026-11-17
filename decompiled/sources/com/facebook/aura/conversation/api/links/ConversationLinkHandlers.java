package com.facebook.aura.conversation.api.links;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.channels.connect.ChannelConnectLinkHandler;
import com.facebook.aura.conversation.api.links.ConversationLinkOutcome;
import com.facebook.aura.partners.wearables.linking.WearablesConversationLinkHandler;

/* loaded from: classes3.dex */
public final class ConversationLinkHandlers {
    public static final ConversationLinkHandlers INSTANCE = new ConversationLinkHandlers();

    public final ConversationLinkOutcome handle(ConversationLinkTap conversationLinkTap) {
        ConversationLinkOutcome conversationLinkOutcomeHandle;
        C7384Etj.A0Y(conversationLinkTap, 0);
        int[] iArr = {0, 1};
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 == 0) {
                conversationLinkOutcomeHandle = ChannelConnectLinkHandler.INSTANCE.handle(conversationLinkTap);
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                conversationLinkOutcomeHandle = WearablesConversationLinkHandler.INSTANCE.handle(conversationLinkTap);
            }
            C7384Etj.A0U(conversationLinkOutcomeHandle);
            if (!conversationLinkOutcomeHandle.equals(ConversationLinkOutcome.NotHandled.INSTANCE)) {
                return conversationLinkOutcomeHandle;
            }
            i++;
        } while (i < 2);
        return ConversationLinkOutcome.NotHandled.INSTANCE;
    }
}
