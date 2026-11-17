package com.facebook.aura.conversation.widget.api;

import X.AHD;
import X.C20Q;

/* loaded from: classes.dex */
public interface ConversationTimelineSource {
    C20Q<AHD<ConversationTimelineContent>> observe(ConversationTimelineContext conversationTimelineContext);
}
