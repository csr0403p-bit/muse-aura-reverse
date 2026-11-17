package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.api.PendingConversationCard;

/* loaded from: classes2.dex */
public final class ConversationCardTimelineKt$RequestedCardItem$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ PendingConversationCard $card;
    public final /* synthetic */ boolean $isVisible;
    public final /* synthetic */ String $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCardTimelineKt$RequestedCardItem$1$1(boolean z, PendingConversationCard pendingConversationCard, String str) {
        super(1);
        this.$isVisible = z;
        this.$card = pendingConversationCard;
        this.$surface = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isVisible && this.$card.markShown()) {
            ConversationNudgeLogging.INSTANCE.logCardShown(this.$card.request.getTypeId(), this.$surface);
        }
        return new C78g() { // from class: com.facebook.aura.nudge.ConversationCardTimelineKt$RequestedCardItem$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
