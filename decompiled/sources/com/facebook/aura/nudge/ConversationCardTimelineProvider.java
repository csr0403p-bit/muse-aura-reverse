package com.facebook.aura.nudge;

import com.facebook.aura.conversation.widget.api.ConversationTimelineProvider;
import com.facebook.aura.conversation.widget.api.ConversationTimelineSource;

/* loaded from: classes.dex */
public final class ConversationCardTimelineProvider implements ConversationTimelineProvider {
    public static final int $stable = 0;
    public static final ConversationCardTimelineProvider INSTANCE = new ConversationCardTimelineProvider();

    @Override // com.facebook.aura.conversation.widget.api.ConversationTimelineProvider
    public ConversationTimelineSource source() {
        return ConversationCardTimeline.INSTANCE;
    }
}
