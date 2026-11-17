package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConversationNudgeHostKt$rememberNudgeControls$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConversationNudge $nudge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationNudgeHostKt$rememberNudgeControls$3$1(ConversationNudge conversationNudge) {
        super(0);
        this.$nudge = conversationNudge;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConversationNudgeCoordinator.INSTANCE.onDismissTapped(this.$nudge);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
