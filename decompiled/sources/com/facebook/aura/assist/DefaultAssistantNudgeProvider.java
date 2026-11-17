package com.facebook.aura.assist;

import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.ConversationNudgeProvider;

/* loaded from: classes3.dex */
public final class DefaultAssistantNudgeProvider implements ConversationNudgeProvider {
    public static final int $stable = 0;
    public static final DefaultAssistantNudgeProvider INSTANCE = new DefaultAssistantNudgeProvider();

    @Override // com.facebook.aura.nudge.ConversationNudgeProvider
    public ConversationNudge nudge() {
        return DefaultAssistantNudge.INSTANCE;
    }
}
