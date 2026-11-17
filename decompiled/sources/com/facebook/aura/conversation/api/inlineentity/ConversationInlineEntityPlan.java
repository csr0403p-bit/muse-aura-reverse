package com.facebook.aura.conversation.api.inlineentity;

import X.AnonymousClass003;
import X.BO6;

/* loaded from: classes4.dex */
public final class ConversationInlineEntityPlan {
    public static final int $stable = 0;
    public final BO6<Integer, String> markersBySegmentIndex;
    public final ConversationInlineEntityState state;

    public final int getEntityCount() {
        return this.markersBySegmentIndex.size();
    }

    public final BO6<Integer, String> getMarkersBySegmentIndex() {
        return this.markersBySegmentIndex;
    }

    public final ConversationInlineEntityState getState() {
        return this.state;
    }

    public ConversationInlineEntityPlan(BO6<Integer, String> bo6, ConversationInlineEntityState conversationInlineEntityState) {
        AnonymousClass003.A0u(bo6, conversationInlineEntityState);
        this.markersBySegmentIndex = bo6;
        this.state = conversationInlineEntityState;
    }
}
