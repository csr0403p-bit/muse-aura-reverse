package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import com.facebook.aura.nudge.ConversationCardTimelineProvider;

/* loaded from: classes.dex */
public class ConversationTimelineProviderStatic {
    public static ConversationTimelineSource source(int i) {
        if (i == 0) {
            return ConversationCardTimelineProvider.INSTANCE.source();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
