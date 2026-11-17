package com.facebook.aura.analytics.hatch;

import com.facebook.aura.conversation.api.ConversationUserMessageHook;

/* loaded from: classes3.dex */
public final class HatchClientCvmSendMessageHook implements ConversationUserMessageHook {
    public static final int $stable = 0;
    public static final HatchClientCvmSendMessageHook INSTANCE = new HatchClientCvmSendMessageHook();

    @Override // com.facebook.aura.conversation.api.ConversationUserMessageHook
    public void onUserMessageSent() {
        HatchClientCvmEventLogger.INSTANCE.logSendMessage();
    }
}
