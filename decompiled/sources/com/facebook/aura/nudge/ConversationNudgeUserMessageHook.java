package com.facebook.aura.nudge;

import com.facebook.aura.conversation.api.ConversationUserMessageHook;

/* loaded from: classes3.dex */
public final class ConversationNudgeUserMessageHook implements ConversationUserMessageHook {
    public static final int $stable = 0;
    public static final ConversationNudgeUserMessageHook INSTANCE = new ConversationNudgeUserMessageHook();

    @Override // com.facebook.aura.conversation.api.ConversationUserMessageHook
    public void onUserMessageSent() {
        ConversationNudgeCoordinator.INSTANCE.onUserMessageSent();
    }
}
