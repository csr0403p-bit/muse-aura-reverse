package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NudgeActionCardRendererKt$NudgeActionCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $action;
    public final /* synthetic */ ConversationCardControls $controls;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NudgeActionCardRendererKt$NudgeActionCard$1$1(ConversationCardControls conversationCardControls, Function0<Unit> function0) {
        super(0);
        this.$controls = conversationCardControls;
        this.$action = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controls.onAccept.invoke();
        this.$action.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
