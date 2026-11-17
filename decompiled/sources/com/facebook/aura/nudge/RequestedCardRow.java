package com.facebook.aura.nudge;

import X.C7384Etj;
import com.facebook.aura.conversation.api.PendingConversationCard;

/* loaded from: classes2.dex */
public final class RequestedCardRow {
    public final PendingConversationCard card;
    public final boolean isVisible;

    public RequestedCardRow(PendingConversationCard pendingConversationCard, boolean z) {
        C7384Etj.A0Y(pendingConversationCard, 0);
        this.card = pendingConversationCard;
        this.isVisible = z;
    }

    public final PendingConversationCard getCard() {
        return this.card;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
