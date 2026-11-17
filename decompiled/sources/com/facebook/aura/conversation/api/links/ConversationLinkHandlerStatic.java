package com.facebook.aura.conversation.api.links;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.channels.connect.ChannelConnectLinkHandler;
import com.facebook.aura.partners.wearables.linking.WearablesConversationLinkHandler;

/* loaded from: classes3.dex */
public class ConversationLinkHandlerStatic {
    public static ConversationLinkOutcome handle(int i, ConversationLinkTap conversationLinkTap) {
        if (i == 0) {
            return ChannelConnectLinkHandler.INSTANCE.handle(conversationLinkTap);
        }
        if (i == 1) {
            return WearablesConversationLinkHandler.INSTANCE.handle(conversationLinkTap);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
