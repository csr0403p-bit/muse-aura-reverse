package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.deeplink.HatchDeeplinkHolder;
import com.facebook.aura.deeplink.PendingDeeplinkMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$18$1$11$10$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PendingDeeplinkMessage $deeplinkMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$18$1$11$10$1(PendingDeeplinkMessage pendingDeeplinkMessage) {
        super(0);
        this.$deeplinkMessage = pendingDeeplinkMessage;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PendingDeeplinkMessage pendingDeeplinkMessage = this.$deeplinkMessage;
        if (pendingDeeplinkMessage != null) {
            HatchDeeplinkHolder.INSTANCE.consumePendingMessage(pendingDeeplinkMessage);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
