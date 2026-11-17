package com.facebook.aura.channels.connect;

import X.AnonymousClass007;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.conversation.api.links.ConversationLinkHandler;
import com.facebook.aura.conversation.api.links.ConversationLinkOutcome;
import com.facebook.aura.conversation.api.links.ConversationLinkTap;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ChannelConnectScreenKey;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;

/* loaded from: classes3.dex */
public final class ChannelConnectLinkHandler implements ConversationLinkHandler {
    public static final int $stable = 0;
    public static final ChannelConnectLinkHandler INSTANCE = new ChannelConnectLinkHandler();

    @Override // com.facebook.aura.conversation.api.links.ConversationLinkHandler
    public ConversationLinkOutcome handle(ConversationLinkTap conversationLinkTap) {
        ConversationLinkOutcome routed;
        C7384Etj.A0Y(conversationLinkTap, 0);
        HxE<String, String> hxETryParse = ChannelConnectRequest.INSTANCE.tryParse(conversationLinkTap.url);
        if (hxETryParse == null) {
            routed = ConversationLinkOutcome.NotHandled.INSTANCE;
        } else {
            String str = hxETryParse.first;
            String str2 = hxETryParse.second;
            HatchInteractionLogger.INSTANCE.logClick(HatchSkillOAuthOrigin.CHAT, HatchComponent.CHANNEL_CONNECT_LINK, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str));
            conversationLinkTap.navigator.navigate((AuraNavKey) new ChannelConnectScreenKey(str, str2, null), false);
            routed = new ConversationLinkOutcome.Routed(HatchHtmlRoute.CHANNEL_CONNECT);
        }
        return routed;
    }
}
