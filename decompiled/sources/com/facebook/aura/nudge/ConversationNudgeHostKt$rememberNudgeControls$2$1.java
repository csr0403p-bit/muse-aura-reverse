package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConversationNudgeHostKt$rememberNudgeControls$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $action;
    public final /* synthetic */ ConversationNudge $nudge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationNudgeHostKt$rememberNudgeControls$2$1(ConversationNudge conversationNudge, Function0<Unit> function0) {
        super(0);
        this.$nudge = conversationNudge;
        this.$action = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (ConversationNudgeCoordinator.INSTANCE.onActionTapped(this.$nudge)) {
            this.$action.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
