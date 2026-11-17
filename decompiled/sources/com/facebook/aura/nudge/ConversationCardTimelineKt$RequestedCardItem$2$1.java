package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.api.PendingConversationCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConversationCardTimelineKt$RequestedCardItem$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PendingConversationCard $card;
    public final /* synthetic */ String $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCardTimelineKt$RequestedCardItem$2$1(PendingConversationCard pendingConversationCard, String str) {
        super(0);
        this.$card = pendingConversationCard;
        this.$surface = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$card.accept()) {
            ConversationNudgeLogging.INSTANCE.logCardActionTapped(this.$card.request.getTypeId(), this.$surface);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
